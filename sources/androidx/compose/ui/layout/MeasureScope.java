package androidx.compose.ui.layout;

import a00.l1;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.DpRect;
import java.util.Map;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@MeasureScopeMarker
@u0({"SMAP\nMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,128:1\n361#2:129\n362#2,2:133\n365#2:136\n56#3,3:130\n60#3:135\n*S KotlinDebug\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope\n*L\n76#1:129\n76#1:133,2\n76#1:136\n76#1:130,3\n76#1:135\n*E\n"})
/* loaded from: classes.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(@k MeasureScope measureScope) {
            return MeasureScope.super.isLookingAhead();
        }

        @Deprecated
        @k
        public static MeasureResult layout(@k MeasureScope measureScope, int i11, int i12, @k Map<AlignmentLine, Integer> map, @k l<? super Placeable.PlacementScope, g2> lVar) {
            return MeasureScope.super.layout(i11, i12, map, lVar);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3899roundToPxR2X_6o(@k MeasureScope measureScope, long j11) {
            return MeasureScope.super.mo370roundToPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3900roundToPx0680j_4(@k MeasureScope measureScope, float f11) {
            return MeasureScope.super.mo371roundToPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3901toDpGaN1DYA(@k MeasureScope measureScope, long j11) {
            return MeasureScope.super.mo372toDpGaN1DYA(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3902toDpu2uoSUM(@k MeasureScope measureScope, float f11) {
            return MeasureScope.super.mo373toDpu2uoSUM(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3904toDpSizekrfVVM(@k MeasureScope measureScope, long j11) {
            return MeasureScope.super.mo375toDpSizekrfVVM(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3905toPxR2X_6o(@k MeasureScope measureScope, long j11) {
            return MeasureScope.super.mo376toPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3906toPx0680j_4(@k MeasureScope measureScope, float f11) {
            return MeasureScope.super.mo377toPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        @k
        public static Rect toRect(@k MeasureScope measureScope, @k DpRect dpRect) {
            return MeasureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3907toSizeXkaWNTQ(@k MeasureScope measureScope, long j11) {
            return MeasureScope.super.mo378toSizeXkaWNTQ(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3908toSp0xMU5do(@k MeasureScope measureScope, float f11) {
            return MeasureScope.super.mo379toSp0xMU5do(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3909toSpkPz2Gy4(@k MeasureScope measureScope, float f11) {
            return MeasureScope.super.mo380toSpkPz2Gy4(f11);
        }

        @Deprecated
        @k
        public static MeasureResult layout(@k MeasureScope measureScope, int i11, int i12, @k Map<AlignmentLine, Integer> map, @m80.l l<? super RulerScope, g2> lVar, @k l<? super Placeable.PlacementScope, g2> lVar2) {
            return MeasureScope.super.layout(i11, i12, map, lVar, lVar2);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3903toDpu2uoSUM(@k MeasureScope measureScope, int i11) {
            return MeasureScope.super.mo374toDpu2uoSUM(i11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3910toSpkPz2Gy4(@k MeasureScope measureScope, int i11) {
            return MeasureScope.super.mo381toSpkPz2Gy4(i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i11, int i12, Map map, l lVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i13 & 4) != 0) {
            map = l1.z();
        }
        return measureScope.layout(i11, i12, map, lVar);
    }

    @k
    default MeasureResult layout(int i11, int i12, @k Map<AlignmentLine, Integer> map, @k l<? super Placeable.PlacementScope, g2> lVar) {
        return layout(i11, i12, map, null, lVar);
    }

    @k
    default MeasureResult layout(final int i11, final int i12, @k final Map<AlignmentLine, Integer> map, @m80.l final l<? super RulerScope, g2> lVar, @k final l<? super Placeable.PlacementScope, g2> lVar2) {
        if (!((i11 & (-16777216)) == 0 && ((-16777216) & i12) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i11, i12, map, lVar, this, lVar2) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
            final /* synthetic */ l<Placeable.PlacementScope, g2> $placementBlock;
            final /* synthetic */ int $width;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final l<RulerScope, g2> rulers;
            final /* synthetic */ MeasureScope this$0;
            private final int width;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$width = i11;
                this.this$0 = this;
                this.$placementBlock = lVar2;
                this.width = i11;
                this.height = i12;
                this.alignmentLines = map;
                this.rulers = lVar;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public l<RulerScope, g2> getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                MeasureScope measureScope = this.this$0;
                if (measureScope instanceof LookaheadCapablePlaceable) {
                    this.$placementBlock.invoke(((LookaheadCapablePlaceable) measureScope).getPlacementScope());
                } else {
                    this.$placementBlock.invoke(new SimplePlacementScope(this.$width, this.this$0.getLayoutDirection()));
                }
            }
        };
    }

    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i11, int i12, Map map, l lVar, l lVar2, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i13 & 4) != 0) {
            map = l1.z();
        }
        Map map2 = map;
        if ((i13 & 8) != 0) {
            lVar = null;
        }
        return measureScope.layout(i11, i12, map2, lVar, lVar2);
    }
}
