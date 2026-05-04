package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import j00.c;
import kotlin.Result;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nAwaitFirstLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwaitFirstLayoutModifier.kt\nandroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,48:1\n314#2,11:49\n*S KotlinDebug\n*F\n+ 1 AwaitFirstLayoutModifier.kt\nandroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier\n*L\n35#1:49,11\n*E\n"})
/* loaded from: classes.dex */
public final class AwaitFirstLayoutModifier implements OnGloballyPositionedModifier {
    public static final int $stable = 0;

    @l
    private c<? super g2> continuation;
    private boolean wasPositioned;

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(@k LayoutCoordinates layoutCoordinates) {
        if (this.wasPositioned) {
            return;
        }
        this.wasPositioned = true;
        c<? super g2> cVar = this.continuation;
        if (cVar != null) {
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
        }
        this.continuation = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForFirstLayout(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.L$1
            j00.c r1 = (j00.c) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier) r0
            kotlin.e.n(r6)
            goto L68
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.e.n(r6)
            boolean r6 = r5.wasPositioned
            if (r6 != 0) goto L75
            j00.c<? super yz.g2> r6 = r5.continuation
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            c40.p r2 = new c40.p
            j00.c r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)
            r2.<init>(r4, r3)
            r2.y()
            access$setContinuation$p(r5, r2)
            java.lang.Object r2 = r2.F()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.l()
            if (r2 != r3) goto L64
            l00.f.c(r0)
        L64:
            if (r2 != r1) goto L67
            return r1
        L67:
            r1 = r6
        L68:
            if (r1 == 0) goto L75
            kotlin.Result$a r6 = kotlin.Result.Companion
            yz.g2 r6 = yz.g2.f100423a
            java.lang.Object r6 = kotlin.Result.m6308constructorimpl(r6)
            r1.resumeWith(r6)
        L75:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.waitForFirstLayout(j00.c):java.lang.Object");
    }
}
