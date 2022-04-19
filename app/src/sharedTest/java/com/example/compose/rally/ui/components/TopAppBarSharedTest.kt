package com.example.compose.rally.ui.components

import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import com.example.compose.rally.RallyApp
import com.example.compose.rally.RallyScreen

/**
 * Created by rodrigomiranda on 19/4/22.
 */
class TopAppBarSharedTest {

    companion object {

        fun clickTest(composeTestRule: ComposeContentTestRule) {
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

            composeTestRule
                .onNodeWithContentDescription(RallyScreen.Overview.name)
                .performClick()
                .assertIsSelected()
        }
    }
}