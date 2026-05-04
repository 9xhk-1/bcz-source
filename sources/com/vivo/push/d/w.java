package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPSNotificationMessage f44990a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f44991b;

    public w(u uVar, UPSNotificationMessage uPSNotificationMessage) {
        this.f44991b = uVar;
        this.f44990a = uPSNotificationMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        u uVar = this.f44991b;
        PushMessageCallback pushMessageCallback = ((z) uVar).f44994b;
        context = ((com.vivo.push.l) uVar).f45035a;
        pushMessageCallback.onNotificationMessageClicked(context, this.f44990a);
    }
}
