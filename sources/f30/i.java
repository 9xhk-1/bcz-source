package f30;

import a00.h0;
import e30.a2;
import e30.c1;
import e30.k2;
import e30.r1;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
/* loaded from: classes8.dex */
public final class i extends c1 implements i30.b {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final CaptureStatus f50434b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final n f50435c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final k2 f50436d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final r1 f50437e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f50438f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f50439g;

    public /* synthetic */ i(CaptureStatus captureStatus, n nVar, k2 k2Var, r1 r1Var, boolean z11, boolean z12, int i11, kotlin.jvm.internal.v vVar) {
        this(captureStatus, nVar, k2Var, (i11 & 8) != 0 ? r1.f48652b.j() : r1Var, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? false : z12);
    }

    @Override // e30.r0
    @m80.k
    public List<a2> G0() {
        return h0.J();
    }

    @Override // e30.r0
    @m80.k
    public r1 H0() {
        return this.f50437e;
    }

    @Override // e30.r0
    public boolean J0() {
        return this.f50438f;
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: Q0 */
    public c1 O0(@m80.k r1 newAttributes) {
        g0.p(newAttributes, "newAttributes");
        return new i(this.f50434b, I0(), this.f50436d, newAttributes, J0(), this.f50439g);
    }

    @m80.k
    public final CaptureStatus R0() {
        return this.f50434b;
    }

    @Override // e30.r0
    @m80.k
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public n I0() {
        return this.f50435c;
    }

    @m80.l
    public final k2 T0() {
        return this.f50436d;
    }

    public final boolean U0() {
        return this.f50439g;
    }

    @Override // e30.c1
    @m80.k
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public i M0(boolean z11) {
        return new i(this.f50434b, I0(), this.f50436d, H0(), z11, false, 32, null);
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public i S0(@m80.k g kotlinTypeRefiner) {
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        CaptureStatus captureStatus = this.f50434b;
        n d11 = I0().d(kotlinTypeRefiner);
        k2 k2Var = this.f50436d;
        return new i(captureStatus, d11, k2Var != null ? kotlinTypeRefiner.a(k2Var).L0() : null, H0(), J0(), false, 32, null);
    }

    @Override // e30.r0
    @m80.k
    public x20.k r() {
        return g30.i.a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public i(@m80.k CaptureStatus captureStatus, @m80.k n constructor, @m80.l k2 k2Var, @m80.k r1 attributes, boolean z11, boolean z12) {
        g0.p(captureStatus, "captureStatus");
        g0.p(constructor, "constructor");
        g0.p(attributes, "attributes");
        this.f50434b = captureStatus;
        this.f50435c = constructor;
        this.f50436d = k2Var;
        this.f50437e = attributes;
        this.f50438f = z11;
        this.f50439g = z12;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@m80.k CaptureStatus captureStatus, @m80.l k2 k2Var, @m80.k a2 projection, @m80.k p10.c1 typeParameter) {
        this(captureStatus, new n(projection, null, null, typeParameter, 6, null), k2Var, null, false, false, 56, null);
        g0.p(captureStatus, "captureStatus");
        g0.p(projection, "projection");
        g0.p(typeParameter, "typeParameter");
    }
}
