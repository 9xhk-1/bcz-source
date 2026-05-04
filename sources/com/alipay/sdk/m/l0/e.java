package com.alipay.sdk.m.l0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int[] f10773a;

        /* renamed from: b, reason: collision with root package name */
        public int f10774b;

        /* renamed from: c, reason: collision with root package name */
        public int f10775c;

        public b() {
            this.f10773a = new int[256];
        }
    }

    public static byte[] a(byte[] bArr) {
        b a11;
        if (bArr == null || (a11 = a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) == null) {
            return null;
        }
        return a(bArr, a11);
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        b bVar = new b();
        for (int i11 = 0; i11 < 256; i11++) {
            bVar.f10773a[i11] = i11;
        }
        bVar.f10774b = 0;
        bVar.f10775c = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < 256; i14++) {
            try {
                char charAt = str.charAt(i12);
                int[] iArr = bVar.f10773a;
                int i15 = iArr[i14];
                i13 = ((charAt + i15) + i13) % 256;
                iArr[i14] = iArr[i13];
                iArr[i13] = i15;
                i12 = (i12 + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return bVar;
    }

    public static byte[] a(byte[] bArr, b bVar) {
        if (bArr == null || bVar == null) {
            return null;
        }
        int i11 = bVar.f10774b;
        int i12 = bVar.f10775c;
        for (int i13 = 0; i13 < bArr.length; i13++) {
            i11 = (i11 + 1) % 256;
            int[] iArr = bVar.f10773a;
            int i14 = iArr[i11];
            i12 = (i12 + i14) % 256;
            iArr[i11] = iArr[i12];
            iArr[i12] = i14;
            int i15 = (iArr[i11] + i14) % 256;
            bArr[i13] = (byte) (iArr[i15] ^ bArr[i13]);
        }
        bVar.f10774b = i11;
        bVar.f10775c = i12;
        return bArr;
    }
}
