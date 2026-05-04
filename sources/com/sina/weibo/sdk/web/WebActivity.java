package com.sina.weibo.sdk.web;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.mipush.sdk.Constants;
import gw.f;
import hw.c;
import hw.d;
import uz.b;
import uz.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class WebActivity extends Activity implements d {

    /* renamed from: a, reason: collision with root package name */
    public LinearLayout f41590a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f41591b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f41592c;

    /* renamed from: d, reason: collision with root package name */
    public WebView f41593d;

    /* renamed from: e, reason: collision with root package name */
    public ProgressBar f41594e;

    /* renamed from: f, reason: collision with root package name */
    public b f41595f;

    /* renamed from: g, reason: collision with root package name */
    public jw.b f41596g;

    /* renamed from: h, reason: collision with root package name */
    public String f41597h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements b.a {
        public a() {
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(8192);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-1);
        RelativeLayout relativeLayout2 = new RelativeLayout(this);
        TextView textView = new TextView(this);
        this.f41591b = textView;
        textView.setText("关闭");
        this.f41591b.setTextSize(17.0f);
        this.f41591b.setTextColor(-32256);
        this.f41591b.setOnClickListener(new hw.a(this));
        TextView textView2 = new TextView(this);
        this.f41592c = textView2;
        textView2.setTextSize(18.0f);
        this.f41592c.setTextColor(-11382190);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        this.f41591b.setPadding(f.a(10, this), 0, f.a(10, this), 0);
        layoutParams2.addRule(13);
        relativeLayout2.addView(this.f41591b, layoutParams);
        relativeLayout2.addView(this.f41592c, layoutParams2);
        relativeLayout.addView(relativeLayout2, new RelativeLayout.LayoutParams(-1, f.a(55, this)));
        this.f41593d = new WebView(getApplicationContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.topMargin = f.a(55, this);
        relativeLayout.addView(this.f41593d, layoutParams3);
        this.f41594e = new ProgressBar(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, f.a(3, this));
        layoutParams4.topMargin = f.a(55, this);
        relativeLayout.addView(this.f41594e, layoutParams4);
        View view = new View(this);
        view.setBackgroundResource(getResources().getIdentifier("weibosdk_common_shadow_top", "drawable", getPackageName()));
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, f.a(3, this));
        layoutParams5.topMargin = f.a(55, this);
        relativeLayout.addView(view, layoutParams5);
        LinearLayout linearLayout = new LinearLayout(this);
        this.f41590a = linearLayout;
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(getResources().getIdentifier("weibosdk_empty_failed", "drawable", getPackageName()));
        this.f41590a.addView(imageView);
        TextView textView3 = new TextView(this);
        textView3.setTextSize(14.0f);
        textView3.setTextColor(-4342339);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = f.a(18, this);
        layoutParams6.bottomMargin = f.a(20, this);
        this.f41590a.addView(textView3, layoutParams6);
        textView3.setText("网络出错啦，请点击按钮重新加载");
        Button button = new Button(this);
        button.setTextSize(16.0f);
        button.setTextColor(-8882056);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(f.a(142, this), f.a(46, this));
        layoutParams7.gravity = 17;
        this.f41590a.addView(button, layoutParams7);
        button.setBackgroundResource(getResources().getIdentifier("retry_btn_selector", "drawable", getPackageName()));
        button.setText("重新加载");
        button.setOnClickListener(new hw.b(this));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(13);
        relativeLayout.addView(this.f41590a, layoutParams8);
        this.f41590a.setVisibility(8);
        this.f41593d.setWebChromeClient(new c(this));
        setContentView(relativeLayout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            finish();
            return;
        }
        int intExtra = intent.getIntExtra("web_type", -1);
        if (intExtra == -1) {
            finish();
            return;
        }
        if (intExtra == 1) {
            this.f41597h = "微博分享";
            this.f41595f = new e(this);
            this.f41596g = new jw.d(this, this, this.f41595f);
        } else if (intExtra == 2) {
            this.f41597h = "微博登录";
            this.f41595f = new uz.a();
            this.f41596g = new jw.a(this, this, this.f41595f);
        } else if (intExtra == 3) {
            this.f41595f = new uz.c();
            this.f41596g = new jw.c(this, this.f41595f);
        }
        this.f41593d.setWebViewClient(this.f41596g);
        b bVar = this.f41595f;
        bVar.getClass();
        bVar.f92773b = (WebData) extras.getParcelable("web_data");
        extras.getString("_weibo_transaction");
        bVar.b(extras);
        WebSettings settings = this.f41593d.getSettings();
        settings.setSavePassword(false);
        settings.setAllowContentAccess(false);
        settings.setUserAgentString(Build.MANUFACTURER + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Build.MODEL + "_" + Build.VERSION.RELEASE + "_weibosdk_0041005000_android");
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        this.f41593d.requestFocus();
        this.f41593d.setScrollBarStyle(0);
        try {
            WebView.class.getDeclaredMethod("removeJavascriptInterface", String.class).invoke(this.f41593d, "searchBoxJavaBridge_");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            WebView.class.getDeclaredMethod("removeJavascriptInterface", String.class).invoke(this.f41593d, "accessibility");
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        try {
            WebView.class.getDeclaredMethod("removeJavascriptInterface", String.class).invoke(this.f41593d, "accessibilityTraversal");
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        settings.setMixedContentMode(1);
        if (this.f41595f.d()) {
            this.f41595f.c(new a());
        } else {
            String a11 = this.f41595f.a();
            if (!TextUtils.isEmpty(a11) && !TextUtils.isEmpty(a11) && (a11.startsWith("https://service.weibo.com/share/mobilesdk.php") || a11.startsWith("https://open.weibo.cn/oauth2/authorize?"))) {
                this.f41593d.loadUrl(a11);
            }
        }
        TextView textView4 = this.f41592c;
        if (textView4 != null) {
            textView4.setText(this.f41597h);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (this.f41596g.c()) {
                return true;
            }
            if (this.f41593d.canGoBack()) {
                this.f41593d.goBack();
                return true;
            }
        }
        return super.onKeyDown(i11, keyEvent);
    }
}
