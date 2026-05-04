package com.tencent.open;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.open.b;
import com.tencent.open.b.h;
import com.tencent.open.c.a;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.j;
import com.tencent.open.utils.m;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d extends com.tencent.open.c implements a.InterfaceC0524a {

    /* renamed from: c, reason: collision with root package name */
    static Toast f44494c;

    /* renamed from: d, reason: collision with root package name */
    private String f44495d;

    /* renamed from: e, reason: collision with root package name */
    private IUiListener f44496e;

    /* renamed from: f, reason: collision with root package name */
    private c f44497f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f44498g;

    /* renamed from: h, reason: collision with root package name */
    private com.tencent.open.c.a f44499h;

    /* renamed from: i, reason: collision with root package name */
    private com.tencent.open.c.b f44500i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<Context> f44501j;

    /* renamed from: k, reason: collision with root package name */
    private int f44502k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends WebViewClient {
        private a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            d.this.f44500i.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.v("openSDK_LOG.PKDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i11, String str, String str2) {
            super.onReceivedError(webView, i11, str, str2);
            d.this.f44497f.onError(new UiError(i11, str, str2));
            if (d.this.f44501j != null && d.this.f44501j.get() != null) {
                Toast.makeText((Context) d.this.f44501j.get(), "网络连接异常或系统错误", 0).show();
            }
            d.this.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            SLog.v("openSDK_LOG.PKDialog", "Redirect URL: " + str);
            if (str.startsWith(j.a().a((Context) d.this.f44501j.get(), "auth://tauth.qq.com/"))) {
                d.this.f44497f.onComplete(m.c(str));
                d.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.CANCEL_URI)) {
                d.this.f44497f.onCancel();
                d.this.dismiss();
                return true;
            }
            if (!str.startsWith(Constants.CLOSE_URI)) {
                return false;
            }
            d.this.dismiss();
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends b.C0523b {
        private b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends DefaultUiListener {

        /* renamed from: a, reason: collision with root package name */
        String f44505a;

        /* renamed from: b, reason: collision with root package name */
        String f44506b;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<Context> f44507c;

        /* renamed from: d, reason: collision with root package name */
        private String f44508d;

        /* renamed from: e, reason: collision with root package name */
        private IUiListener f44509e;

        public c(Context context, String str, String str2, String str3, IUiListener iUiListener) {
            this.f44507c = new WeakReference<>(context);
            this.f44508d = str;
            this.f44505a = str2;
            this.f44506b = str3;
            this.f44509e = iUiListener;
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            IUiListener iUiListener = this.f44509e;
            if (iUiListener != null) {
                iUiListener.onCancel();
                this.f44509e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            h.a().a(this.f44508d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.f44505a, false);
            IUiListener iUiListener = this.f44509e;
            if (iUiListener != null) {
                iUiListener.onComplete(jSONObject);
                this.f44509e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str;
            if (uiError.errorMessage != null) {
                str = uiError.errorMessage + this.f44505a;
            } else {
                str = this.f44505a;
            }
            String str2 = str;
            h.a().a(this.f44508d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str2, false);
            IUiListener iUiListener = this.f44509e;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
                this.f44509e = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
            try {
                onComplete(m.d(str));
            } catch (JSONException e11) {
                e11.printStackTrace();
                onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.open.d$d, reason: collision with other inner class name */
    public class HandlerC0525d extends Handler {

        /* renamed from: b, reason: collision with root package name */
        private c f44511b;

        public HandlerC0525d(c cVar, Looper looper) {
            super(looper);
            this.f44511b = cVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SLog.d("openSDK_LOG.PKDialog", "msg = " + message.what);
            int i11 = message.what;
            if (i11 == 1) {
                this.f44511b.a((String) message.obj);
                return;
            }
            if (i11 == 2) {
                this.f44511b.onCancel();
                return;
            }
            if (i11 == 3) {
                if (d.this.f44501j == null || d.this.f44501j.get() == null) {
                    return;
                }
                d.c((Context) d.this.f44501j.get(), (String) message.obj);
                return;
            }
            if (i11 != 5 || d.this.f44501j == null || d.this.f44501j.get() == null) {
                return;
            }
            d.d((Context) d.this.f44501j.get(), (String) message.obj);
        }
    }

    public d(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f44501j = new WeakReference<>(context);
        this.f44495d = str2;
        this.f44497f = new c(context, str, str2, qQToken.getAppId(), iUiListener);
        this.f44498g = new HandlerC0525d(this.f44497f, context.getMainLooper());
        this.f44496e = iUiListener;
        this.f44502k = Math.round(context.getResources().getDisplayMetrics().density * 185.0f);
        SLog.e("openSDK_LOG.PKDialog", "density=" + context.getResources().getDisplayMetrics().density + "; webviewHeight=" + this.f44502k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject d11 = m.d(str);
            d11.getInt("action");
            d11.getString("msg");
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.open.c, android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        getWindow().setSoftInputMode(1);
        b();
        c();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void c() {
        this.f44500i.setVerticalScrollBarEnabled(false);
        this.f44500i.setHorizontalScrollBarEnabled(false);
        this.f44500i.setWebViewClient(new a());
        this.f44500i.setWebChromeClient(this.f44485b);
        this.f44500i.clearFormData();
        WebSettings settings = this.f44500i.getSettings();
        if (settings == null) {
            return;
        }
        com.tencent.open.web.a.a(this.f44500i);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        WeakReference<Context> weakReference = this.f44501j;
        if (weakReference != null && weakReference.get() != null) {
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(this.f44501j.get().getApplicationContext().getDir("databases", 0).getPath());
        }
        settings.setDomStorageEnabled(true);
        this.f44484a.a(new b(), "sdk_js_if");
        this.f44500i.clearView();
        this.f44500i.loadUrl(this.f44495d);
    }

    private void b() {
        com.tencent.open.c.a aVar = new com.tencent.open.c.a(this.f44501j.get());
        this.f44499h = aVar;
        aVar.setBackgroundColor(1711276032);
        this.f44499h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        com.tencent.open.c.b bVar = new com.tencent.open.c.b(this.f44501j.get());
        this.f44500i = bVar;
        bVar.setBackgroundColor(0);
        this.f44500i.setBackgroundDrawable(null);
        try {
            View.class.getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(this.f44500i, 1, new Paint());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f44502k);
        layoutParams.addRule(13, -1);
        this.f44500i.setLayoutParams(layoutParams);
        this.f44499h.addView(this.f44500i);
        this.f44499h.a(this);
        setContentView(this.f44499h);
    }

    @Override // com.tencent.open.c.a.InterfaceC0524a
    public void a(int i11) {
        WeakReference<Context> weakReference = this.f44501j;
        if (weakReference != null && weakReference.get() != null) {
            if (i11 < this.f44502k && 2 == this.f44501j.get().getResources().getConfiguration().orientation) {
                this.f44500i.getLayoutParams().height = i11;
            } else {
                this.f44500i.getLayoutParams().height = this.f44502k;
            }
        }
        SLog.e("openSDK_LOG.PKDialog", "onKeyboardShown keyboard show");
    }

    @Override // com.tencent.open.c.a.InterfaceC0524a
    public void a() {
        this.f44500i.getLayoutParams().height = this.f44502k;
        SLog.e("openSDK_LOG.PKDialog", "onKeyboardHidden keyboard hide");
    }

    @Override // com.tencent.open.c
    public void a(String str) {
        SLog.d("openSDK_LOG.PKDialog", "--onConsoleMessage--");
        try {
            this.f44484a.a(this.f44500i, str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str) {
        try {
            JSONObject d11 = m.d(str);
            int i11 = d11.getInt("type");
            String string = d11.getString("msg");
            if (i11 == 0) {
                Toast toast = f44494c;
                if (toast == null) {
                    f44494c = Toast.makeText(context, string, 0);
                } else {
                    toast.setView(toast.getView());
                    f44494c.setText(string);
                    f44494c.setDuration(0);
                }
                f44494c.show();
                return;
            }
            if (i11 == 1) {
                Toast toast2 = f44494c;
                if (toast2 == null) {
                    f44494c = Toast.makeText(context, string, 1);
                } else {
                    toast2.setView(toast2.getView());
                    f44494c.setText(string);
                    f44494c.setDuration(1);
                }
                f44494c.show();
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
