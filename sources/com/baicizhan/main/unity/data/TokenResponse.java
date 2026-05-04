package com.baicizhan.main.unity.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes4.dex */
public final class TokenResponse {
    public static final int $stable = 0;

    @k
    private final String token;

    public TokenResponse(@k String token) {
        g0.p(token, "token");
        this.token = token;
    }

    public static /* synthetic */ TokenResponse copy$default(TokenResponse tokenResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tokenResponse.token;
        }
        return tokenResponse.copy(str);
    }

    @k
    public final String component1() {
        return this.token;
    }

    @k
    public final TokenResponse copy(@k String token) {
        g0.p(token, "token");
        return new TokenResponse(token);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TokenResponse) && g0.g(this.token, ((TokenResponse) obj).token);
    }

    @k
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    @k
    public String toString() {
        return "TokenResponse(token=" + this.token + j.f81007d;
    }
}
