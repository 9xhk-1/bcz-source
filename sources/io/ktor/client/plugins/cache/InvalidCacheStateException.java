package io.ktor.client.plugins.cache;

import ix.t2;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class InvalidCacheStateException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidCacheStateException(@k t2 requestUrl) {
        super("The entry for url: " + requestUrl + " was removed from cache");
        g0.p(requestUrl, "requestUrl");
    }
}
