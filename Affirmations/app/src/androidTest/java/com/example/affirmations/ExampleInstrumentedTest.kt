package com.example.affirmations

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testRecyclerView() {
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(9)
        )
        onView(withText(R.string.affirmation10)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun testRecyclerViewScrollByText() {
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollTo<RecyclerView.ViewHolder>(
                    withText(R.string.affirmation10)
                )
        )

        onView(withText(R.string.affirmation10)).check(ViewAssertions.matches(isDisplayed())
            )
    }
}