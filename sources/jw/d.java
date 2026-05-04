package jw;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.sina.weibo.sdk.web.WebActivity;
import gw.f;
import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d extends b {
    public d(Activity activity, hw.d dVar, uz.b bVar) {
        super(activity, dVar, bVar);
    }

    @Override // jw.b
    public final void b(String str) {
        a(2, str);
    }

    @Override // jw.b
    public final boolean c() {
        d();
        return true;
    }

    @Override // jw.b
    public final void d() {
        a(1, "cancel share!!!");
        hw.d dVar = this.f64682c;
        if (dVar != null) {
            ((WebActivity) dVar).finish();
        }
    }

    @Override // jw.b, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    @Override // jw.b, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str) || !str.startsWith("sinaweibo://browser/close")) {
            return false;
        }
        char[] cArr = f.f57832a;
        try {
            bundle = f.b(new URI(str).getQuery());
        } catch (URISyntaxException e11) {
            e11.printStackTrace();
            bundle = null;
        }
        if (bundle != null) {
            String string = bundle.getString("code");
            String string2 = bundle.getString("msg");
            if ("0".equals(string)) {
                a(0, string2);
            } else {
                a(2, string2);
            }
        } else {
            a(2, "bundle is null!!!");
        }
        hw.d dVar = this.f64682c;
        if (dVar == null) {
            return true;
        }
        ((WebActivity) dVar).finish();
        return true;
    }

    @Override // jw.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Bundle bundle;
        String uri = webResourceRequest.getUrl().toString();
        if (TextUtils.isEmpty(uri) || !uri.startsWith("sinaweibo://browser/close")) {
            return false;
        }
        char[] cArr = f.f57832a;
        try {
            bundle = f.b(new URI(uri).getQuery());
        } catch (URISyntaxException e11) {
            e11.printStackTrace();
            bundle = null;
        }
        if (bundle != null) {
            String string = bundle.getString("code");
            String string2 = bundle.getString("msg");
            if (TextUtils.isEmpty(string)) {
                a(1, "code is null!!!");
            } else if ("0".equals(string)) {
                a(0, string2);
            } else {
                a(2, string2);
            }
        } else {
            a(2, "bundle is null!!!");
        }
        hw.d dVar = this.f64682c;
        if (dVar != null) {
            ((WebActivity) dVar).finish();
        }
        return true;
    }
}
