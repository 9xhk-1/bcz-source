package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class BringIntoViewSpec_androidKt {

    @k
    private static final ProvidableCompositionLocal<BringIntoViewSpec> LocalBringIntoViewSpec = CompositionLocalKt.compositionLocalWithComputedDefaultOf(new l<CompositionLocalAccessorScope, BringIntoViewSpec>() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1
        @Override // x00.l
        public final BringIntoViewSpec invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
            return !((Context) compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext())).getPackageManager().hasSystemFeature("android.software.leanback") ? BringIntoViewSpec.Companion.getDefaultBringIntoViewSpec$foundation_release() : BringIntoViewSpec_androidKt.getPivotBringIntoViewSpec();
        }
    });

    @k
    private static final BringIntoViewSpec PivotBringIntoViewSpec = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1
        private final float childFraction;
        private final float parentFraction = 0.3f;

        @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
        public float calculateScrollDistance(float f11, float f12, float f13) {
            float abs = Math.abs((f12 + f11) - f11);
            boolean z11 = abs <= f13;
            float f14 = (this.parentFraction * f13) - (this.childFraction * abs);
            float f15 = f13 - f14;
            if (z11 && f15 < abs) {
                f14 = f13 - abs;
            }
            return f11 - f14;
        }

        public final float getChildFraction() {
            return this.childFraction;
        }

        public final float getParentFraction() {
            return this.parentFraction;
        }
    };

    @ExperimentalFoundationApi
    @k
    public static final ProvidableCompositionLocal<BringIntoViewSpec> getLocalBringIntoViewSpec() {
        return LocalBringIntoViewSpec;
    }

    @k
    public static final BringIntoViewSpec getPivotBringIntoViewSpec() {
        return PivotBringIntoViewSpec;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getLocalBringIntoViewSpec$annotations() {
    }

    public static /* synthetic */ void getPivotBringIntoViewSpec$annotations() {
    }
}
