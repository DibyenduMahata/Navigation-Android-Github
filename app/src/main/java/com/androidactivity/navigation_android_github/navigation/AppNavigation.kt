package com.androidactivity.navigation_android_github.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.androidactivity.navigation_android_github.DetailScreen
import com.androidactivity.navigation_android_github.HomeScreen

@Composable
fun AppNavigation(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.HomeScreen.name
    ) {
        composable(route = Screen.HomeScreen.name) {
            HomeScreen(
                onClick = { personId ->
                    navHostController.navigate("${Screen.DetailScreen.name}/$personId")
                }
            )
        }
        composable(
            route = "${Screen.DetailScreen.name}/{personId}",
            arguments = listOf(navArgument("personId") {
                type = NavType.IntType
            })
        ) { navBackStackEntry ->
            navBackStackEntry.arguments?.getInt("personId").let {
                DetailScreen(personId = it!!)
            }
        }
    }
}