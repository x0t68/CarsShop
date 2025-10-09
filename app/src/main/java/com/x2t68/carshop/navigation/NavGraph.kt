package com.x2t68.carshop.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.x2t68.carshop.Domain.CarModel
import com.x2t68.carshop.ui.feature.detail.DetailScreen
import com.x2t68.carshop.ui.feature.home.MainScreen
import com.x2t68.carshop.ui.feature.profile.ProfileScreen
import com.x2t68.carshop.viewModel.CarViewModel
import com.x2t68.carshop.viewModel.CategoryViewModel

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()
    val categoryViewModel: CategoryViewModel = viewModel()
    val carViewModel: CarViewModel = viewModel()
    NavHost(navController = navController, startDestination = Screens.MAIN) {
        composable(Screens.MAIN) {
            MainScreen(
                onProfileClick = { navController.navigate(Screens.PROFILE) },
                onCarClick = {car->
                    navController.currentBackStackEntry?.savedStateHandle?.set("car",car)
                    navController.navigate(Screens.DETAIL) },
                carViewModel = carViewModel,
                categoryViewModel = categoryViewModel
            )
        }
        composable(Screens.PROFILE) {
            ProfileScreen(onBack = { navController.popBackStack() })
        }
        // Define the route for the detail screen, including the carId argument
        composable(Screens.DETAIL) {
            val car=navController.previousBackStackEntry?.savedStateHandle?.get<CarModel>("car")
            if (car != null) {
                DetailScreen(car= car, onBack = { navController.popBackStack() })
            }
            }
        }
    }


object Screens {
    const val MAIN = "main"
    const val PROFILE = "profile"
    const val DETAIL = "detail" // This is the base route name
}
