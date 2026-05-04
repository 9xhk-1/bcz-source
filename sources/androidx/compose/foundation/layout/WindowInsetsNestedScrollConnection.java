package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import c40.l2;
import c40.n;
import c40.p;
import g10.u;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
@u0({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,708:1\n314#2,11:709\n65#3:720\n69#3:723\n65#3:725\n69#3:728\n60#4:721\n70#4:724\n60#4:726\n70#4:729\n22#5:722\n22#5:727\n26#5:730\n26#5:731\n26#5:732\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n*L\n202#1:709,11\n209#1:720\n209#1:723\n216#1:725\n216#1:728\n209#1:721\n209#1:724\n216#1:726\n216#1:729\n209#1:722\n216#1:727\n256#1:730\n257#1:731\n370#1:732\n*E\n"})
/* loaded from: classes.dex */
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {

    @l
    private WindowInsetsAnimationController animationController;

    @l
    private l2 animationJob;

    @m80.k
    private final CancellationSignal cancellationSignal = new CancellationSignal();

    @l
    private n<? super WindowInsetsAnimationController> continuation;

    @m80.k
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;

    @m80.k
    private final SideCalculator sideCalculator;

    @m80.k
    private final View view;

    @m80.k
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(@m80.k AndroidWindowInsets androidWindowInsets, @m80.k View view, @m80.k SideCalculator sideCalculator, @m80.k Density density) {
        this.windowInsets = androidWindowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float f11) {
        Insets currentInsets;
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, Math.round(f11)), 1.0f, 0.0f);
        }
    }

    private final void animationEnded() {
        boolean isReady;
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null) {
            isReady = windowInsetsAnimationController2.isReady();
            if (isReady && (windowInsetsAnimationController = this.animationController) != null) {
                windowInsetsAnimationController.finish(this.windowInsets.isVisible());
            }
        }
        this.animationController = null;
        n<? super WindowInsetsAnimationController> nVar = this.continuation;
        if (nVar != null) {
            nVar.x(null, new x00.l<Throwable, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$animationEnded$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                    invoke2(th2);
                    return g2.f100423a;
                }
            });
        }
        this.continuation = null;
        l2 l2Var = this.animationJob;
        if (l2Var != null) {
            l2Var.cancel(new WindowInsetsAnimationCancelledException());
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m801flinghuYlsQE(long r26, float r28, boolean r29, j00.c<? super androidx.compose.ui.unit.Velocity> r30) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.m801flinghuYlsQE(long, float, boolean, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(j00.c<? super WindowInsetsAnimationController> cVar) {
        Object obj = this.animationController;
        if (obj == null) {
            p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
            pVar.y();
            this.continuation = pVar;
            requestAnimationController();
            obj = pVar.F();
            if (obj == kotlin.coroutines.intrinsics.b.l()) {
                l00.f.c(cVar);
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        WindowInsetsController windowInsetsController;
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType$foundation_layout_release(), -1L, null, this.cancellationSignal, e.a(this));
        }
    }

    /* renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m802scroll8S9VItk(long j11, float f11) {
        Insets hiddenStateInsets;
        Insets shownStateInsets;
        Insets currentInsets;
        l2 l2Var = this.animationJob;
        if (l2Var != null) {
            l2Var.cancel(new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (f11 != 0.0f) {
            if (this.windowInsets.isVisible() != (f11 > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo754consumedOffsetsMKHz9U(j11);
                }
                SideCalculator sideCalculator = this.sideCalculator;
                hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                int valueOf = sideCalculator.valueOf(hiddenStateInsets);
                SideCalculator sideCalculator2 = this.sideCalculator;
                shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                int valueOf2 = sideCalculator2.valueOf(shownStateInsets);
                currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int valueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (valueOf3 == (f11 > 0.0f ? valueOf2 : valueOf)) {
                    this.partialConsumption = 0.0f;
                    return Offset.Companion.m2284getZeroF1C5BW0();
                }
                float f12 = valueOf3 + f11 + this.partialConsumption;
                int I = u.I(Math.round(f12), valueOf, valueOf2);
                this.partialConsumption = f12 - Math.round(f12);
                if (I != valueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, I), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo754consumedOffsetsMKHz9U(j11);
            }
        }
        return Offset.Companion.m2284getZeroF1C5BW0();
    }

    public final void dispose() {
        Insets currentInsets;
        Insets hiddenStateInsets;
        n<? super WindowInsetsAnimationController> nVar = this.continuation;
        if (nVar != null) {
            nVar.x(null, new x00.l<Throwable, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$dispose$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                    invoke2(th2);
                    return g2.f100423a;
                }
            });
        }
        l2 l2Var = this.animationJob;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
            windowInsetsAnimationController.finish(!g0.g(currentInsets, hiddenStateInsets));
        }
    }

    @m80.k
    public final Density getDensity() {
        return this.density;
    }

    @m80.k
    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    @m80.k
    public final View getView() {
        return this.view;
    }

    @m80.k
    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public void onCancelled(@l WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    public void onFinished(@m80.k WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @l
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo497onPostFlingRZ2iAVY(long j11, long j12, @m80.k j00.c<? super Velocity> cVar) {
        return m801flinghuYlsQE(j12, this.sideCalculator.showMotion(Velocity.m5353getXimpl(j12), Velocity.m5354getYimpl(j12)), true, cVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo498onPostScrollDzOQY0M(long j11, long j12, int i11) {
        return m802scroll8S9VItk(j12, this.sideCalculator.showMotion(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (4294967295L & j12))));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @l
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object mo803onPreFlingQWom1Mo(long j11, @m80.k j00.c<? super Velocity> cVar) {
        return m801flinghuYlsQE(j11, this.sideCalculator.hideMotion(Velocity.m5353getXimpl(j11), Velocity.m5354getYimpl(j11)), false, cVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo804onPreScrollOzD1aCk(long j11, int i11) {
        return m802scroll8S9VItk(j11, this.sideCalculator.hideMotion(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (4294967295L & j11))));
    }

    public void onReady(@m80.k WindowInsetsAnimationController windowInsetsAnimationController, int i11) {
        this.animationController = windowInsetsAnimationController;
        this.isControllerRequested = false;
        n<? super WindowInsetsAnimationController> nVar = this.continuation;
        if (nVar != null) {
            nVar.x(windowInsetsAnimationController, new x00.l<Throwable, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$onReady$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                    invoke2(th2);
                    return g2.f100423a;
                }
            });
        }
        this.continuation = null;
    }
}
