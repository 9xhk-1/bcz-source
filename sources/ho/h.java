package ho;

import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Iterator;
import javax.annotation.CheckForNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b
/* loaded from: classes7.dex */
public abstract class h<A, B> implements r<A, B> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f59610a;

    /* renamed from: b, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    @vo.b
    public transient h<B, A> f59611b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Iterable<B> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f59612a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f59613b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: ho.h$a$a, reason: collision with other inner class name */
        public class C0678a implements Iterator<B> {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator<? extends A> f59614a;

            public C0678a() {
                this.f59614a = a.this.f59612a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f59614a.hasNext();
            }

            @Override // java.util.Iterator
            public B next() {
                return (B) a.this.f59613b.b(this.f59614a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f59614a.remove();
            }
        }

        public a(final h this$0, final Iterable val$fromIterable) {
            this.f59612a = val$fromIterable;
            this.f59613b = this$0;
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
            return new C0678a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<A, B, C> extends h<A, C> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public final h<A, B> f59616c;

        /* renamed from: d, reason: collision with root package name */
        public final h<B, C> f59617d;

        public b(h<A, B> first, h<B, C> second) {
            this.f59616c = first;
            this.f59617d = second;
        }

        @Override // ho.h
        @CheckForNull
        public A d(@CheckForNull C c11) {
            return (A) this.f59616c.d(this.f59617d.d(c11));
        }

        @Override // ho.h
        @CheckForNull
        public C e(@CheckForNull A a11) {
            return (C) this.f59617d.e(this.f59616c.e(a11));
        }

        @Override // ho.h, ho.r
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof b) {
                b bVar = (b) object;
                if (this.f59616c.equals(bVar.f59616c) && this.f59617d.equals(bVar.f59617d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // ho.h
        public A g(C c11) {
            throw new AssertionError();
        }

        @Override // ho.h
        public C h(A a11) {
            throw new AssertionError();
        }

        public int hashCode() {
            return (this.f59616c.hashCode() * 31) + this.f59617d.hashCode();
        }

        public String toString() {
            return this.f59616c + ".andThen(" + this.f59617d + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<A, B> extends h<A, B> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public final r<? super A, ? extends B> f59618c;

        /* renamed from: d, reason: collision with root package name */
        public final r<? super B, ? extends A> f59619d;

        public /* synthetic */ c(r rVar, r rVar2, a aVar) {
            this(rVar, rVar2);
        }

        @Override // ho.h, ho.r
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof c) {
                c cVar = (c) object;
                if (this.f59618c.equals(cVar.f59618c) && this.f59619d.equals(cVar.f59619d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // ho.h
        public A g(B b11) {
            return this.f59619d.apply(b11);
        }

        @Override // ho.h
        public B h(A a11) {
            return this.f59618c.apply(a11);
        }

        public int hashCode() {
            return (this.f59618c.hashCode() * 31) + this.f59619d.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.f59618c + j2.O + this.f59619d + pn.j.f81007d;
        }

        public c(r<? super A, ? extends B> forwardFunction, r<? super B, ? extends A> backwardFunction) {
            this.f59618c = (r) Preconditions.checkNotNull(forwardFunction);
            this.f59619d = (r) Preconditions.checkNotNull(backwardFunction);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<A, B> extends h<B, A> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public final h<A, B> f59621c;

        public e(h<A, B> original) {
            this.f59621c = original;
        }

        @Override // ho.h
        @CheckForNull
        public B d(@CheckForNull A a11) {
            return this.f59621c.e(a11);
        }

        @Override // ho.h
        @CheckForNull
        public A e(@CheckForNull B b11) {
            return this.f59621c.d(b11);
        }

        @Override // ho.h, ho.r
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof e) {
                return this.f59621c.equals(((e) object).f59621c);
            }
            return false;
        }

        @Override // ho.h
        public B g(A a11) {
            throw new AssertionError();
        }

        @Override // ho.h
        public A h(B b11) {
            throw new AssertionError();
        }

        public int hashCode() {
            return ~this.f59621c.hashCode();
        }

        @Override // ho.h
        public h<A, B> k() {
            return this.f59621c;
        }

        public String toString() {
            return this.f59621c + ".reverse()";
        }
    }

    public h() {
        this(true);
    }

    public static <A, B> h<A, B> i(r<? super A, ? extends B> forwardFunction, r<? super B, ? extends A> backwardFunction) {
        return new c(forwardFunction, backwardFunction, null);
    }

    public static <T> h<T, T> j() {
        return (d) d.f59620c;
    }

    public final <C> h<A, C> a(h<B, C> secondConverter) {
        return f(secondConverter);
    }

    @Override // ho.r
    @uo.l(replacement = "this.convert(a)")
    @Deprecated
    public final B apply(A a11) {
        return b(a11);
    }

    @CheckForNull
    public final B b(@CheckForNull A a11) {
        return e(a11);
    }

    public Iterable<B> c(Iterable<? extends A> fromIterable) {
        Preconditions.checkNotNull(fromIterable, "fromIterable");
        return new a(this, fromIterable);
    }

    @CheckForNull
    public A d(@CheckForNull B b11) {
        if (!this.f59610a) {
            return l(b11);
        }
        if (b11 == null) {
            return null;
        }
        return (A) Preconditions.checkNotNull(g(b11));
    }

    @CheckForNull
    public B e(@CheckForNull A a11) {
        if (!this.f59610a) {
            return m(a11);
        }
        if (a11 == null) {
            return null;
        }
        return (B) Preconditions.checkNotNull(h(a11));
    }

    @Override // ho.r
    public boolean equals(@CheckForNull Object object) {
        return super.equals(object);
    }

    public <C> h<A, C> f(h<B, C> secondConverter) {
        return new b(this, (h) Preconditions.checkNotNull(secondConverter));
    }

    @uo.g
    public abstract A g(B b11);

    @uo.g
    public abstract B h(A a11);

    @uo.b
    public h<B, A> k() {
        h<B, A> hVar = this.f59611b;
        if (hVar != null) {
            return hVar;
        }
        e eVar = new e(this);
        this.f59611b = eVar;
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public final A l(@CheckForNull B b11) {
        return (A) g(c0.a(b11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public final B m(@CheckForNull A a11) {
        return (B) h(c0.a(a11));
    }

    public h(boolean handleNullAutomatically) {
        this.f59610a = handleNullAutomatically;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> extends h<T, T> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final h<?, ?> f59620c = new d();
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return f59620c;
        }

        @Override // ho.h
        public <S> h<T, S> f(h<T, S> otherConverter) {
            return (h) Preconditions.checkNotNull(otherConverter, "otherConverter");
        }

        public String toString() {
            return "Converter.identity()";
        }

        @Override // ho.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public d<T> k() {
            return this;
        }

        @Override // ho.h
        public T g(T t11) {
            return t11;
        }

        @Override // ho.h
        public T h(T t11) {
            return t11;
        }
    }
}
