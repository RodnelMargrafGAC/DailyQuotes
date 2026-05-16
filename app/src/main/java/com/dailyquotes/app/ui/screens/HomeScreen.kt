package com.dailyquotes.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dailyquotes.app.ui.components.*
import com.dailyquotes.app.ui.theme.*

@Composable
fun HomeScreen(
    onNavigateToProfile: () -> Unit,
    onNavigateToThemes: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color(0xFF8E9EAB), Color(0xFFEEF2F3)) // Scenic placeholder gradient
                )
            )
    ) {
        // Top Icons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 48.dp, start = 24.dp, end = 24.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Outlined.FavoriteBorder, contentDescription = null, tint = Color.White)
            Spacer(modifier = Modifier.width(20.dp))
            Icon(imageVector = Icons.Outlined.Share, contentDescription = null, tint = Color.White)
            Spacer(modifier = Modifier.width(20.dp))
            Icon(imageVector = Icons.Outlined.Star, contentDescription = null, tint = Color.White) // Diamond
        }

        // Center Content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            GradientHeartIcon()
            Spacer(modifier = Modifier.height(60.dp))
            Text(
                text = "I am allowed to ask for what I want and what I need",
                style = MaterialTheme.typography.displayLarge,
                color = Color.White,
                textAlign = TextAlign.Center,
                lineHeight = 44.sp
            )
        }

        // Bottom Actions
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 48.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                GlassmorphicButton(icon = Icons.Default.Close, onClick = { })
                GlassmorphicButton(icon = Icons.Default.FavoriteBorder, onClick = { })
                
                // Central Quote Button (larger)
                FloatingActionButton(
                    onClick = { /* New Quote */ },
                    containerColor = Color.White,
                    contentColor = MainPurple,
                    shape = CircleShape,
                    modifier = Modifier.size(72.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.FormatQuote,
                        contentDescription = null,
                        modifier = Modifier.size(36.dp)
                    )
                }

                GlassmorphicButton(icon = Icons.Outlined.BookmarkBorder, onClick = { })
                GlassmorphicButton(icon = Icons.Outlined.Person, onClick = onNavigateToProfile)
            }
            
            Spacer(modifier = Modifier.height(24.dp))
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                IconButton(onClick = onNavigateToThemes) {
                    Icon(imageVector = Icons.Default.Layers, contentDescription = null, tint = Color.White)
                }
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.Palette, contentDescription = null, tint = Color.White)
                }
                Spacer(modifier = Modifier.width(72.dp)) // Space for FAB
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.Bookmarks, contentDescription = null, tint = Color.White)
                }
                IconButton(onClick = onNavigateToProfile) {
                    Icon(imageVector = Icons.Default.Person, contentDescription = null, tint = Color.White)
                }
            }
        }
    }
}
