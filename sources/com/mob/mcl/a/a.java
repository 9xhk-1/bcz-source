package com.mob.mcl.a;

import android.content.Context;
import android.os.Bundle;
import com.mob.MobSDK;
import com.mob.apc.b;
import com.mob.mcl.MobMCL;
import com.mob.mcl.c.h;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.network.StringPart;
import com.mob.tools.utils.DeviceHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f40465a;

    /* renamed from: b, reason: collision with root package name */
    private Set<String> f40466b;

    /* renamed from: c, reason: collision with root package name */
    private String f40467c;

    private a() {
    }

    public static a a() {
        if (f40465a == null) {
            synchronized (a.class) {
                try {
                    if (f40465a == null) {
                        f40465a = new a();
                    }
                } finally {
                }
            }
        }
        return f40465a;
    }

    public boolean b() {
        Set<String> set = this.f40466b;
        return set != null && set.size() > 0;
    }

    public void c() {
        Bundle bundle;
        if (h.b().f40518i) {
            ArrayList<String> arrayList = new ArrayList();
            boolean isInMainProcess = DeviceHelper.getInstance(MobSDK.getContext()).isInMainProcess();
            com.mob.mcl.d.b.a().b("qy tp svc, main p: " + isInMainProcess);
            if (!isInMainProcess) {
                arrayList.add(MobSDK.getContext().getPackageName());
            }
            arrayList.addAll(com.mob.apc.b.b());
            com.mob.mcl.d.b.a().b("qy : " + arrayList.toString());
            this.f40466b = new LinkedHashSet();
            for (String str : arrayList) {
                com.mob.apc.a aVar = new com.mob.apc.a();
                aVar.f40051a = 1;
                try {
                    com.mob.mcl.d.b.a().b("sd apc mg : " + aVar.toString() + " to ->" + str);
                    com.mob.apc.a a11 = com.mob.apc.b.a(1, str, this.f40467c, aVar, 5000L);
                    if (a11 != null && (bundle = a11.f40055e) != null && a11.f40051a == 1 && bundle.getBoolean("isTcpAvailable")) {
                        this.f40466b.add(str);
                    }
                } catch (Throwable th2) {
                    com.mob.mcl.d.b.a().b("query tcp exp : " + th2.getMessage());
                }
            }
            com.mob.mcl.d.b.a().b("apc available pg : " + this.f40466b.toString());
        }
    }

    public void b(String str, com.mob.apc.a aVar) {
        if (str != null) {
            Bundle bundle = new Bundle();
            bundle.putString("data", str);
            aVar.f40055e = bundle;
        }
    }

    public void a(Context context, b.InterfaceC0482b interfaceC0482b) {
        this.f40467c = MobMCL.SDK_TAG;
        com.mob.apc.b.a(context);
        boolean isInMainProcess = DeviceHelper.getInstance(context).isInMainProcess();
        com.mob.mcl.d.b.a().b("init apc, main p: " + isInMainProcess);
        if (isInMainProcess) {
            com.mob.apc.b.a(this.f40467c, interfaceC0482b);
        }
    }

    public com.mob.apc.a a(int i11, Bundle bundle, String str, int i12) {
        try {
            com.mob.apc.a aVar = new com.mob.apc.a();
            aVar.f40051a = i11;
            aVar.f40055e = bundle;
            com.mob.mcl.d.b.a().b("apc fw mg : " + i11 + " " + aVar.toString() + " to ->" + str);
            return com.mob.apc.b.a(1, str, this.f40467c, aVar, i12);
        } catch (Throwable th2) {
            com.mob.mcl.d.b.a().a(th2);
            return null;
        }
    }

    public String a(String str, String str2, HashMap<String, String> hashMap, StringPart stringPart, int i11, NetworkHelper.NetworkTimeOut networkTimeOut) throws Throwable {
        com.mob.apc.a a11;
        Bundle bundle;
        if (b()) {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.addAll(this.f40466b);
            for (String str3 : arrayList) {
                com.mob.apc.a aVar = new com.mob.apc.a();
                aVar.f40051a = 2;
                aVar.f40055e = b.a(str, str2, hashMap, stringPart, i11, networkTimeOut);
                try {
                    com.mob.mcl.d.b.a().b("apc sd mg : " + aVar.toString() + " to ->" + str3);
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    a11 = com.mob.apc.b.a(1, str3, this.f40467c, aVar, networkTimeOut.readTimout);
                } catch (Throwable th3) {
                    th = th3;
                    com.mob.mcl.d.b.a().a(th);
                }
                if (a11 != null && a11.f40051a == 2 && (bundle = a11.f40055e) != null) {
                    com.mob.mcl.d.b.a().b("apc receive rp mg : " + bundle.getString("data"));
                    str = bundle.getString("data");
                    return str;
                }
                com.mob.mcl.d.b.a().b("apc receive rp : " + a11);
            }
            return null;
        }
        com.mob.mcl.d.b.a().a("apc list is null");
        return null;
    }

    public com.mob.apc.a a(String str, com.mob.apc.a aVar) {
        com.mob.mcl.d.b.a().a("apc received mg " + aVar + " from -> " + str);
        if (aVar == null) {
            return null;
        }
        com.mob.apc.a aVar2 = new com.mob.apc.a();
        aVar2.f40051a = aVar.f40051a;
        int i11 = aVar.f40051a;
        if (i11 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isTcpAvailable", h.b().e());
            aVar2.f40055e = bundle;
            return aVar2;
        }
        if (i11 == 2) {
            aVar2.f40054d = b.a(aVar.f40055e);
            return aVar2;
        }
        if (i11 == 9004) {
            return aVar2;
        }
        return null;
    }
}
