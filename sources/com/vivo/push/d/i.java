package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f44967a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f44968b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f44969c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f44970d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f44971e;

    public i(h hVar, int i11, List list, List list2, String str) {
        this.f44971e = hVar;
        this.f44967a = i11;
        this.f44968b = list;
        this.f44969c = list2;
        this.f44970d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        h hVar = this.f44971e;
        PushMessageCallback pushMessageCallback = ((z) hVar).f44994b;
        context = ((com.vivo.push.l) hVar).f45035a;
        pushMessageCallback.onDelTags(context, this.f44967a, this.f44968b, this.f44969c, this.f44970d);
    }
}
