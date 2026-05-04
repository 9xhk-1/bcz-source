package ux;

import io.ktor.network.tls.CipherType;
import io.ktor.network.tls.SecretExchangeType;
import io.ktor.network.tls.extensions.HashAlgorithm;
import io.ktor.network.tls.extensions.SignatureAlgorithm;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final short f92584a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f92585b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f92586c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final SecretExchangeType f92587d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f92588e;

    /* renamed from: f, reason: collision with root package name */
    public final int f92589f;

    /* renamed from: g, reason: collision with root package name */
    public final int f92590g;

    /* renamed from: h, reason: collision with root package name */
    public final int f92591h;

    /* renamed from: i, reason: collision with root package name */
    public final int f92592i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final String f92593j;

    /* renamed from: k, reason: collision with root package name */
    public final int f92594k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final HashAlgorithm f92595l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final SignatureAlgorithm f92596m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final CipherType f92597n;

    /* renamed from: o, reason: collision with root package name */
    public final int f92598o;

    /* renamed from: p, reason: collision with root package name */
    public final int f92599p;

    public e(short s11, @m80.k String name, @m80.k String openSSLName, @m80.k SecretExchangeType exchangeType, @m80.k String jdkCipherName, int i11, int i12, int i13, int i14, @m80.k String macName, int i15, @m80.k HashAlgorithm hash, @m80.k SignatureAlgorithm signatureAlgorithm, @m80.k CipherType cipherType) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(openSSLName, "openSSLName");
        kotlin.jvm.internal.g0.p(exchangeType, "exchangeType");
        kotlin.jvm.internal.g0.p(jdkCipherName, "jdkCipherName");
        kotlin.jvm.internal.g0.p(macName, "macName");
        kotlin.jvm.internal.g0.p(hash, "hash");
        kotlin.jvm.internal.g0.p(signatureAlgorithm, "signatureAlgorithm");
        kotlin.jvm.internal.g0.p(cipherType, "cipherType");
        this.f92584a = s11;
        this.f92585b = name;
        this.f92586c = openSSLName;
        this.f92587d = exchangeType;
        this.f92588e = jdkCipherName;
        this.f92589f = i11;
        this.f92590g = i12;
        this.f92591h = i13;
        this.f92592i = i14;
        this.f92593j = macName;
        this.f92594k = i15;
        this.f92595l = hash;
        this.f92596m = signatureAlgorithm;
        this.f92597n = cipherType;
        this.f92598o = i11 / 8;
        this.f92599p = i15 / 8;
    }

    @m80.k
    public final String A() {
        return this.f92593j;
    }

    public final int B() {
        return this.f92594k;
    }

    public final int C() {
        return this.f92599p;
    }

    @m80.k
    public final String D() {
        return this.f92585b;
    }

    @m80.k
    public final String E() {
        return this.f92586c;
    }

    @m80.k
    public final SignatureAlgorithm F() {
        return this.f92596m;
    }

    public final short a() {
        return this.f92584a;
    }

    @m80.k
    public final String b() {
        return this.f92593j;
    }

    public final int c() {
        return this.f92594k;
    }

    @m80.k
    public final HashAlgorithm d() {
        return this.f92595l;
    }

    @m80.k
    public final SignatureAlgorithm e() {
        return this.f92596m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f92584a == eVar.f92584a && kotlin.jvm.internal.g0.g(this.f92585b, eVar.f92585b) && kotlin.jvm.internal.g0.g(this.f92586c, eVar.f92586c) && this.f92587d == eVar.f92587d && kotlin.jvm.internal.g0.g(this.f92588e, eVar.f92588e) && this.f92589f == eVar.f92589f && this.f92590g == eVar.f92590g && this.f92591h == eVar.f92591h && this.f92592i == eVar.f92592i && kotlin.jvm.internal.g0.g(this.f92593j, eVar.f92593j) && this.f92594k == eVar.f92594k && this.f92595l == eVar.f92595l && this.f92596m == eVar.f92596m && this.f92597n == eVar.f92597n;
    }

    @m80.k
    public final CipherType f() {
        return this.f92597n;
    }

    @m80.k
    public final String g() {
        return this.f92585b;
    }

    @m80.k
    public final String h() {
        return this.f92586c;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Short.hashCode(this.f92584a) * 31) + this.f92585b.hashCode()) * 31) + this.f92586c.hashCode()) * 31) + this.f92587d.hashCode()) * 31) + this.f92588e.hashCode()) * 31) + Integer.hashCode(this.f92589f)) * 31) + Integer.hashCode(this.f92590g)) * 31) + Integer.hashCode(this.f92591h)) * 31) + Integer.hashCode(this.f92592i)) * 31) + this.f92593j.hashCode()) * 31) + Integer.hashCode(this.f92594k)) * 31) + this.f92595l.hashCode()) * 31) + this.f92596m.hashCode()) * 31) + this.f92597n.hashCode();
    }

    @m80.k
    public final SecretExchangeType i() {
        return this.f92587d;
    }

    @m80.k
    public final String j() {
        return this.f92588e;
    }

    public final int k() {
        return this.f92589f;
    }

    public final int l() {
        return this.f92590g;
    }

    public final int m() {
        return this.f92591h;
    }

    public final int n() {
        return this.f92592i;
    }

    @m80.k
    public final e o(short s11, @m80.k String name, @m80.k String openSSLName, @m80.k SecretExchangeType exchangeType, @m80.k String jdkCipherName, int i11, int i12, int i13, int i14, @m80.k String macName, int i15, @m80.k HashAlgorithm hash, @m80.k SignatureAlgorithm signatureAlgorithm, @m80.k CipherType cipherType) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(openSSLName, "openSSLName");
        kotlin.jvm.internal.g0.p(exchangeType, "exchangeType");
        kotlin.jvm.internal.g0.p(jdkCipherName, "jdkCipherName");
        kotlin.jvm.internal.g0.p(macName, "macName");
        kotlin.jvm.internal.g0.p(hash, "hash");
        kotlin.jvm.internal.g0.p(signatureAlgorithm, "signatureAlgorithm");
        kotlin.jvm.internal.g0.p(cipherType, "cipherType");
        return new e(s11, name, openSSLName, exchangeType, jdkCipherName, i11, i12, i13, i14, macName, i15, hash, signatureAlgorithm, cipherType);
    }

    public final int q() {
        return this.f92592i;
    }

    @m80.k
    public final CipherType r() {
        return this.f92597n;
    }

    public final short s() {
        return this.f92584a;
    }

    @m80.k
    public final SecretExchangeType t() {
        return this.f92587d;
    }

    @m80.k
    public String toString() {
        return "CipherSuite(code=" + ((int) this.f92584a) + ", name=" + this.f92585b + ", openSSLName=" + this.f92586c + ", exchangeType=" + this.f92587d + ", jdkCipherName=" + this.f92588e + ", keyStrength=" + this.f92589f + ", fixedIvLength=" + this.f92590g + ", ivLength=" + this.f92591h + ", cipherTagSizeInBytes=" + this.f92592i + ", macName=" + this.f92593j + ", macStrength=" + this.f92594k + ", hash=" + this.f92595l + ", signatureAlgorithm=" + this.f92596m + ", cipherType=" + this.f92597n + ')';
    }

    public final int u() {
        return this.f92590g;
    }

    @m80.k
    public final HashAlgorithm v() {
        return this.f92595l;
    }

    public final int w() {
        return this.f92591h;
    }

    @m80.k
    public final String x() {
        return this.f92588e;
    }

    public final int y() {
        return this.f92589f;
    }

    public final int z() {
        return this.f92598o;
    }

    public /* synthetic */ e(short s11, String str, String str2, SecretExchangeType secretExchangeType, String str3, int i11, int i12, int i13, int i14, String str4, int i15, HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm, CipherType cipherType, int i16, kotlin.jvm.internal.v vVar) {
        this(s11, str, str2, secretExchangeType, str3, i11, i12, i13, i14, str4, i15, hashAlgorithm, signatureAlgorithm, (i16 & 8192) != 0 ? CipherType.GCM : cipherType);
    }
}
