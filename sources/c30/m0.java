package c30;

import a00.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDeserializedPackageMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedPackageMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedPackageMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1368#2:82\n1454#2,5:83\n1755#2,3:88\n*S KotlinDebug\n*F\n+ 1 DeserializedPackageMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedPackageMemberScope\n*L\n55#1:82\n55#1:83,5\n58#1:88,3\n*E\n"})
/* loaded from: classes8.dex */
public class m0 extends w {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final p10.g0 f7707g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final String f7708h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final n20.c f7709i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m0(@m80.k p10.g0 r10, @m80.k kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r11, @m80.k k20.c r12, @m80.k k20.a r13, @m80.l c30.s r14, @m80.k a30.m r15, @m80.k java.lang.String r16, @m80.k x00.a<? extends java.util.Collection<n20.f>> r17) {
        /*
            r9 = this;
            r7 = r16
            java.lang.String r0 = "packageDescriptor"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "metadataVersion"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "components"
            r3 = r15
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "debugName"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "classNames"
            r8 = r17
            kotlin.jvm.internal.g0.p(r8, r0)
            k20.g r3 = new k20.g
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r0 = r11.getTypeTable()
            java.lang.String r4 = "getTypeTable(...)"
            kotlin.jvm.internal.g0.o(r0, r4)
            r3.<init>(r0)
            k20.h$a r0 = k20.h.f65196b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r4 = r11.getVersionRequirementTable()
            java.lang.String r6 = "getVersionRequirementTable(...)"
            kotlin.jvm.internal.g0.o(r4, r6)
            k20.h r4 = r0.a(r4)
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r0 = r15
            a30.o r0 = r0.a(r1, r2, r3, r4, r5, r6)
            java.util.List r2 = r11.getFunctionList()
            java.lang.String r1 = "getFunctionList(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            java.util.List r3 = r11.getPropertyList()
            java.lang.String r1 = "getPropertyList(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            java.util.List r4 = r11.getTypeAliasList()
            java.lang.String r1 = "getTypeAliasList(...)"
            kotlin.jvm.internal.g0.o(r4, r1)
            r1 = r0
            r5 = r8
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r9.f7707g = r10
            r9.f7708h = r7
            n20.c r1 = r10.d()
            r9.f7709i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.m0.<init>(p10.g0, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, k20.c, k20.a, c30.s, a30.m, java.lang.String, x00.a):void");
    }

    @Override // c30.w
    public boolean A(@m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        if (super.A(name)) {
            return true;
        }
        Iterable<r10.b> l11 = t().c().l();
        if ((l11 instanceof Collection) && ((Collection) l11).isEmpty()) {
            return false;
        }
        Iterator<r10.b> it = l11.iterator();
        while (it.hasNext()) {
            if (it.next().a(this.f7709i, name)) {
                return true;
            }
        }
        return false;
    }

    @Override // x20.l, x20.n
    @m80.k
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public List<p10.h> f(@m80.k x20.d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
        Collection<p10.h> n11 = n(kindFilter, nameFilter, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<r10.b> l11 = t().c().l();
        ArrayList arrayList = new ArrayList();
        Iterator<r10.b> it = l11.iterator();
        while (it.hasNext()) {
            a00.m0.s0(arrayList, it.next().b(this.f7709i));
        }
        return a00.r0.I4(n11, arrayList);
    }

    @Override // x20.l, x20.n
    public void e(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        w10.a.b(t().c().p(), location, this.f7707g, name);
    }

    @Override // c30.w, x20.l, x20.n
    @m80.l
    public p10.d h(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        e(name, location);
        return super.h(name, location);
    }

    @Override // c30.w
    public void k(@m80.k Collection<p10.h> result, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        kotlin.jvm.internal.g0.p(result, "result");
        kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
    }

    @Override // c30.w
    @m80.k
    public n20.b q(@m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return new n20.b(this.f7709i, name);
    }

    @m80.k
    public String toString() {
        return this.f7708h;
    }

    @Override // c30.w
    @m80.l
    public Set<n20.f> w() {
        return w1.k();
    }

    @Override // c30.w
    @m80.k
    public Set<n20.f> x() {
        return w1.k();
    }

    @Override // c30.w
    @m80.k
    public Set<n20.f> y() {
        return w1.k();
    }
}
