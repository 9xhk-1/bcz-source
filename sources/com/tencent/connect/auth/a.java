package com.tencent.connect.auth;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.update.UpdateConstants;
import com.tencent.connect.auth.b;
import com.tencent.connect.common.Constants;
import com.tencent.open.b.h;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.m;
import com.tencent.open.web.security.JniInterface;
import com.tencent.open.web.security.SecureJsInterface;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private String f42754a;

    /* renamed from: b, reason: collision with root package name */
    private b f42755b;

    /* renamed from: c, reason: collision with root package name */
    private IUiListener f42756c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f42757d;

    /* renamed from: e, reason: collision with root package name */
    private FrameLayout f42758e;

    /* renamed from: f, reason: collision with root package name */
    private LinearLayout f42759f;

    /* renamed from: g, reason: collision with root package name */
    private FrameLayout f42760g;

    /* renamed from: h, reason: collision with root package name */
    private ProgressBar f42761h;

    /* renamed from: i, reason: collision with root package name */
    private String f42762i;

    /* renamed from: j, reason: collision with root package name */
    private com.tencent.open.c.d f42763j;

    /* renamed from: k, reason: collision with root package name */
    private Context f42764k;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.open.web.security.b f42765l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f42766m;

    /* renamed from: n, reason: collision with root package name */
    private int f42767n;

    /* renamed from: o, reason: collision with root package name */
    private String f42768o;

    /* renamed from: p, reason: collision with root package name */
    private String f42769p;

    /* renamed from: q, reason: collision with root package name */
    private long f42770q;

    /* renamed from: r, reason: collision with root package name */
    private long f42771r;

    /* renamed from: s, reason: collision with root package name */
    private HashMap<String, Runnable> f42772s;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.connect.auth.a$a, reason: collision with other inner class name */
    public class C0504a extends WebViewClient {
        private C0504a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            SLog.v("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + str);
            a.this.f42760g.setVisibility(8);
            if (a.this.f42763j != null) {
                a.this.f42763j.setVisibility(0);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a.this.f42757d.removeCallbacks((Runnable) a.this.f42772s.remove(str));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.v("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + str);
            super.onPageStarted(webView, str, bitmap);
            a.this.f42760g.setVisibility(0);
            a.this.f42770q = SystemClock.elapsedRealtime();
            if (!TextUtils.isEmpty(a.this.f42768o)) {
                a.this.f42757d.removeCallbacks((Runnable) a.this.f42772s.remove(a.this.f42768o));
            }
            a.this.f42768o = str;
            a aVar = a.this;
            d dVar = aVar.new d(aVar.f42768o);
            a.this.f42772s.put(str, dVar);
            a.this.f42757d.postDelayed(dVar, com.igexin.push.config.c.f37553l);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i11, String str, String str2) {
            super.onReceivedError(webView, i11, str, str2);
            SLog.i("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + i11 + " | description: " + str);
            if (!m.b(a.this.f42764k)) {
                a.this.f42755b.onError(new UiError(ConnectionResult.RESOLUTION_REQUIRED, "当前网络不可用，请稍后重试！", str2));
                a.this.dismiss();
                return;
            }
            if (a.this.f42768o.startsWith("https://imgcache.qq.com/ptlogin/static/qzsjump.html?")) {
                a.this.f42755b.onError(new UiError(i11, str, str2));
                a.this.dismiss();
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f42770q;
            if (a.this.f42767n >= 1 || elapsedRealtime >= a.this.f42771r) {
                a.this.f42763j.loadUrl(a.this.a());
            } else {
                a.m(a.this);
                a.this.f42757d.postDelayed(new Runnable() { // from class: com.tencent.connect.auth.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f42763j.loadUrl(a.this.f42768o);
                    }
                }, 500L);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            SLog.e("openSDK_LOG.AuthDialog", "-->onReceivedSslError " + sslError.getPrimaryError() + "请求不合法，请检查手机安全设置，如系统时间、代理等");
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            List<String> pathSegments;
            SLog.v("openSDK_LOG.AuthDialog", "-->Redirect URL: " + str);
            if (str.startsWith("auth://browser")) {
                JSONObject c11 = m.c(str);
                a aVar = a.this;
                aVar.f42766m = aVar.e();
                if (!a.this.f42766m) {
                    if (c11.optString("fail_cb", null) != null) {
                        a.this.a(c11.optString("fail_cb"), "");
                    } else if (c11.optInt("fall_to_wv") == 1) {
                        a aVar2 = a.this;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(a.this.f42754a);
                        sb2.append(a.this.f42754a.indexOf("?") > -1 ? "&" : "?");
                        aVar2.f42754a = sb2.toString();
                        a.this.f42754a = a.this.f42754a + "browser_error=1";
                        a.this.f42763j.loadUrl(a.this.f42754a);
                    } else {
                        String optString = c11.optString("redir", null);
                        if (optString != null) {
                            a.this.f42763j.loadUrl(optString);
                        }
                    }
                }
                return true;
            }
            if (str.startsWith("auth://tauth.qq.com/")) {
                a.this.f42755b.onComplete(m.c(str));
                a.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.CANCEL_URI)) {
                a.this.f42755b.onCancel();
                a.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.CLOSE_URI)) {
                a.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.DOWNLOAD_URI) || str.endsWith(UpdateConstants.LOCAL_APK_FILE)) {
                try {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, str.startsWith(Constants.DOWNLOAD_URI) ? Uri.parse(Uri.decode(str.substring(11))) : Uri.parse(Uri.decode(str)));
                    intent.addFlags(268435456);
                    a.this.f42764k.startActivity(intent);
                } catch (Exception e11) {
                    SLog.e("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", e11);
                }
                return true;
            }
            if (!str.startsWith("auth://progress")) {
                if (str.startsWith("auth://onLoginSubmit")) {
                    try {
                        List<String> pathSegments2 = Uri.parse(str).getPathSegments();
                        if (!pathSegments2.isEmpty()) {
                            a.this.f42769p = pathSegments2.get(0);
                        }
                    } catch (Exception unused) {
                    }
                    return true;
                }
                if (a.this.f42765l.a(a.this.f42763j, str)) {
                    return true;
                }
                SLog.i("openSDK_LOG.AuthDialog", "-->Redirect URL: return false");
                return false;
            }
            try {
                pathSegments = Uri.parse(str).getPathSegments();
            } catch (Exception unused2) {
            }
            if (pathSegments.isEmpty()) {
                return true;
            }
            int intValue = Integer.valueOf(pathSegments.get(0)).intValue();
            if (intValue == 0) {
                a.this.f42760g.setVisibility(8);
                a.this.f42763j.setVisibility(0);
            } else if (intValue == 1) {
                a.this.f42760g.setVisibility(0);
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends DefaultUiListener {

        /* renamed from: a, reason: collision with root package name */
        String f42779a;

        /* renamed from: b, reason: collision with root package name */
        String f42780b;

        /* renamed from: d, reason: collision with root package name */
        private String f42782d;

        /* renamed from: e, reason: collision with root package name */
        private IUiListener f42783e;

        public b(String str, String str2, String str3, IUiListener iUiListener) {
            this.f42782d = str;
            this.f42779a = str2;
            this.f42780b = str3;
            this.f42783e = iUiListener;
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            IUiListener iUiListener = this.f42783e;
            if (iUiListener != null) {
                iUiListener.onCancel();
                this.f42783e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            h.a().a(this.f42782d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.f42779a, false);
            IUiListener iUiListener = this.f42783e;
            if (iUiListener != null) {
                iUiListener.onComplete(jSONObject);
                this.f42783e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str;
            if (uiError.errorMessage != null) {
                str = uiError.errorMessage + this.f42779a;
            } else {
                str = this.f42779a;
            }
            String str2 = str;
            h.a().a(this.f42782d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str2, false);
            a.this.a(str2);
            IUiListener iUiListener = this.f42783e;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
                this.f42783e = null;
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
    public class c extends Handler {

        /* renamed from: b, reason: collision with root package name */
        private b f42785b;

        public c(b bVar, Looper looper) {
            super(looper);
            this.f42785b = bVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                this.f42785b.a((String) message.obj);
            } else if (i11 == 2) {
                this.f42785b.onCancel();
            } else {
                if (i11 != 3) {
                    return;
                }
                a.b(a.this.f42764k, (String) message.obj);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        String f42786a;

        public d(String str) {
            this.f42786a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SLog.v("openSDK_LOG.AuthDialog", "-->timeoutUrl: " + this.f42786a + " | mRetryUrl: " + a.this.f42768o);
            if (this.f42786a.equals(a.this.f42768o)) {
                a.this.f42755b.onError(new UiError(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, "请求页面超时，请稍后重试！", a.this.f42768o));
                a.this.dismiss();
            }
        }
    }

    public a(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f42766m = false;
        this.f42770q = 0L;
        this.f42771r = 30000L;
        this.f42764k = context;
        this.f42754a = str2;
        this.f42755b = new b(str, str2, qQToken.getAppId(), iUiListener);
        this.f42757d = new c(this.f42755b, context.getMainLooper());
        this.f42756c = iUiListener;
        this.f42762i = str;
        this.f42765l = new com.tencent.open.web.security.b();
        getWindow().setSoftInputMode(32);
    }

    public static /* synthetic */ int m(a aVar) {
        int i11 = aVar.f42767n;
        aVar.f42767n = i11 + 1;
        return i11;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f42772s.clear();
        this.f42757d.removeCallbacksAndMessages(null);
        try {
            Context context = this.f42764k;
            if ((context instanceof Activity) && !((Activity) context).isFinishing() && isShowing()) {
                super.dismiss();
                SLog.i("openSDK_LOG.AuthDialog", "-->dismiss dialog");
            }
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.AuthDialog", "-->dismiss dialog exception:", e11);
        }
        com.tencent.open.c.d dVar = this.f42763j;
        if (dVar != null) {
            dVar.destroy();
            this.f42763j = null;
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (!this.f42766m) {
            this.f42755b.onCancel();
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        com.tencent.open.a.a(getWindow());
        b();
        d();
        this.f42772s = new HashMap<>();
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        com.tencent.connect.auth.b a11 = com.tencent.connect.auth.b.a();
        String c11 = a11.c();
        b.a aVar = new b.a();
        aVar.f42793a = this.f42756c;
        aVar.f42794b = this;
        aVar.f42795c = c11;
        String a12 = a11.a(aVar);
        String str = this.f42754a;
        String substring = str.substring(0, str.indexOf("?"));
        Bundle b11 = m.b(this.f42754a);
        b11.putString("token_key", c11);
        b11.putString("serial", a12);
        b11.putString("browser", "1");
        String str2 = substring + "?" + HttpUtils.encodeUrl(b11);
        this.f42754a = str2;
        return m.a(this.f42764k, str2);
    }

    private void b() {
        c();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        com.tencent.open.c.d dVar = new com.tencent.open.c.d(this.f42764k);
        this.f42763j = dVar;
        dVar.setLayerType(1, null);
        this.f42763j.setLayoutParams(layoutParams);
        layoutParams.gravity = 17;
        com.tencent.open.c.c cVar = new com.tencent.open.c.c(this.f42764k);
        cVar.setLayoutParams(layoutParams);
        cVar.addView(this.f42763j);
        FrameLayout frameLayout = new FrameLayout(this.f42764k);
        this.f42758e = frameLayout;
        frameLayout.addView(cVar);
        this.f42758e.setBackgroundColor(-1);
        this.f42758e.addView(this.f42760g);
        String string = m.b(this.f42754a).getString("style");
        if (string != null && "qr".equals(string)) {
            a(this.f42758e);
        }
        setContentView(this.f42758e);
    }

    private void c() {
        TextView textView;
        this.f42761h = new ProgressBar(this.f42764k);
        this.f42761h.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f42759f = new LinearLayout(this.f42764k);
        if (this.f42762i.equals("action_login")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = 5;
            textView = new TextView(this.f42764k);
            if (Locale.getDefault().getLanguage().equals("zh")) {
                textView.setText("登录中...");
            } else {
                textView.setText("Logging in...");
            }
            textView.setTextColor(Color.rgb(255, 255, 255));
            textView.setTextSize(18.0f);
            textView.setLayoutParams(layoutParams);
        } else {
            textView = null;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.f42759f.setLayoutParams(layoutParams2);
        this.f42759f.addView(this.f42761h);
        if (textView != null) {
            this.f42759f.addView(textView);
        }
        this.f42760g = new FrameLayout(this.f42764k);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.f42760g.setLayoutParams(layoutParams3);
        this.f42760g.setBackgroundColor(Color.parseColor("#B3000000"));
        this.f42760g.addView(this.f42759f);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void d() {
        this.f42763j.setVerticalScrollBarEnabled(false);
        this.f42763j.setHorizontalScrollBarEnabled(false);
        this.f42763j.setWebViewClient(new C0504a());
        this.f42763j.setWebChromeClient(new WebChromeClient());
        this.f42763j.clearFormData();
        this.f42763j.clearSslPreferences();
        this.f42763j.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.tencent.connect.auth.a.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return true;
            }
        });
        this.f42763j.setOnTouchListener(new View.OnTouchListener() { // from class: com.tencent.connect.auth.a.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if ((action != 0 && action != 1) || view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        WebSettings settings = this.f42763j.getSettings();
        com.tencent.open.web.a.a(this.f42763j);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(this.f42764k.getDir("databases", 0).getPath());
        settings.setDomStorageEnabled(true);
        SLog.v("openSDK_LOG.AuthDialog", "-->mUrl : " + this.f42754a);
        String str = this.f42754a;
        this.f42768o = str;
        this.f42763j.loadUrl(str);
        this.f42763j.setVisibility(4);
        this.f42765l.a(new SecureJsInterface(), "SecureJsInterface");
        SecureJsInterface.isPWDEdit = false;
        super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tencent.connect.auth.a.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                try {
                    if (JniInterface.isJniOk) {
                        JniInterface.clearAllPWD();
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (!TextUtils.isEmpty(this.f42769p) && this.f42769p.length() >= 4) {
            String str2 = this.f42769p;
            String substring = str2.substring(str2.length() - 4);
            sb2.append("_u_");
            sb2.append(substring);
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        String str = this.f42754a;
        String str2 = "https://imgcache.qq.com/ptlogin/static/qzsjump.html?" + str.substring(str.indexOf("?") + 1);
        SLog.i("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: https://imgcache.qq.com/ptlogin/static/qzsjump.html?");
        return str2;
    }

    private void a(ViewGroup viewGroup) {
        ImageView imageView = new ImageView(this.f42764k);
        int a11 = com.tencent.connect.avatar.a.a(this.f42764k, 15.6f);
        int a12 = com.tencent.connect.avatar.a.a(this.f42764k, 25.2f);
        int a13 = com.tencent.connect.avatar.a.a(this.f42764k, 10.0f);
        int i11 = a13 * 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a11 + i11, a12 + i11);
        layoutParams.leftMargin = a13;
        imageView.setLayoutParams(layoutParams);
        imageView.setPadding(a13, a13, a13, a13);
        imageView.setImageDrawable(m.a("h5_qr_back.png", this.f42764k));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.connect.auth.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.dismiss();
                if (a.this.f42766m || a.this.f42755b == null) {
                    return;
                }
                a.this.f42755b.onCancel();
            }
        });
        viewGroup.addView(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str) {
        try {
            JSONObject d11 = m.d(str);
            int i11 = d11.getInt("type");
            Toast.makeText(context.getApplicationContext(), d11.getString("msg"), i11).show();
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    public void a(String str, String str2) {
        this.f42763j.loadUrl("javascript:" + str + j.f81006c + str2 + ");void(" + System.currentTimeMillis() + ");");
    }
}
