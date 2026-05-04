package io.ktor.network.tls;

import c40.g0;
import java.security.KeyStore;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class NoPrivateKeyException extends IllegalStateException implements g0<NoPrivateKeyException> {

    @k
    private final String alias;

    @k
    private final KeyStore store;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoPrivateKeyException(@k String alias, @k KeyStore store) {
        super("Failed to find private key for alias " + alias + ". Please check your key store: " + store);
        kotlin.jvm.internal.g0.p(alias, "alias");
        kotlin.jvm.internal.g0.p(store, "store");
        this.alias = alias;
        this.store = store;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c40.g0
    @k
    public NoPrivateKeyException createCopy() {
        NoPrivateKeyException noPrivateKeyException = new NoPrivateKeyException(this.alias, this.store);
        noPrivateKeyException.initCause(this);
        return noPrivateKeyException;
    }
}
