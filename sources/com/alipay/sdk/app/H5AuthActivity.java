package com.alipay.sdk.app;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class H5AuthActivity extends H5PayActivity {
    @Override // com.alipay.sdk.app.H5PayActivity
    public void a() {
        Object obj = AuthTask.f10400c;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }
}
