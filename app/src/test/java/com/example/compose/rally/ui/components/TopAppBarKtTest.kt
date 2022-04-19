package com.example.compose.rally.ui.components

import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import com.example.compose.rally.RallyApp
import com.example.compose.rally.RallyScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * Created by rodrigomiranda on 19/4/22.
 */
@RunWith(RobolectricTestRunner::class)
@Config(instrumentedPackages = ["androidx.loader.content"])
class TopAppBarKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun rallyTopAppBarClickTest() {
        composeTestRule.setContent {
            RallyApp()
        }

        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Bills.name)
            .performClick()
            .assertIsSelected()

        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Accounts.name)
            .performClick()
            .assertIsSelected()
    }
}