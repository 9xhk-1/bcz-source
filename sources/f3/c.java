package f3;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public static final int f50398d = -16777216;

    /* renamed from: e, reason: collision with root package name */
    public static final int f50399e = 11;

    /* renamed from: f, reason: collision with root package name */
    public static final int f50400f = 2048;

    /* renamed from: g, reason: collision with root package name */
    public static final int f50401g = 5;

    /* renamed from: a, reason: collision with root package name */
    public int f50402a;

    /* renamed from: b, reason: collision with root package name */
    public int f50403b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f50404c;

    public static void d(short[] sArr) {
        for (int i11 = 0; i11 < sArr.length; i11++) {
            sArr[i11] = 1024;
        }
    }

    public int a(short[] sArr, int i11) throws IOException {
        short s11 = sArr[i11];
        int i12 = this.f50402a;
        int i13 = (i12 >>> 11) * s11;
        int i14 = this.f50403b;
        if ((i14 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i13)) {
            this.f50402a = i13;
            sArr[i11] = (short) (s11 + ((2048 - s11) >>> 5));
            if ((i13 & (-16777216)) != 0) {
                return 0;
            }
            this.f50403b = (i14 << 8) | this.f50404c.read();
            this.f50402a <<= 8;
            return 0;
        }
        int i15 = i12 - i13;
        this.f50402a = i15;
        int i16 = i14 - i13;
        this.f50403b = i16;
        sArr[i11] = (short) (s11 - (s11 >>> 5));
        if ((i15 & (-16777216)) != 0) {
            return 1;
        }
        this.f50403b = (i16 << 8) | this.f50404c.read();
        this.f50402a <<= 8;
        return 1;
    }

    public final int b(int i11) throws IOException {
        int i12 = 0;
        while (i11 != 0) {
            int i13 = this.f50402a >>> 1;
            this.f50402a = i13;
            int i14 = this.f50403b;
            int i15 = (i14 - i13) >>> 31;
            int i16 = i14 - ((i15 - 1) & i13);
            this.f50403b = i16;
            i12 = (i12 << 1) | (1 - i15);
            if ((i13 & (-16777216)) == 0) {
                this.f50403b = (i16 << 8) | this.f50404c.read();
                this.f50402a <<= 8;
            }
            i11--;
        }
        return i12;
    }

    public final void c() throws IOException {
        this.f50403b = 0;
        this.f50402a = -1;
        for (int i11 = 0; i11 < 5; i11++) {
            this.f50403b = (this.f50403b << 8) | this.f50404c.read();
        }
    }

    public final void e() {
        this.f50404c = null;
    }

    public final void f(InputStream inputStream) {
        this.f50404c = inputStream;
    }
}
