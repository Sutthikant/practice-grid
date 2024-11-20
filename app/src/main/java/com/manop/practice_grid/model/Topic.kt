package com.manop.practice_grid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResouceId: Int,
    val num: Int,
    @DrawableRes val imageResouceId: Int,
)
