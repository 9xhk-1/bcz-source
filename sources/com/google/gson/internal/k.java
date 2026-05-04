package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f35037a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends b {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Method f35038b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method) {
                super();
                this.f35038b = method;
            }

            @Override // com.google.gson.internal.k.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f35038b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e11) {
                    throw new RuntimeException("Failed invoking canAccess", e11);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.gson.internal.k$b$b, reason: collision with other inner class name */
        public class C0435b extends b {
            public C0435b() {
                super();
            }

            @Override // com.google.gson.internal.k.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
        static {
            /*
                boolean r0 = com.google.gson.internal.f.e()
                if (r0 == 0) goto L1a
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L1a
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1a
                com.google.gson.internal.k$b$a r1 = new com.google.gson.internal.k$b$a     // Catch: java.lang.NoSuchMethodException -> L1a
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                if (r1 != 0) goto L22
                com.google.gson.internal.k$b$b r1 = new com.google.gson.internal.k$b$b
                r1.<init>()
            L22:
                com.google.gson.internal.k.b.f35037a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.k.b.<clinit>():void");
        }

        public b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f35037a.a(accessibleObject, obj);
    }

    public static ReflectionAccessFilter.FilterResult b(List<ReflectionAccessFilter> list, Class<?> cls) {
        Iterator<ReflectionAccessFilter> it = list.iterator();
        while (it.hasNext()) {
            ReflectionAccessFilter.FilterResult a11 = it.next().a(cls);
            if (a11 != ReflectionAccessFilter.FilterResult.INDECISIVE) {
                return a11;
            }
        }
        return ReflectionAccessFilter.FilterResult.ALLOW;
    }

    public static boolean c(Class<?> cls) {
        return d(cls.getName());
    }

    public static boolean d(String str) {
        return str.startsWith("android.") || str.startsWith("androidx.") || g(str);
    }

    public static boolean e(Class<?> cls) {
        String name = cls.getName();
        return d(name) || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static boolean f(Class<?> cls) {
        return g(cls.getName());
    }

    public static boolean g(String str) {
        return str.startsWith("java.") || str.startsWith("javax.");
    }
}
