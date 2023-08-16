package com.androidactivity.navigation_android_github

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.androidactivity.navigation_android_github.navigation.AppNavigation
import com.androidactivity.navigation_android_github.ui.theme.Navigation_android_githubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation_android_githubTheme {
                val navController = rememberNavController()

                AppNavigation(navHostController = navController)
            }
        }
    }
}