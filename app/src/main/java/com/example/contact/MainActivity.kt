package com.example.contact

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mynotes.screens.ContactScreen
import com.example.contact.routing.PhoneNumberRouter
import com.example.contact.routing.Screen
import com.example.contact.screens.RecentScreen
import com.example.contact.screens.SaveContactScreen
import com.example.contact.screens.TrashScreen
import com.example.contact.ui.theme.PhoneBookTheme
import com.example.contact.ui.theme.PhoneBookThemeSettings
import com.example.contact.viewmodel.MainViewModel
import com.example.contact.viewmodel.MainViewModelFactory

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhoneBookTheme(darkTheme = PhoneBookThemeSettings.isDarkThemeEnabled) {
                val viewModel: MainViewModel = viewModel(
                    factory = MainViewModelFactory(LocalContext.current.applicationContext as Application)
                )
                MainActivityScreen(viewModel)
            }
        }
    }
}


@ExperimentalMaterialApi
@Composable
fun MainActivityScreen(viewModel: MainViewModel) {
    Surface {
        when (PhoneNumberRouter.currentScreen) {
            is Screen.Contacts -> ContactScreen(viewModel)
            is Screen.SaveContact -> SaveContactScreen(viewModel)
            is Screen.Trash -> TrashScreen(viewModel)
            is Screen.Recent -> RecentScreen(viewModel)
        }
    }
}

