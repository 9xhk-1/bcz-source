package v20;

import a00.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import m80.k;
import n20.f;
import s10.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSyntheticJavaPartsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyntheticJavaPartsProvider.kt\norg/jetbrains/kotlin/resolve/jvm/CompositeSyntheticJavaPartsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1368#2:109\n1454#2,5:110\n1863#2,2:115\n1368#2:117\n1454#2,5:118\n1863#2,2:123\n1863#2,2:125\n1368#2:127\n1454#2,5:128\n1863#2,2:133\n1797#2,3:135\n*S KotlinDebug\n*F\n+ 1 SyntheticJavaPartsProvider.kt\norg/jetbrains/kotlin/resolve/jvm/CompositeSyntheticJavaPartsProvider\n*L\n55#1:109\n55#1:110,5\n64#1:115,2\n68#1:117\n68#1:118,5\n76#1:123,2\n84#1:125,2\n88#1:127\n88#1:128,5\n97#1:133,2\n105#1:135,3\n*E\n"})
/* loaded from: classes8.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<e> f92888b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k List<? extends e> inner) {
        g0.p(inner, "inner");
        this.f92888b = inner;
    }

    @Override // v20.e
    @k
    public List<f> a(@k p10.b thisDescriptor, @k b20.k c11) {
        g0.p(thisDescriptor, "thisDescriptor");
        g0.p(c11, "c");
        List<e> list = this.f92888b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, ((e) it.next()).a(thisDescriptor, c11));
        }
        return arrayList;
    }

    @Override // v20.e
    public void b(@k p10.b thisDescriptor, @k f name, @k Collection<g> result, @k b20.k c11) {
        g0.p(thisDescriptor, "thisDescriptor");
        g0.p(name, "name");
        g0.p(result, "result");
        g0.p(c11, "c");
        Iterator<T> it = this.f92888b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b(thisDescriptor, name, result, c11);
        }
    }

    @Override // v20.e
    public void c(@k p10.b thisDescriptor, @k f name, @k List<p10.b> result, @k b20.k c11) {
        g0.p(thisDescriptor, "thisDescriptor");
        g0.p(name, "name");
        g0.p(result, "result");
        g0.p(c11, "c");
        Iterator<T> it = this.f92888b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).c(thisDescriptor, name, result, c11);
        }
    }

    @Override // v20.e
    public void d(@k p10.b thisDescriptor, @k List<kotlin.reflect.jvm.internal.impl.descriptors.b> result, @k b20.k c11) {
        g0.p(thisDescriptor, "thisDescriptor");
        g0.p(result, "result");
        g0.p(c11, "c");
        Iterator<T> it = this.f92888b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).d(thisDescriptor, result, c11);
        }
    }

    @Override // v20.e
    @k
    public List<f> e(@k p10.b thisDescriptor, @k b20.k c11) {
        g0.p(thisDescriptor, "thisDescriptor");
        g0.p(c11, "c");
        List<e> list = this.f92888b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, ((e) it.next()).e(thisDescriptor, c11));
        }
        return arrayList;
    }

    @Override // v20.e
    @k
    public k0 f(@k p10.b thisDescriptor, @k k0 propertyDescriptor, @k b20.k c11) {
        g0.p(thisDescriptor, "thisDescriptor");
        g0.p(propertyDescriptor, "propertyDescriptor");
        g0.p(c11, "c");
        Iterator<T> it = this.f92888b.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((e) it.next()).f(thisDescriptor, propertyDescriptor, c11);
        }
        return propertyDescriptor;
    }

    @Override // v20.e
    @k
    public List<f> g(@k p10.b thisDescriptor, @k b20.k c11) {
        g0.p(thisDescriptor, "thisDescriptor");
        g0.p(c11, "c");
        List<e> list = this.f92888b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, ((e) it.next()).g(thisDescriptor, c11));
        }
        return arrayList;
    }

    @Override // v20.e
    public void h(@k p10.b thisDescriptor, @k f name, @k Collection<g> result, @k b20.k c11) {
        g0.p(thisDescriptor, "thisDescriptor");
        g0.p(name, "name");
        g0.p(result, "result");
        g0.p(c11, "c");
        Iterator<T> it = this.f92888b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).h(thisDescriptor, name, result, c11);
        }
    }
}
