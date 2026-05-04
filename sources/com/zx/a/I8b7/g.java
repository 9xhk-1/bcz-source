package com.zx.a.I8b7;

import com.zx.a.I8b7.l2;
import com.zx.a.I8b7.n3;
import com.zx.module.base.Callback;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class g implements Runnable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callback {
        public a(g gVar) {
        }

        @Override // com.zx.module.base.Callback
        public void callback(String str) {
            try {
                if (new JSONObject(str).getInt("code") == 10010) {
                    l2 l2Var = l2.a.f46573a;
                    l2Var.f46572a.getClass();
                    l2Var.f46572a.a(322, str, true);
                    r2.a("isp net Err had changed refresh: value");
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
