package h50;

import a00.h0;
import a00.i0;
import j50.w2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1#2:112\n1563#3:113\n1634#3,3:114\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n*L\n76#1:113\n76#1:114,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b {
    @m80.l
    public static final h10.d<?> a(@m80.k f fVar) {
        g0.p(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f58507b;
        }
        if (fVar instanceof w2) {
            return a(((w2) fVar).m());
        }
        return null;
    }

    @m80.l
    @f50.f
    public static final f c(@m80.k o50.f fVar, @m80.k f descriptor) {
        f50.i d11;
        g0.p(fVar, "<this>");
        g0.p(descriptor, "descriptor");
        h10.d<?> a11 = a(descriptor);
        if (a11 == null || (d11 = o50.f.d(fVar, a11, null, 2, null)) == null) {
            return null;
        }
        return d11.a();
    }

    @f50.f
    @m80.k
    public static final List<f> d(@m80.k o50.f fVar, @m80.k f descriptor) {
        g0.p(fVar, "<this>");
        g0.p(descriptor, "descriptor");
        h10.d<?> a11 = a(descriptor);
        if (a11 == null) {
            return h0.J();
        }
        Map<h10.d<?>, f50.i<?>> map = ((o50.d) fVar).f75924b.get(a11);
        List values = map != null ? map.values() : null;
        if (values == null) {
            values = h0.J();
        }
        Collection<f50.i<?>> collection = values;
        ArrayList arrayList = new ArrayList(i0.d0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((f50.i) it.next()).a());
        }
        return arrayList;
    }

    @m80.k
    public static final f e(@m80.k f fVar, @m80.k h10.d<?> context) {
        g0.p(fVar, "<this>");
        g0.p(context, "context");
        return new c(fVar, context);
    }

    @f50.f
    public static /* synthetic */ void b(f fVar) {
    }
}
