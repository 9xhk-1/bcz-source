package com.tencent.open;

import android.R;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.update.UpdateConstants;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.open.b;
import com.tencent.open.b.h;
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
public class TDialog extends c {

    /* renamed from: c, reason: collision with root package name */
    static final FrameLayout.LayoutParams f44400c = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: d, reason: collision with root package name */
    static Toast f44401d = null;

    /* renamed from: f, reason: collision with root package name */
    private static WeakReference<ProgressDialog> f44402f;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<Context> f44403e;

    /* renamed from: g, reason: collision with root package name */
    private String f44404g;

    /* renamed from: h, reason: collision with root package name */
    private OnTimeListener f44405h;

    /* renamed from: i, reason: collision with root package name */
    private IUiListener f44406i;

    /* renamed from: j, reason: collision with root package name */
    private FrameLayout f44407j;

    /* renamed from: k, reason: collision with root package name */
    private com.tencent.open.c.b f44408k;

    /* renamed from: l, reason: collision with root package name */
    private Handler f44409l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f44410m;

    /* renamed from: n, reason: collision with root package name */
    private QQToken f44411n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class FbWebViewClient extends WebViewClient {
        private FbWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            TDialog.this.f44408k.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.v("openSDK_LOG.TDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i11, String str, String str2) {
            super.onReceivedError(webView, i11, str, str2);
            TDialog.this.f44405h.onError(new UiError(i11, str, str2));
            if (TDialog.this.f44403e != null && TDialog.this.f44403e.get() != null) {
                Toast.makeText((Context) TDialog.this.f44403e.get(), "网络连接异常或系统错误", 0).show();
            }
            TDialog.this.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            SLog.v("openSDK_LOG.TDialog", "Redirect URL: " + str);
            if (str.startsWith(j.a().a((Context) TDialog.this.f44403e.get(), "auth://tauth.qq.com/"))) {
                TDialog.this.f44405h.onComplete(m.c(str));
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            }
            if (str.startsWith(Constants.CANCEL_URI)) {
                TDialog.this.f44405h.onCancel();
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            }
            if (str.startsWith(Constants.CLOSE_URI)) {
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            }
            if (!str.startsWith(Constants.DOWNLOAD_URI) && !str.endsWith(UpdateConstants.LOCAL_APK_FILE)) {
                return str.startsWith("auth://progress");
            }
            try {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, str.startsWith(Constants.DOWNLOAD_URI) ? Uri.parse(Uri.decode(str.substring(11))) : Uri.parse(Uri.decode(str)));
                intent.addFlags(268435456);
                if (TDialog.this.f44403e != null && TDialog.this.f44403e.get() != null) {
                    ((Context) TDialog.this.f44403e.get()).startActivity(intent);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class JsListener extends b.C0523b {
        private JsListener() {
        }

        public void onAddShare(String str) {
            SLog.d("openSDK_LOG.TDialog", "JsListener onAddShare");
            onComplete(str);
        }

        public void onCancel(String str) {
            SLog.e("openSDK_LOG.TDialog", "JsListener onCancel --msg = " + str);
            TDialog.this.f44409l.obtainMessage(2, str).sendToTarget();
            TDialog.this.dismiss();
        }

        public void onCancelAddShare(String str) {
            SLog.e("openSDK_LOG.TDialog", "JsListener onCancelAddShare" + str);
            onCancel("cancel");
        }

        public void onCancelInvite() {
            SLog.e("openSDK_LOG.TDialog", "JsListener onCancelInvite");
            onCancel("");
        }

        public void onCancelLogin() {
            onCancel("");
        }

        public void onComplete(String str) {
            TDialog.this.f44409l.obtainMessage(1, str).sendToTarget();
            SLog.e("openSDK_LOG.TDialog", "JsListener onComplete" + str);
            TDialog.this.dismiss();
        }

        public void onInvite(String str) {
            onComplete(str);
        }

        public void onLoad(String str) {
            TDialog.this.f44409l.obtainMessage(4, str).sendToTarget();
        }

        public void showMsg(String str) {
            TDialog.this.f44409l.obtainMessage(3, str).sendToTarget();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OnTimeListener extends DefaultUiListener {

        /* renamed from: a, reason: collision with root package name */
        String f44415a;

        /* renamed from: b, reason: collision with root package name */
        String f44416b;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<Context> f44417c;

        /* renamed from: d, reason: collision with root package name */
        private String f44418d;

        /* renamed from: e, reason: collision with root package name */
        private IUiListener f44419e;

        public OnTimeListener(Context context, String str, String str2, String str3, IUiListener iUiListener) {
            this.f44417c = new WeakReference<>(context);
            this.f44418d = str;
            this.f44415a = str2;
            this.f44416b = str3;
            this.f44419e = iUiListener;
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            IUiListener iUiListener = this.f44419e;
            if (iUiListener != null) {
                iUiListener.onCancel();
                this.f44419e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            h.a().a(this.f44418d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.f44415a, false);
            IUiListener iUiListener = this.f44419e;
            if (iUiListener != null) {
                iUiListener.onComplete(jSONObject);
                this.f44419e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str;
            if (uiError.errorMessage != null) {
                str = uiError.errorMessage + this.f44415a;
            } else {
                str = this.f44415a;
            }
            String str2 = str;
            h.a().a(this.f44418d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str2, false);
            IUiListener iUiListener = this.f44419e;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
                this.f44419e = null;
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
    public class THandler extends Handler {

        /* renamed from: b, reason: collision with root package name */
        private OnTimeListener f44421b;

        public THandler(OnTimeListener onTimeListener, Looper looper) {
            super(looper);
            this.f44421b = onTimeListener;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SLog.d("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = " + message.what);
            int i11 = message.what;
            if (i11 == 1) {
                this.f44421b.a((String) message.obj);
                return;
            }
            if (i11 == 2) {
                this.f44421b.onCancel();
                return;
            }
            if (i11 == 3) {
                if (TDialog.this.f44403e == null || TDialog.this.f44403e.get() == null) {
                    return;
                }
                TDialog.c((Context) TDialog.this.f44403e.get(), (String) message.obj);
                return;
            }
            if (i11 != 5 || TDialog.this.f44403e == null || TDialog.this.f44403e.get() == null) {
                return;
            }
            TDialog.d((Context) TDialog.this.f44403e.get(), (String) message.obj);
        }
    }

    public TDialog(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f44410m = false;
        this.f44411n = null;
        this.f44403e = new WeakReference<>(context);
        this.f44404g = str2;
        this.f44405h = new OnTimeListener(context, str, str2, qQToken.getAppId(), iUiListener);
        this.f44409l = new THandler(this.f44405h, context.getMainLooper());
        this.f44406i = iUiListener;
        this.f44411n = qQToken;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        OnTimeListener onTimeListener = this.f44405h;
        if (onTimeListener != null) {
            onTimeListener.onCancel();
        }
        super.onBackPressed();
    }

    @Override // com.tencent.open.c, android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        a.a(getWindow());
        a();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.open.TDialog.1
            @Override // java.lang.Runnable
            public void run() {
                View decorView;
                View childAt;
                Window window = TDialog.this.getWindow();
                if (window == null || (decorView = window.getDecorView()) == null || (childAt = ((ViewGroup) decorView).getChildAt(0)) == null) {
                    return;
                }
                childAt.setPadding(0, 0, 0, 0);
            }
        });
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str) {
        try {
            JSONObject d11 = m.d(str);
            int i11 = d11.getInt("type");
            String string = d11.getString("msg");
            if (i11 == 0) {
                Toast toast = f44401d;
                if (toast == null) {
                    f44401d = Toast.makeText(context, string, 0);
                } else {
                    toast.setView(toast.getView());
                    f44401d.setText(string);
                    f44401d.setDuration(0);
                }
                f44401d.show();
                return;
            }
            if (i11 == 1) {
                Toast toast2 = f44401d;
                if (toast2 == null) {
                    f44401d = Toast.makeText(context, string, 1);
                } else {
                    toast2.setView(toast2.getView());
                    f44401d.setText(string);
                    f44401d.setDuration(1);
                }
                f44401d.show();
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, String str) {
        WeakReference<ProgressDialog> weakReference;
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject d11 = m.d(str);
            int i11 = d11.getInt("action");
            String string = d11.getString("msg");
            if (i11 != 1) {
                if (i11 != 0 || (weakReference = f44402f) == null || weakReference.get() == null || !f44402f.get().isShowing()) {
                    return;
                }
                f44402f.get().dismiss();
                f44402f = null;
                return;
            }
            WeakReference<ProgressDialog> weakReference2 = f44402f;
            if (weakReference2 != null && weakReference2.get() != null) {
                f44402f.get().setMessage(string);
                if (f44402f.get().isShowing()) {
                    return;
                }
                f44402f.get().show();
                return;
            }
            ProgressDialog progressDialog = new ProgressDialog(context);
            progressDialog.setMessage(string);
            f44402f = new WeakReference<>(progressDialog);
            progressDialog.show();
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    private void a() {
        new TextView(this.f44403e.get()).setText("test");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        com.tencent.open.c.b bVar = new com.tencent.open.c.b(this.f44403e.get());
        this.f44408k = bVar;
        bVar.setLayoutParams(layoutParams);
        layoutParams.gravity = 17;
        com.tencent.open.c.c cVar = new com.tencent.open.c.c(this.f44403e.get());
        this.f44407j = cVar;
        cVar.setLayoutParams(layoutParams);
        this.f44407j.setBackgroundColor(-1);
        this.f44407j.addView(this.f44408k);
        setContentView(this.f44407j);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        this.f44408k.setVerticalScrollBarEnabled(false);
        this.f44408k.setHorizontalScrollBarEnabled(false);
        this.f44408k.setWebViewClient(new FbWebViewClient());
        this.f44408k.setWebChromeClient(this.f44485b);
        this.f44408k.clearFormData();
        WebSettings settings = this.f44408k.getSettings();
        if (settings == null) {
            return;
        }
        com.tencent.open.web.a.a(this.f44408k);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        WeakReference<Context> weakReference = this.f44403e;
        if (weakReference != null && weakReference.get() != null) {
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(this.f44403e.get().getApplicationContext().getDir("databases", 0).getPath());
        }
        settings.setDomStorageEnabled(true);
        this.f44484a.a(new JsListener(), "sdk_js_if");
        this.f44408k.loadUrl(this.f44404g);
        this.f44408k.setLayoutParams(f44400c);
        this.f44408k.setVisibility(4);
    }

    @Override // com.tencent.open.c
    public void a(String str) {
        SLog.d("openSDK_LOG.TDialog", "--onConsoleMessage--");
        try {
            this.f44484a.a(this.f44408k, str);
        } catch (Exception unused) {
        }
    }
}
