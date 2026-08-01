package ir.yaghotcod.test2

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigation(navController: NavController) {

    val currentRout = navController.currentBackStackEntryAsState()

    NavigationBar {

        BottomNavItem.btmNavItem.forEach { screen ->

            NavigationBarItem(
                selected = currentRout.value?.destination?.route == screen.route,
                onClick = {
                    navController.navigate(screen.route){
                        popUpTo(navController.graph.startDestinationId){saveState = true}
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = { Icon(screen.icon,screen.title) },
                label = { Text(screen.title) }
            )

        }

    }

}

@Composable
fun SetupBottomNavigation(navHostController: NavHostController,paddingValues: PaddingValues){

    NavHost(
        navController = navHostController,
        startDestination = BottomNavItem.Home.route,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(BottomNavItem.Home.route) { HomePage(navHostController) }
        composable(BottomNavItem.Cart.route) { CartPage(true) }
        composable(BottomNavItem.Login.route) { LoginScreen() }
        composable(Navigatae.Digi.route) { SetUI() }
    }

}