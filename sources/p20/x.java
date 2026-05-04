package p20;

import a00.w1;
import e30.r0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;
import p10.j1;
import p20.a;
import p20.m;
import p20.u;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDescriptorRendererOptionsImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,137:1\n1#2:138\n51#3,3:139\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n*L\n60#1:139,3\n*E\n"})
/* loaded from: classes8.dex */
public final class x implements u {
    public static final /* synthetic */ h10.n<Object>[] Z = {o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "withDefinedIn", "getWithDefinedIn()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "modifiers", "getModifiers()Ljava/util/Set;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "startFromName", "getStartFromName()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "debugMode", "getDebugMode()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "verbose", "getVerbose()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "unitReturnType", "getUnitReturnType()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "withoutReturnType", "getWithoutReturnType()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "enhancedTypes", "getEnhancedTypes()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "renderDefaultModality", "getRenderDefaultModality()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "receiverAfterName", "getReceiverAfterName()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), o0.k(new MutablePropertyReference1Impl(o0.d(x.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    @m80.k
    public final d10.f A;

    @m80.k
    public final d10.f B;

    @m80.k
    public final d10.f C;

    @m80.k
    public final d10.f D;

    @m80.k
    public final d10.f E;

    @m80.k
    public final d10.f F;

    @m80.k
    public final d10.f G;

    @m80.k
    public final d10.f H;

    @m80.k
    public final d10.f I;

    @m80.k
    public final d10.f J;

    @m80.k
    public final d10.f K;

    @m80.k
    public final d10.f L;

    @m80.k
    public final d10.f M;

    @m80.k
    public final d10.f N;

    @m80.k
    public final d10.f O;

    @m80.k
    public final d10.f P;

    @m80.k
    public final d10.f Q;

    @m80.k
    public final d10.f R;

    @m80.k
    public final d10.f S;

    @m80.k
    public final d10.f T;

    @m80.k
    public final d10.f U;

    @m80.k
    public final d10.f V;

    @m80.k
    public final d10.f W;

    @m80.k
    public final d10.f X;

    @m80.k
    public final d10.f Y;

    /* renamed from: a, reason: collision with root package name */
    public boolean f78768a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final d10.f f78769b = t0(a.c.f78728a);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d10.f f78770c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d10.f f78771d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final d10.f f78772e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final d10.f f78773f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final d10.f f78774g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final d10.f f78775h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final d10.f f78776i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final d10.f f78777j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final d10.f f78778k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final d10.f f78779l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final d10.f f78780m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final d10.f f78781n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final d10.f f78782o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final d10.f f78783p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final d10.f f78784q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final d10.f f78785r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final d10.f f78786s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final d10.f f78787t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final d10.f f78788u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public final d10.f f78789v;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public final d10.f f78790w;

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public final d10.f f78791x;

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public final d10.f f78792y;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public final d10.f f78793z;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n+ 2 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n*L\n1#1,52:1\n61#2,6:53\n*E\n"})
    public static final class a<T> extends d10.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f78794a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, x xVar) {
            super(obj);
            this.f78794a = xVar;
        }

        @Override // d10.c
        public boolean beforeChange(h10.n<?> property, T t11, T t12) {
            g0.p(property, "property");
            if (this.f78794a.r0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    public x() {
        Boolean bool = Boolean.TRUE;
        this.f78770c = t0(bool);
        this.f78771d = t0(bool);
        this.f78772e = t0(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f78773f = t0(bool2);
        this.f78774g = t0(bool2);
        this.f78775h = t0(bool2);
        this.f78776i = t0(bool2);
        this.f78777j = t0(bool2);
        this.f78778k = t0(bool);
        this.f78779l = t0(bool2);
        this.f78780m = t0(bool2);
        this.f78781n = t0(bool2);
        this.f78782o = t0(bool);
        this.f78783p = t0(bool);
        this.f78784q = t0(bool2);
        this.f78785r = t0(bool2);
        this.f78786s = t0(bool2);
        this.f78787t = t0(bool2);
        this.f78788u = t0(bool2);
        this.f78789v = t0(null);
        this.f78790w = t0(bool2);
        this.f78791x = t0(bool2);
        this.f78792y = t0(v.f78766a);
        this.f78793z = t0(w.f78767a);
        this.A = t0(bool);
        this.B = t0(OverrideRenderingPolicy.RENDER_OPEN);
        this.C = t0(m.b.a.f78753a);
        this.D = t0(RenderingFormat.PLAIN);
        this.E = t0(ParameterNameRenderingPolicy.ALL);
        this.F = t0(bool2);
        this.G = t0(bool2);
        this.H = t0(PropertyAccessorRenderingPolicy.DEBUG);
        this.I = t0(bool2);
        this.J = t0(bool2);
        this.K = t0(w1.k());
        this.L = t0(y.f78795a.a());
        this.M = t0(null);
        this.N = t0(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
        this.O = t0(bool2);
        this.P = t0(bool);
        this.Q = t0(bool);
        this.R = t0(bool2);
        this.S = t0(bool2);
        this.T = t0(bool);
        this.U = t0(bool);
        this.V = t0(bool2);
        this.W = t0(bool2);
        this.X = t0(bool2);
        this.Y = t0(bool);
    }

    public static final r0 u0(r0 it) {
        g0.p(it, "it");
        return it;
    }

    public static final String x(j1 it) {
        g0.p(it, "it");
        return "...";
    }

    @m80.l
    public x00.l<q10.c, Boolean> A() {
        return (x00.l) this.M.getValue(this, Z[37]);
    }

    public boolean B() {
        return ((Boolean) this.X.getValue(this, Z[48])).booleanValue();
    }

    public boolean C() {
        return ((Boolean) this.f78776i.getValue(this, Z[7])).booleanValue();
    }

    @m80.k
    public p20.a D() {
        return (p20.a) this.f78769b.getValue(this, Z[0]);
    }

    @m80.l
    public x00.l<j1, String> E() {
        return (x00.l) this.f78793z.getValue(this, Z[24]);
    }

    public boolean F() {
        return ((Boolean) this.J.getValue(this, Z[34])).booleanValue();
    }

    @m80.k
    public Set<n20.c> G() {
        return (Set) this.K.getValue(this, Z[35]);
    }

    public boolean H() {
        return ((Boolean) this.T.getValue(this, Z[44])).booleanValue();
    }

    public boolean I() {
        return ((Boolean) this.f78788u.getValue(this, Z[19])).booleanValue();
    }

    public boolean J() {
        return ((Boolean) this.Y.getValue(this, Z[49])).booleanValue();
    }

    @m80.k
    public Set<DescriptorRendererModifier> K() {
        return (Set) this.f78772e.getValue(this, Z[3]);
    }

    public boolean L() {
        return ((Boolean) this.f78781n.getValue(this, Z[12])).booleanValue();
    }

    @m80.k
    public OverrideRenderingPolicy M() {
        return (OverrideRenderingPolicy) this.B.getValue(this, Z[26]);
    }

    @m80.k
    public ParameterNameRenderingPolicy N() {
        return (ParameterNameRenderingPolicy) this.E.getValue(this, Z[29]);
    }

    public boolean O() {
        return ((Boolean) this.U.getValue(this, Z[45])).booleanValue();
    }

    public boolean P() {
        return ((Boolean) this.W.getValue(this, Z[47])).booleanValue();
    }

    @m80.k
    public PropertyAccessorRenderingPolicy Q() {
        return (PropertyAccessorRenderingPolicy) this.H.getValue(this, Z[32]);
    }

    @m80.l
    public x00.l<s20.g<?>, String> R() {
        return (x00.l) this.f78789v.getValue(this, Z[20]);
    }

    public boolean S() {
        return ((Boolean) this.F.getValue(this, Z[30])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.S.getValue(this, Z[43])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.G.getValue(this, Z[31])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f78784q.getValue(this, Z[15])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.P.getValue(this, Z[40])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.I.getValue(this, Z[33])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f78783p.getValue(this, Z[14])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.f78782o.getValue(this, Z[13])).booleanValue();
    }

    @Override // p20.u
    public void a(@m80.k ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        g0.p(parameterNameRenderingPolicy, "<set-?>");
        this.E.setValue(this, Z[29], parameterNameRenderingPolicy);
    }

    public boolean a0() {
        return ((Boolean) this.f78785r.getValue(this, Z[16])).booleanValue();
    }

    @Override // p20.u
    public boolean b() {
        return ((Boolean) this.f78780m.getValue(this, Z[11])).booleanValue();
    }

    public boolean b0() {
        return ((Boolean) this.R.getValue(this, Z[42])).booleanValue();
    }

    @Override // p20.u
    @m80.k
    public Set<n20.c> c() {
        return (Set) this.L.getValue(this, Z[36]);
    }

    public boolean c0() {
        return ((Boolean) this.Q.getValue(this, Z[41])).booleanValue();
    }

    @Override // p20.u
    public boolean d() {
        return ((Boolean) this.f78775h.getValue(this, Z[6])).booleanValue();
    }

    public boolean d0() {
        return ((Boolean) this.A.getValue(this, Z[25])).booleanValue();
    }

    @Override // p20.u
    @m80.k
    public AnnotationArgumentsRenderingPolicy e() {
        return (AnnotationArgumentsRenderingPolicy) this.N.getValue(this, Z[38]);
    }

    public boolean e0() {
        return ((Boolean) this.f78774g.getValue(this, Z[5])).booleanValue();
    }

    @Override // p20.u
    public void f(@m80.k Set<n20.c> set) {
        g0.p(set, "<set-?>");
        this.L.setValue(this, Z[36], set);
    }

    public boolean f0() {
        return ((Boolean) this.f78773f.getValue(this, Z[4])).booleanValue();
    }

    @Override // p20.u
    public void g(@m80.k Set<? extends DescriptorRendererModifier> set) {
        g0.p(set, "<set-?>");
        this.f78772e.setValue(this, Z[3], set);
    }

    @m80.k
    public RenderingFormat g0() {
        return (RenderingFormat) this.D.getValue(this, Z[28]);
    }

    @Override // p20.u
    public void h(boolean z11) {
        this.f78777j.setValue(this, Z[8], Boolean.valueOf(z11));
    }

    @m80.k
    public x00.l<r0, r0> h0() {
        return (x00.l) this.f78792y.getValue(this, Z[23]);
    }

    @Override // p20.u
    public void i(boolean z11) {
        this.f78775h.setValue(this, Z[6], Boolean.valueOf(z11));
    }

    public boolean i0() {
        return ((Boolean) this.f78787t.getValue(this, Z[18])).booleanValue();
    }

    @Override // p20.u
    public boolean j() {
        return u.a.a(this);
    }

    public boolean j0() {
        return ((Boolean) this.f78778k.getValue(this, Z[9])).booleanValue();
    }

    @Override // p20.u
    public void k(boolean z11) {
        this.f78790w.setValue(this, Z[21], Boolean.valueOf(z11));
    }

    @m80.k
    public m.b k0() {
        return (m.b) this.C.getValue(this, Z[27]);
    }

    @Override // p20.u
    public boolean l() {
        return u.a.b(this);
    }

    public boolean l0() {
        return ((Boolean) this.f78777j.getValue(this, Z[8])).booleanValue();
    }

    @Override // p20.u
    public void m(boolean z11) {
        this.f78773f.setValue(this, Z[4], Boolean.valueOf(z11));
    }

    public boolean m0() {
        return ((Boolean) this.f78770c.getValue(this, Z[1])).booleanValue();
    }

    @Override // p20.u
    public void n(boolean z11) {
        this.f78770c.setValue(this, Z[1], Boolean.valueOf(z11));
    }

    public boolean n0() {
        return ((Boolean) this.f78771d.getValue(this, Z[2])).booleanValue();
    }

    @Override // p20.u
    public void o(boolean z11) {
        this.f78791x.setValue(this, Z[22], Boolean.valueOf(z11));
    }

    public boolean o0() {
        return ((Boolean) this.f78779l.getValue(this, Z[10])).booleanValue();
    }

    @Override // p20.u
    public void p(boolean z11) {
        this.F.setValue(this, Z[30], Boolean.valueOf(z11));
    }

    public boolean p0() {
        return ((Boolean) this.f78791x.getValue(this, Z[22])).booleanValue();
    }

    @Override // p20.u
    public void q(@m80.k RenderingFormat renderingFormat) {
        g0.p(renderingFormat, "<set-?>");
        this.D.setValue(this, Z[28], renderingFormat);
    }

    public boolean q0() {
        return ((Boolean) this.f78790w.getValue(this, Z[21])).booleanValue();
    }

    @Override // p20.u
    public void r(@m80.k AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        g0.p(annotationArgumentsRenderingPolicy, "<set-?>");
        this.N.setValue(this, Z[38], annotationArgumentsRenderingPolicy);
    }

    public final boolean r0() {
        return this.f78768a;
    }

    @Override // p20.u
    public void s(@m80.k p20.a aVar) {
        g0.p(aVar, "<set-?>");
        this.f78769b.setValue(this, Z[0], aVar);
    }

    public final void s0() {
        this.f78768a = true;
    }

    @Override // p20.u
    public void t(boolean z11) {
        this.G.setValue(this, Z[31], Boolean.valueOf(z11));
    }

    public final <T> d10.f<x, T> t0(T t11) {
        d10.a aVar = d10.a.f47010a;
        return new a(t11, this);
    }

    @m80.k
    public final x w() {
        x xVar = new x();
        Iterator a11 = kotlin.jvm.internal.h.a(x.class.getDeclaredFields());
        while (a11.hasNext()) {
            Field field = (Field) a11.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                d10.c cVar = obj instanceof d10.c ? (d10.c) obj : null;
                if (cVar != null) {
                    String name = field.getName();
                    g0.o(name, "getName(...)");
                    f0.J2(name, "is", false, 2, null);
                    h10.d d11 = o0.d(x.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ct.d.f46852f);
                    String name3 = field.getName();
                    g0.o(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        g0.o(substring, "substring(...)");
                        name3 = upperCase + substring;
                    }
                    sb2.append(name3);
                    field.set(xVar, xVar.t0(cVar.getValue(this, new PropertyReference1Impl(d11, name2, sb2.toString()))));
                }
            }
        }
        return xVar;
    }

    public boolean y() {
        return ((Boolean) this.f78786s.getValue(this, Z[17])).booleanValue();
    }

    public boolean z() {
        return ((Boolean) this.O.getValue(this, Z[39])).booleanValue();
    }
}
