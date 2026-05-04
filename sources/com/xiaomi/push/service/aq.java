package com.xiaomi.push.service;

import com.xiaomi.push.fi;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
final class aq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f46251a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ boolean f938a;

    public aq(List list, boolean z11) {
        this.f46251a = list;
        this.f938a = z11;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean b11;
        boolean b12;
        b11 = ap.b("www.baidu.com:80");
        Iterator it = this.f46251a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (!b11) {
                b12 = ap.b(str);
                if (!b12) {
                    b11 = false;
                    if (!b11 && !this.f938a) {
                        break;
                    }
                }
            }
            b11 = true;
            if (!b11) {
            }
        }
        fi.a(b11 ? 1 : 2);
    }
}
