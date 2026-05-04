package xy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u0 {
    @m80.k
    public static final byte[] b(@m80.k t0 t0Var, @m80.k byte[] input, int i11, int i12) {
        kotlin.jvm.internal.g0.p(t0Var, "<this>");
        kotlin.jvm.internal.g0.p(input, "input");
        t0Var.update(input, i11, i12);
        return t0Var.a();
    }

    public static /* synthetic */ byte[] c(t0 t0Var, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return b(t0Var, bArr, i11, i12);
    }

    public static final int d(int i11, int i12) {
        return (i11 >>> (32 - i12)) | (i11 << i12);
    }
}
