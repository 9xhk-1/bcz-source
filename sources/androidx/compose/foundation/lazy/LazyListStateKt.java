package androidx.compose.foundation.lazy;

import a00.h0;
import a00.l1;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DensityKt;
import c40.s0;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,603:1\n1247#2,6:604\n1247#2,6:610\n1247#2,6:616\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n*L\n76#1:604,6\n98#1:610,6\n100#1:616,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListStateKt {

    @k
    private static final LazyListMeasureResult EmptyLazyListMeasureResult;
    private static final int NumberOfItemsToTeleport = 100;

    static {
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$EmptyLazyListMeasureResult$1
            private final Map<AlignmentLine, Integer> alignmentLines = l1.z();
            private final int height;
            private final int width;

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }
        };
        List J = h0.J();
        Orientation orientation = Orientation.Vertical;
        int i11 = 0;
        boolean z11 = false;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z12 = false;
        EmptyLazyListMeasureResult = new LazyListMeasureResult(null, i11, z11, f11, measureResult, f12, z12, s0.a(EmptyCoroutineContext.INSTANCE), DensityKt.Density$default(1.0f, 0.0f, 2, null), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), J, 0, 0, 0, false, orientation, 0, 0, null);
    }

    @Composable
    @k
    public static final LazyListState rememberLazyListState(final int i11, final int i12, @l Composer composer, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i11 = 0;
        }
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1470655220, i13, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:74)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyListState, ?> saver = LazyListState.Companion.getSaver();
        boolean z11 = ((((i13 & 14) ^ 6) > 4 && composer.changed(i11)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && composer.changed(i12)) || (i13 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a<LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final LazyListState invoke() {
                    return new LazyListState(i11, i12);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) saver, (String) null, (a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListState;
    }

    @Composable
    @ExperimentalFoundationApi
    @k
    public static final LazyListState rememberLazyListState(int i11, int i12, @l LazyListPrefetchStrategy lazyListPrefetchStrategy, @l Composer composer, int i13, int i14) {
        final LazyListPrefetchStrategy lazyListPrefetchStrategy2;
        final int i15 = (i14 & 1) != 0 ? 0 : i11;
        final int i16 = (i14 & 2) != 0 ? 0 : i12;
        if ((i14 & 4) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null);
                composer.updateRememberedValue(rememberedValue);
            }
            lazyListPrefetchStrategy2 = (LazyListPrefetchStrategy) rememberedValue;
        } else {
            lazyListPrefetchStrategy2 = lazyListPrefetchStrategy;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1287535208, i13, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:98)");
        }
        Object[] objArr = {lazyListPrefetchStrategy2};
        Saver<LazyListState, ?> saver$foundation_release = LazyListState.Companion.saver$foundation_release(lazyListPrefetchStrategy2);
        boolean z11 = ((((i13 & 14) ^ 6) > 4 && composer.changed(i15)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && composer.changed(i16)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && composer.changedInstance(lazyListPrefetchStrategy2)) || (i13 & 384) == 256);
        Object rememberedValue2 = composer.rememberedValue();
        if (z11 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new a<LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final LazyListState invoke() {
                    return new LazyListState(i15, i16, lazyListPrefetchStrategy2);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) saver$foundation_release, (String) null, (a) rememberedValue2, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListState;
    }
}
