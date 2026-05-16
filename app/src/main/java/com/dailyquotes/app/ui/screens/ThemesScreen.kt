package com.dailyquotes.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dailyquotes.app.ui.components.ThemeGridItem
import com.dailyquotes.app.ui.theme.BackgroundLight
import com.dailyquotes.app.ui.theme.MainPurple
import com.dailyquotes.app.ui.theme.TextDark

@Composable
fun ThemesScreen(onBack: () -> Unit) {
    val themes = listOf(
        "Theme 1", "Theme 2", "Theme 3",
        "Theme 4", "Theme 5", "Theme 6",
        "Theme 7", "Theme 8", "Theme 9",
        "Theme 10", "Theme 11", "Theme 12"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundLight)
            .padding(horizontal = 24.dp)
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
                text = "Themes",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                color = TextDark,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "Unlock All",
                style = MaterialTheme.typography.labelLarge,
                color = TextDark,
                fontWeight = FontWeight.SemiBold
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Travel",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = TextDark
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            contentPadding = PaddingValues(bottom = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(themes) { theme ->
                ThemeGridItem(
                    title = theme,
                    imageUrl = "", // Placeholder
                    isLocked = theme != "Theme 1",
                    isSelected = theme == "Theme 1"
                )
            }
        }
    }
}
