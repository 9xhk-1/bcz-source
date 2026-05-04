package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import g10.u;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, BeyondBoundsLayout, LayoutModifierNode {

    @k
    private LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    @k
    private Orientation orientation;
    private boolean reverseLayout;

    @k
    private LazyLayoutBeyondBoundsState state;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LazyLayoutBeyondBoundsModifierNode(@k LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, @k LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z11, @k Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z11;
        this.orientation = orientation;
    }

    /* renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    private final LazyLayoutBeyondBoundsInfo.Interval m878addNextIntervalFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i11) {
        int start = interval.getStart();
        int end = interval.getEnd();
        if (m880isForward4vf7U8o(i11)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m879hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i11) {
        if (m881isOppositeToOrientation4vf7U8o(i11)) {
            return false;
        }
        return m880isForward4vf7U8o(i11) ? interval.getEnd() < this.state.getItemCount() - 1 : interval.getStart() > 0;
    }

    /* renamed from: isForward-4vf7U8o, reason: not valid java name */
    private final boolean m880isForward4vf7U8o(int i11) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m3839equalsimpl0(i11, companion.m3845getBeforehoxUOeE())) {
            return false;
        }
        if (BeyondBoundsLayout.LayoutDirection.m3839equalsimpl0(i11, companion.m3844getAfterhoxUOeE())) {
            return true;
        }
        if (BeyondBoundsLayout.LayoutDirection.m3839equalsimpl0(i11, companion.m3843getAbovehoxUOeE())) {
            return this.reverseLayout;
        }
        if (BeyondBoundsLayout.LayoutDirection.m3839equalsimpl0(i11, companion.m3846getBelowhoxUOeE())) {
            return !this.reverseLayout;
        }
        if (BeyondBoundsLayout.LayoutDirection.m3839equalsimpl0(i11, companion.m3847getLefthoxUOeE())) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
            if (i12 == 1) {
                return this.reverseLayout;
            }
            if (i12 == 2) {
                return !this.reverseLayout;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!BeyondBoundsLayout.LayoutDirection.m3839equalsimpl0(i11, companion.m3848getRighthoxUOeE())) {
            LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
            throw new KotlinNothingValueException();
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
        if (i13 == 1) {
            return !this.reverseLayout;
        }
        if (i13 == 2) {
            return this.reverseLayout;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m881isOppositeToOrientation4vf7U8o(int i11) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m3839equalsimpl0(i11, companion.m3843getAbovehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m3839equalsimpl0(i11, companion.m3846getBelowhoxUOeE())) {
            return this.orientation == Orientation.Horizontal;
        }
        if (BeyondBoundsLayout.LayoutDirection.m3839equalsimpl0(i11, companion.m3847getLefthoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m3839equalsimpl0(i11, companion.m3848getRighthoxUOeE())) {
            return this.orientation == Orientation.Vertical;
        }
        if (BeyondBoundsLayout.LayoutDirection.m3839equalsimpl0(i11, companion.m3845getBeforehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m3839equalsimpl0(i11, companion.m3844getAfterhoxUOeE())) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @k
    public ModifierLocalMap getProvidedValues() {
        return ModifierLocalModifierNodeKt.modifierLocalMapOf(h1.a(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout(), this));
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    @l
    /* renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo882layouto7g1Pn8(final int i11, @k x00.l<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> lVar) {
        if (this.state.getItemCount() <= 0 || !this.state.getHasVisibleItems() || !isAttached()) {
            return lVar.invoke(emptyBeyondBoundsScope);
        }
        int lastPlacedIndex = m880isForward4vf7U8o(i11) ? this.state.getLastPlacedIndex() : this.state.getFirstPlacedIndex();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) this.beyondBoundsInfo.addInterval(lastPlacedIndex, lastPlacedIndex);
        int B = u.B(this.state.itemsPerViewport() * 2, this.state.getItemCount());
        T t11 = null;
        int i12 = 0;
        while (t11 == null && m879hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, i11) && i12 < B) {
            T t12 = (T) m878addNextIntervalFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, i11);
            this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
            objectRef.element = t12;
            i12++;
            LayoutModifierNodeKt.remeasureSync(this);
            t11 = lVar.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public boolean getHasMoreContent() {
                    boolean m879hasMoreContentFR3nfPY;
                    m879hasMoreContentFR3nfPY = LazyLayoutBeyondBoundsModifierNode.this.m879hasMoreContentFR3nfPY(objectRef.element, i11);
                    return m879hasMoreContentFR3nfPY;
                }
            });
        }
        this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
        LayoutModifierNodeKt.remeasureSync(this);
        return t11;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$measure$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void update(@k LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, @k LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z11, @k Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z11;
        this.orientation = orientation;
    }
}
