package gq;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import gq.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f53993a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f53994b;

    public b(int i11, byte[] bArr) {
        this.f53993a = i11;
        this.f53994b = bArr;
    }

    public static b[] b(byte[] bArr, h hVar, ErrorCorrectionLevel errorCorrectionLevel) {
        if (bArr.length != hVar.h()) {
            throw new IllegalArgumentException();
        }
        h.b f11 = hVar.f(errorCorrectionLevel);
        h.a[] a11 = f11.a();
        int i11 = 0;
        for (h.a aVar : a11) {
            i11 += aVar.a();
        }
        b[] bVarArr = new b[i11];
        int i12 = 0;
        for (h.a aVar2 : a11) {
            int i13 = 0;
            while (i13 < aVar2.a()) {
                int b11 = aVar2.b();
                bVarArr[i12] = new b(b11, new byte[f11.b() + b11]);
                i13++;
                i12++;
            }
        }
        int length = bVarArr[0].f53994b.length;
        int i14 = i11 - 1;
        while (i14 >= 0 && bVarArr[i14].f53994b.length != length) {
            i14--;
        }
        int i15 = i14 + 1;
        int b12 = length - f11.b();
        int i16 = 0;
        for (int i17 = 0; i17 < b12; i17++) {
            int i18 = 0;
            while (i18 < i12) {
                bVarArr[i18].f53994b[i17] = bArr[i16];
                i18++;
                i16++;
            }
        }
        int i19 = i15;
        while (i19 < i12) {
            bVarArr[i19].f53994b[b12] = bArr[i16];
            i19++;
            i16++;
        }
        int length2 = bVarArr[0].f53994b.length;
        while (b12 < length2) {
            int i21 = 0;
            while (i21 < i12) {
                bVarArr[i21].f53994b[i21 < i15 ? b12 : b12 + 1] = bArr[i16];
                i21++;
                i16++;
            }
            b12++;
        }
        return bVarArr;
    }

    public byte[] a() {
        return this.f53994b;
    }

    public int c() {
        return this.f53993a;
    }
}
