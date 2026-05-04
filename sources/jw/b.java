package jw;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.share.ShareTransActivity;
import com.sina.weibo.sdk.web.WebActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public q.b f64680a = q.b.a();

    /* renamed from: b, reason: collision with root package name */
    public Activity f64681b;

    /* renamed from: c, reason: collision with root package name */
    public hw.d f64682c;

    /* renamed from: d, reason: collision with root package name */
    public uz.b f64683d;

    /* renamed from: e, reason: collision with root package name */
    public WbAuthListener f64684e;

    public b(Activity activity, hw.d dVar, uz.b bVar) {
        this.f64681b = activity;
        this.f64682c = dVar;
        this.f64683d = bVar;
    }

    public final void a(int i11, String str) {
        Bundle extras = this.f64681b.getIntent().getExtras();
        if (extras == null) {
            return;
        }
        Intent intent = new Intent(this.f64681b, (Class<?>) ShareTransActivity.class);
        intent.setAction("com.sina.weibo.sdk.action.ACTION_SDK_REQ_ACTIVITY");
        intent.putExtras(extras);
        intent.putExtra("_weibo_resp_errcode", i11);
        intent.putExtra("_weibo_resp_errstr", str);
        this.f64681b.setResult(-1, intent);
    }

    public boolean c() {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        hw.d dVar = this.f64682c;
        if (dVar != null) {
            webResourceError.getErrorCode();
            webResourceError.getDescription().toString();
            webResourceRequest.getUrl().toString();
            WebActivity webActivity = (WebActivity) dVar;
            webActivity.f41590a.setVisibility(0);
            webActivity.f41593d.setVisibility(8);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public void d() {
    }

    public void b(String str) {
    }
}
