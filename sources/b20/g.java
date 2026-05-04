package b20;

import a00.r0;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import n10.o;
import q10.g;
import q30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g implements q10.g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k f5727a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f20.d f5728b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5729c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d30.h<f20.a, q10.c> f5730d;

    public g(@m80.k k c11, @m80.k f20.d annotationOwner, boolean z11) {
        g0.p(c11, "c");
        g0.p(annotationOwner, "annotationOwner");
        this.f5727a = c11;
        this.f5728b = annotationOwner;
        this.f5729c = z11;
        this.f5730d = c11.a().u().h(new f(this));
    }

    public static final q10.c b(g gVar, f20.a annotation) {
        g0.p(annotation, "annotation");
        return z10.d.f100605a.e(annotation, gVar.f5727a, gVar.f5729c);
    }

    @Override // q10.g
    public boolean a0(@m80.k n20.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // q10.g
    @m80.l
    public q10.c i(@m80.k n20.c fqName) {
        q10.c invoke;
        g0.p(fqName, "fqName");
        f20.a i11 = this.f5728b.i(fqName);
        return (i11 == null || (invoke = this.f5730d.invoke(i11)) == null) ? z10.d.f100605a.a(fqName, this.f5728b, this.f5727a) : invoke;
    }

    @Override // q10.g
    public boolean isEmpty() {
        return this.f5728b.getAnnotations().isEmpty() && !this.f5728b.x();
    }

    @Override // java.lang.Iterable
    @m80.k
    public Iterator<q10.c> iterator() {
        return k0.X0(k0.S2(k0.N1(r0.E1(this.f5728b.getAnnotations()), this.f5730d), z10.d.f100605a.a(o.a.f74077y, this.f5728b, this.f5727a))).iterator();
    }

    public /* synthetic */ g(k kVar, f20.d dVar, boolean z11, int i11, v vVar) {
        this(kVar, dVar, (i11 & 4) != 0 ? false : z11);
    }
}
