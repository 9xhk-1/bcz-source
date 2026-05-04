package com.xiaomi.push;

import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class e {
    public abstract int a();

    public abstract e a(b bVar);

    public e a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public abstract void a(c cVar);

    public abstract int b();

    public e a(byte[] bArr, int i11, int i12) {
        try {
            b a11 = b.a(bArr, i11, i12);
            a(a11);
            a11.m5732a(0);
            return this;
        } catch (d e11) {
            throw e11;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5906a(byte[] bArr, int i11, int i12) {
        try {
            c a11 = c.a(bArr, i11, i12);
            a(a11);
            a11.b();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    public boolean a(b bVar, int i11) {
        return bVar.m5734a(i11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m5907a() {
        int b11 = b();
        byte[] bArr = new byte[b11];
        m5906a(bArr, 0, b11);
        return bArr;
    }
}
