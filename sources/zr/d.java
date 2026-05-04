package zr;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f102832a = "";

    /* renamed from: b, reason: collision with root package name */
    public static final String f102833b = "HexUtil";

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return b(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e11) {
            Log.e("HexUtil", "byte array 2 hex string UnsupportedEncodingException : " + e11.getMessage());
            return "";
        } catch (Exception e12) {
            Log.e("HexUtil", "byte array 2 hex string exception : " + e12.getMessage());
            return "";
        }
    }

    public static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : bArr) {
            String hexString = Integer.toHexString(b11 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static byte[] c(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes("UTF-8");
            for (int i11 = 0; i11 < length; i11++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("0x");
                int i12 = i11 * 2;
                sb2.append(new String(new byte[]{bytes[i12]}, "UTF-8"));
                bArr[i11] = (byte) (((byte) (Byte.decode(sb2.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i12 + 1]}, "UTF-8")).byteValue());
            }
        } catch (UnsupportedEncodingException e11) {
            e = e11;
            Log.e("HexUtil", "hex string 2 byte UnsupportedEncodingException or NumberFormatException : " + e.getMessage());
        } catch (NumberFormatException e12) {
            e = e12;
            Log.e("HexUtil", "hex string 2 byte UnsupportedEncodingException or NumberFormatException : " + e.getMessage());
        } catch (Exception e13) {
            Log.e("HexUtil", "byte array 2 hex string exception : " + e13.getMessage());
        }
        return bArr;
    }
}
