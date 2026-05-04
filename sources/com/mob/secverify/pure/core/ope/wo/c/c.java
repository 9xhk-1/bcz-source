package com.mob.secverify.pure.core.ope.wo.c;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f41061a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    public static String a(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance(new String(e.b("QUVTL0NCQy9QS0NTNVBhZGRpbmc=")));
            cipher.init(1, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
            return a(cipher.doFinal(str.getBytes("UTF-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str, String str2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec("0000000000000000".getBytes());
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance(new String(e.b("QUVTL0NCQy9QS0NTNVBhZGRpbmc=")));
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(d.a(str)));
        } catch (InvalidAlgorithmParameterException e11) {
            e11.printStackTrace();
            return null;
        } catch (InvalidKeyException e12) {
            e12.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e13) {
            e13.printStackTrace();
            return null;
        } catch (BadPaddingException e14) {
            e14.printStackTrace();
            return null;
        } catch (IllegalBlockSizeException e15) {
            e15.printStackTrace();
            return null;
        } catch (NoSuchPaddingException e16) {
            e16.printStackTrace();
            return null;
        }
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer((bArr.length * 3) / 2);
        int i11 = length - 3;
        byte b11 = 0;
        byte b12 = 0;
        while (b11 <= i11) {
            int i12 = ((bArr[b11] & 255) << 16) | ((bArr[b11 + 1] & 255) << 8) | (bArr[b11 + 2] & 255);
            char[] cArr = f41061a;
            stringBuffer.append(cArr[(i12 >> 18) & 63]);
            stringBuffer.append(cArr[(i12 >> 12) & 63]);
            stringBuffer.append(cArr[(i12 >> 6) & 63]);
            stringBuffer.append(cArr[i12 & 63]);
            b11 = (byte) (b11 + 3);
            byte b13 = (byte) (b12 + 1);
            if (b12 >= 14) {
                stringBuffer.append(" ");
                b12 = 0;
            } else {
                b12 = b13;
            }
        }
        if (b11 == length - 2) {
            int i13 = ((bArr[b11 + 1] & 255) << 8) | ((bArr[b11] & 255) << 16);
            char[] cArr2 = f41061a;
            stringBuffer.append(cArr2[(i13 >> 18) & 63]);
            stringBuffer.append(cArr2[(i13 >> 12) & 63]);
            stringBuffer.append(cArr2[(i13 >> 6) & 63]);
            stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
        } else if (b11 == length - 1) {
            int i14 = (bArr[b11] & 255) << 16;
            char[] cArr3 = f41061a;
            stringBuffer.append(cArr3[(i14 >> 18) & 63]);
            stringBuffer.append(cArr3[(i14 >> 12) & 63]);
            stringBuffer.append("==");
        }
        return stringBuffer.toString();
    }

    public static String a() {
        String str = "";
        try {
            String uuid = UUID.randomUUID().toString();
            if (!TextUtils.isEmpty(uuid)) {
                str = uuid.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
                if (str.length() >= 16) {
                    return str.substring(0, 16);
                }
            }
            return str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }
}
