package com.creativeminds.pokoshop

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import org.hamcrest.Matchers.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @Rule @JvmField
    val mainActivity = ActivityTestRule(MainActivity::class.java)

    @Test
    fun hasViews(){
//        onView(withId(slider))
    }

    @Test
    fun selectFlashDeal(){
//        onView(withId(R.id.flashDeals)).perform(actionOnItemAtPosition(0),click())
    }
}