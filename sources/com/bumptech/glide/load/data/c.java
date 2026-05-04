package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final OutputStream f28737a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f28738b;

    /* renamed from: c, reason: collision with root package name */
    public lk.b f28739c;

    /* renamed from: d, reason: collision with root package name */
    public int f28740d;

    public c(@NonNull OutputStream outputStream, @NonNull lk.b bVar) {
        this(outputStream, bVar, 65536);
    }

    public final void a() throws IOException {
        int i11 = this.f28740d;
        if (i11 > 0) {
            this.f28737a.write(this.f28738b, 0, i11);
            this.f28740d = 0;
        }
    }

    public final void c() throws IOException {
        if (this.f28740d == this.f28738b.length) {
            a();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f28737a.close();
            release();
        } catch (Throwable th2) {
            this.f28737a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f28737a.flush();
    }

    public final void release() {
        byte[] bArr = this.f28738b;
        if (bArr != null) {
            this.f28739c.put(bArr);
            this.f28738b = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        byte[] bArr = this.f28738b;
        int i12 = this.f28740d;
        this.f28740d = i12 + 1;
        bArr[i12] = (byte) i11;
        c();
    }

    @VisibleForTesting
    public c(@NonNull OutputStream outputStream, lk.b bVar, int i11) {
        this.f28737a = outputStream;
        this.f28739c = bVar;
        this.f28738b = (byte[]) bVar.a(i11, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        do {
            int i14 = i12 - i13;
            int i15 = i11 + i13;
            int i16 = this.f28740d;
            if (i16 == 0 && i14 >= this.f28738b.length) {
                this.f28737a.write(bArr, i15, i14);
                return;
            }
            int min = Math.min(i14, this.f28738b.length - i16);
            System.arraycopy(bArr, i15, this.f28738b, this.f28740d, min);
            this.f28740d += min;
            i13 += min;
            c();
        } while (i13 < i12);
    }
}
