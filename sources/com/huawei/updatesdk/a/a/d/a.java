package com.huawei.updatesdk.a.a.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f36810a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', '='};

    public static String a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    public static String a(byte[] bArr, int i11) {
        boolean z11;
        char[] cArr = new char[((i11 + 2) / 3) * 4];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = (bArr[i12] & 255) << 8;
            int i15 = i12 + 1;
            boolean z12 = true;
            if (i15 < i11) {
                i14 |= bArr[i15] & 255;
                z11 = true;
            } else {
                z11 = false;
            }
            int i16 = i14 << 8;
            int i17 = i12 + 2;
            if (i17 < i11) {
                i16 |= bArr[i17] & 255;
            } else {
                z12 = false;
            }
            int i18 = i13 + 3;
            char[] cArr2 = f36810a;
            int i19 = 64;
            cArr[i18] = cArr2[z12 ? i16 & 63 : 64];
            int i21 = i16 >> 6;
            int i22 = i13 + 2;
            if (z11) {
                i19 = i21 & 63;
            }
            cArr[i22] = cArr2[i19];
            cArr[i13 + 1] = cArr2[(i16 >> 12) & 63];
            cArr[i13] = cArr2[(i16 >> 18) & 63];
            i12 += 3;
            i13 += 4;
        }
        return String.valueOf(cArr);
    }
}
