package com.xiaomi.push;

import com.xiaomi.push.aj;
import com.xiaomi.push.ci;
import java.util.ArrayList;

/* loaded from: classes8.dex */
class cj extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ci f45346a;

    public cj(ci ciVar) {
        this.f45346a = ciVar;
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        return "100957";
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList<ci.a> arrayList6;
        arrayList = this.f45346a.f197a;
        synchronized (arrayList) {
            try {
                arrayList2 = this.f45346a.f197a;
                if (arrayList2.size() > 0) {
                    arrayList3 = this.f45346a.f197a;
                    if (arrayList3.size() > 1) {
                        ci ciVar = this.f45346a;
                        arrayList6 = ciVar.f197a;
                        ciVar.a(arrayList6);
                    } else {
                        ci ciVar2 = this.f45346a;
                        arrayList4 = ciVar2.f197a;
                        ciVar2.b((ci.a) arrayList4.get(0));
                    }
                    arrayList5 = this.f45346a.f197a;
                    arrayList5.clear();
                    System.gc();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
