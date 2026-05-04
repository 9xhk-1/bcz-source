package coil.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nConstraintsSizeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintsSizeResolver.kt\ncoil/compose/ConstraintsSizeResolver\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,45:1\n60#2:46\n63#2:50\n50#3:47\n55#3:49\n107#4:48\n*S KotlinDebug\n*F\n+ 1 ConstraintsSizeResolver.kt\ncoil/compose/ConstraintsSizeResolver\n*L\n23#1:46\n23#1:50\n23#1:47\n23#1:49\n23#1:48\n*E\n"})
/* loaded from: classes3.dex */
public final class ConstraintsSizeResolver implements q0.h, LayoutModifier {

    /* renamed from: b, reason: collision with root package name */
    public static final int f9592b = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final y<Constraints> f9593a = o0.a(Constraints.m5055boximpl(q.e()));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.l<Placeable.PlacementScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Placeable f9596a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable) {
            super(1);
            this.f9596a = placeable;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m80.k Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.place$default(placementScope, this.f9596a, 0, 0, 0.0f, 4, null);
        }
    }

    @Override // q0.h
    @m80.l
    public Object a(@m80.k j00.c<? super q0.g> cVar) {
        final y<Constraints> yVar = this.f9593a;
        return kotlinx.coroutines.flow.k.w0(new kotlinx.coroutines.flow.i<q0.g>() { // from class: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ConstraintsSizeResolver.kt\ncoil/compose/ConstraintsSizeResolver\n*L\n1#1,222:1\n61#2:223\n62#2:225\n23#3:224\n*E\n"})
            /* renamed from: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f9595a;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "ConstraintsSizeResolver.kt", i = {}, l = {225}, m = "emit", n = {}, s = {})
                @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @m80.l
                    public final Object invokeSuspend(@m80.k Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                    this.f9595a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                @m80.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, @m80.k j00.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 r0 = (coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 r0 = new coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.e.n(r8)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f9595a
                        androidx.compose.ui.unit.Constraints r7 = (androidx.compose.ui.unit.Constraints) r7
                        long r4 = r7.m5074unboximpl()
                        q0.g r7 = coil.compose.q.m(r4)
                        if (r7 == 0) goto L4b
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L4b
                        return r1
                    L4b:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            @m80.l
            public Object collect(@m80.k kotlinx.coroutines.flow.j<? super q0.g> jVar, @m80.k j00.c cVar2) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, cVar);
    }

    public final void j(long j11) {
        this.f9593a.setValue(Constraints.m5055boximpl(j11));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo646measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        this.f9593a.setValue(Constraints.m5055boximpl(j11));
        Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new a(mo3857measureBRTryo0), 4, null);
    }
}
