package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public abstract class q5<E> extends ImmutableList<E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    public static class a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableCollection<?> f33728a;

        public a(ImmutableCollection<?> collection) {
            this.f33728a = collection;
        }

        public Object readResolve() {
            return this.f33728a.asList();
        }
    }

    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract ImmutableCollection<E> a();

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object target) {
        return a().contains(target);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return a().isPartialView();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return a().size();
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @go.d
    @go.c
    public Object writeReplace() {
        return new a(a());
    }
}
