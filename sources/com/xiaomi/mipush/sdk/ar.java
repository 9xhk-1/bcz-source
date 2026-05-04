package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.bi;
import com.xiaomi.push.service.bn;

/* loaded from: classes6.dex */
class ar extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f45195a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(ao aoVar, Handler handler) {
        super(handler);
        this.f45195a = aoVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z11) {
        Context context;
        Integer num;
        Context context2;
        Context context3;
        ao aoVar = this.f45195a;
        context = aoVar.f87a;
        aoVar.f91a = Integer.valueOf(bn.a(context).a());
        num = this.f45195a.f91a;
        if (num.intValue() != 0) {
            context2 = this.f45195a.f87a;
            context2.getContentResolver().unregisterContentObserver(this);
            context3 = this.f45195a.f87a;
            if (bi.b(context3)) {
                this.f45195a.m5680c();
            }
        }
    }
}
