package com.dspot.declex.newtestexpenses.view;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.dspot.declex.newtestexpenses.R;
import com.dspot.declex.newtestexpenses.view.authentication.splash.SplashFragment;
import com.dspot.declex.newtestexpenses.databinding.ActivityMainBinding;
import com.dspot.declex.newtestexpenses.view.authentication.login.LoginFragment;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.BindingObject;
import org.androidannotations.annotations.DataBound;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.FragmentById;

import pl.com.dspot.archiannotations.annotation.ViewModel;

import static androidx.navigation.fragment.NavHostFragment.findNavController;

@DataBound
@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements SplashFragment.OnFragmentInteractionListener, LoginFragment.OnFragmentInteractionListener {

    @BindingObject
    ActivityMainBinding binding;

    @Bean
    MainActivityViewModel mainActivityViewModel;

    @FragmentById(R.id.nav_host_fragment)
    Fragment navigationHost;

    @ViewModel
    TestViemodel testViemodel;

    @AfterViews
    void bindData() {
        binding.setMainActivityViewModel(mainActivityViewModel);
        Boolean next=mainActivityViewModel.init();
        if (next) {findNavController(navigationHost).navigate(R.id.action_testFragment_to_loginFragment2);}
        else {}
        testViemodel.init();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
