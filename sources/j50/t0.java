package j50;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class t0<E> extends y<E, Set<? extends E>, HashSet<E>> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h50.f f63468b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(@m80.k f50.i<E> eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.g0.p(eSerializer, "eSerializer");
        this.f63468b = new s0(eSerializer.a());
    }

    @Override // j50.a
    @m80.k
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public HashSet<E> q(@m80.k Set<? extends E> set) {
        kotlin.jvm.internal.g0.p(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }

    @Override // j50.a
    @m80.k
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Set<E> r(@m80.k HashSet<E> hashSet) {
        kotlin.jvm.internal.g0.p(hashSet, "<this>");
        return hashSet;
    }

    @Override // j50.x, f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f63468b;
    }

    @Override // j50.a
    @m80.k
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public HashSet<E> g() {
        return new HashSet<>();
    }

    @Override // j50.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int h(@m80.k HashSet<E> hashSet) {
        kotlin.jvm.internal.g0.p(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // j50.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(@m80.k HashSet<E> hashSet, int i11) {
        kotlin.jvm.internal.g0.p(hashSet, "<this>");
    }

    @Override // j50.x
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k HashSet<E> hashSet, int i11, E e11) {
        kotlin.jvm.internal.g0.p(hashSet, "<this>");
        hashSet.add(e11);
    }
}
