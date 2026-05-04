package ux;

import java.nio.charset.Charset;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final byte[] f92654a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final byte[] f92655b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final byte[] f92656c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final byte[] f92657d;

    static {
        Charset charset = u30.d.f91599b;
        byte[] bytes = "master secret".getBytes(charset);
        kotlin.jvm.internal.g0.o(bytes, "getBytes(...)");
        f92654a = bytes;
        byte[] bytes2 = "key expansion".getBytes(charset);
        kotlin.jvm.internal.g0.o(bytes2, "getBytes(...)");
        f92655b = bytes2;
        byte[] bytes3 = "client finished".getBytes(charset);
        kotlin.jvm.internal.g0.o(bytes3, "getBytes(...)");
        f92656c = bytes3;
        byte[] bytes4 = "server finished".getBytes(charset);
        kotlin.jvm.internal.g0.o(bytes4, "getBytes(...)");
        f92657d = bytes4;
    }

    @m80.k
    public static final byte[] a(@m80.k byte[] bArr, @m80.k e suite) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(suite, "suite");
        return a00.q.f1(bArr, (suite.C() * 2) + (suite.z() * 2), (suite.C() * 2) + (suite.z() * 2) + suite.u());
    }

    @m80.k
    public static final SecretKeySpec b(@m80.k byte[] bArr, @m80.k e suite) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(suite, "suite");
        return new SecretKeySpec(bArr, suite.C() * 2, suite.z(), u30.k0.U5(suite.x(), "/", null, 2, null));
    }

    @m80.k
    public static final SecretKeySpec c(@m80.k byte[] bArr, @m80.k e suite) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(suite, "suite");
        return new SecretKeySpec(bArr, 0, suite.C(), suite.v().getMacName());
    }

    @m80.k
    public static final byte[] d() {
        return f92656c;
    }

    @m80.k
    public static final byte[] e() {
        return f92657d;
    }

    @m80.k
    public static final byte[] f(@m80.k SecretKey masterSecret, @m80.k byte[] seed, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(masterSecret, "masterSecret");
        kotlin.jvm.internal.g0.p(seed, "seed");
        return j.a(masterSecret, f92655b, seed, (i12 * 2) + (i11 * 2) + (i13 * 2));
    }

    @m80.k
    public static final SecretKeySpec g(@m80.k SecretKey preMasterSecret, @m80.k byte[] clientRandom, @m80.k byte[] serverRandom) {
        kotlin.jvm.internal.g0.p(preMasterSecret, "preMasterSecret");
        kotlin.jvm.internal.g0.p(clientRandom, "clientRandom");
        kotlin.jvm.internal.g0.p(serverRandom, "serverRandom");
        return new SecretKeySpec(j.a(preMasterSecret, f92654a, a00.q.g3(clientRandom, serverRandom), 48), preMasterSecret.getAlgorithm());
    }

    @m80.k
    public static final byte[] h(@m80.k byte[] bArr, @m80.k e suite) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(suite, "suite");
        return a00.q.f1(bArr, (suite.C() * 2) + (suite.z() * 2) + suite.u(), (suite.C() * 2) + (suite.z() * 2) + (suite.u() * 2));
    }

    @m80.k
    public static final SecretKeySpec i(@m80.k byte[] bArr, @m80.k e suite) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(suite, "suite");
        return new SecretKeySpec(bArr, (suite.C() * 2) + suite.z(), suite.z(), u30.k0.U5(suite.x(), "/", null, 2, null));
    }

    @m80.k
    public static final SecretKeySpec j(@m80.k byte[] bArr, @m80.k e suite) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(suite, "suite");
        return new SecretKeySpec(bArr, suite.C(), suite.C(), suite.v().getMacName());
    }
}
