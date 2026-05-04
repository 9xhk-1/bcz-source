package c20;

import e30.c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLazyJavaTypeParameterDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1557#2:76\n1628#2,3:77\n*S KotlinDebug\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n*L\n62#1:76\n62#1:77,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b1 extends s10.b {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final b20.k f7525k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final f20.y f7526l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(@m80.k b20.k c11, @m80.k f20.y javaTypeParameter, int i11, @m80.k p10.h containingDeclaration) {
        super(c11.e(), containingDeclaration, new b20.g(c11, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Variance.INVARIANT, false, i11, p10.x0.f78622a, c11.a().v());
        kotlin.jvm.internal.g0.p(c11, "c");
        kotlin.jvm.internal.g0.p(javaTypeParameter, "javaTypeParameter");
        kotlin.jvm.internal.g0.p(containingDeclaration, "containingDeclaration");
        this.f7525k = c11;
        this.f7526l = javaTypeParameter;
    }

    @Override // s10.h
    @m80.k
    public List<e30.r0> E0(@m80.k List<? extends e30.r0> bounds) {
        kotlin.jvm.internal.g0.p(bounds, "bounds");
        return this.f7525k.a().r().r(this, bounds, this.f7525k);
    }

    @Override // s10.h
    public void F0(@m80.k e30.r0 type) {
        kotlin.jvm.internal.g0.p(type, "type");
    }

    @Override // s10.h
    @m80.k
    public List<e30.r0> G0() {
        return H0();
    }

    public final List<e30.r0> H0() {
        Collection<f20.j> upperBounds = this.f7526l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            c1 i11 = this.f7525k.d().q().i();
            kotlin.jvm.internal.g0.o(i11, "getAnyType(...)");
            c1 I = this.f7525k.d().q().I();
            kotlin.jvm.internal.g0.o(I, "getNullableAnyType(...)");
            return a00.g0.l(e30.u0.e(i11, I));
        }
        Collection<f20.j> collection = upperBounds;
        ArrayList arrayList = new ArrayList(a00.i0.d0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f7525k.g().p((f20.j) it.next(), d20.b.b(TypeUsage.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }
}
