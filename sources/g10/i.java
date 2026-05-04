package g10;

import g10.g;
import java.lang.Comparable;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class i<T extends Comparable<? super T>> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final T f52516a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final T f52517b;

    public i(@m80.k T start, @m80.k T endInclusive) {
        g0.p(start, "start");
        g0.p(endInclusive, "endInclusive");
        this.f52516a = start;
        this.f52517b = endInclusive;
    }

    @Override // g10.g
    public /* bridge */ boolean contains(@m80.k T t11) {
        return g.a.a(this, t11);
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (isEmpty() && ((i) obj).isEmpty()) {
            return true;
        }
        i iVar = (i) obj;
        return g0.g(getStart(), iVar.getStart()) && g0.g(getEndInclusive(), iVar.getEndInclusive());
    }

    @Override // g10.g
    @m80.k
    public T getEndInclusive() {
        return this.f52517b;
    }

    @Override // g10.g
    @m80.k
    public T getStart() {
        return this.f52516a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndInclusive().hashCode();
    }

    @Override // g10.g
    public /* bridge */ boolean isEmpty() {
        return g.a.b(this);
    }

    @m80.k
    public String toString() {
        return getStart() + zr.m.f102856e + getEndInclusive();
    }
}
