package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.aj;

/* loaded from: classes8.dex */
class bz extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bw f45327a;

    public bz(bw bwVar) {
        this.f45327a = bwVar;
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        return "10053";
    }

    @Override // java.lang.Runnable
    public void run() {
        cm cmVar;
        cm cmVar2;
        Context context;
        cmVar = this.f45327a.f185a;
        if (cmVar != null) {
            cmVar2 = this.f45327a.f185a;
            context = this.f45327a.f182a;
            cmVar2.b(context);
            this.f45327a.b("delete_time");
        }
    }
}
