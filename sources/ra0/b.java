package ra0;

import a00.h0;
import a00.r0;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.koin.core.definition.Kind;
import x00.p;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@va0.b
@u0({"SMAP\nBeanDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeanDefinition.kt\norg/koin/core/definition/BeanDefinition\n*L\n1#1,147:1\n83#1:148\n*S KotlinDebug\n*F\n+ 1 BeanDefinition.kt\norg/koin/core/definition/BeanDefinition\n*L\n87#1:148\n*E\n"})
/* loaded from: classes9.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final za0.a f83884a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h10.d<?> f83885b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public za0.a f83886c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final p<cb0.b, ya0.a, T> f83887d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Kind f83888e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public List<? extends h10.d<?>> f83889f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public d<T> f83890g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f83891h;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k za0.a scopeQualifier, @k h10.d<?> primaryType, @l za0.a aVar, @k p<? super cb0.b, ? super ya0.a, ? extends T> definition, @k Kind kind, @k List<? extends h10.d<?>> secondaryTypes) {
        g0.p(scopeQualifier, "scopeQualifier");
        g0.p(primaryType, "primaryType");
        g0.p(definition, "definition");
        g0.p(kind, "kind");
        g0.p(secondaryTypes, "secondaryTypes");
        this.f83884a = scopeQualifier;
        this.f83885b = primaryType;
        this.f83886c = aVar;
        this.f83887d = definition;
        this.f83888e = kind;
        this.f83889f = secondaryTypes;
        this.f83890g = new d<>(null, 1, null);
    }

    public static final CharSequence q(h10.d it) {
        g0.p(it, "it");
        return fb0.b.a(it);
    }

    @k
    public final d<T> b() {
        return this.f83890g;
    }

    @k
    public final p<cb0.b, ya0.a, T> c() {
        return this.f83887d;
    }

    @k
    public final Kind d() {
        return this.f83888e;
    }

    @k
    public final h10.d<?> e() {
        return this.f83885b;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        g0.n(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        b bVar = (b) obj;
        return g0.g(this.f83885b, bVar.f83885b) && g0.g(this.f83886c, bVar.f83886c) && g0.g(this.f83884a, bVar.f83884a);
    }

    @l
    public final za0.a f() {
        return this.f83886c;
    }

    @k
    public final za0.a g() {
        return this.f83884a;
    }

    @k
    public final List<h10.d<?>> h() {
        return this.f83889f;
    }

    public int hashCode() {
        za0.a aVar = this.f83886c;
        return ((((aVar != null ? aVar.hashCode() : 0) * 31) + this.f83885b.hashCode()) * 31) + this.f83884a.hashCode();
    }

    public final boolean i() {
        return this.f83891h;
    }

    public final boolean k(@k h10.d<?> clazz) {
        g0.p(clazz, "clazz");
        return g0.g(e(), clazz) || h().contains(clazz);
    }

    public final boolean l(@k h10.d<?> clazz, @l za0.a aVar, @k za0.a scopeDefinition) {
        g0.p(clazz, "clazz");
        g0.p(scopeDefinition, "scopeDefinition");
        return (g0.g(e(), clazz) || h().contains(clazz)) && g0.g(f(), aVar) && g0.g(g(), scopeDefinition);
    }

    public final void m(@k d<T> dVar) {
        g0.p(dVar, "<set-?>");
        this.f83890g = dVar;
    }

    public final void n(@l za0.a aVar) {
        this.f83886c = aVar;
    }

    public final void o(@k List<? extends h10.d<?>> list) {
        g0.p(list, "<set-?>");
        this.f83889f = list;
    }

    public final void p(boolean z11) {
        this.f83891h = z11;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(this.f83888e);
        sb2.append(": '");
        sb2.append(fb0.b.a(this.f83885b));
        sb2.append('\'');
        if (this.f83886c != null) {
            sb2.append(",qualifier:");
            sb2.append(this.f83886c);
        }
        if (!g0.g(this.f83884a, ab0.e.f2509e.a())) {
            sb2.append(",scope:");
            sb2.append(this.f83884a);
        }
        if (!this.f83889f.isEmpty()) {
            sb2.append(",binds:");
            r0.p3(this.f83889f, sb2, ",", null, null, 0, null, new x00.l() { // from class: ra0.a
                @Override // x00.l
                public final Object invoke(Object obj) {
                    CharSequence q11;
                    q11 = b.q((h10.d) obj);
                    return q11;
                }
            }, 60, null);
        }
        sb2.append(l50.b.f69930l);
        return sb2.toString();
    }

    public /* synthetic */ b(za0.a aVar, h10.d dVar, za0.a aVar2, p pVar, Kind kind, List list, int i11, v vVar) {
        this(aVar, dVar, (i11 & 4) != 0 ? null : aVar2, pVar, kind, (i11 & 32) != 0 ? h0.J() : list);
    }

    @v0
    public static /* synthetic */ void j() {
    }
}
