package com.huawei.secure.android.common.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import as.e;
import com.huawei.secure.android.common.webview.WebViewLoadCallBack;
import java.util.Arrays;
import java.util.Map;
import zr.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SafeWebView extends WebView {

    /* renamed from: f, reason: collision with root package name */
    public static final String f36795f = "SafeWebView";

    /* renamed from: a, reason: collision with root package name */
    public String f36796a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f36797b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f36798c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f36799d;

    /* renamed from: e, reason: collision with root package name */
    public WebViewLoadCallBack f36800e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public WebViewClient f36801a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f36802b;

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z11) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.doUpdateVisitedHistory(webView, str, z11);
            } else {
                super.doUpdateVisitedHistory(webView, str, z11);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            } else {
                super.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            } else {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null && !this.f36802b) {
                webViewClient.onPageStarted(webView, str, bitmap);
            } else if (SafeWebView.this.c(str)) {
                super.onPageStarted(webView, str, bitmap);
            } else {
                SafeWebView.this.d(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i11, String str, String str2) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i11, str, str2);
            } else {
                super.onReceivedError(webView, i11, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } else {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(12)
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean onRenderProcessGone;
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient == null) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            onRenderProcessGone = webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
            return onRenderProcessGone;
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i11, SafeBrowsingResponse safeBrowsingResponse) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i11, safeBrowsingResponse);
            } else {
                super.onSafeBrowsingHit(webView, webResourceRequest, i11, safeBrowsingResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f11, float f12) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onScaleChanged(webView, f11, f12);
            } else {
                super.onScaleChanged(webView, f11, f12);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onTooManyRedirects(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onTooManyRedirects(webView, message, message2);
            } else {
                super.onTooManyRedirects(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            } else {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f36801a;
            return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, webResourceRequest) : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f36801a;
            return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClient webViewClient = this.f36801a;
            return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
        }

        public b(WebViewClient webViewClient, boolean z11) {
            this.f36801a = webViewClient;
            this.f36802b = z11;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            } else {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(11)
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView, str);
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f36801a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public SafeWebView(Context context) {
        super(context);
        a();
    }

    public final void a() {
        as.b.f(this);
        setWebViewClient(null);
    }

    public final boolean b(String str) {
        return URLUtil.isHttpUrl(str);
    }

    @TargetApi(9)
    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            f.k(f36795f, "url is null");
            return false;
        }
        if (!URLUtil.isNetworkUrl(str)) {
            return true;
        }
        String[] whitelistWithPath = getWhitelistWithPath();
        String[] whitelistNotMatchSubDomain = getWhitelistNotMatchSubDomain();
        String[] whitelist = getWhitelist();
        boolean z11 = whitelistWithPath == null || whitelistWithPath.length == 0;
        boolean z12 = whitelistNotMatchSubDomain == null || whitelistNotMatchSubDomain.length == 0;
        boolean z13 = whitelist == null || whitelist.length == 0;
        if (z11 && z12 && z13) {
            return true;
        }
        return (whitelistWithPath == null || whitelistWithPath.length == 0) ? (whitelistNotMatchSubDomain == null || whitelistNotMatchSubDomain.length == 0) ? e.e(str, whitelist) : e.h(str, whitelistNotMatchSubDomain) : e.c(str, whitelistWithPath);
    }

    public final void d(WebView webView, String str) {
        f.l(f36795f, "onCheckError url is not in white list ", str);
        webView.stopLoading();
        String defaultErrorPage = getDefaultErrorPage();
        if (!TextUtils.isEmpty(defaultErrorPage)) {
            webView.loadUrl(defaultErrorPage);
        } else if (getWebViewLoadCallBack() != null) {
            Log.e(f36795f, "onPageStarted WebViewLoadCallBack");
            getWebViewLoadCallBack().a(str, WebViewLoadCallBack.ErrorCode.URL_NOT_IN_WHITE_LIST);
        }
    }

    public void e(WebViewClient webViewClient, boolean z11) {
        super.setWebViewClient(new b(webViewClient, z11));
    }

    public String getDefaultErrorPage() {
        return this.f36796a;
    }

    public WebViewLoadCallBack getWebViewLoadCallBack() {
        return this.f36800e;
    }

    @TargetApi(9)
    @Deprecated
    public String[] getWhitelist() {
        String[] strArr = this.f36797b;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String[] getWhitelistNotMatchSubDomain() {
        String[] strArr = this.f36798c;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public String[] getWhitelistNotMathcSubDomain() {
        String[] strArr = this.f36798c;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public String[] getWhitelistWithPath() {
        String[] strArr = this.f36799d;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!b(str)) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            return;
        }
        Log.e(f36795f, "loadDataWithBaseURL: http url , not safe");
        if (!TextUtils.isEmpty(this.f36796a)) {
            super.loadDataWithBaseURL(this.f36796a, str2, str3, str4, str5);
        } else if (getWebViewLoadCallBack() != null) {
            Log.e(f36795f, "WebViewLoadCallBack");
            getWebViewLoadCallBack().a(str, WebViewLoadCallBack.ErrorCode.HTTP_URL);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (c(str) && !b(str)) {
            super.loadUrl(str);
            return;
        }
        Log.e(f36795f, "loadUrl: url is not in white list or http url not safe");
        if (!TextUtils.isEmpty(this.f36796a)) {
            super.loadUrl(this.f36796a);
        } else if (getWebViewLoadCallBack() != null) {
            Log.e(f36795f, "WebViewLoadCallBack");
            getWebViewLoadCallBack().a(str, WebViewLoadCallBack.ErrorCode.HTTP_URL);
        }
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        if (c(str) && !b(str)) {
            super.postUrl(str, bArr);
            return;
        }
        Log.e(f36795f, "postUrl: url is not in white list or http url not safe");
        if (!TextUtils.isEmpty(this.f36796a)) {
            super.postUrl(this.f36796a, bArr);
        } else if (getWebViewLoadCallBack() != null) {
            Log.e(f36795f, "WebViewLoadCallBack");
            getWebViewLoadCallBack().a(str, WebViewLoadCallBack.ErrorCode.HTTP_URL);
        }
    }

    public void setDefaultErrorPage(String str) {
        this.f36796a = str;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new b(webViewClient, true));
    }

    public void setWebViewLoadCallBack(WebViewLoadCallBack webViewLoadCallBack) {
        this.f36800e = webViewLoadCallBack;
    }

    @TargetApi(9)
    @Deprecated
    public void setWhitelist(String[] strArr) {
        this.f36797b = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void setWhitelistNotMatchSubDomain(String[] strArr) {
        this.f36798c = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public void setWhitelistNotMathcSubDomain(String[] strArr) {
        this.f36798c = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public void setWhitelistWithPath(String[] strArr) {
        this.f36799d = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public SafeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public SafeWebView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        a();
    }

    @TargetApi(21)
    public SafeWebView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        a();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (c(str) && !b(str)) {
            super.loadUrl(str, map);
            return;
        }
        Log.e(f36795f, "loadUrl: url is not in white list or http url not safe");
        if (!TextUtils.isEmpty(this.f36796a)) {
            super.loadUrl(this.f36796a, map);
        } else if (getWebViewLoadCallBack() != null) {
            Log.e(f36795f, "WebViewLoadCallBack");
            getWebViewLoadCallBack().a(str, WebViewLoadCallBack.ErrorCode.HTTP_URL);
        }
    }
}
