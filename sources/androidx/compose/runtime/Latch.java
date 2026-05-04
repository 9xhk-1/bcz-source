package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.n;
import c40.p;
import j00.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import l00.f;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,86:1\n27#2:87\n33#2,2:88\n33#2,2:90\n33#2,2:92\n33#2,2:103\n314#3,9:94\n323#3,2:105\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n36#1:87\n42#1:88,2\n54#1:90,2\n58#1:92,2\n80#1:103,2\n79#1:94,9\n79#1:105,2\n*E\n"})
/* loaded from: classes.dex */
public final class Latch {
    public static final int $stable = 8;

    @k
    private final Object lock = new Object();

    @k
    private List<c<g2>> awaiters = new ArrayList();

    @k
    private List<c<g2>> spareList = new ArrayList();
    private boolean _isOpen = true;

    @l
    public final Object await(@k c<? super g2> cVar) {
        if (isOpen()) {
            return g2.f100423a;
        }
        final p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        synchronized (this.lock) {
            this.awaiters.add(pVar);
        }
        pVar.p(new x00.l<Throwable, g2>() { // from class: androidx.compose.runtime.Latch$await$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                invoke2(th2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                Object obj = Latch.this.lock;
                Latch latch = Latch.this;
                n<g2> nVar = pVar;
                synchronized (obj) {
                    latch.awaiters.remove(nVar);
                    g2 g2Var = g2.f100423a;
                }
            }
        });
        Object F = pVar.F();
        if (F == b.l()) {
            f.c(cVar);
        }
        return F == b.l() ? F : g2.f100423a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            g2 g2Var = g2.f100423a;
        }
    }

    public final boolean isOpen() {
        boolean z11;
        synchronized (this.lock) {
            z11 = this._isOpen;
        }
        return z11;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            try {
                if (isOpen()) {
                    return;
                }
                List<c<g2>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    c<g2> cVar = list.get(i11);
                    Result.a aVar = Result.Companion;
                    cVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
                }
                list.clear();
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <R> R withClosed(@k x00.a<? extends R> aVar) {
        closeLatch();
        try {
            return aVar.invoke();
        } finally {
            d0.d(1);
            openLatch();
            d0.c(1);
        }
    }
}
