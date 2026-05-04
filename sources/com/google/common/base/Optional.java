package com.google.common.base;

import go.b;
import ho.j;
import ho.k0;
import ho.p0;
import ho.r;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;
import uo.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@b(serializable = true)
@f("Use Optional.of(value) or Optional.absent()")
/* loaded from: classes7.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Iterable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f32733a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.base.Optional$a$a, reason: collision with other inner class name */
        public class C0380a extends ho.b<T> {

            /* renamed from: c, reason: collision with root package name */
            public final Iterator<? extends Optional<? extends T>> f32734c;

            public C0380a() {
                this.f32734c = (Iterator) Preconditions.checkNotNull(a.this.f32733a.iterator());
            }

            @Override // ho.b
            @CheckForNull
            public T a() {
                while (this.f32734c.hasNext()) {
                    Optional<? extends T> next = this.f32734c.next();
                    if (next.isPresent()) {
                        return next.get();
                    }
                }
                return b();
            }
        }

        public a(final Iterable val$optionals) {
            this.f32733a = val$optionals;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new C0380a();
        }
    }

    public static <T> Optional<T> absent() {
        return ho.a.a();
    }

    public static <T> Optional<T> fromNullable(@CheckForNull T nullableReference) {
        return nullableReference == null ? absent() : new k0(nullableReference);
    }

    public static <T> Optional<T> of(T reference) {
        return new k0(Preconditions.checkNotNull(reference));
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends Optional<? extends T>> optionals) {
        Preconditions.checkNotNull(optionals);
        return new a(optionals);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(@CheckForNull Object object);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> secondChoice);

    public abstract T or(p0<? extends T> supplier);

    public abstract T or(T defaultValue);

    @CheckForNull
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(r<? super T, V> function);
}
