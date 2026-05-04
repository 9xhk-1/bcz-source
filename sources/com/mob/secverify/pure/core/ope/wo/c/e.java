package com.mob.secverify.pure.core.ope.wo.c;

import com.baicizhan.main.vld.bonding.j;
import com.huawei.hms.framework.common.ContainerUtils;
import kx.a0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f41063a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f41064b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, ho.c.f59556u, 19, 20, ho.c.f59560y, ho.c.f59561z, ho.c.A, ho.c.B, ho.c.C, -1, -1, -1, -1, -1, -1, ho.c.D, ho.c.E, 28, ho.c.G, ho.c.H, 31, 32, 33, 34, 35, 36, s60.e.f88061c, 38, 39, 40, 41, 42, 43, 44, a0.f68904b, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            int i12 = i11 + 1;
            byte b11 = bArr[i11];
            int i13 = b11 & 255;
            if (i12 == length) {
                stringBuffer.append(f41063a[i13 >>> 2]);
                stringBuffer.append(f41063a[(b11 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i14 = i11 + 2;
            byte b12 = bArr[i12];
            if (i14 == length) {
                stringBuffer.append(f41063a[i13 >>> 2]);
                stringBuffer.append(f41063a[((b11 & 3) << 4) | ((b12 & 240) >>> 4)]);
                stringBuffer.append(f41063a[(b12 & 15) << 2]);
                stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                break;
            }
            i11 += 3;
            byte b13 = bArr[i14];
            stringBuffer.append(f41063a[i13 >>> 2]);
            stringBuffer.append(f41063a[((b11 & 3) << 4) | ((b12 & 240) >>> 4)]);
            stringBuffer.append(f41063a[((b12 & 15) << 2) | ((b13 & j.f25378c) >>> 6)]);
            stringBuffer.append(f41063a[b13 & 63]);
        }
        return stringBuffer.toString();
    }

    public static byte[] b(byte[] bArr) {
        return a(bArr, a(new String(b("MkYxNEQwRjU1MEQyNEYxOENCQTU1MTlGNEZBMjI2QUU="))));
    }

    private static byte[] c(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        byte[] bytes = str.getBytes();
        for (byte b11 = 0; b11 < length; b11 = (byte) (b11 + 1)) {
            int i11 = b11 * 2;
            byte b12 = bytes[i11];
            if (b12 >= 48 && b12 <= 57) {
                bArr[b11] = (byte) ((b12 - 48) << 4);
            } else if (b12 >= 65 && b12 <= 90) {
                bArr[b11] = (byte) ((b12 - 55) << 4);
            }
            byte b13 = bytes[i11 + 1];
            if (b13 >= 48 && b13 <= 57) {
                bArr[b11] = (byte) (bArr[b11] + ((byte) (b13 - 48)));
            } else if (b13 >= 65 && b13 <= 90) {
                bArr[b11] = (byte) (bArr[b11] + ((byte) (b13 - 55)));
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r5 != (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r1.write(((r4 & 15) << 4) | ((r5 & 60) >>> 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r4 = (byte) (r2 + 1);
        r2 = r8[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r2 != 61) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        r2 = com.mob.secverify.pure.core.ope.wo.c.e.f41064b[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r4 >= r0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r2 == (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r2 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        r1.write(r2 | ((r5 & 3) << 6));
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
    
        return r1.toByteArray();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(java.lang.String r8) {
        /*
            byte[] r8 = r8.getBytes()
            int r0 = r8.length
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r0)
            r2 = 0
        Lb:
            if (r2 >= r0) goto L8b
        Ld:
            byte[] r3 = com.mob.secverify.pure.core.ope.wo.c.e.f41064b
            int r4 = r2 + 1
            byte r4 = (byte) r4
            r2 = r8[r2]
            r2 = r3[r2]
            r3 = -1
            if (r4 >= r0) goto L1e
            if (r2 == r3) goto L1c
            goto L1e
        L1c:
            r2 = r4
            goto Ld
        L1e:
            if (r2 != r3) goto L22
            goto L8b
        L22:
            byte[] r5 = com.mob.secverify.pure.core.ope.wo.c.e.f41064b
            int r6 = r4 + 1
            byte r6 = (byte) r6
            r4 = r8[r4]
            r4 = r5[r4]
            if (r6 >= r0) goto L32
            if (r4 == r3) goto L30
            goto L32
        L30:
            r4 = r6
            goto L22
        L32:
            if (r4 != r3) goto L35
            goto L8b
        L35:
            int r2 = r2 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r2 = r2 | r5
            r1.write(r2)
        L3f:
            int r2 = r6 + 1
            byte r2 = (byte) r2
            r5 = r8[r6]
            r6 = 61
            if (r5 != r6) goto L4d
            byte[] r8 = r1.toByteArray()
            return r8
        L4d:
            byte[] r7 = com.mob.secverify.pure.core.ope.wo.c.e.f41064b
            r5 = r7[r5]
            if (r2 >= r0) goto L58
            if (r5 == r3) goto L56
            goto L58
        L56:
            r6 = r2
            goto L3f
        L58:
            if (r5 != r3) goto L5b
            goto L8b
        L5b:
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            r1.write(r4)
        L67:
            int r4 = r2 + 1
            byte r4 = (byte) r4
            r2 = r8[r2]
            if (r2 != r6) goto L73
            byte[] r8 = r1.toByteArray()
            return r8
        L73:
            byte[] r7 = com.mob.secverify.pure.core.ope.wo.c.e.f41064b
            r2 = r7[r2]
            if (r4 >= r0) goto L7e
            if (r2 == r3) goto L7c
            goto L7e
        L7c:
            r2 = r4
            goto L67
        L7e:
            if (r2 != r3) goto L81
            goto L8b
        L81:
            r3 = r5 & 3
            int r3 = r3 << 6
            r2 = r2 | r3
            r1.write(r2)
            r2 = r4
            goto Lb
        L8b:
            byte[] r8 = r1.toByteArray()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.wo.c.e.b(java.lang.String):byte[]");
    }

    private static byte[] a(byte[] bArr, int[] iArr) {
        return bArr.length == 0 ? bArr : a(a(a(bArr, false), iArr), false);
    }

    public static byte[] a(int[] iArr) {
        return a(a(iArr, a(new String(b("MkYxNEQwRjU1MEQyNEYxOENCQTU1MTlGNEZBMjI2QUU=")))), false);
    }

    public static int[] a(String str) {
        System.out.println("paramString= " + str);
        return a(c(str), false);
    }

    private static int[] a(byte[] bArr, boolean z11) {
        int[] iArr;
        int length = (bArr.length & 3) == 0 ? bArr.length >>> 2 : (bArr.length >>> 2) + 1;
        if (z11) {
            iArr = new int[length + 1];
            iArr[length] = bArr.length;
        } else {
            iArr = new int[length];
        }
        int length2 = bArr.length;
        for (byte b11 = 0; b11 < length2; b11 = (byte) (b11 + 1)) {
            int i11 = b11 >>> 2;
            iArr[i11] = iArr[i11] | (((bArr[b11] & 255) << (b11 & 3)) << 3);
        }
        return iArr;
    }

    public static byte[] a(int[] iArr, boolean z11) {
        int length = iArr.length << 2;
        System.out.println("i====" + length);
        if (z11) {
            int i11 = iArr[iArr.length - 1];
            System.out.println("j====" + i11);
            if (i11 > length) {
                return null;
            }
            length = i11;
        }
        byte[] bArr = new byte[length];
        for (int i12 = 0; i12 < length; i12++) {
            bArr[i12] = (byte) ((iArr[i12 >>> 2] >>> ((i12 & 3) << 3)) & 255);
        }
        return bArr;
    }

    private static int[] a(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i11 = length - 1;
        if (i11 >= 1) {
            if (iArr2.length < 4) {
                int[] iArr3 = new int[4];
                System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
                iArr2 = iArr3;
            }
            int i12 = iArr[i11];
            int i13 = iArr[0];
            for (int i14 = ((52 / length) + 6) * (-1640531527); i14 != 0; i14 -= -1640531527) {
                int i15 = (i14 >>> 2) & 3;
                int i16 = i11;
                while (i16 > 0) {
                    int i17 = iArr[i16 - 1];
                    i13 = iArr[i16] - (((i13 ^ i14) + (i17 ^ iArr2[(i16 & 3) ^ i15])) ^ (((i17 >>> 5) ^ (i13 << 2)) + ((i13 >>> 3) ^ (i17 << 4))));
                    iArr[i16] = i13;
                    i16--;
                }
                int i18 = iArr[i11];
                i13 = iArr[0] - (((i13 ^ i14) + (iArr2[i15 ^ (i16 & 3)] ^ i18)) ^ (((i18 >>> 5) ^ (i13 << 2)) + ((i13 >>> 3) ^ (i18 << 4))));
                iArr[0] = i13;
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r1 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004c, code lost:
    
        if (r1 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.io.InputStream r6) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L39 java.io.FileNotFoundException -> L3c
            r2 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L39 java.io.FileNotFoundException -> L3c
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18 java.io.FileNotFoundException -> L1a
        La:
            int r3 = r6.read(r2)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18 java.io.FileNotFoundException -> L1a
            r4 = -1
            if (r3 == r4) goto L1c
            r4 = 0
            r1.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18 java.io.FileNotFoundException -> L1a
            goto La
        L16:
            r0 = move-exception
            goto L60
        L18:
            r2 = move-exception
            goto L3f
        L1a:
            r2 = move-exception
            goto L4f
        L1c:
            r1.flush()     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18 java.io.FileNotFoundException -> L1a
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18 java.io.FileNotFoundException -> L1a
            r6.close()     // Catch: java.io.IOException -> L27
            goto L2b
        L27:
            r6 = move-exception
            r6.printStackTrace()
        L2b:
            r1.close()     // Catch: java.io.IOException -> L2f
            goto L5f
        L2f:
            r6 = move-exception
            r6.printStackTrace()
            goto L5f
        L34:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L60
        L39:
            r2 = move-exception
            r1 = r0
            goto L3f
        L3c:
            r2 = move-exception
            r1 = r0
            goto L4f
        L3f:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L16
            if (r6 == 0) goto L4c
            r6.close()     // Catch: java.io.IOException -> L48
            goto L4c
        L48:
            r6 = move-exception
            r6.printStackTrace()
        L4c:
            if (r1 == 0) goto L5f
            goto L2b
        L4f:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L16
            if (r6 == 0) goto L5c
            r6.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r6 = move-exception
            r6.printStackTrace()
        L5c:
            if (r1 == 0) goto L5f
            goto L2b
        L5f:
            return r0
        L60:
            if (r6 == 0) goto L6a
            r6.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r6 = move-exception
            r6.printStackTrace()
        L6a:
            if (r1 == 0) goto L74
            r1.close()     // Catch: java.io.IOException -> L70
            goto L74
        L70:
            r6 = move-exception
            r6.printStackTrace()
        L74:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.wo.c.e.a(java.io.InputStream):byte[]");
    }

    public static byte[] a() {
        try {
            byte[] bArr = new byte[15416];
            int[] iArr = new int[3854];
            int[] iArr2 = (int[]) com.mob.secverify.pure.core.ope.wo.a.c.a(0);
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            byte[] a11 = a(iArr);
            System.arraycopy(a11, 0, bArr, 0, a11.length);
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }
}
