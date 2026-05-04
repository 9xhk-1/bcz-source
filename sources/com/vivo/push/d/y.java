package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.r f44992a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f44993b;

    public y(x xVar, com.vivo.push.b.r rVar) {
        this.f44993b = xVar;
        this.f44992a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        x xVar = this.f44993b;
        PushMessageCallback pushMessageCallback = ((z) xVar).f44994b;
        context = ((com.vivo.push.l) xVar).f45035a;
        pushMessageCallback.onPublish(context, this.f44992a.h(), this.f44992a.g());
    }
}
