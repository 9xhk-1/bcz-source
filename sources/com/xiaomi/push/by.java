package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.aj;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
class by extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bw f45326a;

    public by(bw bwVar) {
        this.f45326a = bwVar;
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        return "10054";
    }

    @Override // java.lang.Runnable
    public void run() {
        String c11;
        Context context;
        Context context2;
        com.xiaomi.channel.commonutils.logger.b.c("exec== DbSizeControlJob");
        c11 = this.f45326a.c();
        context = this.f45326a.f182a;
        cb cbVar = new cb(c11, new WeakReference(context));
        context2 = this.f45326a.f182a;
        ci.a(context2).a(cbVar);
        this.f45326a.b("check_time");
    }
}
