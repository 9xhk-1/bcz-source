package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class w<E> extends AbstractList<List<E>> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final transient ImmutableList<List<E>> f34070a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int[] f34071b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ImmutableList<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f34072a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w f34073b;

        public a(final w this$0, final int val$index) {
            this.f34072a = val$index;
            this.f34073b = this$0;
        }

        @Override // java.util.List
        public E get(int i11) {
            Preconditions.checkElementIndex(i11, size());
            return (E) ((List) this.f34073b.f34070a.get(i11)).get(this.f34073b.g(this.f34072a, i11));
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f34073b.f34070a.size();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public w(ImmutableList<List<E>> axes) {
        this.f34070a = axes;
        int[] iArr = new int[axes.size() + 1];
        iArr[axes.size()] = 1;
        try {
            for (int size = axes.size() - 1; size >= 0; size--) {
                iArr[size] = com.google.common.math.f.d(iArr[size + 1], axes.get(size).size());
            }
            this.f34071b = iArr;
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    public static <E> List<List<E>> d(List<? extends List<? extends E>> lists) {
        ImmutableList.a aVar = new ImmutableList.a(lists.size());
        Iterator<? extends List<? extends E>> it = lists.iterator();
        while (it.hasNext()) {
            ImmutableList copyOf = ImmutableList.copyOf((Collection) it.next());
            if (copyOf.isEmpty()) {
                return ImmutableList.of();
            }
            aVar.g(copyOf);
        }
        return new w(aVar.e());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@CheckForNull Object object) {
        if (!(object instanceof List)) {
            return false;
        }
        List list = (List) object;
        if (list.size() != this.f34070a.size()) {
            return false;
        }
        Iterator<E> it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (!this.f34070a.get(i11).contains(it.next())) {
                return false;
            }
            i11++;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ImmutableList<E> get(int index) {
        Preconditions.checkElementIndex(index, size());
        return new a(this, index);
    }

    public final int g(int index, int axis) {
        return (index / this.f34071b[axis + 1]) % this.f34070a.get(axis).size();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(@CheckForNull Object o11) {
        if (!(o11 instanceof List)) {
            return -1;
        }
        List list = (List) o11;
        if (list.size() != this.f34070a.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i11 = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int indexOf = this.f34070a.get(nextIndex).indexOf(listIterator.next());
            if (indexOf == -1) {
                return -1;
            }
            i11 += indexOf * this.f34071b[nextIndex + 1];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(@CheckForNull Object o11) {
        if (!(o11 instanceof List)) {
            return -1;
        }
        List list = (List) o11;
        if (list.size() != this.f34070a.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i11 = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int lastIndexOf = this.f34070a.get(nextIndex).lastIndexOf(listIterator.next());
            if (lastIndexOf == -1) {
                return -1;
            }
            i11 += lastIndexOf * this.f34071b[nextIndex + 1];
        }
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f34071b[0];
    }
}
