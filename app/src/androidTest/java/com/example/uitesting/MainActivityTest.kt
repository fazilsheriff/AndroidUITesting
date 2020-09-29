package com.example.uitesting

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest
{
    @Test
    fun test_activityInview() {
        val activityScenario=ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    @Test
    fun test_Visiblity_textTitle() {
        val activityScenario=ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(matches(isDisplayed()))
    }

    @Test
    fun test_Visiblity_btnVisisble() {
        val activityScenario=ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.btnNextActivity)).check(matches(isDisplayed()))
    }

    @Test
    fun test_isTestViewTitleString_Dispalyed() {
        val activityScenario=ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(matches(withText(R.string.text_mainactivity)))
    }
}