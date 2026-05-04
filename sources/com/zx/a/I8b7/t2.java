package com.zx.a.I8b7;

import android.content.Context;
import android.text.TextUtils;
import com.zx.a.I8b7.l2;
import com.zx.sdk.api.Callback;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class t2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f46700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callback f46701b;

    public t2(x2 x2Var, Context context, Callback callback) {
        this.f46700a = context;
        this.f46701b = callback;
    }

    @Override // java.lang.Runnable
    public void run() {
        String a11;
        try {
            Context context = this.f46700a;
            if (TextUtils.isEmpty(m3.f46594j) || "{}".equals(m3.f46594j)) {
                m3.f46585a = context.getApplicationContext();
                l2 l2Var = l2.a.f46573a;
                m3.a(l2Var.f46572a);
                a11 = l2Var.f46572a.a(16);
                m3.f46594j = a11;
            } else {
                a11 = m3.f46594j;
            }
            try {
                String optString = new JSONObject(a11).optString("openid");
                if ("OPENID_CLOSED".equals(optString)) {
                    this.f46701b.onFailed(10001, "未开通");
                    return;
                }
                Callback callback = this.f46701b;
                if (TextUtils.isEmpty(optString)) {
                    optString = "";
                }
                callback.onSuccess(optString);
            } catch (Throwable th2) {
                this.f46701b.onFailed(10000, th2.getMessage());
            }
        } catch (Throwable th3) {
            Callback callback2 = this.f46701b;
            if (callback2 != null) {
                callback2.onFailed(10000, th3.getMessage());
            }
            g3.a(th3, f3.a("ZXManager.getZXID(zxidListener) failed: "));
        }
    }
}
