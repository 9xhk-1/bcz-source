package androidx.compose.foundation.pager;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface PagerSnapDistance {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPagerSnapDistance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistance$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,111:1\n96#2,5:112\n*S KotlinDebug\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistance$Companion\n*L\n59#1:112,5\n*E\n"})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @k
        public final PagerSnapDistance atMost(int i11) {
            if (!(i11 >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("pages should be greater than or equal to 0. You have used " + i11 + '.');
            }
            return new PagerSnapDistanceMaxPages(i11);
        }
    }

    int calculateTargetPage(int i11, int i12, float f11, int i13, int i14);
}
