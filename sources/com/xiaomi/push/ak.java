package com.xiaomi.push;

import android.content.SharedPreferences;
import com.xiaomi.push.aj;

/* loaded from: classes8.dex */
class ak extends aj.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f45251a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f131a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ boolean f132a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(aj ajVar, aj.a aVar, boolean z11, String str) {
        super(aVar);
        this.f45251a = ajVar;
        this.f132a = z11;
        this.f131a = str;
    }

    @Override // com.xiaomi.push.aj.b
    public void a() {
        super.a();
    }

    @Override // com.xiaomi.push.aj.b
    public void b() {
        SharedPreferences sharedPreferences;
        if (this.f132a) {
            return;
        }
        sharedPreferences = this.f45251a.f127a;
        sharedPreferences.edit().putLong(this.f131a, System.currentTimeMillis()).commit();
    }
}
