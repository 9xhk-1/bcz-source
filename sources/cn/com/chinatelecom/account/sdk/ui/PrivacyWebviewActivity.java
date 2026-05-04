package cn.com.chinatelecom.account.sdk.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import cn.com.chinatelecom.account.sdk.AuthPageConfig;
import cn.com.chinatelecom.account.sdk.AuthViewConfig;
import cn.com.chinatelecom.account.sdk.a.d;

/* loaded from: classes3.dex */
public final class PrivacyWebviewActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    View.OnClickListener f9220a = new View.OnClickListener() { // from class: cn.com.chinatelecom.account.sdk.ui.PrivacyWebviewActivity.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PrivacyWebviewActivity.this.finish();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private AuthPageConfig f9221b;

    /* renamed from: c, reason: collision with root package name */
    private AuthViewConfig f9222c;

    /* renamed from: d, reason: collision with root package name */
    private View f9223d;

    /* renamed from: e, reason: collision with root package name */
    private WebView f9224e;

    /* renamed from: f, reason: collision with root package name */
    private ProgressBar f9225f;

    /* renamed from: g, reason: collision with root package name */
    private String f9226g;

    /* renamed from: h, reason: collision with root package name */
    private String f9227h;

    private void b() {
        int i11 = this.f9222c.f9092au;
        if (i11 != 0) {
            View findViewById = findViewById(i11);
            int i12 = this.f9222c.f9096b;
            if (i12 != 0) {
                findViewById.setBackgroundColor(i12);
            }
            AuthViewConfig authViewConfig = this.f9222c;
            int i13 = authViewConfig.f9095ax;
            if (i13 != 0 && authViewConfig.f9094aw != 0) {
                View view = this.f9223d;
                if (view instanceof ImageView) {
                    ((ImageView) view).setImageResource(i13);
                }
            }
        }
        int i14 = this.f9222c.f9093av;
        if (i14 != 0) {
            TextView textView = (TextView) findViewById(i14);
            if (!TextUtils.isEmpty(this.f9227h)) {
                textView.setText(this.f9227h);
            }
            int i15 = this.f9222c.f9101g;
            if (i15 != 0) {
                textView.setTextColor(i15);
            }
            int i16 = this.f9222c.f9102h;
            if (i16 != 0) {
                textView.setTextSize(i16);
            }
        }
    }

    private void c() {
        if (TextUtils.isEmpty(this.f9226g)) {
            return;
        }
        this.f9224e.loadUrl(this.f9226g);
    }

    private void d() {
        WebSettings settings = this.f9224e.getSettings();
        settings.setTextZoom(100);
        settings.setAllowFileAccess(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setBuiltInZoomControls(true);
        this.f9224e.removeJavascriptInterface("searchBoxJavaBridge_");
        this.f9224e.removeJavascriptInterface("accessibility");
        this.f9224e.removeJavascriptInterface("accessibilityTraversal");
        settings.setJavaScriptEnabled(true);
        this.f9224e.setWebViewClient(new WebViewClient() { // from class: cn.com.chinatelecom.account.sdk.ui.PrivacyWebviewActivity.2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                if (PrivacyWebviewActivity.this.f9225f != null) {
                    PrivacyWebviewActivity.this.f9225f.setVisibility(4);
                }
                super.onPageFinished(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i11, String str, String str2) {
                super.onReceivedError(webView, i11, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return false;
            }
        });
        this.f9224e.setWebChromeClient(new WebChromeClient() { // from class: cn.com.chinatelecom.account.sdk.ui.PrivacyWebviewActivity.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i11) {
                super.onProgressChanged(webView, i11);
                if (PrivacyWebviewActivity.this.f9225f != null) {
                    if (PrivacyWebviewActivity.this.f9225f.getVisibility() != 0) {
                        PrivacyWebviewActivity.this.f9225f.setVisibility(0);
                    }
                    if (i11 > 10) {
                        PrivacyWebviewActivity.this.f9225f.setProgress(i11);
                        PrivacyWebviewActivity.this.f9225f.postInvalidate();
                    }
                }
            }
        });
        this.f9224e.setOnLongClickListener(new View.OnLongClickListener() { // from class: cn.com.chinatelecom.account.sdk.ui.PrivacyWebviewActivity.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return true;
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f9224e.canGoBack()) {
            this.f9224e.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AuthPageConfig b11 = d.a().b();
        this.f9221b = b11;
        if (b11 == null) {
            finish();
            return;
        }
        int o11 = b11.o();
        if (o11 == 0) {
            finish();
        }
        this.f9222c = d.a().c();
        setContentView(o11);
        this.f9226g = getIntent().getStringExtra("privacyProtocolUrl");
        String stringExtra = getIntent().getStringExtra("privacyProtocolTitle");
        this.f9227h = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.f9227h = "服务与隐私协议";
        }
        a();
        d();
        if (this.f9222c != null) {
            b();
        }
        c();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    private void a() {
        View findViewById = findViewById(this.f9221b.p());
        this.f9223d = findViewById;
        findViewById.setOnClickListener(this.f9220a);
        this.f9224e = (WebView) findViewById(this.f9221b.r());
        this.f9225f = (ProgressBar) findViewById(this.f9221b.q());
    }
}
