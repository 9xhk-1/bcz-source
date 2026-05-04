package androidx.compose.material.pullrefresh;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import j00.c;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class PullRefreshNestedScrollConnection implements NestedScrollConnection {
    private final boolean enabled;

    @k
    private final l<Float, Float> onPull;

    @k
    private final p<Float, c<? super Float>, Object> onRelease;

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshNestedScrollConnection(@k l<? super Float, Float> lVar, @k p<? super Float, ? super c<? super Float>, ? extends Object> pVar, boolean z11) {
        this.onPull = lVar;
        this.onRelease = pVar;
        this.enabled = z11;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo498onPostScrollDzOQY0M(long j11, long j12, int i11) {
        return !this.enabled ? Offset.Companion.m2284getZeroF1C5BW0() : (!NestedScrollSource.m3613equalsimpl0(i11, NestedScrollSource.Companion.m3625getUserInputWNlRxjI()) || Offset.m2269getYimpl(j12) <= 0.0f) ? Offset.Companion.m2284getZeroF1C5BW0() : OffsetKt.Offset(0.0f, this.onPull.invoke(Float.valueOf(Offset.m2269getYimpl(j12))).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m80.l
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo803onPreFlingQWom1Mo(long r5, @m80.k j00.c<? super androidx.compose.ui.unit.Velocity> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = (androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = new androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            float r5 = r0.F$0
            kotlin.e.n(r7)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.e.n(r7)
            x00.p<java.lang.Float, j00.c<? super java.lang.Float>, java.lang.Object> r7 = r4.onRelease
            float r5 = androidx.compose.ui.unit.Velocity.m5354getYimpl(r5)
            java.lang.Float r5 = l00.a.e(r5)
            r6 = 0
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = r6
        L4d:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = androidx.compose.ui.unit.VelocityKt.Velocity(r5, r6)
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.m5344boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection.mo803onPreFlingQWom1Mo(long, j00.c):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo804onPreScrollOzD1aCk(long j11, int i11) {
        return !this.enabled ? Offset.Companion.m2284getZeroF1C5BW0() : (!NestedScrollSource.m3613equalsimpl0(i11, NestedScrollSource.Companion.m3625getUserInputWNlRxjI()) || Offset.m2269getYimpl(j11) >= 0.0f) ? Offset.Companion.m2284getZeroF1C5BW0() : OffsetKt.Offset(0.0f, this.onPull.invoke(Float.valueOf(Offset.m2269getYimpl(j11))).floatValue());
    }
}
