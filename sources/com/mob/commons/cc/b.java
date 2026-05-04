package com.mob.commons.cc;

import android.content.Context;
import com.mob.commons.cc.g;
import com.mob.commons.cc.o;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static h f40226a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static g f40227b;

    /* renamed from: c, reason: collision with root package name */
    private static g f40228c;

    static {
        try {
            f40227b = new g(new g.a() { // from class: com.mob.commons.cc.b.1
                @Override // com.mob.commons.cc.g.a
                public Object a(String str, ArrayList<Object> arrayList) {
                    try {
                        if (b.f40228c != null) {
                            return b.f40228c.a(str, arrayList);
                        }
                        return null;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
            f40228c = new g(new g.a() { // from class: com.mob.commons.cc.b.2
                @Override // com.mob.commons.cc.g.a
                public Object a(String str, ArrayList<Object> arrayList) {
                    return str + "" + arrayList;
                }
            });
            f40227b.a("tt", null);
        } catch (Throwable unused) {
        }
    }

    public static int a() {
        return o.a();
    }

    public static synchronized void a(Context context, String str, String str2) throws Throwable {
        synchronized (b.class) {
            a(o.a(str), context, str2);
        }
    }

    public static synchronized void a(Context context, byte[] bArr, String str) throws Throwable {
        synchronized (b.class) {
            a(o.a(bArr), context, str);
        }
    }

    private static void a(o.b bVar, Context context, String str) throws Throwable {
        bVar.a("OperationSet", f.class).a("MobBroadcastReceiver", a.class).a("MobContentResolver", d.class).a("MobServiceConnection", e.class).a("MobContentObserver", c.class).a("SBHandler", g.class).a("ss_suls", f40226a).a("ss_contextParam", context).a("ss_startParams", str).a("ss_startTime", Long.valueOf(System.currentTimeMillis())).a();
    }
}
