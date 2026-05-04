package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.modifier.BackwardsCompatLocalMap;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashSet;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,435:1\n56#2,5:436\n56#2,5:447\n56#2,5:476\n56#2,5:540\n56#2,5:545\n99#3:441\n91#3:443\n99#3:452\n87#3:454\n83#3:456\n107#3:458\n111#3:460\n95#3:464\n91#3:466\n107#3:468\n99#3:469\n246#4:442\n246#4:444\n246#4:453\n246#4:455\n246#4:457\n246#4:459\n246#4:461\n246#4:465\n246#4:467\n246#4:495\n646#5,2:445\n641#5,2:462\n247#6,5:470\n90#6:475\n91#6,8:481\n437#6,6:489\n447#6,2:496\n449#6,8:501\n457#6,9:512\n466#6,8:524\n100#6,7:532\n240#7,3:498\n243#7,3:521\n1101#8:509\n1083#8,2:510\n1#9:539\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n*L\n113#1:436,5\n132#1:447,5\n259#1:476,5\n401#1:540,5\n409#1:545,5\n115#1:441\n123#1:443\n134#1:452\n142#1:454\n150#1:456\n166#1:458\n192#1:460\n205#1:464\n210#1:466\n224#1:468\n259#1:469\n115#1:442\n123#1:444\n134#1:453\n142#1:455\n150#1:457\n166#1:459\n192#1:461\n205#1:465\n210#1:467\n259#1:495\n127#1:445,2\n203#1:462,2\n259#1:470,5\n259#1:475\n259#1:481,8\n259#1:489,6\n259#1:496,2\n259#1:501,8\n259#1:512,9\n259#1:524,8\n259#1:532,7\n259#1:498,3\n259#1:521,3\n259#1:509\n259#1:510,2\n*E\n"})
/* loaded from: classes2.dex */
public final class BackwardsCompatNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode, PointerInputModifierNode, ModifierLocalModifierNode, ModifierLocalReadScope, ParentDataModifierNode, LayoutAwareModifierNode, GlobalPositionAwareModifierNode, FocusEventModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode, OwnerScope, BuildDrawCacheParams {
    public static final int $stable = 8;

    @l
    private BackwardsCompatLocalMap _providedValues;

    @k
    private Modifier.Element element;
    private boolean invalidateCache;

    @l
    private LayoutCoordinates lastOnPlacedCoordinates;

    @k
    private HashSet<ModifierLocal<?>> readValues;

    public BackwardsCompatNode(@k Modifier.Element element) {
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(element));
        this.element = element;
        this.invalidateCache = true;
        this.readValues = new HashSet<>();
    }

    private final void initializeModifier(boolean z11) {
        boolean isChainUpdate;
        boolean isChainUpdate2;
        boolean isChainUpdate3;
        boolean isChainUpdate4;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("initializeModifier called on unattached node");
        }
        Modifier.Element element = this.element;
        if ((NodeKind.m4118constructorimpl(32) & getKindSet$ui_release()) != 0) {
            if (element instanceof ModifierLocalConsumer) {
                sideEffect(new x00.a<g2>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$2
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
                        BackwardsCompatNode.this.updateModifierLocalConsumer();
                    }
                });
            }
            if (element instanceof ModifierLocalProvider) {
                updateModifierLocalProvider((ModifierLocalProvider) element);
            }
        }
        if ((NodeKind.m4118constructorimpl(4) & getKindSet$ui_release()) != 0) {
            if (element instanceof DrawCacheModifier) {
                this.invalidateCache = true;
            }
            if (!z11) {
                LayoutModifierNodeKt.invalidateLayer(this);
            }
        }
        if ((NodeKind.m4118constructorimpl(2) & getKindSet$ui_release()) != 0) {
            isChainUpdate4 = BackwardsCompatNodeKt.isChainUpdate(this);
            if (isChainUpdate4) {
                NodeCoordinator coordinator$ui_release = getCoordinator$ui_release();
                g0.m(coordinator$ui_release);
                ((LayoutModifierNodeCoordinator) coordinator$ui_release).setLayoutModifierNode$ui_release(this);
                coordinator$ui_release.onLayoutModifierNodeChanged();
            }
            if (!z11) {
                LayoutModifierNodeKt.invalidateLayer(this);
                DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
        }
        if (element instanceof RemeasurementModifier) {
            ((RemeasurementModifier) element).onRemeasurementAvailable(DelegatableNodeKt.requireLayoutNode(this));
        }
        if ((NodeKind.m4118constructorimpl(128) & getKindSet$ui_release()) != 0) {
            if (element instanceof OnRemeasuredModifier) {
                isChainUpdate3 = BackwardsCompatNodeKt.isChainUpdate(this);
                if (isChainUpdate3) {
                    DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
                }
            }
            if (element instanceof OnPlacedModifier) {
                this.lastOnPlacedCoordinates = null;
                isChainUpdate2 = BackwardsCompatNodeKt.isChainUpdate(this);
                if (isChainUpdate2) {
                    DelegatableNodeKt.requireOwner(this).registerOnLayoutCompletedListener(new Owner.OnLayoutCompletedListener() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$3
                        @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
                        public void onLayoutComplete() {
                            LayoutCoordinates layoutCoordinates;
                            layoutCoordinates = BackwardsCompatNode.this.lastOnPlacedCoordinates;
                            if (layoutCoordinates == null) {
                                BackwardsCompatNode backwardsCompatNode = BackwardsCompatNode.this;
                                backwardsCompatNode.onPlaced(DelegatableNodeKt.m3979requireCoordinator64DMado(backwardsCompatNode, NodeKind.m4118constructorimpl(128)));
                            }
                        }
                    });
                }
            }
        }
        if ((NodeKind.m4118constructorimpl(256) & getKindSet$ui_release()) != 0 && (element instanceof OnGloballyPositionedModifier)) {
            isChainUpdate = BackwardsCompatNodeKt.isChainUpdate(this);
            if (isChainUpdate) {
                DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
        }
        if (element instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().add(this);
        }
        if ((NodeKind.m4118constructorimpl(16) & getKindSet$ui_release()) != 0 && (element instanceof PointerInputModifier)) {
            ((PointerInputModifier) element).getPointerInputFilter().setLayoutCoordinates$ui_release(getCoordinator$ui_release());
        }
        if ((NodeKind.m4118constructorimpl(8) & getKindSet$ui_release()) != 0) {
            DelegatableNodeKt.requireOwner(this).onSemanticsChange();
        }
    }

    private final void unInitializeModifier() {
        BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 backwardsCompatNodeKt$DetachedModifierLocalReadScope$1;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("unInitializeModifier called on unattached node");
        }
        Modifier.Element element = this.element;
        if ((NodeKind.m4118constructorimpl(32) & getKindSet$ui_release()) != 0) {
            if (element instanceof ModifierLocalProvider) {
                DelegatableNodeKt.requireOwner(this).getModifierLocalManager().removedProvider(this, ((ModifierLocalProvider) element).getKey());
            }
            if (element instanceof ModifierLocalConsumer) {
                backwardsCompatNodeKt$DetachedModifierLocalReadScope$1 = BackwardsCompatNodeKt.DetachedModifierLocalReadScope;
                ((ModifierLocalConsumer) element).onModifierLocalsUpdated(backwardsCompatNodeKt$DetachedModifierLocalReadScope$1);
            }
        }
        if ((NodeKind.m4118constructorimpl(8) & getKindSet$ui_release()) != 0) {
            DelegatableNodeKt.requireOwner(this).onSemanticsChange();
        }
        if (element instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().remove(this);
        }
    }

    private final void updateDrawCache() {
        x00.l lVar;
        final Modifier.Element element = this.element;
        if (element instanceof DrawCacheModifier) {
            OwnerSnapshotObserver snapshotObserver = DelegatableNodeKt.requireOwner(this).getSnapshotObserver();
            lVar = BackwardsCompatNodeKt.onDrawCacheReadsChanged;
            snapshotObserver.observeReads$ui_release(this, lVar, new x00.a<g2>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateDrawCache$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    ((DrawCacheModifier) Modifier.Element.this).onBuildCache(this);
                }
            });
        }
        this.invalidateCache = false;
    }

    private final void updateModifierLocalProvider(ModifierLocalProvider<?> modifierLocalProvider) {
        boolean isChainUpdate;
        BackwardsCompatLocalMap backwardsCompatLocalMap = this._providedValues;
        if (backwardsCompatLocalMap != null && backwardsCompatLocalMap.contains$ui_release(modifierLocalProvider.getKey())) {
            backwardsCompatLocalMap.setElement(modifierLocalProvider);
            DelegatableNodeKt.requireOwner(this).getModifierLocalManager().updatedProvider(this, modifierLocalProvider.getKey());
            return;
        }
        this._providedValues = new BackwardsCompatLocalMap(modifierLocalProvider);
        isChainUpdate = BackwardsCompatNodeKt.isChainUpdate(this);
        if (isChainUpdate) {
            DelegatableNodeKt.requireOwner(this).getModifierLocalManager().insertedProvider(this, modifierLocalProvider.getKey());
        }
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@k FocusProperties focusProperties) {
        Modifier.Element element = this.element;
        if (!(element instanceof FocusOrderModifier)) {
            InlineClassHelperKt.throwIllegalStateException("applyFocusProperties called on wrong node");
        }
        ((FocusOrderModifier) element).populateFocusOrder(new FocusOrder(focusProperties));
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Modifier.Element element = this.element;
        g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        SemanticsConfiguration semanticsConfiguration = ((SemanticsModifier) element).getSemanticsConfiguration();
        g0.n(semanticsPropertyReceiver, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((SemanticsConfiguration) semanticsPropertyReceiver).collapsePeer$ui_release(semanticsConfiguration);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@k ContentDrawScope contentDrawScope) {
        Modifier.Element element = this.element;
        g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        DrawModifier drawModifier = (DrawModifier) element;
        if (this.invalidateCache && (element instanceof DrawCacheModifier)) {
            updateDrawCache();
        }
        drawModifier.draw(contentDrawScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public <T> T getCurrent(@k ModifierLocal<T> modifierLocal) {
        NodeChain nodes$ui_release;
        this.readValues.add(modifierLocal);
        int m4118constructorimpl = NodeKind.m4118constructorimpl(32);
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        DelegatingNode delegatingNode = parent$ui_release;
                        ?? r52 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNode;
                                if (modifierLocalModifierNode.getProvidedValues().contains$ui_release(modifierLocal)) {
                                    return (T) modifierLocalModifierNode.getProvidedValues().get$ui_release(modifierLocal);
                                }
                            } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i11 = 0;
                                delegatingNode = delegatingNode;
                                r52 = r52;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i11++;
                                        r52 = r52;
                                        if (i11 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (r52 == 0) {
                                                r52 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                r52.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r52.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                    r52 = r52;
                                }
                                if (i11 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(r52);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return modifierLocal.getDefaultFactory$ui_release().invoke();
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @k
    public Density getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity();
    }

    @k
    public final Modifier.Element getElement() {
        return this.element;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @k
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutNode(this).getLayoutDirection();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @k
    public ModifierLocalMap getProvidedValues() {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this._providedValues;
        return backwardsCompatLocalMap != null ? backwardsCompatLocalMap : ModifierLocalModifierNodeKt.modifierLocalMapOf();
    }

    @k
    public final HashSet<ModifierLocal<?>> getReadValues() {
        return this.readValues;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo2127getSizeNHjbRc() {
        return IntSizeKt.m5298toSizeozmzZPI(DelegatableNodeKt.m3979requireCoordinator64DMado(this, NodeKind.m4118constructorimpl(128)).mo3865getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public boolean interceptOutOfBoundsChildEvents() {
        Modifier.Element element = this.element;
        g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        Modifier.Element element = this.element;
        g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        Modifier.Element element = this.element;
        g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        Modifier.Element element = this.element;
        g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).mo646measure3p2s80s(measureScope, measurable, j11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        Modifier.Element element = this.element;
        g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        Modifier.Element element = this.element;
        g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    @l
    public Object modifyParentData(@k Density density, @l Object obj) {
        Modifier.Element element = this.element;
        g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((ParentDataModifier) element).modifyParentData(density, obj);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        initializeModifier(true);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        Modifier.Element element = this.element;
        g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).getPointerInputFilter().onCancel();
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        if (this.element instanceof PointerInputModifier) {
            onCancelPointerInput();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        unInitializeModifier();
    }

    public final void onDrawCacheReadsChanged$ui_release() {
        this.invalidateCache = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@k FocusState focusState) {
        Modifier.Element element = this.element;
        if (!(element instanceof FocusEventModifier)) {
            InlineClassHelperKt.throwIllegalStateException("onFocusEvent called on wrong node");
        }
        ((FocusEventModifier) element).onFocusEvent(focusState);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@k LayoutCoordinates layoutCoordinates) {
        Modifier.Element element = this.element;
        g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((OnGloballyPositionedModifier) element).onGloballyPositioned(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        this.invalidateCache = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(@k LayoutCoordinates layoutCoordinates) {
        this.lastOnPlacedCoordinates = layoutCoordinates;
        Modifier.Element element = this.element;
        if (element instanceof OnPlacedModifier) {
            ((OnPlacedModifier) element).onPlaced(layoutCoordinates);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo205onPointerEventH0pRuoY(@k PointerEvent pointerEvent, @k PointerEventPass pointerEventPass, long j11) {
        Modifier.Element element = this.element;
        g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).getPointerInputFilter().mo3755onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j11);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo365onRemeasuredozmzZPI(long j11) {
        Modifier.Element element = this.element;
        if (element instanceof OnRemeasuredModifier) {
            ((OnRemeasuredModifier) element).m3911onRemeasuredozmzZPI(j11);
        }
    }

    public final void setElement(@k Modifier.Element element) {
        if (isAttached()) {
            unInitializeModifier();
        }
        this.element = element;
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(element));
        if (isAttached()) {
            initializeModifier(false);
        }
    }

    public final void setReadValues(@k HashSet<ModifierLocal<?>> hashSet) {
        this.readValues = hashSet;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public boolean sharePointerInputWithSiblings() {
        Modifier.Element element = this.element;
        g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element).getPointerInputFilter().getShareWithSiblings();
    }

    @k
    public String toString() {
        return this.element.toString();
    }

    public final void updateModifierLocalConsumer() {
        x00.l lVar;
        if (isAttached()) {
            this.readValues.clear();
            OwnerSnapshotObserver snapshotObserver = DelegatableNodeKt.requireOwner(this).getSnapshotObserver();
            lVar = BackwardsCompatNodeKt.updateModifierLocalConsumer;
            snapshotObserver.observeReads$ui_release(this, lVar, new x00.a<g2>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
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
                    Modifier.Element element = BackwardsCompatNode.this.getElement();
                    g0.n(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                    ((ModifierLocalConsumer) element).onModifierLocalsUpdated(BackwardsCompatNode.this);
                }
            });
        }
    }
}
