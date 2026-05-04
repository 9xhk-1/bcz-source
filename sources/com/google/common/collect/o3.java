package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class o3<C extends Comparable> implements Comparable<o3<C>>, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C f33689a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33690a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f33690a = iArr;
            try {
                iArr[BoundType.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33690a[BoundType.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends o3<Comparable<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f33691b = new b();
        private static final long serialVersionUID = 0;

        public b() {
            super("");
        }

        private Object readResolve() {
            return f33691b;
        }

        @Override // com.google.common.collect.o3, java.lang.Comparable
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(o3<Comparable<?>> o11) {
            return o11 == this ? 0 : 1;
        }

        @Override // com.google.common.collect.o3
        public void g(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o3
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.o3
        public void i(StringBuilder sb2) {
            sb2.append("+∞)");
        }

        @Override // com.google.common.collect.o3
        public Comparable<?> k() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.o3
        public Comparable<?> l(t3<Comparable<?>> domain) {
            return domain.e();
        }

        @Override // com.google.common.collect.o3
        public boolean m(Comparable<?> value) {
            return false;
        }

        @Override // com.google.common.collect.o3
        public Comparable<?> o(t3<Comparable<?>> domain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o3
        public BoundType p() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.o3
        public BoundType q() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.o3
        public o3<Comparable<?>> r(BoundType boundType, t3<Comparable<?>> domain) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.o3
        public o3<Comparable<?>> s(BoundType boundType, t3<Comparable<?>> domain) {
            throw new IllegalStateException();
        }

        public String toString() {
            return "+∞";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<C extends Comparable> extends o3<C> {
        private static final long serialVersionUID = 0;

        public c(C endpoint) {
            super((Comparable) Preconditions.checkNotNull(endpoint));
        }

        @Override // com.google.common.collect.o3, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object that) {
            return super.compareTo((o3) that);
        }

        @Override // com.google.common.collect.o3
        public o3<C> e(t3<C> domain) {
            C o11 = o(domain);
            return o11 != null ? o3.d(o11) : o3.a();
        }

        @Override // com.google.common.collect.o3
        public void g(StringBuilder sb2) {
            sb2.append('(');
            sb2.append(this.f33689a);
        }

        @Override // com.google.common.collect.o3
        public int hashCode() {
            return ~this.f33689a.hashCode();
        }

        @Override // com.google.common.collect.o3
        public void i(StringBuilder sb2) {
            sb2.append(this.f33689a);
            sb2.append(l50.b.f69930l);
        }

        @Override // com.google.common.collect.o3
        public C l(t3<C> domain) {
            return this.f33689a;
        }

        @Override // com.google.common.collect.o3
        public boolean m(C value) {
            return Range.compareOrThrow(this.f33689a, value) < 0;
        }

        @Override // com.google.common.collect.o3
        @CheckForNull
        public C o(t3<C> domain) {
            return domain.g(this.f33689a);
        }

        @Override // com.google.common.collect.o3
        public BoundType p() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.o3
        public BoundType q() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.o3
        public o3<C> r(BoundType boundType, t3<C> domain) {
            int i11 = a.f33690a[boundType.ordinal()];
            if (i11 == 1) {
                C g11 = domain.g(this.f33689a);
                return g11 == null ? o3.c() : o3.d(g11);
            }
            if (i11 == 2) {
                return this;
            }
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o3
        public o3<C> s(BoundType boundType, t3<C> domain) {
            int i11 = a.f33690a[boundType.ordinal()];
            if (i11 == 1) {
                return this;
            }
            if (i11 != 2) {
                throw new AssertionError();
            }
            C g11 = domain.g(this.f33689a);
            return g11 == null ? o3.a() : o3.d(g11);
        }

        public String toString() {
            return "/" + this.f33689a + "\\";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends o3<Comparable<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f33692b = new d();
        private static final long serialVersionUID = 0;

        public d() {
            super("");
        }

        private Object readResolve() {
            return f33692b;
        }

        @Override // com.google.common.collect.o3
        public o3<Comparable<?>> e(t3<Comparable<?>> domain) {
            try {
                return o3.d(domain.f());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // com.google.common.collect.o3, java.lang.Comparable
        /* renamed from: f */
        public int compareTo(o3<Comparable<?>> o11) {
            return o11 == this ? 0 : -1;
        }

        @Override // com.google.common.collect.o3
        public void g(StringBuilder sb2) {
            sb2.append("(-∞");
        }

        @Override // com.google.common.collect.o3
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.o3
        public void i(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o3
        public Comparable<?> k() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.o3
        public Comparable<?> l(t3<Comparable<?>> domain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o3
        public boolean m(Comparable<?> value) {
            return true;
        }

        @Override // com.google.common.collect.o3
        public Comparable<?> o(t3<Comparable<?>> domain) {
            return domain.f();
        }

        @Override // com.google.common.collect.o3
        public BoundType p() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.o3
        public BoundType q() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.o3
        public o3<Comparable<?>> r(BoundType boundType, t3<Comparable<?>> domain) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.o3
        public o3<Comparable<?>> s(BoundType boundType, t3<Comparable<?>> domain) {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "-∞";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<C extends Comparable> extends o3<C> {
        private static final long serialVersionUID = 0;

        public e(C endpoint) {
            super((Comparable) Preconditions.checkNotNull(endpoint));
        }

        @Override // com.google.common.collect.o3, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object that) {
            return super.compareTo((o3) that);
        }

        @Override // com.google.common.collect.o3
        public void g(StringBuilder sb2) {
            sb2.append('[');
            sb2.append(this.f33689a);
        }

        @Override // com.google.common.collect.o3
        public int hashCode() {
            return this.f33689a.hashCode();
        }

        @Override // com.google.common.collect.o3
        public void i(StringBuilder sb2) {
            sb2.append(this.f33689a);
            sb2.append(')');
        }

        @Override // com.google.common.collect.o3
        @CheckForNull
        public C l(t3<C> domain) {
            return domain.i(this.f33689a);
        }

        @Override // com.google.common.collect.o3
        public boolean m(C value) {
            return Range.compareOrThrow(this.f33689a, value) <= 0;
        }

        @Override // com.google.common.collect.o3
        public C o(t3<C> domain) {
            return this.f33689a;
        }

        @Override // com.google.common.collect.o3
        public BoundType p() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.o3
        public BoundType q() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.o3
        public o3<C> r(BoundType boundType, t3<C> domain) {
            int i11 = a.f33690a[boundType.ordinal()];
            if (i11 == 1) {
                return this;
            }
            if (i11 != 2) {
                throw new AssertionError();
            }
            C i12 = domain.i(this.f33689a);
            return i12 == null ? o3.c() : new c(i12);
        }

        @Override // com.google.common.collect.o3
        public o3<C> s(BoundType boundType, t3<C> domain) {
            int i11 = a.f33690a[boundType.ordinal()];
            if (i11 == 1) {
                C i12 = domain.i(this.f33689a);
                return i12 == null ? o3.a() : new c(i12);
            }
            if (i11 == 2) {
                return this;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "\\" + this.f33689a + "/";
        }
    }

    public o3(C endpoint) {
        this.f33689a = endpoint;
    }

    public static <C extends Comparable> o3<C> a() {
        return b.f33691b;
    }

    public static <C extends Comparable> o3<C> b(C endpoint) {
        return new c(endpoint);
    }

    public static <C extends Comparable> o3<C> c() {
        return d.f33692b;
    }

    public static <C extends Comparable> o3<C> d(C endpoint) {
        return new e(endpoint);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof o3) {
            try {
                if (compareTo((o3) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public int compareTo(o3<C> that) {
        if (that == c()) {
            return 1;
        }
        if (that == a()) {
            return -1;
        }
        int compareOrThrow = Range.compareOrThrow(this.f33689a, that.f33689a);
        return compareOrThrow != 0 ? compareOrThrow : Boolean.compare(this instanceof c, that instanceof c);
    }

    public abstract void g(StringBuilder sb2);

    public abstract int hashCode();

    public abstract void i(StringBuilder sb2);

    public C k() {
        return this.f33689a;
    }

    @CheckForNull
    public abstract C l(t3<C> domain);

    public abstract boolean m(C value);

    @CheckForNull
    public abstract C o(t3<C> domain);

    public abstract BoundType p();

    public abstract BoundType q();

    public abstract o3<C> r(BoundType boundType, t3<C> domain);

    public abstract o3<C> s(BoundType boundType, t3<C> domain);

    public o3<C> e(t3<C> domain) {
        return this;
    }
}
