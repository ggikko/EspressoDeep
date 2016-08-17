package ggikko.me.ggikkoespressotesting;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by ggikko on 16. 8. 17..
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void greet() {
        onView(withId(R.id.txt_greeting))
                .check(matches(withText("")));

        onView(withId(R.id.btn_greet))
                .check(matches(withText("Hello")))
                .perform(click());

        onView(withId(R.id.txt_greeting))
                .check(matches(withText("Hello ggikko")));
    }
}
