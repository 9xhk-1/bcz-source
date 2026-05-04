package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c40.l2;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ l<Offset, g2> $onDoubleTap;
    final /* synthetic */ l<Offset, g2> $onLongPress;
    final /* synthetic */ q<PressGestureScope, Offset, c<? super g2>, Object> $onPress;
    final /* synthetic */ l<Offset, g2> $onTap;
    final /* synthetic */ PointerInputScope $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7}, l = {105, 116, 119, 122, 149, 167, 169, 180}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "resetJob", "$this$awaitEachGesture", "down", "resetJob", "resetJob", "$this$awaitEachGesture", "upOrCancel", "cancelOrReleaseJob", "resetJob", "upOrCancel", "$this$awaitEachGesture", "resetJob", "upOrCancel", "secondDown", "resetJob"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
        final /* synthetic */ r0 $$this$coroutineScope;
        final /* synthetic */ l<Offset, g2> $onDoubleTap;
        final /* synthetic */ l<Offset, g2> $onLongPress;
        final /* synthetic */ q<PressGestureScope, Offset, c<? super g2>, Object> $onPress;
        final /* synthetic */ l<Offset, g2> $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00511 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
            final /* synthetic */ PointerInputChange $down;
            final /* synthetic */ q<PressGestureScope, Offset, c<? super g2>, Object> $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00511(q<? super PressGestureScope, ? super Offset, ? super c<? super g2>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, c<? super C00511> cVar) {
                super(2, cVar);
                this.$onPress = qVar;
                this.$pressScope = pressGestureScopeImpl;
                this.$down = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                return new C00511(this.$onPress, this.$pressScope, this.$down, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                return ((C00511) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
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
        @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name */
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
                this.$pressScope.release();
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
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
                this.$pressScope.cancel();
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, c<? super AnonymousClass4> cVar) {
                super(2, cVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                return new AnonymousClass4(this.$pressScope, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                return ((AnonymousClass4) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", i = {}, l = {157, 158}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
            final /* synthetic */ l2 $cancelOrReleaseJob;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(l2 l2Var, PressGestureScopeImpl pressGestureScopeImpl, c<? super AnonymousClass5> cVar) {
                super(2, cVar);
                this.$cancelOrReleaseJob = l2Var;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                return new AnonymousClass5(this.$cancelOrReleaseJob, this.$pressScope, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                return ((AnonymousClass5) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
            
                if (r5.reset(r4) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
            
                if (r5.K0(r4) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r4.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.e.n(r5)
                    goto L37
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    kotlin.e.n(r5)
                    goto L2c
                L1e:
                    kotlin.e.n(r5)
                    c40.l2 r5 = r4.$cancelOrReleaseJob
                    r4.label = r3
                    java.lang.Object r5 = r5.K0(r4)
                    if (r5 != r0) goto L2c
                    goto L36
                L2c:
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r5 = r4.$pressScope
                    r4.label = r2
                    java.lang.Object r5 = r5.reset(r4)
                    if (r5 != r0) goto L37
                L36:
                    return r0
                L37:
                    yz.g2 r5 = yz.g2.f100423a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
        public static final class AnonymousClass6 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
            final /* synthetic */ q<PressGestureScope, Offset, c<? super g2>, Object> $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            final /* synthetic */ PointerInputChange $secondDown;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass6(q<? super PressGestureScope, ? super Offset, ? super c<? super g2>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, c<? super AnonymousClass6> cVar) {
                super(2, cVar);
                this.$onPress = qVar;
                this.$pressScope = pressGestureScopeImpl;
                this.$secondDown = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                return new AnonymousClass6(this.$onPress, this.$pressScope, this.$secondDown, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                return ((AnonymousClass6) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = b.l();
                int i11 = this.label;
                if (i11 == 0) {
                    e.n(obj);
                    q<PressGestureScope, Offset, c<? super g2>, Object> qVar = this.$onPress;
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    Offset m2257boximpl = Offset.m2257boximpl(this.$secondDown.m3732getPositionF1C5BW0());
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
        @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
        public static final class AnonymousClass7 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(PressGestureScopeImpl pressGestureScopeImpl, c<? super AnonymousClass7> cVar) {
                super(2, cVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                return new AnonymousClass7(this.$pressScope, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                return ((AnonymousClass7) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
        public static final class AnonymousClass8 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(PressGestureScopeImpl pressGestureScopeImpl, c<? super AnonymousClass8> cVar) {
                super(2, cVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                return new AnonymousClass8(this.$pressScope, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                return ((AnonymousClass8) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(r0 r0Var, q<? super PressGestureScope, ? super Offset, ? super c<? super g2>, ? extends Object> qVar, l<? super Offset, g2> lVar, l<? super Offset, g2> lVar2, l<? super Offset, g2> lVar3, PressGestureScopeImpl pressGestureScopeImpl, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$$this$coroutineScope = r0Var;
            this.$onPress = qVar;
            this.$onLongPress = lVar;
            this.$onDoubleTap = lVar2;
            this.$onTap = lVar3;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x012b, code lost:
        
            if (r1 == r6) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x019c, code lost:
        
            if (r4 == r6) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x00ee, code lost:
        
            if (r1 == r6) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0103, code lost:
        
            if (r4 == r6) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x00a2, code lost:
        
            if (r1 == r6) goto L80;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0273  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0293  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 728
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureDetectorKt$detectTapGestures$2(PointerInputScope pointerInputScope, q<? super PressGestureScope, ? super Offset, ? super c<? super g2>, ? extends Object> qVar, l<? super Offset, g2> lVar, l<? super Offset, g2> lVar2, l<? super Offset, g2> lVar3, c<? super TapGestureDetectorKt$detectTapGestures$2> cVar) {
        super(2, cVar);
        this.$this_detectTapGestures = pointerInputScope;
        this.$onPress = qVar;
        this.$onLongPress = lVar;
        this.$onDoubleTap = lVar2;
        this.$onTap = lVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, cVar);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            r0 r0Var = (r0) this.L$0;
            PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
            PointerInputScope pointerInputScope = this.$this_detectTapGestures;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(r0Var, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, pressGestureScopeImpl, null);
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
