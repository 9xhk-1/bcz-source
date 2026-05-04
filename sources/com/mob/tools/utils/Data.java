package com.mob.tools.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.mob.commons.n;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.zip.CRC32;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public class Data implements PublicMemberKeeper {
    public static String AES128Decode(String str, byte[] bArr) throws Throwable {
        if (str == null || bArr == null) {
            return null;
        }
        return new String(AES128Decode(str.getBytes("UTF-8"), bArr), "UTF-8");
    }

    public static byte[] AES128Encode(String str, String str2) throws Throwable {
        if (str == null || str2 == null) {
            return null;
        }
        byte[] bytes = str.getBytes("UTF-8");
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 16));
        byte[] bytes2 = str2.getBytes("UTF-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, n.a("0035difbdg"));
        Cipher a11 = a(n.a("003?difbdg") + n.a("003f_fbfe") + n.a("008AeiSfTffgifedghgff") + n.a("006$ce1gg0cdcjee"), n.a("002Oeife"));
        a11.init(1, secretKeySpec);
        byte[] bArr2 = new byte[a11.getOutputSize(bytes2.length)];
        a11.doFinal(bArr2, a11.update(bytes2, 0, bytes2.length, bArr2, 0));
        return bArr2;
    }

    @Deprecated
    public static String Base64AES(String str, String str2) {
        String str3 = null;
        if (str != null && str2 != null) {
            try {
                str3 = Base64.encodeToString(AES128Encode(str2, str), 0);
                return TextUtils.isEmpty(str3) ? str3 : str3.contains("\n") ? str3.replace("\n", "") : str3;
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
            }
        }
        return str3;
    }

    public static String CRC32(byte[] bArr) throws Throwable {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        long value = crc32.getValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 56)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 48)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 40)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 32)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 24)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 16)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 8)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) value) & 255)));
        while (sb2.charAt(0) == '0') {
            sb2 = sb2.deleteCharAt(0);
        }
        return sb2.toString().toLowerCase();
    }

    public static String MD5(String str) {
        byte[] rawMD5;
        if (str == null || (rawMD5 = rawMD5(str)) == null) {
            return null;
        }
        return a(rawMD5);
    }

    public static byte[] SHA1(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return SHA1(str.getBytes("utf-8"));
    }

    private static Cipher a(String str, String str2) throws Throwable {
        Cipher cipher = null;
        if (!TextUtils.isEmpty(str2)) {
            try {
                Provider provider = Security.getProvider(str2);
                if (provider != null) {
                    cipher = Cipher.getInstance(str, provider);
                }
            } catch (Throwable unused) {
            }
        }
        return cipher == null ? Cipher.getInstance(str, str2) : cipher;
    }

    public static String byteToHex(byte[] bArr) {
        return byteToHex(bArr, 0, bArr.length);
    }

    public static byte[] rawMD5(String str) {
        if (str == null) {
            return null;
        }
        try {
            return rawMD5(str.getBytes("utf-8"));
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static String urlEncode(String str) {
        try {
            return urlEncode(str, "utf-8");
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static String byteToHex(byte[] bArr, int i11, int i12) {
        StringBuffer stringBuffer = new StringBuffer();
        if (bArr == null) {
            return stringBuffer.toString();
        }
        while (i11 < i12) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(bArr[i11])));
            i11++;
        }
        return stringBuffer.toString();
    }

    public static String MD5(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return MD5(bArr, 0, bArr.length);
    }

    public static byte[] rawMD5(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return rawMD5(bArr, 0, bArr.length);
    }

    public static String urlEncode(String str, String str2) throws Throwable {
        String encode = TextUtils.isEmpty(str) ? "" : URLEncoder.encode(str, str2);
        return TextUtils.isEmpty(encode) ? encode : encode.replace("+", "%20");
    }

    public static byte[] AES128Decode(byte[] bArr, byte[] bArr2) throws Throwable {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, n.a("003'difbdg"));
        Cipher a11 = a(n.a("003=difbdg") + n.a("003fAfbfe") + n.a("0058ei*fEdedbff") + n.a("0060cePgg,cdcjee"), n.a("0026eife"));
        a11.init(2, secretKeySpec);
        byte[] bArr4 = new byte[a11.getOutputSize(bArr2.length)];
        a11.doFinal(bArr4, a11.update(bArr2, 0, bArr2.length, bArr4, 0));
        return bArr4;
    }

    public static String MD5(byte[] bArr, int i11, int i12) {
        byte[] rawMD5;
        if (bArr == null || (rawMD5 = rawMD5(bArr, i11, i12)) == null) {
            return null;
        }
        return a(rawMD5);
    }

    public static byte[] SHA1(byte[] bArr) throws Throwable {
        MessageDigest messageDigest = MessageDigest.getInstance(n.a("005Edggbdighfj"));
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    public static byte[] rawMD5(byte[] bArr, int i11, int i12) {
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i11, i12);
            byte[] rawMD5 = rawMD5(byteArrayInputStream);
            byteArrayInputStream.close();
            return rawMD5;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b11 : bArr) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(b11)));
        }
        return stringBuffer.toString();
    }

    public static String MD5(File file) {
        if (file != null && file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] rawMD5 = rawMD5(fileInputStream);
                fileInputStream.close();
                if (rawMD5 == null) {
                    return null;
                }
                return a(rawMD5);
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
            }
        }
        return null;
    }

    public static byte[] rawMD5(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[1024];
            MessageDigest messageDigest = MessageDigest.getInstance(n.a("003=fgehgd"));
            int read = inputStream.read(bArr);
            while (read != -1) {
                messageDigest.update(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            return messageDigest.digest();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static byte[] AES128Encode(byte[] bArr, String str) throws Throwable {
        if (bArr == null || str == null) {
            return null;
        }
        return AES128Encode(bArr, str.getBytes("UTF-8"));
    }

    public static void AES128Decode(String str, InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (str == null) {
            return;
        }
        AES128Decode(str.getBytes("UTF-8"), inputStream, outputStream);
    }

    public static byte[] AES128Encode(byte[] bArr, byte[] bArr2) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, n.a("0038difbdg"));
        Cipher a11 = a(n.a("003-difbdg") + n.a("003f]fbfe") + n.a("008,ei3f;ffgifedghgff") + n.a("006YcePgg1cdcjee"), n.a("002.eife"));
        a11.init(1, secretKeySpec);
        byte[] bArr3 = new byte[a11.getOutputSize(bArr2.length)];
        a11.doFinal(bArr3, a11.update(bArr2, 0, bArr2.length, bArr3, 0));
        return bArr3;
    }

    public static void AES128Decode(byte[] bArr, InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (bArr == null || inputStream == null || outputStream == null) {
            return;
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, n.a("003Wdifbdg"));
        Cipher a11 = a(n.a("003Bdifbdg") + n.a("003fAfbfe") + n.a("008.ei*fHffgifedghgff") + n.a("006+ceAgg.cdcjee"), n.a("002<eife"));
        a11.init(2, secretKeySpec);
        CipherInputStream cipherInputStream = new CipherInputStream(inputStream, a11);
        byte[] bArr3 = new byte[1024];
        for (int read = cipherInputStream.read(bArr3); read != -1; read = cipherInputStream.read(bArr3)) {
            outputStream.write(bArr3, 0, read);
        }
        outputStream.flush();
    }
}
