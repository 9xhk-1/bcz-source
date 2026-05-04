package org.junit.jupiter.params.shadow.com.univocity.parsers.common.input;

import com.jiongji.andriod.card.R;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import n60.c;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class BomInput extends InputStream {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f78130g = d.D(R.styleable.Theme_drawable_tab_surrounding, 187, 191);

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f78131h = d.D(254, 255);

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f78132i = d.D(255, 254);

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f78133j = d.D(0, 0, 254, 255);

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f78134k = d.D(255, 254, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public int f78135a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f78136b;

    /* renamed from: c, reason: collision with root package name */
    public String f78137c;

    /* renamed from: d, reason: collision with root package name */
    public int f78138d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f78139e;

    /* renamed from: f, reason: collision with root package name */
    public IOException f78140f;

    public BomInput(InputStream inputStream) {
        int[] iArr = new int[4];
        this.f78136b = iArr;
        this.f78139e = inputStream;
        try {
            int f11 = f();
            iArr[0] = f11;
            if (f11 == 239) {
                int[] iArr2 = this.f78136b;
                int f12 = f();
                iArr2[1] = f12;
                if (f12 == 187) {
                    int[] iArr3 = this.f78136b;
                    int f13 = f();
                    iArr3[2] = f13;
                    if (f13 == 191) {
                        i("UTF-8");
                        return;
                    }
                    return;
                }
                return;
            }
            int[] iArr4 = this.f78136b;
            int i11 = iArr4[0];
            if (i11 == 254) {
                int f14 = f();
                iArr4[1] = f14;
                if (f14 == 255) {
                    i(c.f74536d);
                    return;
                }
                return;
            }
            if (i11 == 255) {
                int f15 = f();
                iArr4[1] = f15;
                if (f15 == 254) {
                    int[] iArr5 = this.f78136b;
                    int f16 = f();
                    iArr5[2] = f16;
                    if (f16 != 0) {
                        i(c.f74537e);
                        return;
                    }
                    int[] iArr6 = this.f78136b;
                    int f17 = f();
                    iArr6[3] = f17;
                    if (f17 == 0) {
                        i("UTF-32LE");
                        return;
                    } else {
                        i(c.f74537e);
                        return;
                    }
                }
                return;
            }
            if (i11 == 0) {
                int f18 = f();
                iArr4[1] = f18;
                if (f18 == 0) {
                    int[] iArr7 = this.f78136b;
                    int f19 = f();
                    iArr7[2] = f19;
                    if (f19 == 254) {
                        int[] iArr8 = this.f78136b;
                        int f21 = f();
                        iArr8[3] = f21;
                        if (f21 == 255) {
                            i("UTF-32BE");
                        }
                    }
                }
            }
        } catch (IOException e11) {
            this.f78140f = e11;
        }
    }

    public final Charset a() {
        String str = this.f78137c;
        if (str == null) {
            return null;
        }
        return Charset.forName(str);
    }

    public final String c() {
        return this.f78137c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f78139e.close();
    }

    public final boolean e() {
        return this.f78135a > 0;
    }

    public final int f() throws IOException {
        int read = this.f78139e.read();
        this.f78135a++;
        return read;
    }

    public final void i(String str) {
        this.f78137c = str;
        if (str.equals(c.f74537e)) {
            int i11 = this.f78135a;
            if (i11 == 3) {
                this.f78135a = 1;
                int[] iArr = this.f78136b;
                iArr[0] = iArr[2];
                try {
                    iArr[1] = f();
                    return;
                } catch (Exception e11) {
                    this.f78140f = (IOException) e11;
                    return;
                }
            }
            if (i11 == 4) {
                this.f78135a = 2;
                int[] iArr2 = this.f78136b;
                iArr2[0] = iArr2[2];
                iArr2[1] = iArr2[3];
                return;
            }
        }
        this.f78135a = 0;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i11;
        IOException iOException;
        int i12 = this.f78135a;
        if (i12 <= 0 || i12 <= (i11 = this.f78138d)) {
            int i13 = this.f78138d;
            if (i13 != i12) {
                throw new BytesProcessedNotification(this.f78139e, this.f78137c);
            }
            this.f78138d = i13 + 1;
            return -1;
        }
        int i14 = this.f78136b[i11];
        int i15 = i11 + 1;
        this.f78138d = i15;
        if (i15 != i12 || (iOException = this.f78140f) == null) {
            return i14;
        }
        throw iOException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class BytesProcessedNotification extends RuntimeException {
        public final String encoding;
        public final InputStream input;

        public BytesProcessedNotification(InputStream inputStream, String str) {
            this.input = inputStream;
            this.encoding = str;
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }
}
