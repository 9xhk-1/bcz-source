package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import c40.s0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1327:1\n1#2:1328\n397#3,3:1329\n354#3,6:1332\n364#3,3:1339\n367#3,9:1343\n400#3:1352\n397#3,3:1353\n354#3,6:1356\n364#3,3:1363\n367#3,9:1367\n400#3:1376\n1399#4:1338\n1270#4:1342\n1399#4:1362\n1270#4:1366\n159#5:1377\n30#6:1378\n53#7,3:1379\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n*L\n1102#1:1329,3\n1102#1:1332,6\n1102#1:1339,3\n1102#1:1343,9\n1102#1:1352\n1118#1:1353,3\n1118#1:1356,6\n1118#1:1363,3\n1118#1:1367,9\n1118#1:1376\n1102#1:1338\n1102#1:1342\n1118#1:1362\n1118#1:1366\n1146#1:1377\n1146#1:1378\n1146#1:1379,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, SemanticsModifierNode, TraversableNode {
    private long centerOffset;

    @m80.k
    private final MutableLongObjectMap<PressInteraction.Press> currentKeyPressInteractions;
    private boolean enabled;

    @m80.k
    private final FocusableNode focusableNode;

    @l
    private HoverInteraction.Enter hoverInteraction;

    @l
    private DelegatableNode indicationNode;

    @l
    private IndicationNodeFactory indicationNodeFactory;

    @l
    private MutableInteractionSource interactionSource;
    private boolean lazilyCreateIndication;

    @m80.k
    private x00.a<g2> onClick;

    @l
    private String onClickLabel;

    @l
    private SuspendingPointerInputModifierNode pointerInputNode;

    @l
    private PressInteraction.Press pressInteraction;

    @l
    private Role role;
    private final boolean shouldAutoInvalidate;

    @m80.k
    private final Object traverseKey;

    @l
    private MutableInteractionSource userProvidedInteractionSource;

    @m80.k
    public static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(v vVar) {
            this();
        }

        private TraverseKey() {
        }
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, String str, Role role, x00.a aVar, v vVar) {
        this(mutableInteractionSource, indicationNodeFactory, z11, str, role, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean delayPressInteraction() {
        return ClickableKt.hasScrollableContainer(this) || Clickable_androidKt.isComposeRootInScrollableContainer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverEnter() {
        if (this.hoverInteraction == null) {
            HoverInteraction.Enter enter = new HoverInteraction.Enter();
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                c40.k.f(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(mutableInteractionSource, enter, null), 3, null);
            }
            this.hoverInteraction = enter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverExit() {
        HoverInteraction.Enter enter = this.hoverInteraction;
        if (enter != null) {
            HoverInteraction.Exit exit = new HoverInteraction.Exit(enter);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                c40.k.f(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverExit$1$1$1(mutableInteractionSource, exit, null), 3, null);
            }
            this.hoverInteraction = null;
        }
    }

    private final void initializeIndicationAndInteractionSourceIfNeeded() {
        IndicationNodeFactory indicationNodeFactory;
        if (this.indicationNode == null && (indicationNodeFactory = this.indicationNodeFactory) != null) {
            if (this.interactionSource == null) {
                this.interactionSource = InteractionSourceKt.MutableInteractionSource();
            }
            this.focusableNode.update(this.interactionSource);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            g0.m(mutableInteractionSource);
            DelegatableNode create = indicationNodeFactory.create(mutableInteractionSource);
            delegate(create);
            this.indicationNode = create;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusChange(boolean z11) {
        if (z11) {
            initializeIndicationAndInteractionSourceIfNeeded();
            return;
        }
        if (this.interactionSource != null) {
            MutableLongObjectMap<PressInteraction.Press> mutableLongObjectMap = this.currentKeyPressInteractions;
            Object[] objArr = mutableLongObjectMap.values;
            long[] jArr = mutableLongObjectMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                c40.k.f(getCoroutineScope(), null, null, new AbstractClickableNode$onFocusChange$1$1(this, (PressInteraction.Press) objArr[(i11 << 3) + i13], null), 3, null);
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.currentKeyPressInteractions.clear();
        onCancelKeyInput();
    }

    private final boolean shouldLazilyCreateIndication() {
        return this.userProvidedInteractionSource == null && this.indicationNodeFactory != null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(@m80.k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            g0.m(role);
            SemanticsPropertiesKt.m4342setRolekuIjeqM(semanticsPropertyReceiver, role.m4322unboximpl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new x00.a<Boolean>() { // from class: androidx.compose.foundation.AbstractClickableNode$applySemantics$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                AbstractClickableNode.this.getOnClick().invoke();
                return Boolean.TRUE;
            }
        });
        if (this.enabled) {
            this.focusableNode.applySemantics(semanticsPropertyReceiver);
        } else {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        applyAdditionalSemantics(semanticsPropertyReceiver);
    }

    @l
    public abstract Object clickPointerInput(@m80.k PointerInputScope pointerInputScope, @m80.k j00.c<? super g2> cVar);

    public final void disposeInteractions() {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            PressInteraction.Press press = this.pressInteraction;
            if (press != null) {
                mutableInteractionSource.tryEmit(new PressInteraction.Cancel(press));
            }
            HoverInteraction.Enter enter = this.hoverInteraction;
            if (enter != null) {
                mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enter));
            }
            MutableLongObjectMap<PressInteraction.Press> mutableLongObjectMap = this.currentKeyPressInteractions;
            Object[] objArr = mutableLongObjectMap.values;
            long[] jArr = mutableLongObjectMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                mutableInteractionSource.tryEmit(new PressInteraction.Cancel((PressInteraction.Press) objArr[(i11 << 3) + i13]));
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.pressInteraction = null;
        this.hoverInteraction = null;
        this.currentKeyPressInteractions.clear();
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @m80.k
    public final x00.a<g2> getOnClick() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @m80.k
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @l
    /* renamed from: handlePressInteraction-d-4ec7I, reason: not valid java name */
    public final Object m201handlePressInteractiond4ec7I(@m80.k PressGestureScope pressGestureScope, long j11, @m80.k j00.c<? super g2> cVar) {
        Object g11;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return (mutableInteractionSource == null || (g11 = s0.g(new AbstractClickableNode$handlePressInteraction$2$1(pressGestureScope, j11, mutableInteractionSource, this, null), cVar)) != kotlin.coroutines.intrinsics.b.l()) ? g2.f100423a : g11;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        if (!this.lazilyCreateIndication) {
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        if (this.enabled) {
            delegate(this.focusableNode);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        HoverInteraction.Enter enter;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (enter = this.hoverInteraction) != null) {
            mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enter));
        }
        this.hoverInteraction = null;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
    }

    /* renamed from: onClickKeyDownEvent-ZmokQxo, reason: not valid java name */
    public abstract boolean mo202onClickKeyDownEventZmokQxo(@m80.k KeyEvent keyEvent);

    /* renamed from: onClickKeyUpEvent-ZmokQxo, reason: not valid java name */
    public abstract boolean mo203onClickKeyUpEventZmokQxo(@m80.k KeyEvent keyEvent);

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        disposeInteractions();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        DelegatableNode delegatableNode = this.indicationNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.indicationNode = null;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo204onKeyEventZmokQxo(@m80.k KeyEvent keyEvent) {
        boolean m278isClickZmokQxo;
        boolean m280isPressZmokQxo;
        boolean z11;
        initializeIndicationAndInteractionSourceIfNeeded();
        long m3588getKeyZmokQxo = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
        if (this.enabled) {
            m280isPressZmokQxo = ClickableKt.m280isPressZmokQxo(keyEvent);
            if (m280isPressZmokQxo) {
                if (this.currentKeyPressInteractions.containsKey(m3588getKeyZmokQxo)) {
                    z11 = false;
                } else {
                    PressInteraction.Press press = new PressInteraction.Press(this.centerOffset, null);
                    this.currentKeyPressInteractions.set(m3588getKeyZmokQxo, press);
                    if (this.interactionSource != null) {
                        c40.k.f(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3, null);
                    }
                    z11 = true;
                }
                return mo202onClickKeyDownEventZmokQxo(keyEvent) || z11;
            }
        }
        if (this.enabled) {
            m278isClickZmokQxo = ClickableKt.m278isClickZmokQxo(keyEvent);
            if (m278isClickZmokQxo) {
                PressInteraction.Press remove = this.currentKeyPressInteractions.remove(m3588getKeyZmokQxo);
                if (remove != null) {
                    if (this.interactionSource != null) {
                        c40.k.f(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2(this, remove, null), 3, null);
                    }
                    mo203onClickKeyUpEventZmokQxo(keyEvent);
                }
                if (remove != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void mo205onPointerEventH0pRuoY(@m80.k PointerEvent pointerEvent, @m80.k PointerEventPass pointerEventPass, long j11) {
        long m5292getCenterozmzZPI = IntSizeKt.m5292getCenterozmzZPI(j11);
        float m5243getXimpl = IntOffset.m5243getXimpl(m5292getCenterozmzZPI);
        float m5244getYimpl = IntOffset.m5244getYimpl(m5292getCenterozmzZPI);
        this.centerOffset = Offset.m2260constructorimpl((Float.floatToRawIntBits(m5243getXimpl) << 32) | (Float.floatToRawIntBits(m5244getYimpl) & 4294967295L));
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled && pointerEventPass == PointerEventPass.Main) {
            int m3674getType7fucELk = pointerEvent.m3674getType7fucELk();
            PointerEventType.Companion companion = PointerEventType.Companion;
            if (PointerEventType.m3681equalsimpl0(m3674getType7fucELk, companion.m3685getEnter7fucELk())) {
                c40.k.f(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3, null);
            } else if (PointerEventType.m3681equalsimpl0(m3674getType7fucELk, companion.m3686getExit7fucELk())) {
                c40.k.f(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3, null);
            }
        }
        if (this.pointerInputNode == null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AbstractClickableNode$onPointerEvent$3
                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                    Object clickPointerInput = AbstractClickableNode.this.clickPointerInput(pointerInputScope, cVar);
                    return clickPointerInput == kotlin.coroutines.intrinsics.b.l() ? clickPointerInput : g2.f100423a;
                }
            }));
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo205onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j11);
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo206onPreKeyEventZmokQxo(@m80.k KeyEvent keyEvent) {
        return false;
    }

    @l
    public final g2 resetPointerInputHandler() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode == null) {
            return null;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
        return g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r2.indicationNode == null) goto L29;
     */
    /* renamed from: updateCommon-QzZPfjk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m207updateCommonQzZPfjk(@m80.l androidx.compose.foundation.interaction.MutableInteractionSource r3, @m80.l androidx.compose.foundation.IndicationNodeFactory r4, boolean r5, @m80.l java.lang.String r6, @m80.l androidx.compose.ui.semantics.Role r7, @m80.k x00.a<yz.g2> r8) {
        /*
            r2 = this;
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r2.userProvidedInteractionSource
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.disposeInteractions()
            r2.userProvidedInteractionSource = r3
            r2.interactionSource = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            androidx.compose.foundation.IndicationNodeFactory r0 = r2.indicationNodeFactory
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r4)
            if (r0 != 0) goto L1e
            r2.indicationNodeFactory = r4
            r3 = r1
        L1e:
            boolean r4 = r2.enabled
            if (r4 == r5) goto L37
            if (r5 == 0) goto L2a
            androidx.compose.foundation.FocusableNode r4 = r2.focusableNode
            r2.delegate(r4)
            goto L32
        L2a:
            androidx.compose.foundation.FocusableNode r4 = r2.focusableNode
            r2.undelegate(r4)
            r2.disposeInteractions()
        L32:
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(r2)
            r2.enabled = r5
        L37:
            java.lang.String r4 = r2.onClickLabel
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r6)
            if (r4 != 0) goto L44
            r2.onClickLabel = r6
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(r2)
        L44:
            androidx.compose.ui.semantics.Role r4 = r2.role
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r7)
            if (r4 != 0) goto L51
            r2.role = r7
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(r2)
        L51:
            r2.onClick = r8
            boolean r4 = r2.lazilyCreateIndication
            boolean r5 = r2.shouldLazilyCreateIndication()
            if (r4 == r5) goto L68
            boolean r4 = r2.shouldLazilyCreateIndication()
            r2.lazilyCreateIndication = r4
            if (r4 != 0) goto L68
            androidx.compose.ui.node.DelegatableNode r4 = r2.indicationNode
            if (r4 != 0) goto L68
            goto L69
        L68:
            r1 = r3
        L69:
            if (r1 == 0) goto L7e
            androidx.compose.ui.node.DelegatableNode r3 = r2.indicationNode
            if (r3 != 0) goto L73
            boolean r4 = r2.lazilyCreateIndication
            if (r4 != 0) goto L7e
        L73:
            if (r3 == 0) goto L78
            r2.undelegate(r3)
        L78:
            r3 = 0
            r2.indicationNode = r3
            r2.initializeIndicationAndInteractionSourceIfNeeded()
        L7e:
            androidx.compose.foundation.FocusableNode r3 = r2.focusableNode
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r2.interactionSource
            r3.update(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.m207updateCommonQzZPfjk(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory, boolean, java.lang.String, androidx.compose.ui.semantics.Role, x00.a):void");
    }

    private AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, String str, Role role, x00.a<g2> aVar) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.onClickLabel = str;
        this.role = role;
        this.enabled = z11;
        this.onClick = aVar;
        this.focusableNode = new FocusableNode(this.interactionSource, Focusability.Companion.m2206getSystemDefinedLCbbffg(), new AbstractClickableNode$focusableNode$1(this), null);
        this.currentKeyPressInteractions = LongObjectMapKt.mutableLongObjectMapOf();
        this.centerOffset = Offset.Companion.m2284getZeroF1C5BW0();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = shouldLazilyCreateIndication();
        this.traverseKey = TraverseKey;
    }

    public void onCancelKeyInput() {
    }

    public void applyAdditionalSemantics(@m80.k SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
