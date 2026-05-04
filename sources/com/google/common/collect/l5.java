package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class l5<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator<? super T> f33629a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33630b;

    /* renamed from: c, reason: collision with root package name */
    @CheckForNull
    public final T f33631c;

    /* renamed from: d, reason: collision with root package name */
    public final BoundType f33632d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33633e;

    /* renamed from: f, reason: collision with root package name */
    @CheckForNull
    public final T f33634f;

    /* renamed from: g, reason: collision with root package name */
    public final BoundType f33635g;

    /* renamed from: h, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient l5<T> f33636h;

    public l5(Comparator<? super T> comparator, boolean z11, @CheckForNull T t11, BoundType boundType, boolean z12, @CheckForNull T t12, BoundType boundType2) {
        this.f33629a = (Comparator) Preconditions.checkNotNull(comparator);
        this.f33630b = z11;
        this.f33633e = z12;
        this.f33631c = t11;
        this.f33632d = (BoundType) Preconditions.checkNotNull(boundType);
        this.f33634f = t12;
        this.f33635g = (BoundType) Preconditions.checkNotNull(boundType2);
        if (z11) {
            comparator.compare((Object) m7.a(t11), (Object) m7.a(t11));
        }
        if (z12) {
            comparator.compare((Object) m7.a(t12), (Object) m7.a(t12));
        }
        if (z11 && z12) {
            int compare = comparator.compare((Object) m7.a(t11), (Object) m7.a(t12));
            Preconditions.checkArgument(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t11, t12);
            if (compare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                Preconditions.checkArgument((boundType == boundType3 && boundType2 == boundType3) ? false : true);
            }
        }
    }

    public static <T> l5<T> a(Comparator<? super T> comparator) {
        BoundType boundType = BoundType.OPEN;
        return new l5<>(comparator, false, null, boundType, false, null, boundType);
    }

    public static <T> l5<T> d(Comparator<? super T> comparator, @t7 T endpoint, BoundType boundType) {
        return new l5<>(comparator, true, endpoint, boundType, false, null, BoundType.OPEN);
    }

    public static <T extends Comparable> l5<T> e(Range<T> range) {
        return new l5<>(s7.z(), range.hasLowerBound(), range.hasLowerBound() ? range.lowerEndpoint() : null, range.hasLowerBound() ? range.lowerBoundType() : BoundType.OPEN, range.hasUpperBound(), range.hasUpperBound() ? range.upperEndpoint() : null, range.hasUpperBound() ? range.upperBoundType() : BoundType.OPEN);
    }

    public static <T> l5<T> n(Comparator<? super T> comparator, @t7 T lower, BoundType lowerType, @t7 T upper, BoundType upperType) {
        return new l5<>(comparator, true, lower, lowerType, true, upper, upperType);
    }

    public static <T> l5<T> r(Comparator<? super T> comparator, @t7 T endpoint, BoundType boundType) {
        return new l5<>(comparator, false, null, BoundType.OPEN, true, endpoint, boundType);
    }

    public Comparator<? super T> b() {
        return this.f33629a;
    }

    public boolean c(@t7 T t11) {
        return (q(t11) || p(t11)) ? false : true;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof l5) {
            l5 l5Var = (l5) obj;
            if (this.f33629a.equals(l5Var.f33629a) && this.f33630b == l5Var.f33630b && this.f33633e == l5Var.f33633e && f().equals(l5Var.f()) && h().equals(l5Var.h()) && ho.d0.a(g(), l5Var.g()) && ho.d0.a(i(), l5Var.i())) {
                return true;
            }
        }
        return false;
    }

    public BoundType f() {
        return this.f33632d;
    }

    @CheckForNull
    public T g() {
        return this.f33631c;
    }

    public BoundType h() {
        return this.f33635g;
    }

    public int hashCode() {
        return ho.d0.b(this.f33629a, g(), f(), i(), h());
    }

    @CheckForNull
    public T i() {
        return this.f33634f;
    }

    public boolean j() {
        return this.f33630b;
    }

    public boolean k() {
        return this.f33633e;
    }

    public l5<T> l(l5<T> other) {
        int compare;
        int compare2;
        T t11;
        int compare3;
        BoundType boundType;
        Preconditions.checkNotNull(other);
        Preconditions.checkArgument(this.f33629a.equals(other.f33629a));
        boolean z11 = this.f33630b;
        T g11 = g();
        BoundType f11 = f();
        if (!j()) {
            z11 = other.f33630b;
            g11 = other.g();
            f11 = other.f();
        } else if (other.j() && ((compare = this.f33629a.compare(g(), other.g())) < 0 || (compare == 0 && other.f() == BoundType.OPEN))) {
            g11 = other.g();
            f11 = other.f();
        }
        boolean z12 = z11;
        boolean z13 = this.f33633e;
        T i11 = i();
        BoundType h11 = h();
        if (!k()) {
            z13 = other.f33633e;
            i11 = other.i();
            h11 = other.h();
        } else if (other.k() && ((compare2 = this.f33629a.compare(i(), other.i())) > 0 || (compare2 == 0 && other.h() == BoundType.OPEN))) {
            i11 = other.i();
            h11 = other.h();
        }
        boolean z14 = z13;
        T t12 = i11;
        if (z12 && z14 && ((compare3 = this.f33629a.compare(g11, t12)) > 0 || (compare3 == 0 && f11 == (boundType = BoundType.OPEN) && h11 == boundType))) {
            f11 = BoundType.OPEN;
            h11 = BoundType.CLOSED;
            t11 = t12;
        } else {
            t11 = g11;
        }
        return new l5<>(this.f33629a, z12, t11, f11, z14, t12, h11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean m() {
        if (k() && q(m7.a(i()))) {
            return true;
        }
        return j() && p(m7.a(g()));
    }

    public l5<T> o() {
        l5<T> l5Var = this.f33636h;
        if (l5Var != null) {
            return l5Var;
        }
        l5<T> l5Var2 = new l5<>(s7.i(this.f33629a).F(), this.f33633e, i(), h(), this.f33630b, g(), f());
        l5Var2.f33636h = this;
        this.f33636h = l5Var2;
        return l5Var2;
    }

    public boolean p(@t7 T t11) {
        if (!k()) {
            return false;
        }
        int compare = this.f33629a.compare(t11, m7.a(i()));
        return ((compare == 0) & (h() == BoundType.OPEN)) | (compare > 0);
    }

    public boolean q(@t7 T t11) {
        if (!j()) {
            return false;
        }
        int compare = this.f33629a.compare(t11, m7.a(g()));
        return ((compare == 0) & (f() == BoundType.OPEN)) | (compare < 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33629a);
        sb2.append(":");
        BoundType boundType = this.f33632d;
        BoundType boundType2 = BoundType.CLOSED;
        sb2.append(boundType == boundType2 ? '[' : '(');
        sb2.append(this.f33630b ? this.f33631c : "-∞");
        sb2.append(',');
        sb2.append(this.f33633e ? this.f33634f : "∞");
        sb2.append(this.f33635g == boundType2 ? l50.b.f69930l : ')');
        return sb2.toString();
    }
}
