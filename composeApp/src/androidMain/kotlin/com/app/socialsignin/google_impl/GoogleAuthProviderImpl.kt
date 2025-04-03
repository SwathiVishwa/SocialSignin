package com.app.socialsignin.google_impl

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.credentials.ClearCredentialStateRequest
import androidx.credentials.CredentialManager
import com.app.socialsignin.google_interface.GoogleAuthProvider
import com.app.socialsignin.google_interface.GoogleAuthUiProvider
import com.app.socialsignin.model.GoogleAuthCredentials

internal class GoogleAuthProviderImpl(
    private val credentials: GoogleAuthCredentials,
    private val credentialManager: CredentialManager,
) : GoogleAuthProvider {

    @Composable
    override fun getUiProvider(): GoogleAuthUiProvider {
        val activityContext = LocalContext.current
        return GoogleAuthUiProviderImpl(
            activityContext = activityContext,
            credentialManager = credentialManager,
            credentials = credentials
        )
    }

    override suspend fun signOut() {
        credentialManager.clearCredentialState(ClearCredentialStateRequest())
    }
}