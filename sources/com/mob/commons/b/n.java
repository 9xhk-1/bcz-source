package com.mob.commons.b;

import android.content.Context;
import com.mob.commons.b.g;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class n extends g {
    public n(Context context) {
        super(context);
    }

    private String a(Context context, Object obj, Method method) {
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable th2) {
            c.a().a(th2);
            return null;
        }
    }

    @Override // com.mob.commons.b.g
    public g.c c() {
        Class<?> cls;
        Object obj;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5 = null;
        try {
            cls = Class.forName(com.mob.commons.n.a("034.cfdbCkNdkcecjIg3cgdbcd[gFdkcd?gBdkcdHkd%dcdkdf5g>ffcgdbAi9cd@gh3cgdfDkd_dc"));
            try {
                obj = cls.newInstance();
            } catch (Throwable th2) {
                th = th2;
                c.a().a(th);
                obj = null;
                if (cls != null) {
                }
                method = null;
                method2 = null;
                method3 = null;
                g.c cVar = new g.c();
                cVar.f40198b = a(this.f40184a, obj, method5);
                cVar.f40201e = a(this.f40184a, obj, method3);
                cVar.f40199c = a(this.f40184a, obj, method);
                cVar.f40200d = a(this.f40184a, obj, method2);
                cVar.f40197a = cls == null && obj != null;
                return cVar;
            }
        } catch (Throwable th3) {
            th = th3;
            cls = null;
        }
        if (cls != null || obj == null) {
            method = null;
            method2 = null;
            method3 = null;
        } else {
            try {
                method2 = cls.getMethod(com.mob.commons.n.a("014(ee@hc4eh,h(egcecbdc,cEddehdfeh"), Context.class);
            } catch (Throwable th4) {
                c.a().a(th4);
                method2 = null;
            }
            try {
                method4 = cls.getMethod(com.mob.commons.n.a("007IeeRhcAejdidfeh"), Context.class);
            } catch (Throwable th5) {
                c.a().a(th5);
                method4 = null;
            }
            try {
                method3 = cls.getMethod(com.mob.commons.n.a("007-ee<hcHfddidfeh"), Context.class);
            } catch (Throwable th6) {
                c.a().a(th6);
                method3 = null;
            }
            try {
                method5 = cls.getMethod(com.mob.commons.n.a("007Gee^hc_dididfeh"), Context.class);
            } catch (Throwable th7) {
                c.a().a(th7);
            }
            method = method5;
            method5 = method4;
        }
        g.c cVar2 = new g.c();
        cVar2.f40198b = a(this.f40184a, obj, method5);
        cVar2.f40201e = a(this.f40184a, obj, method3);
        cVar2.f40199c = a(this.f40184a, obj, method);
        cVar2.f40200d = a(this.f40184a, obj, method2);
        cVar2.f40197a = cls == null && obj != null;
        return cVar2;
    }
}
