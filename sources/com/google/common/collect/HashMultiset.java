package com.google.common.collect;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public final class HashMultiset<E> extends f<E> {

    @go.d
    @go.c
    private static final long serialVersionUID = 0;

    public HashMultiset(int distinctElements) {
        super(distinctElements);
    }

    public static <E> HashMultiset<E> create() {
        return create(3);
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object element) {
        return super.contains(element);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.f
    public q7<E> newBackingMap(int distinctElements) {
        return new q7<>(distinctElements);
    }

    public static <E> HashMultiset<E> create(int distinctElements) {
        return new HashMultiset<>(distinctElements);
    }

    public static <E> HashMultiset<E> create(Iterable<? extends E> elements) {
        HashMultiset<E> create = create(k7.l(elements));
        k6.a(create, elements);
        return create;
    }
}
