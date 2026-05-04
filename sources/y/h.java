package y;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class h<E> extends g<E> implements List<E>, y00.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public List<E> f98782b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@k List<E> list) {
        super(list);
        g0.p(list, "list");
        this.f98782b = list;
    }

    @Override // java.util.List
    public void add(int i11, E e11) {
        this.f98782b.add(i11, e11);
    }

    @Override // java.util.List
    public boolean addAll(int i11, @k Collection<? extends E> elements) {
        g0.p(elements, "elements");
        return this.f98782b.addAll(i11, elements);
    }

    @k
    public final List<E> g() {
        return this.f98782b;
    }

    @Override // java.util.List
    public E get(int i11) {
        return this.f98782b.get(i11);
    }

    public E h(int i11) {
        return this.f98782b.remove(i11);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f98782b.indexOf(obj);
    }

    public final void j(@k List<E> list) {
        g0.p(list, "<set-?>");
        this.f98782b = list;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f98782b.lastIndexOf(obj);
    }

    @Override // java.util.List
    @k
    public ListIterator<E> listIterator() {
        return this.f98782b.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ E remove(int i11) {
        return h(i11);
    }

    @Override // java.util.List
    public E set(int i11, E e11) {
        return this.f98782b.set(i11, e11);
    }

    @Override // java.util.List
    @k
    public List<E> subList(int i11, int i12) {
        return this.f98782b.subList(i11, i12);
    }

    @Override // java.util.List
    @k
    public ListIterator<E> listIterator(int i11) {
        return this.f98782b.listIterator(i11);
    }
}
