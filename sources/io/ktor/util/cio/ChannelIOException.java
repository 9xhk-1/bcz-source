package io.ktor.util.cio;

import java.io.IOException;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class ChannelIOException extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelIOException(@k String message, @k Throwable exception) {
        super(message, exception);
        g0.p(message, "message");
        g0.p(exception, "exception");
    }
}
