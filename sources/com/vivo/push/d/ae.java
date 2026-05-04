package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class ae implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.i f44962a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f44963b;

    public ae(ad adVar, com.vivo.push.b.i iVar) {
        this.f44963b = adVar;
        this.f44962a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        ad adVar = this.f44963b;
        PushMessageCallback pushMessageCallback = ((z) adVar).f44994b;
        context = ((com.vivo.push.l) adVar).f45035a;
        pushMessageCallback.onUnBind(context, this.f44962a.h(), this.f44962a.d());
    }
}
