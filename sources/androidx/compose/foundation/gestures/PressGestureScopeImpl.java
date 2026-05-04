package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import m80.k;
import n40.a;
import n40.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    public static final int $stable = 0;
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;

    @k
    private final a mutex = g.a(false);

    public PressGestureScopeImpl(@k Density density) {
        this.$$delegate_0 = density;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitRelease(@m80.k j00.c<? super yz.g2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            r0.label = r3
            java.lang.Object r5 = r4.tryAwaitRelease(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            yz.g2 r5 = yz.g2.f100423a
            return r5
        L48:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease(j00.c):java.lang.Object");
    }

    public final void cancel() {
        this.isCanceled = true;
        if (this.mutex.isLocked()) {
            a.C0899a.d(this.mutex, null, 1, null);
        }
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public final void release() {
        this.isReleased = true;
        if (this.mutex.isLocked()) {
            a.C0899a.d(this.mutex, null, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reset(@m80.k j00.c<? super yz.g2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.e.n(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.e.n(r5)
            n40.a r5 = r4.mutex
            r0.L$0 = r4
            r0.label = r3
            r2 = 0
            java.lang.Object r5 = n40.a.C0899a.b(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.isReleased = r5
            r0.isCanceled = r5
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.reset(j00.c):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo370roundToPxR2X_6o(long j11) {
        return this.$$delegate_0.mo370roundToPxR2X_6o(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo371roundToPx0680j_4(float f11) {
        return this.$$delegate_0.mo371roundToPx0680j_4(f11);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo372toDpGaN1DYA(long j11) {
        return this.$$delegate_0.mo372toDpGaN1DYA(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo373toDpu2uoSUM(float f11) {
        return this.$$delegate_0.mo373toDpu2uoSUM(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo375toDpSizekrfVVM(long j11) {
        return this.$$delegate_0.mo375toDpSizekrfVVM(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo376toPxR2X_6o(long j11) {
        return this.$$delegate_0.mo376toPxR2X_6o(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo377toPx0680j_4(float f11) {
        return this.$$delegate_0.mo377toPx0680j_4(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @k
    public Rect toRect(@k DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo378toSizeXkaWNTQ(long j11) {
        return this.$$delegate_0.mo378toSizeXkaWNTQ(j11);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo379toSp0xMU5do(float f11) {
        return this.$$delegate_0.mo379toSp0xMU5do(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo380toSpkPz2Gy4(float f11) {
        return this.$$delegate_0.mo380toSpkPz2Gy4(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object tryAwaitRelease(@m80.k j00.c<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.e.n(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.e.n(r6)
            boolean r6 = r5.isReleased
            if (r6 != 0) goto L55
            boolean r6 = r5.isCanceled
            if (r6 != 0) goto L55
            n40.a r6 = r5.mutex
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = n40.a.C0899a.b(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            n40.a r6 = r0.mutex
            n40.a.C0899a.d(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.isReleased
            java.lang.Boolean r6 = l00.a.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease(j00.c):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo374toDpu2uoSUM(int i11) {
        return this.$$delegate_0.mo374toDpu2uoSUM(i11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo381toSpkPz2Gy4(int i11) {
        return this.$$delegate_0.mo381toSpkPz2Gy4(i11);
    }
}
