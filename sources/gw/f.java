package gw;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static char[] f57832a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static byte[] f57833b = new byte[256];

    static {
        for (int i11 = 0; i11 < 256; i11++) {
            f57833b[i11] = -1;
        }
        for (int i12 = 65; i12 <= 90; i12++) {
            f57833b[i12] = (byte) (i12 - 65);
        }
        for (int i13 = 97; i13 <= 122; i13++) {
            f57833b[i13] = (byte) (i13 - 71);
        }
        for (int i14 = 48; i14 <= 57; i14++) {
            f57833b[i14] = (byte) (i14 + 4);
        }
        byte[] bArr = f57833b;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    public static int a(int i11, Context context) {
        return (int) ((i11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Bundle b(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                try {
                    if (split.length == 2) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), URLDecoder.decode(split[1], "UTF-8"));
                    } else if (split.length == 1) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e11) {
                    e11.printStackTrace();
                }
            }
        }
        return bundle;
    }

    public static String c(Context context, String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return null;
            }
            return d.a(signatureArr[0].toByteArray());
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            return null;
        } catch (Exception e12) {
            e12.printStackTrace();
            return null;
        }
    }

    public static byte[] d(byte[] bArr) {
        boolean z11;
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            int i13 = (bArr[i11] & 255) << 8;
            int i14 = i11 + 1;
            boolean z12 = true;
            if (i14 < bArr.length) {
                i13 |= bArr[i14] & 255;
                z11 = true;
            } else {
                z11 = false;
            }
            int i15 = i13 << 8;
            int i16 = i11 + 2;
            if (i16 < bArr.length) {
                i15 |= bArr[i16] & 255;
            } else {
                z12 = false;
            }
            int i17 = i12 + 3;
            char[] cArr = f57832a;
            int i18 = 64;
            bArr2[i17] = (byte) cArr[z12 ? i15 & 63 : 64];
            int i19 = i15 >> 6;
            int i21 = i12 + 2;
            if (z11) {
                i18 = i19 & 63;
            }
            bArr2[i21] = (byte) cArr[i18];
            bArr2[i12 + 1] = (byte) cArr[(i15 >> 12) & 63];
            bArr2[i12] = (byte) cArr[(i15 >> 18) & 63];
            i11 += 3;
            i12 += 4;
        }
        return bArr2;
    }
}
