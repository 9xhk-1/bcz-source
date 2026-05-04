package io.ktor.server.application;

import c40.g0;
import io.ktor.util.internal.c;
import m80.k;
import xy.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class MissingApplicationPluginException extends IllegalStateException implements g0<MissingApplicationPluginException> {

    @k
    private final a<?> key;

    public MissingApplicationPluginException(@k a<?> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        this.key = key;
    }

    @k
    public final a<?> getKey() {
        return this.key;
    }

    @Override // java.lang.Throwable
    @k
    public String getMessage() {
        return "Application plugin " + this.key.e() + " is not installed";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c40.g0
    @k
    public MissingApplicationPluginException createCopy() {
        MissingApplicationPluginException missingApplicationPluginException = new MissingApplicationPluginException(this.key);
        c.a(missingApplicationPluginException, this);
        return missingApplicationPluginException;
    }
}
