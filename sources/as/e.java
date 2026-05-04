package as;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import java.net.MalformedURLException;
import java.net.URL;
import zr.f;
import zr.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5482a = "UriUtil";

    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return !URLUtil.isNetworkUrl(str) ? str : b(str);
        }
        f.r(f5482a, "whiteListUrl is null");
        return null;
    }

    @TargetApi(9)
    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            f.r(f5482a, "url is null");
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str)) {
                return new URL(str.replaceAll("[\\\\#]", "/")).getHost();
            }
            f.k(f5482a, "url don't starts with http or https");
            return "";
        } catch (MalformedURLException e11) {
            f.k(f5482a, "getHostByURI error  MalformedURLException : " + e11.getMessage());
            return "";
        }
    }

    public static boolean c(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            f.k(f5482a, "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (d(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!str.contains(m.f102856e) && !str.contains(EmailAutoCompleteEditText.f17091d)) {
                if (!str2.equals(str)) {
                    if (!str.startsWith(str2 + "?")) {
                        if (!str.startsWith(str2 + "#")) {
                            if (!str2.endsWith("/")) {
                                return false;
                            }
                            if (Uri.parse(str).getPathSegments().size() - Uri.parse(str2).getPathSegments().size() != 1) {
                                return false;
                            }
                            return str.startsWith(str2);
                        }
                    }
                }
                return true;
            }
            Log.e(f5482a, "url contains unsafe char");
        }
        return false;
    }

    public static boolean e(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            f.k(f5482a, "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (f(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(String str, String str2) {
        String b11 = b(str);
        if (TextUtils.isEmpty(b11) || TextUtils.isEmpty(str2)) {
            f.k(f5482a, "url or whitelist is null");
            return false;
        }
        String a11 = a(str2);
        if (TextUtils.isEmpty(a11)) {
            Log.e(f5482a, "whitelist host is null");
            return false;
        }
        if (a11.equals(b11)) {
            return true;
        }
        if (b11.endsWith(a11)) {
            try {
                String substring = b11.substring(0, b11.length() - a11.length());
                if (substring.endsWith(".")) {
                    return substring.matches("^[A-Za-z0-9.-]+$");
                }
                return false;
            } catch (IndexOutOfBoundsException e11) {
                f.k(f5482a, "IndexOutOfBoundsException" + e11.getMessage());
            } catch (Exception e12) {
                f.k(f5482a, "Exception : " + e12.getMessage());
                return false;
            }
        }
        return false;
    }

    public static boolean g(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return TextUtils.equals(b(str), a(str2));
        }
        Log.e(f5482a, "isUrlHostSameWhitelist: url or host is null");
        return false;
    }

    public static boolean h(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            f.k(f5482a, "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (g(str, str2)) {
                return true;
            }
        }
        return false;
    }
}
