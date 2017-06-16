package com.google.test.calculate;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);


    @Test
    public void checksum(){
        String INT_NUM1="2";
        String INT_NUM2="2";
        String INT_NUM_RESULT="4.0";
        onView(withId(R.id.etfirst)).perform(typeText(INT_NUM1),closeSoftKeyboard());
        onView(withId(R.id.etsecond)).perform(typeText(INT_NUM2),closeSoftKeyboard());

        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.txtshow)).check(matches(withText(INT_NUM_RESULT)));

        onView(withId(R.id.etfirst)).perform(clearText());
        onView(withId(R.id.etsecond)).perform(clearText());



        String INT_NUM3="2";
        String INT_NUM4="2";
        String INT_NUM_RESULT1="0";
        onView(withId(R.id.etfirst)).perform(typeText(INT_NUM3),closeSoftKeyboard());
        onView(withId(R.id.etsecond)).perform(typeText(INT_NUM4),closeSoftKeyboard());

        onView(withId(R.id.btnSub)).perform(click());
        onView(withId(R.id.txtshow)).check(matches(withText(INT_NUM_RESULT1)));

        onView(withId(R.id.etfirst)).perform(clearText());
        onView(withId(R.id.etsecond)).perform(clearText());


        String INT_NUM5="3";
        String INT_NUM6="3";
        String INT_NUM_RESULT2="9";
        onView(withId(R.id.etfirst)).perform(typeText(INT_NUM5),closeSoftKeyboard());
        onView(withId(R.id.etsecond)).perform(typeText(INT_NUM6),closeSoftKeyboard());
        onView(withId(R.id.btnMulti)).perform(click());
        onView(withId(R.id.txtshow)).check(matches(withText(INT_NUM_RESULT2)));

        onView(withId(R.id.etfirst)).perform(clearText());
        onView(withId(R.id.etsecond)).perform(clearText());


        String INT_NUM7="9";
        String INT_NUM8="3";
        String INT_NUM_RESULT3="3.0";
        onView(withId(R.id.etfirst)).perform(typeText(INT_NUM7),closeSoftKeyboard());
        onView(withId(R.id.etsecond)).perform(typeText(INT_NUM8),closeSoftKeyboard());
        onView(withId(R.id.btnDevi)).perform(click());
        onView(withId(R.id.txtshow)).check(matches(withText(INT_NUM_RESULT3)));

        onView(withId(R.id.etfirst)).perform(clearText());
        onView(withId(R.id.etsecond)).perform(clearText());




    }


//    @Test
//    public void checksub(){
//        String INT_NUM1="4";
//        String INT_NUM2="2";
//        String INT_NUM_RESULT="2";
//        onView(withId(R.id.etfirst)).perform(typeText(INT_NUM1),closeSoftKeyboard());
//        onView(withId(R.id.etsecond)).perform(typeText(INT_NUM2),closeSoftKeyboard());
//        onView(withId(R.id.btnSub)).perform(click());
//        onView(withId(R.id.txtshow)).check(matches(withText(INT_NUM_RESULT)));

 //   }

//    @Test
//    public void checkmulti(){
//        String INT_NUM1="3";
//        String INT_NUM2="3";
//        String INT_NUM_RESULT="9";
//        onView(withId(R.id.etfirst)).perform(typeText(INT_NUM1),closeSoftKeyboard());
//        onView(withId(R.id.etsecond)).perform(typeText(INT_NUM2),closeSoftKeyboard());
//        onView(withId(R.id.btnMulti)).perform(click());
//        onView(withId(R.id.txtshow)).check(matches(withText(INT_NUM_RESULT)));
//
//    }

//    @Test
//    public void checkdivi(){
//        String INT_NUM1="9";
//        String INT_NUM2="3";
//        String INT_NUM_RESULT="3.0";
//        onView(withId(R.id.etfirst)).perform(typeText(INT_NUM1),closeSoftKeyboard());
//        onView(withId(R.id.etsecond)).perform(typeText(INT_NUM2),closeSoftKeyboard());
//        onView(withId(R.id.btnDevi)).perform(click());
//        onView(withId(R.id.txtshow)).check(matches(withText(INT_NUM_RESULT)));
//
//    }



//
//    @Test
//    public void useAppContext() throws Exception {
//        // Context of the app under test.
//        Context appContext = InstrumentationRegistry.getTargetContext();
//
//        assertEquals("com.google.test.calculate", appContext.getPackageName());
//    }

}
