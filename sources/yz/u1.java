package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u1 {
    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int[] a(int i11, x00.l<? super Integer, s1> init) {
        kotlin.jvm.internal.g0.p(init, "init");
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = init.invoke(Integer.valueOf(i12)).m0();
        }
        return t1.f(iArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int[] b(int... iArr) {
        kotlin.jvm.internal.g0.p(iArr, "$v$c$kotlin-UIntArray$-elements$0");
        return iArr;
    }
}
