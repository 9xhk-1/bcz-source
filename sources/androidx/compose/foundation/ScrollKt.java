package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,485:1\n1247#2,6:486\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n70#1:486,6\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollKt {
    @m80.k
    public static final Modifier horizontalScroll(@m80.k Modifier modifier, @m80.k ScrollState scrollState, boolean z11, @l FlingBehavior flingBehavior, boolean z12) {
        return scroll$default(modifier, scrollState, z12, flingBehavior, z11, false, true, null, 64, null);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, boolean z11, FlingBehavior flingBehavior, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        return horizontalScroll(modifier, scrollState, z11, flingBehavior, z12);
    }

    @Composable
    @m80.k
    public static final ScrollState rememberScrollState(final int i11, @l Composer composer, int i12, int i13) {
        boolean z11 = true;
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464256199, i12, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:68)");
        }
        Object[] objArr = new Object[0];
        Saver<ScrollState, ?> saver = ScrollState.Companion.getSaver();
        if ((((i12 & 14) ^ 6) <= 4 || !composer.changed(i11)) && (i12 & 6) != 4) {
            z11 = false;
        }
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.a<ScrollState>() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final ScrollState invoke() {
                    return new ScrollState(i11);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ScrollState scrollState = (ScrollState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) saver, (String) null, (x00.a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scrollState;
    }

    private static final Modifier scroll(Modifier modifier, ScrollState scrollState, boolean z11, FlingBehavior flingBehavior, boolean z12, boolean z13, boolean z14, OverscrollEffect overscrollEffect) {
        Modifier scrollingContainer;
        scrollingContainer = ScrollingContainerKt.scrollingContainer(modifier, scrollState, z13 ? Orientation.Vertical : Orientation.Horizontal, z12, z11, flingBehavior, scrollState.getInternalInteractionSource$foundation_release(), z14, overscrollEffect, (r21 & 256) != 0 ? null : null);
        return scrollingContainer.then(new ScrollingLayoutElement(scrollState, z11, z13));
    }

    public static /* synthetic */ Modifier scroll$default(Modifier modifier, ScrollState scrollState, boolean z11, FlingBehavior flingBehavior, boolean z12, boolean z13, boolean z14, OverscrollEffect overscrollEffect, int i11, Object obj) {
        return scroll(modifier, scrollState, z11, flingBehavior, z12, z13, z14, (i11 & 64) != 0 ? null : overscrollEffect);
    }

    @m80.k
    public static final Modifier verticalScroll(@m80.k Modifier modifier, @m80.k ScrollState scrollState, boolean z11, @l FlingBehavior flingBehavior, boolean z12) {
        return scroll$default(modifier, scrollState, z12, flingBehavior, z11, true, true, null, 64, null);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z11, FlingBehavior flingBehavior, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        return verticalScroll(modifier, scrollState, z11, flingBehavior, z12);
    }

    @m80.k
    public static final Modifier horizontalScroll(@m80.k Modifier modifier, @m80.k ScrollState scrollState, @l OverscrollEffect overscrollEffect, boolean z11, @l FlingBehavior flingBehavior, boolean z12) {
        return scroll(modifier, scrollState, z12, flingBehavior, z11, false, false, overscrollEffect);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z11, FlingBehavior flingBehavior, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            flingBehavior = null;
        }
        FlingBehavior flingBehavior2 = flingBehavior;
        if ((i11 & 16) != 0) {
            z12 = false;
        }
        return horizontalScroll(modifier, scrollState, overscrollEffect, z13, flingBehavior2, z12);
    }

    @m80.k
    public static final Modifier verticalScroll(@m80.k Modifier modifier, @m80.k ScrollState scrollState, @l OverscrollEffect overscrollEffect, boolean z11, @l FlingBehavior flingBehavior, boolean z12) {
        return scroll(modifier, scrollState, z12, flingBehavior, z11, true, false, overscrollEffect);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z11, FlingBehavior flingBehavior, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            flingBehavior = null;
        }
        FlingBehavior flingBehavior2 = flingBehavior;
        if ((i11 & 16) != 0) {
            z12 = false;
        }
        return verticalScroll(modifier, scrollState, overscrollEffect, z13, flingBehavior2, z12);
    }
}
