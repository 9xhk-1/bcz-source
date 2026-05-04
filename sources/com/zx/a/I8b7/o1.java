package com.zx.a.I8b7;

import com.zx.a.I8b7.n3;
import com.zx.module.base.Callback;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class o1 implements Runnable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callback {
        public a(o1 o1Var) {
        }

        @Override // com.zx.module.base.Callback
        public void callback(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 0) {
                    v1.b(jSONObject.getJSONObject("data").getString("type"), jSONObject.getJSONObject("data").getString("code"));
                }
            } catch (Throwable th2) {
                r2.a(th2);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            n3.b.f46628a.b(new JSONObject(), new a(this), 2);
        } catch (Throwable th2) {
            r2.a(th2);
        }
    }
}
