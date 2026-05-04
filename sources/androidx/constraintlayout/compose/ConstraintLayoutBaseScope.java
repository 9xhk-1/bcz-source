package androidx.constraintlayout.compose;

import a00.a0;
import android.annotation.SuppressLint;
import androidx.annotation.IntRange;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nConstraintLayoutBaseScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/ConstraintLayoutBaseScope\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/LayoutReference\n*L\n1#1,1456:1\n13579#2,2:1457\n13579#2,2:1459\n13579#2,2:1461\n13579#2,2:1464\n13579#2,2:1466\n13579#2,2:1469\n13579#2,2:1471\n13579#2,2:1474\n13579#2,2:1476\n13579#2,2:1479\n13579#2,2:1481\n13579#2,2:1484\n13579#2,2:1486\n13579#2,2:1496\n13579#2,2:1498\n13579#2,2:1508\n13579#2:1512\n13580#2:1514\n13579#2,2:1515\n13579#2:1517\n13580#2:1519\n13579#2,2:1520\n149#3:1463\n149#3:1468\n149#3:1473\n149#3:1478\n149#3:1483\n149#3:1488\n149#3:1489\n149#3:1490\n149#3:1491\n149#3:1492\n149#3:1493\n149#3:1494\n149#3:1495\n149#3:1500\n149#3:1501\n149#3:1502\n149#3:1503\n149#3:1504\n149#3:1505\n149#3:1506\n149#3:1507\n149#3:1510\n149#3:1511\n149#3:1522\n149#3:1523\n149#3:1524\n149#3:1525\n149#3:1526\n149#3:1527\n149#3:1528\n149#3:1529\n149#3:1530\n149#3:1531\n149#3:1532\n149#3:1533\n149#3:1534\n149#3:1535\n149#3:1536\n149#3:1537\n149#3:1538\n149#3:1539\n149#3:1540\n149#3:1541\n149#3:1542\n149#3:1543\n149#3:1544\n149#3:1545\n1110#4:1513\n1110#4:1518\n*S KotlinDebug\n*F\n+ 1 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/ConstraintLayoutBaseScope\n*L\n139#1:1457,2\n333#1:1459,2\n343#1:1461,2\n356#1:1464,2\n366#1:1466,2\n376#1:1469,2\n386#1:1471,2\n396#1:1474,2\n406#1:1476,2\n419#1:1479,2\n429#1:1481,2\n439#1:1484,2\n449#1:1486,2\n612#1:1496,2\n640#1:1498,2\n788#1:1508,2\n837#1:1512\n837#1:1514\n865#1:1515,2\n882#1:1517\n882#1:1519\n910#1:1520,2\n329#1:1463\n351#1:1468\n372#1:1473\n392#1:1478\n414#1:1483\n435#1:1488\n478#1:1489\n479#1:1490\n481#1:1491\n535#1:1492\n536#1:1493\n538#1:1494\n539#1:1495\n595#1:1500\n596#1:1501\n598#1:1502\n599#1:1503\n600#1:1504\n601#1:1505\n661#1:1506\n694#1:1507\n767#1:1510\n768#1:1511\n944#1:1522\n945#1:1523\n946#1:1524\n947#1:1525\n948#1:1526\n949#1:1527\n950#1:1528\n951#1:1529\n1002#1:1530\n1004#1:1531\n1006#1:1532\n1008#1:1533\n994#1:1534\n995#1:1535\n996#1:1536\n997#1:1537\n1043#1:1538\n1045#1:1539\n1047#1:1540\n1049#1:1541\n1036#1:1542\n1037#1:1543\n1038#1:1544\n1039#1:1545\n838#1:1513\n883#1:1518\n*E\n"})
/* loaded from: classes2.dex */
public abstract class ConstraintLayoutBaseScope {
    public static final int $stable = 8;
    private final int HelpersStartId;

    @k
    private final CLObject containerObject;
    private int helperId;
    private int helpersHashCode;

    @k
    private final List<l<State, g2>> tasks;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Stable
    public static final class BaselineAnchor {
        public static final int $stable = 0;

        /* renamed from: id, reason: collision with root package name */
        @k
        private final Object f4238id;

        @k
        private final LayoutReference reference;

        public BaselineAnchor(@k Object obj, @k LayoutReference layoutReference) {
            this.f4238id = obj;
            this.reference = layoutReference;
        }

        public static /* synthetic */ BaselineAnchor copy$default(BaselineAnchor baselineAnchor, Object obj, LayoutReference layoutReference, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = baselineAnchor.f4238id;
            }
            if ((i11 & 2) != 0) {
                layoutReference = baselineAnchor.reference;
            }
            return baselineAnchor.copy(obj, layoutReference);
        }

        @k
        public final Object component1$constraintlayout_compose_release() {
            return this.f4238id;
        }

        @k
        public final LayoutReference component2() {
            return this.reference;
        }

        @k
        public final BaselineAnchor copy(@k Object obj, @k LayoutReference layoutReference) {
            return new BaselineAnchor(obj, layoutReference);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BaselineAnchor)) {
                return false;
            }
            BaselineAnchor baselineAnchor = (BaselineAnchor) obj;
            return g0.g(this.f4238id, baselineAnchor.f4238id) && g0.g(this.reference, baselineAnchor.reference);
        }

        @k
        public final Object getId$constraintlayout_compose_release() {
            return this.f4238id;
        }

        @k
        public final LayoutReference getReference() {
            return this.reference;
        }

        public int hashCode() {
            return (this.f4238id.hashCode() * 31) + this.reference.hashCode();
        }

        @k
        public String toString() {
            return "BaselineAnchor(id=" + this.f4238id + ", reference=" + this.reference + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Stable
    public static final class HorizontalAnchor {
        public static final int $stable = 0;

        /* renamed from: id, reason: collision with root package name */
        @k
        private final Object f4239id;
        private final int index;

        @k
        private final LayoutReference reference;

        public HorizontalAnchor(@k Object obj, int i11, @k LayoutReference layoutReference) {
            this.f4239id = obj;
            this.index = i11;
            this.reference = layoutReference;
        }

        public static /* synthetic */ HorizontalAnchor copy$default(HorizontalAnchor horizontalAnchor, Object obj, int i11, LayoutReference layoutReference, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = horizontalAnchor.f4239id;
            }
            if ((i12 & 2) != 0) {
                i11 = horizontalAnchor.index;
            }
            if ((i12 & 4) != 0) {
                layoutReference = horizontalAnchor.reference;
            }
            return horizontalAnchor.copy(obj, i11, layoutReference);
        }

        @k
        public final Object component1$constraintlayout_compose_release() {
            return this.f4239id;
        }

        public final int component2$constraintlayout_compose_release() {
            return this.index;
        }

        @k
        public final LayoutReference component3() {
            return this.reference;
        }

        @k
        public final HorizontalAnchor copy(@k Object obj, int i11, @k LayoutReference layoutReference) {
            return new HorizontalAnchor(obj, i11, layoutReference);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalAnchor)) {
                return false;
            }
            HorizontalAnchor horizontalAnchor = (HorizontalAnchor) obj;
            return g0.g(this.f4239id, horizontalAnchor.f4239id) && this.index == horizontalAnchor.index && g0.g(this.reference, horizontalAnchor.reference);
        }

        @k
        public final Object getId$constraintlayout_compose_release() {
            return this.f4239id;
        }

        public final int getIndex$constraintlayout_compose_release() {
            return this.index;
        }

        @k
        public final LayoutReference getReference() {
            return this.reference;
        }

        public int hashCode() {
            return (((this.f4239id.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.reference.hashCode();
        }

        @k
        public String toString() {
            return "HorizontalAnchor(id=" + this.f4239id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Stable
    public static final class VerticalAnchor {
        public static final int $stable = 0;

        /* renamed from: id, reason: collision with root package name */
        @k
        private final Object f4240id;
        private final int index;

        @k
        private final LayoutReference reference;

        public VerticalAnchor(@k Object obj, int i11, @k LayoutReference layoutReference) {
            this.f4240id = obj;
            this.index = i11;
            this.reference = layoutReference;
        }

        public static /* synthetic */ VerticalAnchor copy$default(VerticalAnchor verticalAnchor, Object obj, int i11, LayoutReference layoutReference, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = verticalAnchor.f4240id;
            }
            if ((i12 & 2) != 0) {
                i11 = verticalAnchor.index;
            }
            if ((i12 & 4) != 0) {
                layoutReference = verticalAnchor.reference;
            }
            return verticalAnchor.copy(obj, i11, layoutReference);
        }

        @k
        public final Object component1$constraintlayout_compose_release() {
            return this.f4240id;
        }

        public final int component2$constraintlayout_compose_release() {
            return this.index;
        }

        @k
        public final LayoutReference component3() {
            return this.reference;
        }

        @k
        public final VerticalAnchor copy(@k Object obj, int i11, @k LayoutReference layoutReference) {
            return new VerticalAnchor(obj, i11, layoutReference);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerticalAnchor)) {
                return false;
            }
            VerticalAnchor verticalAnchor = (VerticalAnchor) obj;
            return g0.g(this.f4240id, verticalAnchor.f4240id) && this.index == verticalAnchor.index && g0.g(this.reference, verticalAnchor.reference);
        }

        @k
        public final Object getId$constraintlayout_compose_release() {
            return this.f4240id;
        }

        public final int getIndex$constraintlayout_compose_release() {
            return this.index;
        }

        @k
        public final LayoutReference getReference() {
            return this.reference;
        }

        public int hashCode() {
            return (((this.f4240id.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.reference.hashCode();
        }

        @k
        public String toString() {
            return "VerticalAnchor(id=" + this.f4240id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }
    }

    public ConstraintLayoutBaseScope(@m80.l CLObject cLObject) {
        CLObject mo5597clone;
        this.tasks = new ArrayList();
        this.containerObject = (cLObject == null || (mo5597clone = cLObject.mo5597clone()) == null) ? new CLObject(new char[0]) : mo5597clone;
        this.HelpersStartId = 1000;
        this.helperId = 1000;
    }

    /* renamed from: createAbsoluteLeftBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m5405createAbsoluteLeftBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAbsoluteLeftBarrier-3ABfNKs");
        }
        if ((i11 & 2) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        return constraintLayoutBaseScope.m5420createAbsoluteLeftBarrier3ABfNKs(layoutReferenceArr, f11);
    }

    /* renamed from: createAbsoluteRightBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m5406createAbsoluteRightBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAbsoluteRightBarrier-3ABfNKs");
        }
        if ((i11 & 2) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        return constraintLayoutBaseScope.m5421createAbsoluteRightBarrier3ABfNKs(layoutReferenceArr, f11);
    }

    /* renamed from: createBottomBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ HorizontalAnchor m5407createBottomBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBottomBarrier-3ABfNKs");
        }
        if ((i11 & 2) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        return constraintLayoutBaseScope.m5422createBottomBarrier3ABfNKs(layoutReferenceArr, f11);
    }

    /* renamed from: createColumn-lG28NQ4$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m5408createColumnlG28NQ4$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f11, float[] fArr, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createColumn-lG28NQ4");
        }
        if ((i11 & 2) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 4) != 0) {
            fArr = new float[0];
        }
        return constraintLayoutBaseScope.m5423createColumnlG28NQ4(layoutReferenceArr, f11, fArr);
    }

    /* renamed from: createEndBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m5409createEndBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createEndBarrier-3ABfNKs");
        }
        if ((i11 & 2) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        return constraintLayoutBaseScope.m5424createEndBarrier3ABfNKs(layoutReferenceArr, f11);
    }

    /* renamed from: createFlow-6oEtc9w$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m5410createFlow6oEtc9w$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, boolean z11, float f11, float f12, int i11, float f13, float f14, Wrap wrap, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float f15, float f16, FlowStyle flowStyle, FlowStyle flowStyle2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow-6oEtc9w");
        }
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return constraintLayoutBaseScope.m5425createFlow6oEtc9w(layoutReferenceArr, z11, (i12 & 4) != 0 ? Dp.m5115constructorimpl(0) : f11, (i12 & 8) != 0 ? Dp.m5115constructorimpl(0) : f12, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? Dp.m5115constructorimpl(0) : f13, (i12 & 64) != 0 ? Dp.m5115constructorimpl(0) : f14, (i12 & 128) != 0 ? Wrap.Companion.getNone() : wrap, (i12 & 256) != 0 ? VerticalAlign.Companion.getCenter() : verticalAlign, (i12 & 512) != 0 ? HorizontalAlign.Companion.getCenter() : horizontalAlign, (i12 & 1024) != 0 ? 0.0f : f15, (i12 & 2048) == 0 ? f16 : 0.0f, (i12 & 4096) != 0 ? FlowStyle.Companion.getPacked() : flowStyle, (i12 & 8192) != 0 ? FlowStyle.Companion.getPacked() : flowStyle2);
    }

    /* renamed from: createFlow-Fgo90cY$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m5411createFlowFgo90cY$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, boolean z11, float f11, float f12, int i11, float f13, float f14, float f15, float f16, Wrap wrap, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float f17, float f18, FlowStyle flowStyle, FlowStyle flowStyle2, int i12, Object obj) {
        if (obj == null) {
            return constraintLayoutBaseScope.m5426createFlowFgo90cY(layoutReferenceArr, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? Dp.m5115constructorimpl(0) : f11, (i12 & 8) != 0 ? Dp.m5115constructorimpl(0) : f12, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? Dp.m5115constructorimpl(0) : f13, (i12 & 64) != 0 ? Dp.m5115constructorimpl(0) : f14, (i12 & 128) != 0 ? Dp.m5115constructorimpl(0) : f15, (i12 & 256) != 0 ? Dp.m5115constructorimpl(0) : f16, (i12 & 512) != 0 ? Wrap.Companion.getNone() : wrap, (i12 & 1024) != 0 ? VerticalAlign.Companion.getCenter() : verticalAlign, (i12 & 2048) != 0 ? HorizontalAlign.Companion.getCenter() : horizontalAlign, (i12 & 4096) != 0 ? 0.0f : f17, (i12 & 8192) == 0 ? f18 : 0.0f, (i12 & 16384) != 0 ? FlowStyle.Companion.getPacked() : flowStyle, (i12 & 32768) != 0 ? FlowStyle.Companion.getPacked() : flowStyle2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow-Fgo90cY");
    }

    /* renamed from: createFlow-IkjhEj4$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m5412createFlowIkjhEj4$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, boolean z11, float f11, float f12, int i11, float f13, Wrap wrap, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float f14, float f15, FlowStyle flowStyle, FlowStyle flowStyle2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow-IkjhEj4");
        }
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        return constraintLayoutBaseScope.m5427createFlowIkjhEj4(layoutReferenceArr, z11, f11, (i12 & 8) != 0 ? Dp.m5115constructorimpl(0) : f12, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? Dp.m5115constructorimpl(0) : f13, (i12 & 64) != 0 ? Wrap.Companion.getNone() : wrap, (i12 & 128) != 0 ? VerticalAlign.Companion.getCenter() : verticalAlign, (i12 & 256) != 0 ? HorizontalAlign.Companion.getCenter() : horizontalAlign, (i12 & 512) != 0 ? 0.0f : f14, (i12 & 1024) == 0 ? f15 : 0.0f, (i12 & 2048) != 0 ? FlowStyle.Companion.getPacked() : flowStyle, (i12 & 4096) != 0 ? FlowStyle.Companion.getPacked() : flowStyle2);
    }

    /* renamed from: createGrid-Hu23Yyw$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m5413createGridHu23Yyw$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, int i11, int i12, boolean z11, float f11, float f12, float[] fArr, float[] fArr2, Skip[] skipArr, Span[] spanArr, int i13, int i14, Object obj) {
        if (obj == null) {
            return constraintLayoutBaseScope.m5428createGridHu23Yyw(layoutReferenceArr, i11, i12, (i14 & 8) != 0 ? true : z11, (i14 & 16) != 0 ? Dp.m5115constructorimpl(0) : f11, (i14 & 32) != 0 ? Dp.m5115constructorimpl(0) : f12, (i14 & 64) != 0 ? new float[0] : fArr, (i14 & 128) != 0 ? new float[0] : fArr2, (i14 & 256) != 0 ? new Skip[0] : skipArr, (i14 & 512) != 0 ? new Span[0] : spanArr, (i14 & 1024) != 0 ? GridFlag.Companion.m5487getNonedTRCCdc() : i13);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createGrid-Hu23Yyw");
    }

    private final int createHelperId() {
        int i11 = this.helperId;
        this.helperId = i11 + 1;
        return i11;
    }

    public static /* synthetic */ HorizontalChainReference createHorizontalChain$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, ChainStyle chainStyle, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createHorizontalChain");
        }
        if ((i11 & 2) != 0) {
            chainStyle = ChainStyle.Companion.getSpread();
        }
        return constraintLayoutBaseScope.createHorizontalChain(layoutReferenceArr, chainStyle);
    }

    /* renamed from: createRow-lG28NQ4$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m5414createRowlG28NQ4$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f11, float[] fArr, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createRow-lG28NQ4");
        }
        if ((i11 & 2) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 4) != 0) {
            fArr = new float[0];
        }
        return constraintLayoutBaseScope.m5435createRowlG28NQ4(layoutReferenceArr, f11, fArr);
    }

    /* renamed from: createStartBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m5415createStartBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createStartBarrier-3ABfNKs");
        }
        if ((i11 & 2) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        return constraintLayoutBaseScope.m5436createStartBarrier3ABfNKs(layoutReferenceArr, f11);
    }

    /* renamed from: createTopBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ HorizontalAnchor m5416createTopBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTopBarrier-3ABfNKs");
        }
        if ((i11 & 2) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        return constraintLayoutBaseScope.m5437createTopBarrier3ABfNKs(layoutReferenceArr, f11);
    }

    public static /* synthetic */ VerticalChainReference createVerticalChain$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, ChainStyle chainStyle, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createVerticalChain");
        }
        if ((i11 & 2) != 0) {
            chainStyle = ChainStyle.Companion.getSpread();
        }
        return constraintLayoutBaseScope.createVerticalChain(layoutReferenceArr, chainStyle);
    }

    private final void updateHelpersHashCode(int i11) {
        this.helpersHashCode = ((this.helpersHashCode * 1009) + i11) % 1000000007;
    }

    /* renamed from: withChainParams-ouYQatA$default, reason: not valid java name */
    public static /* synthetic */ LayoutReference m5417withChainParamsouYQatA$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference layoutReference, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, int i11, Object obj) {
        if (obj == null) {
            return constraintLayoutBaseScope.m5438withChainParamsouYQatA(layoutReference, (i11 & 1) != 0 ? Dp.m5115constructorimpl(0) : f11, (i11 & 2) != 0 ? Dp.m5115constructorimpl(0) : f12, (i11 & 4) != 0 ? Dp.m5115constructorimpl(0) : f13, (i11 & 8) != 0 ? Dp.m5115constructorimpl(0) : f14, (i11 & 16) != 0 ? Dp.m5115constructorimpl(0) : f15, (i11 & 32) != 0 ? Dp.m5115constructorimpl(0) : f16, (i11 & 64) != 0 ? Dp.m5115constructorimpl(0) : f17, (i11 & 128) != 0 ? Dp.m5115constructorimpl(0) : f18, (i11 & 256) != 0 ? Float.NaN : f19);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withChainParams-ouYQatA");
    }

    /* renamed from: withHorizontalChainParams-YLPp7PM$default, reason: not valid java name */
    public static /* synthetic */ LayoutReference m5418withHorizontalChainParamsYLPp7PM$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference layoutReference, float f11, float f12, float f13, float f14, float f15, int i11, Object obj) {
        if (obj == null) {
            return constraintLayoutBaseScope.m5439withHorizontalChainParamsYLPp7PM(layoutReference, (i11 & 1) != 0 ? Dp.m5115constructorimpl(0) : f11, (i11 & 2) != 0 ? Dp.m5115constructorimpl(0) : f12, (i11 & 4) != 0 ? Dp.m5115constructorimpl(0) : f13, (i11 & 8) != 0 ? Dp.m5115constructorimpl(0) : f14, (i11 & 16) != 0 ? Float.NaN : f15);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withHorizontalChainParams-YLPp7PM");
    }

    /* renamed from: withVerticalChainParams-YLPp7PM$default, reason: not valid java name */
    public static /* synthetic */ LayoutReference m5419withVerticalChainParamsYLPp7PM$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference layoutReference, float f11, float f12, float f13, float f14, float f15, int i11, Object obj) {
        if (obj == null) {
            return constraintLayoutBaseScope.m5440withVerticalChainParamsYLPp7PM(layoutReference, (i11 & 1) != 0 ? Dp.m5115constructorimpl(0) : f11, (i11 & 2) != 0 ? Dp.m5115constructorimpl(0) : f12, (i11 & 4) != 0 ? Dp.m5115constructorimpl(0) : f13, (i11 & 8) != 0 ? Dp.m5115constructorimpl(0) : f14, (i11 & 16) != 0 ? Float.NaN : f15);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withVerticalChainParams-YLPp7PM");
    }

    public final void applyTo(@k State state) {
        ConstraintSetParser.populateState(this.containerObject, state, new ConstraintSetParser.LayoutVariables());
    }

    @k
    public final CLObject asCLContainer$constraintlayout_compose_release(@k LayoutReference layoutReference) {
        String obj = layoutReference.getId$constraintlayout_compose_release().toString();
        if (this.containerObject.getObjectOrNull(obj) == null) {
            this.containerObject.put(obj, new CLObject(new char[0]));
        }
        return this.containerObject.getObject(obj);
    }

    @k
    public final HorizontalChainScope constrain(@k HorizontalChainReference horizontalChainReference, @k l<? super HorizontalChainScope, g2> lVar) {
        HorizontalChainScope horizontalChainScope = new HorizontalChainScope(horizontalChainReference.getId$constraintlayout_compose_release(), asCLContainer$constraintlayout_compose_release(horizontalChainReference));
        lVar.invoke(horizontalChainScope);
        return horizontalChainScope;
    }

    @k
    /* renamed from: createAbsoluteLeftBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m5420createAbsoluteLeftBarrier3ABfNKs(@k LayoutReference[] layoutReferenceArr, float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose_release().toString()));
        }
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "barrier");
        asCLContainer$constraintlayout_compose_release.putString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, TtmlNode.LEFT);
        asCLContainer$constraintlayout_compose_release.putNumber("margin", f11);
        asCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(11);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(Dp.m5121hashCodeimpl(f11));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @k
    /* renamed from: createAbsoluteRightBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m5421createAbsoluteRightBarrier3ABfNKs(@k LayoutReference[] layoutReferenceArr, float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose_release().toString()));
        }
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "barrier");
        asCLContainer$constraintlayout_compose_release.putString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, TtmlNode.RIGHT);
        asCLContainer$constraintlayout_compose_release.putNumber("margin", f11);
        asCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(14);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(Dp.m5121hashCodeimpl(f11));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @k
    /* renamed from: createBottomBarrier-3ABfNKs, reason: not valid java name */
    public final HorizontalAnchor m5422createBottomBarrier3ABfNKs(@k LayoutReference[] layoutReferenceArr, float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose_release().toString()));
        }
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "barrier");
        asCLContainer$constraintlayout_compose_release.putString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "bottom");
        asCLContainer$constraintlayout_compose_release.putNumber("margin", f11);
        asCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(15);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(Dp.m5121hashCodeimpl(f11));
        return new HorizontalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @SuppressLint({"Range"})
    @k
    /* renamed from: createColumn-lG28NQ4, reason: not valid java name */
    public final ConstrainedLayoutReference m5423createColumnlG28NQ4(@k LayoutReference[] layoutReferenceArr, float f11, @k float[] fArr) {
        if ((fArr.length == 0) || layoutReferenceArr.length == fArr.length) {
            return m5413createGridHu23Yyw$default(this, (LayoutReference[]) Arrays.copyOf(layoutReferenceArr, layoutReferenceArr.length), 0, 1, false, f11, 0.0f, fArr, null, null, null, 0, 1960, null);
        }
        throw new IllegalArgumentException("Number of weights (" + fArr.length + ") should match number of elements (" + layoutReferenceArr.length + ").");
    }

    @k
    /* renamed from: createEndBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m5424createEndBarrier3ABfNKs(@k LayoutReference[] layoutReferenceArr, float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose_release().toString()));
        }
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "barrier");
        asCLContainer$constraintlayout_compose_release.putString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, TtmlNode.END);
        asCLContainer$constraintlayout_compose_release.putNumber("margin", f11);
        asCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(13);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(Dp.m5121hashCodeimpl(f11));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @k
    /* renamed from: createFlow-6oEtc9w, reason: not valid java name */
    public final ConstrainedLayoutReference m5425createFlow6oEtc9w(@k LayoutReference[] layoutReferenceArr, boolean z11, float f11, float f12, int i11, float f13, float f14, @k Wrap wrap, @k VerticalAlign verticalAlign, @k HorizontalAlign horizontalAlign, float f15, float f16, @k FlowStyle flowStyle, @k FlowStyle flowStyle2) {
        return m5426createFlowFgo90cY((LayoutReference[]) Arrays.copyOf(layoutReferenceArr, layoutReferenceArr.length), z11, f11, f12, i11, f13, f14, f13, f14, wrap, verticalAlign, horizontalAlign, f15, f16, flowStyle, flowStyle2);
    }

    @k
    /* renamed from: createFlow-Fgo90cY, reason: not valid java name */
    public final ConstrainedLayoutReference m5426createFlowFgo90cY(@k LayoutReference[] layoutReferenceArr, boolean z11, float f11, float f12, int i11, float f13, float f14, float f15, float f16, @k Wrap wrap, @k VerticalAlign verticalAlign, @k HorizontalAlign horizontalAlign, float f17, float f18, @k FlowStyle flowStyle, @k FlowStyle flowStyle2) {
        ConstrainedLayoutReference constrainedLayoutReference = new ConstrainedLayoutReference(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            if (layoutReference != null) {
                cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose_release().toString()));
            }
        }
        CLArray cLArray2 = new CLArray(new char[0]);
        cLArray2.add(new CLNumber(f13));
        cLArray2.add(new CLNumber(f14));
        cLArray2.add(new CLNumber(f15));
        cLArray2.add(new CLNumber(f16));
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constrainedLayoutReference);
        asCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        asCLContainer$constraintlayout_compose_release.putString("type", z11 ? "vFlow" : "hFlow");
        asCLContainer$constraintlayout_compose_release.putNumber("vGap", f11);
        asCLContainer$constraintlayout_compose_release.putNumber("hGap", f12);
        asCLContainer$constraintlayout_compose_release.putNumber("maxElement", i11);
        asCLContainer$constraintlayout_compose_release.put("padding", cLArray2);
        asCLContainer$constraintlayout_compose_release.putString("wrap", wrap.getName$constraintlayout_compose_release());
        asCLContainer$constraintlayout_compose_release.putString("vAlign", verticalAlign.getName$constraintlayout_compose_release());
        asCLContainer$constraintlayout_compose_release.putString("hAlign", horizontalAlign.getName$constraintlayout_compose_release());
        asCLContainer$constraintlayout_compose_release.putNumber("hFlowBias", f17);
        asCLContainer$constraintlayout_compose_release.putNumber("vFlowBias", f18);
        asCLContainer$constraintlayout_compose_release.putString("vStyle", flowStyle.getName$constraintlayout_compose_release());
        asCLContainer$constraintlayout_compose_release.putString("hStyle", flowStyle2.getName$constraintlayout_compose_release());
        updateHelpersHashCode(16);
        int length = layoutReferenceArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            LayoutReference layoutReference2 = layoutReferenceArr[i12];
            updateHelpersHashCode(layoutReference2 != null ? layoutReference2.hashCode() : 0);
        }
        return constrainedLayoutReference;
    }

    @k
    /* renamed from: createFlow-IkjhEj4, reason: not valid java name */
    public final ConstrainedLayoutReference m5427createFlowIkjhEj4(@k LayoutReference[] layoutReferenceArr, boolean z11, float f11, float f12, int i11, float f13, @k Wrap wrap, @k VerticalAlign verticalAlign, @k HorizontalAlign horizontalAlign, float f14, float f15, @k FlowStyle flowStyle, @k FlowStyle flowStyle2) {
        return m5426createFlowFgo90cY((LayoutReference[]) Arrays.copyOf(layoutReferenceArr, layoutReferenceArr.length), z11, f11, f12, i11, f13, f13, f13, f13, wrap, verticalAlign, horizontalAlign, f14, f15, flowStyle, flowStyle2);
    }

    @k
    /* renamed from: createGrid-Hu23Yyw, reason: not valid java name */
    public final ConstrainedLayoutReference m5428createGridHu23Yyw(@k LayoutReference[] layoutReferenceArr, @IntRange(from = 1) int i11, @IntRange(from = 1) int i12, boolean z11, float f11, float f12, @k float[] fArr, @k float[] fArr2, @k Skip[] skipArr, @k Span[] spanArr, int i13) {
        CLElement cLElement;
        String str;
        String str2;
        String str3;
        if (!(fArr.length == 0) && i11 > 0 && i11 != fArr.length) {
            throw new IllegalArgumentException("Number of weights (" + fArr.length + ") should match number of rows (" + i11 + ").");
        }
        if (!(fArr2.length == 0) && i12 > 0 && i12 != fArr2.length) {
            throw new IllegalArgumentException("Number of weights (" + fArr2.length + ") should match number of columns (" + i12 + ").");
        }
        ConstrainedLayoutReference constrainedLayoutReference = new ConstrainedLayoutReference(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose_release().toString()));
        }
        if (fArr.length > 1) {
            cLElement = cLArray;
            str = a0.Bh(fArr, ",", null, null, 0, null, null, 62, null);
        } else {
            cLElement = cLArray;
            str = "";
        }
        if (fArr2.length > 1) {
            str2 = str;
            str3 = a0.Bh(fArr2, ",", null, null, 0, null, null, 62, null);
        } else {
            str2 = str;
            str3 = "";
        }
        String Eh = !(skipArr.length == 0) ? a0.Eh(skipArr, ",", null, null, 0, null, new l<Skip, CharSequence>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$createGrid$2
            @Override // x00.l
            public /* bridge */ /* synthetic */ CharSequence invoke(Skip skip) {
                return m5441invokefXgvMDs(skip.m5573unboximpl());
            }

            /* renamed from: invoke-fXgvMDs, reason: not valid java name */
            public final CharSequence m5441invokefXgvMDs(String str4) {
                return str4;
            }
        }, 30, null) : "";
        String Eh2 = spanArr.length == 0 ? "" : a0.Eh(spanArr, ",", null, null, 0, null, new l<Span, CharSequence>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$createGrid$3
            @Override // x00.l
            public /* bridge */ /* synthetic */ CharSequence invoke(Span span) {
                return m5442invoke56oDYsA(span.m5582unboximpl());
            }

            /* renamed from: invoke-56oDYsA, reason: not valid java name */
            public final CharSequence m5442invoke56oDYsA(String str4) {
                return str4;
            }
        }, 30, null);
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constrainedLayoutReference);
        asCLContainer$constraintlayout_compose_release.put("contains", cLElement);
        asCLContainer$constraintlayout_compose_release.putString("type", "grid");
        asCLContainer$constraintlayout_compose_release.putNumber("orientation", z11 ? 0.0f : 1.0f);
        asCLContainer$constraintlayout_compose_release.putNumber("rows", i11);
        asCLContainer$constraintlayout_compose_release.putNumber("columns", i12);
        asCLContainer$constraintlayout_compose_release.putNumber("vGap", f11);
        asCLContainer$constraintlayout_compose_release.putNumber("hGap", f12);
        asCLContainer$constraintlayout_compose_release.putString("rowWeights", str2);
        asCLContainer$constraintlayout_compose_release.putString("columnWeights", str3);
        asCLContainer$constraintlayout_compose_release.putString("skips", Eh);
        asCLContainer$constraintlayout_compose_release.putString("spans", Eh2);
        asCLContainer$constraintlayout_compose_release.putNumber("flags", i13);
        return constrainedLayoutReference;
    }

    @k
    public final VerticalAnchor createGuidelineFromAbsoluteLeft(float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "vGuideline");
        asCLContainer$constraintlayout_compose_release.putNumber("percent", f11);
        updateHelpersHashCode(4);
        updateHelpersHashCode(Float.hashCode(f11));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @k
    /* renamed from: createGuidelineFromAbsoluteLeft-0680j_4, reason: not valid java name */
    public final VerticalAnchor m5429createGuidelineFromAbsoluteLeft0680j_4(float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "vGuideline");
        asCLContainer$constraintlayout_compose_release.putNumber(TtmlNode.LEFT, f11);
        updateHelpersHashCode(2);
        updateHelpersHashCode(Dp.m5121hashCodeimpl(f11));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @k
    public final VerticalAnchor createGuidelineFromAbsoluteRight(float f11) {
        return createGuidelineFromAbsoluteLeft(1.0f - f11);
    }

    @k
    /* renamed from: createGuidelineFromAbsoluteRight-0680j_4, reason: not valid java name */
    public final VerticalAnchor m5430createGuidelineFromAbsoluteRight0680j_4(float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "vGuideline");
        asCLContainer$constraintlayout_compose_release.putNumber(TtmlNode.RIGHT, f11);
        updateHelpersHashCode(6);
        updateHelpersHashCode(Dp.m5121hashCodeimpl(f11));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @k
    public final HorizontalAnchor createGuidelineFromBottom(float f11) {
        return createGuidelineFromTop(1.0f - f11);
    }

    @k
    /* renamed from: createGuidelineFromBottom-0680j_4, reason: not valid java name */
    public final HorizontalAnchor m5431createGuidelineFromBottom0680j_4(float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "hGuideline");
        asCLContainer$constraintlayout_compose_release.putNumber(TtmlNode.END, f11);
        updateHelpersHashCode(9);
        updateHelpersHashCode(Dp.m5121hashCodeimpl(f11));
        return new HorizontalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @k
    public final VerticalAnchor createGuidelineFromEnd(float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(TtmlNode.END));
        cLArray.add(new CLNumber(f11));
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "vGuideline");
        asCLContainer$constraintlayout_compose_release.put("percent", cLArray);
        updateHelpersHashCode(3);
        updateHelpersHashCode(Float.hashCode(f11));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @k
    /* renamed from: createGuidelineFromEnd-0680j_4, reason: not valid java name */
    public final VerticalAnchor m5432createGuidelineFromEnd0680j_4(float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "vGuideline");
        asCLContainer$constraintlayout_compose_release.putNumber(TtmlNode.END, f11);
        updateHelpersHashCode(5);
        updateHelpersHashCode(Dp.m5121hashCodeimpl(f11));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @k
    public final VerticalAnchor createGuidelineFromStart(float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(TtmlNode.START));
        cLArray.add(new CLNumber(f11));
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "vGuideline");
        asCLContainer$constraintlayout_compose_release.put("percent", cLArray);
        updateHelpersHashCode(3);
        updateHelpersHashCode(Float.hashCode(f11));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @k
    /* renamed from: createGuidelineFromStart-0680j_4, reason: not valid java name */
    public final VerticalAnchor m5433createGuidelineFromStart0680j_4(float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "vGuideline");
        asCLContainer$constraintlayout_compose_release.putNumber(TtmlNode.START, f11);
        updateHelpersHashCode(1);
        updateHelpersHashCode(Dp.m5121hashCodeimpl(f11));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @k
    public final HorizontalAnchor createGuidelineFromTop(float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "hGuideline");
        asCLContainer$constraintlayout_compose_release.putNumber("percent", f11);
        updateHelpersHashCode(8);
        updateHelpersHashCode(Float.hashCode(f11));
        return new HorizontalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @k
    /* renamed from: createGuidelineFromTop-0680j_4, reason: not valid java name */
    public final HorizontalAnchor m5434createGuidelineFromTop0680j_4(float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "hGuideline");
        asCLContainer$constraintlayout_compose_release.putNumber(TtmlNode.START, f11);
        updateHelpersHashCode(7);
        updateHelpersHashCode(Dp.m5121hashCodeimpl(f11));
        return new HorizontalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLObject] */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.constraintlayout.core.parser.CLString] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.constraintlayout.compose.ConstraintLayoutBaseScope] */
    @k
    public final HorizontalChainReference createHorizontalChain(@k LayoutReference[] layoutReferenceArr, @k ChainStyle chainStyle) {
        ?? from;
        HorizontalChainReference horizontalChainReference = new HorizontalChainReference(Integer.valueOf(createHelperId()));
        ?? cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            Object obj = layoutReference.helperParamsMap.get(o0.d(ChainParams.class).C());
            if (!(obj instanceof ChainParams)) {
                obj = null;
            }
            ChainParams chainParams = (ChainParams) obj;
            if (chainParams != null) {
                from = new CLArray(new char[0]);
                from.add(CLString.from(layoutReference.getId$constraintlayout_compose_release().toString()));
                from.add(new CLNumber(chainParams.getWeight()));
                from.add(new CLNumber(chainParams.m5387getStartMarginD9Ej5fM()));
                from.add(new CLNumber(chainParams.m5385getEndMarginD9Ej5fM()));
                from.add(new CLNumber(chainParams.m5386getStartGoneMarginD9Ej5fM()));
                from.add(new CLNumber(chainParams.m5384getEndGoneMarginD9Ej5fM()));
            } else {
                from = CLString.from(layoutReference.getId$constraintlayout_compose_release().toString());
            }
            cLArray.add(from);
        }
        CLArray cLArray2 = new CLArray(new char[0]);
        cLArray2.add(CLString.from(chainStyle.getName$constraintlayout_compose_release()));
        Float bias$constraintlayout_compose_release = chainStyle.getBias$constraintlayout_compose_release();
        cLArray2.add(new CLNumber(bias$constraintlayout_compose_release != null ? bias$constraintlayout_compose_release.floatValue() : 0.5f));
        ?? asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(horizontalChainReference);
        asCLContainer$constraintlayout_compose_release.putString("type", "hChain");
        asCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        asCLContainer$constraintlayout_compose_release.put("style", cLArray2);
        updateHelpersHashCode(16);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(chainStyle.hashCode());
        return horizontalChainReference;
    }

    @SuppressLint({"Range"})
    @k
    /* renamed from: createRow-lG28NQ4, reason: not valid java name */
    public final ConstrainedLayoutReference m5435createRowlG28NQ4(@k LayoutReference[] layoutReferenceArr, float f11, @k float[] fArr) {
        if ((fArr.length == 0) || layoutReferenceArr.length == fArr.length) {
            return m5413createGridHu23Yyw$default(this, (LayoutReference[]) Arrays.copyOf(layoutReferenceArr, layoutReferenceArr.length), 1, 0, false, 0.0f, f11, null, fArr, null, null, 0, 1880, null);
        }
        throw new IllegalArgumentException("Number of weights (" + fArr.length + ") should match number of elements (" + layoutReferenceArr.length + ").");
    }

    @k
    /* renamed from: createStartBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m5436createStartBarrier3ABfNKs(@k LayoutReference[] layoutReferenceArr, float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose_release().toString()));
        }
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "barrier");
        asCLContainer$constraintlayout_compose_release.putString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, TtmlNode.START);
        asCLContainer$constraintlayout_compose_release.putNumber("margin", f11);
        asCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(10);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(Dp.m5121hashCodeimpl(f11));
        return new VerticalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    @k
    /* renamed from: createTopBarrier-3ABfNKs, reason: not valid java name */
    public final HorizontalAnchor m5437createTopBarrier3ABfNKs(@k LayoutReference[] layoutReferenceArr, float f11) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            cLArray.add(CLString.from(layoutReference.getId$constraintlayout_compose_release().toString()));
        }
        CLObject asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        asCLContainer$constraintlayout_compose_release.putString("type", "barrier");
        asCLContainer$constraintlayout_compose_release.putString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "top");
        asCLContainer$constraintlayout_compose_release.putNumber("margin", f11);
        asCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(12);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(Dp.m5121hashCodeimpl(f11));
        return new HorizontalAnchor(layoutReferenceImpl.getId$constraintlayout_compose_release(), 0, layoutReferenceImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLObject] */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.constraintlayout.core.parser.CLString] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.constraintlayout.compose.ConstraintLayoutBaseScope] */
    @k
    public final VerticalChainReference createVerticalChain(@k LayoutReference[] layoutReferenceArr, @k ChainStyle chainStyle) {
        ?? from;
        VerticalChainReference verticalChainReference = new VerticalChainReference(Integer.valueOf(createHelperId()));
        ?? cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : layoutReferenceArr) {
            Object obj = layoutReference.helperParamsMap.get(o0.d(ChainParams.class).C());
            if (!(obj instanceof ChainParams)) {
                obj = null;
            }
            ChainParams chainParams = (ChainParams) obj;
            if (chainParams != null) {
                from = new CLArray(new char[0]);
                from.add(CLString.from(layoutReference.getId$constraintlayout_compose_release().toString()));
                from.add(new CLNumber(chainParams.getWeight()));
                from.add(new CLNumber(chainParams.m5389getTopMarginD9Ej5fM()));
                from.add(new CLNumber(chainParams.m5383getBottomMarginD9Ej5fM()));
                from.add(new CLNumber(chainParams.m5388getTopGoneMarginD9Ej5fM()));
                from.add(new CLNumber(chainParams.m5382getBottomGoneMarginD9Ej5fM()));
            } else {
                from = CLString.from(layoutReference.getId$constraintlayout_compose_release().toString());
            }
            cLArray.add(from);
        }
        CLArray cLArray2 = new CLArray(new char[0]);
        cLArray2.add(CLString.from(chainStyle.getName$constraintlayout_compose_release()));
        Float bias$constraintlayout_compose_release = chainStyle.getBias$constraintlayout_compose_release();
        cLArray2.add(new CLNumber(bias$constraintlayout_compose_release != null ? bias$constraintlayout_compose_release.floatValue() : 0.5f));
        ?? asCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(verticalChainReference);
        asCLContainer$constraintlayout_compose_release.putString("type", "vChain");
        asCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        asCLContainer$constraintlayout_compose_release.put("style", cLArray2);
        updateHelpersHashCode(17);
        for (LayoutReference layoutReference2 : layoutReferenceArr) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(chainStyle.hashCode());
        return verticalChainReference;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConstraintLayoutBaseScope) {
            return g0.g(this.containerObject, ((ConstraintLayoutBaseScope) obj).containerObject);
        }
        return false;
    }

    @k
    public final CLObject getContainerObject() {
        return this.containerObject;
    }

    public final int getHelpersHashCode() {
        return this.helpersHashCode;
    }

    @k
    public final List<l<State, g2>> getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return this.containerObject.hashCode();
    }

    public void reset() {
        this.containerObject.clear();
        this.helperId = this.HelpersStartId;
        this.helpersHashCode = 0;
    }

    public final void setHelpersHashCode(int i11) {
        this.helpersHashCode = i11;
    }

    @k
    /* renamed from: withChainParams-ouYQatA, reason: not valid java name */
    public final LayoutReference m5438withChainParamsouYQatA(@k LayoutReference layoutReference, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        layoutReference.setHelperParams$constraintlayout_compose_release(new ChainParams(f11, f12, f13, f14, f15, f16, f17, f18, f19, null));
        return layoutReference;
    }

    @k
    /* renamed from: withHorizontalChainParams-YLPp7PM, reason: not valid java name */
    public final LayoutReference m5439withHorizontalChainParamsYLPp7PM(@k LayoutReference layoutReference, float f11, float f12, float f13, float f14, float f15) {
        float f16 = 0;
        return m5438withChainParamsouYQatA(layoutReference, f11, Dp.m5115constructorimpl(f16), f12, Dp.m5115constructorimpl(f16), f13, Dp.m5115constructorimpl(f16), f14, Dp.m5115constructorimpl(f16), f15);
    }

    @k
    /* renamed from: withVerticalChainParams-YLPp7PM, reason: not valid java name */
    public final LayoutReference m5440withVerticalChainParamsYLPp7PM(@k LayoutReference layoutReference, float f11, float f12, float f13, float f14, float f15) {
        float f16 = 0;
        return m5438withChainParamsouYQatA(layoutReference, Dp.m5115constructorimpl(f16), f11, Dp.m5115constructorimpl(f16), f12, Dp.m5115constructorimpl(f16), f13, Dp.m5115constructorimpl(f16), f14, f15);
    }

    @k
    public final VerticalChainScope constrain(@k VerticalChainReference verticalChainReference, @k l<? super VerticalChainScope, g2> lVar) {
        VerticalChainScope verticalChainScope = new VerticalChainScope(verticalChainReference.getId$constraintlayout_compose_release(), asCLContainer$constraintlayout_compose_release(verticalChainReference));
        lVar.invoke(verticalChainScope);
        return verticalChainScope;
    }

    @k
    public final ConstrainScope constrain(@k ConstrainedLayoutReference constrainedLayoutReference, @k l<? super ConstrainScope, g2> lVar) {
        ConstrainScope constrainScope = new ConstrainScope(constrainedLayoutReference.getId$constraintlayout_compose_release(), asCLContainer$constraintlayout_compose_release(constrainedLayoutReference));
        lVar.invoke(constrainScope);
        return constrainScope;
    }

    public final void constrain(@k ConstrainedLayoutReference[] constrainedLayoutReferenceArr, @k l<? super ConstrainScope, g2> lVar) {
        for (ConstrainedLayoutReference constrainedLayoutReference : constrainedLayoutReferenceArr) {
            constrain(constrainedLayoutReference, lVar);
        }
    }

    public ConstraintLayoutBaseScope() {
        this(null);
    }

    @v0
    public static /* synthetic */ void getContainerObject$annotations() {
    }

    @v0
    public static /* synthetic */ void getHelpersHashCode$annotations() {
    }

    @n(message = "Tasks is unused, it breaks the immutability promise.")
    public static /* synthetic */ void getTasks$annotations() {
    }
}
