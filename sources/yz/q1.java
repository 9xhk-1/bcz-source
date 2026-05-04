package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q1 {
    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte[] a(int i11, x00.l<? super Integer, o1> init) {
        kotlin.jvm.internal.g0.p(init, "init");
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = init.invoke(Integer.valueOf(i12)).k0();
        }
        return p1.f(bArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte[] b(byte... bArr) {
        kotlin.jvm.internal.g0.p(bArr, "$v$c$kotlin-UByteArray$-elements$0");
        return bArr;
    }
}
