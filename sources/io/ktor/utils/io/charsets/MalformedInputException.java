package io.ktor.utils.io.charsets;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class MalformedInputException extends java.nio.charset.MalformedInputException {

    @k
    private final String _message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MalformedInputException(@k String message) {
        super(0);
        g0.p(message, "message");
        this._message = message;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    @l
    public String getMessage() {
        return this._message;
    }
}
