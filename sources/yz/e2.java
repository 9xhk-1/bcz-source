package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e2 {
    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short[] a(int i11, x00.l<? super Integer, c2> init) {
        kotlin.jvm.internal.g0.p(init, "init");
        short[] sArr = new short[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            sArr[i12] = init.invoke(Integer.valueOf(i12)).k0();
        }
        return d2.f(sArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short[] b(short... sArr) {
        kotlin.jvm.internal.g0.p(sArr, "$v$c$kotlin-UShortArray$-elements$0");
        return sArr;
    }
}
