package io.ktor.client.call;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import m80.k;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class UnsupportedContentTypeException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedContentTypeException(@k v content) {
        super("Failed to write body: " + o0.d(content.getClass()));
        g0.p(content, "content");
    }
}
