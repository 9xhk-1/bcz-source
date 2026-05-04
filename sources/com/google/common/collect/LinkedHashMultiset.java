package com.google.common.collect;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public final class LinkedHashMultiset<E> extends f<E> {
    public LinkedHashMultiset(int distinctElements) {
        super(distinctElements);
    }

    public static <E> LinkedHashMultiset<E> create() {
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
        return new r7(distinctElements);
    }

    public static <E> LinkedHashMultiset<E> create(int distinctElements) {
        return new LinkedHashMultiset<>(distinctElements);
    }

    public static <E> LinkedHashMultiset<E> create(Iterable<? extends E> elements) {
        LinkedHashMultiset<E> create = create(k7.l(elements));
        k6.a(create, elements);
        return create;
    }
}
