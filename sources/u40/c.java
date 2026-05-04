package u40;

import a00.h0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o<T> f91772a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<o<T>> f91773b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@m80.k o<? super T> mainFormat, @m80.k List<? extends o<? super T>> formats) {
        g0.p(mainFormat, "mainFormat");
        g0.p(formats, "formats");
        this.f91772a = mainFormat;
        this.f91773b = formats;
    }

    @Override // u40.o
    @m80.k
    public v40.e<T> a() {
        return this.f91772a.a();
    }

    @Override // u40.o
    @m80.k
    public w40.t<T> b() {
        List J = h0.J();
        List j11 = a00.g0.j();
        j11.add(this.f91772a.b());
        Iterator<o<T>> it = this.f91773b.iterator();
        while (it.hasNext()) {
            j11.add(it.next().b());
        }
        return new w40.t<>(J, a00.g0.b(j11));
    }

    @m80.k
    public final List<o<T>> c() {
        return this.f91773b;
    }

    @m80.k
    public final o<T> d() {
        return this.f91772a;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g0.g(this.f91772a, cVar.f91772a) && g0.g(this.f91773b, cVar.f91773b);
    }

    public int hashCode() {
        return (this.f91772a.hashCode() * 31) + this.f91773b.hashCode();
    }

    @m80.k
    public String toString() {
        return "AlternativesParsing(" + this.f91773b + ')';
    }
}
