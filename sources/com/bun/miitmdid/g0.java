package com.bun.miitmdid;

import android.content.Context;
import com.bun.lib.MsaIdInterface;

/* loaded from: classes6.dex */
public class g0 extends m {

    /* renamed from: a, reason: collision with root package name */
    public Context f28925a;

    /* renamed from: b, reason: collision with root package name */
    public String f28926b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f28927c;

    public class a implements e0 {
        public a() {
        }

        @Override // com.bun.miitmdid.e0
        public native void a(MsaIdInterface msaIdInterface);
    }

    public g0(Context context) {
        i0.c("ZteProvider", "ZteProvider(Context)");
        this.f28925a = context;
        this.f28926b = context.getPackageName();
        try {
        } catch (Exception unused) {
            i0.d("ZteProvider", "Constructor: MsaService not found");
        }
        if (context.getPackageManager().getPackageInfo("com.mdid.msa", 0) == null) {
            i0.d("ZteProvider", "Constructor: getPackageInfo is null");
            throw new NullPointerException("Constructor: getPackageInfo is null");
        }
        try {
            d0.a(this.f28925a, this.f28926b);
            i0.c("ZteProvider", "Constructor: MsaService start success");
        } catch (Exception e11) {
            i0.b("ZteProvider", "Constructor: MsaService start Exception: " + e11.getMessage());
        }
    }

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public void doStart() {
        i0.c("ZteProvider", "doStart()");
        try {
            this.f28925a = checkContext(this.f28925a);
            doAsyncCallBefore();
            d0 d0Var = new d0(this.f28925a, new a());
            this.f28927c = d0Var;
            d0Var.a(this.f28926b);
            i0.c("ZteProvider", "doStart: BindService success");
            doAsyncCallAfter();
        } catch (Exception e11) {
            i0.d("ZteProvider", "doStart: Exception: " + e11.getMessage());
            cleanCache();
            onSupportCache();
        }
    }

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public void shutDown() {
        d0 d0Var = this.f28927c;
        if (d0Var != null) {
            d0Var.e();
        }
    }
}
