package g20;

import e30.h2;
import e30.k2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nsignatureEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,296:1\n1557#2:297\n1628#2,3:298\n1557#2:301\n1628#2,3:302\n1557#2:306\n1628#2,3:307\n1755#2,3:310\n1755#2,3:313\n1567#2:316\n1598#2,4:317\n1557#2:321\n1628#2,3:322\n1557#2:325\n1628#2,3:326\n1#3:305\n*S KotlinDebug\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n*L\n55#1:297\n55#1:298,3\n66#1:301\n66#1:302,3\n123#1:306\n123#1:307,3\n144#1:310,3\n150#1:313,3\n156#1:316\n156#1:317,4\n170#1:321\n170#1:322,3\n220#1:325\n220#1:326,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g f52572a;

    public b1(@m80.k g typeEnhancement) {
        kotlin.jvm.internal.g0.p(typeEnhancement, "typeEnhancement");
        this.f52572a = typeEnhancement;
    }

    public static final Boolean g(k2 k2Var) {
        p10.d r11 = k2Var.I0().r();
        if (r11 == null) {
            return Boolean.FALSE;
        }
        n20.f name = r11.getName();
        o10.a aVar = o10.a.f75522a;
        return Boolean.valueOf(kotlin.jvm.internal.g0.g(name, aVar.h().g()) && kotlin.jvm.internal.g0.g(u20.e.k(r11), aVar.h()));
    }

    public static /* synthetic */ e30.r0 j(b1 b1Var, d1 d1Var, e30.r0 r0Var, List list, f1 f1Var, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f1Var = null;
        }
        f1 f1Var2 = f1Var;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return b1Var.h(d1Var, r0Var, list, f1Var2, z11);
    }

    public static /* synthetic */ e30.r0 k(b1 b1Var, CallableMemberDescriptor callableMemberDescriptor, q10.a aVar, boolean z11, b20.k kVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, f1 f1Var, boolean z12, x00.l lVar, int i11, Object obj) {
        return b1Var.i(callableMemberDescriptor, aVar, z11, kVar, annotationQualifierApplicabilityType, f1Var, (i11 & 32) != 0 ? false : z12, lVar);
    }

    public static final e30.r0 m(CallableMemberDescriptor it) {
        kotlin.jvm.internal.g0.p(it, "it");
        e30.r0 returnType = it.getReturnType();
        kotlin.jvm.internal.g0.m(returnType);
        return returnType;
    }

    public static final e30.r0 n(CallableMemberDescriptor it) {
        kotlin.jvm.internal.g0.p(it, "it");
        p10.t0 f02 = it.f0();
        kotlin.jvm.internal.g0.m(f02);
        e30.r0 type = f02.getType();
        kotlin.jvm.internal.g0.o(type, "getType(...)");
        return type;
    }

    public static final e30.r0 o(j1 j1Var, CallableMemberDescriptor it) {
        kotlin.jvm.internal.g0.p(it, "it");
        e30.r0 type = it.g().get(j1Var.getIndex()).getType();
        kotlin.jvm.internal.g0.o(type, "getType(...)");
        return type;
    }

    public static final boolean s(k2 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it instanceof e30.b1;
    }

    public final boolean f(e30.r0 r0Var) {
        return h2.c(r0Var, a1.f52567a);
    }

    public final e30.r0 h(d1 d1Var, e30.r0 r0Var, List<? extends e30.r0> list, f1 f1Var, boolean z11) {
        return this.f52572a.a(r0Var, d1Var.d(r0Var, list, f1Var, z11), d1Var.z());
    }

    public final e30.r0 i(CallableMemberDescriptor callableMemberDescriptor, q10.a aVar, boolean z11, b20.k kVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, f1 f1Var, boolean z12, x00.l<? super CallableMemberDescriptor, ? extends e30.r0> lVar) {
        d1 d1Var = new d1(aVar, z11, kVar, annotationQualifierApplicabilityType, false, 16, null);
        e30.r0 invoke = lVar.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> e11 = callableMemberDescriptor.e();
        kotlin.jvm.internal.g0.o(e11, "getOverriddenDescriptors(...)");
        Collection<? extends CallableMemberDescriptor> collection = e11;
        ArrayList arrayList = new ArrayList(a00.i0.d0(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            kotlin.jvm.internal.g0.m(callableMemberDescriptor2);
            arrayList.add(lVar.invoke(callableMemberDescriptor2));
        }
        return h(d1Var, invoke, arrayList, f1Var, z12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0223, code lost:
    
        if (r3 == null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D l(D r18, b20.k r19) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g20.b1.l(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, b20.k):kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final <D extends CallableMemberDescriptor> Collection<D> p(@m80.k b20.k c11, @m80.k Collection<? extends D> platformSignatures) {
        kotlin.jvm.internal.g0.p(c11, "c");
        kotlin.jvm.internal.g0.p(platformSignatures, "platformSignatures");
        Collection<? extends D> collection = platformSignatures;
        ArrayList arrayList = new ArrayList(a00.i0.d0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(l((CallableMemberDescriptor) it.next(), c11));
        }
        return arrayList;
    }

    @m80.k
    public final e30.r0 q(@m80.k e30.r0 type, @m80.k b20.k context) {
        kotlin.jvm.internal.g0.p(type, "type");
        kotlin.jvm.internal.g0.p(context, "context");
        e30.r0 j11 = j(this, new d1(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true), type, a00.h0.J(), null, false, 12, null);
        return j11 == null ? type : j11;
    }

    @m80.k
    public final List<e30.r0> r(@m80.k p10.c1 typeParameter, @m80.k List<? extends e30.r0> bounds, @m80.k b20.k context) {
        e30.r0 r0Var;
        e30.r0 j11;
        kotlin.jvm.internal.g0.p(typeParameter, "typeParameter");
        kotlin.jvm.internal.g0.p(bounds, "bounds");
        kotlin.jvm.internal.g0.p(context, "context");
        List<? extends e30.r0> list = bounds;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        for (e30.r0 r0Var2 : list) {
            if (j30.e.f(r0Var2, z0.f52661a)) {
                r0Var = r0Var2;
            } else {
                r0Var = r0Var2;
                j11 = j(this, new d1(typeParameter, false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null), r0Var, a00.h0.J(), null, false, 12, null);
                if (j11 != null) {
                    arrayList.add(j11);
                }
            }
            j11 = r0Var;
            arrayList.add(j11);
        }
        return arrayList;
    }

    public final e30.r0 t(CallableMemberDescriptor callableMemberDescriptor, j1 j1Var, b20.k kVar, f1 f1Var, boolean z11, x00.l<? super CallableMemberDescriptor, ? extends e30.r0> lVar) {
        b20.k k11;
        return i(callableMemberDescriptor, j1Var, false, (j1Var == null || (k11 = b20.c.k(kVar, j1Var.getAnnotations())) == null) ? kVar : k11, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, f1Var, z11, lVar);
    }

    public final <D extends CallableMemberDescriptor> q10.g u(D d11, b20.k kVar) {
        p10.d a11 = p10.n.a(d11);
        if (a11 == null) {
            return d11.getAnnotations();
        }
        c20.n nVar = a11 instanceof c20.n ? (c20.n) a11 : null;
        List<f20.a> O0 = nVar != null ? nVar.O0() : null;
        List<f20.a> list = O0;
        if (list == null || list.isEmpty()) {
            return d11.getAnnotations();
        }
        List<f20.a> list2 = O0;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new c20.j(kVar, (f20.a) it.next(), true));
        }
        return q10.g.A0.a(a00.r0.E4(d11.getAnnotations(), arrayList));
    }
}
