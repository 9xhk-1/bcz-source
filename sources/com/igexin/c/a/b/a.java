package com.igexin.c.a.b;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public final class a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private InputStream f37075a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f37076b;

    /* renamed from: c, reason: collision with root package name */
    private int f37077c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f37078d = false;

    public a(InputStream inputStream) {
        this.f37075a = inputStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if (r1[2] == '=') goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() throws java.io.IOException {
        /*
            r11 = this;
            r0 = 4
            char[] r1 = new char[r0]
            r2 = 0
            r3 = r2
        L5:
            java.io.InputStream r4 = r11.f37075a
            int r4 = r4.read()
            r5 = -1
            java.lang.String r6 = "Bad base64 stream"
            r7 = 1
            if (r4 != r5) goto L20
            if (r3 != 0) goto L1a
            int[] r0 = new int[r2]
            r11.f37076b = r0
            r11.f37078d = r7
            return
        L1a:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r6)
            throw r0
        L20:
            char r4 = (char) r4
            java.lang.String r8 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            int r9 = r8.indexOf(r4)
            r10 = 61
            if (r9 != r5) goto L3d
            if (r4 != r10) goto L2e
            goto L3d
        L2e:
            r9 = 13
            if (r4 == r9) goto L42
            r9 = 10
            if (r4 != r9) goto L37
            goto L42
        L37:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r6)
            throw r0
        L3d:
            int r9 = r3 + 1
            r1[r3] = r4
            r3 = r9
        L42:
            if (r3 < r0) goto L5
            r3 = r2
            r4 = r3
        L46:
            if (r3 >= r0) goto L5b
            char r9 = r1[r3]
            if (r9 == r10) goto L55
            if (r4 != 0) goto L4f
            goto L58
        L4f:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r6)
            throw r0
        L55:
            if (r4 != 0) goto L58
            r4 = r7
        L58:
            int r3 = r3 + 1
            goto L46
        L5b:
            r3 = 3
            char r4 = r1[r3]
            if (r4 != r10) goto L70
            java.io.InputStream r3 = r11.f37075a
            int r3 = r3.read()
            if (r3 != r5) goto L72
            r11.f37078d = r7
            r3 = 2
            char r4 = r1[r3]
            if (r4 != r10) goto L70
            goto L78
        L70:
            r7 = r3
            goto L78
        L72:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r6)
            throw r0
        L78:
            r3 = r2
            r4 = r3
        L7a:
            if (r3 >= r0) goto L8d
            char r5 = r1[r3]
            if (r5 == r10) goto L8a
            int r5 = r8.indexOf(r5)
            int r6 = 3 - r3
            int r6 = r6 * 6
            int r5 = r5 << r6
            r4 = r4 | r5
        L8a:
            int r3 = r3 + 1
            goto L7a
        L8d:
            int[] r0 = new int[r7]
            r11.f37076b = r0
        L91:
            if (r2 >= r7) goto La2
            int[] r0 = r11.f37076b
            int r1 = 2 - r2
            int r1 = r1 * 8
            int r1 = r4 >>> r1
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0[r2] = r1
            int r2 = r2 + 1
            goto L91
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.c.a.b.a.a():void");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f37075a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x007c, code lost:
    
        if (r2[2] == '=') goto L50;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.c.a.b.a.read():int");
    }
}
