package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.q;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyStaggeredGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridIntervalContent.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridIntervalContent extends LazyLayoutIntervalContent<LazyStaggeredGridInterval> implements LazyStaggeredGridScope {
    public static final int $stable = 8;

    @k
    private final MutableIntervalList<LazyStaggeredGridInterval> intervals = new MutableIntervalList<>();

    @k
    private final LazyStaggeredGridSpanProvider spanProvider = new LazyStaggeredGridSpanProvider(getIntervals());

    public LazyStaggeredGridIntervalContent(@k l<? super LazyStaggeredGridScope, g2> lVar) {
        lVar.invoke(this);
    }

    @k
    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void item(@m80.l final Object obj, @m80.l final Object obj2, @m80.l final StaggeredGridItemSpan staggeredGridItemSpan, @k final q<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, g2> qVar) {
        items(1, obj != null ? new l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$item$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object invoke(int i11) {
                return obj;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        } : null, new l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$item$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i11) {
                return obj2;
            }
        }, staggeredGridItemSpan != null ? new l<Integer, StaggeredGridItemSpan>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$item$3$1
            {
                super(1);
            }

            public final StaggeredGridItemSpan invoke(int i11) {
                return StaggeredGridItemSpan.this;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ StaggeredGridItemSpan invoke(Integer num) {
                return invoke(num.intValue());
            }
        } : null, ComposableLambdaKt.composableLambdaInstance(657818596, true, new r<LazyStaggeredGridItemScope, Integer, Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$item$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i11, Composer composer, int i12) {
                if ((i12 & 6) == 0) {
                    i12 |= composer.changed(lazyStaggeredGridItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i12 & 131) != 130, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(657818596, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.<anonymous> (LazyStaggeredGridIntervalContent.kt:44)");
                }
                qVar.invoke(lazyStaggeredGridItemScope, composer, Integer.valueOf(i12 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void items(int i11, @m80.l l<? super Integer, ? extends Object> lVar, @k l<? super Integer, ? extends Object> lVar2, @m80.l l<? super Integer, StaggeredGridItemSpan> lVar3, @k r<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar) {
        getIntervals().addInterval(i11, new LazyStaggeredGridInterval(lVar, lVar2, lVar3, rVar));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @k
    public IntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }
}
