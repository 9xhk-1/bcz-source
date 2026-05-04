package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPrefetchScheduler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n1101#2:221\n1083#2,2:222\n516#3:224\n519#3:225\n472#3:226\n1#4:227\n*S KotlinDebug\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler\n*L\n88#1:221\n88#1:222,2\n107#1:224\n119#1:225\n121#1:226\n*E\n"})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class AndroidPrefetchScheduler implements PrefetchScheduler, RememberObserver, Runnable, Choreographer.FrameCallback {
    private static long frameIntervalNs;
    private long frameStartTimeNanos;
    private boolean isActive;
    private boolean prefetchScheduled;

    @k
    private final View view;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private final MutableVector<PrefetchRequest> prefetchRequests = new MutableVector<>(new PrefetchRequest[16], 0);
    private final Choreographer choreographer = Choreographer.getInstance();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (r5 >= 30.0f) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void calculateFrameIntervalIfNeeded(android.view.View r5) {
            /*
                r4 = this;
                long r0 = androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.access$getFrameIntervalNs$cp()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L2c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L21
                if (r0 == 0) goto L21
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L21
                goto L23
            L21:
                r5 = 1114636288(0x42700000, float:60.0)
            L23:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.access$setFrameIntervalNs$cp(r0)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.Companion.calculateFrameIntervalIfNeeded(android.view.View):void");
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class PrefetchRequestScopeImpl implements PrefetchRequestScope {
        public static final int $stable = 0;
        private final long nextFrameTimeNs;

        public PrefetchRequestScopeImpl(long j11) {
            this.nextFrameTimeNs = j11;
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequestScope
        public long availableTimeNanos() {
            return Math.max(0L, this.nextFrameTimeNs - System.nanoTime());
        }
    }

    public AndroidPrefetchScheduler(@k View view) {
        this.view = view;
        Companion.calculateFrameIntervalIfNeeded(view);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j11) {
        if (this.isActive) {
            this.frameStartTimeNanos = j11;
            this.view.post(this);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.isActive = false;
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.isActive = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prefetchRequests.getSize() == 0 || !this.prefetchScheduled || !this.isActive || this.view.getWindowVisibility() != 0) {
            this.prefetchScheduled = false;
            return;
        }
        PrefetchRequestScopeImpl prefetchRequestScopeImpl = new PrefetchRequestScopeImpl(this.frameStartTimeNanos + frameIntervalNs);
        boolean z11 = false;
        while (this.prefetchRequests.getSize() != 0 && !z11) {
            if (prefetchRequestScopeImpl.availableTimeNanos() <= 0 || this.prefetchRequests.content[0].execute(prefetchRequestScopeImpl)) {
                z11 = true;
            } else {
                this.prefetchRequests.removeAt(0);
            }
        }
        if (z11) {
            this.choreographer.postFrameCallback(this);
        } else {
            this.prefetchScheduled = false;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.PrefetchScheduler
    public void schedulePrefetch(@k PrefetchRequest prefetchRequest) {
        this.prefetchRequests.add(prefetchRequest);
        if (this.prefetchScheduled) {
            return;
        }
        this.prefetchScheduled = true;
        this.view.post(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }
}
