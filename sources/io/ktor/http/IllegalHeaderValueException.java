package io.ktor.http;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class IllegalHeaderValueException extends IllegalArgumentException {

    @k
    private final String headerValue;
    private final int position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalHeaderValueException(@k String headerValue, int i11) {
        super("Header value '" + headerValue + "' contains illegal character '" + headerValue.charAt(i11) + "' (code " + (headerValue.charAt(i11) & 255) + ')');
        g0.p(headerValue, "headerValue");
        this.headerValue = headerValue;
        this.position = i11;
    }

    @k
    public final String getHeaderValue() {
        return this.headerValue;
    }

    public final int getPosition() {
        return this.position;
    }
}
