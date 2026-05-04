package io.ktor.http;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class InvalidCookieDateException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidCookieDateException(@k String data, @k String reason) {
        super("Failed to parse date string: \"" + data + "\". Reason: \"" + reason + '\"');
        g0.p(data, "data");
        g0.p(reason, "reason");
    }
}
