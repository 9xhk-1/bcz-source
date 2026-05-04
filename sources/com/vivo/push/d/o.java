package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.n f44979a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f44980b;

    public o(n nVar, com.vivo.push.b.n nVar2) {
        this.f44980b = nVar;
        this.f44979a = nVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        n nVar = this.f44980b;
        PushMessageCallback pushMessageCallback = ((z) nVar).f44994b;
        context = ((com.vivo.push.l) nVar).f45035a;
        pushMessageCallback.onLog(context, this.f44979a.d(), this.f44979a.e(), this.f44979a.f());
    }
}
