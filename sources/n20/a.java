package n20;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCallableId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallableId.kt\norg/jetbrains/kotlin/name/CallableId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final C0898a f74272f = new C0898a(null);

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final f f74273g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final c f74274h;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c f74275a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final c f74276b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final f f74277c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final b f74278d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final c f74279e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCallableId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallableId.kt\norg/jetbrains/kotlin/name/CallableId$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
    /* renamed from: n20.a$a, reason: collision with other inner class name */
    public static final class C0898a {
        public /* synthetic */ C0898a(v vVar) {
            this();
        }

        public C0898a() {
        }
    }

    static {
        f fVar = h.f74312m;
        f74273g = fVar;
        c k11 = c.k(fVar);
        g0.o(k11, "topLevel(...)");
        f74274h = k11;
    }

    public a(c cVar, c cVar2, f fVar, b bVar, c cVar3) {
        this.f74275a = cVar;
        this.f74276b = cVar2;
        this.f74277c = fVar;
        this.f74278d = bVar;
        this.f74279e = cVar3;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f74275a, aVar.f74275a) && g0.g(this.f74276b, aVar.f74276b) && g0.g(this.f74277c, aVar.f74277c);
    }

    public int hashCode() {
        int hashCode = (527 + this.f74275a.hashCode()) * 31;
        c cVar = this.f74276b;
        return ((hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f74277c.hashCode();
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String b11 = this.f74275a.b();
        g0.o(b11, "asString(...)");
        sb2.append(f0.y2(b11, '.', '/', false, 4, null));
        sb2.append("/");
        c cVar = this.f74276b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f74277c);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@m80.k c packageName, @m80.k f callableName) {
        this(packageName, null, callableName, null, null);
        g0.p(packageName, "packageName");
        g0.p(callableName, "callableName");
    }
}
