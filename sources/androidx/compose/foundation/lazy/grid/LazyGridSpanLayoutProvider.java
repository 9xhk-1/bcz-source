package androidx.compose.foundation.lazy.grid;

import a00.h0;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyGridSpanLayoutProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,258:1\n1#2:259\n50#3,5:260\n50#3,5:265\n96#3,5:270\n96#3,5:275\n*S KotlinDebug\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n*L\n122#1:260,5\n151#1:265,5\n185#1:270,5\n197#1:275,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridSpanLayoutProvider {
    public static final int $stable = 8;

    @k
    private final ArrayList<Bucket> buckets;

    @k
    private final List<Integer> cachedBucket;
    private int cachedBucketIndex;

    @k
    private final LazyGridIntervalContent gridContent;
    private int lastLineIndex;
    private int lastLineStartItemIndex;
    private int lastLineStartKnownSpan;

    @k
    private List<GridItemSpan> previousDefaultSpans;
    private int slotsPerLine;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {

        @k
        public static final LazyGridItemSpanScopeImpl INSTANCE = new LazyGridItemSpanScopeImpl();
        private static int maxCurrentLineSpan;
        private static int maxLineSpan;

        private LazyGridItemSpanScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxCurrentLineSpan() {
            return maxCurrentLineSpan;
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxLineSpan() {
            return maxLineSpan;
        }

        public void setMaxCurrentLineSpan(int i11) {
            maxCurrentLineSpan = i11;
        }

        public void setMaxLineSpan(int i11) {
            maxLineSpan = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class LineConfiguration {
        public static final int $stable = 8;
        private final int firstItemIndex;

        @k
        private final List<GridItemSpan> spans;

        public LineConfiguration(int i11, @k List<GridItemSpan> list) {
            this.firstItemIndex = i11;
            this.spans = list;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        @k
        public final List<GridItemSpan> getSpans() {
            return this.spans;
        }
    }

    public LazyGridSpanLayoutProvider(@k LazyGridIntervalContent lazyGridIntervalContent) {
        this.gridContent = lazyGridIntervalContent;
        ArrayList<Bucket> arrayList = new ArrayList<>();
        int i11 = 0;
        arrayList.add(new Bucket(i11, i11, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = h0.J();
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt((getTotalSize() * 1.0d) / this.slotsPerLine)) + 1;
    }

    private final List<GridItemSpan> getDefaultSpans(int i11) {
        if (i11 == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(GridItemSpan.m847boximpl(LazyGridSpanKt.GridItemSpan(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    private final void invalidateCache() {
        this.buckets.clear();
        int i11 = 0;
        this.buckets.add(new Bucket(i11, i11, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5 A[LOOP:1: B:29:0x00d7->B:37:0x00f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9 A[EDGE_INSN: B:38:0x00f9->B:39:0x00f9 BREAK  A[LOOP:1: B:29:0x00d7->B:37:0x00f5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0156 A[LOOP:2: B:61:0x0139->B:69:0x0156, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165 A[EDGE_INSN: B:70:0x0165->B:71:0x0165 BREAK  A[LOOP:2: B:61:0x0139->B:69:0x0156], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009f  */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration getLineConfiguration(int r11) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.getLineConfiguration(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration");
    }

    public final int getLineIndexOfItem(final int i11) {
        int i12 = 0;
        if (getTotalSize() <= 0) {
            return 0;
        }
        if (!(i11 < getTotalSize())) {
            InlineClassHelperKt.throwIllegalArgumentException("ItemIndex > total count");
        }
        if (!this.gridContent.getHasCustomSpans$foundation_release()) {
            return i11 / this.slotsPerLine;
        }
        int z11 = h0.z(this.buckets, 0, 0, new l<Bucket, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Integer invoke(LazyGridSpanLayoutProvider.Bucket bucket) {
                return Integer.valueOf(bucket.getFirstItemIndex() - i11);
            }
        }, 3, null);
        int i13 = 2;
        if (z11 < 0) {
            z11 = (-z11) - 2;
        }
        int bucketSize = getBucketSize() * z11;
        int firstItemIndex = this.buckets.get(z11).getFirstItemIndex();
        if (!(firstItemIndex <= i11)) {
            InlineClassHelperKt.throwIllegalArgumentException("currentItemIndex > itemIndex");
        }
        int i14 = 0;
        while (firstItemIndex < i11) {
            int i15 = firstItemIndex + 1;
            int spanOf = spanOf(firstItemIndex, this.slotsPerLine - i14);
            i14 += spanOf;
            int i16 = this.slotsPerLine;
            if (i14 >= i16) {
                if (i14 == i16) {
                    bucketSize++;
                    i14 = 0;
                } else {
                    bucketSize++;
                    i14 = spanOf;
                }
            }
            if (bucketSize % getBucketSize() == 0 && bucketSize / getBucketSize() >= this.buckets.size()) {
                this.buckets.add(new Bucket(i15 - (i14 > 0 ? 1 : 0), i12, i13, null));
            }
            firstItemIndex = i15;
        }
        return i14 + spanOf(i11, this.slotsPerLine - i14) > this.slotsPerLine ? bucketSize + 1 : bucketSize;
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int getTotalSize() {
        return this.gridContent.getIntervals().getSize();
    }

    public final void setSlotsPerLine(int i11) {
        if (i11 != this.slotsPerLine) {
            this.slotsPerLine = i11;
            invalidateCache();
        }
    }

    public final int spanOf(int i11, int i12) {
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.INSTANCE;
        lazyGridItemSpanScopeImpl.setMaxCurrentLineSpan(i12);
        lazyGridItemSpanScopeImpl.setMaxLineSpan(this.slotsPerLine);
        IntervalList.Interval<LazyGridInterval> interval = this.gridContent.getIntervals().get(i11);
        return GridItemSpan.m851getCurrentLineSpanimpl(interval.getValue().getSpan().invoke(lazyGridItemSpanScopeImpl, Integer.valueOf(i11 - interval.getStartIndex())).m854unboximpl());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Bucket {
        private final int firstItemIndex;
        private final int firstItemKnownSpan;

        public Bucket(int i11, int i12) {
            this.firstItemIndex = i11;
            this.firstItemKnownSpan = i12;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public /* synthetic */ Bucket(int i11, int i12, int i13, v vVar) {
            this(i11, (i13 & 2) != 0 ? 0 : i12);
        }
    }
}
