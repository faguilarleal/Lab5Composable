package com.androidfrancis.lab5.navegation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController



@Composable
fun Navigation(modifier: Modifier = Modifier){

}
//
//@Composable
//fun Navigation(modifier: Modifier = Modifier) {
//    val navController = rememberNavController()
//    NavHost(navController = navController,
//        startDestination = NavigationState.Home.route,
//        modifier = modifier) {
//        composable(route = NavigationState.Home.route) {
//            ConcertsView(navController = navController)
//        }
//        composable(route = NavigationState.Detail.route) {
//            VenuesView(navController = navController)
//        }
//        composable(route = NavigationState.Events.route) {
//            DetailView(navController = navController)
//        }
//        composable(route = NavigationState.Profile.route) {
//            ProfileView(navController = navController)
//        }
//        composable(route = NavigationState.Profile.route) {
//            FavoritesView(navController = navController)
//        }
//    }
//}