package androidx.compose.foundation.lazy.grid;

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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DensityKt;
import c40.s0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,613:1\n1247#2,6:614\n1247#2,6:620\n1247#2,6:626\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n*L\n76#1:614,6\n98#1:620,6\n100#1:626,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridStateKt {

    @k
    private static final LazyGridMeasureResult EmptyLazyGridLayoutInfo;

    static {
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$EmptyLazyGridLayoutInfo$1
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
        EmptyLazyGridLayoutInfo = new LazyGridMeasureResult(null, 0, false, 0.0f, measureResult, 0.0f, false, s0.a(EmptyCoroutineContext.INSTANCE), DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, new l<Integer, List<? extends Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$EmptyLazyGridLayoutInfo$2
            @Override // x00.l
            public /* bridge */ /* synthetic */ List<? extends Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final List<Pair<Integer, Constraints>> invoke(int i11) {
                return h0.J();
            }
        }, J, 0, 0, 0, false, orientation, 0, 0);
    }

    @Composable
    @k
    public static final LazyGridState rememberLazyGridState(final int i11, final int i12, @m80.l Composer composer, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i11 = 0;
        }
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(29186956, i13, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:74)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyGridState, ?> saver = LazyGridState.Companion.getSaver();
        boolean z11 = ((((i13 & 14) ^ 6) > 4 && composer.changed(i11)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && composer.changed(i12)) || (i13 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a<LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$rememberLazyGridState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final LazyGridState invoke() {
                    return new LazyGridState(i11, i12);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridState lazyGridState = (LazyGridState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) saver, (String) null, (a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridState;
    }

    @Composable
    @ExperimentalFoundationApi
    @k
    public static final LazyGridState rememberLazyGridState(int i11, int i12, @m80.l LazyGridPrefetchStrategy lazyGridPrefetchStrategy, @m80.l Composer composer, int i13, int i14) {
        final LazyGridPrefetchStrategy lazyGridPrefetchStrategy2;
        final int i15 = (i14 & 1) != 0 ? 0 : i11;
        final int i16 = (i14 & 2) != 0 ? 0 : i12;
        if ((i14 & 4) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null);
                composer.updateRememberedValue(rememberedValue);
            }
            lazyGridPrefetchStrategy2 = (LazyGridPrefetchStrategy) rememberedValue;
        } else {
            lazyGridPrefetchStrategy2 = lazyGridPrefetchStrategy;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20335728, i13, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:98)");
        }
        Object[] objArr = {lazyGridPrefetchStrategy2};
        Saver<LazyGridState, ?> saver$foundation_release = LazyGridState.Companion.saver$foundation_release(lazyGridPrefetchStrategy2);
        boolean z11 = ((((i13 & 14) ^ 6) > 4 && composer.changed(i15)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && composer.changed(i16)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && composer.changedInstance(lazyGridPrefetchStrategy2)) || (i13 & 384) == 256);
        Object rememberedValue2 = composer.rememberedValue();
        if (z11 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new a<LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$rememberLazyGridState$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final LazyGridState invoke() {
                    return new LazyGridState(i15, i16, lazyGridPrefetchStrategy2);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        LazyGridState lazyGridState = (LazyGridState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) saver$foundation_release, (String) null, (a) rememberedValue2, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridState;
    }
}
