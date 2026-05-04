package com.google.common.base;

import ho.d0;
import ho.e0;
import ho.f0;
import ho.i0;
import ho.j;
import ho.r;
import ho.s;
import java.io.Serializable;
import javax.annotation.CheckForNull;
import uo.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b
/* loaded from: classes7.dex */
public abstract class Equivalence<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;

        @f0
        private final T reference;

        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.d(this.reference, wrapper.reference);
            }
            return false;
        }

        @f0
        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.f(this.reference);
        }

        public String toString() {
            return this.equivalence + ".wrap(" + this.reference + pn.j.f81007d;
        }

        private Wrapper(Equivalence<? super T> equivalence, @f0 T reference) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.reference = reference;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Equivalence<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32729a = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f32729a;
        }

        @Override // com.google.common.base.Equivalence
        public boolean a(Object a11, Object b11) {
            return a11.equals(b11);
        }

        @Override // com.google.common.base.Equivalence
        public int b(Object o11) {
            return o11.hashCode();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> implements i0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Equivalence<T> f32730a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public final T f32731b;

        public c(Equivalence<T> equivalence, @CheckForNull T target) {
            this.f32730a = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.f32731b = target;
        }

        @Override // ho.i0
        public boolean apply(@CheckForNull T input) {
            return this.f32730a.d(input, this.f32731b);
        }

        @Override // ho.i0
        public boolean equals(@CheckForNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f32730a.equals(cVar.f32730a) && d0.a(this.f32731b, cVar.f32731b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return d0.b(this.f32730a, this.f32731b);
        }

        public String toString() {
            return this.f32730a + ".equivalentTo(" + this.f32731b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Equivalence<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final d f32732a = new d();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f32732a;
        }

        @Override // com.google.common.base.Equivalence
        public boolean a(Object a11, Object b11) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        public int b(Object o11) {
            return System.identityHashCode(o11);
        }
    }

    public static Equivalence<Object> c() {
        return b.f32729a;
    }

    public static Equivalence<Object> g() {
        return d.f32732a;
    }

    @g
    public abstract boolean a(T a11, T b11);

    @g
    public abstract int b(T t11);

    public final boolean d(@CheckForNull T a11, @CheckForNull T b11) {
        if (a11 == b11) {
            return true;
        }
        if (a11 == null || b11 == null) {
            return false;
        }
        return a(a11, b11);
    }

    public final i0<T> e(@CheckForNull T target) {
        return new c(this, target);
    }

    public final int f(@CheckForNull T t11) {
        if (t11 == null) {
            return 0;
        }
        return b(t11);
    }

    public final <F> Equivalence<F> h(r<? super F, ? extends T> function) {
        return new s(function, this);
    }

    @go.b(serializable = true)
    public final <S extends T> Equivalence<Iterable<S>> i() {
        return new e0(this);
    }

    public final <S extends T> Wrapper<S> j(@f0 S reference) {
        return new Wrapper<>(reference);
    }
}
