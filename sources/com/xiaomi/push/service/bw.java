package com.xiaomi.push.service;

import android.util.Base64;
import com.xiaomi.push.am;
import com.xiaomi.push.cy;
import com.xiaomi.push.dv;
import com.xiaomi.push.service.bv;
import java.util.List;

/* loaded from: classes8.dex */
class bw extends am.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bv f46342a;

    /* renamed from: a, reason: collision with other field name */
    boolean f986a = false;

    public bw(bv bvVar) {
        this.f46342a = bvVar;
    }

    @Override // com.xiaomi.push.am.b
    public void b() {
        try {
            dv.a a11 = dv.a.a(Base64.decode(cy.a(com.xiaomi.push.s.m6183a(), "https://resolver.msg.xiaomi.net/psc/?t=a", (List<com.xiaomi.push.bh>) null), 10));
            if (a11 != null) {
                this.f46342a.f984a = a11;
                this.f986a = true;
                this.f46342a.e();
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("fetch config failure: " + e11.getMessage());
        }
    }

    @Override // com.xiaomi.push.am.b
    /* renamed from: c */
    public void mo5820c() {
        List list;
        List list2;
        bv.a[] aVarArr;
        dv.a aVar;
        this.f46342a.f983a = null;
        if (this.f986a) {
            synchronized (this.f46342a) {
                list = this.f46342a.f985a;
                list2 = this.f46342a.f985a;
                aVarArr = (bv.a[]) list.toArray(new bv.a[list2.size()]);
            }
            for (bv.a aVar2 : aVarArr) {
                aVar = this.f46342a.f984a;
                aVar2.a(aVar);
            }
        }
    }
}
