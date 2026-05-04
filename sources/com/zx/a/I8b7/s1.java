package com.zx.a.I8b7;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class s1 {
    public static s1 a(x0 x0Var, String str) {
        Charset.forName("UTF-8");
        if (x0Var != null && x0Var.a() == null) {
            Charset.forName("UTF-8");
            x0Var = x0.b(x0Var + "; charset=utf-8");
        }
        return a(x0Var, str.getBytes(StandardCharsets.UTF_8));
    }

    public static s1 a(x0 x0Var, byte[] bArr) {
        int length = bArr.length;
        long length2 = bArr.length;
        long j11 = 0;
        long j12 = length;
        if ((j11 | j12) >= 0 && j11 <= length2 && length2 - j11 >= j12) {
            return new r1(x0Var, length, bArr, 0);
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
