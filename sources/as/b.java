package as;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {
    public static void a(WebSettings webSettings) {
        webSettings.setAllowContentAccess(false);
    }

    public static void b(WebSettings webSettings) {
        webSettings.setAllowFileAccess(false);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
    }

    public static void c(WebSettings webSettings) {
        webSettings.setGeolocationEnabled(false);
    }

    public static void d(WebSettings webSettings) {
        webSettings.setMixedContentMode(1);
    }

    public static void f(WebView webView) {
        WebSettings settings = webView.getSettings();
        b(settings);
        g(webView);
        e(settings);
        c(settings);
        d(settings);
        a(settings);
    }

    public static void g(WebView webView) {
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
    }

    public static void e(WebSettings webSettings) {
    }
}
