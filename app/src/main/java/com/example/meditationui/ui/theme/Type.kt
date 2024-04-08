package com.example.meditationui.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.meditationui.R

val gothicA1 = FontFamily(
    listOf(
        Font(R.font.gothic_regular, FontWeight.Normal),
        Font(R.font.gothic_medium, FontWeight.Medium),
        Font(R.font.gothic_semibold, FontWeight.SemiBold),
        Font(R.font.gothic_bold, FontWeight.Bold),
        Font(R.font.gothic_black, FontWeight.Black)
    )
)


// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        color = AquaBlue,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    displayMedium = TextStyle(
        color = TextWhite,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    labelSmall = TextStyle(
        color = TextWhite,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
)