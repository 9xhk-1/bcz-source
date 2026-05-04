package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.ci;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class cb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private String f45331a;

    /* renamed from: a, reason: collision with other field name */
    private WeakReference<Context> f193a;

    public cb(String str, WeakReference<Context> weakReference) {
        this.f45331a = str;
        this.f193a = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        WeakReference<Context> weakReference = this.f193a;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        if (co.a(this.f45331a) <= ca.f191a) {
            com.xiaomi.channel.commonutils.logger.b.b("=====> do not need clean db");
            return;
        }
        ce a11 = ce.a(this.f45331a);
        cd a12 = cd.a(this.f45331a);
        a11.a(a12);
        a12.a(cc.a(context, this.f45331a, 1000));
        ci.a(context).a((ci.a) a11);
    }
}
