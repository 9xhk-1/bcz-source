package androidx.compose.material;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.app.NotificationCompat;
import c40.r0;
import c40.s0;
import com.baicizhan.main.home.player.IslandsKt;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Ref;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {1082}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SliderKt$rangeSliderPressDragModifier$1 extends SuspendLambda implements p<PointerInputScope, c<? super g2>, Object> {
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ State<l<Boolean, g2>> $gestureEndAction;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ State<p<Boolean, Float, g2>> $onDrag;
    final /* synthetic */ State<Float> $rawOffsetEnd;
    final /* synthetic */ State<Float> $rawOffsetStart;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1083}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ State<l<Boolean, g2>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ State<p<Boolean, Float, g2>> $onDrag;
        final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
        final /* synthetic */ State<Float> $rawOffsetEnd;
        final /* synthetic */ State<Float> $rawOffsetStart;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1084, 1095, 1117}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", NotificationCompat.CATEGORY_EVENT, IslandsKt.f23311p, "posX", "draggingStart", IslandsKt.f23311p, "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
        /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00791 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
            final /* synthetic */ r0 $$this$coroutineScope;
            final /* synthetic */ State<l<Boolean, g2>> $gestureEndAction;
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ float $maxPx;
            final /* synthetic */ State<p<Boolean, Float, g2>> $onDrag;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ State<Float> $rawOffsetEnd;
            final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @d(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1135}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
                final /* synthetic */ Ref.BooleanRef $draggingStart;
                final /* synthetic */ DragInteraction $finishInteraction;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$draggingStart = booleanRef;
                    this.$finishInteraction = dragInteraction;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final c<g2> create(Object obj, c<?> cVar) {
                    return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, cVar);
                }

                @Override // x00.p
                public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                    return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object l11 = b.l();
                    int i11 = this.label;
                    if (i11 == 0) {
                        e.n(obj);
                        MutableInteractionSource activeInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element);
                        DragInteraction dragInteraction = this.$finishInteraction;
                        this.label = 1;
                        if (activeInteraction.emit(dragInteraction, this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e.n(obj);
                    }
                    return g2.f100423a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00791(boolean z11, float f11, RangeSliderLogic rangeSliderLogic, State<Float> state, r0 r0Var, State<? extends l<? super Boolean, g2>> state2, State<Float> state3, State<? extends p<? super Boolean, ? super Float, g2>> state4, c<? super C00791> cVar) {
                super(2, cVar);
                this.$isRtl = z11;
                this.$maxPx = f11;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$rawOffsetStart = state;
                this.$$this$coroutineScope = r0Var;
                this.$gestureEndAction = state2;
                this.$rawOffsetEnd = state3;
                this.$onDrag = state4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                C00791 c00791 = new C00791(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, cVar);
                c00791.L$0 = obj;
                return c00791;
            }

            @Override // x00.p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
                return ((C00791) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:41:0x0172, code lost:
            
                if (r1 != r6) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0068, code lost:
            
                if (r1 == r6) goto L53;
             */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 437
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00791.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PointerInputScope pointerInputScope, boolean z11, float f11, RangeSliderLogic rangeSliderLogic, State<Float> state, State<? extends l<? super Boolean, g2>> state2, State<Float> state3, State<? extends p<? super Boolean, ? super Float, g2>> state4, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$$this$pointerInput = pointerInputScope;
            this.$isRtl = z11;
            this.$maxPx = f11;
            this.$rangeSliderLogic = rangeSliderLogic;
            this.$rawOffsetStart = state;
            this.$gestureEndAction = state2;
            this.$rawOffsetEnd = state3;
            this.$onDrag = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                r0 r0Var = (r0) this.L$0;
                PointerInputScope pointerInputScope = this.$$this$pointerInput;
                C00791 c00791 = new C00791(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, r0Var, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c00791, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$rangeSliderPressDragModifier$1(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends p<? super Boolean, ? super Float, g2>> state3, boolean z11, float f11, State<? extends l<? super Boolean, g2>> state4, c<? super SliderKt$rangeSliderPressDragModifier$1> cVar) {
        super(2, cVar);
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$rawOffsetStart = state;
        this.$rawOffsetEnd = state2;
        this.$onDrag = state3;
        this.$isRtl = z11;
        this.$maxPx = f11;
        this.$gestureEndAction = state4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, cVar);
        sliderKt$rangeSliderPressDragModifier$1.L$0 = obj;
        return sliderKt$rangeSliderPressDragModifier$1;
    }

    @Override // x00.p
    public final Object invoke(PointerInputScope pointerInputScope, c<? super g2> cVar) {
        return ((SliderKt$rangeSliderPressDragModifier$1) create(pointerInputScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$isRtl, this.$maxPx, new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag), this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
            this.label = 1;
            if (s0.g(anonymousClass1, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
