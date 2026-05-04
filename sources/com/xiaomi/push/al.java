package com.xiaomi.push;

import com.xiaomi.push.aj;
import java.util.Map;

/* loaded from: classes8.dex */
class al extends aj.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f45252a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(aj ajVar, aj.a aVar) {
        super(aVar);
        this.f45252a = ajVar;
    }

    @Override // com.xiaomi.push.aj.b
    public void b() {
        Object obj;
        Map map;
        obj = this.f45252a.f128a;
        synchronized (obj) {
            map = this.f45252a.f129a;
            map.remove(super.f45250a.mo5759a());
        }
    }
}
