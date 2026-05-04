package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UnvarnishedMessage f44981a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f44982b;

    public q(p pVar, UnvarnishedMessage unvarnishedMessage) {
        this.f44982b = pVar;
        this.f44981a = unvarnishedMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        p pVar = this.f44982b;
        PushMessageCallback pushMessageCallback = ((z) pVar).f44994b;
        context = ((com.vivo.push.l) pVar).f45035a;
        pushMessageCallback.onTransmissionMessage(context, this.f44981a);
    }
}
