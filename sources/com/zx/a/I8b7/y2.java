package com.zx.a.I8b7;

import com.zx.sdk.api.SAIDCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class y2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f46757c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f46758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f46759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f46760f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SAIDCallback f46761g;

    public y2(x2 x2Var, String str, String str2, String str3, String str4, String str5, String str6, SAIDCallback sAIDCallback) {
        this.f46755a = str;
        this.f46756b = str2;
        this.f46757c = str3;
        this.f46758d = str4;
        this.f46759e = str5;
        this.f46760f = str6;
        this.f46761g = sAIDCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            x2.a().a(this.f46755a, this.f46756b, this.f46757c, this.f46758d, this.f46759e, this.f46760f, this.f46761g);
        } catch (Throwable th2) {
            SAIDCallback sAIDCallback = this.f46761g;
            if (sAIDCallback != null) {
                sAIDCallback.onFailed(10000, th2.getMessage());
            }
            g3.a(th2, f3.a("ZXManager.getSAID() failed: "));
        }
    }
}
