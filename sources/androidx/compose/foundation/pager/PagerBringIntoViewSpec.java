package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import g10.u;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class PagerBringIntoViewSpec implements BringIntoViewSpec {

    @k
    private final BringIntoViewSpec defaultBringIntoViewSpec;

    @k
    private final PagerState pagerState;

    public PagerBringIntoViewSpec(@k PagerState pagerState, @k BringIntoViewSpec bringIntoViewSpec) {
        this.pagerState = pagerState;
        this.defaultBringIntoViewSpec = bringIntoViewSpec;
    }

    private final float overrideProposedOffsetMove(float f11) {
        float firstVisiblePageOffset$foundation_release = this.pagerState.getFirstVisiblePageOffset$foundation_release() * (-1);
        while (f11 > 0.0f && firstVisiblePageOffset$foundation_release < f11) {
            firstVisiblePageOffset$foundation_release += this.pagerState.getPageSizeWithSpacing$foundation_release();
        }
        while (f11 < 0.0f && firstVisiblePageOffset$foundation_release > f11) {
            firstVisiblePageOffset$foundation_release -= this.pagerState.getPageSizeWithSpacing$foundation_release();
        }
        return firstVisiblePageOffset$foundation_release;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public float calculateScrollDistance(float f11, float f12, float f13) {
        float calculateScrollDistance = this.defaultBringIntoViewSpec.calculateScrollDistance(f11, f12, f13);
        boolean z11 = false;
        if (f11 <= 0.0f ? f11 + f12 <= 0.0f : f11 + f12 > f13) {
            z11 = true;
        }
        if (Math.abs(calculateScrollDistance) != 0.0f && z11) {
            return overrideProposedOffsetMove(calculateScrollDistance);
        }
        if (Math.abs(this.pagerState.getFirstVisiblePageOffset$foundation_release()) < 1.0E-6d) {
            return 0.0f;
        }
        float firstVisiblePageOffset$foundation_release = this.pagerState.getFirstVisiblePageOffset$foundation_release() * (-1.0f);
        if (this.pagerState.getLastScrolledForward()) {
            firstVisiblePageOffset$foundation_release += this.pagerState.getPageSizeWithSpacing$foundation_release();
        }
        return u.H(firstVisiblePageOffset$foundation_release, -f13, f13);
    }

    @k
    public final BringIntoViewSpec getDefaultBringIntoViewSpec() {
        return this.defaultBringIntoViewSpec;
    }

    @k
    public final PagerState getPagerState() {
        return this.pagerState;
    }
}
