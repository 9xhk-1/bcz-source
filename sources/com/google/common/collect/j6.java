package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.collect.s6;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@u3
@go.c
/* loaded from: classes7.dex */
public final class j6 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final s6 f33556a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f33557b;

        public <E> i6<E> a() {
            if (!this.f33557b) {
                this.f33556a.l();
            }
            return new d(this.f33556a);
        }

        public b b(int concurrencyLevel) {
            this.f33556a.a(concurrencyLevel);
            return this;
        }

        public b c() {
            this.f33557b = true;
            return this;
        }

        @go.c("java.lang.ref.WeakReference")
        public b d() {
            this.f33557b = false;
            return this;
        }

        public b() {
            this.f33556a = new s6();
            this.f33557b = true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<E> implements ho.r<E, E> {

        /* renamed from: a, reason: collision with root package name */
        public final i6<E> f33558a;

        public c(i6<E> interner) {
            this.f33558a = interner;
        }

        @Override // ho.r
        public E apply(E input) {
            return this.f33558a.a(input);
        }

        @Override // ho.r
        public boolean equals(@CheckForNull Object other) {
            if (other instanceof c) {
                return this.f33558a.equals(((c) other).f33558a);
            }
            return false;
        }

        public int hashCode() {
            return this.f33558a.hashCode();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static final class d<E> implements i6<E> {

        /* renamed from: a, reason: collision with root package name */
        @go.e
        public final t6<E, s6.a, ?, ?> f33559a;

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.collect.t6$j] */
        @Override // com.google.common.collect.i6
        public E a(E e11) {
            E e12;
            do {
                ?? i11 = this.f33559a.i(e11);
                if (i11 != 0 && (e12 = (E) i11.getKey()) != null) {
                    return e12;
                }
            } while (this.f33559a.putIfAbsent(e11, s6.a.VALUE) != null);
            return e11;
        }

        public d(s6 mapMaker) {
            this.f33559a = t6.h(mapMaker.h(Equivalence.c()));
        }
    }

    public static <E> ho.r<E, E> a(i6<E> interner) {
        return new c((i6) Preconditions.checkNotNull(interner));
    }

    public static b b() {
        return new b();
    }

    public static <E> i6<E> c() {
        return b().c().a();
    }

    @go.c("java.lang.ref.WeakReference")
    public static <E> i6<E> d() {
        return b().d().a();
    }
}
