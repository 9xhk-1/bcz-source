package com.mob.secverify.pure.core.ope.b.c;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f40887a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f40888b = new byte[256];

    /* renamed from: c, reason: collision with root package name */
    private byte[] f40889c = new byte[4];

    static {
        for (int i11 = 0; i11 < 255; i11++) {
            f40888b[i11] = -1;
        }
        for (int i12 = 0; i12 < 64; i12++) {
            f40888b[f40887a[i12]] = (byte) i12;
        }
    }

    public final void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i11;
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream);
        while (true) {
            int i12 = 0;
            while (true) {
                i11 = i12 + 4;
                if (i11 >= 72) {
                    break;
                }
                try {
                    a(pushbackInputStream, outputStream, 4);
                    i12 = i11;
                } catch (IOException unused) {
                    return;
                }
            }
            if (i11 == 72) {
                a(pushbackInputStream, outputStream, 4);
            } else {
                a(pushbackInputStream, outputStream, 72 - i12);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.io.PushbackInputStream r10, java.io.OutputStream r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.b.c.h.a(java.io.PushbackInputStream, java.io.OutputStream, int):void");
    }
}
