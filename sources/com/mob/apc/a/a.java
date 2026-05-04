package com.mob.apc.a;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.mob.MobACService;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private MobACService f40057a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f40058b = false;

    /* renamed from: c, reason: collision with root package name */
    private final d f40059c = new d() { // from class: com.mob.apc.a.a.1
        @Override // com.mob.apc.a.d
        public e a(e eVar) throws RemoteException {
            com.mob.apc.a aVar;
            f.a().b("APC msg received. msg: " + eVar, new Object[0]);
            if (a.this.f40058b) {
                f.a().b("inited: " + com.mob.apc.b.f40085a, new Object[0]);
                if (!com.mob.apc.b.f40085a) {
                    a.this.f40058b = false;
                    if (eVar != null && (aVar = eVar.f40079a) != null) {
                        Bundle bundle = new Bundle();
                        int i11 = aVar.f40051a;
                        if (i11 == 1001) {
                            bundle.putInt("acsActType", 1);
                        } else if (i11 == 9004) {
                            bundle.putInt("acsActType", 2);
                        }
                        bundle.putString(com.igexin.push.core.b.aC, eVar.f40081c);
                        c.a().a(bundle);
                    }
                }
            }
            return c.a().a(eVar);
        }
    };

    public a(MobACService mobACService) {
        this.f40057a = mobACService;
    }

    public void b() {
        this.f40058b = false;
    }

    public boolean b(Intent intent) {
        return this.f40057a.a(intent);
    }

    public void a() {
        try {
            this.f40058b = true;
            com.mob.apc.b.a(this.f40057a.getApplicationContext());
        } catch (Throwable th2) {
            f.a().a(th2);
        }
    }

    public int a(Intent intent, int i11, int i12) {
        return this.f40057a.a(intent, i11, i12);
    }

    public IBinder a(Intent intent) {
        return this.f40059c;
    }
}
