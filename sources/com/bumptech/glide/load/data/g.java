package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class g extends FilterInputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final int f28744c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f28745d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f28746e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f28747f;

    /* renamed from: a, reason: collision with root package name */
    public final byte f28748a;

    /* renamed from: b, reason: collision with root package name */
    public int f28749b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, ho.c.f59556u, 0, 2, 0, 0, 0, 1, 0};
        f28745d = bArr;
        int length = bArr.length;
        f28746e = length;
        f28747f = length + 2;
    }

    public g(InputStream inputStream, int i11) {
        super(inputStream);
        if (i11 >= -1 && i11 <= 8) {
            this.f28748a = (byte) i11;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i11;
        int i12 = this.f28749b;
        int read = (i12 < 2 || i12 > (i11 = f28747f)) ? super.read() : i12 == i11 ? this.f28748a : f28745d[i12 - 2] & 255;
        if (read != -1) {
            this.f28749b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        long skip = super.skip(j11);
        if (skip > 0) {
            this.f28749b = (int) (this.f28749b + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        int i14 = this.f28749b;
        int i15 = f28747f;
        if (i14 > i15) {
            i13 = super.read(bArr, i11, i12);
        } else if (i14 == i15) {
            bArr[i11] = this.f28748a;
            i13 = 1;
        } else if (i14 < 2) {
            i13 = super.read(bArr, i11, 2 - i14);
        } else {
            int min = Math.min(i15 - i14, i12);
            System.arraycopy(f28745d, this.f28749b - 2, bArr, i11, min);
            i13 = min;
        }
        if (i13 > 0) {
            this.f28749b += i13;
        }
        return i13;
    }
}
