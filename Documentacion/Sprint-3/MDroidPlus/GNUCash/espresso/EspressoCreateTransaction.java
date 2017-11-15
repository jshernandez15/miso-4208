package org.gnucash.android.ui.account;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.gnucash.android.R;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class EspressoCreateTransaction {

    @Rule
    public ActivityTestRule<AccountsActivity> mActivityTestRule = new ActivityTestRule<>(AccountsActivity.class);

    @Test
    public void espressoCreateTransaction() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn_save), withText("Next"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction viewPager = onView(
                allOf(withId(R.id.pager), isDisplayed()));
        viewPager.perform(swipeLeft());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.btn_save), withText("Next"), isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction viewPager2 = onView(
                allOf(withId(R.id.pager), isDisplayed()));
        viewPager2.perform(swipeLeft());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.btn_save), withText("Next"), isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction viewPager3 = onView(
                allOf(withId(R.id.pager), isDisplayed()));
        viewPager3.perform(swipeLeft());

        ViewInteraction appCompatCheckedTextView = onView(
                allOf(withId(android.R.id.text1), withText("Disable crash reports"),
                        childAtPosition(
                                withId(android.R.id.list),
                                1),
                        isDisplayed()));
        appCompatCheckedTextView.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.btn_save), withText("Next"), isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction viewPager4 = onView(
                allOf(withId(R.id.pager), isDisplayed()));
        viewPager4.perform(swipeLeft());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.btn_save), withText("Done"), isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(android.R.id.button1), withText("Dismiss"),
                        withParent(allOf(withClassName(is("android.widget.LinearLayout")),
                                withParent(withClassName(is("android.widget.LinearLayout"))))),
                        isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction cardView = onView(
                allOf(withClassName(is("android.support.v7.widget.CardView")),
                        withParent(allOf(withId(R.id.account_recycler_view),
                                withParent(withId(R.id.fragment_account_list)))),
                        isDisplayed()));
        cardView.perform(click());

        ViewInteraction cardView2 = onView(
                allOf(withClassName(is("android.support.v7.widget.CardView")),
                        withParent(allOf(withId(R.id.account_recycler_view),
                                withParent(withId(R.id.fragment_account_list)))),
                        isDisplayed()));
        cardView2.perform(click());

        ViewInteraction cardView3 = onView(
                allOf(withClassName(is("android.support.v7.widget.CardView")),
                        withParent(allOf(withId(R.id.account_recycler_view),
                                withParent(withId(R.id.fragment_account_list)))),
                        isDisplayed()));
        cardView3.perform(click());

        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.fab_create_transaction),
                        withParent(allOf(withId(R.id.coordinatorLayout),
                                withParent(withId(R.id.drawer_layout)))),
                        isDisplayed()));
        floatingActionButton.perform(click());

        ViewInteraction appCompatAutoCompleteTextView = onView(
                withId(R.id.input_transaction_name));
        appCompatAutoCompleteTextView.perform(scrollTo(), replaceText("Transaction"), closeSoftKeyboard());

        ViewInteraction calculatorEditText = onView(
                withId(R.id.input_transaction_amount));
        calculatorEditText.perform(scrollTo(), click());

        ViewInteraction calculatorEditText2 = onView(
                withId(R.id.input_transaction_amount));
        calculatorEditText2.perform(scrollTo(), replaceText("1234"), closeSoftKeyboard());

        ViewInteraction appCompatEditText = onView(
                withId(R.id.input_description));
        appCompatEditText.perform(scrollTo(), replaceText("Note"), closeSoftKeyboard());

        ViewInteraction actionMenuItemView = onView(
                allOf(withId(R.id.menu_save), withText("Save"), withContentDescription("Save"), isDisplayed()));
        actionMenuItemView.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(R.id.primary_text), withText("Transaction"),
                        childAtPosition(
                                allOf(withId(R.id.list_item_2_lines),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                                0)),
                                0),
                        isDisplayed()));
        textView.check(matches(withText("Transaction")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.transaction_amount), withText("$1,234.00"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class),
                                        0),
                                3),
                        isDisplayed()));
        textView2.check(matches(withText("$1,234.00")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.transaction_date), withText("Today"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class),
                                        0),
                                2),
                        isDisplayed()));
        textView3.check(matches(withText("Today")));

        ViewInteraction cardView4 = onView(
                allOf(withClassName(is("android.support.v7.widget.CardView")),
                        withParent(allOf(withId(R.id.transaction_recycler_view),
                                withParent(withId(R.id.fragment_transaction_list)))),
                        isDisplayed()));
        cardView4.perform(click());

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.trn_notes), withText("Note"),
                        childAtPosition(
                                allOf(withId(R.id.row_trn_notes),
                                        childAtPosition(
                                                withId(R.id.fragment_transaction_details),
                                                4)),
                                1),
                        isDisplayed()));
        textView4.check(matches(withText("Note")));

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}