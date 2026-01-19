package com.example.MD_store.auth;

import org.jspecify.annotations.Nullable;

public interface AuthenticationService {

    @Nullable AuthenticationResponse register(RegisterRequest request);

    @Nullable AuthenticationResponse authenticate(AuthenticationRequest request);
}
