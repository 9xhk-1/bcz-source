package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nNestedScrollInteropConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,233:1\n1#2:234\n65#3:235\n69#3:238\n65#3:241\n69#3:244\n65#3:247\n69#3:250\n60#4:236\n70#4:239\n60#4:242\n70#4:245\n60#4:248\n70#4:251\n22#5:237\n22#5:240\n22#5:243\n22#5:246\n22#5:249\n22#5:252\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnection\n*L\n65#1:235\n66#1:238\n88#1:241\n89#1:244\n90#1:247\n91#1:250\n65#1:236\n66#1:239\n88#1:242\n89#1:245\n90#1:248\n91#1:251\n65#1:237\n66#1:240\n88#1:243\n89#1:246\n90#1:249\n91#1:252\n*E\n"})
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public static final int $stable = 8;

    @m80.k
    private final int[] consumedScrollCache;

    @m80.k
    private final NestedScrollingChildHelper nestedScrollChildHelper;

    @m80.k
    private final View view;

    public NestedScrollInteropConnection(@m80.k View view) {
        this.view = view;
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.nestedScrollChildHelper = nestedScrollingChildHelper;
        this.consumedScrollCache = new int[2];
        ViewCompat.setNestedScrollingEnabled(view, true);
    }

    private final void interruptOngoingScrolls() {
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(0)) {
            this.nestedScrollChildHelper.stopNestedScroll(0);
        }
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(1)) {
            this.nestedScrollChildHelper.stopNestedScroll(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m80.l
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo497onPostFlingRZ2iAVY(long j11, long j12, @m80.k j00.c<? super Velocity> cVar) {
        float viewVelocity;
        float viewVelocity2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5353getXimpl(j12));
        viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5354getYimpl(j12));
        if (!nestedScrollingChildHelper.dispatchNestedFling(viewVelocity, viewVelocity2, true)) {
            j12 = Velocity.Companion.m5364getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m5344boximpl(j12);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo498onPostScrollDzOQY0M(long j11, long j12, int i11) {
        int m4293getScrollAxesk4lQ0M;
        int m4295toViewTypeGyEprt8;
        int m4295toViewTypeGyEprt82;
        long m4294toOffsetUv8p0NA;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m4293getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m4293getScrollAxesk4lQ0M(j12);
        m4295toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m4295toViewTypeGyEprt8(i11);
        if (!nestedScrollingChildHelper.startNestedScroll(m4293getScrollAxesk4lQ0M, m4295toViewTypeGyEprt8)) {
            return Offset.Companion.m2284getZeroF1C5BW0();
        }
        a00.q.T1(this.consumedScrollCache, 0, 0, 0, 6, null);
        NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
        int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j11 >> 32)));
        int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j11 & 4294967295L)));
        int composeToViewOffset3 = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j12 >> 32)));
        int composeToViewOffset4 = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j12 & 4294967295L)));
        m4295toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m4295toViewTypeGyEprt8(i11);
        nestedScrollingChildHelper2.dispatchNestedScroll(composeToViewOffset, composeToViewOffset2, composeToViewOffset3, composeToViewOffset4, null, m4295toViewTypeGyEprt82, this.consumedScrollCache);
        m4294toOffsetUv8p0NA = NestedScrollInteropConnectionKt.m4294toOffsetUv8p0NA(this.consumedScrollCache, j12);
        return m4294toOffsetUv8p0NA;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m80.l
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo803onPreFlingQWom1Mo(long j11, @m80.k j00.c<? super Velocity> cVar) {
        float viewVelocity;
        float viewVelocity2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5353getXimpl(j11));
        viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5354getYimpl(j11));
        if (!nestedScrollingChildHelper.dispatchNestedPreFling(viewVelocity, viewVelocity2)) {
            j11 = Velocity.Companion.m5364getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m5344boximpl(j11);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo804onPreScrollOzD1aCk(long j11, int i11) {
        int m4293getScrollAxesk4lQ0M;
        int m4295toViewTypeGyEprt8;
        int m4295toViewTypeGyEprt82;
        long m4294toOffsetUv8p0NA;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m4293getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m4293getScrollAxesk4lQ0M(j11);
        m4295toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m4295toViewTypeGyEprt8(i11);
        if (!nestedScrollingChildHelper.startNestedScroll(m4293getScrollAxesk4lQ0M, m4295toViewTypeGyEprt8)) {
            return Offset.Companion.m2284getZeroF1C5BW0();
        }
        a00.q.T1(this.consumedScrollCache, 0, 0, 0, 6, null);
        NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
        int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j11 >> 32)));
        int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (4294967295L & j11)));
        int[] iArr = this.consumedScrollCache;
        m4295toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m4295toViewTypeGyEprt8(i11);
        nestedScrollingChildHelper2.dispatchNestedPreScroll(composeToViewOffset, composeToViewOffset2, iArr, null, m4295toViewTypeGyEprt82);
        m4294toOffsetUv8p0NA = NestedScrollInteropConnectionKt.m4294toOffsetUv8p0NA(this.consumedScrollCache, j11);
        return m4294toOffsetUv8p0NA;
    }
}
