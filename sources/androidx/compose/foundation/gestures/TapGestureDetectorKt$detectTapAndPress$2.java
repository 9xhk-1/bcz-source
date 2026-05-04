package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c40.r0;
import com.jiongji.andriod.card.R;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {R.styleable.Theme_drawable_walk_sound3}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ q<PressGestureScope, Offset, c<? super g2>, Object> $onPress;
    final /* synthetic */ l<Offset, g2> $onTap;
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    final /* synthetic */ PointerInputScope $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {0, 0, 1}, l = {R.styleable.Theme_drawable_wiki_sound, 257}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "resetJob", "resetJob"}, s = {"L$0", "L$1", "L$0"})
    @u0({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1#2:551\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
        final /* synthetic */ r0 $$this$coroutineScope;
        final /* synthetic */ q<PressGestureScope, Offset, c<? super g2>, Object> $onPress;
        final /* synthetic */ l<Offset, g2> $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00501 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
            final /* synthetic */ PointerInputChange $down;
            final /* synthetic */ q<PressGestureScope, Offset, c<? super g2>, Object> $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00501(q<? super PressGestureScope, ? super Offset, ? super c<? super g2>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, c<? super C00501> cVar) {
                super(2, cVar);
                this.$onPress = qVar;
                this.$pressScope = pressGestureScopeImpl;
                this.$down = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                return new C00501(this.$onPress, this.$pressScope, this.$down, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                return ((C00501) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = b.l();
                int i11 = this.label;
                if (i11 == 0) {
                    e.n(obj);
                    q<PressGestureScope, Offset, c<? super g2>, Object> qVar = this.$onPress;
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    Offset m2257boximpl = Offset.m2257boximpl(this.$down.m3732getPositionF1C5BW0());
                    this.label = 1;
                    if (qVar.invoke(pressGestureScopeImpl, m2257boximpl, this) == l11) {
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                return new AnonymousClass2(this.$pressScope, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
                this.$pressScope.cancel();
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                return new AnonymousClass3(this.$pressScope, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                return ((AnonymousClass3) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
                this.$pressScope.release();
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(r0 r0Var, q<? super PressGestureScope, ? super Offset, ? super c<? super g2>, ? extends Object> qVar, l<? super Offset, g2> lVar, PressGestureScopeImpl pressGestureScopeImpl, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$$this$coroutineScope = r0Var;
            this.$onPress = qVar;
            this.$onTap = lVar;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
        
            if (r0 == r6) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r3 = r16
                java.lang.Object r6 = kotlin.coroutines.intrinsics.b.l()
                int r0 = r3.label
                r7 = 2
                r8 = 1
                r9 = 0
                if (r0 == 0) goto L35
                if (r0 == r8) goto L25
                if (r0 != r7) goto L1d
                java.lang.Object r0 = r3.L$0
                c40.l2 r0 = (c40.l2) r0
                kotlin.e.n(r17)
                r11 = r0
                r0 = r17
                goto L8d
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                java.lang.Object r0 = r3.L$1
                c40.l2 r0 = (c40.l2) r0
                java.lang.Object r1 = r3.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.e.n(r17)
                r11 = r0
                r0 = r1
                r1 = r17
                goto L62
            L35:
                kotlin.e.n(r17)
                java.lang.Object r0 = r3.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                c40.r0 r10 = r3.$$this$coroutineScope
                kotlinx.coroutines.CoroutineStart r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.access$getCoroutineStartForCurrentDispatchBehavior()
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r3.$pressScope
                r13.<init>(r1, r9)
                r14 = 1
                r15 = 0
                r11 = 0
                c40.l2 r10 = c40.i.e(r10, r11, r12, r13, r14, r15)
                r3.L$0 = r0
                r3.L$1 = r10
                r3.label = r8
                r1 = 0
                r2 = 0
                r4 = 3
                r5 = 0
                java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
                if (r1 != r6) goto L61
                goto L8c
            L61:
                r11 = r10
            L62:
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                r1.consume()
                x00.q<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, j00.c<? super yz.g2>, java.lang.Object> r2 = r3.$onPress
                x00.q r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.access$getNoPressGesture$p()
                if (r2 == r4) goto L80
                c40.r0 r10 = r3.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                x00.q<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, j00.c<? super yz.g2>, java.lang.Object> r2 = r3.$onPress
                androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r3.$pressScope
                r13.<init>(r2, r4, r1, r9)
                r14 = 2
                r15 = 0
                r12 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt.launchAwaitingReset$default(r10, r11, r12, r13, r14, r15)
            L80:
                r3.L$0 = r11
                r3.L$1 = r9
                r3.label = r7
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(r0, r9, r3, r8, r9)
                if (r0 != r6) goto L8d
            L8c:
                return r6
            L8d:
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                if (r0 != 0) goto La1
                c40.r0 r10 = r3.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r3.$pressScope
                r13.<init>(r0, r9)
                r14 = 2
                r15 = 0
                r12 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt.launchAwaitingReset$default(r10, r11, r12, r13, r14, r15)
                goto Lc2
            La1:
                r0.consume()
                c40.r0 r10 = r3.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r3.$pressScope
                r13.<init>(r1, r9)
                r14 = 2
                r15 = 0
                r12 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt.launchAwaitingReset$default(r10, r11, r12, r13, r14, r15)
                x00.l<androidx.compose.ui.geometry.Offset, yz.g2> r1 = r3.$onTap
                if (r1 == 0) goto Lc2
                long r4 = r0.m3732getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m2257boximpl(r4)
                r1.invoke(r0)
            Lc2:
                yz.g2 r0 = yz.g2.f100423a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureDetectorKt$detectTapAndPress$2(PointerInputScope pointerInputScope, q<? super PressGestureScope, ? super Offset, ? super c<? super g2>, ? extends Object> qVar, l<? super Offset, g2> lVar, PressGestureScopeImpl pressGestureScopeImpl, c<? super TapGestureDetectorKt$detectTapAndPress$2> cVar) {
        super(2, cVar);
        this.$this_detectTapAndPress = pointerInputScope;
        this.$onPress = qVar;
        this.$onTap = lVar;
        this.$pressScope = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, cVar);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            r0 r0Var = (r0) this.L$0;
            PointerInputScope pointerInputScope = this.$this_detectTapAndPress;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(r0Var, this.$onPress, this.$onTap, this.$pressScope, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == l11) {
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
