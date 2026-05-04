package io.ktor.client.plugins;

import ex.c;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class ResponseException extends IllegalStateException {

    @k
    private final transient c response;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseException(@k c response, @k String cachedResponseText) {
        super("Bad response: " + response + ". Text: \"" + cachedResponseText + '\"');
        g0.p(response, "response");
        g0.p(cachedResponseText, "cachedResponseText");
        this.response = response;
    }

    @k
    public final c getResponse() {
        return this.response;
    }
}
