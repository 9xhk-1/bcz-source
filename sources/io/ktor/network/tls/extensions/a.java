package io.ktor.network.tls.extensions;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ux.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C0706a f61114e = new C0706a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final HashAlgorithm f61115a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SignatureAlgorithm f61116b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final m f61117c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f61118d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: io.ktor.network.tls.extensions.a$a, reason: collision with other inner class name */
    public static final class C0706a {
        public /* synthetic */ C0706a(v vVar) {
            this();
        }

        public C0706a() {
        }
    }

    public a(@k HashAlgorithm hash, @k SignatureAlgorithm sign, @l m mVar) {
        g0.p(hash, "hash");
        g0.p(sign, "sign");
        this.f61115a = hash;
        this.f61116b = sign;
        this.f61117c = mVar;
        this.f61118d = hash.name() + "with" + sign.name();
    }

    public static /* synthetic */ a e(a aVar, HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm, m mVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hashAlgorithm = aVar.f61115a;
        }
        if ((i11 & 2) != 0) {
            signatureAlgorithm = aVar.f61116b;
        }
        if ((i11 & 4) != 0) {
            mVar = aVar.f61117c;
        }
        return aVar.d(hashAlgorithm, signatureAlgorithm, mVar);
    }

    @k
    public final HashAlgorithm a() {
        return this.f61115a;
    }

    @k
    public final SignatureAlgorithm b() {
        return this.f61116b;
    }

    @l
    public final m c() {
        return this.f61117c;
    }

    @k
    public final a d(@k HashAlgorithm hash, @k SignatureAlgorithm sign, @l m mVar) {
        g0.p(hash, "hash");
        g0.p(sign, "sign");
        return new a(hash, sign, mVar);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f61115a == aVar.f61115a && this.f61116b == aVar.f61116b && g0.g(this.f61117c, aVar.f61117c);
    }

    @k
    public final HashAlgorithm f() {
        return this.f61115a;
    }

    @k
    public final String g() {
        return this.f61118d;
    }

    @l
    public final m h() {
        return this.f61117c;
    }

    public int hashCode() {
        int hashCode = ((this.f61115a.hashCode() * 31) + this.f61116b.hashCode()) * 31;
        m mVar = this.f61117c;
        return hashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    @k
    public final SignatureAlgorithm i() {
        return this.f61116b;
    }

    @k
    public String toString() {
        return "HashAndSign(hash=" + this.f61115a + ", sign=" + this.f61116b + ", oid=" + this.f61117c + ')';
    }

    public /* synthetic */ a(HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm, m mVar, int i11, v vVar) {
        this(hashAlgorithm, signatureAlgorithm, (i11 & 4) != 0 ? null : mVar);
    }
}
