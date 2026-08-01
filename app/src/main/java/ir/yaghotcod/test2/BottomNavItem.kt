package ir.yaghotcod.test2

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route: String, val title: String, val icon: ImageVector){
    object Home: BottomNavItem("Home","Home", Icons.Default.Home)
    object Cart: BottomNavItem("Cart","Cart", Icons.Default.ShoppingCart)
    object Login: BottomNavItem("Login","Login", Icons.Default.Person)
    companion object{
        val btmNavItem = listOf(Home,Cart,Login)
    }
}

sealed class Navigatae(val route: String){
    object Digi : Navigatae("Digi")
}