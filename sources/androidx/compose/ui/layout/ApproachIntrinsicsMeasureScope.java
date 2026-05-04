package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,415:1\n105#2:416\n105#2:417\n361#3:418\n362#3,2:422\n365#3:425\n56#4,3:419\n60#4:424\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope\n*L\n393#1:416\n394#1:417\n395#1:418\n395#1:422,2\n395#1:425\n395#1:419,3\n395#1:424\n*E\n"})
/* loaded from: classes.dex */
public final class ApproachIntrinsicsMeasureScope implements ApproachMeasureScope, ApproachIntrinsicMeasureScope {
    public static final int $stable = 0;
    private final /* synthetic */ ApproachIntrinsicMeasureScope $$delegate_0;

    @k
    private final LayoutDirection layoutDirection;

    public ApproachIntrinsicsMeasureScope(@k ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, @k LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        this.$$delegate_0 = approachIntrinsicMeasureScope;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @k
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadConstraints-msEJaDk */
    public long mo3833getLookaheadConstraintsmsEJaDk() {
        return this.$$delegate_0.mo3833getLookaheadConstraintsmsEJaDk();
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadSize-YbymL2g */
    public long mo3834getLookaheadSizeYbymL2g() {
        return this.$$delegate_0.mo3834getLookaheadSizeYbymL2g();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    @k
    public MeasureResult layout(final int i11, final int i12, @k final Map<AlignmentLine, Integer> map, @l final x00.l<? super RulerScope, g2> lVar, @k x00.l<? super Placeable.PlacementScope, g2> lVar2) {
        boolean z11 = false;
        if (i11 < 0) {
            i11 = 0;
        }
        if (i12 < 0) {
            i12 = 0;
        }
        if ((i11 & (-16777216)) == 0 && ((-16777216) & i12) == 0) {
            z11 = true;
        }
        if (!z11) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope$layout$1
            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return i12;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public x00.l<RulerScope, g2> getRulers() {
                return lVar;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return i11;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }
        };
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo370roundToPxR2X_6o(long j11) {
        return this.$$delegate_0.mo370roundToPxR2X_6o(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo371roundToPx0680j_4(float f11) {
        return this.$$delegate_0.mo371roundToPx0680j_4(f11);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo372toDpGaN1DYA(long j11) {
        return this.$$delegate_0.mo372toDpGaN1DYA(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo373toDpu2uoSUM(float f11) {
        return this.$$delegate_0.mo373toDpu2uoSUM(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo375toDpSizekrfVVM(long j11) {
        return this.$$delegate_0.mo375toDpSizekrfVVM(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo376toPxR2X_6o(long j11) {
        return this.$$delegate_0.mo376toPxR2X_6o(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo377toPx0680j_4(float f11) {
        return this.$$delegate_0.mo377toPx0680j_4(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @k
    public Rect toRect(@k DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo378toSizeXkaWNTQ(long j11) {
        return this.$$delegate_0.mo378toSizeXkaWNTQ(j11);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo379toSp0xMU5do(float f11) {
        return this.$$delegate_0.mo379toSp0xMU5do(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo380toSpkPz2Gy4(float f11) {
        return this.$$delegate_0.mo380toSpkPz2Gy4(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo374toDpu2uoSUM(int i11) {
        return this.$$delegate_0.mo374toDpu2uoSUM(i11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo381toSpkPz2Gy4(int i11) {
        return this.$$delegate_0.mo381toSpkPz2Gy4(i11);
    }
}
