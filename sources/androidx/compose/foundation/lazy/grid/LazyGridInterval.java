package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;
import x00.p;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LazyGridInterval implements LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;

    @k
    private final r<LazyGridItemScope, Integer, Composer, Integer, g2> item;

    @l
    private final x00.l<Integer, Object> key;

    @k
    private final p<LazyGridItemSpanScope, Integer, GridItemSpan> span;

    @k
    private final x00.l<Integer, Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridInterval(@l x00.l<? super Integer, ? extends Object> lVar, @k p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> pVar, @k x00.l<? super Integer, ? extends Object> lVar2, @k r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar) {
        this.key = lVar;
        this.span = pVar;
        this.type = lVar2;
        this.item = rVar;
    }

    @k
    public final r<LazyGridItemScope, Integer, Composer, Integer, g2> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    @l
    public x00.l<Integer, Object> getKey() {
        return this.key;
    }

    @k
    public final p<LazyGridItemSpanScope, Integer, GridItemSpan> getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    @k
    public x00.l<Integer, Object> getType() {
        return this.type;
    }
}
