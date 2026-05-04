package androidx.compose.ui.scrollcapture;

import g10.u;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nComposeScrollCaptureCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeScrollCaptureCallback.android.kt\nandroidx/compose/ui/scrollcapture/RelativeScroller\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"})
/* loaded from: classes2.dex */
final class RelativeScroller {
    private float scrollAmount;

    @k
    private final p<Float, j00.c<? super Float>, Object> scrollBy;
    private final int viewportSize;

    /* JADX WARN: Multi-variable type inference failed */
    public RelativeScroller(int i11, @k p<? super Float, ? super j00.c<? super Float>, ? extends Object> pVar) {
        this.viewportSize = i11;
        this.scrollBy = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object scrollBy(float r5, j00.c<? super yz.g2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = (androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = new androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.scrollcapture.RelativeScroller r5 = (androidx.compose.ui.scrollcapture.RelativeScroller) r5
            kotlin.e.n(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            x00.p<java.lang.Float, j00.c<? super java.lang.Float>, java.lang.Object> r6 = r4.scrollBy
            java.lang.Float r5 = l00.a.e(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.scrollAmount
            float r0 = r0 + r6
            r5.scrollAmount = r0
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.RelativeScroller.scrollBy(float, j00.c):java.lang.Object");
    }

    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int mapOffsetToViewport(int i11) {
        return u.I(i11 - c10.d.L0(this.scrollAmount), 0, this.viewportSize);
    }

    public final void reset() {
        this.scrollAmount = 0.0f;
    }

    @l
    public final Object scrollRangeIntoView(int i11, int i12, @k j00.c<? super g2> cVar) {
        if (i11 > i12) {
            throw new IllegalArgumentException(("Expected min=" + i11 + " ≤ max=" + i12).toString());
        }
        int i13 = i12 - i11;
        int i14 = this.viewportSize;
        if (i13 > i14) {
            throw new IllegalArgumentException(("Expected range (" + i13 + ") to be ≤ viewportSize=" + this.viewportSize).toString());
        }
        float f11 = i11;
        float f12 = this.scrollAmount;
        if (f11 >= f12 && i12 <= i14 + f12) {
            return g2.f100423a;
        }
        if (f11 >= f12) {
            i11 = i12 - i14;
        }
        Object scrollTo = scrollTo(i11, cVar);
        return scrollTo == kotlin.coroutines.intrinsics.b.l() ? scrollTo : g2.f100423a;
    }

    @l
    public final Object scrollTo(float f11, @k j00.c<? super g2> cVar) {
        Object scrollBy = scrollBy(f11 - this.scrollAmount, cVar);
        return scrollBy == kotlin.coroutines.intrinsics.b.l() ? scrollBy : g2.f100423a;
    }
}
