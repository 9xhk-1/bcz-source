package rq;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static Map<Class<?>, qq.c> f84527c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static Map<Class<?>, Object> f84528d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public Map<Class<?>, qq.c> f84529a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Map<Class<?>, Object> f84530b = new HashMap();

    public d(List<qq.c> list, Context context) {
        e(list, context);
    }

    public static Constructor c(Class cls, Class... clsArr) {
        boolean z11 = false;
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == clsArr.length) {
                for (int i11 = 0; i11 < clsArr.length; i11++) {
                    z11 = parameterTypes[i11] == clsArr[i11];
                }
                if (z11) {
                    return constructor;
                }
            }
        }
        return null;
    }

    public <T> T a(mq.d dVar, Class<?> cls) {
        T t11;
        qq.c cVar = this.f84529a.get(cls);
        if (cVar == null && (cVar = f84527c.get(cls)) != null) {
            return (T) f84528d.get(cls);
        }
        if (cVar == null) {
            return null;
        }
        if (cVar.l() && (t11 = (T) this.f84530b.get(cls)) != null) {
            return t11;
        }
        T t12 = (T) b(dVar, cVar);
        if (t12 != null && cVar.l()) {
            this.f84530b.put(cls, t12);
        }
        return t12;
    }

    public final Object b(mq.d dVar, qq.c cVar) {
        StringBuilder sb2;
        if (cVar.g() != null) {
            return cVar.g();
        }
        Class<?> i11 = cVar.i();
        if (i11 == null) {
            return null;
        }
        try {
            Constructor c11 = c(i11, Context.class, mq.d.class);
            if (c11 != null) {
                return c11.newInstance(dVar.b(), dVar);
            }
            Constructor c12 = c(i11, Context.class);
            return c12 != null ? c12.newInstance(dVar.b()) : i11.newInstance();
        } catch (IllegalAccessException e11) {
            e = e11;
            sb2 = new StringBuilder();
            sb2.append("Instantiate service exception ");
            sb2.append(e.getLocalizedMessage());
            Log.e("AGC_ServiceRepository", sb2.toString());
            return null;
        } catch (InstantiationException e12) {
            e = e12;
            sb2 = new StringBuilder();
            sb2.append("Instantiate service exception ");
            sb2.append(e.getLocalizedMessage());
            Log.e("AGC_ServiceRepository", sb2.toString());
            return null;
        } catch (InvocationTargetException e13) {
            e = e13;
            sb2 = new StringBuilder();
            sb2.append("Instantiate service exception ");
            sb2.append(e.getLocalizedMessage());
            Log.e("AGC_ServiceRepository", sb2.toString());
            return null;
        }
    }

    public final void d(String str, Exception exc) {
        Log.e("AGC_ServiceRepository", "Instantiate shared service " + str + exc.getLocalizedMessage());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("cause message:");
        sb2.append(exc.getCause() != null ? exc.getCause().getMessage() : "");
        Log.e("AGC_ServiceRepository", sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[Catch: InvocationTargetException -> 0x006a, InstantiationException -> 0x006c, IllegalAccessException -> 0x006e, TryCatch #2 {IllegalAccessException -> 0x006e, InstantiationException -> 0x006c, InvocationTargetException -> 0x006a, blocks: (B:23:0x0051, B:27:0x0061, B:28:0x0078, B:31:0x0070), top: B:22:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[Catch: InvocationTargetException -> 0x006a, InstantiationException -> 0x006c, IllegalAccessException -> 0x006e, TryCatch #2 {IllegalAccessException -> 0x006e, InstantiationException -> 0x006c, InvocationTargetException -> 0x006a, blocks: (B:23:0x0051, B:27:0x0061, B:28:0x0078, B:31:0x0070), top: B:22:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.util.List<qq.c> r5, android.content.Context r6) {
        /*
            r4 = this;
            java.lang.String r0 = "addService start"
            java.lang.String r1 = "AGC_ServiceRepository"
            android.util.Log.d(r1, r0)
            if (r5 != 0) goto La
            return
        La:
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r5.next()
            qq.c r0 = (qq.c) r0
            boolean r2 = r0.k()
            if (r2 == 0) goto L36
            java.util.Map<java.lang.Class<?>, qq.c> r2 = rq.d.f84527c
            java.lang.Class r3 = r0.h()
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L39
            java.util.Map<java.lang.Class<?>, qq.c> r2 = rq.d.f84527c
        L2e:
            java.lang.Class r3 = r0.h()
            r2.put(r3, r0)
            goto L39
        L36:
            java.util.Map<java.lang.Class<?>, qq.c> r2 = r4.f84529a
            goto L2e
        L39:
            boolean r2 = r0.j()
            if (r2 == 0) goto Le
            java.lang.Class r2 = r0.i()
            if (r2 == 0) goto Le
            java.util.Map<java.lang.Class<?>, java.lang.Object> r2 = rq.d.f84528d
            java.lang.Class r3 = r0.h()
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto Le
            java.lang.Class r2 = r0.i()     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.InstantiationException -> L6c java.lang.IllegalAccessException -> L6e
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.InstantiationException -> L6c java.lang.IllegalAccessException -> L6e
            java.lang.reflect.Constructor r2 = c(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.InstantiationException -> L6c java.lang.IllegalAccessException -> L6e
            if (r2 == 0) goto L70
            java.lang.Object[] r3 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.InstantiationException -> L6c java.lang.IllegalAccessException -> L6e
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.InstantiationException -> L6c java.lang.IllegalAccessException -> L6e
            goto L78
        L6a:
            r0 = move-exception
            goto L82
        L6c:
            r0 = move-exception
            goto L88
        L6e:
            r0 = move-exception
            goto L8b
        L70:
            java.lang.Class r2 = r0.i()     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.InstantiationException -> L6c java.lang.IllegalAccessException -> L6e
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.InstantiationException -> L6c java.lang.IllegalAccessException -> L6e
        L78:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = rq.d.f84528d     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.InstantiationException -> L6c java.lang.IllegalAccessException -> L6e
            java.lang.Class r0 = r0.h()     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.InstantiationException -> L6c java.lang.IllegalAccessException -> L6e
            r3.put(r0, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.InstantiationException -> L6c java.lang.IllegalAccessException -> L6e
            goto Le
        L82:
            java.lang.String r2 = "TargetException"
        L84:
            r4.d(r2, r0)
            goto Le
        L88:
            java.lang.String r2 = "InstantiationException"
            goto L84
        L8b:
            java.lang.String r2 = "AccessException"
            goto L84
        L8e:
            java.lang.String r5 = "addService end"
            android.util.Log.d(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.d.e(java.util.List, android.content.Context):void");
    }
}
