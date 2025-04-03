package com.app.socialsignin.google_interface

import com.app.socialsignin.model.GoogleUser

interface GoogleAuthUiProvider {

    /**
     * Opens Sign In with Google UI,
     * @return returns GoogleUser
     */
    suspend fun signIn(): GoogleUser?
}