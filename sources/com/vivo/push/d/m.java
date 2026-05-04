package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.m f44977a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f44978b;

    public m(l lVar, com.vivo.push.b.m mVar) {
        this.f44978b = lVar;
        this.f44977a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        l lVar = this.f44978b;
        PushMessageCallback pushMessageCallback = ((z) lVar).f44994b;
        context = ((com.vivo.push.l) lVar).f45035a;
        pushMessageCallback.onListTags(context, this.f44977a.h(), this.f44977a.d(), this.f44977a.g());
    }
}
