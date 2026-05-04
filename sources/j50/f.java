package j50;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.h
@yz.v0
/* loaded from: classes8.dex */
public final class f<E> extends y<E, List<? extends E>, ArrayList<E>> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h50.f f63352b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@m80.k f50.i<E> element) {
        super(element);
        kotlin.jvm.internal.g0.p(element, "element");
        this.f63352b = new e(element.a());
    }

    @Override // j50.a
    @m80.k
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> q(@m80.k List<? extends E> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }

    @Override // j50.a
    @m80.k
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public List<E> r(@m80.k ArrayList<E> arrayList) {
        kotlin.jvm.internal.g0.p(arrayList, "<this>");
        return arrayList;
    }

    @Override // j50.x, f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f63352b;
    }

    @Override // j50.a
    @m80.k
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> g() {
        return new ArrayList<>();
    }

    @Override // j50.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int h(@m80.k ArrayList<E> arrayList) {
        kotlin.jvm.internal.g0.p(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // j50.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(@m80.k ArrayList<E> arrayList, int i11) {
        kotlin.jvm.internal.g0.p(arrayList, "<this>");
        arrayList.ensureCapacity(i11);
    }

    @Override // j50.x
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k ArrayList<E> arrayList, int i11, E e11) {
        kotlin.jvm.internal.g0.p(arrayList, "<this>");
        arrayList.add(i11, e11);
    }
}
