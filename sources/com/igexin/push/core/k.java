package com.igexin.push.core;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.push.core.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38328a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f38329b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f38330c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final String f38331d = "LoginInteractor";

    /* renamed from: e, reason: collision with root package name */
    private static k f38332e;

    public static k a() {
        if (f38332e == null) {
            f38332e = new k();
        }
        return f38332e;
    }

    public static int b() {
        if (!e.f38042s || !com.igexin.push.g.c.a()) {
            com.igexin.c.a.c.a.a(f38331d, "keyNegotiate stop ++++++++++");
            com.igexin.c.a.c.a.a("LoginInteractor|keyNegotiate stop ++++++++++", new Object[0]);
            return -1;
        }
        com.igexin.push.d.c.g gVar = new com.igexin.push.d.c.g();
        gVar.f38466b = e.f37998a;
        int a11 = d.a.f37956a.f37949h.a("K-", gVar, true);
        com.igexin.c.a.c.a.a("LoginInteractor|keyNegotiate result=".concat(String.valueOf(a11)), new Object[0]);
        return a11 < 0 ? 0 : 1;
    }

    public static void c() {
        com.igexin.c.a.c.a.d.a().a("[LoginInteractor] Start login appid = " + e.f37998a);
        if (e.f38043t) {
            e.f38043t = false;
            e.T = System.currentTimeMillis() + (Math.abs(new Random().nextInt() % 24) * 3600000);
        }
        com.igexin.push.c.c.a().d().d();
        if (e.f38049z != 0) {
            com.igexin.push.d.c.i d11 = d();
            com.igexin.c.a.c.a.a("loginReqBefore|" + d11.f38474b, new Object[0]);
            if (d.a.f37956a.f37949h.a("S-" + e.f38049z, d11, true) < 0) {
                return;
            }
            String str = e.A;
            com.igexin.c.a.c.a.a("LoginInteractor|loginReq|" + e.A, new Object[0]);
            return;
        }
        com.igexin.c.a.c.a.a("registerReq #####", new Object[0]);
        com.igexin.push.d.c.d dVar = new com.igexin.push.d.c.d(e.D, e.E, e.L, e.f37998a);
        String str2 = e.D;
        String str3 = e.E;
        String str4 = e.L;
        com.igexin.push.e.a aVar = d.a.f37956a.f37949h;
        StringBuilder sb2 = new StringBuilder("R-");
        sb2.append(e.L);
        com.igexin.c.a.c.a.a("registerReq|" + (aVar.a(sb2.toString(), dVar, true) >= 0) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + e.L, new Object[0]);
    }

    public static com.igexin.push.d.c.i d() {
        Pair<String, String> b11;
        NetworkInfo activeNetworkInfo;
        com.igexin.push.d.c.i iVar = new com.igexin.push.d.c.i();
        iVar.f38474b = e.f38049z;
        iVar.f38475c = (byte) 0;
        iVar.f38476d = 65280;
        iVar.f38477e = e.f37998a;
        try {
            ArrayList<com.igexin.push.d.c.j> arrayList = new ArrayList();
            int i11 = -1;
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) e.f38035l.getSystemService("connectivity");
                if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    i11 = activeNetworkInfo.getType();
                    com.igexin.push.d.c.j jVar = new com.igexin.push.d.c.j();
                    jVar.f38479a = (byte) 2;
                    jVar.f38480b = String.valueOf(i11);
                    arrayList.add(jVar);
                }
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
            if (i11 == 1 && (b11 = com.igexin.push.g.n.b()) != null) {
                String str = (String) b11.first;
                String str2 = (String) b11.second;
                if (str != null) {
                    com.igexin.push.d.c.j jVar2 = new com.igexin.push.d.c.j();
                    jVar2.f38479a = (byte) 1;
                    jVar2.f38480b = str;
                    arrayList.add(jVar2);
                }
                if (str2 != null) {
                    com.igexin.push.d.c.j jVar3 = new com.igexin.push.d.c.j();
                    jVar3.f38479a = (byte) 4;
                    jVar3.f38480b = str2;
                    arrayList.add(jVar3);
                }
            }
            String p11 = com.igexin.push.g.n.p();
            if (!TextUtils.isEmpty(p11)) {
                String[] split = p11.split("#");
                if (split.length >= 3 && !TextUtils.isEmpty(split[2])) {
                    com.igexin.push.d.c.j jVar4 = new com.igexin.push.d.c.j();
                    jVar4.f38479a = (byte) 6;
                    jVar4.f38480b = split[2];
                    arrayList.add(jVar4);
                }
            }
            if (com.igexin.push.config.d.f37581am) {
                String t11 = com.igexin.push.g.n.t();
                if (!TextUtils.isEmpty(t11)) {
                    com.igexin.push.d.c.j jVar5 = new com.igexin.push.d.c.j();
                    jVar5.f38479a = (byte) 7;
                    jVar5.f38480b = t11;
                    arrayList.add(jVar5);
                }
            }
            if (ServiceManager.getInstance().initType != null) {
                int intValue = ((Integer) ServiceManager.getInstance().initType.first).intValue();
                String valueOf = String.valueOf(intValue);
                if (intValue == 1) {
                    valueOf = valueOf + "#" + ((String) ServiceManager.getInstance().initType.second);
                }
                com.igexin.push.d.c.j jVar6 = new com.igexin.push.d.c.j();
                jVar6.f38479a = (byte) 5;
                jVar6.f38480b = valueOf;
                arrayList.add(jVar6);
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                for (com.igexin.push.d.c.j jVar7 : arrayList) {
                    sb2.append((int) jVar7.f38479a);
                    sb2.append(":");
                    sb2.append((String) jVar7.f38480b);
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                }
                com.igexin.c.a.c.a.a("LoginInteractor| ".concat(String.valueOf(sb2)), new Object[0]);
            } catch (Throwable th3) {
                com.igexin.c.a.c.a.a(th3);
            }
            if (!arrayList.isEmpty()) {
                iVar.f38478f = arrayList;
            }
        } catch (Throwable th4) {
            com.igexin.c.a.c.a.a(th4);
        }
        return iVar;
    }

    private static void a(List<com.igexin.push.d.c.j> list) {
        if (ServiceManager.getInstance().initType == null) {
            return;
        }
        int intValue = ((Integer) ServiceManager.getInstance().initType.first).intValue();
        String valueOf = String.valueOf(intValue);
        if (intValue == 1) {
            valueOf = valueOf + "#" + ((String) ServiceManager.getInstance().initType.second);
        }
        com.igexin.push.d.c.j jVar = new com.igexin.push.d.c.j();
        jVar.f38479a = (byte) 5;
        jVar.f38480b = valueOf;
        list.add(jVar);
    }
}
