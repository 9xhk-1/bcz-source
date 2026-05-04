package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.f9;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class k8<R, C, V> extends ImmutableTable<R, C, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends h6<f9.a<R, C, V>> {
        public b() {
        }

        @Override // com.google.common.collect.h6
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f9.a<R, C, V> get(int index) {
            return k8.this.getCell(index);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object object) {
            if (object instanceof f9.a) {
                f9.a aVar = (f9.a) object;
                Object obj = k8.this.get(aVar.b(), aVar.a());
                if (obj != null && obj.equals(aVar.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k8.this.size();
        }

        @Override // com.google.common.collect.h6, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends ImmutableList<V> {
        public c() {
        }

        @Override // java.util.List
        public V get(int i11) {
            return (V) k8.this.getValue(i11);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return k8.this.size();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static /* synthetic */ int a(Comparator comparator, Comparator comparator2, f9.a aVar, f9.a aVar2) {
        int compare = comparator == null ? 0 : comparator.compare(aVar.b(), aVar2.b());
        if (compare != 0) {
            return compare;
        }
        if (comparator2 == null) {
            return 0;
        }
        return comparator2.compare(aVar.a(), aVar2.a());
    }

    public static <R, C, V> k8<R, C, V> c(Iterable<f9.a<R, C, V>> cells) {
        return e(cells, null, null);
    }

    public static <R, C, V> k8<R, C, V> d(List<f9.a<R, C, V>> cells, @CheckForNull final Comparator<? super R> rowComparator, @CheckForNull final Comparator<? super C> columnComparator) {
        Preconditions.checkNotNull(cells);
        if (rowComparator != null || columnComparator != null) {
            Collections.sort(cells, new Comparator() { // from class: com.google.common.collect.j8
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return k8.a(rowComparator, columnComparator, (f9.a) obj, (f9.a) obj2);
                }
            });
        }
        return e(cells, rowComparator, columnComparator);
    }

    public static <R, C, V> k8<R, C, V> e(Iterable<f9.a<R, C, V>> cells, @CheckForNull Comparator<? super R> rowComparator, @CheckForNull Comparator<? super C> columnComparator) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ImmutableList copyOf = ImmutableList.copyOf(cells);
        for (f9.a<R, C, V> aVar : cells) {
            linkedHashSet.add(aVar.b());
            linkedHashSet2.add(aVar.a());
        }
        return f(copyOf, rowComparator == null ? ImmutableSet.copyOf((Collection) linkedHashSet) : ImmutableSet.copyOf((Collection) ImmutableList.sortedCopyOf(rowComparator, linkedHashSet)), columnComparator == null ? ImmutableSet.copyOf((Collection) linkedHashSet2) : ImmutableSet.copyOf((Collection) ImmutableList.sortedCopyOf(columnComparator, linkedHashSet2)));
    }

    public static <R, C, V> k8<R, C, V> f(ImmutableList<f9.a<R, C, V>> cellList, ImmutableSet<R> rowSpace, ImmutableSet<C> columnSpace) {
        return ((long) cellList.size()) > (((long) rowSpace.size()) * ((long) columnSpace.size())) / 2 ? new p3(cellList, rowSpace, columnSpace) : new b9(cellList, rowSpace, columnSpace);
    }

    public final void b(R rowKey, C columnKey, @CheckForNull V existingValue, V newValue) {
        Preconditions.checkArgument(existingValue == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", rowKey, columnKey, newValue, existingValue);
    }

    public abstract f9.a<R, C, V> getCell(int iterationIndex);

    public abstract V getValue(int iterationIndex);

    @Override // com.google.common.collect.ImmutableTable
    @go.d
    @go.c
    public abstract Object writeReplace();

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q
    public final ImmutableSet<f9.a<R, C, V>> createCellSet() {
        return isEmpty() ? ImmutableSet.of() : new b();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q
    public final ImmutableCollection<V> createValues() {
        return isEmpty() ? ImmutableList.of() : new c();
    }
}
