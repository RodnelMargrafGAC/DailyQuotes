package com.dailyquotes.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dailyquotes.app.ui.components.*
import com.dailyquotes.app.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(onBack: () -> Unit) {
    var notificationsEnabled by remember { mutableStateOf(true) }
    var darkThemeEnabled by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundLight)
            .padding(horizontal = 24.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(48.dp))
        
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(onClick = onBack) {
                Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "Back")
            }
            Text(
                text = "Profile",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = TextDark
            )
        }

        Spacer(modifier = Modifier.height(24.dp))
        
        PremiumBanner()

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Settings",
            style = MaterialTheme.typography.labelMedium,
            color = TextSecondary,
            fontWeight = FontWeight.Bold
        )
        
        Spacer(modifier = Modifier.height(8.dp))

        SettingsItem(icon = Icons.Outlined.Person, title = "Edit Profile", onClick = { })
        SettingsItem(
            icon = Icons.Outlined.Notifications,
            title = "Notifications",
            showSwitch = true,
            switchState = notificationsEnabled,
            onSwitchChange = { notificationsEnabled = it },
            onClick = { }
        )
        SettingsItem(icon = Icons.Outlined.Widgets, title = "Widgets", onClick = { })
        SettingsItem(
            icon = Icons.Outlined.DarkMode,
            title = "Dark Theme",
            showSwitch = true,
            switchState = darkThemeEnabled,
            onSwitchChange = { darkThemeEnabled = it },
            onClick = { }
        )
        SettingsItem(icon = Icons.Outlined.Language, title = "Language", onClick = { })

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Your Affirmations",
            style = MaterialTheme.typography.labelMedium,
            color = TextSecondary,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        SettingsItem(icon = Icons.Outlined.BookmarkBorder, title = "Favorites Affirmations", onClick = { })
        SettingsItem(icon = Icons.Outlined.History, title = "Past Affirmations", onClick = { })
        SettingsItem(icon = Icons.Outlined.Search, title = "Search Affirmations", onClick = { })
        SettingsItem(icon = Icons.Outlined.Edit, title = "Your Affirmations", onClick = { })

        Spacer(modifier = Modifier.height(32.dp))
    }
}
