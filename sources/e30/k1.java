package e30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStarProjectionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StarProjectionImpl.kt\norg/jetbrains/kotlin/types/StarProjectionImplKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1557#2:102\n1628#2,3:103\n1557#2:106\n1628#2,3:107\n*S KotlinDebug\n*F\n+ 1 StarProjectionImpl.kt\norg/jetbrains/kotlin/types/StarProjectionImplKt\n*L\n66#1:102\n66#1:103,3\n73#1:106\n73#1:107,3\n*E\n"})
/* loaded from: classes8.dex */
public final class k1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends v1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<u1> f48616d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends u1> list) {
            this.f48616d = list;
        }

        @Override // e30.v1
        public a2 k(u1 key) {
            kotlin.jvm.internal.g0.p(key, "key");
            if (!this.f48616d.contains(key)) {
                return null;
            }
            p10.d r11 = key.r();
            kotlin.jvm.internal.g0.n(r11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return h2.s((p10.c1) r11);
        }
    }

    public static final r0 a(List<? extends u1> list, List<? extends r0> list2, n10.j jVar) {
        r0 p11 = f2.g(new a(list)).p((r0) a00.r0.G2(list2), Variance.OUT_VARIANCE);
        if (p11 != null) {
            return p11;
        }
        c1 y11 = jVar.y();
        kotlin.jvm.internal.g0.o(y11, "getDefaultBound(...)");
        return y11;
    }

    @m80.k
    public static final r0 b(@m80.k p10.c1 c1Var) {
        kotlin.jvm.internal.g0.p(c1Var, "<this>");
        p10.h b11 = c1Var.b();
        kotlin.jvm.internal.g0.o(b11, "getContainingDeclaration(...)");
        if (b11 instanceof p10.e) {
            List<p10.c1> parameters = ((p10.e) b11).o().getParameters();
            kotlin.jvm.internal.g0.o(parameters, "getParameters(...)");
            List<p10.c1> list = parameters;
            ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                u1 o11 = ((p10.c1) it.next()).o();
                kotlin.jvm.internal.g0.o(o11, "getTypeConstructor(...)");
                arrayList.add(o11);
            }
            List<r0> upperBounds = c1Var.getUpperBounds();
            kotlin.jvm.internal.g0.o(upperBounds, "getUpperBounds(...)");
            return a(arrayList, upperBounds, u20.e.m(c1Var));
        }
        if (!(b11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<p10.c1> typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.e) b11).getTypeParameters();
        kotlin.jvm.internal.g0.o(typeParameters, "getTypeParameters(...)");
        List<p10.c1> list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            u1 o12 = ((p10.c1) it2.next()).o();
            kotlin.jvm.internal.g0.o(o12, "getTypeConstructor(...)");
            arrayList2.add(o12);
        }
        List<r0> upperBounds2 = c1Var.getUpperBounds();
        kotlin.jvm.internal.g0.o(upperBounds2, "getUpperBounds(...)");
        return a(arrayList2, upperBounds2, u20.e.m(c1Var));
    }
}
