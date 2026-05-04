package ux;

import java.security.PrivateKey;
import java.security.PublicKey;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final PublicKey f92613a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final PublicKey f92614b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final PrivateKey f92615c;

    public i(@m80.k PublicKey serverPublic, @m80.k PublicKey clientPublic, @m80.k PrivateKey clientPrivate) {
        kotlin.jvm.internal.g0.p(serverPublic, "serverPublic");
        kotlin.jvm.internal.g0.p(clientPublic, "clientPublic");
        kotlin.jvm.internal.g0.p(clientPrivate, "clientPrivate");
        this.f92613a = serverPublic;
        this.f92614b = clientPublic;
        this.f92615c = clientPrivate;
    }

    public static /* synthetic */ i e(i iVar, PublicKey publicKey, PublicKey publicKey2, PrivateKey privateKey, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            publicKey = iVar.f92613a;
        }
        if ((i11 & 2) != 0) {
            publicKey2 = iVar.f92614b;
        }
        if ((i11 & 4) != 0) {
            privateKey = iVar.f92615c;
        }
        return iVar.d(publicKey, publicKey2, privateKey);
    }

    @m80.k
    public final PublicKey a() {
        return this.f92613a;
    }

    @m80.k
    public final PublicKey b() {
        return this.f92614b;
    }

    @m80.k
    public final PrivateKey c() {
        return this.f92615c;
    }

    @m80.k
    public final i d(@m80.k PublicKey serverPublic, @m80.k PublicKey clientPublic, @m80.k PrivateKey clientPrivate) {
        kotlin.jvm.internal.g0.p(serverPublic, "serverPublic");
        kotlin.jvm.internal.g0.p(clientPublic, "clientPublic");
        kotlin.jvm.internal.g0.p(clientPrivate, "clientPrivate");
        return new i(serverPublic, clientPublic, clientPrivate);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.g0.g(this.f92613a, iVar.f92613a) && kotlin.jvm.internal.g0.g(this.f92614b, iVar.f92614b) && kotlin.jvm.internal.g0.g(this.f92615c, iVar.f92615c);
    }

    @m80.k
    public final PrivateKey f() {
        return this.f92615c;
    }

    @m80.k
    public final PublicKey g() {
        return this.f92614b;
    }

    @m80.k
    public final PublicKey h() {
        return this.f92613a;
    }

    public int hashCode() {
        return (((this.f92613a.hashCode() * 31) + this.f92614b.hashCode()) * 31) + this.f92615c.hashCode();
    }

    @m80.k
    public String toString() {
        return "EncryptionInfo(serverPublic=" + this.f92613a + ", clientPublic=" + this.f92614b + ", clientPrivate=" + this.f92615c + ')';
    }
}
