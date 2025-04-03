package com.app.socialsignin.google_interface

import androidx.compose.runtime.Composable

interface GoogleAuthProvider {
    @Composable
    fun getUiProvider(): GoogleAuthUiProvider

    suspend fun signOut()
}