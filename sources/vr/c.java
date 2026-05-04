package vr;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.common.C;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import zr.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f94263a = "HiPkgSignManager";

    public static PackageInfo a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getPackageArchiveInfo(str, 64);
            }
            return null;
        } catch (Exception e11) {
            f.p(f94263a, "Exception : " + e11.getMessage(), true);
            return null;
        }
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < length; i11++) {
            byte b11 = bArr[i11];
            if ((b11 & 255) < 16) {
                stringBuffer.append("0" + Integer.toHexString(bArr[i11] & 255));
            } else {
                stringBuffer.append(Integer.toHexString(b11 & 255));
            }
        }
        return stringBuffer.toString().toUpperCase(Locale.ENGLISH);
    }

    public static List<String> c(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        if (signatureArr != null && signatureArr.length != 0) {
            for (Signature signature : signatureArr) {
                arrayList.add(d(signature.toByteArray()));
            }
        }
        return arrayList;
    }

    public static String d(byte[] bArr) {
        try {
            return b(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e11) {
            f.k(f94263a, "NoSuchAlgorithmException" + e11.getMessage());
            return "";
        }
    }

    public static boolean e(Context context, String str, String str2, String str3) {
        PackageInfo a11;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && context != null && !TextUtils.isEmpty(str3) && (a11 = a(context, str2)) != null) {
            String d11 = d(a11.signatures[0].toByteArray());
            String str4 = a11.packageName;
            if (str.equalsIgnoreCase(d11) && str3.equals(str4)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || context == null) {
            return false;
        }
        return str.equalsIgnoreCase(i(context, str2));
    }

    public static boolean g(Context context, List<String> list, String str) {
        List<String> j11;
        if (TextUtils.isEmpty(str) || list == null || context == null || (j11 = j(context, str)) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
        }
        Iterator<String> it2 = j11.iterator();
        while (it2.hasNext()) {
            if (!arrayList.contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static byte[] h(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            f.k(f94263a, "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e11) {
            f.p(f94263a, "PackageManager.NameNotFoundException : " + e11.getMessage(), true);
        } catch (Exception e12) {
            f.p(f94263a, "Exception : " + e12.getMessage(), true);
        }
        return new byte[0];
    }

    public static String i(Context context, String str) {
        byte[] h11 = h(context, str);
        return (h11 == null || h11.length <= 0) ? "" : d(h11);
    }

    public static List<String> j(Context context, String str) {
        PackageManager packageManager;
        Signature[] signatureArr;
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        boolean hasMultipleSigners;
        SigningInfo signingInfo3;
        Signature[] signingCertificateHistory;
        SigningInfo signingInfo4;
        Signature[] apkContentsSigners;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable unused) {
        }
        if (Build.VERSION.SDK_INT < 28) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && signatureArr[0] != null) {
                return c(signatureArr);
            }
            return null;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, C.BUFFER_FLAG_FIRST_SAMPLE);
        if (packageInfo2 != null) {
            signingInfo = packageInfo2.signingInfo;
            if (signingInfo != null) {
                signingInfo2 = packageInfo2.signingInfo;
                hasMultipleSigners = signingInfo2.hasMultipleSigners();
                if (hasMultipleSigners) {
                    signingInfo4 = packageInfo2.signingInfo;
                    apkContentsSigners = signingInfo4.getApkContentsSigners();
                    return c(apkContentsSigners);
                }
                signingInfo3 = packageInfo2.signingInfo;
                signingCertificateHistory = signingInfo3.getSigningCertificateHistory();
                return c(signingCertificateHistory);
            }
        }
        return null;
    }

    public static String k(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            f.k(f94263a, "archiveFilePath is null or context is null");
            return "";
        }
        PackageInfo a11 = a(context, str);
        return a11 != null ? a11.packageName : "";
    }

    public static byte[] l(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            f.k(f94263a, "archiveFilePath is null or context is null");
            return new byte[0];
        }
        PackageInfo a11 = a(context, str);
        if (a11 != null) {
            Signature signature = a11.signatures[0];
            if (signature != null) {
                return signature.toByteArray();
            }
        } else {
            f.k(f94263a, "PackageInfo is null ");
        }
        return new byte[0];
    }

    public static String m(Context context, String str) {
        byte[] l11 = l(context, str);
        return (l11 == null || l11.length <= 0) ? "" : d(l11);
    }
}
