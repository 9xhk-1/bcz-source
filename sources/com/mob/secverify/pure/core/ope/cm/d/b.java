package com.mob.secverify.pure.core.ope.cm.d;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f41024a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer((bArr.length * 3) / 2);
        int i11 = length - 3;
        int i12 = 0;
        int i13 = 0;
        while (i12 <= i11) {
            int i14 = ((bArr[i12] & 255) << 16) | ((bArr[i12 + 1] & 255) << 8) | (bArr[i12 + 2] & 255);
            char[] cArr = f41024a;
            stringBuffer.append(cArr[(i14 >> 18) & 63]);
            stringBuffer.append(cArr[(i14 >> 12) & 63]);
            stringBuffer.append(cArr[(i14 >> 6) & 63]);
            stringBuffer.append(cArr[i14 & 63]);
            i12 += 3;
            if (i13 >= 14) {
                stringBuffer.append(" ");
                i13 = 0;
            } else {
                i13++;
            }
        }
        if (i12 == length - 2) {
            int i15 = ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12] & 255) << 16);
            char[] cArr2 = f41024a;
            stringBuffer.append(cArr2[(i15 >> 18) & 63]);
            stringBuffer.append(cArr2[(i15 >> 12) & 63]);
            stringBuffer.append(cArr2[(i15 >> 6) & 63]);
            stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
        } else if (i12 == length - 1) {
            int i16 = (bArr[i12] & 255) << 16;
            char[] cArr3 = f41024a;
            stringBuffer.append(cArr3[(i16 >> 18) & 63]);
            stringBuffer.append(cArr3[(i16 >> 12) & 63]);
            stringBuffer.append("==");
        }
        return stringBuffer.toString();
    }

    private static int a(char c11) {
        if (c11 >= 'A' && c11 <= 'Z') {
            return c11 - 'A';
        }
        if (c11 >= 'a' && c11 <= 'z') {
            return c11 - 'G';
        }
        if (c11 >= '0' && c11 <= '9') {
            return c11 + 4;
        }
        if (c11 == '+') {
            return 62;
        }
        if (c11 == '/') {
            return 63;
        }
        if (c11 == '=') {
            return 0;
        }
        throw new RuntimeException("unexpected code: " + c11);
    }

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(str, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (IOException e11) {
                com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "Error while decoding BASE64: " + e11.toString());
                return byteArray;
            }
        } catch (IOException unused) {
            throw new RuntimeException();
        }
    }

    private static void a(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 < length && str.charAt(i11) <= ' ') {
                i11++;
            } else {
                if (i11 == length) {
                    return;
                }
                int i12 = i11 + 2;
                int i13 = i11 + 3;
                int a11 = (a(str.charAt(i11)) << 18) + (a(str.charAt(i11 + 1)) << 12) + (a(str.charAt(i12)) << 6) + a(str.charAt(i13));
                outputStream.write((a11 >> 16) & 255);
                if (str.charAt(i12) == '=') {
                    return;
                }
                outputStream.write((a11 >> 8) & 255);
                if (str.charAt(i13) == '=') {
                    return;
                }
                outputStream.write(a11 & 255);
                i11 += 4;
            }
        }
    }
}
