package com.meizu.cloud.pushsdk.c.g;

import androidx.annotation.NonNull;
import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kx.a0;

/* loaded from: classes7.dex */
public final class b implements c, d, Cloneable {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f39639c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a, reason: collision with root package name */
    j f39640a;

    /* renamed from: b, reason: collision with root package name */
    long f39641b;

    public int a(byte[] bArr, int i11, int i12) {
        o.a(bArr.length, i11, i12);
        j jVar = this.f39640a;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(i12, jVar.f39663c - jVar.f39662b);
        System.arraycopy(jVar.f39661a, jVar.f39662b, bArr, i11, min);
        int i13 = jVar.f39662b + min;
        jVar.f39662b = i13;
        this.f39641b -= min;
        if (i13 == jVar.f39663c) {
            this.f39640a = jVar.a();
            k.a(jVar);
        }
        return min;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.m
    public long b(b bVar, long j11) {
        if (bVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j11 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j11);
        }
        long j12 = this.f39641b;
        if (j12 == 0) {
            return -1L;
        }
        if (j11 > j12) {
            j11 = j12;
        }
        bVar.a(this, j11);
        return j11;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b e(long j11) {
        boolean z11;
        if (j11 == 0) {
            return b(48);
        }
        int i11 = 1;
        if (j11 < 0) {
            j11 = -j11;
            if (j11 < 0) {
                return b("-9223372036854775808");
            }
            z11 = true;
        } else {
            z11 = false;
        }
        if (j11 >= vb.a.f93807j) {
            i11 = j11 < 1000000000000L ? j11 < z50.f.f100989w ? j11 < C.NANOS_PER_SECOND ? 9 : 10 : j11 < 100000000000L ? 11 : 12 : j11 < 1000000000000000L ? j11 < 10000000000000L ? 13 : j11 < 100000000000000L ? 14 : 15 : j11 < 100000000000000000L ? j11 < 10000000000000000L ? 16 : 17 : j11 < 1000000000000000000L ? 18 : 19;
        } else if (j11 >= 10000) {
            i11 = j11 < 1000000 ? j11 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US ? 5 : 6 : j11 < 10000000 ? 7 : 8;
        } else if (j11 >= 100) {
            i11 = j11 < 1000 ? 3 : 4;
        } else if (j11 >= 10) {
            i11 = 2;
        }
        if (z11) {
            i11++;
        }
        j c11 = c(i11);
        byte[] bArr = c11.f39661a;
        int i12 = c11.f39663c + i11;
        while (j11 != 0) {
            i12--;
            bArr[i12] = f39639c[(int) (j11 % 10)];
            j11 /= 10;
        }
        if (z11) {
            bArr[i12 - 1] = a0.f68904b;
        }
        c11.f39663c += i11;
        this.f39641b += i11;
        return this;
    }

    public b d(long j11) {
        if (j11 == 0) {
            return b(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j11)) / 4) + 1;
        j c11 = c(numberOfTrailingZeros);
        byte[] bArr = c11.f39661a;
        int i11 = c11.f39663c;
        for (int i12 = (i11 + numberOfTrailingZeros) - 1; i12 >= i11; i12--) {
            bArr[i12] = f39639c[(int) (15 & j11)];
            j11 >>>= 4;
        }
        c11.f39663c += numberOfTrailingZeros;
        this.f39641b += numberOfTrailingZeros;
        return this;
    }

    public long e() {
        long j11 = this.f39641b;
        if (j11 == 0) {
            return 0L;
        }
        j jVar = this.f39640a.f39667g;
        return (jVar.f39663c >= 2048 || !jVar.f39665e) ? j11 : j11 - (r3 - jVar.f39662b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        long j11 = this.f39641b;
        if (j11 != bVar.f39641b) {
            return false;
        }
        long j12 = 0;
        if (j11 == 0) {
            return true;
        }
        j jVar = this.f39640a;
        j jVar2 = bVar.f39640a;
        int i11 = jVar.f39662b;
        int i12 = jVar2.f39662b;
        while (j12 < this.f39641b) {
            long min = Math.min(jVar.f39663c - i11, jVar2.f39663c - i12);
            int i13 = 0;
            while (i13 < min) {
                int i14 = i11 + 1;
                int i15 = i12 + 1;
                if (jVar.f39661a[i11] != jVar2.f39661a[i12]) {
                    return false;
                }
                i13++;
                i11 = i14;
                i12 = i15;
            }
            if (i11 == jVar.f39663c) {
                jVar = jVar.f39666f;
                i11 = jVar.f39662b;
            }
            if (i12 == jVar2.f39663c) {
                jVar2 = jVar2.f39666f;
                i12 = jVar2.f39662b;
            }
            j12 += min;
        }
        return true;
    }

    public byte f() {
        long j11 = this.f39641b;
        if (j11 == 0) {
            throw new IllegalStateException("size == 0");
        }
        j jVar = this.f39640a;
        int i11 = jVar.f39662b;
        int i12 = jVar.f39663c;
        int i13 = i11 + 1;
        byte b11 = jVar.f39661a[i11];
        this.f39641b = j11 - 1;
        if (i13 != i12) {
            jVar.f39662b = i13;
            return b11;
        }
        this.f39640a = jVar.a();
        k.a(jVar);
        return b11;
    }

    public e g() {
        return new e(i());
    }

    @Override // com.meizu.cloud.pushsdk.c.g.d
    public String h() {
        try {
            return a(this.f39641b, o.f39673a);
        } catch (EOFException e11) {
            throw new AssertionError(e11);
        }
    }

    public int hashCode() {
        j jVar = this.f39640a;
        if (jVar == null) {
            return 0;
        }
        int i11 = 1;
        do {
            int i12 = jVar.f39663c;
            for (int i13 = jVar.f39662b; i13 < i12; i13++) {
                i11 = (i11 * 31) + jVar.f39661a[i13];
            }
            jVar = jVar.f39666f;
        } while (jVar != this.f39640a);
        return i11;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.d
    public byte[] i() {
        try {
            return a(this.f39641b);
        } catch (EOFException e11) {
            throw new AssertionError(e11);
        }
    }

    public void j() {
        try {
            b(this.f39641b);
        } catch (EOFException e11) {
            throw new AssertionError(e11);
        }
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b clone() {
        b bVar = new b();
        if (this.f39641b == 0) {
            return bVar;
        }
        j jVar = new j(this.f39640a);
        bVar.f39640a = jVar;
        jVar.f39667g = jVar;
        jVar.f39666f = jVar;
        j jVar2 = this.f39640a;
        while (true) {
            jVar2 = jVar2.f39666f;
            if (jVar2 == this.f39640a) {
                bVar.f39641b = this.f39641b;
                return bVar;
            }
            bVar.f39640a.f39667g.a(new j(jVar2));
        }
    }

    public String toString() {
        long j11 = this.f39641b;
        if (j11 == 0) {
            return "Buffer[size=0]";
        }
        if (j11 <= 16) {
            return String.format("Buffer[size=%s data=%s]", Long.valueOf(this.f39641b), clone().g().c());
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            j jVar = this.f39640a;
            byte[] bArr = jVar.f39661a;
            int i11 = jVar.f39662b;
            messageDigest.update(bArr, i11, jVar.f39663c - i11);
            j jVar2 = this.f39640a;
            while (true) {
                jVar2 = jVar2.f39666f;
                if (jVar2 == this.f39640a) {
                    return String.format("Buffer[size=%s md5=%s]", Long.valueOf(this.f39641b), e.a(messageDigest.digest()).c());
                }
                byte[] bArr2 = jVar2.f39661a;
                int i12 = jVar2.f39662b;
                messageDigest.update(bArr2, i12, jVar2.f39663c - i12);
            }
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public long a() {
        return this.f39641b;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public b b() {
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.d
    public InputStream d() {
        return new InputStream() { // from class: com.meizu.cloud.pushsdk.c.g.b.1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(b.this.f39641b, SieveCacheKt.NodeLinkMask);
            }

            @Override // java.io.InputStream
            public int read() {
                b bVar = b.this;
                if (bVar.f39641b > 0) {
                    return bVar.f() & 255;
                }
                return -1;
            }

            public String toString() {
                return b.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(@NonNull byte[] bArr, int i11, int i12) {
                return b.this.a(bArr, i11, i12);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        };
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public long a(m mVar) throws IOException {
        if (mVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j11 = 0;
        while (true) {
            long b11 = mVar.b(this, 2048L);
            if (b11 == -1) {
                return j11;
            }
            j11 += b11;
        }
    }

    public b b(int i11) {
        j c11 = c(1);
        byte[] bArr = c11.f39661a;
        int i12 = c11.f39663c;
        c11.f39663c = i12 + 1;
        bArr[i12] = (byte) i11;
        this.f39641b++;
        return this;
    }

    public b a(int i11) {
        int i12;
        int i13;
        if (i11 < 128) {
            b(i11);
            return this;
        }
        if (i11 < 2048) {
            i13 = (i11 >> 6) | 192;
        } else {
            if (i11 < 65536) {
                if (i11 >= 55296 && i11 <= 57343) {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i11));
                }
                i12 = (i11 >> 12) | 224;
            } else {
                if (i11 > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i11));
                }
                b((i11 >> 18) | 240);
                i12 = ((i11 >> 12) & 63) | 128;
            }
            b(i12);
            i13 = ((i11 >> 6) & 63) | 128;
        }
        b(i13);
        b((i11 & 63) | 128);
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b c(byte[] bArr) {
        if (bArr != null) {
            return c(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public j c(int i11) {
        if (i11 < 1 || i11 > 2048) {
            throw new IllegalArgumentException();
        }
        j jVar = this.f39640a;
        if (jVar != null) {
            j jVar2 = jVar.f39667g;
            return (jVar2.f39663c + i11 > 2048 || !jVar2.f39665e) ? jVar2.a(k.a()) : jVar2;
        }
        j a11 = k.a();
        this.f39640a = a11;
        a11.f39667g = a11;
        a11.f39666f = a11;
        return a11;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b b(e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        eVar.a(this);
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b c(byte[] bArr, int i11, int i12) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j11 = i12;
        o.a(bArr.length, i11, j11);
        int i13 = i12 + i11;
        while (i11 < i13) {
            j c11 = c(1);
            int min = Math.min(i13 - i11, 2048 - c11.f39663c);
            System.arraycopy(bArr, i11, c11.f39661a, c11.f39663c, min);
            i11 += min;
            c11.f39663c += min;
        }
        this.f39641b += j11;
        return this;
    }

    public boolean c() {
        return this.f39641b == 0;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b b(String str) {
        return a(str, 0, str.length());
    }

    public b a(String str, int i11, int i12) {
        int i13;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i11 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i11);
        }
        if (i12 < i11) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i12 + " < " + i11);
        }
        if (i12 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i12 + " > " + str.length());
        }
        while (i11 < i12) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                j c11 = c(1);
                byte[] bArr = c11.f39661a;
                int i14 = c11.f39663c - i11;
                int min = Math.min(i12, 2048 - i14);
                int i15 = i11 + 1;
                bArr[i11 + i14] = (byte) charAt;
                while (i15 < min) {
                    char charAt2 = str.charAt(i15);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i15 + i14] = (byte) charAt2;
                    i15++;
                }
                int i16 = c11.f39663c;
                int i17 = (i14 + i15) - i16;
                c11.f39663c = i16 + i17;
                this.f39641b += i17;
                i11 = i15;
            } else {
                if (charAt < 2048) {
                    i13 = (charAt >> 6) | 192;
                } else if (charAt < 55296 || charAt > 57343) {
                    b((charAt >> '\f') | 224);
                    i13 = ((charAt >> 6) & 63) | 128;
                } else {
                    int i18 = i11 + 1;
                    char charAt3 = i18 < i12 ? str.charAt(i18) : (char) 0;
                    if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        b(63);
                        i11 = i18;
                    } else {
                        int i19 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                        b((i19 >> 18) | 240);
                        b(((i19 >> 12) & 63) | 128);
                        b(((i19 >> 6) & 63) | 128);
                        b((i19 & 63) | 128);
                        i11 += 2;
                    }
                }
                b(i13);
                b((charAt & s60.d.f88057a) | 128);
                i11++;
            }
        }
        return this;
    }

    public String a(long j11, Charset charset) throws EOFException {
        o.a(this.f39641b, 0L, j11);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j11 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j11);
        }
        if (j11 == 0) {
            return "";
        }
        j jVar = this.f39640a;
        int i11 = jVar.f39662b;
        if (i11 + j11 > jVar.f39663c) {
            return new String(a(j11), charset);
        }
        String str = new String(jVar.f39661a, i11, (int) j11, charset);
        int i12 = (int) (jVar.f39662b + j11);
        jVar.f39662b = i12;
        this.f39641b -= j11;
        if (i12 == jVar.f39663c) {
            this.f39640a = jVar.a();
            k.a(jVar);
        }
        return str;
    }

    public void b(long j11) throws EOFException {
        while (j11 > 0) {
            if (this.f39640a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j11, r0.f39663c - r0.f39662b);
            long j12 = min;
            this.f39641b -= j12;
            j11 -= j12;
            j jVar = this.f39640a;
            int i11 = jVar.f39662b + min;
            jVar.f39662b = i11;
            if (i11 == jVar.f39663c) {
                this.f39640a = jVar.a();
                k.a(jVar);
            }
        }
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l
    public void a(b bVar, long j11) {
        if (bVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (bVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        o.a(bVar.f39641b, 0L, j11);
        while (j11 > 0) {
            j jVar = bVar.f39640a;
            if (j11 < jVar.f39663c - jVar.f39662b) {
                j jVar2 = this.f39640a;
                j jVar3 = jVar2 != null ? jVar2.f39667g : null;
                if (jVar3 != null && jVar3.f39665e) {
                    if ((jVar3.f39663c + j11) - (jVar3.f39664d ? 0 : jVar3.f39662b) <= 2048) {
                        jVar.a(jVar3, (int) j11);
                        bVar.f39641b -= j11;
                        this.f39641b += j11;
                        return;
                    }
                }
                bVar.f39640a = jVar.a((int) j11);
            }
            j jVar4 = bVar.f39640a;
            long j12 = jVar4.f39663c - jVar4.f39662b;
            bVar.f39640a = jVar4.a();
            j jVar5 = this.f39640a;
            if (jVar5 == null) {
                this.f39640a = jVar4;
                jVar4.f39667g = jVar4;
                jVar4.f39666f = jVar4;
            } else {
                jVar5.f39667g.a(jVar4).b();
            }
            bVar.f39641b -= j12;
            this.f39641b += j12;
            j11 -= j12;
        }
    }

    public void a(byte[] bArr) throws EOFException {
        int i11 = 0;
        while (i11 < bArr.length) {
            int a11 = a(bArr, i11, bArr.length - i11);
            if (a11 == -1) {
                throw new EOFException();
            }
            i11 += a11;
        }
    }

    public byte[] a(long j11) throws EOFException {
        o.a(this.f39641b, 0L, j11);
        if (j11 <= SieveCacheKt.NodeLinkMask) {
            byte[] bArr = new byte[(int) j11];
            a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j11);
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.c.g.m
    public void close() {
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Flushable
    public void flush() {
    }
}
