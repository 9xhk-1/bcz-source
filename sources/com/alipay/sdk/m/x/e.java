package com.alipay.sdk.m.x;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.media3.datasource.cache.CacheDataSink;
import com.alipay.sdk.m.u.k;
import com.alipay.sdk.m.u.n;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static Handler f11205m = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public ImageView f11206a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f11207b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f11208c;

    /* renamed from: d, reason: collision with root package name */
    public ProgressBar f11209d;

    /* renamed from: e, reason: collision with root package name */
    public WebView f11210e;

    /* renamed from: f, reason: collision with root package name */
    public final C0182e f11211f;

    /* renamed from: g, reason: collision with root package name */
    public f f11212g;

    /* renamed from: h, reason: collision with root package name */
    public g f11213h;

    /* renamed from: i, reason: collision with root package name */
    public h f11214i;

    /* renamed from: j, reason: collision with root package name */
    public final com.alipay.sdk.m.s.a f11215j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnClickListener f11216k;

    /* renamed from: l, reason: collision with root package name */
    public final float f11217l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.alipay.sdk.m.x.e$a$a, reason: collision with other inner class name */
        public class RunnableC0181a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f11219a;

            public RunnableC0181a(View view) {
                this.f11219a = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f11219a.setEnabled(true);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar = e.this.f11214i;
            if (hVar != null) {
                view.setEnabled(false);
                e.f11205m.postDelayed(new RunnableC0181a(view), 256L);
                if (view == e.this.f11206a) {
                    hVar.b(e.this);
                } else if (view == e.this.f11208c) {
                    hVar.a(e.this);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements DownloadListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f11221a;

        public b(Context context) {
            this.f11221a = context;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
            try {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
                intent.setFlags(268435456);
                this.f11221a.startActivity(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return e.this.f11212g.a(e.this, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i11) {
            if (!e.this.f11211f.f11226b) {
                e.this.f11209d.setVisibility(8);
            } else {
                if (i11 > 90) {
                    e.this.f11209d.setVisibility(4);
                    return;
                }
                if (e.this.f11209d.getVisibility() == 4) {
                    e.this.f11209d.setVisibility(0);
                }
                e.this.f11209d.setProgress(i11);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            e.this.f11212g.c(e.this, str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (e.this.f11213h.b(e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (e.this.f11213h.d(e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i11, String str, String str2) {
            if (e.this.f11213h.a(e.this, i11, str, str2)) {
                return;
            }
            super.onReceivedError(webView, i11, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (e.this.f11213h.a(e.this, sslErrorHandler, sslError)) {
                return;
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (e.this.f11213h.a(e.this, str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.x.e$e, reason: collision with other inner class name */
    public static final class C0182e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f11225a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f11226b;

        public C0182e(boolean z11, boolean z12) {
            this.f11225a = z11;
            this.f11226b = z12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        boolean a(e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult);

        void c(e eVar, String str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g {
        boolean a(e eVar, int i11, String str, String str2);

        boolean a(e eVar, SslErrorHandler sslErrorHandler, SslError sslError);

        boolean a(e eVar, String str);

        boolean b(e eVar, String str);

        boolean d(e eVar, String str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface h {
        void a(e eVar);

        void b(e eVar);
    }

    public e(Context context, com.alipay.sdk.m.s.a aVar, C0182e c0182e) {
        this(context, null, aVar, c0182e);
    }

    public ImageView getBackButton() {
        return this.f11206a;
    }

    public ProgressBar getProgressbar() {
        return this.f11209d;
    }

    public ImageView getRefreshButton() {
        return this.f11208c;
    }

    public TextView getTitle() {
        return this.f11207b;
    }

    public String getUrl() {
        return this.f11210e.getUrl();
    }

    public WebView getWebView() {
        return this.f11210e;
    }

    public void setChromeProxy(f fVar) {
        this.f11212g = fVar;
        if (fVar == null) {
            this.f11210e.setWebChromeClient(null);
        } else {
            this.f11210e.setWebChromeClient(new c());
        }
    }

    public void setWebClientProxy(g gVar) {
        this.f11213h = gVar;
        if (gVar == null) {
            this.f11210e.setWebViewClient(null);
        } else {
            this.f11210e.setWebViewClient(new d());
        }
    }

    public void setWebEventProxy(h hVar) {
        this.f11214i = hVar;
    }

    public e(Context context, AttributeSet attributeSet, com.alipay.sdk.m.s.a aVar, C0182e c0182e) {
        super(context, attributeSet);
        this.f11216k = new a();
        this.f11211f = c0182e == null ? new C0182e(false, false) : c0182e;
        this.f11215j = aVar;
        this.f11217l = context.getResources().getDisplayMetrics().density;
        setOrientation(1);
        a(context);
        b(context);
        c(context);
    }

    private void a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setVisibility(this.f11211f.f11225a ? 0 : 8);
        ImageView imageView = new ImageView(context);
        this.f11206a = imageView;
        imageView.setOnClickListener(this.f11216k);
        ImageView imageView2 = this.f11206a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        this.f11206a.setImageDrawable(k.a(k.f11104a, context));
        this.f11206a.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f11206a, new LinearLayout.LayoutParams(-2, -2));
        View view = new View(context);
        view.setBackgroundColor(-2500135);
        linearLayout.addView(view, new LinearLayout.LayoutParams(a(1), a(25)));
        TextView textView = new TextView(context);
        this.f11207b = textView;
        textView.setTextColor(-15658735);
        this.f11207b.setTextSize(17.0f);
        this.f11207b.setMaxLines(1);
        this.f11207b.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(a(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f11207b, layoutParams);
        ImageView imageView3 = new ImageView(context);
        this.f11208c = imageView3;
        imageView3.setOnClickListener(this.f11216k);
        this.f11208c.setScaleType(scaleType);
        this.f11208c.setImageDrawable(k.a(k.f11105b, context));
        this.f11208c.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f11208c, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, a(48)));
    }

    private void c(Context context) {
        WebView webView = new WebView(context);
        this.f11210e = webView;
        webView.setVerticalScrollbarOverlay(true);
        a(this.f11210e, context);
        WebSettings settings = this.f11210e.getSettings();
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setUseWideViewPort(true);
        settings.setAppCacheMaxSize(CacheDataSink.DEFAULT_FRAGMENT_SIZE);
        settings.setAppCachePath(context.getCacheDir().getAbsolutePath());
        settings.setAllowFileAccess(false);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAppCacheEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(false);
        this.f11210e.setVerticalScrollbarOverlay(true);
        this.f11210e.setDownloadListener(new b(context));
        try {
            try {
                this.f11210e.removeJavascriptInterface("searchBoxJavaBridge_");
                this.f11210e.removeJavascriptInterface("accessibility");
                this.f11210e.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable unused) {
            }
        } catch (Exception unused2) {
            Method method = this.f11210e.getClass().getMethod("removeJavascriptInterface", null);
            if (method != null) {
                method.invoke(this.f11210e, "searchBoxJavaBridge_");
                method.invoke(this.f11210e, "accessibility");
                method.invoke(this.f11210e, "accessibilityTraversal");
            }
        }
        com.alipay.sdk.m.x.c.a(this.f11210e);
        addView(this.f11210e, new LinearLayout.LayoutParams(-1, -1));
    }

    private void b(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, R.style.Widget.ProgressBar.Horizontal);
        this.f11209d = progressBar;
        progressBar.setProgressDrawable(context.getResources().getDrawable(R.drawable.progress_horizontal));
        this.f11209d.setMax(100);
        this.f11209d.setBackgroundColor(-218103809);
        addView(this.f11209d, new LinearLayout.LayoutParams(-1, a(2)));
    }

    public void a(WebView webView, Context context) {
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.getSettings().setUserAgentString(userAgentString + n.g(context));
    }

    public void a(String str) {
        this.f11210e.loadUrl(str);
        com.alipay.sdk.m.x.c.a(this.f11210e);
    }

    public void a(String str, byte[] bArr) {
        this.f11210e.postUrl(str, bArr);
    }

    public void a() {
        removeAllViews();
        this.f11210e.removeAllViews();
        this.f11210e.setWebViewClient(null);
        this.f11210e.setWebChromeClient(null);
        this.f11210e.destroy();
    }

    private int a(int i11) {
        return (int) (i11 * this.f11217l);
    }
}
