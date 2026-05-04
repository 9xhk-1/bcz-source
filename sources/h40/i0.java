package h40;

import c40.v2;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1971#2,14:131\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n34#1:131,14\n*E\n"})
/* loaded from: classes8.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final i0 f58229a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f58230b = false;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final v2 f58231c;

    static {
        i0 i0Var = new i0();
        f58229a = i0Var;
        a1.f(j0.f58233a, true);
        f58231c = i0Var.a();
    }

    public final v2 a() {
        Object next;
        v2 f11;
        try {
            List I3 = q30.k0.I3(q30.x.j(ServiceLoader.load(h0.class, h0.class.getClassLoader()).iterator()));
            Iterator it = I3.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int a11 = ((h0) next).a();
                    do {
                        Object next2 = it.next();
                        int a12 = ((h0) next2).a();
                        if (a11 < a12) {
                            next = next2;
                            a11 = a12;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            h0 h0Var = (h0) next;
            if (h0Var != null && (f11 = j0.f(h0Var, I3)) != null) {
                return f11;
            }
            return j0.b(null, null, 3, null);
        } catch (Throwable th2) {
            return j0.b(th2, null, 2, null);
        }
    }
}
