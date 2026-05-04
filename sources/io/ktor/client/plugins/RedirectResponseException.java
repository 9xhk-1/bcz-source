package io.ktor.client.plugins;

import ex.c;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class RedirectResponseException extends ResponseException {

    @k
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectResponseException(@k c response, @k String cachedResponseText) {
        super(response, cachedResponseText);
        g0.p(response, "response");
        g0.p(cachedResponseText, "cachedResponseText");
        this.message = "Unhandled redirect: " + response.c().h().getMethod().l() + ' ' + response.c().h().getUrl() + ". Status: " + response.i() + ". Text: \"" + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    @k
    public String getMessage() {
        return this.message;
    }
}
