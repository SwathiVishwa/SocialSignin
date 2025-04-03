package com.app.socialsignin.model

data class GoogleUser(
    val idToken: String,
    val displayName: String = "",
    val profilePicUrl: String? = null,
)
