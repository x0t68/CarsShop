package com.x2t68.carshop.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.x2t68.carshop.ui.feature.details.DetailScreen
import com.x2t68.carshop.ui.feature.home.MainScreen
import com.x2t68.carshop.viewModel.CarViewModel
import com.x2t68.carshop.viewModel.CategoryViewModel

@Composable
fun AppNavGraph(){
    val navController= rememberNavController()
    // ViewModels are scoped to the NavHost, so they can be shared
    val categoryViewModel: CategoryViewModel = viewModel()
    val carViewModel: CarViewModel = viewModel()
    NavHost(navController = navController, startDestination = Screens.MAIN) {
        composable(Screens.MAIN) {
            MainScreen(
                onProfileClick = { navController.navigate(Screens.PROFILE) },
                onCarClick = { carId ->
                    // Pass the carId to the detail screen route
                    navController.navigate("${Screens.DETAIL}/$carId")
                },
                carViewModel = carViewModel, // Explicitly naming the parameter
                categoryViewModel = categoryViewModel // Pass the missing ViewModel
            )
        }
        composable(Screens.PROFILE) {
            //  ProfileScreen(
            //    onBackClick = { navController.navigateUp() }
            // )
        }
        // Define the route for the detail screen, including the carId argument
        composable("${Screens.DETAIL}/{carId}") { backStackEntry ->
            val carId = backStackEntry.arguments?.getString("carId")

        }
    }
}

object Screens {
    const val MAIN = "main"
    const val PROFILE = "profile"
    const val DETAIL = "detail" // This is the base route name
}
