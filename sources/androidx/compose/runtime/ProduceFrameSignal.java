package androidx.compose.runtime;

import c40.p;
import j00.c;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.f;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,1791:1\n33#2,2:1792\n33#2,2:1803\n314#3,9:1794\n323#3,2:1805\n48#4,5:1807\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n*L\n1713#1:1792,2\n1720#1:1803,2\n1719#1:1794,9\n1719#1:1805,2\n1738#1:1807,5\n*E\n"})
/* loaded from: classes.dex */
final class ProduceFrameSignal {

    @l
    private Object pendingFrameContinuation;

    @l
    public final Object awaitFrameRequest(@k Object obj, @k c<? super g2> cVar) {
        Object obj2;
        Object obj3;
        p pVar;
        Object obj4;
        Object obj5;
        synchronized (obj) {
            Object obj6 = this.pendingFrameContinuation;
            obj2 = RecomposerKt.ProduceAnotherFrame;
            if (obj6 == obj2) {
                obj5 = RecomposerKt.FramePending;
                this.pendingFrameContinuation = obj5;
                return g2.f100423a;
            }
            g2 g2Var = g2.f100423a;
            p pVar2 = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
            pVar2.y();
            synchronized (obj) {
                try {
                    Object obj7 = this.pendingFrameContinuation;
                    obj3 = RecomposerKt.ProduceAnotherFrame;
                    if (obj7 == obj3) {
                        obj4 = RecomposerKt.FramePending;
                        this.pendingFrameContinuation = obj4;
                        pVar = pVar2;
                    } else {
                        this.pendingFrameContinuation = pVar2;
                        pVar = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pVar != null) {
                Result.a aVar = Result.Companion;
                pVar.resumeWith(Result.m6308constructorimpl(g2Var));
            }
            Object F = pVar2.F();
            if (F == b.l()) {
                f.c(cVar);
            }
            return F == b.l() ? F : g2Var;
        }
    }

    @l
    public final c<g2> requestFrameLocked() {
        Object obj;
        Object obj2;
        boolean g11;
        Object obj3;
        Object obj4;
        Object obj5 = this.pendingFrameContinuation;
        if (obj5 instanceof c) {
            obj4 = RecomposerKt.FramePending;
            this.pendingFrameContinuation = obj4;
            return (c) obj5;
        }
        obj = RecomposerKt.ProduceAnotherFrame;
        if (g0.g(obj5, obj)) {
            g11 = true;
        } else {
            obj2 = RecomposerKt.FramePending;
            g11 = g0.g(obj5, obj2);
        }
        if (g11) {
            return null;
        }
        if (obj5 == null) {
            obj3 = RecomposerKt.ProduceAnotherFrame;
            this.pendingFrameContinuation = obj3;
            return null;
        }
        throw new IllegalStateException(("invalid pendingFrameContinuation " + obj5).toString());
    }

    public final void takeFrameRequestLocked() {
        Object obj;
        Object obj2 = this.pendingFrameContinuation;
        obj = RecomposerKt.FramePending;
        if (!(obj2 == obj)) {
            PreconditionsKt.throwIllegalStateException("frame not pending");
        }
        this.pendingFrameContinuation = null;
    }
}
