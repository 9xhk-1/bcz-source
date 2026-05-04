package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import m80.k;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AnimateBoundsModifierKt {

    @k
    private static final BoundsTransform DefaultBoundsTransform = new BoundsTransform() { // from class: androidx.compose.animation.a
        @Override // androidx.compose.animation.BoundsTransform
        public final FiniteAnimationSpec transform(Rect rect, Rect rect2) {
            FiniteAnimationSpec DefaultBoundsTransform$lambda$0;
            DefaultBoundsTransform$lambda$0 = AnimateBoundsModifierKt.DefaultBoundsTransform$lambda$0(rect, rect2);
            return DefaultBoundsTransform$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec DefaultBoundsTransform$lambda$0(Rect rect, Rect rect2) {
        return AnimationSpecKt.spring(1.0f, 400.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion));
    }

    @ExperimentalSharedTransitionApi
    @k
    public static final Modifier animateBounds(@k Modifier modifier, @k LookaheadScope lookaheadScope, @k Modifier modifier2, @k BoundsTransform boundsTransform, boolean z11) {
        return modifier.then(new BoundsAnimationElement(lookaheadScope, boundsTransform, new p<IntSize, Constraints, Constraints>() { // from class: androidx.compose.animation.AnimateBoundsModifierKt$animateBounds$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ Constraints invoke(IntSize intSize, Constraints constraints) {
                return Constraints.m5055boximpl(m29invoke2pbfIzA(intSize.m5290unboximpl(), constraints.m5074unboximpl()));
            }

            /* renamed from: invoke-2pbfIzA, reason: not valid java name */
            public final long m29invoke2pbfIzA(long j11, long j12) {
                return j12;
            }
        }, z11)).then(modifier2).then(new BoundsAnimationElement(lookaheadScope, boundsTransform, new p<IntSize, Constraints, Constraints>() { // from class: androidx.compose.animation.AnimateBoundsModifierKt$animateBounds$2
            @Override // x00.p
            public /* bridge */ /* synthetic */ Constraints invoke(IntSize intSize, Constraints constraints) {
                return Constraints.m5055boximpl(m30invoke2pbfIzA(intSize.m5290unboximpl(), constraints.m5074unboximpl()));
            }

            /* renamed from: invoke-2pbfIzA, reason: not valid java name */
            public final long m30invoke2pbfIzA(long j11, long j12) {
                return Constraints.Companion.m5078fixedJhjzzOo((int) (j11 >> 32), (int) (j11 & 4294967295L));
            }
        }, z11));
    }

    public static /* synthetic */ Modifier animateBounds$default(Modifier modifier, LookaheadScope lookaheadScope, Modifier modifier2, BoundsTransform boundsTransform, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            modifier2 = Modifier.Companion;
        }
        if ((i11 & 4) != 0) {
            boundsTransform = DefaultBoundsTransform;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return animateBounds(modifier, lookaheadScope, modifier2, boundsTransform, z11);
    }

    private static /* synthetic */ void getDefaultBoundsTransform$annotations() {
    }
}
