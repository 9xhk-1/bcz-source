package k10;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nmoduleByClassLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 moduleByClassLoader.kt\nkotlin/reflect/jvm/internal/ModuleByClassLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
/* loaded from: classes8.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final ConcurrentMap<r2, WeakReference<u10.k>> f64945a = new ConcurrentHashMap();

    public static final void a() {
        f64945a.clear();
    }

    @m80.k
    public static final u10.k b(@m80.k Class<?> cls) {
        kotlin.jvm.internal.g0.p(cls, "<this>");
        ClassLoader j11 = v10.f.j(cls);
        r2 r2Var = new r2(j11);
        ConcurrentMap<r2, WeakReference<u10.k>> concurrentMap = f64945a;
        WeakReference<u10.k> weakReference = concurrentMap.get(r2Var);
        if (weakReference != null) {
            u10.k kVar = weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(r2Var, weakReference);
        }
        u10.k a11 = u10.k.f91520c.a(j11);
        while (true) {
            try {
                ConcurrentMap<r2, WeakReference<u10.k>> concurrentMap2 = f64945a;
                WeakReference<u10.k> putIfAbsent = concurrentMap2.putIfAbsent(r2Var, new WeakReference<>(a11));
                if (putIfAbsent == null) {
                    return a11;
                }
                u10.k kVar2 = putIfAbsent.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(r2Var, putIfAbsent);
            } finally {
                r2Var.a(null);
            }
        }
    }
}
