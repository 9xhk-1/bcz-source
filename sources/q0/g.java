package q0;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import q0.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f81364c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final g f81365d;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c f81366a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c f81367b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    static {
        c.b bVar = c.b.f81359a;
        f81365d = new g(bVar, bVar);
    }

    public g(@m80.k c cVar, @m80.k c cVar2) {
        this.f81366a = cVar;
        this.f81367b = cVar2;
    }

    public static /* synthetic */ g d(g gVar, c cVar, c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = gVar.f81366a;
        }
        if ((i11 & 2) != 0) {
            cVar2 = gVar.f81367b;
        }
        return gVar.c(cVar, cVar2);
    }

    @m80.k
    public final c a() {
        return this.f81366a;
    }

    @m80.k
    public final c b() {
        return this.f81367b;
    }

    @m80.k
    public final g c(@m80.k c cVar, @m80.k c cVar2) {
        return new g(cVar, cVar2);
    }

    @m80.k
    public final c e() {
        return this.f81367b;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return g0.g(this.f81366a, gVar.f81366a) && g0.g(this.f81367b, gVar.f81367b);
    }

    @m80.k
    public final c f() {
        return this.f81366a;
    }

    public int hashCode() {
        return (this.f81366a.hashCode() * 31) + this.f81367b.hashCode();
    }

    @m80.k
    public String toString() {
        return "Size(width=" + this.f81366a + ", height=" + this.f81367b + ')';
    }
}
