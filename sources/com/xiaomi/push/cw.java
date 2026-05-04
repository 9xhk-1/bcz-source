package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
class cw extends cq {

    /* renamed from: a, reason: collision with root package name */
    cq f45369a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ cu f230a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cq f45370b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(cu cuVar, String str, cq cqVar) {
        super(str);
        this.f230a = cuVar;
        this.f45370b = cqVar;
        this.f45369a = cqVar;
        ((cq) this).f216b = ((cq) this).f216b;
        if (cqVar != null) {
            this.f45357f = cqVar.f45357f;
        }
    }

    @Override // com.xiaomi.push.cq
    public synchronized ArrayList<String> a(boolean z11) {
        ArrayList<String> arrayList;
        try {
            arrayList = new ArrayList<>();
            cq cqVar = this.f45369a;
            if (cqVar != null) {
                arrayList.addAll(cqVar.a(true));
            }
            Map<String, cq> map = cu.f45365b;
            synchronized (map) {
                try {
                    cq cqVar2 = map.get(((cq) this).f216b);
                    if (cqVar2 != null) {
                        Iterator<String> it = cqVar2.a(true).iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            if (arrayList.indexOf(next) == -1) {
                                arrayList.add(next);
                            }
                        }
                        arrayList.remove(((cq) this).f216b);
                        arrayList.add(((cq) this).f216b);
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @Override // com.xiaomi.push.cq
    public boolean b() {
        return false;
    }

    @Override // com.xiaomi.push.cq
    public synchronized void a(String str, cp cpVar) {
        cq cqVar = this.f45369a;
        if (cqVar != null) {
            cqVar.a(str, cpVar);
        }
    }
}
