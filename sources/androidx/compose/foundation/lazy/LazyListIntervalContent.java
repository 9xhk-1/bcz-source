package androidx.compose.foundation.lazy;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.foundation.ExperimentalFoundationApi;
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
import m80.l;
import x00.q;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyListIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListIntervalContent.kt\nandroidx/compose/foundation/lazy/LazyListIntervalContent\n+ 2 IntList.kt\nandroidx/collection/IntListKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n905#2:84\n1#3:85\n*S KotlinDebug\n*F\n+ 1 LazyListIntervalContent.kt\nandroidx/compose/foundation/lazy/LazyListIntervalContent\n*L\n70#1:84\n*E\n"})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {
    public static final int $stable = 8;

    @l
    private MutableIntList _headerIndexes;

    @k
    private final MutableIntervalList<LazyListInterval> intervals = new MutableIntervalList<>();

    public LazyListIntervalContent(@k x00.l<? super LazyListScope, g2> lVar) {
        lVar.invoke(this);
    }

    @k
    public final IntList getHeaderIndexes() {
        MutableIntList mutableIntList = this._headerIndexes;
        return mutableIntList != null ? mutableIntList : IntListKt.emptyIntList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(@l final Object obj, @l final Object obj2, @k final q<? super LazyItemScope, ? super Composer, ? super Integer, g2> qVar) {
        getIntervals().addInterval(1, new LazyListInterval(obj != null ? new x00.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i11) {
                return obj;
            }
        } : null, new x00.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$2
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
        }, ComposableLambdaKt.composableLambdaInstance(-1010194746, true, new r<LazyItemScope, Integer, Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, int i11, Composer composer, int i12) {
                if ((i12 & 6) == 0) {
                    i12 |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i12 & 131) != 130, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1010194746, i12, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:59)");
                }
                qVar.invoke(lazyItemScope, composer, Integer.valueOf(i12 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int i11, @l x00.l<? super Integer, ? extends Object> lVar, @k x00.l<? super Integer, ? extends Object> lVar2, @k r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar) {
        getIntervals().addInterval(i11, new LazyListInterval(lVar, lVar2, rVar));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void stickyHeader(@l Object obj, @l Object obj2, @k final r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar) {
        MutableIntList mutableIntList = this._headerIndexes;
        if (mutableIntList == null) {
            mutableIntList = new MutableIntList(0, 1, null);
            this._headerIndexes = mutableIntList;
        }
        mutableIntList.add(getIntervals().getSize());
        final int size = getIntervals().getSize();
        item(obj, obj2, ComposableLambdaKt.composableLambdaInstance(1491981087, true, new q<LazyItemScope, Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$stickyHeader$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1491981087, i11, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.stickyHeader.<anonymous> (LazyListIntervalContent.kt:73)");
                }
                rVar.invoke(lazyItemScope, Integer.valueOf(size), composer, Integer.valueOf(i11 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @k
    public IntervalList<LazyListInterval> getIntervals() {
        return this.intervals;
    }
}
