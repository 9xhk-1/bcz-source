package com.zx.a.I8b7;

import android.content.Context;
import android.text.TextUtils;
import com.zx.a.I8b7.v;
import com.zx.module.annotation.Java2C;
import com.zx.module.base.Callback;
import com.zx.module.base.ZXModule;
import com.zx.module.context.ContextHolder;
import com.zx.module.exception.ZXModuleInvokeException;
import com.zx.sdk.api.SAIDCallback;
import com.zx.sdk.api.ZXIDListener;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class h3 {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f46533e = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public ZXModule f46534a = null;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f46535b;

    /* renamed from: c, reason: collision with root package name */
    public final q2 f46536c;

    /* renamed from: d, reason: collision with root package name */
    public final p2 f46537d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ContextHolder {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f46538a;

        public a(h3 h3Var, Context context) {
            this.f46538a = context;
        }

        @Override // com.zx.module.context.ContextHolder
        public Object getContext() {
            return this.f46538a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SAIDCallback f46539a;

        public b(h3 h3Var, SAIDCallback sAIDCallback) {
            this.f46539a = sAIDCallback;
        }

        @Override // com.zx.module.base.Callback
        public void callback(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i11 = jSONObject.getInt("code");
                if (i11 == 0) {
                    this.f46539a.onSuccess(jSONObject.getString("data"));
                } else {
                    this.f46539a.onFailed(i11, jSONObject.optString("msg"));
                }
            } catch (Throwable th2) {
                r2.a(th2);
                SAIDCallback sAIDCallback = this.f46539a;
                if (sAIDCallback != null) {
                    sAIDCallback.onFailed(10000, th2.getMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.zx.sdk.api.Callback f46540a;

        public c(h3 h3Var, com.zx.sdk.api.Callback callback) {
            this.f46540a = callback;
        }

        @Override // com.zx.module.base.Callback
        public void callback(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i11 = jSONObject.getInt("code");
                if (i11 == 0) {
                    this.f46540a.onSuccess(jSONObject.getString("data"));
                } else {
                    this.f46540a.onFailed(i11, jSONObject.optString("data"));
                }
            } catch (Throwable th2) {
                r2.a(th2);
                com.zx.sdk.api.Callback callback = this.f46540a;
                if (callback != null) {
                    callback.onFailed(10000, th2.getMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.zx.sdk.api.Callback f46541a;

        public d(h3 h3Var, com.zx.sdk.api.Callback callback) {
            this.f46541a = callback;
        }

        @Override // com.zx.module.base.Callback
        public void callback(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i11 = jSONObject.getInt("code");
                if (i11 == 0) {
                    this.f46541a.onSuccess(jSONObject.getString("data"));
                } else {
                    this.f46541a.onFailed(i11, jSONObject.optString("data"));
                }
            } catch (Throwable th2) {
                r2.a(th2);
                com.zx.sdk.api.Callback callback = this.f46541a;
                if (callback != null) {
                    callback.onFailed(10000, th2.getMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final h3 f46542a = new h3();
    }

    public h3() {
        y0 y0Var = new y0();
        this.f46535b = y0Var;
        q2 q2Var = new q2();
        this.f46536c = q2Var;
        p2 p2Var = new p2();
        this.f46537d = p2Var;
        y0Var.a("MESSAGE_ON_ZXID_CHANGED", q2Var);
        y0Var.a("MESSAGE_ON_ZXID_RECEIVED", p2Var);
        try {
            a(m3.f46585a);
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXModule init failed: "));
        }
    }

    @Java2C.Method2C
    public native String a(String str, String str2, String str3, String str4, String str5, String str6, SAIDCallback sAIDCallback) throws ZXModuleInvokeException, JSONException;

    public void a(Context context) throws i2 {
        try {
            if (f46533e.getAndSet(true)) {
                return;
            }
            this.f46534a = v.a.f46716a.a(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", "3.3.4.43514");
            this.f46534a.invoke("setSDKVersion", jSONObject.toString());
            this.f46534a.onCreate(new a(this, context));
            this.f46534a.setMessageListener(this.f46535b);
        } catch (Exception e11) {
            f46533e.set(false);
            StringBuilder a11 = f3.a("Raised exception while initializing: ");
            a11.append(e11.getMessage());
            throw new i2(a11.toString(), e11);
        }
    }

    @Java2C.Method2C
    public native void a(String str, com.zx.sdk.api.Callback callback) throws ZXModuleInvokeException, JSONException;

    @Java2C.Method2C
    public native void a(boolean z11) throws ZXModuleInvokeException, JSONException;

    @Java2C.Method2C
    public native void b(String str, com.zx.sdk.api.Callback callback) throws ZXModuleInvokeException, JSONException;

    public void a() throws i2 {
        try {
            this.f46534a.start();
        } catch (Exception e11) {
            StringBuilder a11 = f3.a("Raised exception in start: ");
            a11.append(e11.getMessage());
            throw new i2(a11.toString(), e11);
        }
    }

    public void a(String str, ZXIDListener zXIDListener) throws i2 {
        if (zXIDListener != null) {
            try {
                p2 p2Var = this.f46537d;
                p2Var.getClass();
                if (!TextUtils.isEmpty(str)) {
                    LinkedList<ZXIDListener> linkedList = p2Var.f46652a.get(str);
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                    }
                    linkedList.add(zXIDListener);
                    p2Var.f46652a.put(str, linkedList);
                }
            } catch (Exception e11) {
                r2.a(e11);
                StringBuilder a11 = f3.a("Raised exception while getZXID: nested exception is ");
                a11.append(e11.getMessage());
                throw new i2(a11.toString(), e11);
            }
        }
        a();
    }
}
