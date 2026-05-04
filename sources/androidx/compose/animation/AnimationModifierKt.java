package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,269:1\n30#2:270\n80#3:271\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n*L\n137#1:270\n137#1:271\n*E\n"})
/* loaded from: classes.dex */
public final class AnimationModifierKt {
    private static final long InvalidSize;

    static {
        long j11 = Integer.MIN_VALUE;
        InvalidSize = IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32));
    }

    @k
    public static final Modifier animateContentSize(@k Modifier modifier, @k FiniteAnimationSpec<IntSize> finiteAnimationSpec, @l p<? super IntSize, ? super IntSize, g2> pVar) {
        return ClipKt.clipToBounds(modifier).then(new SizeAnimationModifierElement(finiteAnimationSpec, Alignment.Companion.getTopStart(), pVar));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5278boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i11 & 2) != 0) {
            pVar = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, pVar);
    }

    public static final long getInvalidSize() {
        return InvalidSize;
    }

    /* renamed from: isValid-ozmzZPI, reason: not valid java name */
    public static final boolean m65isValidozmzZPI(long j11) {
        return !IntSize.m5284equalsimpl0(j11, InvalidSize);
    }

    @k
    public static final Modifier animateContentSize(@k Modifier modifier, @k FiniteAnimationSpec<IntSize> finiteAnimationSpec, @k Alignment alignment, @l p<? super IntSize, ? super IntSize, g2> pVar) {
        return ClipKt.clipToBounds(modifier).then(new SizeAnimationModifierElement(finiteAnimationSpec, alignment, pVar));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5278boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i11 & 2) != 0) {
            alignment = Alignment.Companion.getTopStart();
        }
        if ((i11 & 4) != 0) {
            pVar = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, alignment, pVar);
    }
}
