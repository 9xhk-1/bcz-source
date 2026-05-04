package iq;

import com.bumptech.glide.load.engine.GlideException;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f62669a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62670b;

    /* renamed from: c, reason: collision with root package name */
    public final int f62671c;

    public b(int i11, int i12) {
        this.f62669a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i12, i11);
        this.f62670b = i11;
        this.f62671c = i12;
    }

    public void a(byte b11) {
        for (byte[] bArr : this.f62669a) {
            Arrays.fill(bArr, b11);
        }
    }

    public byte b(int i11, int i12) {
        return this.f62669a[i12][i11];
    }

    public byte[][] c() {
        return this.f62669a;
    }

    public int d() {
        return this.f62671c;
    }

    public int e() {
        return this.f62670b;
    }

    public void f(int i11, int i12, byte b11) {
        this.f62669a[i12][i11] = b11;
    }

    public void g(int i11, int i12, int i13) {
        this.f62669a[i12][i11] = (byte) i13;
    }

    public void h(int i11, int i12, boolean z11) {
        this.f62669a[i12][i11] = z11 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f62670b * 2 * this.f62671c) + 2);
        for (int i11 = 0; i11 < this.f62671c; i11++) {
            byte[] bArr = this.f62669a[i11];
            for (int i12 = 0; i12 < this.f62670b; i12++) {
                byte b11 = bArr[i12];
                if (b11 == 0) {
                    sb2.append(" 0");
                } else if (b11 != 1) {
                    sb2.append(GlideException.a.f28776d);
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
