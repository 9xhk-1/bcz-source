package androidx.compose.foundation.pager;

import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nPagerSnapDistance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n+ 2 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceKt\n*L\n1#1,111:1\n107#2,4:112\n*S KotlinDebug\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n*L\n80#1:112,4\n*E\n"})
/* loaded from: classes.dex */
public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {
    public static final int $stable = 0;
    private final int pagesLimit;

    public PagerSnapDistanceMaxPages(int i11) {
        this.pagesLimit = i11;
    }

    @Override // androidx.compose.foundation.pager.PagerSnapDistance
    public int calculateTargetPage(int i11, int i12, float f11, int i13, int i14) {
        long j11 = i11;
        return u.I(i12, (int) u.v(j11 - this.pagesLimit, 0L), (int) u.C(j11 + this.pagesLimit, SieveCacheKt.NodeLinkMask));
    }

    public boolean equals(@l Object obj) {
        return (obj instanceof PagerSnapDistanceMaxPages) && this.pagesLimit == ((PagerSnapDistanceMaxPages) obj).pagesLimit;
    }

    public int hashCode() {
        return Integer.hashCode(this.pagesLimit);
    }
}
