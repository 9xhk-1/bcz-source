package cn.com.chinatelecom.account.api.a;

import java.io.UnsupportedEncodingException;
import kx.a0;
import s60.e;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f8843a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f8844b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, ho.c.f59556u, 19, 20, ho.c.f59560y, ho.c.f59561z, ho.c.A, ho.c.B, ho.c.C, -1, -1, -1, -1, -1, -1, ho.c.D, ho.c.E, 28, ho.c.G, ho.c.H, 31, 32, 33, 34, 35, 36, e.f88061c, 38, 39, 40, 41, 42, 43, 44, a0.f68904b, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static byte[] a(String str) {
        try {
            return b(str);
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return new byte[0];
        }
    }

    private static byte[] b(String str) {
        int i11;
        byte b11;
        int i12;
        byte b12;
        int i13;
        byte b13;
        int i14;
        byte b14;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bytes = str.getBytes("US-ASCII");
        int length = bytes.length;
        int i15 = 0;
        loop0: while (i15 < length) {
            while (true) {
                i11 = i15 + 1;
                b11 = f8844b[bytes[i15]];
                if (i11 >= length || b11 != -1) {
                    break;
                }
                i15 = i11;
            }
            if (b11 == -1) {
                break;
            }
            while (true) {
                i12 = i11 + 1;
                b12 = f8844b[bytes[i11]];
                if (i12 >= length || b12 != -1) {
                    break;
                }
                i11 = i12;
            }
            if (b12 == -1) {
                break;
            }
            stringBuffer.append((char) ((b11 << 2) | ((b12 & 48) >>> 4)));
            while (true) {
                i13 = i12 + 1;
                byte b15 = bytes[i12];
                if (b15 == 61) {
                    break loop0;
                }
                b13 = f8844b[b15];
                if (i13 >= length || b13 != -1) {
                    break;
                }
                i12 = i13;
            }
            if (b13 == -1) {
                break;
            }
            stringBuffer.append((char) (((b12 & 15) << 4) | ((b13 & 60) >>> 2)));
            while (true) {
                i14 = i13 + 1;
                byte b16 = bytes[i13];
                if (b16 == 61) {
                    break loop0;
                }
                b14 = f8844b[b16];
                if (i14 >= length || b14 != -1) {
                    break;
                }
                i13 = i14;
            }
            if (b14 == -1) {
                break;
            }
            stringBuffer.append((char) (b14 | ((b13 & 3) << 6)));
            i15 = i14;
        }
        return stringBuffer.toString().getBytes("iso8859-1");
    }
}
