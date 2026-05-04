package y10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnnotationTypeQualifierResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AnnotationTypeQualifierResolver\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n77#2:58\n97#2,5:59\n1368#3:64\n1454#3,5:65\n*S KotlinDebug\n*F\n+ 1 AnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AnnotationTypeQualifierResolver\n*L\n43#1:58\n43#1:59,5\n52#1:64\n52#1:65,5\n*E\n"})
/* loaded from: classes8.dex */
public final class c extends b<q10.c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@m80.k z javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        kotlin.jvm.internal.g0.p(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    @Override // y10.b
    @m80.k
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Iterable<q10.c> m(@m80.k q10.c cVar) {
        q10.g annotations;
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        p10.b l11 = u20.e.l(cVar);
        return (l11 == null || (annotations = l11.getAnnotations()) == null) ? a00.h0.J() : annotations;
    }

    public final List<String> B(s20.g<?> gVar) {
        if (!(gVar instanceof s20.b)) {
            return gVar instanceof s20.k ? a00.g0.l(((s20.k) gVar).c().d()) : a00.h0.J();
        }
        List<? extends s20.g<?>> b11 = ((s20.b) gVar).b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = b11.iterator();
        while (it.hasNext()) {
            a00.m0.s0(arrayList, B((s20.g) it.next()));
        }
        return arrayList;
    }

    @Override // y10.b
    public boolean o() {
        return false;
    }

    @Override // y10.b
    @m80.k
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable<String> c(@m80.k q10.c cVar, boolean z11) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        Map<n20.f, s20.g<?>> a11 = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<n20.f, s20.g<?>> entry : a11.entrySet()) {
            a00.m0.s0(arrayList, (!z11 || kotlin.jvm.internal.g0.g(entry.getKey(), e0.f99032c)) ? B(entry.getValue()) : a00.h0.J());
        }
        return arrayList;
    }

    @Override // y10.b
    @m80.l
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public n20.c k(@m80.k q10.c cVar) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        return cVar.d();
    }

    @Override // y10.b
    @m80.k
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object l(@m80.k q10.c cVar) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        p10.b l11 = u20.e.l(cVar);
        kotlin.jvm.internal.g0.m(l11);
        return l11;
    }
}
