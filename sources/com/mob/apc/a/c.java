package com.mob.apc.a;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.mob.apc.APCException;
import com.mob.apc.b;
import com.mob.commons.authorize.DeviceAuthorizer;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ReflectHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f40069a = new c();

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f40070i = {"com.mob.service.action.MOB_AC_SERVICE"};

    /* renamed from: f, reason: collision with root package name */
    private b.c f40075f;

    /* renamed from: g, reason: collision with root package name */
    private Bundle f40076g;

    /* renamed from: h, reason: collision with root package name */
    private b.a f40077h;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, b.InterfaceC0482b> f40071b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private b f40072c = new b();

    /* renamed from: e, reason: collision with root package name */
    private byte[] f40074e = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, e> f40073d = new HashMap<>();

    private c() {
    }

    public static c a() {
        return f40069a;
    }

    public List<String> b() {
        ArrayList arrayList = new ArrayList();
        try {
            boolean isClear = DeviceAuthorizer.isClear();
            f.a().a("[EC] isClear apcsvcl: " + isClear, new Object[0]);
            if (isClear) {
                ReflectHelper.importClass("android.content.Intent");
                List<ResolveInfo> queryIntentServices = DeviceHelper.getInstance(com.mob.apc.b.a()).queryIntentServices((Intent) ReflectHelper.newInstance("Intent", f40070i[0]), 0);
                if (queryIntentServices != null) {
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        String str = serviceInfo.packageName;
                        if (serviceInfo.exported && !com.mob.apc.b.a().getPackageName().equals(str)) {
                            arrayList.add(resolveInfo.serviceInfo.packageName);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            f.a().a(th2);
        }
        f.a().b("[getMAPCServiceList] list: %s", arrayList);
        return arrayList;
    }

    public b.a c() {
        return this.f40077h;
    }

    public void a(String str, b.InterfaceC0482b interfaceC0482b) {
        f.a().b("[addMobIpcMsgListener] %s", str);
        this.f40071b.put(str, interfaceC0482b);
        synchronized (this.f40074e) {
            try {
                if (this.f40073d.containsKey(str)) {
                    f.a().b("[addMobIpcMsgListener] %s", "buf msg found, callback right now");
                    e remove = this.f40073d.remove(str);
                    interfaceC0482b.a(remove.f40081c, remove.f40079a, remove.f40083e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.mob.apc.a a(int i11, String str, String str2, com.mob.apc.a aVar, long j11) throws Throwable {
        boolean isClear = DeviceAuthorizer.isClear();
        f.a().a("[EC] isClear snd mg: " + isClear, new Object[0]);
        if (isClear) {
            if (TextUtils.isEmpty(str)) {
                f.a().b("[sendMessage] pkg not allowed null.", new Object[0]);
                throw new APCException("pkg not allowed null.");
            }
            if (aVar == null) {
                f.a().b("[sendMessage] param not allowed null.", new Object[0]);
                throw new APCException("param not allowed null.");
            }
            if (i11 == 1) {
                return this.f40072c.a(str, str2, aVar, j11);
            }
            f.a().b("type " + i11 + " not support.", new Object[0]);
            throw new APCException("type " + i11 + " not support.");
        }
        throw new APCException("ec is not clear");
    }

    public e a(e eVar) {
        try {
            b.InterfaceC0482b interfaceC0482b = this.f40071b.get(eVar.f40080b);
            f.a().b("[onAIDLMessageReceive] innerMessage: %s, listener: %s", eVar, interfaceC0482b);
            if (interfaceC0482b != null) {
                com.mob.apc.a a11 = interfaceC0482b.a(eVar.f40081c, eVar.f40079a, eVar.f40083e);
                f.a().b("[onAIDLMessageReceive] listener apcMessage: %s", a11);
                return new e(a11, eVar.f40080b, eVar.f40083e);
            }
            f.a().b("[onAIDLMessageReceive] No listener detected, buffer this msg", new Object[0]);
            this.f40073d.put(eVar.f40080b, eVar);
            return null;
        } catch (Throwable th2) {
            f.a().b("[onAIDLMessageReceive] exception %s", th2.getMessage());
            f.a().a(th2);
            return null;
        }
    }

    public void a(b.c cVar) {
        f.a().b("[addOnACServiceListener] %s", "done");
        this.f40075f = cVar;
        if (this.f40076g != null) {
            f.a().b("[addOnACServiceListener] %s", "bufBundle detected, callback");
            this.f40075f.a(new Bundle(this.f40076g));
            this.f40075f = null;
            return;
        }
        f.a().b("[addOnACServiceListener] %s", "no bufBundle, nothing to do");
    }

    public void a(b.a aVar) {
        f.a().b("[addMgsRequestListener] %s", "done");
        this.f40077h = aVar;
    }

    public void a(Bundle bundle) {
        if (this.f40075f != null) {
            f.a().b("[onACServiceAct] %s", "listener detected, callback");
            this.f40075f.a(bundle);
        } else {
            f.a().b("[onACServiceAct] %s", "no listener detected, cache");
            this.f40076g = new Bundle(bundle);
        }
    }
}
