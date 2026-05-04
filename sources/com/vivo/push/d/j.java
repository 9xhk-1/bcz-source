package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f44972a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f44973b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f44974c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f44975d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f44976e;

    public j(h hVar, int i11, List list, List list2, String str) {
        this.f44976e = hVar;
        this.f44972a = i11;
        this.f44973b = list;
        this.f44974c = list2;
        this.f44975d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        h hVar = this.f44976e;
        PushMessageCallback pushMessageCallback = ((z) hVar).f44994b;
        context = ((com.vivo.push.l) hVar).f45035a;
        pushMessageCallback.onDelAlias(context, this.f44972a, this.f44973b, this.f44974c, this.f44975d);
    }
}
