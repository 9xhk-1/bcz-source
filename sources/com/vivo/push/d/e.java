package com.vivo.push.d;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f44964a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.i f44965b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f44966c;

    public e(d dVar, String str, com.vivo.push.b.i iVar) {
        this.f44966c = dVar;
        this.f44964a = str;
        this.f44965b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        if (!TextUtils.isEmpty(this.f44964a)) {
            d dVar = this.f44966c;
            PushMessageCallback pushMessageCallback = ((z) dVar).f44994b;
            context2 = ((com.vivo.push.l) dVar).f45035a;
            pushMessageCallback.onReceiveRegId(context2, this.f44964a);
        }
        d dVar2 = this.f44966c;
        PushMessageCallback pushMessageCallback2 = ((z) dVar2).f44994b;
        context = ((com.vivo.push.l) dVar2).f45035a;
        pushMessageCallback2.onBind(context, this.f44965b.h(), this.f44965b.d());
    }
}
