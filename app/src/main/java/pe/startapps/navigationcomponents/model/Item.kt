package pe.startapps.navigationcomponents.model

import androidx.annotation.DrawableRes


data class Item(
        val title: String,
        val subtitle: String,
        @DrawableRes val image: Int
)