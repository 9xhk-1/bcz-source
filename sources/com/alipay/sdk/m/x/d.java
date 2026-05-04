package com.alipay.sdk.m.x;

import a90.c3;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.alipay.sdk.m.j.d;
import com.alipay.sdk.m.u.n;
import com.alipay.sdk.m.x.e;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.update.UpdateConstants;
import java.lang.ref.WeakReference;
import java.util.Map;
import ma.v;
import n6.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends com.alipay.sdk.m.x.c implements e.f, e.g, e.h {
    public static final String A = "action";
    public static final String B = "pushWindow";
    public static final String C = "h5JsFuncCallback";
    public static final String D = "sdkInfo";
    public static final String E = "canUseTaoLogin";
    public static final String F = "taoLogin";

    /* renamed from: l, reason: collision with root package name */
    public static final String f11166l = "sdk_result_code:";

    /* renamed from: m, reason: collision with root package name */
    public static final String f11167m = "alipayjsbridge://";

    /* renamed from: n, reason: collision with root package name */
    public static final String f11168n = "onBack";

    /* renamed from: o, reason: collision with root package name */
    public static final String f11169o = "setTitle";

    /* renamed from: p, reason: collision with root package name */
    public static final String f11170p = "onRefresh";

    /* renamed from: q, reason: collision with root package name */
    public static final String f11171q = "showBackButton";

    /* renamed from: r, reason: collision with root package name */
    public static final String f11172r = "onExit";

    /* renamed from: s, reason: collision with root package name */
    public static final String f11173s = "onLoadJs";

    /* renamed from: t, reason: collision with root package name */
    public static final String f11174t = "callNativeFunc";

    /* renamed from: u, reason: collision with root package name */
    public static final String f11175u = "back";

    /* renamed from: v, reason: collision with root package name */
    public static final String f11176v = "title";

    /* renamed from: w, reason: collision with root package name */
    public static final String f11177w = "refresh";

    /* renamed from: x, reason: collision with root package name */
    public static final String f11178x = "backButton";

    /* renamed from: y, reason: collision with root package name */
    public static final String f11179y = "refreshButton";

    /* renamed from: z, reason: collision with root package name */
    public static final String f11180z = "exit";

    /* renamed from: e, reason: collision with root package name */
    public boolean f11181e;

    /* renamed from: f, reason: collision with root package name */
    public String f11182f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11183g;

    /* renamed from: h, reason: collision with root package name */
    public final com.alipay.sdk.m.s.a f11184h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11185i;

    /* renamed from: j, reason: collision with root package name */
    public com.alipay.sdk.m.x.e f11186j;

    /* renamed from: k, reason: collision with root package name */
    public com.alipay.sdk.m.x.f f11187k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f11164a.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.alipay.sdk.m.x.e f11189a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.alipay.sdk.m.x.e eVar) {
            super(null);
            this.f11189a = eVar;
        }

        @Override // com.alipay.sdk.m.x.d.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f11189a.a();
            d.this.f11183g = false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.alipay.sdk.m.x.e f11191a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f11192b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.alipay.sdk.m.x.e eVar, String str) {
            super(null);
            this.f11191a = eVar;
            this.f11192b = str;
        }

        @Override // com.alipay.sdk.m.x.d.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d.this.removeView(this.f11191a);
            d.this.f11186j.a(this.f11192b);
            d.this.f11183g = false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.x.d$d, reason: collision with other inner class name */
    public class RunnableC0180d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f11194a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SslErrorHandler f11195b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.alipay.sdk.m.x.d$d$a */
        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                RunnableC0180d.this.f11195b.cancel();
                com.alipay.sdk.m.k.a.b(d.this.f11184h, com.alipay.sdk.m.k.b.f10651k, com.alipay.sdk.m.k.b.A, "2");
                com.alipay.sdk.m.j.b.a(com.alipay.sdk.m.j.b.a());
                RunnableC0180d.this.f11194a.finish();
            }
        }

        public RunnableC0180d(Activity activity, SslErrorHandler sslErrorHandler) {
            this.f11194a = activity;
            this.f11195b = sslErrorHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.alipay.sdk.m.x.b.a(this.f11194a, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。", "确定", new a(), null, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class e implements Animation.AnimationListener {
        public e() {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final f f11203a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11204b;

        public g(f fVar, String str) {
            this.f11203a = fVar;
            this.f11204b = str;
        }

        @Override // com.alipay.sdk.m.j.d.a
        public void a(boolean z11, JSONObject jSONObject, String str) {
            try {
                this.f11203a.a(new JSONObject().put("success", z11).put("random", this.f11204b).put("code", jSONObject).put("status", str));
            } catch (JSONException unused) {
            }
        }
    }

    public d(Activity activity, com.alipay.sdk.m.s.a aVar, String str) {
        super(activity, str);
        this.f11181e = true;
        this.f11182f = "GET";
        this.f11183g = false;
        this.f11186j = null;
        this.f11187k = new com.alipay.sdk.m.x.f();
        this.f11184h = aVar;
        g();
    }

    private synchronized boolean e() {
        try {
            if (this.f11187k.b()) {
                this.f11164a.finish();
            } else {
                this.f11183g = true;
                com.alipay.sdk.m.x.e eVar = this.f11186j;
                this.f11186j = this.f11187k.c();
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(400L);
                translateAnimation.setFillAfter(false);
                translateAnimation.setAnimationListener(new b(eVar));
                eVar.setAnimation(translateAnimation);
                removeView(eVar);
                addView(this.f11186j);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return true;
    }

    private synchronized void f() {
        try {
            Activity activity = this.f11164a;
            com.alipay.sdk.m.x.e eVar = this.f11186j;
            if (activity != null && eVar != null) {
                if (this.f11181e) {
                    activity.finish();
                } else {
                    eVar.a("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
                }
            }
        } finally {
        }
    }

    private synchronized boolean g() {
        try {
            com.alipay.sdk.m.x.e eVar = new com.alipay.sdk.m.x.e(this.f11164a, this.f11184h, new e.C0182e(!a(), !a()));
            this.f11186j = eVar;
            eVar.setChromeProxy(this);
            this.f11186j.setWebClientProxy(this);
            this.f11186j.setWebEventProxy(this);
            addView(this.f11186j);
        } catch (Exception unused) {
            return false;
        }
        return true;
    }

    private void h() {
        com.alipay.sdk.m.x.e eVar = this.f11186j;
        if (eVar != null) {
            eVar.getWebView().loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
        }
    }

    private synchronized void i() {
        try {
            WebView webView = this.f11186j.getWebView();
            if (webView.canGoBack()) {
                webView.goBack();
            } else {
                com.alipay.sdk.m.x.f fVar = this.f11187k;
                if (fVar == null || fVar.b()) {
                    a(false);
                } else {
                    e();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.alipay.sdk.m.x.c
    public synchronized void c() {
        this.f11186j.a();
        this.f11187k.a();
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean d(com.alipay.sdk.m.x.e eVar, String str) {
        com.alipay.sdk.m.k.a.a(this.f11184h, com.alipay.sdk.m.k.b.f10653l, "h5ld", SystemClock.elapsedRealtime() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + n.i(str));
        if (!TextUtils.isEmpty(str) && !str.endsWith(UpdateConstants.LOCAL_APK_FILE)) {
            h();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public synchronized boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f11183g ? true : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.alipay.sdk.m.x.c
    public synchronized boolean b() {
        try {
            Activity activity = this.f11164a;
            if (activity == null) {
                return true;
            }
            if (!a()) {
                if (!this.f11183g) {
                    f();
                }
                return true;
            }
            com.alipay.sdk.m.x.e eVar = this.f11186j;
            if (eVar != null && eVar.getWebView() != null) {
                if (!eVar.getWebView().canGoBack()) {
                    com.alipay.sdk.m.j.b.a(com.alipay.sdk.m.j.b.a());
                    activity.finish();
                } else if (d()) {
                    com.alipay.sdk.m.j.c b11 = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.NETWORK_ERROR.b());
                    com.alipay.sdk.m.j.b.a(com.alipay.sdk.m.j.b.a(b11.b(), b11.a(), ""));
                    activity.finish();
                }
                return true;
            }
            activity.finish();
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(String str, String str2, boolean z11) {
        this.f11182f = str2;
        this.f11186j.getTitle().setText(str);
        this.f11181e = z11;
    }

    @Override // com.alipay.sdk.m.x.e.f
    public synchronized void c(com.alipay.sdk.m.x.e eVar, String str) {
        if (!str.startsWith("http") && !eVar.getUrl().endsWith(str)) {
            this.f11186j.getTitle().setText(str);
        }
    }

    public boolean d() {
        return this.f11185i;
    }

    private synchronized void a(boolean z11) {
        com.alipay.sdk.m.j.b.a(z11);
        this.f11164a.finish();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<com.alipay.sdk.m.x.e> f11198a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11199b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11200c;

        /* renamed from: d, reason: collision with root package name */
        public final JSONObject f11201d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f11202e = false;

        public f(com.alipay.sdk.m.x.e eVar, String str, String str2, JSONObject jSONObject) {
            this.f11198a = new WeakReference<>(eVar);
            this.f11199b = str;
            this.f11200c = str2;
            this.f11201d = jSONObject;
        }

        public void a(JSONObject jSONObject) {
            com.alipay.sdk.m.x.e eVar;
            if (this.f11202e || (eVar = (com.alipay.sdk.m.x.e) n.a(this.f11198a)) == null) {
                return;
            }
            this.f11202e = true;
            eVar.a(String.format("javascript:window.AlipayJSBridge.callBackFromNativeFunc('%s','%s');", a(this.f11200c), a(jSONObject.toString())));
        }

        public static String a(String str) {
            return TextUtils.isEmpty(str) ? "" : str.replace("'", "");
        }
    }

    @Override // com.alipay.sdk.m.x.c
    public synchronized void a(String str) {
        try {
            if ("POST".equals(this.f11182f)) {
                this.f11186j.a(str, (byte[]) null);
            } else {
                this.f11186j.a(str);
            }
            com.alipay.sdk.m.x.c.a(this.f11186j.getWebView());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.alipay.sdk.m.x.e.f
    public synchronized boolean a(com.alipay.sdk.m.x.e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        try {
            if (str2.startsWith("<head>") && str2.contains(f11166l)) {
                this.f11164a.runOnUiThread(new a());
            }
            jsPromptResult.cancel();
        } catch (Throwable th2) {
            throw th2;
        }
        return true;
    }

    private synchronized boolean b(String str, String str2) {
        com.alipay.sdk.m.x.e eVar = this.f11186j;
        try {
            com.alipay.sdk.m.x.e eVar2 = new com.alipay.sdk.m.x.e(this.f11164a, this.f11184h, new e.C0182e(!a(), !a()));
            this.f11186j = eVar2;
            eVar2.setChromeProxy(this);
            this.f11186j.setWebClientProxy(this);
            this.f11186j.setWebEventProxy(this);
            if (!TextUtils.isEmpty(str2)) {
                this.f11186j.getTitle().setText(str2);
            }
            this.f11183g = true;
            this.f11187k.a(eVar);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new c(eVar, str));
            this.f11186j.setAnimation(translateAnimation);
            addView(this.f11186j);
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean a(com.alipay.sdk.m.x.e eVar, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Activity activity = this.f11164a;
            if (activity == null) {
                return true;
            }
            if (n.a(this.f11184h, str, activity)) {
                return true;
            }
            if (str.startsWith(f11167m)) {
                b(str.substring(17));
            } else if (TextUtils.equals(str, com.alipay.sdk.m.l.a.f10714q)) {
                a(false);
            } else if (!str.startsWith("http://") && !str.startsWith("https://")) {
                try {
                    Intent intent = new Intent();
                    intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                    intent.setData(Uri.parse(str));
                    activity.startActivity(intent);
                } catch (Throwable th2) {
                    com.alipay.sdk.m.k.a.a(this.f11184h, com.alipay.sdk.m.k.b.f10653l, th2);
                }
            } else {
                this.f11186j.a(str);
            }
            return true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean a(com.alipay.sdk.m.x.e eVar, int i11, String str, String str2) {
        this.f11185i = true;
        com.alipay.sdk.m.k.a.b(this.f11184h, com.alipay.sdk.m.k.b.f10651k, com.alipay.sdk.m.k.b.f10679y, "onReceivedError:" + i11 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2);
        eVar.getRefreshButton().setVisibility(0);
        return false;
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean b(com.alipay.sdk.m.x.e eVar, String str) {
        com.alipay.sdk.m.k.a.a(this.f11184h, com.alipay.sdk.m.k.b.f10653l, "h5ldd", SystemClock.elapsedRealtime() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + n.i(str));
        h();
        eVar.getRefreshButton().setVisibility(0);
        return true;
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean a(com.alipay.sdk.m.x.e eVar, SslErrorHandler sslErrorHandler, SslError sslError) {
        Activity activity = this.f11164a;
        if (activity == null) {
            return true;
        }
        com.alipay.sdk.m.k.a.b(this.f11184h, com.alipay.sdk.m.k.b.f10651k, com.alipay.sdk.m.k.b.f10681z, "2-" + sslError);
        activity.runOnUiThread(new RunnableC0180d(activity, sslErrorHandler));
        return true;
    }

    private synchronized void b(String str) {
        try {
            Map<String, String> b11 = n.b(this.f11184h, str);
            if (str.startsWith(f11174t)) {
                a(b11.get("func"), b11.get("cbId"), b11.get("data"));
            } else if (str.startsWith(f11168n)) {
                i();
            } else if (str.startsWith(f11169o) && b11.containsKey("title")) {
                this.f11186j.getTitle().setText(b11.get("title"));
            } else if (str.startsWith(f11170p)) {
                this.f11186j.getWebView().reload();
            } else if (str.startsWith(f11171q) && b11.containsKey("bshow")) {
                this.f11186j.getBackButton().setVisibility(TextUtils.equals(m.f74525c, b11.get("bshow")) ? 0 : 4);
            } else if (str.startsWith(f11172r)) {
                com.alipay.sdk.m.j.b.a(b11.get("result"));
                a(TextUtils.equals(m.f74525c, b11.get("bsucc")));
            } else if (str.startsWith(f11173s)) {
                this.f11186j.a("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private synchronized void a(String str, String str2, String str3) {
        com.alipay.sdk.m.x.e eVar;
        try {
            eVar = this.f11186j;
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(this.f11184h, com.alipay.sdk.m.k.b.f10653l, "jInfoErr", th2, str);
        } finally {
        }
        if (eVar == null) {
            return;
        }
        JSONObject h11 = n.h(str3);
        f fVar = new f(eVar, str, str2, h11);
        Context context = eVar.getContext();
        String str4 = fVar.f11199b;
        switch (str4.hashCode()) {
            case -1785164386:
                if (str4.equals(E)) {
                    String url = eVar.getUrl();
                    if (!n.a(this.f11184h, url)) {
                        com.alipay.sdk.m.k.a.b(this.f11184h, com.alipay.sdk.m.k.b.f10653l, "jsUrlErr", url);
                        break;
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        boolean a11 = com.alipay.sdk.m.j.d.a(this.f11184h, context);
                        jSONObject.put(c3.f2342e, a11);
                        com.alipay.sdk.m.k.a.a(this.f11184h, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10670t0, String.valueOf(a11));
                        fVar.a(jSONObject);
                        break;
                    }
                }
                break;
            case -552487705:
                if (str4.equals(F)) {
                    String url2 = eVar.getUrl();
                    if (!n.a(this.f11184h, url2)) {
                        com.alipay.sdk.m.k.a.b(this.f11184h, com.alipay.sdk.m.k.b.f10653l, "jsUrlErr", url2);
                        break;
                    } else {
                        String optString = h11.optString("random");
                        JSONObject optJSONObject = h11.optJSONObject("options");
                        if (!TextUtils.isEmpty("random") && optJSONObject != null) {
                            String optString2 = optJSONObject.optString("url");
                            String optString3 = optJSONObject.optString("action");
                            if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && (context instanceof Activity)) {
                                com.alipay.sdk.m.j.d.a(this.f11184h, (Activity) context, 1010, optString2, optString3, new g(fVar, optString));
                                break;
                            }
                        }
                    }
                }
                break;
            case 3015911:
                if (str4.equals(f11175u)) {
                    i();
                    break;
                }
                break;
            case 3127582:
                if (str4.equals("exit")) {
                    com.alipay.sdk.m.j.b.a(h11.optString("result", null));
                    a(h11.optBoolean("success", false));
                    break;
                }
                break;
            case 110371416:
                if (str4.equals("title") && h11.has("title")) {
                    eVar.getTitle().setText(h11.optString("title", ""));
                    break;
                }
                break;
            case 1085444827:
                if (str4.equals(f11177w)) {
                    eVar.getWebView().reload();
                    break;
                }
                break;
            case 1703426986:
                if (str4.equals(B)) {
                    b(h11.optString("url"), h11.optString("title", ""));
                    break;
                }
                break;
            case 1906413305:
                if (str4.equals(f11178x)) {
                    eVar.getBackButton().setVisibility(h11.optBoolean(v.f73050u, true) ? 0 : 4);
                    break;
                }
                break;
            case 1947723784:
                if (str4.equals(D)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sdk_version", "15.8.15");
                    jSONObject2.put("app_name", this.f11184h.b());
                    jSONObject2.put("app_version", this.f11184h.c());
                    fVar.a(jSONObject2);
                    break;
                }
                break;
            case 2033767917:
                if (str4.equals(f11179y)) {
                    eVar.getRefreshButton().setVisibility(h11.optBoolean(v.f73050u, true) ? 0 : 4);
                    break;
                }
                break;
        }
    }

    @Override // com.alipay.sdk.m.x.e.h
    public synchronized void b(com.alipay.sdk.m.x.e eVar) {
        f();
    }

    @Override // com.alipay.sdk.m.x.e.h
    public synchronized void a(com.alipay.sdk.m.x.e eVar) {
        eVar.getWebView().reload();
        eVar.getRefreshButton().setVisibility(4);
    }
}
