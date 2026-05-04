package ux;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n {
    @m80.k
    public static final String a(@m80.k String algorithm) {
        kotlin.jvm.internal.g0.p(algorithm, "algorithm");
        if (u30.f0.a2(algorithm, "ecdsa", true)) {
            return "EC";
        }
        if (u30.f0.a2(algorithm, "dsa", true)) {
            return "DSA";
        }
        if (u30.f0.a2(algorithm, "rsa", true)) {
            return "RSA";
        }
        throw new IllegalStateException(("Couldn't find KeyPairGenerator algorithm for " + algorithm).toString());
    }
}
