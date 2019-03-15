package com.dspot.declex.newtestexpenses.view;

import android.arch.core.executor.testing.InstantTaskExecutorRule;

import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)

public class MainActivityTest {
    @Rule
    public TestRule executeLiveDataInstantly = new InstantTaskExecutorRule();






}