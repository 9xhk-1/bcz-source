package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1037:1\n1#2:1038\n*E\n"})
/* loaded from: classes.dex */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;

    @l
    private LayoutNodeSubcompositionsState _state;

    @k
    private final p<LayoutNode, CompositionContext, g2> setCompositionContext;

    @k
    private final p<LayoutNode, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, g2> setMeasurePolicy;

    @k
    private final p<LayoutNode, SubcomposeLayoutState, g2> setRoot;

    @k
    private final SubcomposeSlotReusePolicy slotReusePolicy;

    public SubcomposeLayoutState(@k SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        this.setRoot = new p<LayoutNode, SubcomposeLayoutState, g2>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                invoke2(layoutNode, subcomposeLayoutState);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                LayoutNodeSubcompositionsState state;
                LayoutNodeSubcompositionsState state2;
                SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2;
                SubcomposeSlotReusePolicy subcomposeSlotReusePolicy3;
                SubcomposeLayoutState subcomposeLayoutState2 = SubcomposeLayoutState.this;
                LayoutNodeSubcompositionsState subcompositionsState$ui_release = layoutNode.getSubcompositionsState$ui_release();
                if (subcompositionsState$ui_release == null) {
                    subcomposeSlotReusePolicy3 = SubcomposeLayoutState.this.slotReusePolicy;
                    subcompositionsState$ui_release = new LayoutNodeSubcompositionsState(layoutNode, subcomposeSlotReusePolicy3);
                    layoutNode.setSubcompositionsState$ui_release(subcompositionsState$ui_release);
                }
                subcomposeLayoutState2._state = subcompositionsState$ui_release;
                state = SubcomposeLayoutState.this.getState();
                state.makeSureStateIsConsistent();
                state2 = SubcomposeLayoutState.this.getState();
                subcomposeSlotReusePolicy2 = SubcomposeLayoutState.this.slotReusePolicy;
                state2.setSlotReusePolicy(subcomposeSlotReusePolicy2);
            }
        };
        this.setCompositionContext = new p<LayoutNode, CompositionContext, g2>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode, CompositionContext compositionContext) {
                invoke2(layoutNode, compositionContext);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, CompositionContext compositionContext) {
                LayoutNodeSubcompositionsState state;
                state = SubcomposeLayoutState.this.getState();
                state.setCompositionContext(compositionContext);
            }
        };
        this.setMeasurePolicy = new p<LayoutNode, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, g2>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar) {
                invoke2(layoutNode, pVar);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar) {
                LayoutNodeSubcompositionsState state;
                state = SubcomposeLayoutState.this.getState();
                layoutNode.setMeasurePolicy(state.createMeasurePolicy(pVar));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final void forceRecomposeChildren$ui_release() {
        getState().forceRecomposeChildren();
    }

    @k
    public final p<LayoutNode, CompositionContext, g2> getSetCompositionContext$ui_release() {
        return this.setCompositionContext;
    }

    @k
    public final p<LayoutNode, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, g2> getSetMeasurePolicy$ui_release() {
        return this.setMeasurePolicy;
    }

    @k
    public final p<LayoutNode, SubcomposeLayoutState, g2> getSetRoot$ui_release() {
        return this.setRoot;
    }

    @k
    public final PrecomposedSlotHandle precompose(@l Object obj, @k p<? super Composer, ? super Integer, g2> pVar) {
        return getState().precompose(obj, pVar);
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    @n(message = "This constructor is deprecated", replaceWith = @w0(expression = "SubcomposeLayoutState(SubcomposeSlotReusePolicy(maxSlotsToRetainForReuse))", imports = {"androidx.compose.ui.layout.SubcomposeSlotReusePolicy"}))
    public SubcomposeLayoutState(int i11) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i11));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface PrecomposedSlotHandle {
        void dispose();

        default int getPlaceablesCount() {
            return 0;
        }

        /* renamed from: premeasure-0kLqBqw */
        default void mo3883premeasure0kLqBqw(int i11, long j11) {
        }

        default void traverseDescendants(@l Object obj, @k x00.l<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
        }
    }
}
