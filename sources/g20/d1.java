package g20;

import e30.h2;
import e30.j2;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nsignatureEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,296:1\n1#2:297\n*E\n"})
/* loaded from: classes8.dex */
public final class d1 extends d<q10.c> {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final q10.a f52588a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f52589b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final b20.k f52590c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final AnnotationQualifierApplicabilityType f52591d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f52592e;

    public /* synthetic */ d1(q10.a aVar, boolean z11, b20.k kVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z12, int i11, kotlin.jvm.internal.v vVar) {
        this(aVar, z11, kVar, annotationQualifierApplicabilityType, (i11 & 16) != 0 ? false : z12);
    }

    @Override // g20.d
    public boolean B(@m80.k i30.g gVar) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        return n10.j.d0((e30.r0) gVar);
    }

    @Override // g20.d
    public boolean C() {
        return this.f52589b;
    }

    @Override // g20.d
    public boolean D(@m80.k i30.g gVar, @m80.k i30.g other) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        return this.f52590c.a().k().b((e30.r0) gVar, (e30.r0) other);
    }

    @Override // g20.d
    public boolean E(@m80.k i30.m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return mVar instanceof c20.b1;
    }

    @Override // g20.d
    public boolean F(@m80.k i30.g gVar) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        return ((e30.r0) gVar).L0() instanceof i;
    }

    @Override // g20.d
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public boolean l(@m80.k q10.c cVar, @m80.l i30.g gVar) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        if ((cVar instanceof a20.g) && ((a20.g) cVar).h()) {
            return true;
        }
        if ((cVar instanceof c20.j) && !u() && (((c20.j) cVar).l() || q() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS)) {
            return true;
        }
        return gVar != null && n10.j.q0((e30.r0) gVar) && m().p(cVar) && !this.f52590c.a().q().d();
    }

    @Override // g20.d
    @m80.k
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public y10.c m() {
        return this.f52590c.a().a();
    }

    @Override // g20.d
    @m80.l
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public e30.r0 v(@m80.k i30.g gVar) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        return j2.a((e30.r0) gVar);
    }

    @Override // g20.d
    @m80.k
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public i30.q A() {
        return f30.u.f50458a;
    }

    @Override // g20.d
    @m80.k
    public Iterable<q10.c> n(@m80.k i30.g gVar) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        return ((e30.r0) gVar).getAnnotations();
    }

    @Override // g20.d
    @m80.k
    public Iterable<q10.c> p() {
        q10.g annotations;
        q10.a aVar = this.f52588a;
        return (aVar == null || (annotations = aVar.getAnnotations()) == null) ? a00.h0.J() : annotations;
    }

    @Override // g20.d
    @m80.k
    public AnnotationQualifierApplicabilityType q() {
        return this.f52591d;
    }

    @Override // g20.d
    @m80.l
    public y10.a0 r() {
        return this.f52590c.b();
    }

    @Override // g20.d
    public boolean s() {
        q10.a aVar = this.f52588a;
        return (aVar instanceof j1) && ((j1) aVar).y0() != null;
    }

    @Override // g20.d
    @m80.l
    public j t(@m80.l j jVar, @m80.l y10.t tVar) {
        j b11;
        if (jVar != null && (b11 = j.b(jVar, NullabilityQualifier.NOT_NULL, false, 2, null)) != null) {
            return b11;
        }
        if (tVar != null) {
            return tVar.d();
        }
        return null;
    }

    @Override // g20.d
    public boolean u() {
        return this.f52590c.a().q().c();
    }

    @Override // g20.d
    @m80.l
    public n20.d x(@m80.k i30.g gVar) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        p10.b f11 = h2.f((e30.r0) gVar);
        if (f11 != null) {
            return q20.h.m(f11);
        }
        return null;
    }

    @Override // g20.d
    public boolean z() {
        return this.f52592e;
    }

    public d1(@m80.l q10.a aVar, boolean z11, @m80.k b20.k containerContext, @m80.k AnnotationQualifierApplicabilityType containerApplicabilityType, boolean z12) {
        kotlin.jvm.internal.g0.p(containerContext, "containerContext");
        kotlin.jvm.internal.g0.p(containerApplicabilityType, "containerApplicabilityType");
        this.f52588a = aVar;
        this.f52589b = z11;
        this.f52590c = containerContext;
        this.f52591d = containerApplicabilityType;
        this.f52592e = z12;
    }
}
