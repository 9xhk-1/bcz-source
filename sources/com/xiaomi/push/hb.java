package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.am;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
final class hb extends am.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f45707a;

    public hb(Context context) {
        this.f45707a = context;
    }

    @Override // com.xiaomi.push.am.b
    public void b() {
        Object obj;
        ArrayList arrayList;
        List list;
        List list2;
        obj = ha.f488a;
        synchronized (obj) {
            list = ha.f490a;
            arrayList = new ArrayList(list);
            list2 = ha.f490a;
            list2.clear();
        }
        ha.b(this.f45707a, arrayList);
    }
}
