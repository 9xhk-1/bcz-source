package com.vivo.push;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.z;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f45022a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f45023b;

    public f(e eVar, String str) {
        this.f45023b = eVar;
        this.f45022a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        Context context3;
        context = this.f45023b.f45002h;
        if (context == null || TextUtils.isEmpty(this.f45022a)) {
            return;
        }
        context2 = this.f45023b.f45002h;
        context3 = this.f45023b.f45002h;
        if (z.b(context2, context3.getPackageName(), this.f45022a)) {
            this.f45023b.i();
        }
    }
}
