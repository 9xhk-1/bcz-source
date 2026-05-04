package jw;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.sina.weibo.sdk.auth.AccessTokenHelper;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.web.WebActivity;
import gw.f;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends b {
    public a(Activity activity, hw.d dVar, uz.b bVar) {
        super(activity, dVar, bVar);
    }

    @Override // jw.b
    public final boolean c() {
        d();
        return true;
    }

    @Override // jw.b
    public final void d() {
        WbAuthListener wbAuthListener;
        String str = this.f64683d.f92773b.f41602d;
        if (!TextUtils.isEmpty(str)) {
            q.b bVar = this.f64680a;
            synchronized (bVar) {
                if (TextUtils.isEmpty(str)) {
                    wbAuthListener = null;
                } else {
                    wbAuthListener = (WbAuthListener) bVar.f81356a.get(str);
                }
            }
            this.f64684e = wbAuthListener;
            if (wbAuthListener != null) {
                wbAuthListener.onCancel();
            }
            q.b bVar2 = this.f64680a;
            synchronized (bVar2) {
                if (!TextUtils.isEmpty(str)) {
                    bVar2.f81356a.remove(str);
                }
            }
        }
        hw.d dVar = this.f64682c;
        if (dVar != null) {
            ((WebActivity) dVar).finish();
        }
    }

    @Override // jw.b, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Bundle bundle;
        WbAuthListener wbAuthListener;
        super.onPageFinished(webView, str);
        AuthInfo authInfo = this.f64683d.f92773b.f41599a;
        if (authInfo == null || !str.startsWith(authInfo.getRedirectUrl())) {
            return;
        }
        String str2 = this.f64683d.f92773b.f41602d;
        if (!TextUtils.isEmpty(str2)) {
            q.b bVar = this.f64680a;
            synchronized (bVar) {
                bundle = null;
                wbAuthListener = TextUtils.isEmpty(str2) ? null : (WbAuthListener) bVar.f81356a.get(str2);
            }
            this.f64684e = wbAuthListener;
            if (wbAuthListener != null) {
                char[] cArr = f.f57832a;
                try {
                    bundle = f.b(new URL(str).getQuery());
                } catch (MalformedURLException e11) {
                    e11.printStackTrace();
                }
                if (bundle != null) {
                    String string = bundle.getString("error");
                    String string2 = bundle.getString(ma.b.f72948u);
                    String string3 = bundle.getString("error_description");
                    if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
                        Oauth2AccessToken parseAccessToken = Oauth2AccessToken.parseAccessToken(bundle);
                        AccessTokenHelper.writeAccessToken(this.f64681b, parseAccessToken);
                        this.f64684e.onComplete(parseAccessToken);
                    } else {
                        this.f64684e.onError(new UiError(-1, string2, string3));
                    }
                } else {
                    this.f64684e.onError(new UiError(-1, "bundle is null", "parse url error"));
                }
                q.b bVar2 = this.f64680a;
                synchronized (bVar2) {
                    if (!TextUtils.isEmpty(str2)) {
                        bVar2.f81356a.remove(str2);
                    }
                }
            }
        }
        hw.d dVar = this.f64682c;
        if (dVar != null) {
            ((WebActivity) dVar).finish();
        }
    }

    @Override // jw.b, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // jw.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Bundle bundle;
        String uri = webResourceRequest.getUrl().toString();
        AuthInfo authInfo = this.f64683d.f92773b.f41599a;
        if (authInfo != null && uri.startsWith(authInfo.getRedirectUrl())) {
            char[] cArr = f.f57832a;
            try {
                bundle = f.b(new URL(uri).getQuery());
            } catch (MalformedURLException e11) {
                e11.printStackTrace();
                bundle = null;
            }
            if (bundle != null) {
                return !TextUtils.isEmpty(bundle.getString("access_token"));
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Bundle bundle;
        AuthInfo authInfo = this.f64683d.f92773b.f41599a;
        if (authInfo != null && str.startsWith(authInfo.getRedirectUrl())) {
            char[] cArr = f.f57832a;
            try {
                bundle = f.b(new URL(str).getQuery());
            } catch (MalformedURLException e11) {
                e11.printStackTrace();
                bundle = null;
            }
            if (bundle != null) {
                return !TextUtils.isEmpty(bundle.getString("access_token"));
            }
        }
        return false;
    }
}
