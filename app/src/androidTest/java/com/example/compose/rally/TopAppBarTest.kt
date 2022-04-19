package com.example.compose.rally

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.printToLog
import com.example.compose.rally.ui.components.RallyTopAppBar
import com.example.compose.rally.ui.theme.RallyTheme
import org.junit.Rule
import org.junit.Test

/**
 * Created by rodrigomiranda on 19/4/22.
 */
class TopAppBarTest {

    @get:Rule
    val composeTestRule = createComposeRule() // To test components in isolation
    // val composeTestRule = createAndroidComposeRule(RallyActivity::class.java)

    @Test
    fun rallyTopAppBarTest() {
        // composeTestRule{.finder}{.assertion}{.action}

        val allScreens = RallyScreen.values().toList()
        composeTestRule.setContent {
            RallyTheme { // Use dark default theme
                RallyTopAppBar(
                    allScreens = allScreens,
                    onTabSelected = {},
                    currentScreen = RallyScreen.Accounts
                )
            }
        }

        // short Logcat output
        composeTestRule.onRoot().printToLog("currentLabelExists")

        // .onNodeWithText(RallyScreen.Accounts.name.uppercase()) Fails!!!
        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Accounts.name)
            .assertExists()
    }
}
