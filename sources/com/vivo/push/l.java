package com.vivo.push;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected Context f45035a;

    /* renamed from: b, reason: collision with root package name */
    private int f45036b;

    /* renamed from: c, reason: collision with root package name */
    private o f45037c;

    public l(o oVar) {
        this.f45036b = -1;
        this.f45037c = oVar;
        int b11 = oVar.b();
        this.f45036b = b11;
        if (b11 < 0) {
            throw new IllegalArgumentException("PushTask need a > 0 task id.");
        }
        this.f45035a = e.a().h();
    }

    public final int a() {
        return this.f45036b;
    }

    public abstract void a(o oVar);

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f45035a;
        if (context != null && !(this.f45037c instanceof com.vivo.push.b.n)) {
            com.vivo.push.util.p.a(context, "[执行指令]" + this.f45037c);
        }
        a(this.f45037c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        o oVar = this.f45037c;
        sb2.append(oVar == null ? "[null]" : oVar.toString());
        sb2.append(com.alipay.sdk.m.u.i.f11099d);
        return sb2.toString();
    }
}
