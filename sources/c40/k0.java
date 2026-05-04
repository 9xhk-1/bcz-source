package c40;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f7882a = " @";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final kotlin.coroutines.d d(kotlin.coroutines.d dVar, kotlin.coroutines.d dVar2, final boolean z11) {
        boolean h11 = h(dVar);
        boolean h12 = h(dVar2);
        if (!h11 && !h12) {
            return dVar.plus(dVar2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = dVar2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        kotlin.coroutines.d dVar3 = (kotlin.coroutines.d) dVar.fold(emptyCoroutineContext, new x00.p() { // from class: c40.i0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                kotlin.coroutines.d e11;
                e11 = k0.e(Ref.ObjectRef.this, z11, (kotlin.coroutines.d) obj, (d.b) obj2);
                return e11;
            }
        });
        if (h12) {
            objectRef.element = ((kotlin.coroutines.d) objectRef.element).fold(emptyCoroutineContext, new x00.p() { // from class: c40.j0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    kotlin.coroutines.d f11;
                    f11 = k0.f((kotlin.coroutines.d) obj, (d.b) obj2);
                    return f11;
                }
            });
        }
        return dVar3.plus((kotlin.coroutines.d) objectRef.element);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.d] */
    public static final kotlin.coroutines.d e(Ref.ObjectRef objectRef, boolean z11, kotlin.coroutines.d dVar, d.b bVar) {
        if (!(bVar instanceof f0)) {
            return dVar.plus(bVar);
        }
        d.b bVar2 = ((kotlin.coroutines.d) objectRef.element).get(bVar.getKey());
        if (bVar2 == null) {
            return dVar.plus(z11 ? ((f0) bVar).Z() : (f0) bVar);
        }
        objectRef.element = ((kotlin.coroutines.d) objectRef.element).minusKey(bVar.getKey());
        return dVar.plus(((f0) bVar).V(bVar2));
    }

    public static final kotlin.coroutines.d f(kotlin.coroutines.d dVar, d.b bVar) {
        return bVar instanceof f0 ? dVar.plus(((f0) bVar).Z()) : dVar.plus(bVar);
    }

    @m80.l
    public static final String g(@m80.k kotlin.coroutines.d dVar) {
        return null;
    }

    public static final boolean h(kotlin.coroutines.d dVar) {
        return ((Boolean) dVar.fold(Boolean.FALSE, new x00.p() { // from class: c40.h0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                boolean i11;
                i11 = k0.i(((Boolean) obj).booleanValue(), (d.b) obj2);
                return Boolean.valueOf(i11);
            }
        })).booleanValue();
    }

    public static final boolean i(boolean z11, d.b bVar) {
        return z11 || (bVar instanceof f0);
    }

    @y1
    @m80.k
    public static final kotlin.coroutines.d j(@m80.k r0 r0Var, @m80.k kotlin.coroutines.d dVar) {
        kotlin.coroutines.d d11 = d(r0Var.getCoroutineContext(), dVar, true);
        return (d11 == h1.a() || d11.get(kotlin.coroutines.c.f66933w0) != null) ? d11 : d11.plus(h1.a());
    }

    @g2
    @m80.k
    public static final kotlin.coroutines.d k(@m80.k kotlin.coroutines.d dVar, @m80.k kotlin.coroutines.d dVar2) {
        return !h(dVar2) ? dVar.plus(dVar2) : d(dVar, dVar2, false);
    }

    @m80.l
    public static final x3<?> l(@m80.k l00.c cVar) {
        while (!(cVar instanceof d1) && (cVar = cVar.getCallerFrame()) != null) {
            if (cVar instanceof x3) {
                return (x3) cVar;
            }
        }
        return null;
    }

    @m80.l
    public static final x3<?> m(@m80.k j00.c<?> cVar, @m80.k kotlin.coroutines.d dVar, @m80.l Object obj) {
        if (!(cVar instanceof l00.c) || dVar.get(y3.f8015a) == null) {
            return null;
        }
        x3<?> l11 = l((l00.c) cVar);
        if (l11 != null) {
            l11.h2(dVar, obj);
        }
        return l11;
    }

    public static final <T> T n(@m80.k j00.c<?> cVar, @m80.l Object obj, @m80.k x00.a<? extends T> aVar) {
        kotlin.coroutines.d context = cVar.getContext();
        Object i11 = h40.g1.i(context, obj);
        x3<?> m11 = i11 != h40.g1.f58220a ? m(cVar, context, i11) : null;
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.d0.d(1);
            if (m11 == null || m11.f2()) {
                h40.g1.f(context, i11);
            }
            kotlin.jvm.internal.d0.c(1);
        }
    }

    public static final <T> T o(@m80.k kotlin.coroutines.d dVar, @m80.l Object obj, @m80.k x00.a<? extends T> aVar) {
        Object i11 = h40.g1.i(dVar, obj);
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.d0.d(1);
            h40.g1.f(dVar, i11);
            kotlin.jvm.internal.d0.c(1);
        }
    }
}
