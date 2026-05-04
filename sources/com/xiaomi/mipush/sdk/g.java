package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.hm;
import com.xiaomi.push.service.ba;

/* loaded from: classes6.dex */
class g extends ba.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f45219a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, int i11, String str) {
        super(i11, str);
        this.f45219a = fVar;
    }

    @Override // com.xiaomi.push.service.ba.a
    public void onCallback() {
        Context context;
        boolean z11;
        Context context2;
        context = this.f45219a.f110a;
        boolean a11 = ba.a(context).a(hm.AggregatePushSwitch.a(), true);
        z11 = this.f45219a.f113a;
        if (z11 != a11) {
            this.f45219a.f113a = a11;
            context2 = this.f45219a.f110a;
            i.b(context2);
        }
    }
}
