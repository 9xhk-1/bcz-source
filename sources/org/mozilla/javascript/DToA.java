package org.mozilla.javascript;

import java.math.BigInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class DToA {
    private static final int Bias = 1023;
    private static final int Bletch = 16;
    private static final int Bndry_mask = 1048575;
    static final int DTOSTR_EXPONENTIAL = 3;
    static final int DTOSTR_FIXED = 2;
    static final int DTOSTR_PRECISION = 4;
    static final int DTOSTR_STANDARD = 0;
    static final int DTOSTR_STANDARD_EXPONENTIAL = 1;
    private static final int Exp_11 = 1072693248;
    private static final int Exp_mask = 2146435072;
    private static final int Exp_mask_shifted = 2047;
    private static final int Exp_msk1 = 1048576;
    private static final long Exp_msk1L = 4503599627370496L;
    private static final int Exp_shift = 20;
    private static final int Exp_shift1 = 20;
    private static final int Exp_shiftL = 52;
    private static final int Frac_mask = 1048575;
    private static final int Frac_mask1 = 1048575;
    private static final long Frac_maskL = 4503599627370495L;
    private static final int Int_max = 14;
    private static final int Log2P = 1;
    private static final int P = 53;
    private static final int Quick_max = 14;
    private static final int Sign_bit = Integer.MIN_VALUE;
    private static final int Ten_pmax = 22;
    private static final int n_bigtens = 5;
    private static final double[] tens = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
    private static final double[] bigtens = {1.0E16d, 1.0E32d, 1.0E64d, 1.0E128d, 1.0E256d};
    private static final int[] dtoaModes = {0, 0, 3, 2, 2};

    private static char BASEDIGIT(int i11) {
        return (char) (i11 >= 10 ? i11 + 87 : i11 + 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x05f1, code lost:
    
        if (r13 <= 0) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x05f3, code lost:
    
        r2 = r8.shiftLeft(1).compareTo(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x05fc, code lost:
    
        if (r2 > 0) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x05fe, code lost:
    
        if (r2 != 0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0602, code lost:
    
        if ((r3 & 1) == 1) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0604, code lost:
    
        if (r49 == false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0609, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0627, code lost:
    
        r52.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x062b, code lost:
    
        return r9 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x060b, code lost:
    
        r0 = (char) (r3 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0610, code lost:
    
        if (r3 != '9') goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0612, code lost:
    
        r52.append('9');
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0619, code lost:
    
        if (roundOff(r52) == false) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x061b, code lost:
    
        r9 = r9 + 1;
        r52.append('1');
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0624, code lost:
    
        return r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0625, code lost:
    
        r2 = 1;
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0607, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0650 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int JS_dtoa(double r46, int r48, boolean r49, int r50, boolean[] r51, java.lang.StringBuilder r52) {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.DToA.JS_dtoa(double, int, boolean, int, boolean[], java.lang.StringBuilder):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
    
        if (r7 > 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
    
        if (r8 > 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0132, code lost:
    
        if (r6.compareTo(r3) > 0) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143 A[LOOP:0: B:40:0x00d9->B:53:0x0143, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String JS_dtobasestr(int r12, double r13) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.DToA.JS_dtobasestr(int, double):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0045, code lost:
    
        if (r10 <= r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void JS_dtostr(java.lang.StringBuilder r10, int r11, int r12, double r13) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.DToA.JS_dtostr(java.lang.StringBuilder, int, int, double):void");
    }

    private static BigInteger d2b(double d11, int[] iArr, int[] iArr2) {
        byte[] bArr;
        int i11;
        long doubleToLongBits = Double.doubleToLongBits(d11);
        int i12 = (int) (doubleToLongBits >>> 32);
        int i13 = (int) doubleToLongBits;
        int i14 = 1048575 & i12;
        int i15 = (i12 & Integer.MAX_VALUE) >>> 20;
        if (i15 != 0) {
            i14 |= 1048576;
        }
        int i16 = 1;
        if (i13 != 0) {
            bArr = new byte[8];
            i11 = lo0bits(i13);
            int i17 = i13 >>> i11;
            if (i11 != 0) {
                stuffBits(bArr, 4, i17 | (i14 << (32 - i11)));
                i14 >>= i11;
            } else {
                stuffBits(bArr, 4, i17);
            }
            stuffBits(bArr, 0, i14);
            if (i14 != 0) {
                i16 = 2;
            }
        } else {
            bArr = new byte[4];
            int lo0bits = lo0bits(i14);
            i14 >>>= lo0bits;
            stuffBits(bArr, 0, i14);
            i11 = lo0bits + 32;
        }
        if (i15 != 0) {
            iArr[0] = (i15 - 1075) + i11;
            iArr2[0] = 53 - i11;
        } else {
            iArr[0] = (i15 - 1074) + i11;
            iArr2[0] = (i16 * 32) - hi0bits(i14);
        }
        return new BigInteger(bArr);
    }

    private static int hi0bits(int i11) {
        int i12;
        if (((-65536) & i11) == 0) {
            i11 <<= 16;
            i12 = 16;
        } else {
            i12 = 0;
        }
        if (((-16777216) & i11) == 0) {
            i12 += 8;
            i11 <<= 8;
        }
        if (((-268435456) & i11) == 0) {
            i12 += 4;
            i11 <<= 4;
        }
        if (((-1073741824) & i11) == 0) {
            i12 += 2;
            i11 <<= 2;
        }
        if ((Integer.MIN_VALUE & i11) == 0) {
            i12++;
            if ((i11 & 1073741824) == 0) {
                return 32;
            }
        }
        return i12;
    }

    private static int lo0bits(int i11) {
        int i12 = 0;
        if ((i11 & 7) != 0) {
            if ((i11 & 1) != 0) {
                return 0;
            }
            return (i11 & 2) != 0 ? 1 : 2;
        }
        if ((65535 & i11) == 0) {
            i11 >>>= 16;
            i12 = 16;
        }
        if ((i11 & 255) == 0) {
            i12 += 8;
            i11 >>>= 8;
        }
        if ((i11 & 15) == 0) {
            i12 += 4;
            i11 >>>= 4;
        }
        if ((i11 & 3) == 0) {
            i12 += 2;
            i11 >>>= 2;
        }
        if ((i11 & 1) == 0) {
            i12++;
            if (((i11 >>> 1) & 1) == 0) {
                return 32;
            }
        }
        return i12;
    }

    public static BigInteger pow5mult(BigInteger bigInteger, int i11) {
        return bigInteger.multiply(BigInteger.valueOf(5L).pow(i11));
    }

    public static boolean roundOff(StringBuilder sb2) {
        int length = sb2.length();
        while (length != 0) {
            int i11 = length - 1;
            char charAt = sb2.charAt(i11);
            if (charAt != '9') {
                sb2.setCharAt(i11, (char) (charAt + 1));
                sb2.setLength(length);
                return false;
            }
            length = i11;
        }
        sb2.setLength(0);
        return true;
    }

    public static double setWord0(double d11, int i11) {
        return Double.longBitsToDouble((Double.doubleToLongBits(d11) & 4294967295L) | (i11 << 32));
    }

    private static void stripTrailingZeroes(StringBuilder sb2) {
        int length = sb2.length();
        while (true) {
            int i11 = length - 1;
            if (length <= 0 || sb2.charAt(i11) != '0') {
                break;
            } else {
                length = i11;
            }
        }
        sb2.setLength(length);
    }

    private static void stuffBits(byte[] bArr, int i11, int i12) {
        bArr[i11] = (byte) (i12 >> 24);
        bArr[i11 + 1] = (byte) (i12 >> 16);
        bArr[i11 + 2] = (byte) (i12 >> 8);
        bArr[i11 + 3] = (byte) i12;
    }

    public static int word0(double d11) {
        return (int) (Double.doubleToLongBits(d11) >> 32);
    }

    public static int word1(double d11) {
        return (int) Double.doubleToLongBits(d11);
    }
}
