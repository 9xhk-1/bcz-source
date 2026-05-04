package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import h10.o;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyStaggeredGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,102:1\n1247#2,6:103\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n*L\n42#1:103,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridItemProviderKt {
    @Composable
    @k
    public static final a<LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda(@k final LazyStaggeredGridState lazyStaggeredGridState, @k l<? super LazyStaggeredGridScope, g2> lVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(690901732, i11, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProviderLambda (LazyStaggeredGridItemProvider.kt:39)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, (i11 >> 3) & 14);
        boolean z11 = (((i11 & 14) ^ 6) > 4 && composer.changed(lazyStaggeredGridState)) || (i11 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new a<LazyStaggeredGridIntervalContent>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final LazyStaggeredGridIntervalContent invoke() {
                    return new LazyStaggeredGridIntervalContent(rememberUpdatedState.getValue());
                }
            });
            final State derivedStateOf2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new a<LazyStaggeredGridItemProviderImpl>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final LazyStaggeredGridItemProviderImpl invoke() {
                    LazyStaggeredGridIntervalContent value = derivedStateOf.getValue();
                    return new LazyStaggeredGridItemProviderImpl(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap(lazyStaggeredGridState.getNearestRange$foundation_release(), value));
                }
            });
            rememberedValue = new PropertyReference0Impl(derivedStateOf2) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, h10.o
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        o oVar = (o) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return oVar;
    }
}
