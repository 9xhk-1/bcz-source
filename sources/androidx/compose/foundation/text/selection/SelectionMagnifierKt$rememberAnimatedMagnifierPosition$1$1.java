package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import c40.k;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
    final /* synthetic */ State<Offset> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(State<Offset> state, Animatable<Offset, AnimationVector2D> animatable, j00.c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1> cVar) {
        super(2, cVar);
        this.$targetValue$delegate = state;
        this.$animatable = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(this.$targetValue$delegate, this.$animatable, cVar);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            final r0 r0Var = (r0) this.L$0;
            final State<Offset> state = this.$targetValue$delegate;
            i snapshotFlow = SnapshotStateKt.snapshotFlow(new x00.a<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ Offset invoke() {
                    return Offset.m2257boximpl(m1456invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m1456invokeF1C5BW0() {
                    long rememberAnimatedMagnifierPosition$lambda$1;
                    rememberAnimatedMagnifierPosition$lambda$1 = SelectionMagnifierKt.rememberAnimatedMagnifierPosition$lambda$1(state);
                    return rememberAnimatedMagnifierPosition$lambda$1;
                }
            });
            final Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
            j jVar = new j() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.2

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
                    final /* synthetic */ long $targetValue;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(Animatable<Offset, AnimationVector2D> animatable, long j11, j00.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$animatable = animatable;
                        this.$targetValue = j11;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                        return new AnonymousClass1(this.$animatable, this.$targetValue, cVar);
                    }

                    @Override // x00.p
                    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                        return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object l11 = kotlin.coroutines.intrinsics.b.l();
                        int i11 = this.label;
                        if (i11 == 0) {
                            kotlin.e.n(obj);
                            Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
                            Offset m2257boximpl = Offset.m2257boximpl(this.$targetValue);
                            SpringSpec<Offset> magnifierSpringSpec = SelectionMagnifierKt.getMagnifierSpringSpec();
                            this.label = 1;
                            if (Animatable.animateTo$default(animatable, m2257boximpl, magnifierSpringSpec, null, null, this, 12, null) == l11) {
                                return l11;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.e.n(obj);
                        }
                        return g2.f100423a;
                    }
                }

                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, j00.c cVar) {
                    return m1457emit3MmeM6k(((Offset) obj2).m2278unboximpl(), cVar);
                }

                /* renamed from: emit-3MmeM6k, reason: not valid java name */
                public final Object m1457emit3MmeM6k(long j11, j00.c<? super g2> cVar) {
                    if ((animatable.getValue().m2278unboximpl() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats || (j11 & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats || Float.intBitsToFloat((int) (animatable.getValue().m2278unboximpl() & 4294967295L)) == Float.intBitsToFloat((int) (j11 & 4294967295L))) {
                        Object snapTo = animatable.snapTo(Offset.m2257boximpl(j11), cVar);
                        return snapTo == kotlin.coroutines.intrinsics.b.l() ? snapTo : g2.f100423a;
                    }
                    k.f(r0Var, null, null, new AnonymousClass1(animatable, j11, null), 3, null);
                    return g2.f100423a;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(jVar, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}
