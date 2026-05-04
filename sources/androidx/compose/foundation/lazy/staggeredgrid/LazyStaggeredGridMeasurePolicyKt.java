package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,177:1\n1247#2,6:178\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n*L\n52#1:178,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasurePolicyKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z11, LayoutDirection layoutDirection) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i11 == 1) {
            return z11 ? paddingValues.mo678calculateTopPaddingD9Ej5fM() : paddingValues.mo675calculateBottomPaddingD9Ej5fM();
        }
        if (i11 == 2) {
            return z11 ? PaddingKt.calculateStartPadding(paddingValues, layoutDirection) : PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z11, LayoutDirection layoutDirection) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i11 == 1) {
            return z11 ? paddingValues.mo675calculateBottomPaddingD9Ej5fM() : paddingValues.mo678calculateTopPaddingD9Ej5fM();
        }
        if (i11 == 2) {
            return z11 ? PaddingKt.calculateEndPadding(paddingValues, layoutDirection) : PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        if (r26.changed(r3) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d9, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
    
        r1 = (r2 | r4) | r26.changed(r25);
        r2 = r26.rememberedValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
    
        if (r1 != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        if (r2 != androidx.compose.runtime.Composer.Companion.getEmpty()) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        r2 = (x00.p) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0103, code lost:
    
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0105, code lost:
    
        androidx.compose.runtime.ComposerKt.traceEventEnd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f1, code lost:
    
        r9 = r3;
        r6 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1(r16, r20, r9, r17, r18, r19, r21, r23, r25);
        r26.updateRememberedValue(r6);
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
    
        if ((r27 & 100663296) == 67108864) goto L69;
     */
    @androidx.compose.runtime.Composable
    @m80.k
    /* renamed from: rememberStaggeredGridMeasurePolicy-qKj4JfE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final x00.p<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult> m945rememberStaggeredGridMeasurePolicyqKj4JfE(@m80.k final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r16, @m80.k final x00.a<? extends androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider> r17, @m80.k final androidx.compose.foundation.layout.PaddingValues r18, final boolean r19, @m80.k final androidx.compose.foundation.gestures.Orientation r20, final float r21, float r22, @m80.k final c40.r0 r23, @m80.k androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider r24, @m80.k final androidx.compose.ui.graphics.GraphicsContext r25, @m80.l androidx.compose.runtime.Composer r26, int r27) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.m945rememberStaggeredGridMeasurePolicyqKj4JfE(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, x00.a, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.gestures.Orientation, float, float, c40.r0, androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider, androidx.compose.ui.graphics.GraphicsContext, androidx.compose.runtime.Composer, int):x00.p");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i11 == 1) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (i11 == 2) {
            return paddingValues.mo678calculateTopPaddingD9Ej5fM();
        }
        throw new NoWhenBranchMatchedException();
    }
}
