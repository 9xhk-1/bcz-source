package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.VelocityKt;
import c40.r0;
import c40.s0;
import e40.o;
import e40.r;
import e40.s;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DragGestureNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,640:1\n1#2:641\n*E\n"})
/* loaded from: classes.dex */
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode {
    public static final int $stable = 8;

    @k
    private final l<PointerInputChange, Boolean> _canDrag = new l<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$_canDrag$1
        {
            super(1);
        }

        @Override // x00.l
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return DragGestureNode.this.getCanDrag().invoke(pointerInputChange);
        }
    };

    @k
    private l<? super PointerInputChange, Boolean> canDrag;

    @m80.l
    private o<DragEvent> channel;

    @m80.l
    private DragInteraction.Start dragInteraction;
    private boolean enabled;

    @m80.l
    private MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;

    @m80.l
    private Orientation orientationLock;

    @m80.l
    private SuspendingPointerInputModifierNode pointerInputNode;

    public DragGestureNode(@k l<? super PointerInputChange, Boolean> lVar, boolean z11, @m80.l MutableInteractionSource mutableInteractionSource, @m80.l Orientation orientation) {
        this.orientationLock = orientation;
        this.canDrag = lVar;
        this.enabled = z11;
        this.interactionSource = mutableInteractionSource;
    }

    private final SuspendingPointerInputModifierNode initializePointerInputNode() {
        return SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @d(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {512}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
            /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
                final /* synthetic */ p<PointerInputChange, Offset, g2> $onDrag;
                final /* synthetic */ a<g2> $onDragCancel;
                final /* synthetic */ l<PointerInputChange, g2> $onDragEnd;
                final /* synthetic */ q<PointerInputChange, PointerInputChange, Offset, g2> $onDragStart;
                final /* synthetic */ a<Boolean> $shouldAwaitTouchSlop;
                final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DragGestureNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(DragGestureNode dragGestureNode, PointerInputScope pointerInputScope, q<? super PointerInputChange, ? super PointerInputChange, ? super Offset, g2> qVar, l<? super PointerInputChange, g2> lVar, a<g2> aVar, a<Boolean> aVar2, p<? super PointerInputChange, ? super Offset, g2> pVar, c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = dragGestureNode;
                    this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                    this.$onDragStart = qVar;
                    this.$onDragEnd = lVar;
                    this.$onDragCancel = aVar;
                    this.$shouldAwaitTouchSlop = aVar2;
                    this.$onDrag = pVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final c<g2> create(Object obj, c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_SuspendingPointerInputModifierNode, this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$shouldAwaitTouchSlop, this.$onDrag, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // x00.p
                public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                    return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                    /*
                        r11 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r11.label
                        r2 = 1
                        if (r1 == 0) goto L21
                        if (r1 != r2) goto L19
                        java.lang.Object r0 = r11.L$0
                        r1 = r0
                        c40.r0 r1 = (c40.r0) r1
                        kotlin.e.n(r12)     // Catch: java.util.concurrent.CancellationException -> L15
                        r10 = r11
                        goto L64
                    L15:
                        r0 = move-exception
                        r12 = r0
                        r10 = r11
                        goto L4d
                    L19:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    L21:
                        kotlin.e.n(r12)
                        java.lang.Object r12 = r11.L$0
                        r1 = r12
                        c40.r0 r1 = (c40.r0) r1
                        androidx.compose.foundation.gestures.DragGestureNode r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L4a
                        androidx.compose.foundation.gestures.Orientation r8 = androidx.compose.foundation.gestures.DragGestureNode.access$getOrientationLock$p(r12)     // Catch: java.util.concurrent.CancellationException -> L4a
                        androidx.compose.ui.input.pointer.PointerInputScope r3 = r11.$this_SuspendingPointerInputModifierNode     // Catch: java.util.concurrent.CancellationException -> L4a
                        x00.q<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, yz.g2> r4 = r11.$onDragStart     // Catch: java.util.concurrent.CancellationException -> L4a
                        x00.l<androidx.compose.ui.input.pointer.PointerInputChange, yz.g2> r5 = r11.$onDragEnd     // Catch: java.util.concurrent.CancellationException -> L4a
                        x00.a<yz.g2> r6 = r11.$onDragCancel     // Catch: java.util.concurrent.CancellationException -> L4a
                        x00.a<java.lang.Boolean> r7 = r11.$shouldAwaitTouchSlop     // Catch: java.util.concurrent.CancellationException -> L4a
                        x00.p<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, yz.g2> r9 = r11.$onDrag     // Catch: java.util.concurrent.CancellationException -> L4a
                        r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L4a
                        r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L4a
                        r10 = r11
                        java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L47
                        if (r12 != r0) goto L64
                        return r0
                    L47:
                        r0 = move-exception
                    L48:
                        r12 = r0
                        goto L4d
                    L4a:
                        r0 = move-exception
                        r10 = r11
                        goto L48
                    L4d:
                        androidx.compose.foundation.gestures.DragGestureNode r0 = r10.this$0
                        e40.o r0 = androidx.compose.foundation.gestures.DragGestureNode.access$getChannel$p(r0)
                        if (r0 == 0) goto L5e
                        androidx.compose.foundation.gestures.DragEvent$DragCancelled r2 = androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE
                        java.lang.Object r0 = r0.m(r2)
                        e40.s.b(r0)
                    L5e:
                        boolean r0 = c40.s0.k(r1)
                        if (r0 == 0) goto L67
                    L64:
                        yz.g2 r12 = yz.g2.f100423a
                        return r12
                    L67:
                        throw r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(final PointerInputScope pointerInputScope, c<? super g2> cVar) {
                final VelocityTracker velocityTracker = new VelocityTracker();
                final DragGestureNode dragGestureNode = DragGestureNode.this;
                q<PointerInputChange, PointerInputChange, Offset, g2> qVar = new q<PointerInputChange, PointerInputChange, Offset, g2>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragStart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // x00.q
                    public /* bridge */ /* synthetic */ g2 invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
                        m444invoke0AR0LA0(pointerInputChange, pointerInputChange2, offset.m2278unboximpl());
                        return g2.f100423a;
                    }

                    /* renamed from: invoke-0AR0LA0, reason: not valid java name */
                    public final void m444invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j11) {
                        boolean z11;
                        o oVar;
                        o oVar2;
                        if (DragGestureNode.this.getCanDrag().invoke(pointerInputChange).booleanValue()) {
                            z11 = DragGestureNode.this.isListeningForEvents;
                            if (!z11) {
                                oVar2 = DragGestureNode.this.channel;
                                if (oVar2 == null) {
                                    DragGestureNode.this.channel = r.d(Integer.MAX_VALUE, null, null, 6, null);
                                }
                                DragGestureNode.this.startListeningForEvents();
                            }
                            VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                            long m2272minusMKHz9U = Offset.m2272minusMKHz9U(pointerInputChange2.m3732getPositionF1C5BW0(), j11);
                            oVar = DragGestureNode.this.channel;
                            if (oVar != null) {
                                s.b(oVar.m(new DragEvent.DragStarted(m2272minusMKHz9U, null)));
                            }
                        }
                    }
                };
                final DragGestureNode dragGestureNode2 = DragGestureNode.this;
                l<PointerInputChange, g2> lVar = new l<PointerInputChange, g2>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragEnd$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(PointerInputChange pointerInputChange) {
                        invoke2(pointerInputChange);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PointerInputChange pointerInputChange) {
                        o oVar;
                        long m454toValidVelocityTH1AsA0;
                        VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, pointerInputChange);
                        float maximumFlingVelocity = pointerInputScope.getViewConfiguration().getMaximumFlingVelocity();
                        long m3830calculateVelocityAH228Gc = VelocityTracker.this.m3830calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
                        VelocityTracker.this.resetTracking();
                        oVar = dragGestureNode2.channel;
                        if (oVar != null) {
                            m454toValidVelocityTH1AsA0 = DraggableKt.m454toValidVelocityTH1AsA0(m3830calculateVelocityAH228Gc);
                            s.b(oVar.m(new DragEvent.DragStopped(m454toValidVelocityTH1AsA0, null)));
                        }
                    }
                };
                final DragGestureNode dragGestureNode3 = DragGestureNode.this;
                a<g2> aVar = new a<g2>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragCancel$1
                    {
                        super(0);
                    }

                    @Override // x00.a
                    public /* bridge */ /* synthetic */ g2 invoke() {
                        invoke2();
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        o oVar;
                        oVar = DragGestureNode.this.channel;
                        if (oVar != null) {
                            s.b(oVar.m(DragEvent.DragCancelled.INSTANCE));
                        }
                    }
                };
                final DragGestureNode dragGestureNode4 = DragGestureNode.this;
                a<Boolean> aVar2 = new a<Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final Boolean invoke() {
                        return Boolean.valueOf(!DragGestureNode.this.startDragImmediately());
                    }
                };
                final DragGestureNode dragGestureNode5 = DragGestureNode.this;
                Object g11 = s0.g(new AnonymousClass1(DragGestureNode.this, pointerInputScope, qVar, lVar, aVar, aVar2, new p<PointerInputChange, Offset, g2>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDrag$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // x00.p
                    public /* bridge */ /* synthetic */ g2 invoke(PointerInputChange pointerInputChange, Offset offset) {
                        m443invokeUv8p0NA(pointerInputChange, offset.m2278unboximpl());
                        return g2.f100423a;
                    }

                    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                    public final void m443invokeUv8p0NA(PointerInputChange pointerInputChange, long j11) {
                        o oVar;
                        VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, pointerInputChange);
                        oVar = dragGestureNode5.channel;
                        if (oVar != null) {
                            s.b(oVar.m(new DragEvent.DragDelta(j11, null)));
                        }
                    }
                }, null), cVar);
                return g11 == b.l() ? g11 : g2.f100423a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragCancel(j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.e.n(r6)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.e.n(r6)
            androidx.compose.foundation.interaction.DragInteraction$Start r6 = r5.dragInteraction
            if (r6 == 0) goto L55
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r5.interactionSource
            if (r2 == 0) goto L50
            androidx.compose.foundation.interaction.DragInteraction$Cancel r4 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r4.<init>(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r2.emit(r4, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r0 = r5
        L51:
            r6 = 0
            r0.dragInteraction = r6
            goto L56
        L55:
            r0 = r5
        L56:
            androidx.compose.ui.unit.Velocity$Companion r6 = androidx.compose.ui.unit.Velocity.Companion
            long r1 = r6.m5364getZero9UxMQ8M()
            r0.mo396onDragStoppedTH1AsA0(r1)
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragCancel(j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r2.emit(r5, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStart(androidx.compose.foundation.gestures.DragEvent.DragStarted r7, j00.c<? super yz.g2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.L$2
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = (androidx.compose.foundation.interaction.DragInteraction.Start) r7
            java.lang.Object r1 = r0.L$1
            androidx.compose.foundation.gestures.DragEvent$DragStarted r1 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.e.n(r8)
            goto L85
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.L$1
            androidx.compose.foundation.gestures.DragEvent$DragStarted r7 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r7
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragGestureNode r2 = (androidx.compose.foundation.gestures.DragGestureNode) r2
            kotlin.e.n(r8)
            goto L6a
        L4c:
            kotlin.e.n(r8)
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = r6.dragInteraction
            if (r8 == 0) goto L69
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r6.interactionSource
            if (r2 == 0) goto L69
            androidx.compose.foundation.interaction.DragInteraction$Cancel r5 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r5.<init>(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r2.emit(r5, r0)
            if (r8 != r1) goto L69
            goto L81
        L69:
            r2 = r6
        L6a:
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r8.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r2.interactionSource
            if (r4 == 0) goto L88
            r0.L$0 = r2
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r0 = r4.emit(r8, r0)
            if (r0 != r1) goto L82
        L81:
            return r1
        L82:
            r1 = r7
            r7 = r8
            r0 = r2
        L85:
            r8 = r7
            r2 = r0
            r7 = r1
        L88:
            r2.dragInteraction = r8
            long r7 = r7.m415getStartPointF1C5BW0()
            r2.mo395onDragStartedk4lQ0M(r7)
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragStart(androidx.compose.foundation.gestures.DragEvent$DragStarted, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStop(androidx.compose.foundation.gestures.DragEvent.DragStopped r6, j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.gestures.DragEvent$DragStopped r6 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r6
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.e.n(r7)
            goto L57
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.e.n(r7)
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = r5.dragInteraction
            if (r7 == 0) goto L5b
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r5.interactionSource
            if (r2 == 0) goto L56
            androidx.compose.foundation.interaction.DragInteraction$Stop r4 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r4.<init>(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r2.emit(r4, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r0 = r5
        L57:
            r7 = 0
            r0.dragInteraction = r7
            goto L5c
        L5b:
            r0 = r5
        L5c:
            long r6 = r6.m416getVelocity9UxMQ8M()
            r0.mo396onDragStoppedTH1AsA0(r6)
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragStop(androidx.compose.foundation.gestures.DragEvent$DragStopped, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListeningForEvents() {
        this.isListeningForEvents = true;
        c40.k.f(getCoroutineScope(), null, null, new DragGestureNode$startListeningForEvents$1(this, null), 3, null);
    }

    public static /* synthetic */ void update$default(DragGestureNode dragGestureNode, l lVar, boolean z11, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i11 & 1) != 0) {
            lVar = dragGestureNode.canDrag;
        }
        if ((i11 & 2) != 0) {
            z11 = dragGestureNode.enabled;
        }
        if ((i11 & 4) != 0) {
            mutableInteractionSource = dragGestureNode.interactionSource;
        }
        if ((i11 & 8) != 0) {
            orientation = dragGestureNode.orientationLock;
        }
        if ((i11 & 16) != 0) {
            z12 = false;
        }
        boolean z13 = z12;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        l lVar2 = lVar;
        dragGestureNode.update(lVar2, z11, mutableInteractionSource2, orientation, z13);
    }

    public final void disposeInteractionSource() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }

    @m80.l
    public abstract Object drag(@k p<? super l<? super DragEvent.DragDelta, g2>, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar);

    @k
    public final l<PointerInputChange, Boolean> getCanDrag() {
        return this.canDrag;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @m80.l
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
    }

    /* renamed from: onDragStarted-k-4lQ0M */
    public abstract void mo395onDragStartedk4lQ0M(long j11);

    /* renamed from: onDragStopped-TH1AsA0 */
    public abstract void mo396onDragStoppedTH1AsA0(long j11);

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo205onPointerEventH0pRuoY(@k PointerEvent pointerEvent, @k PointerEventPass pointerEventPass, long j11) {
        if (this.enabled && this.pointerInputNode == null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(initializePointerInputNode());
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo205onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j11);
        }
    }

    public abstract boolean startDragImmediately();

    public final void update(@k l<? super PointerInputChange, Boolean> lVar, boolean z11, @m80.l MutableInteractionSource mutableInteractionSource, @m80.l Orientation orientation, boolean z12) {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode;
        this.canDrag = lVar;
        boolean z13 = true;
        if (this.enabled != z11) {
            this.enabled = z11;
            if (!z11) {
                disposeInteractionSource();
                SuspendingPointerInputModifierNode suspendingPointerInputModifierNode2 = this.pointerInputNode;
                if (suspendingPointerInputModifierNode2 != null) {
                    undelegate(suspendingPointerInputModifierNode2);
                }
                this.pointerInputNode = null;
            }
            z12 = true;
        }
        if (!g0.g(this.interactionSource, mutableInteractionSource)) {
            disposeInteractionSource();
            this.interactionSource = mutableInteractionSource;
        }
        if (this.orientationLock != orientation) {
            this.orientationLock = orientation;
        } else {
            z13 = z12;
        }
        if (!z13 || (suspendingPointerInputModifierNode = this.pointerInputNode) == null) {
            return;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
    }
}
