package androidx.compose.foundation.lazy.layout;

import a00.h0;
import android.os.Trace;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.time.e;
import kotlin.time.n;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class PrefetchHandleProvider {
    public static final int $stable = 8;

    @k
    private final PrefetchScheduler executor;

    @k
    private final LazyLayoutItemContentFactory itemContentFactory;

    @k
    private final SubcomposeLayoutState subcomposeLayoutState;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl\n+ 2 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,541:1\n26#2,5:542\n26#2,5:547\n26#2,5:553\n1#3:552\n96#4,5:558\n96#4,5:563\n96#4,5:568\n107#4,7:573\n107#4,7:580\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl\n*L\n339#1:542,5\n361#1:547,5\n385#1:553,5\n401#1:558,5\n408#1:563,5\n412#1:568,5\n415#1:573,7\n425#1:580,7\n*E\n"})
    @ExperimentalFoundationApi
    public final class HandleAndRequestImpl implements LazyLayoutPrefetchState.PrefetchHandle, PrefetchRequest {
        private long availableTimeNanos;
        private final long constraints;
        private long elapsedTimeNanos;
        private boolean hasResolvedNestedPrefetches;
        private final int index;
        private boolean isCanceled;
        private boolean isMeasured;
        private boolean isUrgent;

        @l
        private NestedPrefetchController nestedPrefetchController;

        @l
        private SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle;

        @k
        private final PrefetchMetrics prefetchMetrics;
        private long startTime;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n96#2,5:542\n50#2,5:547\n26#3,5:552\n1#4:557\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController\n*L\n454#1:542,5\n463#1:547,5\n467#1:552,5\n*E\n"})
        public final class NestedPrefetchController {
            private int requestIndex;

            @k
            private final List<PrefetchRequest>[] requestsByState;
            private int stateIndex;

            @k
            private final List<LazyLayoutPrefetchState> states;

            public NestedPrefetchController(@k List<LazyLayoutPrefetchState> list) {
                this.states = list;
                this.requestsByState = new List[list.size()];
                if (list.isEmpty()) {
                    InlineClassHelperKt.throwIllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean executeNestedPrefetches(@k PrefetchRequestScope prefetchRequestScope) {
                if (this.stateIndex >= this.states.size()) {
                    return false;
                }
                if (HandleAndRequestImpl.this.isCanceled) {
                    InlineClassHelperKt.throwIllegalStateException("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.stateIndex < this.states.size()) {
                    try {
                        if (this.requestsByState[this.stateIndex] == null) {
                            if (prefetchRequestScope.availableTimeNanos() <= 0) {
                                Trace.endSection();
                                return true;
                            }
                            List<PrefetchRequest>[] listArr = this.requestsByState;
                            int i11 = this.stateIndex;
                            listArr[i11] = this.states.get(i11).collectNestedPrefetchRequests$foundation_release();
                        }
                        List<PrefetchRequest> list = this.requestsByState[this.stateIndex];
                        g0.m(list);
                        while (this.requestIndex < list.size()) {
                            if (list.get(this.requestIndex).execute(prefetchRequestScope)) {
                                Trace.endSection();
                                return true;
                            }
                            this.requestIndex++;
                        }
                        this.requestIndex = 0;
                        this.stateIndex++;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                g2 g2Var = g2.f100423a;
                Trace.endSection();
                return false;
            }
        }

        public /* synthetic */ HandleAndRequestImpl(PrefetchHandleProvider prefetchHandleProvider, int i11, long j11, PrefetchMetrics prefetchMetrics, v vVar) {
            this(i11, j11, prefetchMetrics);
        }

        private final boolean isComposed() {
            return this.precomposeHandle != null;
        }

        private final void performFullComposition(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj) {
            if (!(this.precomposeHandle == null)) {
                InlineClassHelperKt.throwIllegalArgumentException("Request was already composed!");
            }
            Object key = lazyLayoutItemProvider.getKey(this.index);
            this.precomposeHandle = PrefetchHandleProvider.this.subcomposeLayoutState.precompose(key, PrefetchHandleProvider.this.itemContentFactory.getContent(this.index, key, obj));
        }

        /* renamed from: performMeasure-BRTryo0, reason: not valid java name */
        private final void m917performMeasureBRTryo0(long j11) {
            if (this.isCanceled) {
                InlineClassHelperKt.throwIllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.isMeasured) {
                InlineClassHelperKt.throwIllegalArgumentException("Request was already measured!");
            }
            this.isMeasured = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("performComposition() must be called before performMeasure()");
                throw new KotlinNothingValueException();
            }
            int placeablesCount = precomposedSlotHandle.getPlaceablesCount();
            for (int i11 = 0; i11 < placeablesCount; i11++) {
                precomposedSlotHandle.mo3883premeasure0kLqBqw(i11, j11);
            }
        }

        private final void resetAvailableTimeTo(long j11) {
            this.availableTimeNanos = j11;
            this.startTime = n.b.f67794b.b();
            this.elapsedTimeNanos = 0L;
        }

        private final NestedPrefetchController resolveNestedPrefetchStates() {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Should precompose before resolving nested prefetch states");
                throw new KotlinNothingValueException();
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            precomposedSlotHandle.traverseDescendants("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new x00.l<TraversableNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // x00.l
                public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
                    T t11;
                    g0.n(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                    LazyLayoutPrefetchState prefetchState = ((TraversablePrefetchStateNode) traversableNode).getPrefetchState();
                    Ref.ObjectRef<List<LazyLayoutPrefetchState>> objectRef2 = objectRef;
                    List<LazyLayoutPrefetchState> list = objectRef2.element;
                    if (list != null) {
                        list.add(prefetchState);
                        t11 = list;
                    } else {
                        t11 = h0.U(prefetchState);
                    }
                    objectRef2.element = t11;
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
            });
            List list = (List) objectRef.element;
            if (list != null) {
                return new NestedPrefetchController(list);
            }
            return null;
        }

        private final boolean shouldExecute(long j11, long j12) {
            return (this.isUrgent && j11 > 0) || j12 < j11;
        }

        private final void updateElapsedAndAvailableTime() {
            long b11 = n.b.f67794b.b();
            long z11 = e.z(n.b.a.q(b11, this.startTime));
            this.elapsedTimeNanos = z11;
            this.availableTimeNanos -= z11;
            this.startTime = b11;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle != null) {
                precomposedSlotHandle.dispose();
            }
            this.precomposeHandle = null;
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequest
        public boolean execute(@k PrefetchRequestScope prefetchRequestScope) {
            LazyLayoutItemProvider invoke = PrefetchHandleProvider.this.itemContentFactory.getItemProvider().invoke();
            if (!this.isCanceled) {
                int itemCount = invoke.getItemCount();
                int i11 = this.index;
                if (i11 >= 0 && i11 < itemCount) {
                    Object contentType = invoke.getContentType(i11);
                    resetAvailableTimeTo(prefetchRequestScope.availableTimeNanos());
                    if (!isComposed()) {
                        if (!shouldExecute(this.availableTimeNanos, this.prefetchMetrics.getCompositionTimeNanos(contentType))) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            performFullComposition(invoke, contentType);
                            g2 g2Var = g2.f100423a;
                            Trace.endSection();
                            updateElapsedAndAvailableTime();
                            this.prefetchMetrics.saveCompositionTime(contentType, this.elapsedTimeNanos);
                        } finally {
                        }
                    }
                    if (!this.isUrgent) {
                        if (!this.hasResolvedNestedPrefetches) {
                            if (this.availableTimeNanos <= 0) {
                                return true;
                            }
                            Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                            try {
                                this.nestedPrefetchController = resolveNestedPrefetchStates();
                                this.hasResolvedNestedPrefetches = true;
                                g2 g2Var2 = g2.f100423a;
                            } finally {
                            }
                        }
                        NestedPrefetchController nestedPrefetchController = this.nestedPrefetchController;
                        if (nestedPrefetchController != null ? nestedPrefetchController.executeNestedPrefetches(prefetchRequestScope) : false) {
                            return true;
                        }
                        updateElapsedAndAvailableTime();
                    }
                    if (!this.isMeasured && !Constraints.m5072isZeroimpl(this.constraints)) {
                        if (!shouldExecute(this.availableTimeNanos, this.prefetchMetrics.getMeasureTimeNanos(contentType))) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            m917performMeasureBRTryo0(this.constraints);
                            g2 g2Var3 = g2.f100423a;
                            Trace.endSection();
                            updateElapsedAndAvailableTime();
                            this.prefetchMetrics.saveMeasureTime(contentType, this.elapsedTimeNanos);
                        } finally {
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void markAsUrgent() {
            this.isUrgent = true;
        }

        @k
        public String toString() {
            return "HandleAndRequestImpl { index = " + this.index + ", constraints = " + ((Object) Constraints.m5073toStringimpl(this.constraints)) + ", isComposed = " + isComposed() + ", isMeasured = " + this.isMeasured + ", isCanceled = " + this.isCanceled + " }";
        }

        private HandleAndRequestImpl(int i11, long j11, PrefetchMetrics prefetchMetrics) {
            this.index = i11;
            this.constraints = j11;
            this.prefetchMetrics = prefetchMetrics;
            this.startTime = n.b.f67794b.b();
        }
    }

    public PrefetchHandleProvider(@k LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @k SubcomposeLayoutState subcomposeLayoutState, @k PrefetchScheduler prefetchScheduler) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.executor = prefetchScheduler;
    }

    @k
    /* renamed from: createNestedPrefetchRequest-VKLhPVY, reason: not valid java name */
    public final PrefetchRequest m915createNestedPrefetchRequestVKLhPVY(int i11, long j11, @k PrefetchMetrics prefetchMetrics) {
        return new HandleAndRequestImpl(this, i11, j11, prefetchMetrics, null);
    }

    @k
    /* renamed from: schedulePrefetch-VKLhPVY, reason: not valid java name */
    public final LazyLayoutPrefetchState.PrefetchHandle m916schedulePrefetchVKLhPVY(int i11, long j11, @k PrefetchMetrics prefetchMetrics) {
        HandleAndRequestImpl handleAndRequestImpl = new HandleAndRequestImpl(this, i11, j11, prefetchMetrics, null);
        this.executor.schedulePrefetch(handleAndRequestImpl);
        return handleAndRequestImpl;
    }
}
