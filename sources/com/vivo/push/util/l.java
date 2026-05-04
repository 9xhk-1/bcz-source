package com.vivo.push.util;

import android.content.Context;
import com.vivo.push.d.r;
import com.vivo.push.model.InsideNotificationItem;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f45110a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f45111b;

    public l(k kVar, List list) {
        this.f45111b = kVar;
        this.f45110a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InsideNotificationItem insideNotificationItem;
        long j11;
        Context context;
        InsideNotificationItem insideNotificationItem2;
        long j12;
        int i11;
        r.a aVar;
        insideNotificationItem = this.f45111b.f45105b;
        if (insideNotificationItem != null) {
            w b11 = w.b();
            j11 = this.f45111b.f45106c;
            b11.a("com.vivo.push.notify_key", j11);
            context = this.f45111b.f45104a;
            List list = this.f45110a;
            insideNotificationItem2 = this.f45111b.f45105b;
            j12 = this.f45111b.f45106c;
            i11 = this.f45111b.f45108e;
            aVar = this.f45111b.f45109f;
            NotifyAdapterUtil.pushNotification(context, list, insideNotificationItem2, j12, i11, aVar);
        }
    }
}
