package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.core.app.NotificationCompat;
import c40.r0;
import c40.s0;
import e40.o;
import e40.r;
import j00.c;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import l00.d;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,399:1\n102#2,2:400\n34#2,6:402\n104#2:408\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableNode\n*L\n238#1:400,2\n238#1:402,6\n238#1:408\n*E\n"})
/* loaded from: classes.dex */
final class TransformableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {

    @k
    private l<? super Offset, Boolean> canPan;
    private boolean enabled;
    private boolean lockRotationOnZoomPan;

    @m80.l
    private PointerInputModifierNode pointerInputModifierMouse;

    @m80.l
    private ScrollConfig scrollConfig;

    @k
    private TransformableState state;

    @k
    private final l<Offset, Boolean> updatedCanPan = new l<Offset, Boolean>() { // from class: androidx.compose.foundation.gestures.TransformableNode$updatedCanPan$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Boolean invoke(Offset offset) {
            return m530invokek4lQ0M(offset.m2278unboximpl());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final Boolean m530invokek4lQ0M(long j11) {
            l lVar;
            lVar = TransformableNode.this.canPan;
            return (Boolean) lVar.invoke(Offset.m2257boximpl(j11));
        }
    };

    @k
    private final o<TransformEvent> channel = r.d(Integer.MAX_VALUE, null, null, 6, null);

    @k
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", f = "Transformable.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
            final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransformableNode this$0;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @d(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", f = "Transformable.kt", i = {0, 0, 1}, l = {175, 178}, m = "invokeSuspend", n = {"$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch"}, s = {"L$0", "L$1", "L$0"})
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00521 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;
                final /* synthetic */ TransformableNode this$0;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @d(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", f = "Transformable.kt", i = {0}, l = {187}, m = "invokeSuspend", n = {"$this$transform"}, s = {"L$0"})
                /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00531 extends SuspendLambda implements p<TransformScope, c<? super g2>, Object> {
                    final /* synthetic */ Ref.ObjectRef<TransformEvent> $event;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;
                    final /* synthetic */ TransformableNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00531(Ref.ObjectRef<TransformEvent> objectRef, TransformableNode transformableNode, c<? super C00531> cVar) {
                        super(2, cVar);
                        this.$event = objectRef;
                        this.this$0 = transformableNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final c<g2> create(Object obj, c<?> cVar) {
                        C00531 c00531 = new C00531(this.$event, this.this$0, cVar);
                        c00531.L$0 = obj;
                        return c00531;
                    }

                    @Override // x00.p
                    public final Object invoke(TransformScope transformScope, c<? super g2> cVar) {
                        return ((C00531) create(transformScope, cVar)).invokeSuspend(g2.f100423a);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005a -> B:5:0x005d). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                        /*
                            r6 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                            int r1 = r6.label
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r1 = r6.L$1
                            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                            java.lang.Object r3 = r6.L$0
                            androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                            kotlin.e.n(r7)
                            goto L5d
                        L17:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L1f:
                            kotlin.e.n(r7)
                            java.lang.Object r7 = r6.L$0
                            androidx.compose.foundation.gestures.TransformScope r7 = (androidx.compose.foundation.gestures.TransformScope) r7
                            r3 = r7
                        L27:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r7 = r6.$event
                            T r7 = r7.element
                            boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                            if (r1 != 0) goto L60
                            boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                            if (r1 == 0) goto L36
                            androidx.compose.foundation.gestures.TransformEvent$TransformDelta r7 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r7
                            goto L37
                        L36:
                            r7 = 0
                        L37:
                            if (r7 == 0) goto L48
                            float r1 = r7.getZoomChange()
                            long r4 = r7.m525getPanChangeF1C5BW0()
                            float r7 = r7.getRotationChange()
                            r3.mo413transformByd4ec7I(r1, r4, r7)
                        L48:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r1 = r6.$event
                            androidx.compose.foundation.gestures.TransformableNode r7 = r6.this$0
                            e40.o r7 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r7)
                            r6.L$0 = r3
                            r6.L$1 = r1
                            r6.label = r2
                            java.lang.Object r7 = r7.H(r6)
                            if (r7 != r0) goto L5d
                            return r0
                        L5d:
                            r1.element = r7
                            goto L27
                        L60:
                            yz.g2 r7 = yz.g2.f100423a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00521.C00531.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00521(TransformableNode transformableNode, c<? super C00521> cVar) {
                    super(2, cVar);
                    this.this$0 = transformableNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final c<g2> create(Object obj, c<?> cVar) {
                    C00521 c00521 = new C00521(this.this$0, cVar);
                    c00521.L$0 = obj;
                    return c00521;
                }

                @Override // x00.p
                public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                    return ((C00521) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
                
                    if (r10.transform(r1, r6, r9) == r0) goto L23;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0080 -> B:9:0x0036). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r9.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2f
                        if (r1 == r3) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r9.L$0
                        c40.r0 r1 = (c40.r0) r1
                        kotlin.e.n(r10)     // Catch: java.util.concurrent.CancellationException -> L15
                    L15:
                        r10 = r1
                        goto L36
                    L17:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L1f:
                        java.lang.Object r1 = r9.L$2
                        kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                        java.lang.Object r4 = r9.L$1
                        kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                        java.lang.Object r5 = r9.L$0
                        c40.r0 r5 = (c40.r0) r5
                        kotlin.e.n(r10)
                        goto L59
                    L2f:
                        kotlin.e.n(r10)
                        java.lang.Object r10 = r9.L$0
                        c40.r0 r10 = (c40.r0) r10
                    L36:
                        boolean r1 = c40.s0.k(r10)
                        if (r1 == 0) goto L82
                        kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                        r1.<init>()
                        androidx.compose.foundation.gestures.TransformableNode r4 = r9.this$0
                        e40.o r4 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r4)
                        r9.L$0 = r10
                        r9.L$1 = r1
                        r9.L$2 = r1
                        r9.label = r3
                        java.lang.Object r4 = r4.H(r9)
                        if (r4 != r0) goto L56
                        goto L7f
                    L56:
                        r5 = r10
                        r10 = r4
                        r4 = r1
                    L59:
                        r1.element = r10
                        T r10 = r4.element
                        boolean r10 = r10 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                        if (r10 == 0) goto L80
                        androidx.compose.foundation.gestures.TransformableNode r10 = r9.this$0     // Catch: java.util.concurrent.CancellationException -> L80
                        androidx.compose.foundation.gestures.TransformableState r10 = androidx.compose.foundation.gestures.TransformableNode.access$getState$p(r10)     // Catch: java.util.concurrent.CancellationException -> L80
                        androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.util.concurrent.CancellationException -> L80
                        androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1 r6 = new androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1     // Catch: java.util.concurrent.CancellationException -> L80
                        androidx.compose.foundation.gestures.TransformableNode r7 = r9.this$0     // Catch: java.util.concurrent.CancellationException -> L80
                        r8 = 0
                        r6.<init>(r4, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L80
                        r9.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> L80
                        r9.L$1 = r8     // Catch: java.util.concurrent.CancellationException -> L80
                        r9.L$2 = r8     // Catch: java.util.concurrent.CancellationException -> L80
                        r9.label = r2     // Catch: java.util.concurrent.CancellationException -> L80
                        java.lang.Object r10 = r10.transform(r1, r6, r9)     // Catch: java.util.concurrent.CancellationException -> L80
                        if (r10 != r0) goto L80
                    L7f:
                        return r0
                    L80:
                        r10 = r5
                        goto L36
                    L82:
                        yz.g2 r10 = yz.g2.f100423a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00521.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @d(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", f = "Transformable.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
                final /* synthetic */ r0 $$this$coroutineScope;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TransformableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(TransformableNode transformableNode, r0 r0Var, c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.this$0 = transformableNode;
                    this.$$this$coroutineScope = r0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final c<g2> create(Object obj, c<?> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$$this$coroutineScope, cVar);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // x00.p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
                    return ((AnonymousClass2) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    o oVar;
                    boolean z11;
                    o oVar2;
                    l lVar;
                    Object detectZoom;
                    Object l11 = b.l();
                    int i11 = this.label;
                    try {
                        try {
                            if (i11 == 0) {
                                e.n(obj);
                                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                z11 = this.this$0.lockRotationOnZoomPan;
                                oVar2 = this.this$0.channel;
                                lVar = this.this$0.updatedCanPan;
                                this.label = 1;
                                detectZoom = TransformableKt.detectZoom(awaitPointerEventScope, z11, oVar2, lVar, this);
                                if (detectZoom == l11) {
                                    return l11;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                e.n(obj);
                            }
                        } catch (CancellationException e11) {
                            if (!s0.k(this.$$this$coroutineScope)) {
                                throw e11;
                            }
                        }
                        return g2.f100423a;
                    } finally {
                        oVar = this.this$0.channel;
                        oVar.m(TransformEvent.TransformStopped.INSTANCE);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, TransformableNode transformableNode, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                this.this$0 = transformableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_SuspendingPointerInputModifierNode, this.this$0, cVar);
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
                    c40.k.f(r0Var, null, CoroutineStart.UNDISPATCHED, new C00521(this.this$0, null), 1, null);
                    PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, r0Var, null);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass2, this) == l11) {
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

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, c<? super g2> cVar) {
            boolean z11;
            z11 = TransformableNode.this.enabled;
            if (!z11) {
                return g2.f100423a;
            }
            Object g11 = s0.g(new AnonymousClass1(pointerInputScope, TransformableNode.this, null), cVar);
            return g11 == b.l() ? g11 : g2.f100423a;
        }
    }));

    public TransformableNode(@k TransformableState transformableState, @k l<? super Offset, Boolean> lVar, boolean z11, boolean z12) {
        this.state = transformableState;
        this.canPan = lVar;
        this.lockRotationOnZoomPan = z11;
        this.enabled = z12;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.scrollConfig = AndroidScrollable_androidKt.platformScrollConfig(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
        PointerInputModifierNode pointerInputModifierNode = this.pointerInputModifierMouse;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.onCancelPointerInput();
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo205onPointerEventH0pRuoY(@k PointerEvent pointerEvent, @k PointerEventPass pointerEventPass, long j11) {
        final ScrollConfig scrollConfig = this.scrollConfig;
        if (this.enabled) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                if (!PointerType.m3803equalsimpl0(changes.get(i11).m3735getTypeT8wyACA(), PointerType.Companion.m3808getMouseT8wyACA())) {
                    i11++;
                } else if (scrollConfig != null && this.pointerInputModifierMouse == null) {
                    this.pointerInputModifierMouse = (PointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$onPointerEvent$2
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, c<? super g2> cVar) {
                            o oVar;
                            Object detectZoomByCtrlMouseScroll;
                            oVar = TransformableNode.this.channel;
                            detectZoomByCtrlMouseScroll = TransformableKt.detectZoomByCtrlMouseScroll(pointerInputScope, oVar, scrollConfig, cVar);
                            return detectZoomByCtrlMouseScroll == b.l() ? detectZoomByCtrlMouseScroll : g2.f100423a;
                        }
                    }));
                }
            }
        }
        this.pointerInputNode.mo205onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j11);
        PointerInputModifierNode pointerInputModifierNode = this.pointerInputModifierMouse;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.mo205onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j11);
        }
    }

    public final void update(@k TransformableState transformableState, @k l<? super Offset, Boolean> lVar, boolean z11, boolean z12) {
        this.canPan = lVar;
        if (g0.g(this.state, transformableState) && this.enabled == z12 && this.lockRotationOnZoomPan == z11) {
            return;
        }
        this.state = transformableState;
        this.enabled = z12;
        this.lockRotationOnZoomPan = z11;
        this.pointerInputNode.resetPointerInputHandler();
    }
}
