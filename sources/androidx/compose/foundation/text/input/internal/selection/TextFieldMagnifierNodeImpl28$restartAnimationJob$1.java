package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import c40.k;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.d;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldMagnifierNodeImpl28$restartAnimationJob$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldMagnifierNodeImpl28 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMagnifierNodeImpl28$restartAnimationJob$1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, c<? super TextFieldMagnifierNodeImpl28$restartAnimationJob$1> cVar) {
        super(2, cVar);
        this.this$0 = textFieldMagnifierNodeImpl28;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TextFieldMagnifierNodeImpl28$restartAnimationJob$1 textFieldMagnifierNodeImpl28$restartAnimationJob$1 = new TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this.this$0, cVar);
        textFieldMagnifierNodeImpl28$restartAnimationJob$1.L$0 = obj;
        return textFieldMagnifierNodeImpl28$restartAnimationJob$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((TextFieldMagnifierNodeImpl28$restartAnimationJob$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final r0 r0Var = (r0) this.L$0;
            final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.this$0;
            i snapshotFlow = SnapshotStateKt.snapshotFlow(new a<Offset>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.1
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ Offset invoke() {
                    return Offset.m2257boximpl(m1349invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m1349invokeF1C5BW0() {
                    boolean z11;
                    TransformedTextFieldState transformedTextFieldState;
                    TextFieldSelectionState textFieldSelectionState;
                    TextLayoutState textLayoutState;
                    long m1345getMagnifierSizeYbymL2g;
                    TextFieldSelectionState textFieldSelectionState2;
                    z11 = TextFieldMagnifierNodeImpl28.this.visible;
                    if (!z11) {
                        textFieldSelectionState2 = TextFieldMagnifierNodeImpl28.this.textFieldSelectionState;
                        if (textFieldSelectionState2.getDirectDragGestureInitiator() != TextFieldSelectionState.InputType.Touch) {
                            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
                        }
                    }
                    transformedTextFieldState = TextFieldMagnifierNodeImpl28.this.textFieldState;
                    textFieldSelectionState = TextFieldMagnifierNodeImpl28.this.textFieldSelectionState;
                    textLayoutState = TextFieldMagnifierNodeImpl28.this.textLayoutState;
                    m1345getMagnifierSizeYbymL2g = TextFieldMagnifierNodeImpl28.this.m1345getMagnifierSizeYbymL2g();
                    return TextFieldMagnifierKt.m1342calculateSelectionMagnifierCenterAndroidhUlJWOE(transformedTextFieldState, textFieldSelectionState, textLayoutState, m1345getMagnifierSizeYbymL2g);
                }
            });
            final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl282 = this.this$0;
            j jVar = new j() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.2

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
                    final /* synthetic */ long $targetValue;
                    int label;
                    final /* synthetic */ TextFieldMagnifierNodeImpl28 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, long j11, c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.this$0 = textFieldMagnifierNodeImpl28;
                        this.$targetValue = j11;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final c<g2> create(Object obj, c<?> cVar) {
                        return new AnonymousClass1(this.this$0, this.$targetValue, cVar);
                    }

                    @Override // x00.p
                    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                        return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Animatable animatable;
                        Object l11 = b.l();
                        int i11 = this.label;
                        if (i11 == 0) {
                            e.n(obj);
                            animatable = this.this$0.animatable;
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
                            e.n(obj);
                        }
                        return g2.f100423a;
                    }
                }

                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                    return m1350emit3MmeM6k(((Offset) obj2).m2278unboximpl(), cVar);
                }

                /* renamed from: emit-3MmeM6k, reason: not valid java name */
                public final Object m1350emit3MmeM6k(long j11, c<? super g2> cVar) {
                    Animatable animatable;
                    Animatable animatable2;
                    Animatable animatable3;
                    animatable = TextFieldMagnifierNodeImpl28.this.animatable;
                    if ((((Offset) animatable.getValue()).m2278unboximpl() & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats && (j11 & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                        animatable3 = TextFieldMagnifierNodeImpl28.this.animatable;
                        if (Float.intBitsToFloat((int) (((Offset) animatable3.getValue()).m2278unboximpl() & 4294967295L)) != Float.intBitsToFloat((int) (j11 & 4294967295L))) {
                            k.f(r0Var, null, null, new AnonymousClass1(TextFieldMagnifierNodeImpl28.this, j11, null), 3, null);
                            return g2.f100423a;
                        }
                    }
                    animatable2 = TextFieldMagnifierNodeImpl28.this.animatable;
                    Object snapTo = animatable2.snapTo(Offset.m2257boximpl(j11), cVar);
                    return snapTo == b.l() ? snapTo : g2.f100423a;
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
            e.n(obj);
        }
        return g2.f100423a;
    }
}
