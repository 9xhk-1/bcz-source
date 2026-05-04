package androidx.compose.foundation.pager;

import a00.h0;
import a00.l1;
import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import c40.s0;
import g10.u;
import j00.c;
import java.util.Map;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,994:1\n897#1,4:1006\n897#1,4:1014\n897#1,4:1018\n1247#2,6:995\n1#3:1001\n54#4:1002\n59#4:1004\n54#4:1010\n59#4:1012\n85#5:1003\n90#5:1005\n85#5:1011\n90#5:1013\n113#6:1022\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n928#1:1006,4\n974#1:1014,4\n985#1:1018,4\n89#1:995,6\n908#1:1002\n908#1:1004\n938#1:1010\n938#1:1012\n908#1:1003\n908#1:1005\n938#1:1011\n938#1:1013\n854#1:1022\n*E\n"})
/* loaded from: classes.dex */
public final class PagerStateKt {
    private static final int MaxPagesForAnimateScroll = 3;
    public static final int PagesToPrefetch = 1;
    private static final float DefaultPositionThreshold = Dp.m5115constructorimpl(56);

    @k
    private static final PagerMeasureResult EmptyLayoutInfo = new PagerMeasureResult(h0.J(), 0, 0, 0, Orientation.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, SnapPosition.Start.INSTANCE, new MeasureResult() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1
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
    }, false, null, null, s0.a(EmptyCoroutineContext.INSTANCE), 393216, null);

    @k
    private static final PagerStateKt$UnitDensity$1 UnitDensity = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
        private final float density = 1.0f;
        private final float fontScale = 1.0f;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }
    };

    @k
    public static final PagerState PagerState(int i11, @FloatRange(from = -0.5d, to = 0.5d) float f11, @k a<Integer> aVar) {
        return new DefaultPagerState(i11, f11, aVar);
    }

    public static /* synthetic */ PagerState PagerState$default(int i11, float f11, a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            f11 = 0.0f;
        }
        return PagerState(i11, f11, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateScrollToPage(final LazyLayoutScrollScope lazyLayoutScrollScope, int i11, float f11, AnimationSpec<Float> animationSpec, p<? super ScrollScope, ? super Integer, g2> pVar, c<? super g2> cVar) {
        pVar.invoke(lazyLayoutScrollScope, l00.a.f(i11));
        boolean z11 = i11 > lazyLayoutScrollScope.getFirstVisibleItemIndex();
        int lastVisibleItemIndex = (lazyLayoutScrollScope.getLastVisibleItemIndex() - lazyLayoutScrollScope.getFirstVisibleItemIndex()) + 1;
        if (((z11 && i11 > lazyLayoutScrollScope.getLastVisibleItemIndex()) || (!z11 && i11 < lazyLayoutScrollScope.getFirstVisibleItemIndex())) && Math.abs(i11 - lazyLayoutScrollScope.getFirstVisibleItemIndex()) >= 3) {
            lazyLayoutScrollScope.snapToItem(z11 ? u.u(i11 - lastVisibleItemIndex, lazyLayoutScrollScope.getFirstVisibleItemIndex()) : u.B(lastVisibleItemIndex + i11, lazyLayoutScrollScope.getFirstVisibleItemIndex()), 0);
        }
        float calculateDistanceTo$default = LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope, i11, 0, 2, null) + f11;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        Object animate$default = SuspendAnimationKt.animate$default(0.0f, calculateDistanceTo$default, 0.0f, animationSpec, new p<Float, Float, g2>() { // from class: androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(Float f12, Float f13) {
                invoke(f12.floatValue(), f13.floatValue());
                return g2.f100423a;
            }

            public final void invoke(float f12, float f13) {
                Ref.FloatRef.this.element += lazyLayoutScrollScope.scrollBy(f12 - Ref.FloatRef.this.element);
            }
        }, cVar, 4, null);
        return animate$default == b.l() ? animate$default : g2.f100423a;
    }

    @l
    public static final Object animateToNextPage(@k PagerState pagerState, @k c<? super g2> cVar) {
        if (pagerState.getCurrentPage() + 1 >= pagerState.getPageCount()) {
            return g2.f100423a;
        }
        Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, cVar, 6, null);
        return animateScrollToPage$default == b.l() ? animateScrollToPage$default : g2.f100423a;
    }

    @l
    public static final Object animateToPreviousPage(@k PagerState pagerState, @k c<? super g2> cVar) {
        if (pagerState.getCurrentPage() - 1 < 0) {
            return g2.f100423a;
        }
        Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, null, cVar, 6, null);
        return animateScrollToPage$default == b.l() ? animateScrollToPage$default : g2.f100423a;
    }

    public static final long calculateNewMaxScrollOffset(@k PagerLayoutInfo pagerLayoutInfo, int i11) {
        long pageSpacing = (((i11 * (pagerLayoutInfo.getPageSpacing() + pagerLayoutInfo.getPageSize())) + pagerLayoutInfo.getBeforeContentPadding()) + pagerLayoutInfo.getAfterContentPadding()) - pagerLayoutInfo.getPageSpacing();
        int mo974getViewportSizeYbymL2g = (int) (pagerLayoutInfo.getOrientation() == Orientation.Horizontal ? pagerLayoutInfo.mo974getViewportSizeYbymL2g() >> 32 : pagerLayoutInfo.mo974getViewportSizeYbymL2g() & 4294967295L);
        return u.v(pageSpacing - (mo974getViewportSizeYbymL2g - u.I(pagerLayoutInfo.getSnapPosition().position(mo974getViewportSizeYbymL2g, pagerLayoutInfo.getPageSize(), pagerLayoutInfo.getBeforeContentPadding(), pagerLayoutInfo.getAfterContentPadding(), i11 - 1, i11), 0, mo974getViewportSizeYbymL2g)), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long calculateNewMinScrollOffset(PagerMeasureResult pagerMeasureResult, int i11) {
        int mo974getViewportSizeYbymL2g = (int) (pagerMeasureResult.getOrientation() == Orientation.Horizontal ? pagerMeasureResult.mo974getViewportSizeYbymL2g() >> 32 : pagerMeasureResult.mo974getViewportSizeYbymL2g() & 4294967295L);
        return u.I(pagerMeasureResult.getSnapPosition().position(mo974getViewportSizeYbymL2g, pagerMeasureResult.getPageSize(), pagerMeasureResult.getBeforeContentPadding(), pagerMeasureResult.getAfterContentPadding(), 0, i11), 0, mo974getViewportSizeYbymL2g);
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    @k
    public static final PagerMeasureResult getEmptyLayoutInfo() {
        return EmptyLayoutInfo;
    }

    @Composable
    @k
    public static final PagerState rememberPagerState(final int i11, @FloatRange(from = -0.5d, to = 0.5d) final float f11, @k final a<Integer> aVar, @l Composer composer, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            f11 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210768637, i12, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:87)");
        }
        Object[] objArr = new Object[0];
        Saver<DefaultPagerState, ?> saver = DefaultPagerState.Companion.getSaver();
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && composer.changed(i11)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(f11)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && composer.changed(aVar)) || (i12 & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a<DefaultPagerState>() { // from class: androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final DefaultPagerState invoke() {
                    return new DefaultPagerState(i11, f11, aVar);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        DefaultPagerState defaultPagerState = (DefaultPagerState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) saver, (String) null, (a) rememberedValue, composer, 0, 4);
        defaultPagerState.getPageCountState().setValue(aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultPagerState;
    }

    private static final void debugLog(a<String> aVar) {
    }
}
