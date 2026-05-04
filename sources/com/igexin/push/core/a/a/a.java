package com.igexin.push.core.a.a;

import com.igexin.push.core.j;
import com.igexin.push.d.c;

/* loaded from: classes7.dex */
public final class a extends com.igexin.push.core.a.a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f37647b = "HeartbeatAction";

    @Override // com.igexin.push.core.a.a
    public final void a() {
    }

    @Override // com.igexin.push.core.a.a
    public final boolean c() {
        return false;
    }

    @Override // com.igexin.push.core.a.a
    public final boolean a(Object obj) {
        if (!(obj instanceof com.igexin.push.d.c.f)) {
            return true;
        }
        c.b.f38428a.d();
        com.igexin.c.a.c.a.a("heartbeatRsp", new Object[0]);
        j.a().a(j.a.f38319a);
        return true;
    }

    @Override // com.igexin.push.core.a.a
    public final void b() {
    }
}
