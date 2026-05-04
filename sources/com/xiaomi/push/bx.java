package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.aj;

/* loaded from: classes8.dex */
class bx extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bw f45325a;

    public bx(bw bwVar) {
        this.f45325a = bwVar;
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        return "10052";
    }

    @Override // java.lang.Runnable
    public void run() {
        cm cmVar;
        cm cmVar2;
        Context context;
        com.xiaomi.channel.commonutils.logger.b.c("exec== mUploadJob");
        cmVar = this.f45325a.f185a;
        if (cmVar != null) {
            cmVar2 = this.f45325a.f185a;
            context = this.f45325a.f182a;
            cmVar2.a(context);
            this.f45325a.b("upload_time");
        }
    }
}
