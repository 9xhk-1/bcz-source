package com.mob.commons.cc;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.mob.commons.cc.i;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class e implements ServiceConnection, i {

    /* renamed from: a, reason: collision with root package name */
    private g f40230a;

    private void a(g gVar) {
        this.f40230a = gVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f40230a != null) {
            try {
                ArrayList<Object> arrayList = new ArrayList<>(2);
                arrayList.add(componentName);
                arrayList.add(iBinder);
                this.f40230a.a("onServiceConnected", arrayList);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f40230a != null) {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(componentName);
            this.f40230a.a("onServiceDisconnected", arrayList);
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
