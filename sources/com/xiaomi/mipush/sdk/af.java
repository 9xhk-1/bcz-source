package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class af {

    /* renamed from: a, reason: collision with root package name */
    private static volatile af f45178a;

    /* renamed from: a, reason: collision with other field name */
    private Context f78a;

    /* renamed from: a, reason: collision with other field name */
    private List<x> f79a = new ArrayList();

    private af(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f78a = applicationContext;
        if (applicationContext == null) {
            this.f78a = context;
        }
    }

    public int a(String str) {
        synchronized (this.f79a) {
            try {
                x xVar = new x();
                xVar.f120a = str;
                if (this.f79a.contains(xVar)) {
                    for (x xVar2 : this.f79a) {
                        if (xVar2.equals(xVar)) {
                            return xVar2.f45235a;
                        }
                    }
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(String str) {
        synchronized (this.f79a) {
            try {
                x xVar = new x();
                xVar.f120a = str;
                if (this.f79a.contains(xVar)) {
                    Iterator<x> it = this.f79a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        x next = it.next();
                        if (xVar.equals(next)) {
                            xVar = next;
                            break;
                        }
                    }
                }
                xVar.f45235a++;
                this.f79a.remove(xVar);
                this.f79a.add(xVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(String str) {
        synchronized (this.f79a) {
            try {
                x xVar = new x();
                xVar.f120a = str;
                if (this.f79a.contains(xVar)) {
                    this.f79a.remove(xVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static af a(Context context) {
        if (f45178a == null) {
            synchronized (af.class) {
                try {
                    if (f45178a == null) {
                        f45178a = new af(context);
                    }
                } finally {
                }
            }
        }
        return f45178a;
    }

    public synchronized String a(au auVar) {
        return this.f78a.getSharedPreferences("mipush_extra", 0).getString(auVar.name(), "");
    }

    public synchronized void a(au auVar, String str) {
        SharedPreferences sharedPreferences = this.f78a.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putString(auVar.name(), str).commit();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5660a(String str) {
        synchronized (this.f79a) {
            try {
                x xVar = new x();
                xVar.f45235a = 0;
                xVar.f120a = str;
                if (this.f79a.contains(xVar)) {
                    this.f79a.remove(xVar);
                }
                this.f79a.add(xVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5661a(String str) {
        synchronized (this.f79a) {
            try {
                x xVar = new x();
                xVar.f120a = str;
                return this.f79a.contains(xVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
