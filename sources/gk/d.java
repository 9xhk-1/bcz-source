package gk;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final byte f53927f = 13;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f53928g = 10;

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f53929a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f53930b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f53931c;

    /* renamed from: d, reason: collision with root package name */
    public int f53932d;

    /* renamed from: e, reason: collision with root package name */
    public int f53933e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ByteArrayOutputStream {
        public a(int i11) {
            super(i11);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i11 = ((ByteArrayOutputStream) this).count;
            if (i11 > 0 && ((ByteArrayOutputStream) this).buf[i11 - 1] == 13) {
                i11--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i11, d.this.f53930b.name());
            } catch (UnsupportedEncodingException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public d(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public final void c() throws IOException {
        InputStream inputStream = this.f53929a;
        byte[] bArr = this.f53931c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f53932d = 0;
        this.f53933e = read;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f53929a) {
            try {
                if (this.f53931c != null) {
                    this.f53931c = null;
                    this.f53929a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e() {
        return this.f53933e == -1;
    }

    public String f() throws IOException {
        int i11;
        byte[] bArr;
        int i12;
        synchronized (this.f53929a) {
            try {
                if (this.f53931c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f53932d >= this.f53933e) {
                    c();
                }
                for (int i13 = this.f53932d; i13 != this.f53933e; i13++) {
                    byte[] bArr2 = this.f53931c;
                    if (bArr2[i13] == 10) {
                        int i14 = this.f53932d;
                        if (i13 != i14) {
                            i12 = i13 - 1;
                            if (bArr2[i12] == 13) {
                                String str = new String(bArr2, i14, i12 - i14, this.f53930b.name());
                                this.f53932d = i13 + 1;
                                return str;
                            }
                        }
                        i12 = i13;
                        String str2 = new String(bArr2, i14, i12 - i14, this.f53930b.name());
                        this.f53932d = i13 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f53933e - this.f53932d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f53931c;
                    int i15 = this.f53932d;
                    aVar.write(bArr3, i15, this.f53933e - i15);
                    this.f53933e = -1;
                    c();
                    i11 = this.f53932d;
                    while (i11 != this.f53933e) {
                        bArr = this.f53931c;
                        if (bArr[i11] == 10) {
                            break loop1;
                        }
                        i11++;
                    }
                }
                int i16 = this.f53932d;
                if (i11 != i16) {
                    aVar.write(bArr, i16, i11 - i16);
                }
                this.f53932d = i11 + 1;
                return aVar.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public d(InputStream inputStream, int i11, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(e.f53935a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f53929a = inputStream;
        this.f53930b = charset;
        this.f53931c = new byte[i11];
    }
}
