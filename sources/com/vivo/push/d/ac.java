package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class ac implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f44957a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f44958b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f44959c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f44960d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aa f44961e;

    public ac(aa aaVar, int i11, List list, List list2, String str) {
        this.f44961e = aaVar;
        this.f44957a = i11;
        this.f44958b = list;
        this.f44959c = list2;
        this.f44960d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        aa aaVar = this.f44961e;
        PushMessageCallback pushMessageCallback = ((z) aaVar).f44994b;
        context = ((com.vivo.push.l) aaVar).f45035a;
        pushMessageCallback.onSetAlias(context, this.f44957a, this.f44958b, this.f44959c, this.f44960d);
    }
}
