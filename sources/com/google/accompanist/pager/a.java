package com.google.accompanist.pager;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a implements NestedScrollConnection {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30371a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30372b;

    public a(boolean z11, boolean z12) {
        this.f30371a = z11;
        this.f30372b = z12;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @l
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo497onPostFlingRZ2iAVY(long j11, long j12, @k j00.c<? super Velocity> cVar) {
        long h11;
        h11 = Pager.h(j12, this.f30371a, this.f30372b);
        return Velocity.m5344boximpl(h11);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo498onPostScrollDzOQY0M(long j11, long j12, int i11) {
        long g11;
        if (!NestedScrollSource.m3613equalsimpl0(i11, NestedScrollSource.Companion.m3622getFlingWNlRxjI())) {
            return Offset.Companion.m2284getZeroF1C5BW0();
        }
        g11 = Pager.g(j12, this.f30371a, this.f30372b);
        return g11;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @l
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo803onPreFlingQWom1Mo(long j11, @k j00.c<? super Velocity> cVar) {
        return NestedScrollConnection.DefaultImpls.m3604onPreFlingQWom1Mo(this, j11, cVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo804onPreScrollOzD1aCk(long j11, int i11) {
        return NestedScrollConnection.DefaultImpls.m3605onPreScrollOzD1aCk(this, j11, i11);
    }
}
