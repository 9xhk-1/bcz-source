package com.google.common.collect;

import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.j7;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public class f8<E> extends ImmutableMultiset<E> {

    /* renamed from: d, reason: collision with root package name */
    public static final f8<Object> f33486d = new f8<>(q7.c());

    /* renamed from: a, reason: collision with root package name */
    public final transient q7<E> f33487a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f33488b;

    /* renamed from: c, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient ImmutableSet<E> f33489c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends h6<E> {
        public b() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object object) {
            return f8.this.contains(object);
        }

        @Override // com.google.common.collect.h6
        public E get(int index) {
            return f8.this.f33487a.j(index);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f8.this.f33487a.D();
        }

        @Override // com.google.common.collect.h6, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static class c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f33491a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f33492b;

        public c(j7<? extends Object> multiset) {
            int size = multiset.entrySet().size();
            this.f33491a = new Object[size];
            this.f33492b = new int[size];
            int i11 = 0;
            for (j7.a<? extends Object> aVar : multiset.entrySet()) {
                this.f33491a[i11] = aVar.e();
                this.f33492b[i11] = aVar.getCount();
                i11++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            ImmutableMultiset.b bVar = new ImmutableMultiset.b(this.f33491a.length);
            int i11 = 0;
            while (true) {
                Object[] objArr = this.f33491a;
                if (i11 >= objArr.length) {
                    return bVar.e();
                }
                bVar.k(objArr[i11], this.f33492b[i11]);
                i11++;
            }
        }
    }

    public f8(q7<E> contents) {
        this.f33487a = contents;
        long j11 = 0;
        for (int i11 = 0; i11 < contents.D(); i11++) {
            j11 += contents.l(i11);
        }
        this.f33488b = ro.i.A(j11);
    }

    @Override // com.google.common.collect.j7
    public int count(@CheckForNull Object element) {
        return this.f33487a.g(element);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public j7.a<E> getEntry(int index) {
        return this.f33487a.h(index);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    public int size() {
        return this.f33488b;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @go.d
    @go.c
    public Object writeReplace() {
        return new c(this);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.j7
    public ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.f33489c;
        if (immutableSet != null) {
            return immutableSet;
        }
        b bVar = new b();
        this.f33489c = bVar;
        return bVar;
    }
}
