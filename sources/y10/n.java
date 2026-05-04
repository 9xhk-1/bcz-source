package y10;

import e30.r0;
import e30.z1;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p10.c1;
import p10.j1;
import p10.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nErasedOverridabilityCondition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErasedOverridabilityCondition.kt\norg/jetbrains/kotlin/load/java/ErasedOverridabilityCondition\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,63:1\n1251#2,2:64\n*S KotlinDebug\n*F\n+ 1 ErasedOverridabilityCondition.kt\norg/jetbrains/kotlin/load/java/ErasedOverridabilityCondition\n*L\n44#1:64,2\n*E\n"})
/* loaded from: classes8.dex */
public final class n implements ExternalOverridabilityCondition {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99099a;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f99099a = iArr;
        }
    }

    public static final r0 d(j1 j1Var) {
        return j1Var.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @m80.k
    public ExternalOverridabilityCondition.Result a(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a superDescriptor, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.a subDescriptor, @m80.l p10.b bVar) {
        kotlin.jvm.internal.g0.p(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.g0.p(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof a20.e) {
            a20.e eVar = (a20.e) subDescriptor;
            List<c1> typeParameters = eVar.getTypeParameters();
            kotlin.jvm.internal.g0.o(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                OverridingUtil.OverrideCompatibilityInfo w11 = OverridingUtil.w(superDescriptor, subDescriptor);
                z1 z1Var = null;
                Object[] objArr = 0;
                if ((w11 != null ? w11.c() : null) != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<j1> g11 = eVar.g();
                kotlin.jvm.internal.g0.o(g11, "getValueParameters(...)");
                q30.m N1 = q30.k0.N1(a00.r0.E1(g11), m.f99097a);
                r0 returnType = eVar.getReturnType();
                kotlin.jvm.internal.g0.m(returnType);
                q30.m S2 = q30.k0.S2(N1, returnType);
                t0 f02 = eVar.f0();
                for (r0 r0Var : q30.k0.R2(S2, a00.h0.R(f02 != null ? f02.getType() : null))) {
                    if (!r0Var.G0().isEmpty() && !(r0Var.L0() instanceof d20.j)) {
                        return ExternalOverridabilityCondition.Result.UNKNOWN;
                    }
                }
                kotlin.reflect.jvm.internal.impl.descriptors.a c11 = superDescriptor.c(new d20.h(z1Var, 1, objArr == true ? 1 : 0).c());
                if (c11 == null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (c11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) {
                    kotlin.reflect.jvm.internal.impl.descriptors.g gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) c11;
                    List<c1> typeParameters2 = gVar.getTypeParameters();
                    kotlin.jvm.internal.g0.o(typeParameters2, "getTypeParameters(...)");
                    if (!typeParameters2.isEmpty()) {
                        c11 = gVar.n().g(a00.h0.J()).build();
                        kotlin.jvm.internal.g0.m(c11);
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo.Result c12 = OverridingUtil.f67634f.F(c11, subDescriptor, false).c();
                kotlin.jvm.internal.g0.o(c12, "getResult(...)");
                return a.f99099a[c12.ordinal()] == 1 ? ExternalOverridabilityCondition.Result.OVERRIDABLE : ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @m80.k
    public ExternalOverridabilityCondition.Contract b() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }
}
