package com.zx.a.I8b7;

import com.zx.module.base.Listener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class p3 implements Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Listener f46653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t3 f46654b;

    public p3(t3 t3Var, Listener listener) {
        this.f46654b = t3Var;
        this.f46653a = listener;
    }

    @Override // com.zx.module.base.Listener
    public void onMessage(String str, String str2) {
        if (str.equals("zxid") || str.equals("MESSAGE_ON_ZXID_RECEIVED")) {
            this.f46654b.f46702a.set(false);
        }
        this.f46653a.onMessage(str, str2);
    }
}
