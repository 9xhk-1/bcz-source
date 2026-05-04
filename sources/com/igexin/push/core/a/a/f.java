package com.igexin.push.core.a.a;

import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.push.core.d;
import com.igexin.push.core.k;
import com.igexin.push.d.c.i;
import com.igexin.push.d.c.p;

/* loaded from: classes7.dex */
public final class f extends com.igexin.push.core.a.a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f37653b = "RegisterResult";

    @Override // com.igexin.push.core.a.a
    public final void a() {
    }

    @Override // com.igexin.push.core.a.a
    public final boolean c() {
        return false;
    }

    @Override // com.igexin.push.core.a.a
    public final boolean a(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            com.igexin.push.core.e.b(0L);
            com.igexin.c.a.c.a.a("register resp |" + pVar.f38506b + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + com.igexin.push.core.e.f38049z, new Object[0]);
            com.igexin.c.a.c.a.a("register resp cid = " + pVar.f38508d + " device id = " + pVar.f38509e, new Object[0]);
            if (pVar.f38506b != com.igexin.push.core.e.f38049z) {
                com.igexin.push.core.e.f38045v = false;
                com.igexin.c.a.c.a.a(f37653b, "change session : from [" + com.igexin.push.core.e.f38049z + "] to [" + pVar.f38506b + "]");
                com.igexin.c.a.c.a.a("RegisterResult change session : from [" + com.igexin.push.core.e.f38049z + "] to [" + pVar.f38506b + "]", new Object[0]);
                com.igexin.c.a.c.a.a(f37653b, "change cid : from [" + com.igexin.push.core.e.A + "] to [" + pVar.f38508d + "]");
                com.igexin.c.a.c.a.a("RegisterResult change cid : from [" + com.igexin.push.core.e.A + "] to [" + pVar.f38508d + "]", new Object[0]);
                if (TextUtils.isEmpty(pVar.f38508d) || TextUtils.isEmpty(pVar.f38509e)) {
                    com.igexin.push.core.e.f.a().a(pVar.f38506b);
                } else {
                    com.igexin.push.core.e.f a11 = com.igexin.push.core.e.f.a();
                    String str = pVar.f38508d;
                    String str2 = pVar.f38509e;
                    com.igexin.push.core.e.f38049z = pVar.f38506b;
                    if (TextUtils.isEmpty(com.igexin.push.core.e.H)) {
                        com.igexin.push.core.e.H = str2;
                    }
                    com.igexin.push.core.e.A = str;
                    a11.c();
                }
                com.igexin.push.core.e.Q = 0L;
            }
            long j11 = com.igexin.push.core.e.f38049z;
            String str3 = com.igexin.push.core.e.A;
            String str4 = com.igexin.push.core.e.H;
            com.igexin.c.a.c.a.a("loginReqAfterRegister|new session:" + com.igexin.push.core.e.f38049z + ", cid :" + com.igexin.push.core.e.A + ", devId :" + com.igexin.push.core.e.H, new Object[0]);
            k.a();
            i d11 = k.d();
            com.igexin.push.e.a aVar = d.a.f37956a.f37949h;
            StringBuilder sb2 = new StringBuilder("S-");
            sb2.append(d11.f38474b);
            aVar.a(sb2.toString(), d11, true);
        }
        return true;
    }

    @Override // com.igexin.push.core.a.a
    public final void b() {
    }
}
