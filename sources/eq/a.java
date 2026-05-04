package eq;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b[] f50059a;

    /* renamed from: b, reason: collision with root package name */
    public int f50060b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50061c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50062d;

    public a(int i11, int i12) {
        b[] bVarArr = new b[i11];
        this.f50059a = bVarArr;
        int length = bVarArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            this.f50059a[i13] = new b(((i12 + 4) * 17) + 1);
        }
        this.f50062d = i12 * 17;
        this.f50061c = i11;
        this.f50060b = -1;
    }

    public b a() {
        return this.f50059a[this.f50060b];
    }

    public byte[][] b() {
        return c(1, 1);
    }

    public byte[][] c(int i11, int i12) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f50061c * i12, this.f50062d * i11);
        int i13 = this.f50061c * i12;
        for (int i14 = 0; i14 < i13; i14++) {
            bArr[(i13 - i14) - 1] = this.f50059a[i14 / i12].b(i11);
        }
        return bArr;
    }

    public void d(int i11, int i12, byte b11) {
        this.f50059a[i12].c(i11, b11);
    }

    public void e() {
        this.f50060b++;
    }
}
