package com.dailyquotes.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dailyquotes.app.ui.theme.*

@Composable
fun GradientHeartIcon(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(80.dp)
            .clip(CircleShape)
            .background(PurpleGradient),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(40.dp)
        )
    }
}

@Composable
fun GlassmorphicButton(
    icon: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    contentDescription: String? = null
) {
    Box(
        modifier = modifier
            .size(56.dp)
            .clip(CircleShape)
            .background(GlassWhite)
            .border(1.dp, GlassBorder, CircleShape)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            tint = Color.White,
            modifier = Modifier.size(28.dp)
        )
    }
}

@Composable
fun PremiumBanner(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(PurpleGradient)
                .padding(16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color(0x33FFFFFF)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Star, // Diamond placeholder
                        contentDescription = null,
                        tint = Color.White
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Unlock All",
                        color = Color.White,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Access all categories, quotes, themes and remove ads!",
                        color = Color(0xCCFFFFFF),
                        style = MaterialTheme.typography.labelSmall
                    )
                }
                Button(
                    onClick = { /* Unlock */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    shape = RoundedCornerShape(20.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    Text(text = "Unlock", color = MainPurple, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Composable
fun SettingsItem(
    icon: ImageVector,
    title: String,
    onClick: () -> Unit,
    showSwitch: Boolean = false,
    switchState: Boolean = false,
    onSwitchChange: (Boolean) -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { if (!showSwitch) onClick() }
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = TextDark,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            color = TextDark,
            modifier = Modifier.weight(1f)
        )
        if (showSwitch) {
            Switch(
                checked = switchState,
                onCheckedChange = onSwitchChange,
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color.White,
                    checkedTrackColor = MainPurple
                )
            )
        } else {
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                tint = TextSecondary
            )
        }
    }
}

@Composable
fun ThemeGridItem(
    title: String,
    imageUrl: String,
    isLocked: Boolean = true,
    isSelected: Boolean = false
) {
    Card(
        modifier = Modifier
            .aspectRatio(0.8f)
            .fillMaxWidth(),
        shape = RoundedCornerShape(16.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            // Background Image Placeholder (use Coil in real app)
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Gray) // Placeholder
            )
            
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Abcd",
                    color = Color.White,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
            }

            if (isLocked) {
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 8.dp)
                        .size(24.dp)
                        .clip(CircleShape)
                        .background(Color(0x66000000)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(14.dp)
                    )
                }
            }

            if (isSelected) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                        .size(20.dp)
                        .clip(CircleShape)
                        .background(MainPurple),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(14.dp)
                    )
                }
            }
        }
    }
}
