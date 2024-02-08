package com.example.skogbrynetsverkstad.data

import android.app.Notification.BigPictureStyle

data class Blog(
    var blogTitle: String = "",
    var blogShortDescription: String = "",
    var blogContentText: String = "",
    var blogSubtitle :String = "",
    var blogMainImagePath: String = "",
    var blogImageGridPaths: MutableList<String>?,
)
