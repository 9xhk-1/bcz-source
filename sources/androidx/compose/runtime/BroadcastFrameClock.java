package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;
import j00.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.e;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l00.f;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,137:1\n27#2:138\n33#2,2:139\n33#2,2:150\n33#2,2:154\n314#3,9:141\n323#3,2:152\n33#4,6:156\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n47#1:138\n65#1:139,2\n85#1:150,2\n118#1:154,2\n82#1:141,9\n82#1:152,2\n121#1:156,6\n*E\n"})
/* loaded from: classes.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    @k
    private List<FrameAwaiter<?>> awaiters;

    @l
    private Throwable failureCause;

    @k
    private final AtomicInt hasAwaitersUnlocked;

    @k
    private final Object lock;

    @l
    private final x00.a<g2> onNewAwaiters;

    @k
    private List<FrameAwaiter<?>> spareList;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
    public static final class FrameAwaiter<R> {

        @k
        private final c<R> continuation;

        @k
        private final x00.l<Long, R> onFrame;

        /* JADX WARN: Multi-variable type inference failed */
        public FrameAwaiter(@k x00.l<? super Long, ? extends R> lVar, @k c<? super R> cVar) {
            this.onFrame = lVar;
            this.continuation = cVar;
        }

        @k
        public final c<R> getContinuation() {
            return this.continuation;
        }

        @k
        public final x00.l<Long, R> getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long j11) {
            Object m6308constructorimpl;
            c<R> cVar = this.continuation;
            try {
                Result.a aVar = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(this.onFrame.invoke(Long.valueOf(j11)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
            }
            cVar.resumeWith(m6308constructorimpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable th2) {
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = th2;
                List<FrameAwaiter<?>> list = this.awaiters;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    c<?> continuation = list.get(i11).getContinuation();
                    Result.a aVar = Result.Companion;
                    continuation.resumeWith(Result.m6308constructorimpl(e.a(th2)));
                }
                this.awaiters.clear();
                this.hasAwaitersUnlocked.set(0);
                g2 g2Var = g2.f100423a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void cancel(@k CancellationException cancellationException) {
        fail(cancellationException);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @k p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @l
    public <E extends d.b> E get(@k d.c<E> cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final boolean getHasAwaiters() {
        return this.hasAwaitersUnlocked.get() != 0;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @k
    public d minusKey(@k d.c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @k
    public d plus(@k d dVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, dVar);
    }

    public final void sendFrame(long j11) {
        synchronized (this.lock) {
            try {
                List<FrameAwaiter<?>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this.hasAwaitersUnlocked.set(0);
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).resume(j11);
                }
                list.clear();
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @l
    public <R> Object withFrameNanos(@k x00.l<? super Long, ? extends R> lVar, @k c<? super R> cVar) {
        c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        final FrameAwaiter frameAwaiter = new FrameAwaiter(lVar, pVar);
        synchronized (this.lock) {
            Throwable th2 = this.failureCause;
            if (th2 != null) {
                Result.a aVar = Result.Companion;
                pVar.resumeWith(Result.m6308constructorimpl(e.a(th2)));
            } else {
                boolean isEmpty = this.awaiters.isEmpty();
                this.awaiters.add(frameAwaiter);
                if (isEmpty) {
                    this.hasAwaitersUnlocked.set(1);
                }
                pVar.p(new x00.l<Throwable, g2>() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Throwable th3) {
                        invoke2(th3);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th3) {
                        Object obj = BroadcastFrameClock.this.lock;
                        BroadcastFrameClock broadcastFrameClock = BroadcastFrameClock.this;
                        Object obj2 = frameAwaiter;
                        synchronized (obj) {
                            try {
                                broadcastFrameClock.awaiters.remove(obj2);
                                if (broadcastFrameClock.awaiters.isEmpty()) {
                                    broadcastFrameClock.hasAwaitersUnlocked.set(0);
                                }
                                g2 g2Var = g2.f100423a;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                });
                if (isEmpty && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th3) {
                        fail(th3);
                    }
                }
            }
        }
        Object F = pVar.F();
        if (F == b.l()) {
            f.c(cVar);
        }
        return F;
    }

    public BroadcastFrameClock(@l x00.a<g2> aVar) {
        this.onNewAwaiters = aVar;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
        this.hasAwaitersUnlocked = new AtomicInt(0);
    }

    public /* synthetic */ BroadcastFrameClock(x00.a aVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : aVar);
    }
}
