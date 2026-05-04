package j50;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class v2<ElementKlass, Element extends ElementKlass> extends x<Element, Element[], ArrayList<Element>> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h10.d<ElementKlass> f63485b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final h50.f f63486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(@m80.k h10.d<ElementKlass> kClass, @m80.k f50.i<Element> eSerializer) {
        super(eSerializer, null);
        kotlin.jvm.internal.g0.p(kClass, "kClass");
        kotlin.jvm.internal.g0.p(eSerializer, "eSerializer");
        this.f63485b = kClass;
        this.f63486c = new d(eSerializer.a());
    }

    @Override // j50.a
    @m80.k
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> q(@m80.k Element[] elementArr) {
        kotlin.jvm.internal.g0.p(elementArr, "<this>");
        return new ArrayList<>(a00.q.t(elementArr));
    }

    @Override // j50.a
    @m80.k
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Element[] r(@m80.k ArrayList<Element> arrayList) {
        kotlin.jvm.internal.g0.p(arrayList, "<this>");
        return (Element[]) f2.u(arrayList, this.f63485b);
    }

    @Override // j50.x, f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f63486c;
    }

    @Override // j50.a
    @m80.k
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> g() {
        return new ArrayList<>();
    }

    @Override // j50.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int h(@m80.k ArrayList<Element> arrayList) {
        kotlin.jvm.internal.g0.p(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // j50.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(@m80.k ArrayList<Element> arrayList, int i11) {
        kotlin.jvm.internal.g0.p(arrayList, "<this>");
        arrayList.ensureCapacity(i11);
    }

    @Override // j50.a
    @m80.k
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterator<Element> j(@m80.k Element[] elementArr) {
        kotlin.jvm.internal.g0.p(elementArr, "<this>");
        return kotlin.jvm.internal.h.a(elementArr);
    }

    @Override // j50.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public int k(@m80.k Element[] elementArr) {
        kotlin.jvm.internal.g0.p(elementArr, "<this>");
        return elementArr.length;
    }

    @Override // j50.x
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k ArrayList<Element> arrayList, int i11, Element element) {
        kotlin.jvm.internal.g0.p(arrayList, "<this>");
        arrayList.add(i11, element);
    }
}
