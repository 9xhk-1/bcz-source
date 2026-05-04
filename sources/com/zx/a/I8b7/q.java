package com.zx.a.I8b7;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static Map<Class<? extends b>, b> f46655a = new HashMap();

    public static void a(Context context, Class<? extends b> cls, Class<? extends c>... clsArr) throws IllegalAccessException, InstantiationException {
        Context applicationContext = context.getApplicationContext();
        b bVar = (b) ((HashMap) f46655a).get(cls);
        if (bVar == null) {
            bVar = cls.newInstance();
            ((HashMap) f46655a).put(cls, bVar);
        }
        b bVar2 = bVar;
        for (Class<? extends c> cls2 : clsArr) {
            c cVar = bVar2.f46462a.get(cls2);
            if (cVar == null) {
                cVar = cls2.newInstance();
                bVar2.f46462a.put(cls2, cVar);
            }
            cVar.f46490a = bVar2;
        }
        if (bVar2.f46464c.getAndSet(true)) {
            return;
        }
        bVar2.f46463b = new a(bVar2, applicationContext, bVar2.a(), null, bVar2.c());
        Iterator<Class<? extends c>> it = bVar2.f46462a.keySet().iterator();
        while (it.hasNext()) {
            bVar2.f46462a.get(it.next()).getClass();
        }
    }

    public static <T extends c> T a(Class<? extends b> cls, Class<T> cls2) {
        b bVar = (b) ((HashMap) f46655a).get(cls);
        if (bVar != null) {
            T t11 = (T) bVar.f46462a.get(cls2);
            if (t11 != null) {
                return t11;
            }
            StringBuilder a11 = f3.a("table ");
            a11.append(cls2.getSimpleName());
            a11.append(" has not been added to db ");
            a11.append(bVar.a());
            throw new RuntimeException(a11.toString());
        }
        StringBuilder a12 = f3.a("db ");
        a12.append(cls.getSimpleName());
        a12.append(" has not been initialized");
        throw new RuntimeException(a12.toString());
    }
}
