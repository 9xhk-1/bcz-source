package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import j00.c;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface TargetedFlingBehavior extends FlingBehavior {
    static /* synthetic */ Object performFling$suspendImpl(TargetedFlingBehavior targetedFlingBehavior, ScrollScope scrollScope, float f11, c<? super Float> cVar) {
        l<? super Float, g2> lVar;
        lVar = TargetedFlingBehaviorKt.NoOnReport;
        return targetedFlingBehavior.performFling(scrollScope, f11, lVar, cVar);
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @m80.l
    default Object performFling(@k ScrollScope scrollScope, float f11, @k c<? super Float> cVar) {
        return performFling$suspendImpl(this, scrollScope, f11, cVar);
    }

    @m80.l
    Object performFling(@k ScrollScope scrollScope, float f11, @k l<? super Float, g2> lVar, @k c<? super Float> cVar);
}
