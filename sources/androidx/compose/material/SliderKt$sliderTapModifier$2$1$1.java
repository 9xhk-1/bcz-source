package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c40.k;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.a;
import l00.d;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", i = {}, l = {1006}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SliderKt$sliderTapModifier$2$1$1 extends SuspendLambda implements p<PointerInputScope, c<? super g2>, Object> {
    final /* synthetic */ DraggableState $draggableState;
    final /* synthetic */ State<l<Float, g2>> $gestureEndAction;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ MutableState<Float> $pressOffset;
    final /* synthetic */ State<Float> $rawOffset;
    final /* synthetic */ r0 $scope;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1", f = "Slider.kt", i = {}, l = {1011}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements q<PressGestureScope, Offset, c<? super g2>, Object> {
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ MutableState<Float> $pressOffset;
        final /* synthetic */ State<Float> $rawOffset;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z11, float f11, MutableState<Float> mutableState, State<Float> state, c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$isRtl = z11;
            this.$maxPx = f11;
            this.$pressOffset = mutableState;
            this.$rawOffset = state;
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, c<? super g2> cVar) {
            return m1764invoked4ec7I(pressGestureScope, offset.m2278unboximpl(), cVar);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m1764invoked4ec7I(PressGestureScope pressGestureScope, long j11, c<? super g2> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, cVar);
            anonymousClass1.L$0 = pressGestureScope;
            anonymousClass1.J$0 = j11;
            return anonymousClass1.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = b.l();
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    e.n(obj);
                    PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                    long j11 = this.J$0;
                    this.$pressOffset.setValue(a.e((this.$isRtl ? this.$maxPx - Offset.m2268getXimpl(j11) : Offset.m2268getXimpl(j11)) - this.$rawOffset.getValue().floatValue()));
                    this.label = 1;
                    if (pressGestureScope.awaitRelease(this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                }
            } catch (GestureCancellationException unused) {
                this.$pressOffset.setValue(a.e(0.0f));
            }
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$sliderTapModifier$2$1$1(boolean z11, float f11, MutableState<Float> mutableState, State<Float> state, r0 r0Var, DraggableState draggableState, State<? extends l<? super Float, g2>> state2, c<? super SliderKt$sliderTapModifier$2$1$1> cVar) {
        super(2, cVar);
        this.$isRtl = z11;
        this.$maxPx = f11;
        this.$pressOffset = mutableState;
        this.$rawOffset = state;
        this.$scope = r0Var;
        this.$draggableState = draggableState;
        this.$gestureEndAction = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        SliderKt$sliderTapModifier$2$1$1 sliderKt$sliderTapModifier$2$1$1 = new SliderKt$sliderTapModifier$2$1$1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, cVar);
        sliderKt$sliderTapModifier$2$1$1.L$0 = obj;
        return sliderKt$sliderTapModifier$2$1$1;
    }

    @Override // x00.p
    public final Object invoke(PointerInputScope pointerInputScope, c<? super g2> cVar) {
        return ((SliderKt$sliderTapModifier$2$1$1) create(pointerInputScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
            final r0 r0Var = this.$scope;
            final DraggableState draggableState = this.$draggableState;
            final State<l<Float, g2>> state = this.$gestureEndAction;
            l<Offset, g2> lVar = new l<Offset, g2>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1.2

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @d(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1", f = "Slider.kt", i = {}, l = {1018}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
                    final /* synthetic */ DraggableState $draggableState;
                    final /* synthetic */ State<l<Float, g2>> $gestureEndAction;
                    int label;

                    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                    @d(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C00801 extends SuspendLambda implements p<DragScope, c<? super g2>, Object> {
                        private /* synthetic */ Object L$0;
                        int label;

                        public C00801(c<? super C00801> cVar) {
                            super(2, cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final c<g2> create(Object obj, c<?> cVar) {
                            C00801 c00801 = new C00801(cVar);
                            c00801.L$0 = obj;
                            return c00801;
                        }

                        @Override // x00.p
                        public final Object invoke(DragScope dragScope, c<? super g2> cVar) {
                            return ((C00801) create(dragScope, cVar)).invokeSuspend(g2.f100423a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            b.l();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e.n(obj);
                            ((DragScope) this.L$0).dragBy(0.0f);
                            return g2.f100423a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(DraggableState draggableState, State<? extends l<? super Float, g2>> state, c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$draggableState = draggableState;
                        this.$gestureEndAction = state;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final c<g2> create(Object obj, c<?> cVar) {
                        return new AnonymousClass1(this.$draggableState, this.$gestureEndAction, cVar);
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
                            DraggableState draggableState = this.$draggableState;
                            MutatePriority mutatePriority = MutatePriority.UserInput;
                            C00801 c00801 = new C00801(null);
                            this.label = 1;
                            if (draggableState.drag(mutatePriority, c00801, this) == l11) {
                                return l11;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e.n(obj);
                        }
                        this.$gestureEndAction.getValue().invoke(a.e(0.0f));
                        return g2.f100423a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                    m1765invokek4lQ0M(offset.m2278unboximpl());
                    return g2.f100423a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m1765invokek4lQ0M(long j11) {
                    k.f(r0.this, null, null, new AnonymousClass1(draggableState, state, null), 3, null);
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, lVar, this, 3, null) == l11) {
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
