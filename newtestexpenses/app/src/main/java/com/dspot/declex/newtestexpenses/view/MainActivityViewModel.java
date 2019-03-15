package com.dspot.declex.newtestexpenses.view;


import android.databinding.BaseObservable;
import android.util.Log;
import android.view.View;
import com.dspot.declex.newtestexpenses.R;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;

import androidx.navigation.Navigation;
import pl.com.dspot.archiannotations.annotation.EViewModel;

@EBean
public class MainActivityViewModel  extends BaseObservable {
 public Boolean next;

 public Boolean init(){
   return this.next;
 }

 public void onClickButton(View view) {
    Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_loginFragment2);
 }

}
