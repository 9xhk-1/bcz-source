package com.getui.gtc.a.a;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f29683a = true;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f29684a;

        /* renamed from: b, reason: collision with root package name */
        public int f29685b;
    }

    public static class b extends a {

        /* renamed from: c, reason: collision with root package name */
        private static final int[] f29686c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: d, reason: collision with root package name */
        private static final int[] f29687d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: e, reason: collision with root package name */
        private int f29688e;

        /* renamed from: f, reason: collision with root package name */
        private int f29689f;

        /* renamed from: g, reason: collision with root package name */
        private final int[] f29690g;

        public b(byte[] bArr) {
            this.f29684a = bArr;
            this.f29690g = f29686c;
            this.f29688e = 0;
            this.f29689f = 0;
        }

        public final boolean a(byte[] bArr, int i11) {
            int i12 = this.f29688e;
            if (i12 == 6) {
                return false;
            }
            int i13 = this.f29689f;
            byte[] bArr2 = this.f29684a;
            int[] iArr = this.f29690g;
            int i14 = 0;
            int i15 = 0;
            while (i14 < i11) {
                if (i12 == 0) {
                    while (true) {
                        int i16 = i14 + 4;
                        if (i16 > i11 || (i13 = (iArr[bArr[i14] & 255] << 18) | (iArr[bArr[i14 + 1] & 255] << 12) | (iArr[bArr[i14 + 2] & 255] << 6) | iArr[bArr[i14 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i15 + 2] = (byte) i13;
                        bArr2[i15 + 1] = (byte) (i13 >> 8);
                        bArr2[i15] = (byte) (i13 >> 16);
                        i15 += 3;
                        i14 = i16;
                    }
                    if (i14 >= i11) {
                        break;
                    }
                }
                int i17 = i14 + 1;
                int i18 = iArr[bArr[i14] & 255];
                if (i12 != 0) {
                    if (i12 == 1) {
                        if (i18 < 0) {
                            if (i18 != -1) {
                                this.f29688e = 6;
                                return false;
                            }
                        }
                        i13 = (i13 << 6) | i18;
                    } else if (i12 == 2) {
                        if (i18 < 0) {
                            if (i18 == -2) {
                                bArr2[i15] = (byte) (i13 >> 4);
                                i15++;
                                i12 = 4;
                            } else if (i18 != -1) {
                                this.f29688e = 6;
                                return false;
                            }
                        }
                        i13 = (i13 << 6) | i18;
                    } else if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5 && i18 != -1) {
                                this.f29688e = 6;
                                return false;
                            }
                        } else if (i18 != -2) {
                            if (i18 != -1) {
                                this.f29688e = 6;
                                return false;
                            }
                        }
                    } else if (i18 >= 0) {
                        i13 = (i13 << 6) | i18;
                        bArr2[i15 + 2] = (byte) i13;
                        bArr2[i15 + 1] = (byte) (i13 >> 8);
                        bArr2[i15] = (byte) (i13 >> 16);
                        i15 += 3;
                        i12 = 0;
                    } else if (i18 == -2) {
                        bArr2[i15 + 1] = (byte) (i13 >> 2);
                        bArr2[i15] = (byte) (i13 >> 10);
                        i15 += 2;
                        i12 = 5;
                    } else if (i18 != -1) {
                        this.f29688e = 6;
                        return false;
                    }
                    i12++;
                } else if (i18 >= 0) {
                    i12++;
                    i13 = i18;
                } else if (i18 != -1) {
                    this.f29688e = 6;
                    return false;
                }
                i14 = i17;
            }
            if (i12 == 1) {
                this.f29688e = 6;
                return false;
            }
            if (i12 == 2) {
                bArr2[i15] = (byte) (i13 >> 4);
                i15++;
            } else if (i12 == 3) {
                int i19 = i15 + 1;
                bArr2[i15] = (byte) (i13 >> 10);
                i15 += 2;
                bArr2[i19] = (byte) (i13 >> 2);
            } else if (i12 == 4) {
                this.f29688e = 6;
                return false;
            }
            this.f29688e = i12;
            this.f29685b = i15;
            return true;
        }
    }

    private c() {
    }

    public static String a(byte[] bArr, int i11) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        while (i11 < bArr.length) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < 3 && i11 < bArr.length) {
                i14 |= (bArr[i11] & 255) << (16 - (i13 << 3));
                i13++;
                i11++;
            }
            if (i12 == 102400) {
                sb2.append("\r\n");
                i12 = 0;
            }
            char charAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i14 << 8) >>> 26);
            char charAt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i14 << 14) >>> 26);
            char c11 = '=';
            char charAt3 = i13 < 2 ? '=' : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i14 << 20) >>> 26);
            if (i13 >= 3) {
                c11 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i14 << 26) >>> 26);
            }
            sb2.append(charAt);
            sb2.append(charAt2);
            sb2.append(charAt3);
            sb2.append(c11);
            i12 += 4;
        }
        return sb2.toString();
    }

    private static byte[] b(byte[] bArr, int i11) {
        b bVar = new b(new byte[(i11 * 3) / 4]);
        if (!bVar.a(bArr, i11)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i12 = bVar.f29685b;
        byte[] bArr2 = bVar.f29684a;
        if (i12 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i12];
        System.arraycopy(bArr2, 0, bArr3, 0, i12);
        return bArr3;
    }

    public static byte[] a(String str) {
        byte[] bytes = str.getBytes();
        return b(bytes, bytes.length);
    }

    public static byte[] a(byte[] bArr) {
        return b(bArr, bArr.length);
    }
}
