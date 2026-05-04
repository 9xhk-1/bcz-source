package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.s7;
import com.google.common.collect.u6;
import ho.b0;
import ho.d0;
import java.util.Comparator;
import java.util.Map;
import javax.annotation.CheckForNull;
import mo.e0;
import uo.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@e0
@j
/* loaded from: classes7.dex */
public final class ElementOrder<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Type f34177a;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    public final Comparator<T> f34178b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Type {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    public ElementOrder(Type type, @CheckForNull Comparator<T> comparator) {
        this.f34177a = (Type) Preconditions.checkNotNull(type);
        this.f34178b = comparator;
        Preconditions.checkState((type == Type.SORTED) == (comparator != null));
    }

    public static <S> ElementOrder<S> d() {
        return new ElementOrder<>(Type.INSERTION, null);
    }

    public static <S extends Comparable<? super S>> ElementOrder<S> e() {
        return new ElementOrder<>(Type.SORTED, s7.z());
    }

    public static <S> ElementOrder<S> f(Comparator<S> comparator) {
        return new ElementOrder<>(Type.SORTED, (Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <S> ElementOrder<S> g() {
        return new ElementOrder<>(Type.STABLE, null);
    }

    public static <S> ElementOrder<S> i() {
        return new ElementOrder<>(Type.UNORDERED, null);
    }

    public Comparator<T> b() {
        Comparator<T> comparator = this.f34178b;
        if (comparator != null) {
            return comparator;
        }
        throw new UnsupportedOperationException("This ordering does not define a comparator.");
    }

    public <K extends T, V> Map<K, V> c(int expectedSize) {
        int ordinal = this.f34177a.ordinal();
        if (ordinal == 0) {
            return u6.a0(expectedSize);
        }
        if (ordinal == 1 || ordinal == 2) {
            return u6.e0(expectedSize);
        }
        if (ordinal == 3) {
            return u6.g0(b());
        }
        throw new AssertionError();
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ElementOrder)) {
            return false;
        }
        ElementOrder elementOrder = (ElementOrder) obj;
        return this.f34177a == elementOrder.f34177a && d0.a(this.f34178b, elementOrder.f34178b);
    }

    public Type h() {
        return this.f34177a;
    }

    public int hashCode() {
        return d0.b(this.f34177a, this.f34178b);
    }

    public String toString() {
        b0.b f11 = b0.c(this).f("type", this.f34177a);
        Comparator<T> comparator = this.f34178b;
        if (comparator != null) {
            f11.f("comparator", comparator);
        }
        return f11.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T1 extends T> ElementOrder<T1> a() {
        return this;
    }
}
