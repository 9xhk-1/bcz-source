package com.igexin.c.a.b;

import android.database.Cursor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f37165a = 512;

    /* renamed from: b, reason: collision with root package name */
    public static final String f37166b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    /* renamed from: c, reason: collision with root package name */
    static final char f37167c = '=';

    /* renamed from: d, reason: collision with root package name */
    public static final int f37168d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f37169e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f37170f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f37171g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f37172h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f37173i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f37174j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f37175k = 2;

    /* renamed from: l, reason: collision with root package name */
    private static final String f37176l = "IoUtil";

    /* renamed from: m, reason: collision with root package name */
    private static int[] f37177m;

    public static int a(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) ((i11 >> 24) & 255);
        bArr[i12 + 1] = (byte) ((i11 >> 16) & 255);
        bArr[i12 + 2] = (byte) ((i11 >> 8) & 255);
        bArr[i12 + 3] = (byte) (i11 & 255);
        return 4;
    }

    public static int b(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) ((i11 >> 8) & 255);
        bArr[i12 + 1] = (byte) (i11 & 255);
        return 2;
    }

    private static int c(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        return 1;
    }

    public static long d(byte[] bArr, int i11) {
        return (bArr[i11 + 7] & 255) | ((bArr[i11] & 255) << 56) | ((bArr[i11 + 1] & 255) << 48) | ((bArr[i11 + 2] & 255) << 40) | ((bArr[i11 + 3] & 255) << 32) | ((bArr[i11 + 4] & 255) << 24) | ((bArr[i11 + 5] & 255) << 16) | ((bArr[i11 + 6] & 255) << 8);
    }

    private static int e(byte[] bArr, int i11) {
        return bArr[i11] & 255;
    }

    public static int a(long j11, byte[] bArr, int i11) {
        bArr[i11] = (byte) ((j11 >> 56) & 255);
        bArr[i11 + 1] = (byte) ((j11 >> 48) & 255);
        bArr[i11 + 2] = (byte) ((j11 >> 40) & 255);
        bArr[i11 + 3] = (byte) ((j11 >> 32) & 255);
        bArr[i11 + 4] = (byte) ((j11 >> 24) & 255);
        bArr[i11 + 5] = (byte) ((j11 >> 16) & 255);
        bArr[i11 + 6] = (byte) ((j11 >> 8) & 255);
        bArr[i11 + 7] = (byte) (j11 & 255);
        return 8;
    }

    public static int b(byte[] bArr, int i11) {
        return (bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8);
    }

    public static int c(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    private static byte[] d(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayInputStream.close();
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(bArr2, 0, read);
        }
    }

    private static byte[] e(byte[] bArr) throws RuntimeException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(new a(byteArrayInputStream), byteArrayOutputStream);
            a(byteArrayInputStream);
            a(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } finally {
        }
    }

    public static int a(byte[] bArr, byte[] bArr2, int i11, int i12) {
        System.arraycopy(bArr, 0, bArr2, i11, i12);
        return i12;
    }

    private static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        a(new a(inputStream), outputStream);
    }

    public static byte[] c(byte[] bArr) throws RuntimeException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b bVar = new b(byteArrayOutputStream, 0);
            a(byteArrayInputStream, bVar);
            bVar.a();
            a(byteArrayInputStream);
            a(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } finally {
        }
    }

    private static String a(String str, String str2, String str3) {
        if (str3 == null || str == null || str2 == null) {
            return null;
        }
        if (!str3.contains(str)) {
            return str3;
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int indexOf = str3.indexOf(str);
            if (indexOf == -1) {
                sb2.append(str3);
                return sb2.toString();
            }
            sb2.append(str3.substring(0, indexOf));
            sb2.append(str2);
            str3 = str3.substring(indexOf + str.length());
        }
    }

    public static byte[] b(int i11) {
        return new byte[]{(byte) ((i11 >> 24) & 255), (byte) ((i11 >> 16) & 255), (byte) ((i11 >> 8) & 255), (byte) (i11 & 255)};
    }

    private static String a(String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        if (!strArr[0].equals("")) {
            sb2.append(strArr[0]);
            sb2.append("://");
        }
        if (!strArr[1].equals("")) {
            sb2.append(strArr[1]);
        }
        if (!strArr[2].equals("")) {
            sb2.append(':');
            sb2.append(strArr[2]);
        }
        if (!strArr[3].equals("")) {
            sb2.append(strArr[3]);
            if (!strArr[3].equals("/")) {
                sb2.append('/');
            }
        }
        if (!strArr[4].equals("")) {
            sb2.append(strArr[4]);
        }
        if (!strArr[5].equals("")) {
            sb2.append(s60.d.f88057a);
            sb2.append(strArr[5]);
        }
        return sb2.toString();
    }

    public static byte[] b(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] bArr2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = gZIPInputStream.read();
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(read);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.igexin.c.a.c.a.a(th);
                            return bArr2;
                        } finally {
                            a(byteArrayOutputStream);
                            a(gZIPInputStream);
                            a(byteArrayInputStream);
                        }
                    }
                }
                bArr2 = byteArrayOutputStream.toByteArray();
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            gZIPInputStream = null;
            byteArrayOutputStream = null;
        }
        return bArr2;
    }

    public static short a(byte[] bArr, int i11) {
        return (short) ((bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8));
    }

    private static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(f37176l, th2.toString());
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e11) {
                com.igexin.c.a.c.a.a(f37176l, e11.toString());
            }
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream, int i11) throws IOException {
        b bVar = new b(outputStream, i11);
        a(inputStream, bVar);
        bVar.a();
    }

    public static byte[] a(int i11) {
        int i12;
        int i13 = 0;
        int i14 = 0;
        do {
            i12 = 24;
            i13 |= (i11 & 127) << 24;
            i11 >>>= 7;
            i14++;
            if (i11 > 0) {
                i13 = (i13 >>> 8) | Integer.MIN_VALUE;
            }
        } while (i11 > 0);
        byte[] bArr = new byte[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            bArr[i15] = (byte) (i13 >>> i12);
            i12 -= 8;
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                th = th2;
                try {
                    com.igexin.c.a.c.a.a(th);
                    return null;
                } finally {
                    a(gZIPOutputStream);
                    a(byteArrayOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream = null;
        }
    }

    public static String[] a(String str) {
        StringBuilder sb2 = new StringBuilder(str.toLowerCase());
        String[] strArr = new String[6];
        for (int i11 = 0; i11 < 6; i11++) {
            strArr[i11] = "";
        }
        int indexOf = str.indexOf(":");
        if (indexOf > 0) {
            strArr[0] = str.substring(0, indexOf);
            sb2.delete(0, indexOf + 1);
        } else if (indexOf == 0) {
            throw new IllegalArgumentException("url format error - protocol");
        }
        if (sb2.length() >= 2 && sb2.charAt(0) == '/' && sb2.charAt(1) == '/') {
            sb2.delete(0, 2);
            int indexOf2 = sb2.toString().indexOf(47);
            if (indexOf2 < 0) {
                indexOf2 = sb2.length();
            }
            if (indexOf2 != 0) {
                int lastIndexOf = sb2.toString().lastIndexOf(58);
                if (lastIndexOf < 0) {
                    lastIndexOf = indexOf2;
                } else {
                    if (lastIndexOf > indexOf2) {
                        throw new IllegalArgumentException("url format error - port");
                    }
                    strArr[2] = sb2.toString().substring(lastIndexOf + 1, indexOf2);
                }
                strArr[1] = sb2.toString().substring(0, lastIndexOf);
                sb2.delete(0, indexOf2);
            }
        }
        if (sb2.length() <= 0) {
            strArr[3] = "/";
            return strArr;
        }
        String sb3 = sb2.toString();
        int lastIndexOf2 = sb3.lastIndexOf(47);
        if (lastIndexOf2 > 0) {
            strArr[3] = sb3.substring(0, lastIndexOf2);
        } else if (lastIndexOf2 == 0) {
            if (sb3.indexOf(63) > 0) {
                throw new IllegalArgumentException("url format error - path");
            }
            strArr[3] = sb3;
            return strArr;
        }
        if (lastIndexOf2 < sb3.length() - 1) {
            String substring = sb3.substring(lastIndexOf2 + 1);
            int indexOf3 = substring.indexOf(63);
            if (indexOf3 >= 0) {
                strArr[4] = substring.substring(0, indexOf3);
                strArr[5] = substring.substring(indexOf3 + 1);
                return strArr;
            }
            strArr[4] = substring;
        }
        return strArr;
    }
}
