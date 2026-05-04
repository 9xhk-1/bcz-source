package com.mob.commons.cc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.mob.commons.cc.i;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class a extends BroadcastReceiver implements i {

    /* renamed from: a, reason: collision with root package name */
    private g f40225a;

    private void a(g gVar) {
        this.f40225a = gVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f40225a != null) {
            try {
                ArrayList<Object> arrayList = new ArrayList<>(1);
                arrayList.add(intent);
                this.f40225a.a("onReceive", arrayList);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.mob.commons.cc.i
    public i.b a(i.a aVar) {
        Object obj;
        i.b bVar = new i.b();
        try {
            if ("setHandler".equals(aVar.f40232a)) {
                Object[] objArr = aVar.f40233b;
                if (objArr.length == 1 && (obj = objArr[0]) != null && (obj instanceof g)) {
                    a((g) obj);
                    return bVar;
                }
            }
            bVar.f40238c = new NoSuchMethodException("method name: " + aVar.f40232a + " at line: " + aVar.f40234c + pn.j.f81006c + aVar.f40235d + pn.j.f81007d);
            return bVar;
        } catch (Throwable th2) {
            bVar.f40238c = th2;
            return bVar;
        }
    }
}
