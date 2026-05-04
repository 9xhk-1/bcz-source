package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import m80.k;
import m80.l;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class PagerLayoutIntervalContent extends LazyLayoutIntervalContent<PagerIntervalContent> {

    @k
    private final IntervalList<PagerIntervalContent> intervals;

    @l
    private final x00.l<Integer, Object> key;

    @k
    private final r<PagerScope, Integer, Composer, Integer, g2> pageContent;
    private final int pageCount;

    /* JADX WARN: Multi-variable type inference failed */
    public PagerLayoutIntervalContent(@k r<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar, @l x00.l<? super Integer, ? extends Object> lVar, int i11) {
        this.pageContent = rVar;
        this.key = lVar;
        this.pageCount = i11;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.addInterval(i11, new PagerIntervalContent(lVar, rVar));
        this.intervals = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @k
    public IntervalList<PagerIntervalContent> getIntervals() {
        return this.intervals;
    }

    @l
    public final x00.l<Integer, Object> getKey() {
        return this.key;
    }

    @k
    public final r<PagerScope, Integer, Composer, Integer, g2> getPageContent() {
        return this.pageContent;
    }

    public final int getPageCount() {
        return this.pageCount;
    }
}
