package io.ktor.http;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class UnsafeHeaderException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsafeHeaderException(@k String header) {
        super("Header(s) " + header + " are controlled by the engine and cannot be set explicitly");
        g0.p(header, "header");
    }
}
