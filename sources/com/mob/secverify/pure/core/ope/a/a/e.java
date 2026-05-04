package com.mob.secverify.pure.core.ope.a.a;

import java.io.UnsupportedEncodingException;
import kx.a0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f40851a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f40852b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, ho.c.f59556u, 19, 20, ho.c.f59560y, ho.c.f59561z, ho.c.A, ho.c.B, ho.c.C, -1, -1, -1, -1, -1, -1, ho.c.D, ho.c.E, 28, ho.c.G, ho.c.H, 31, 32, 33, 34, 35, 36, s60.e.f88061c, 38, 39, 40, 41, 42, 43, 44, a0.f68904b, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static byte[] a(String str) {
        try {
            return b(str);
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().c("[SecPure] ==>%s", th2.toString());
            return new byte[0];
        }
    }

    private static byte[] b(String str) throws UnsupportedEncodingException {
        byte b11;
        byte b12;
        byte b13;
        byte b14;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bytes = str.getBytes("US-ASCII");
        int length = bytes.length;
        int i11 = 0;
        while (i11 < length) {
            do {
                b11 = f40852b[bytes[i11]];
                i11++;
                if (i11 >= length) {
                    break;
                }
            } while (b11 == -1);
            if (b11 == -1) {
                break;
            }
            do {
                b12 = f40852b[bytes[i11]];
                i11++;
                if (i11 >= length) {
                    break;
                }
            } while (b12 == -1);
            if (b12 == -1) {
                break;
            }
            stringBuffer.append((char) ((b11 << 2) | ((b12 & 48) >>> 4)));
            do {
                byte b15 = bytes[i11];
                i11++;
                if (b15 != 61) {
                    b13 = f40852b[b15];
                    if (i11 >= length) {
                        break;
                    }
                } else {
                    return stringBuffer.toString().getBytes("iso8859-1");
                }
            } while (b13 == -1);
            if (b13 == -1) {
                break;
            }
            stringBuffer.append((char) (((b12 & 15) << 4) | ((b13 & 60) >>> 2)));
            do {
                byte b16 = bytes[i11];
                i11++;
                if (b16 != 61) {
                    b14 = f40852b[b16];
                    if (i11 >= length) {
                        break;
                    }
                } else {
                    return stringBuffer.toString().getBytes("iso8859-1");
                }
            } while (b14 == -1);
            if (b14 == -1) {
                break;
            }
            stringBuffer.append((char) (((b13 & 3) << 6) | b14));
        }
        return stringBuffer.toString().getBytes("iso8859-1");
    }
}
