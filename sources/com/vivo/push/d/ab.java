package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class ab implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f44952a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f44953b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f44954c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f44955d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aa f44956e;

    public ab(aa aaVar, int i11, List list, List list2, String str) {
        this.f44956e = aaVar;
        this.f44952a = i11;
        this.f44953b = list;
        this.f44954c = list2;
        this.f44955d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        aa aaVar = this.f44956e;
        PushMessageCallback pushMessageCallback = ((z) aaVar).f44994b;
        context = ((com.vivo.push.l) aaVar).f45035a;
        pushMessageCallback.onSetTags(context, this.f44952a, this.f44953b, this.f44954c, this.f44955d);
    }
}
