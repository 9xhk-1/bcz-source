package com.xiaomi.push;

import java.io.ByteArrayOutputStream;

/* loaded from: classes8.dex */
public class iv extends ByteArrayOutputStream {
    public iv() {
    }

    public int a() {
        return ((ByteArrayOutputStream) this).count;
    }

    public iv(int i11) {
        super(i11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m6153a() {
        return ((ByteArrayOutputStream) this).buf;
    }
}
