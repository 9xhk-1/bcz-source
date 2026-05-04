package com.igexin.push.core.a.a;

import com.igexin.push.core.k;
import com.igexin.push.d.c.h;

/* loaded from: classes7.dex */
public final class b extends com.igexin.push.core.a.a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f37648b = "KeyNegotiateResultAction";

    @Override // com.igexin.push.core.a.a
    public final void a() {
    }

    @Override // com.igexin.push.core.a.a
    public final boolean c() {
        return false;
    }

    @Override // com.igexin.push.core.a.a
    public final boolean a(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            boolean z11 = hVar.f38471b == 0;
            com.igexin.c.a.c.a.a("KeyNegotiateResultAction|KeyNego result = " + ((int) hVar.f38471b), new Object[0]);
            if (z11) {
                com.igexin.c.a.c.a.a("KeyNegotiateResultAction|KeyNego success and login", new Object[0]);
                k.a();
                k.c();
            }
        }
        return true;
    }

    @Override // com.igexin.push.core.a.a
    public final void b() {
    }
}
