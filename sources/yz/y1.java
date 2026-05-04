package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y1 {
    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long[] a(int i11, x00.l<? super Integer, w1> init) {
        kotlin.jvm.internal.g0.p(init, "init");
        long[] jArr = new long[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i12] = init.invoke(Integer.valueOf(i12)).m0();
        }
        return x1.f(jArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long[] b(long... jArr) {
        kotlin.jvm.internal.g0.p(jArr, "$v$c$kotlin-ULongArray$-elements$0");
        return jArr;
    }
}
