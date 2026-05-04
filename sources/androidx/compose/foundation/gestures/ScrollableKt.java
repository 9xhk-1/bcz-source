package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.unit.Density;
import kotlin.coroutines.d;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ScrollableKt {
    private static final float DefaultScrollMotionDurationScaleFactor = 1.0f;

    @k
    private static final l<PointerInputChange, Boolean> CanDragCalculation = new l<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$CanDragCalculation$1
        @Override // x00.l
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.valueOf(!PointerType.m3803equalsimpl0(pointerInputChange.m3735getTypeT8wyACA(), PointerType.Companion.m3808getMouseT8wyACA()));
        }
    };

    @k
    private static final ScrollScope NoOpScrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f11) {
            return f11;
        }
    };

    @k
    private static final MotionDurationScale DefaultScrollMotionDurationScale = new MotionDurationScale() { // from class: androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1
        @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
        public <R> R fold(R r11, p<? super R, ? super d.b, ? extends R> pVar) {
            return (R) MotionDurationScale.DefaultImpls.fold(this, r11, pVar);
        }

        @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
        public <E extends d.b> E get(d.c<E> cVar) {
            return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public float getScaleFactor() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
        public d minusKey(d.c<?> cVar) {
            return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
        }

        @Override // kotlin.coroutines.d
        public d plus(d dVar) {
            return MotionDurationScale.DefaultImpls.plus(this, dVar);
        }
    };

    @k
    private static final ScrollableKt$UnityDensity$1 UnityDensity = new Density() { // from class: androidx.compose.foundation.gestures.ScrollableKt$UnityDensity$1
        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return 1.0f;
        }
    };

    @k
    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return DefaultScrollMotionDurationScale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getShouldBeTriggeredByMouseWheel(FlingBehavior flingBehavior) {
        return false;
    }

    @Stable
    @k
    public static final Modifier scrollable(@k Modifier modifier, @k ScrollableState scrollableState, @k Orientation orientation, boolean z11, boolean z12, @m80.l FlingBehavior flingBehavior, @m80.l MutableInteractionSource mutableInteractionSource) {
        return scrollable$default(modifier, scrollableState, orientation, null, z11, z12, flingBehavior, mutableInteractionSource, null, 128, null);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z11, boolean z12, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        return scrollable(modifier, scrollableState, orientation, z13, z12, (i11 & 16) != 0 ? null : flingBehavior, (i11 & 32) != 0 ? null : mutableInteractionSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: semanticsScrollBy-d-4ec7I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m496semanticsScrollByd4ec7I(androidx.compose.foundation.gestures.ScrollingLogic r10, long r11, j00.c<? super androidx.compose.ui.geometry.Offset> r13) {
        /*
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.internal.Ref$FloatRef r10 = (kotlin.jvm.internal.Ref.FloatRef) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r11 = (androidx.compose.foundation.gestures.ScrollingLogic) r11
            kotlin.e.n(r13)
            r8 = r10
            r10 = r11
            goto L5b
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            kotlin.e.n(r13)
            kotlin.jvm.internal.Ref$FloatRef r8 = new kotlin.jvm.internal.Ref$FloatRef
            r8.<init>()
            androidx.compose.foundation.MutatePriority r13 = androidx.compose.foundation.MutatePriority.Default
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2 r4 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2
            r9 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r8, r9)
            r0.L$0 = r5
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r10 = r5.scroll(r13, r4, r0)
            if (r10 != r1) goto L5a
            return r1
        L5a:
            r10 = r5
        L5b:
            float r11 = r8.element
            long r10 = r10.m516toOffsettuRUvjQ(r11)
            androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m2257boximpl(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.m496semanticsScrollByd4ec7I(androidx.compose.foundation.gestures.ScrollingLogic, long, j00.c):java.lang.Object");
    }

    @Stable
    @k
    public static final Modifier scrollable(@k Modifier modifier, @k ScrollableState scrollableState, @k Orientation orientation, @m80.l OverscrollEffect overscrollEffect, boolean z11, boolean z12, @m80.l FlingBehavior flingBehavior, @m80.l MutableInteractionSource mutableInteractionSource, @m80.l BringIntoViewSpec bringIntoViewSpec) {
        return modifier.then(new ScrollableElement(scrollableState, orientation, overscrollEffect, z11, z12, flingBehavior, mutableInteractionSource, bringIntoViewSpec));
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z11, boolean z12, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, int i11, Object obj) {
        BringIntoViewSpec bringIntoViewSpec2;
        Modifier modifier2;
        ScrollableState scrollableState2;
        Orientation orientation2;
        OverscrollEffect overscrollEffect2;
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        boolean z14 = (i11 & 16) != 0 ? false : z12;
        FlingBehavior flingBehavior2 = (i11 & 32) != 0 ? null : flingBehavior;
        MutableInteractionSource mutableInteractionSource2 = (i11 & 64) != 0 ? null : mutableInteractionSource;
        if ((i11 & 128) != 0) {
            bringIntoViewSpec2 = null;
            modifier2 = modifier;
            orientation2 = orientation;
            overscrollEffect2 = overscrollEffect;
            scrollableState2 = scrollableState;
        } else {
            bringIntoViewSpec2 = bringIntoViewSpec;
            modifier2 = modifier;
            scrollableState2 = scrollableState;
            orientation2 = orientation;
            overscrollEffect2 = overscrollEffect;
        }
        return scrollable(modifier2, scrollableState2, orientation2, overscrollEffect2, z13, z14, flingBehavior2, mutableInteractionSource2, bringIntoViewSpec2);
    }
}
