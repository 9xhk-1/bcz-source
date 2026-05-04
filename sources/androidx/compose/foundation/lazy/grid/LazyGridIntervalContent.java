package androidx.compose.foundation.lazy.grid;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridIntervalContent.kt\nandroidx/compose/foundation/lazy/grid/LazyGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/IntListKt\n*L\n1#1,103:1\n1#2:104\n905#3:105\n*S KotlinDebug\n*F\n+ 1 LazyGridIntervalContent.kt\nandroidx/compose/foundation/lazy/grid/LazyGridIntervalContent\n*L\n86#1:105\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {

    @l
    private MutableIntList _headerIndexes;
    private boolean hasCustomSpans;

    @k
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final p<LazyGridItemSpanScope, Integer, GridItemSpan> DefaultSpan = new p<LazyGridItemSpanScope, Integer, GridItemSpan>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$Companion$DefaultSpan$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m847boximpl(m862invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m862invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i11) {
            return LazyGridSpanKt.GridItemSpan(1);
        }
    };

    @k
    private final LazyGridSpanLayoutProvider spanLayoutProvider = new LazyGridSpanLayoutProvider(this);

    @k
    private final MutableIntervalList<LazyGridInterval> intervals = new MutableIntervalList<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final p<LazyGridItemSpanScope, Integer, GridItemSpan> getDefaultSpan() {
            return LazyGridIntervalContent.DefaultSpan;
        }

        private Companion() {
        }
    }

    public LazyGridIntervalContent(@k x00.l<? super LazyGridScope, g2> lVar) {
        lVar.invoke(this);
    }

    public final boolean getHasCustomSpans$foundation_release() {
        return this.hasCustomSpans;
    }

    @k
    public final IntList getHeaderIndexes() {
        MutableIntList mutableIntList = this._headerIndexes;
        return mutableIntList != null ? mutableIntList : IntListKt.emptyIntList();
    }

    @k
    public final LazyGridSpanLayoutProvider getSpanLayoutProvider$foundation_release() {
        return this.spanLayoutProvider;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void item(@l final Object obj, @l final x00.l<? super LazyGridItemSpanScope, GridItemSpan> lVar, @l final Object obj2, @k final q<? super LazyGridItemScope, ? super Composer, ? super Integer, g2> qVar) {
        getIntervals().addInterval(1, new LazyGridInterval(obj != null ? new x00.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$1$1
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
        } : null, lVar != null ? new p<LazyGridItemSpanScope, Integer, GridItemSpan>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
                return GridItemSpan.m847boximpl(m863invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
            }

            /* renamed from: invoke-_-orMbw, reason: not valid java name */
            public final long m863invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i11) {
                return lVar.invoke(lazyGridItemSpanScope).m854unboximpl();
            }
        } : DefaultSpan, new x00.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$3
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
        }, ComposableLambdaKt.composableLambdaInstance(-34608120, true, new r<LazyGridItemScope, Integer, Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(LazyGridItemScope lazyGridItemScope, int i11, Composer composer, int i12) {
                if ((i12 & 6) == 0) {
                    i12 |= composer.changed(lazyGridItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i12 & 131) != 130, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-34608120, i12, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:55)");
                }
                qVar.invoke(lazyGridItemScope, composer, Integer.valueOf(i12 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })));
        if (lVar != null) {
            this.hasCustomSpans = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int i11, @l x00.l<? super Integer, ? extends Object> lVar, @l p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> pVar, @k x00.l<? super Integer, ? extends Object> lVar2, @k r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar) {
        getIntervals().addInterval(i11, new LazyGridInterval(lVar, pVar == null ? DefaultSpan : pVar, lVar2, rVar));
        if (pVar != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void setHasCustomSpans$foundation_release(boolean z11) {
        this.hasCustomSpans = z11;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void stickyHeader(@l Object obj, @l Object obj2, @k final r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar) {
        MutableIntList mutableIntList = this._headerIndexes;
        if (mutableIntList == null) {
            mutableIntList = new MutableIntList(0, 1, null);
            this._headerIndexes = mutableIntList;
        }
        final int size = getIntervals().getSize();
        mutableIntList.add(size);
        item(obj, new x00.l<LazyGridItemSpanScope, GridItemSpan>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$stickyHeader$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope) {
                return GridItemSpan.m847boximpl(m864invokeBHJflc(lazyGridItemSpanScope));
            }

            /* renamed from: invoke-BHJ-flc, reason: not valid java name */
            public final long m864invokeBHJflc(LazyGridItemSpanScope lazyGridItemSpanScope) {
                return LazyGridSpanKt.GridItemSpan(lazyGridItemSpanScope.getMaxLineSpan());
            }
        }, obj2, ComposableLambdaKt.composableLambdaInstance(2045010142, true, new q<LazyGridItemScope, Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$stickyHeader$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
                invoke(lazyGridItemScope, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(LazyGridItemScope lazyGridItemScope, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= composer.changed(lazyGridItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2045010142, i11, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.stickyHeader.<anonymous> (LazyGridIntervalContent.kt:88)");
                }
                rVar.invoke(lazyGridItemScope, Integer.valueOf(size), composer, Integer.valueOf(i11 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @k
    public IntervalList<LazyGridInterval> getIntervals() {
        return this.intervals;
    }
}
