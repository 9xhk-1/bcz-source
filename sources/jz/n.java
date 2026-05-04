package jz;

import kotlin.jvm.internal.g0;
import y40.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n {
    public static final boolean a(@m80.k c0 c0Var) {
        g0.p(c0Var, "<this>");
        return c0Var.J();
    }

    public static final int b(@m80.k c0 c0Var, @m80.k byte[] buffer, int i11, int i12) {
        g0.p(c0Var, "<this>");
        g0.p(buffer, "buffer");
        int c72 = c0Var.c7(buffer, i11, i12 + i11);
        if (c72 == -1) {
            return 0;
        }
        return c72;
    }

    public static /* synthetic */ int c(c0 c0Var, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length - i11;
        }
        return b(c0Var, bArr, i11, i12);
    }
}
