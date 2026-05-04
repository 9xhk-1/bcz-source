package j50;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class h1<E> extends y<E, Set<? extends E>, LinkedHashSet<E>> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h50.f f63375b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(@m80.k f50.i<E> eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.g0.p(eSerializer, "eSerializer");
        this.f63375b = new g1(eSerializer.a());
    }

    @Override // j50.a
    @m80.k
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> q(@m80.k Set<? extends E> set) {
        kotlin.jvm.internal.g0.p(set, "<this>");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }

    @Override // j50.a
    @m80.k
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Set<E> r(@m80.k LinkedHashSet<E> linkedHashSet) {
        kotlin.jvm.internal.g0.p(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // j50.x, f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f63375b;
    }

    @Override // j50.a
    @m80.k
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> g() {
        return new LinkedHashSet<>();
    }

    @Override // j50.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int h(@m80.k LinkedHashSet<E> linkedHashSet) {
        kotlin.jvm.internal.g0.p(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // j50.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(@m80.k LinkedHashSet<E> linkedHashSet, int i11) {
        kotlin.jvm.internal.g0.p(linkedHashSet, "<this>");
    }

    @Override // j50.x
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k LinkedHashSet<E> linkedHashSet, int i11, E e11) {
        kotlin.jvm.internal.g0.p(linkedHashSet, "<this>");
        linkedHashSet.add(e11);
    }
}
