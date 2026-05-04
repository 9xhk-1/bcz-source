package com.meizu.cloud.pushsdk.c.g;

import kx.a0;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f39637a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f39638b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, a0.f68904b, s60.b.f88049h};

    public static byte[] a(String str) {
        int i11;
        char charAt;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i12 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i12];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            char charAt2 = str.charAt(i16);
            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                i11 = charAt2 - 'A';
            } else if (charAt2 >= 'a' && charAt2 <= 'z') {
                i11 = charAt2 - 'G';
            } else if (charAt2 >= '0' && charAt2 <= '9') {
                i11 = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i11 = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i11 = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i14 = (i14 << 6) | ((byte) i11);
            i13++;
            if (i13 % 4 == 0) {
                bArr[i15] = (byte) (i14 >> 16);
                int i17 = i15 + 2;
                bArr[i15 + 1] = (byte) (i14 >> 8);
                i15 += 3;
                bArr[i17] = (byte) i14;
            }
        }
        int i18 = i13 % 4;
        if (i18 == 1) {
            return null;
        }
        if (i18 == 2) {
            bArr[i15] = (byte) ((i14 << 12) >> 16);
            i15++;
        } else if (i18 == 3) {
            int i19 = i14 << 6;
            int i21 = i15 + 1;
            bArr[i15] = (byte) (i19 >> 16);
            i15 += 2;
            bArr[i21] = (byte) (i19 >> 8);
        }
        if (i15 == i12) {
            return bArr;
        }
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, 0, bArr2, 0, i15);
        return bArr2;
    }
}
