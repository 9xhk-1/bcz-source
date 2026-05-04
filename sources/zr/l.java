package zr;

import android.webkit.URLUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f102851a = "file:///android_res/";

    public static boolean a(String str) {
        return URLUtil.isAboutUrl(str);
    }

    public static boolean b(String str) {
        return URLUtil.isAssetUrl(str);
    }

    public static boolean c(String str) {
        return URLUtil.isContentUrl(str);
    }

    public static boolean d(String str) {
        return URLUtil.isDataUrl(str);
    }

    public static boolean e(String str) {
        return URLUtil.isFileUrl(str);
    }

    public static boolean f(String str) {
        return URLUtil.isHttpUrl(str);
    }

    public static boolean g(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    public static boolean h(String str) {
        return URLUtil.isJavaScriptUrl(str);
    }

    public static boolean i(String str) {
        return URLUtil.isNetworkUrl(str);
    }

    public static boolean j(String str) {
        return str != null && str.startsWith(f102851a);
    }

    public static boolean k(String str) {
        return URLUtil.isValidUrl(str);
    }
}
