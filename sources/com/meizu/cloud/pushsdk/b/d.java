package com.meizu.cloud.pushsdk.b;

import com.huawei.hms.framework.common.ContainerUtils;

/* loaded from: classes7.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f39402a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b, reason: collision with root package name */
    private static final char f39403b = (char) Integer.parseInt("00000011", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final char f39404c = (char) Integer.parseInt("00001111", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final char f39405d = (char) Integer.parseInt("00111111", 2);

    /* renamed from: e, reason: collision with root package name */
    private final String f39406e;

    /* renamed from: f, reason: collision with root package name */
    private char[] f39407f;

    /* renamed from: g, reason: collision with root package name */
    private int f39408g = 0;

    public d(String str) {
        this.f39406e = str;
        a();
    }

    public String a(byte[] bArr) {
        String str;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(((bArr.length + 2) / 3) * 4);
        int length = bArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            int i13 = bArr[i11] & 255;
            if (i12 == length) {
                sb2.append(this.f39407f[i13 >>> 2]);
                sb2.append(this.f39407f[(f39403b & i13) << 4]);
                str = "==";
            } else {
                int i14 = i11 + 2;
                int i15 = bArr[i12] & 255;
                if (i14 == length) {
                    sb2.append(this.f39407f[i13 >>> 2]);
                    sb2.append(this.f39407f[((f39403b & i13) << 4) | (i15 >>> 4)]);
                    sb2.append(this.f39407f[(f39404c & i15) << 2]);
                    str = ContainerUtils.KEY_VALUE_DELIMITER;
                } else {
                    i11 += 3;
                    int i16 = bArr[i14] & 255;
                    sb2.append(this.f39407f[i13 >>> 2]);
                    sb2.append(this.f39407f[((i13 & f39403b) << 4) | (i15 >>> 4)]);
                    sb2.append(this.f39407f[((i15 & f39404c) << 2) | (i16 >>> 6)]);
                    sb2.append(this.f39407f[f39405d & i16]);
                }
            }
            sb2.append(str);
            break;
        }
        return sb2.toString();
    }

    private void a() {
        char[] cArr = new char[f39402a.length];
        int i11 = 0;
        this.f39408g = this.f39406e.charAt(0) % '\r';
        while (true) {
            char[] cArr2 = f39402a;
            if (i11 >= cArr2.length) {
                this.f39407f = cArr;
                return;
            } else {
                cArr[i11] = cArr2[(this.f39408g + i11) % cArr2.length];
                i11++;
            }
        }
    }
}
