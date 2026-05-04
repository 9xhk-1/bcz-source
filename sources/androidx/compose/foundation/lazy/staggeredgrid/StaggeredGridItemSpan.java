package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class StaggeredGridItemSpan {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final StaggeredGridItemSpan FullLine = new StaggeredGridItemSpan(0);

    @k
    private static final StaggeredGridItemSpan SingleLane = new StaggeredGridItemSpan(1);
    private final int value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final StaggeredGridItemSpan getFullLine() {
            return StaggeredGridItemSpan.FullLine;
        }

        @k
        public final StaggeredGridItemSpan getSingleLane() {
            return StaggeredGridItemSpan.SingleLane;
        }

        private Companion() {
        }
    }

    private StaggeredGridItemSpan(int i11) {
        this.value = i11;
    }

    public final int getValue$foundation_release() {
        return this.value;
    }
}
