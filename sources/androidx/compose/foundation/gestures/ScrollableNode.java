package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c40.r0;
import com.badlogic.gdx.graphics.f;
import j00.c;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1037:1\n59#2:1038\n54#2:1044\n90#3:1039\n53#3,3:1041\n85#3:1045\n53#3,3:1047\n30#4:1040\n30#4:1046\n102#5,2:1050\n34#5,6:1052\n104#5:1058\n1#6:1059\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode\n*L\n445#1:1038\n456#1:1044\n445#1:1039\n454#1:1041,3\n456#1:1045\n465#1:1047,3\n454#1:1040\n465#1:1046\n495#1:1050,2\n495#1:1052,6\n495#1:1058\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollableNode extends DragGestureNode implements KeyInputModifierNode, SemanticsModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    @k
    private final ContentInViewNode contentInViewNode;

    @k
    private final DefaultFlingBehavior defaultFlingBehavior;

    @l
    private FlingBehavior flingBehavior;

    @l
    private MouseWheelScrollingLogic mouseWheelScrollingLogic;

    @k
    private final ScrollableNestedScrollConnection nestedScrollConnection;

    @k
    private final NestedScrollDispatcher nestedScrollDispatcher;

    @l
    private OverscrollEffect overscrollEffect;

    @l
    private p<? super Float, ? super Float, Boolean> scrollByAction;

    @l
    private p<? super Offset, ? super c<? super Offset>, ? extends Object> scrollByOffsetAction;

    @k
    private final ScrollableContainerNode scrollableContainerNode;

    @k
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.foundation.gestures.FlingBehavior] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ScrollableNode(@m80.k androidx.compose.foundation.gestures.ScrollableState r12, @m80.l androidx.compose.foundation.OverscrollEffect r13, @m80.l androidx.compose.foundation.gestures.FlingBehavior r14, @m80.k androidx.compose.foundation.gestures.Orientation r15, boolean r16, boolean r17, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r18, @m80.l androidx.compose.foundation.gestures.BringIntoViewSpec r19) {
        /*
            r11 = this;
            r0 = r16
            x00.l r1 = androidx.compose.foundation.gestures.ScrollableKt.access$getCanDragCalculation$p()
            r2 = r18
            r11.<init>(r1, r0, r2, r15)
            r11.overscrollEffect = r13
            r11.flingBehavior = r14
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r8 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r8.<init>()
            r11.nestedScrollDispatcher = r8
            androidx.compose.foundation.gestures.ScrollableContainerNode r13 = new androidx.compose.foundation.gestures.ScrollableContainerNode
            r13.<init>(r0)
            androidx.compose.ui.node.DelegatableNode r13 = r11.delegate(r13)
            androidx.compose.foundation.gestures.ScrollableContainerNode r13 = (androidx.compose.foundation.gestures.ScrollableContainerNode) r13
            r11.scrollableContainerNode = r13
            androidx.compose.foundation.gestures.DefaultFlingBehavior r13 = new androidx.compose.foundation.gestures.DefaultFlingBehavior
            androidx.compose.foundation.gestures.ScrollableKt$UnityDensity$1 r14 = androidx.compose.foundation.gestures.ScrollableKt.access$getUnityDensity$p()
            androidx.compose.animation.core.DecayAnimationSpec r14 = androidx.compose.animation.SplineBasedDecayKt.splineBasedDecay(r14)
            r1 = 0
            r10 = 2
            r13.<init>(r14, r1, r10, r1)
            r11.defaultFlingBehavior = r13
            androidx.compose.foundation.OverscrollEffect r4 = r11.overscrollEffect
            androidx.compose.foundation.gestures.FlingBehavior r14 = r11.flingBehavior
            if (r14 != 0) goto L3c
            r5 = r13
            goto L3d
        L3c:
            r5 = r14
        L3d:
            androidx.compose.foundation.gestures.ScrollingLogic r2 = new androidx.compose.foundation.gestures.ScrollingLogic
            androidx.compose.foundation.gestures.ScrollableNode$scrollingLogic$1 r9 = new androidx.compose.foundation.gestures.ScrollableNode$scrollingLogic$1
            r9.<init>()
            r3 = r12
            r6 = r15
            r7 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11.scrollingLogic = r2
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection r12 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection
            r12.<init>(r2, r0)
            r11.nestedScrollConnection = r12
            androidx.compose.foundation.gestures.ContentInViewNode r13 = new androidx.compose.foundation.gestures.ContentInViewNode
            r14 = r19
            r13.<init>(r15, r2, r7, r14)
            androidx.compose.ui.node.DelegatableNode r13 = r11.delegate(r13)
            androidx.compose.foundation.gestures.ContentInViewNode r13 = (androidx.compose.foundation.gestures.ContentInViewNode) r13
            r11.contentInViewNode = r13
            androidx.compose.ui.node.DelegatableNode r12 = androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.nestedScrollModifierNode(r12, r8)
            r11.delegate(r12)
            androidx.compose.ui.focus.Focusability$Companion r12 = androidx.compose.ui.focus.Focusability.Companion
            int r12 = r12.m2205getNeverLCbbffg()
            androidx.compose.ui.focus.FocusTargetModifierNode r12 = androidx.compose.ui.focus.FocusTargetModifierNodeKt.m2186FocusTargetModifierNodePYyLHbc$default(r12, r1, r10, r1)
            r11.delegate(r12)
            androidx.compose.foundation.relocation.BringIntoViewResponderNode r12 = new androidx.compose.foundation.relocation.BringIntoViewResponderNode
            r12.<init>(r13)
            r11.delegate(r12)
            androidx.compose.foundation.FocusedBoundsObserverNode r12 = new androidx.compose.foundation.FocusedBoundsObserverNode
            androidx.compose.foundation.gestures.ScrollableNode$1 r13 = new androidx.compose.foundation.gestures.ScrollableNode$1
            r13.<init>()
            r12.<init>(r13)
            r11.delegate(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNode.<init>(androidx.compose.foundation.gestures.ScrollableState, androidx.compose.foundation.OverscrollEffect, androidx.compose.foundation.gestures.FlingBehavior, androidx.compose.foundation.gestures.Orientation, boolean, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.gestures.BringIntoViewSpec):void");
    }

    private final void clearScrollSemanticsActions() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    private final void ensureMouseWheelScrollNodeInitialized() {
        if (this.mouseWheelScrollingLogic == null) {
            this.mouseWheelScrollingLogic = new MouseWheelScrollingLogic(this.scrollingLogic, AndroidScrollable_androidKt.platformScrollConfig(this), new ScrollableNode$ensureMouseWheelScrollNodeInitialized$1(this), DelegatableNodeKt.requireDensity(this));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.startReceivingMouseWheelEvents(getCoroutineScope());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped(ScrollableNode scrollableNode, long j11, c cVar) {
        scrollableNode.m499onWheelScrollStoppedTH1AsA0(j11);
        return g2.f100423a;
    }

    /* renamed from: onWheelScrollStopped-TH1AsA0, reason: not valid java name */
    private final void m499onWheelScrollStoppedTH1AsA0(long j11) {
        c40.k.f(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onWheelScrollStopped$1(this, j11, null), 3, null);
    }

    private final void setScrollSemanticsActions() {
        this.scrollByAction = new p<Float, Float, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @d(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", i = {}, l = {f.f11614k2}, m = "invokeSuspend", n = {}, s = {})
            @u0({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode$setScrollSemanticsActions$1$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1037:1\n30#2:1038\n53#3,3:1039\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode$setScrollSemanticsActions$1$1\n*L\n518#1:1038\n518#1:1039,3\n*E\n"})
            /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
                final /* synthetic */ float $x;
                final /* synthetic */ float $y;
                int label;
                final /* synthetic */ ScrollableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ScrollableNode scrollableNode, float f11, float f12, c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = scrollableNode;
                    this.$x = f11;
                    this.$y = f12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final c<g2> create(Object obj, c<?> cVar) {
                    return new AnonymousClass1(this.this$0, this.$x, this.$y, cVar);
                }

                @Override // x00.p
                public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                    return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    ScrollingLogic scrollingLogic;
                    Object m496semanticsScrollByd4ec7I;
                    Object l11 = b.l();
                    int i11 = this.label;
                    if (i11 == 0) {
                        e.n(obj);
                        scrollingLogic = this.this$0.scrollingLogic;
                        float f11 = this.$x;
                        float f12 = this.$y;
                        long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
                        this.label = 1;
                        m496semanticsScrollByd4ec7I = ScrollableKt.m496semanticsScrollByd4ec7I(scrollingLogic, m2260constructorimpl, this);
                        if (m496semanticsScrollByd4ec7I == l11) {
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

            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Boolean invoke(Float f11, Float f12) {
                return invoke(f11.floatValue(), f12.floatValue());
            }

            public final Boolean invoke(float f11, float f12) {
                c40.k.f(ScrollableNode.this.getCoroutineScope(), null, null, new AnonymousClass1(ScrollableNode.this, f11, f12, null), 3, null);
                return Boolean.TRUE;
            }
        };
        this.scrollByOffsetAction = new ScrollableNode$setScrollSemanticsActions$2(this, null);
    }

    private final void updateDefaultFlingBehavior() {
        if (isAttached()) {
            this.defaultFlingBehavior.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (getEnabled() && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            setScrollSemanticsActions();
        }
        p<? super Float, ? super Float, Boolean> pVar = this.scrollByAction;
        if (pVar != null) {
            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, pVar, 1, null);
        }
        p<? super Offset, ? super c<? super Offset>, ? extends Object> pVar2 = this.scrollByOffsetAction;
        if (pVar2 != null) {
            SemanticsPropertiesKt.scrollByOffset(semanticsPropertyReceiver, pVar2);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    @l
    public Object drag(@k p<? super x00.l<? super DragEvent.DragDelta, g2>, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        Object scroll = scrollingLogic.scroll(MutatePriority.UserInput, new ScrollableNode$drag$2$1(pVar, scrollingLogic, null), cVar);
        return scroll == b.l() ? scroll : g2.f100423a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDefaultFlingBehavior();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        updateDefaultFlingBehavior();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0 */
    public void mo396onDragStoppedTH1AsA0(long j11) {
        c40.k.f(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onDragStopped$1(this, j11, null), 3, null);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo204onKeyEventZmokQxo(@k KeyEvent keyEvent) {
        long m2260constructorimpl;
        if (!getEnabled()) {
            return false;
        }
        long m3588getKeyZmokQxo = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if ((!Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3468getPageDownEK5gGoQ()) && !Key.m3280equalsimpl0(KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent), companion.m3469getPageUpEK5gGoQ())) || !KeyEventType.m3581equalsimpl0(KeyEvent_androidKt.m3589getTypeZmokQxo(keyEvent), KeyEventType.Companion.m3585getKeyDownCS__XNY()) || KeyEvent_androidKt.m3592isCtrlPressedZmokQxo(keyEvent)) {
            return false;
        }
        if (this.scrollingLogic.isVertical()) {
            int m410getViewportSizeYbymL2g$foundation_release = (int) (this.contentInViewNode.m410getViewportSizeYbymL2g$foundation_release() & 4294967295L);
            m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Key.m3280equalsimpl0(KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent), companion.m3469getPageUpEK5gGoQ()) ? m410getViewportSizeYbymL2g$foundation_release : -m410getViewportSizeYbymL2g$foundation_release) & 4294967295L));
        } else {
            int m410getViewportSizeYbymL2g$foundation_release2 = (int) (this.contentInViewNode.m410getViewportSizeYbymL2g$foundation_release() >> 32);
            m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(Key.m3280equalsimpl0(KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent), companion.m3469getPageUpEK5gGoQ()) ? m410getViewportSizeYbymL2g$foundation_release2 : -m410getViewportSizeYbymL2g$foundation_release2) << 32));
        }
        c40.k.f(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1(this, m2260constructorimpl, null), 3, null);
        return true;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo205onPointerEventH0pRuoY(@k PointerEvent pointerEvent, @k PointerEventPass pointerEventPass, long j11) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            if (getCanDrag().invoke(changes.get(i11)).booleanValue()) {
                super.mo205onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j11);
                break;
            }
            i11++;
        }
        if (getEnabled()) {
            if (pointerEventPass == PointerEventPass.Initial && PointerEventType.m3681equalsimpl0(pointerEvent.m3674getType7fucELk(), PointerEventType.Companion.m3690getScroll7fucELk())) {
                ensureMouseWheelScrollNodeInitialized();
            }
            MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
            if (mouseWheelScrollingLogic != null) {
                mouseWheelScrollingLogic.m462onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j11);
            }
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo206onPreKeyEventZmokQxo(@k KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.scrollingLogic.shouldScrollImmediately();
    }

    public final void update(@k ScrollableState scrollableState, @k Orientation orientation, @l OverscrollEffect overscrollEffect, boolean z11, boolean z12, @l FlingBehavior flingBehavior, @l MutableInteractionSource mutableInteractionSource, @l BringIntoViewSpec bringIntoViewSpec) {
        boolean z13;
        x00.l<? super PointerInputChange, Boolean> lVar;
        if (getEnabled() != z11) {
            this.nestedScrollConnection.setEnabled(z11);
            this.scrollableContainerNode.update(z11);
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z14 = z13;
        boolean update = this.scrollingLogic.update(scrollableState, orientation, overscrollEffect, z12, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.contentInViewNode.update(orientation, z12, bringIntoViewSpec);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        lVar = ScrollableKt.CanDragCalculation;
        update(lVar, z11, mutableInteractionSource, this.scrollingLogic.isVertical() ? Orientation.Vertical : Orientation.Horizontal, update);
        if (z14) {
            clearScrollSemanticsActions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo395onDragStartedk4lQ0M(long j11) {
    }
}
