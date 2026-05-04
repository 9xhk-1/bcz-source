package io.ktor.server.config;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ApplicationConfigurationException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationConfigurationException(@k String message, @l Throwable th2) {
        super(message, th2);
        g0.p(message, "message");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApplicationConfigurationException(@k String message) {
        this(message, null);
        g0.p(message, "message");
    }
}
