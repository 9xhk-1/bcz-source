package sk;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class v0 extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public volatile byte[] f88806a;

    /* renamed from: b, reason: collision with root package name */
    public int f88807b;

    /* renamed from: c, reason: collision with root package name */
    public int f88808c;

    /* renamed from: d, reason: collision with root package name */
    public int f88809d;

    /* renamed from: e, reason: collision with root package name */
    public int f88810e;

    /* renamed from: f, reason: collision with root package name */
    public final lk.b f88811f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public a(String str) {
            super(str);
        }
    }

    public v0(@NonNull InputStream inputStream, @NonNull lk.b bVar) {
        this(inputStream, bVar, 65536);
    }

    public static IOException e() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i11 = this.f88809d;
        if (i11 != -1) {
            int i12 = this.f88810e - i11;
            int i13 = this.f88808c;
            if (i12 < i13) {
                if (i11 == 0 && i13 > bArr.length && this.f88807b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i13) {
                        i13 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f88811f.a(i13, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f88806a = bArr2;
                    this.f88811f.put(bArr);
                    bArr = bArr2;
                } else if (i11 > 0) {
                    System.arraycopy(bArr, i11, bArr, 0, bArr.length - i11);
                }
                int i14 = this.f88810e - this.f88809d;
                this.f88810e = i14;
                this.f88809d = 0;
                this.f88807b = 0;
                int read = inputStream.read(bArr, i14, bArr.length - i14);
                int i15 = this.f88810e;
                if (read > 0) {
                    i15 += read;
                }
                this.f88807b = i15;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f88809d = -1;
            this.f88810e = 0;
            this.f88807b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f88806a == null || inputStream == null) {
            throw e();
        }
        return (this.f88807b - this.f88810e) + inputStream.available();
    }

    public synchronized void c() {
        this.f88808c = this.f88806a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f88806a != null) {
            this.f88811f.put(this.f88806a);
            this.f88806a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        this.f88808c = Math.max(this.f88808c, i11);
        this.f88809d = this.f88810e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f88806a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw e();
        }
        if (this.f88810e >= this.f88807b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f88806a && (bArr = this.f88806a) == null) {
            throw e();
        }
        int i11 = this.f88807b;
        int i12 = this.f88810e;
        if (i11 - i12 <= 0) {
            return -1;
        }
        this.f88810e = i12 + 1;
        return bArr[i12] & 255;
    }

    public synchronized void release() {
        if (this.f88806a != null) {
            this.f88811f.put(this.f88806a);
            this.f88806a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f88806a == null) {
            throw new IOException("Stream is closed");
        }
        int i11 = this.f88809d;
        if (-1 == i11) {
            throw new a("Mark has been invalidated, pos: " + this.f88810e + " markLimit: " + this.f88808c);
        }
        this.f88810e = i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j11) throws IOException {
        if (j11 < 1) {
            return 0L;
        }
        byte[] bArr = this.f88806a;
        if (bArr == null) {
            throw e();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw e();
        }
        int i11 = this.f88807b;
        int i12 = this.f88810e;
        if (i11 - i12 >= j11) {
            this.f88810e = (int) (i12 + j11);
            return j11;
        }
        long j12 = i11 - i12;
        this.f88810e = i11;
        if (this.f88809d == -1 || j11 > this.f88808c) {
            long skip = inputStream.skip(j11 - j12);
            if (skip > 0) {
                this.f88809d = -1;
            }
            return j12 + skip;
        }
        if (a(inputStream, bArr) == -1) {
            return j12;
        }
        int i13 = this.f88807b;
        int i14 = this.f88810e;
        if (i13 - i14 >= j11 - j12) {
            this.f88810e = (int) ((i14 + j11) - j12);
            return j11;
        }
        long j13 = (j12 + i13) - i14;
        this.f88810e = i13;
        return j13;
    }

    @VisibleForTesting
    public v0(@NonNull InputStream inputStream, @NonNull lk.b bVar, int i11) {
        super(inputStream);
        this.f88809d = -1;
        this.f88811f = bVar;
        this.f88806a = (byte[]) bVar.a(i11, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        int i14;
        byte[] bArr2 = this.f88806a;
        if (bArr2 == null) {
            throw e();
        }
        if (i12 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i15 = this.f88810e;
            int i16 = this.f88807b;
            if (i15 < i16) {
                int i17 = i16 - i15 >= i12 ? i12 : i16 - i15;
                System.arraycopy(bArr2, i15, bArr, i11, i17);
                this.f88810e += i17;
                if (i17 == i12 || inputStream.available() == 0) {
                    return i17;
                }
                i11 += i17;
                i13 = i12 - i17;
            } else {
                i13 = i12;
            }
            while (true) {
                if (this.f88809d == -1 && i13 >= bArr2.length) {
                    i14 = inputStream.read(bArr, i11, i13);
                    if (i14 == -1) {
                        return i13 != i12 ? i12 - i13 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i13 != i12 ? i12 - i13 : -1;
                    }
                    if (bArr2 != this.f88806a && (bArr2 = this.f88806a) == null) {
                        throw e();
                    }
                    int i18 = this.f88807b;
                    int i19 = this.f88810e;
                    i14 = i18 - i19 >= i13 ? i13 : i18 - i19;
                    System.arraycopy(bArr2, i19, bArr, i11, i14);
                    this.f88810e += i14;
                }
                i13 -= i14;
                if (i13 == 0) {
                    return i12;
                }
                if (inputStream.available() == 0) {
                    return i12 - i13;
                }
                i11 += i14;
            }
        } else {
            throw e();
        }
    }
}
