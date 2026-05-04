package q10;

import e30.c1;
import e30.r0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import p10.x0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n10.j f81420a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final n20.c f81421b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Map<n20.f, s20.g<?>> f81422c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f81423d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c0 f81424e;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@m80.k n10.j builtIns, @m80.k n20.c fqName, @m80.k Map<n20.f, ? extends s20.g<?>> allValueArguments, boolean z11) {
        g0.p(builtIns, "builtIns");
        g0.p(fqName, "fqName");
        g0.p(allValueArguments, "allValueArguments");
        this.f81420a = builtIns;
        this.f81421b = fqName;
        this.f81422c = allValueArguments;
        this.f81423d = z11;
        this.f81424e = e0.b(LazyThreadSafetyMode.PUBLICATION, new j(this));
    }

    public static final c1 c(k kVar) {
        return kVar.f81420a.o(kVar.d()).s();
    }

    @Override // q10.c
    @m80.k
    public Map<n20.f, s20.g<?>> a() {
        return this.f81422c;
    }

    @Override // q10.c
    @m80.k
    public n20.c d() {
        return this.f81421b;
    }

    @Override // q10.c
    @m80.k
    public x0 getSource() {
        x0 NO_SOURCE = x0.f78622a;
        g0.o(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // q10.c
    @m80.k
    public r0 getType() {
        Object value = this.f81424e.getValue();
        g0.o(value, "getValue(...)");
        return (r0) value;
    }

    public /* synthetic */ k(n10.j jVar, n20.c cVar, Map map, boolean z11, int i11, v vVar) {
        this(jVar, cVar, map, (i11 & 8) != 0 ? false : z11);
    }
}
