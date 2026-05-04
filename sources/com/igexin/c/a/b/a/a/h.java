package com.igexin.c.a.b.a.a;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final BufferedInputStream f37123a;

    public h(InputStream inputStream) throws IOException {
        this.f37123a = new BufferedInputStream(inputStream);
    }

    private int a() throws IOException {
        return this.f37123a.read();
    }

    private int b(byte[] bArr) throws IOException {
        return this.f37123a.read(bArr);
    }

    private h(Socket socket) throws IOException {
        this.f37123a = new BufferedInputStream(socket.getInputStream());
    }

    private void b() throws IOException {
        this.f37123a.close();
    }

    public final int a(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            i12 = this.f37123a.read(bArr, i11, length - i11);
            if (i12 <= 0) {
                throw new IOException("read = -1, end of stream !");
            }
            i11 += i12;
        }
        return i12;
    }

    private int a(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            i14 = this.f37123a.read(bArr, i11 + i13, i12 - i13);
            if (i14 <= 0) {
                break;
            }
            i13 += i14;
        }
        return i14;
    }
}
