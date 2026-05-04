package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.ec;
import com.xiaomi.push.hm;
import com.xiaomi.push.service.ba;

/* loaded from: classes6.dex */
final class q extends ba.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f45229a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i11, String str, Context context) {
        super(i11, str);
        this.f45229a = context;
    }

    @Override // com.xiaomi.push.service.ba.a
    public void onCallback() {
        ec.a(this.f45229a).a(ba.a(this.f45229a).a(hm.AwakeInfoUploadWaySwitch.a(), 0));
    }
}
