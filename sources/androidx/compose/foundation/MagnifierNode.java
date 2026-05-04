package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import e40.o;
import e40.r;
import e40.s;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CoroutineStart;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,496:1\n85#2:497\n113#2,2:498\n1#3:500\n273#4:501\n273#4:502\n*S KotlinDebug\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n*L\n282#1:497\n282#1:498,2\n427#1:501\n434#1:502\n*E\n"})
/* loaded from: classes.dex */
public final class MagnifierNode extends Modifier.Node implements GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    public static final int $stable = 8;

    @l
    private State<Offset> anchorPositionInRootState;
    private boolean clippingEnabled;
    private float cornerRadius;

    @l
    private Density density;

    @l
    private o<g2> drawSignalChannel;
    private float elevation;

    @m80.k
    private final MutableState layoutCoordinates$delegate;

    @l
    private PlatformMagnifier magnifier;

    @l
    private x00.l<? super Density, Offset> magnifierCenter;

    @l
    private x00.l<? super DpSize, g2> onSizeChanged;

    @m80.k
    private PlatformMagnifierFactory platformMagnifierFactory;

    @l
    private IntSize previousSize;
    private long size;

    @m80.k
    private x00.l<? super Density, Offset> sourceCenter;
    private long sourceCenterInRoot;
    private boolean useTextDefault;

    @l
    private View view;
    private float zoom;

    public /* synthetic */ MagnifierNode(x00.l lVar, x00.l lVar2, x00.l lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, PlatformMagnifierFactory platformMagnifierFactory, v vVar) {
        this(lVar, lVar2, lVar3, f11, z11, j11, f12, f13, z12, platformMagnifierFactory);
    }

    /* renamed from: getAnchorPositionInRoot-F1C5BW0, reason: not valid java name */
    private final long m293getAnchorPositionInRootF1C5BW0() {
        if (this.anchorPositionInRootState == null) {
            this.anchorPositionInRootState = SnapshotStateKt.derivedStateOf(new x00.a<Offset>() { // from class: androidx.compose.foundation.MagnifierNode$anchorPositionInRoot$1
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ Offset invoke() {
                    return Offset.m2257boximpl(m301invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m301invokeF1C5BW0() {
                    LayoutCoordinates layoutCoordinates;
                    layoutCoordinates = MagnifierNode.this.getLayoutCoordinates();
                    return layoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(layoutCoordinates) : Offset.Companion.m2283getUnspecifiedF1C5BW0();
                }
            });
        }
        State<Offset> state = this.anchorPositionInRootState;
        return state != null ? state.getValue().m2278unboximpl() : Offset.Companion.m2283getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getLayoutCoordinates() {
        return (LayoutCoordinates) this.layoutCoordinates$delegate.getValue();
    }

    private final void recreateMagnifier() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        View view = this.view;
        if (view == null) {
            view = DelegatableNode_androidKt.requireView(this);
        }
        View view2 = view;
        this.view = view2;
        Density density = this.density;
        if (density == null) {
            density = DelegatableNodeKt.requireDensity(this);
        }
        Density density2 = density;
        this.density = density2;
        this.magnifier = this.platformMagnifierFactory.mo327createnHHXs2Y(view2, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, density2, this.zoom);
        updateSizeIfNecessary();
    }

    private final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateMagnifier() {
        /*
            r9 = this;
            androidx.compose.ui.unit.Density r0 = r9.density
            if (r0 != 0) goto La
            androidx.compose.ui.unit.Density r0 = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(r9)
            r9.density = r0
        La:
            x00.l<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> r1 = r9.sourceCenter
            java.lang.Object r1 = r1.invoke(r0)
            androidx.compose.ui.geometry.Offset r1 = (androidx.compose.ui.geometry.Offset) r1
            long r1 = r1.m2278unboximpl()
            r3 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r5 = r1 & r3
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L83
            long r5 = r9.m293getAnchorPositionInRootF1C5BW0()
            long r5 = r5 & r3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L83
            long r5 = r9.m293getAnchorPositionInRootF1C5BW0()
            long r1 = androidx.compose.ui.geometry.Offset.m2273plusMKHz9U(r5, r1)
            r9.sourceCenterInRoot = r1
            x00.l<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> r1 = r9.magnifierCenter
            if (r1 == 0) goto L66
            java.lang.Object r0 = r1.invoke(r0)
            androidx.compose.ui.geometry.Offset r0 = (androidx.compose.ui.geometry.Offset) r0
            long r0 = r0.m2278unboximpl()
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m2257boximpl(r0)
            long r1 = r0.m2278unboximpl()
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L55
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L66
            long r0 = r0.m2278unboximpl()
            long r2 = r9.m293getAnchorPositionInRootF1C5BW0()
            long r0 = androidx.compose.ui.geometry.Offset.m2273plusMKHz9U(r2, r0)
        L64:
            r5 = r0
            goto L6d
        L66:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r0 = r0.m2283getUnspecifiedF1C5BW0()
            goto L64
        L6d:
            androidx.compose.foundation.PlatformMagnifier r0 = r9.magnifier
            if (r0 != 0) goto L74
            r9.recreateMagnifier()
        L74:
            androidx.compose.foundation.PlatformMagnifier r2 = r9.magnifier
            if (r2 == 0) goto L7f
            long r3 = r9.sourceCenterInRoot
            float r7 = r9.zoom
            r2.mo326updateWko1d7g(r3, r5, r7)
        L7f:
            r9.updateSizeIfNecessary()
            return
        L83:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r0 = r0.m2283getUnspecifiedF1C5BW0()
            r9.sourceCenterInRoot = r0
            androidx.compose.foundation.PlatformMagnifier r0 = r9.magnifier
            if (r0 == 0) goto L92
            r0.dismiss()
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.updateMagnifier():void");
    }

    private final void updateSizeIfNecessary() {
        Density density;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null || IntSize.m5283equalsimpl(platformMagnifier.mo325getSizeYbymL2g(), this.previousSize)) {
            return;
        }
        x00.l<? super DpSize, g2> lVar = this.onSizeChanged;
        if (lVar != null) {
            lVar.invoke(DpSize.m5201boximpl(density.mo375toDpSizekrfVVM(IntSizeKt.m5298toSizeozmzZPI(platformMagnifier.mo325getSizeYbymL2g()))));
        }
        this.previousSize = IntSize.m5278boximpl(platformMagnifier.mo325getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@m80.k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(Magnifier_androidKt.getMagnifierPositionInRoot(), new x00.a<Offset>() { // from class: androidx.compose.foundation.MagnifierNode$applySemantics$1
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ Offset invoke() {
                return Offset.m2257boximpl(m302invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0, reason: not valid java name */
            public final long m302invokeF1C5BW0() {
                long j11;
                j11 = MagnifierNode.this.sourceCenterInRoot;
                return j11;
            }
        });
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@m80.k ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        o<g2> oVar = this.drawSignalChannel;
        if (oVar != null) {
            s.b(oVar.m(g2.f100423a));
        }
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m294getCornerRadiusD9Ej5fM() {
        return this.cornerRadius;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m295getElevationD9Ej5fM() {
        return this.elevation;
    }

    @l
    public final x00.l<Density, Offset> getMagnifierCenter() {
        return this.magnifierCenter;
    }

    @l
    public final x00.l<DpSize, g2> getOnSizeChanged() {
        return this.onSizeChanged;
    }

    @m80.k
    public final PlatformMagnifierFactory getPlatformMagnifierFactory() {
        return this.platformMagnifierFactory;
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m296getSizeMYxV2XQ() {
        return this.size;
    }

    @m80.k
    public final x00.l<Density, Offset> getSourceCenter() {
        return this.sourceCenter;
    }

    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    public final float getZoom() {
        return this.zoom;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.drawSignalChannel = r.d(0, null, null, 7, null);
        c40.k.f(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new MagnifierNode$onAttach$1(this, null), 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.magnifier = null;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@m80.k LayoutCoordinates layoutCoordinates) {
        setLayoutCoordinates(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new x00.a<g2>() { // from class: androidx.compose.foundation.MagnifierNode$onObservedReadsChanged$1
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
                MagnifierNode.this.updateMagnifier();
            }
        });
    }

    public final void setClippingEnabled(boolean z11) {
        this.clippingEnabled = z11;
    }

    /* renamed from: setCornerRadius-0680j_4, reason: not valid java name */
    public final void m297setCornerRadius0680j_4(float f11) {
        this.cornerRadius = f11;
    }

    /* renamed from: setElevation-0680j_4, reason: not valid java name */
    public final void m298setElevation0680j_4(float f11) {
        this.elevation = f11;
    }

    public final void setMagnifierCenter(@l x00.l<? super Density, Offset> lVar) {
        this.magnifierCenter = lVar;
    }

    public final void setOnSizeChanged(@l x00.l<? super DpSize, g2> lVar) {
        this.onSizeChanged = lVar;
    }

    public final void setPlatformMagnifierFactory(@m80.k PlatformMagnifierFactory platformMagnifierFactory) {
        this.platformMagnifierFactory = platformMagnifierFactory;
    }

    /* renamed from: setSize-EaSLcWc, reason: not valid java name */
    public final void m299setSizeEaSLcWc(long j11) {
        this.size = j11;
    }

    public final void setSourceCenter(@m80.k x00.l<? super Density, Offset> lVar) {
        this.sourceCenter = lVar;
    }

    public final void setUseTextDefault(boolean z11) {
        this.useTextDefault = z11;
    }

    public final void setZoom(float f11) {
        this.zoom = f11;
    }

    /* renamed from: update-5F03MCQ, reason: not valid java name */
    public final void m300update5F03MCQ(@m80.k x00.l<? super Density, Offset> lVar, @l x00.l<? super Density, Offset> lVar2, float f11, boolean z11, long j11, float f12, float f13, boolean z12, @l x00.l<? super DpSize, g2> lVar3, @m80.k PlatformMagnifierFactory platformMagnifierFactory) {
        float f14 = this.zoom;
        long j12 = this.size;
        float f15 = this.cornerRadius;
        boolean z13 = this.useTextDefault;
        float f16 = this.elevation;
        boolean z14 = this.clippingEnabled;
        PlatformMagnifierFactory platformMagnifierFactory2 = this.platformMagnifierFactory;
        View view = this.view;
        Density density = this.density;
        this.sourceCenter = lVar;
        this.magnifierCenter = lVar2;
        this.zoom = f11;
        this.useTextDefault = z11;
        this.size = j11;
        this.cornerRadius = f12;
        this.elevation = f13;
        this.clippingEnabled = z12;
        this.onSizeChanged = lVar3;
        this.platformMagnifierFactory = platformMagnifierFactory;
        View requireView = DelegatableNode_androidKt.requireView(this);
        Density requireDensity = DelegatableNodeKt.requireDensity(this);
        if (this.magnifier != null && ((!Magnifier_androidKt.equalsIncludingNaN(f11, f14) && !platformMagnifierFactory.getCanUpdateZoom()) || !DpSize.m5210equalsimpl0(j11, j12) || !Dp.m5120equalsimpl0(f12, f15) || !Dp.m5120equalsimpl0(f13, f16) || z11 != z13 || z12 != z14 || !g0.g(platformMagnifierFactory, platformMagnifierFactory2) || !g0.g(requireView, view) || !g0.g(requireDensity, density))) {
            recreateMagnifier();
        }
        updateMagnifier();
    }

    public /* synthetic */ MagnifierNode(x00.l lVar, x00.l lVar2, x00.l lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, PlatformMagnifierFactory platformMagnifierFactory, int i11, v vVar) {
        this(lVar, (i11 & 2) != 0 ? null : lVar2, (i11 & 4) != 0 ? null : lVar3, (i11 & 8) != 0 ? Float.NaN : f11, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? DpSize.Companion.m5222getUnspecifiedMYxV2XQ() : j11, (i11 & 64) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f12, (i11 & 128) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f13, (i11 & 256) != 0 ? true : z12, (i11 & 512) != 0 ? PlatformMagnifierFactory.Companion.getForCurrentPlatform() : platformMagnifierFactory, null);
    }

    private MagnifierNode(x00.l<? super Density, Offset> lVar, x00.l<? super Density, Offset> lVar2, x00.l<? super DpSize, g2> lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = lVar;
        this.magnifierCenter = lVar2;
        this.onSizeChanged = lVar3;
        this.zoom = f11;
        this.useTextDefault = z11;
        this.size = j11;
        this.cornerRadius = f12;
        this.elevation = f13;
        this.clippingEnabled = z12;
        this.platformMagnifierFactory = platformMagnifierFactory;
        this.layoutCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.sourceCenterInRoot = Offset.Companion.m2283getUnspecifiedF1C5BW0();
    }
}
