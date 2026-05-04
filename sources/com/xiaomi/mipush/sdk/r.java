package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.dl;
import com.xiaomi.push.hh;
import com.xiaomi.push.hu;
import com.xiaomi.push.ig;

/* loaded from: classes6.dex */
public class r implements dl {

    /* renamed from: a, reason: collision with root package name */
    private Context f45230a;

    public r(Context context) {
        this.f45230a = context;
    }

    @Override // com.xiaomi.push.dl
    public String a() {
        return b.m5683a(this.f45230a).d();
    }

    @Override // com.xiaomi.push.dl
    public void a(ig igVar, hh hhVar, hu huVar) {
        ao.a(this.f45230a).a((ao) igVar, hhVar, huVar);
    }
}
