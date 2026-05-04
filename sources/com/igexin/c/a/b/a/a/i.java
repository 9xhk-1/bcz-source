package com.igexin.c.a.b.a.a;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    final BufferedOutputStream f37124a;

    public i(OutputStream outputStream) throws IOException {
        this.f37124a = new BufferedOutputStream(outputStream);
    }

    private void a() throws IOException {
        this.f37124a.close();
    }

    private i(Socket socket) throws IOException {
        this.f37124a = new BufferedOutputStream(socket.getOutputStream());
    }

    private void a(byte[] bArr) throws IOException {
        this.f37124a.write(bArr, 0, bArr.length);
        this.f37124a.flush();
    }

    private void a(byte[] bArr, int i11, int i12) throws IOException {
        this.f37124a.write(bArr, i11, i12);
        this.f37124a.flush();
    }
}
