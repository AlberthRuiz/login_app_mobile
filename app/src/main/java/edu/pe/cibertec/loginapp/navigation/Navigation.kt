package edu.pe.cibertec.loginapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.pe.cibertec.loginapp.screen.LoginScreen
import edu.pe.cibertec.loginapp.screen.MainScreen

@Composable
fun Navigation(modifier: Modifier, navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = "login"){
        composable("login") {
            LoginScreen(modifier, navHostController)
        }
        composable("principal") {
            MainScreen(modifier)
        }
    }

}