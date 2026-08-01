package ir.yaghotcod.test2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.rememberNavController
import ir.yaghotcod.test2.ui.theme.Test2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test2Theme {

                val navController = rememberNavController()

                Scaffold(
                    bottomBar = {
                        BottomNavigation(navController)
                    }
                ) { paddingValues ->

                    SetupBottomNavigation(navController, paddingValues)

                }

            }
        }
    }
}