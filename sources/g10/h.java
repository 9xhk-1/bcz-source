package g10;

import g10.r;
import java.lang.Comparable;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class h<T extends Comparable<? super T>> implements r<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final T f52514a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final T f52515b;

    public h(@m80.k T start, @m80.k T endExclusive) {
        g0.p(start, "start");
        g0.p(endExclusive, "endExclusive");
        this.f52514a = start;
        this.f52515b = endExclusive;
    }

    @Override // g10.r
    @m80.k
    public T b() {
        return this.f52515b;
    }

    @Override // g10.r
    public /* bridge */ boolean contains(@m80.k T t11) {
        return r.a.a(this, t11);
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (isEmpty() && ((h) obj).isEmpty()) {
            return true;
        }
        h hVar = (h) obj;
        return g0.g(getStart(), hVar.getStart()) && g0.g(b(), hVar.b());
    }

    @Override // g10.r
    @m80.k
    public T getStart() {
        return this.f52514a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + b().hashCode();
    }

    @Override // g10.r
    public /* bridge */ boolean isEmpty() {
        return r.a.b(this);
    }

    @m80.k
    public String toString() {
        return getStart() + "..<" + b();
    }
}
