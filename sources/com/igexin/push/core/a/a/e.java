package com.igexin.push.core.a.a;

import com.igexin.push.core.d;
import com.igexin.push.d.c.q;

/* loaded from: classes7.dex */
public final class e extends com.igexin.push.core.a.a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f37652b = com.igexin.push.config.c.f37542a + "_RegisterFailResultAction";

    @Override // com.igexin.push.core.a.a
    public final void a() {
    }

    @Override // com.igexin.push.core.a.a
    public final boolean c() {
        return false;
    }

    @Override // com.igexin.push.core.a.a
    public final boolean a(Object obj) {
        if ((obj instanceof q) && ((q) obj).f38511b == 1) {
            String str = f37652b;
            com.igexin.c.a.c.a.a(str, "Register failed because of the wrong appid");
            com.igexin.c.a.c.a.a(str + "|Register failed because of the wrong appid", new Object[0]);
            com.igexin.c.a.c.a.d.a().a("Register failed because of the wrong appid = " + com.igexin.push.core.e.f37998a);
            com.igexin.push.core.e.f38040q = true;
            d.a.f37956a.f37949h.b();
        }
        return true;
    }

    @Override // com.igexin.push.core.a.a
    public final void b() {
    }
}
