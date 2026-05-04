package androidx.compose.foundation.gestures;

import a00.r0;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import c40.l2;
import c40.s0;
import e40.o;
import e40.r;
import e40.s;
import j00.c;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l00.a;
import m80.k;
import m80.l;
import q30.m;
import q30.q;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n73#1:364\n102#2,2:365\n34#2,6:367\n104#2:373\n102#2,2:374\n34#2,6:376\n104#2:382\n34#2,6:383\n1#3:389\n*S KotlinDebug\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic\n*L\n63#1:364\n63#1:365,2\n63#1:367,6\n63#1:373\n73#1:374,2\n73#1:376,6\n73#1:382\n75#1:383,6\n*E\n"})
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic {
    public static final int $stable = 8;

    @k
    private Density density;
    private boolean isScrolling;

    @k
    private final ScrollConfig mouseWheelScrollConfig;

    @k
    private final p<Velocity, c<? super g2>, Object> onScrollStopped;

    @l
    private l2 receivingMouseWheelEventsJob;

    @k
    private final ScrollingLogic scrollingLogic;

    @k
    private final o<MouseWheelScrollDelta> channel = r.d(Integer.MAX_VALUE, null, null, 6, null);

    @k
    private final MouseWheelVelocityTracker velocityTracker = new MouseWheelVelocityTracker();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MouseWheelScrollDelta {
        private final boolean shouldApplyImmediately;
        private final long timeMillis;
        private final long value;

        public /* synthetic */ MouseWheelScrollDelta(long j11, long j12, boolean z11, v vVar) {
            this(j11, j12, z11);
        }

        /* renamed from: copy-9KIMszo$default, reason: not valid java name */
        public static /* synthetic */ MouseWheelScrollDelta m463copy9KIMszo$default(MouseWheelScrollDelta mouseWheelScrollDelta, long j11, long j12, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = mouseWheelScrollDelta.value;
            }
            long j13 = j11;
            if ((i11 & 2) != 0) {
                j12 = mouseWheelScrollDelta.timeMillis;
            }
            long j14 = j12;
            if ((i11 & 4) != 0) {
                z11 = mouseWheelScrollDelta.shouldApplyImmediately;
            }
            return mouseWheelScrollDelta.m465copy9KIMszo(j13, j14, z11);
        }

        /* renamed from: component1-F1C5BW0, reason: not valid java name */
        public final long m464component1F1C5BW0() {
            return this.value;
        }

        public final long component2() {
            return this.timeMillis;
        }

        public final boolean component3() {
            return this.shouldApplyImmediately;
        }

        @k
        /* renamed from: copy-9KIMszo, reason: not valid java name */
        public final MouseWheelScrollDelta m465copy9KIMszo(long j11, long j12, boolean z11) {
            return new MouseWheelScrollDelta(j11, j12, z11, null);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
            return Offset.m2265equalsimpl0(this.value, mouseWheelScrollDelta.value) && this.timeMillis == mouseWheelScrollDelta.timeMillis && this.shouldApplyImmediately == mouseWheelScrollDelta.shouldApplyImmediately;
        }

        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* renamed from: getValue-F1C5BW0, reason: not valid java name */
        public final long m466getValueF1C5BW0() {
            return this.value;
        }

        public int hashCode() {
            return (((Offset.m2270hashCodeimpl(this.value) * 31) + Long.hashCode(this.timeMillis)) * 31) + Boolean.hashCode(this.shouldApplyImmediately);
        }

        @k
        public final MouseWheelScrollDelta plus(@k MouseWheelScrollDelta mouseWheelScrollDelta) {
            return new MouseWheelScrollDelta(Offset.m2273plusMKHz9U(this.value, mouseWheelScrollDelta.value), Math.max(this.timeMillis, mouseWheelScrollDelta.timeMillis), this.shouldApplyImmediately, null);
        }

        @k
        public String toString() {
            return "MouseWheelScrollDelta(value=" + ((Object) Offset.m2276toStringimpl(this.value)) + ", timeMillis=" + this.timeMillis + ", shouldApplyImmediately=" + this.shouldApplyImmediately + ')';
        }

        private MouseWheelScrollDelta(long j11, long j12, boolean z11) {
            this.value = j11;
            this.timeMillis = j12;
            this.shouldApplyImmediately = z11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MouseWheelScrollingLogic(@k ScrollingLogic scrollingLogic, @k ScrollConfig scrollConfig, @k p<? super Velocity, ? super c<? super g2>, ? extends Object> pVar, @k Density density) {
        this.scrollingLogic = scrollingLogic;
        this.mouseWheelScrollConfig = scrollConfig;
        this.onScrollStopped = pVar;
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateMouseWheelScroll(final NestedScrollScope nestedScrollScope, AnimationState<Float, AnimationVector1D> animationState, float f11, int i11, final x00.l<? super Float, Boolean> lVar, c<? super g2> cVar) {
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = animationState.getValue().floatValue();
        Object animateTo = SuspendAnimationKt.animateTo(animationState, a.e(f11), AnimationSpecKt.tween$default(i11, 0, EasingKt.getLinearEasing(), 2, null), true, new x00.l<AnimationScope<Float, AnimationVector1D>, g2>() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$animateMouseWheelScroll$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                boolean isLowScrollingDelta;
                float dispatchMouseWheelScroll;
                boolean isLowScrollingDelta2;
                float floatValue = animationScope.getValue().floatValue() - Ref.FloatRef.this.element;
                isLowScrollingDelta = MouseWheelScrollableKt.isLowScrollingDelta(floatValue);
                if (!isLowScrollingDelta) {
                    dispatchMouseWheelScroll = this.dispatchMouseWheelScroll(nestedScrollScope, floatValue);
                    isLowScrollingDelta2 = MouseWheelScrollableKt.isLowScrollingDelta(floatValue - dispatchMouseWheelScroll);
                    if (!isLowScrollingDelta2) {
                        animationScope.cancelAnimation();
                        return;
                    } else {
                        Ref.FloatRef.this.element += floatValue;
                    }
                }
                if (lVar.invoke(Float.valueOf(Ref.FloatRef.this.element)).booleanValue()) {
                    animationScope.cancelAnimation();
                }
            }
        }, cVar);
        return animateTo == b.l() ? animateTo : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object busyReceive(o<MouseWheelScrollDelta> oVar, c<? super MouseWheelScrollDelta> cVar) {
        return s0.g(new MouseWheelScrollingLogic$busyReceive$2(oVar, null), cVar);
    }

    /* renamed from: canConsumeDelta-Uv8p0NA, reason: not valid java name */
    private final boolean m460canConsumeDeltaUv8p0NA(ScrollingLogic scrollingLogic, long j11) {
        float m515toFloatk4lQ0M = scrollingLogic.m515toFloatk4lQ0M(scrollingLogic.m513reverseIfNeededMKHz9U(j11));
        if (m515toFloatk4lQ0M == 0.0f) {
            return false;
        }
        return m515toFloatk4lQ0M > 0.0f ? scrollingLogic.getScrollableState().getCanScrollForward() : scrollingLogic.getScrollableState().getCanScrollBackward();
    }

    private final void consume(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i11 = 0; i11 < size; i11++) {
            changes.get(i11).consume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0110, code lost:
    
        if (r0.invoke(r1, r9) != r10) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, androidx.compose.animation.core.AnimationState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object dispatchMouseWheelScroll(androidx.compose.foundation.gestures.ScrollingLogic r23, androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta r24, float r25, float r26, j00.c<? super yz.g2> r27) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.dispatchMouseWheelScroll(androidx.compose.foundation.gestures.ScrollingLogic, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta, float, float, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, androidx.compose.animation.core.AnimationState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object dispatchMouseWheelScroll$waitNextScrollDelta(androidx.compose.foundation.gestures.MouseWheelScrollingLogic r21, kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> r22, kotlin.jvm.internal.Ref.FloatRef r23, androidx.compose.foundation.gestures.ScrollingLogic r24, kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r25, long r26, j00.c<? super java.lang.Boolean> r28) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.dispatchMouseWheelScroll$waitNextScrollDelta(androidx.compose.foundation.gestures.MouseWheelScrollingLogic, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$FloatRef, androidx.compose.foundation.gestures.ScrollingLogic, kotlin.jvm.internal.Ref$ObjectRef, long, j00.c):java.lang.Object");
    }

    private final boolean isConsumed(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (changes.get(i11).isConsumed()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: onMouseWheel-O0kMr_c, reason: not valid java name */
    private final boolean m461onMouseWheelO0kMr_c(PointerEvent pointerEvent, long j11) {
        long mo399calculateMouseWheelScroll8xgXZGE = this.mouseWheelScrollConfig.mo399calculateMouseWheelScroll8xgXZGE(this.density, pointerEvent, j11);
        if (m460canConsumeDeltaUv8p0NA(this.scrollingLogic, mo399calculateMouseWheelScroll8xgXZGE)) {
            return s.m(this.channel.m(new MouseWheelScrollDelta(mo399calculateMouseWheelScroll8xgXZGE, ((PointerInputChange) r0.G2(pointerEvent.getChanges())).getUptimeMillis(), !this.mouseWheelScrollConfig.isSmoothScrollingEnabled() || this.mouseWheelScrollConfig.isPreciseWheelScroll(pointerEvent), null)));
        }
        return this.isScrolling;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MouseWheelScrollDelta sumOrNull(final o<MouseWheelScrollDelta> oVar) {
        MouseWheelScrollDelta mouseWheelScrollDelta = null;
        for (MouseWheelScrollDelta mouseWheelScrollDelta2 : untilNull(new x00.a<MouseWheelScrollDelta>() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$sumOrNull$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final MouseWheelScrollingLogic.MouseWheelScrollDelta invoke() {
                return (MouseWheelScrollingLogic.MouseWheelScrollDelta) s.h(oVar.O());
            }
        })) {
            mouseWheelScrollDelta = mouseWheelScrollDelta == null ? mouseWheelScrollDelta2 : mouseWheelScrollDelta.plus(mouseWheelScrollDelta2);
        }
        return mouseWheelScrollDelta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackVelocity(MouseWheelScrollDelta mouseWheelScrollDelta) {
        this.velocityTracker.m467addDeltaUv8p0NA(mouseWheelScrollDelta.getTimeMillis(), mouseWheelScrollDelta.m466getValueF1C5BW0());
    }

    private final <E> m<E> untilNull(x00.a<? extends E> aVar) {
        return q.b(new MouseWheelScrollingLogic$untilNull$1(aVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object userScroll(androidx.compose.foundation.gestures.ScrollingLogic r5, x00.p<? super androidx.compose.foundation.gestures.NestedScrollScope, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r6, j00.c<? super yz.g2> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 r0 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 r0 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic) r5
            kotlin.e.n(r7)
            goto L4c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r7)
            r4.isScrolling = r3
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2 r7 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2
            r2 = 0
            r7.<init>(r5, r6, r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = c40.l3.e(r7, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            r6 = 0
            r5.isScrolling = r6
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.userScroll(androidx.compose.foundation.gestures.ScrollingLogic, x00.p, j00.c):java.lang.Object");
    }

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void m462onPointerEventH0pRuoY(@k PointerEvent pointerEvent, @k PointerEventPass pointerEventPass, long j11) {
        if (pointerEventPass == PointerEventPass.Main && PointerEventType.m3681equalsimpl0(pointerEvent.m3674getType7fucELk(), PointerEventType.Companion.m3690getScroll7fucELk())) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (changes.get(i11).isConsumed()) {
                    return;
                }
            }
            if (m461onMouseWheelO0kMr_c(pointerEvent, j11)) {
                consume(pointerEvent);
            }
        }
    }

    public final void startReceivingMouseWheelEvents(@k c40.r0 r0Var) {
        l2 f11;
        if (this.receivingMouseWheelEventsJob == null) {
            f11 = c40.k.f(r0Var, null, null, new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this, null), 3, null);
            this.receivingMouseWheelEventsJob = f11;
        }
    }

    public final void updateDensity(@k Density density) {
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float dispatchMouseWheelScroll(NestedScrollScope nestedScrollScope, float f11) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        return scrollingLogic.m515toFloatk4lQ0M(scrollingLogic.m513reverseIfNeededMKHz9U(nestedScrollScope.mo469scrollByOzD1aCk(scrollingLogic.m516toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f11)), NestedScrollSource.Companion.m3625getUserInputWNlRxjI())));
    }
}
