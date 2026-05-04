package g20;

import java.util.Iterator;
import q10.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f implements q10.g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n20.c f52595a;

    public f(@m80.k n20.c fqNameToMatch) {
        kotlin.jvm.internal.g0.p(fqNameToMatch, "fqNameToMatch");
        this.f52595a = fqNameToMatch;
    }

    @Override // q10.g
    @m80.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e i(@m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        if (kotlin.jvm.internal.g0.g(fqName, this.f52595a)) {
            return e.f52593a;
        }
        return null;
    }

    @Override // q10.g
    public boolean a0(@m80.k n20.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // q10.g
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    @m80.k
    public Iterator<q10.c> iterator() {
        return a00.h0.J().iterator();
    }
}
