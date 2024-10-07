package com.example.woof.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.example.woof.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

// Set of Material typography styles to start with
val AprilFatFace = FontFamily(
    Font(GoogleFont("Abril Fatface"), fontProvider = provider)
)

val Montserrat = FontFamily(
    Font(googleFont = GoogleFont("Montserrat"), fontProvider = provider)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = AprilFatFace, fontWeight = FontWeight.Normal, fontSize = 36.sp
    ), displayMedium = TextStyle(
        fontFamily = Montserrat, fontWeight = FontWeight.Bold, fontSize = 20.sp
    ), labelSmall = TextStyle(
        fontFamily = Montserrat, fontWeight = FontWeight.Bold, fontSize = 14.sp
    ), bodyLarge = TextStyle(
        fontFamily = Montserrat, fontWeight = FontWeight.Normal, fontSize = 14.sp
    )
)