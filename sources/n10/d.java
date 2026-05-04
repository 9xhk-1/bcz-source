package n10;

import a00.i0;
import a00.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import n10.o;
import n20.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCompanionObjectMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompanionObjectMapping.kt\norg/jetbrains/kotlin/builtins/CompanionObjectMapping\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1557#2:21\n1628#2,3:22\n1628#2,3:25\n*S KotlinDebug\n*F\n+ 1 CompanionObjectMapping.kt\norg/jetbrains/kotlin/builtins/CompanionObjectMapping\n*L\n12#1:21\n12#1:22,3\n16#1:25,3\n*E\n"})
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d f73966a = new d();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Set<n20.b> f73967b;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(i0.d0(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(o.c((PrimitiveType) it.next()));
        }
        List J4 = r0.J4(r0.J4(r0.J4(arrayList, o.a.f74043h.l()), o.a.f74047j.l()), o.a.f74065s.l());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = n20.b.f74280d;
        Iterator it2 = J4.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(aVar.c((n20.c) it2.next()));
        }
        f73967b = linkedHashSet;
    }

    @m80.k
    public final Set<n20.b> a() {
        return f73967b;
    }

    @m80.k
    public final Set<n20.b> b() {
        return f73967b;
    }
}
