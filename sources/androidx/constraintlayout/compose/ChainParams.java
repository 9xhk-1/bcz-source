package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nConstraintLayoutBaseScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/ChainParams\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1456:1\n149#2:1457\n149#2:1458\n149#2:1459\n149#2:1460\n149#2:1461\n149#2:1462\n149#2:1463\n149#2:1464\n*S KotlinDebug\n*F\n+ 1 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/ChainParams\n*L\n1143#1:1457\n1144#1:1458\n1145#1:1459\n1146#1:1460\n1147#1:1461\n1148#1:1462\n1149#1:1463\n1150#1:1464\n*E\n"})
/* loaded from: classes2.dex */
public final class ChainParams implements HelperParams {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final ChainParams Default;
    private final float bottomGoneMargin;
    private final float bottomMargin;
    private final float endGoneMargin;
    private final float endMargin;
    private final float startGoneMargin;
    private final float startMargin;
    private final float topGoneMargin;
    private final float topMargin;
    private final float weight;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final ChainParams getDefault$constraintlayout_compose_release() {
            return ChainParams.Default;
        }

        private Companion() {
        }
    }

    static {
        float f11 = 0;
        Default = new ChainParams(Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Float.NaN, null);
    }

    public /* synthetic */ ChainParams(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, v vVar) {
        this(f11, f12, f13, f14, f15, f16, f17, f18, f19);
    }

    /* renamed from: getBottomGoneMargin-D9Ej5fM, reason: not valid java name */
    public final float m5382getBottomGoneMarginD9Ej5fM() {
        return this.bottomGoneMargin;
    }

    /* renamed from: getBottomMargin-D9Ej5fM, reason: not valid java name */
    public final float m5383getBottomMarginD9Ej5fM() {
        return this.bottomMargin;
    }

    /* renamed from: getEndGoneMargin-D9Ej5fM, reason: not valid java name */
    public final float m5384getEndGoneMarginD9Ej5fM() {
        return this.endGoneMargin;
    }

    /* renamed from: getEndMargin-D9Ej5fM, reason: not valid java name */
    public final float m5385getEndMarginD9Ej5fM() {
        return this.endMargin;
    }

    /* renamed from: getStartGoneMargin-D9Ej5fM, reason: not valid java name */
    public final float m5386getStartGoneMarginD9Ej5fM() {
        return this.startGoneMargin;
    }

    /* renamed from: getStartMargin-D9Ej5fM, reason: not valid java name */
    public final float m5387getStartMarginD9Ej5fM() {
        return this.startMargin;
    }

    /* renamed from: getTopGoneMargin-D9Ej5fM, reason: not valid java name */
    public final float m5388getTopGoneMarginD9Ej5fM() {
        return this.topGoneMargin;
    }

    /* renamed from: getTopMargin-D9Ej5fM, reason: not valid java name */
    public final float m5389getTopMarginD9Ej5fM() {
        return this.topMargin;
    }

    public final float getWeight() {
        return this.weight;
    }

    private ChainParams(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.startMargin = f11;
        this.topMargin = f12;
        this.endMargin = f13;
        this.bottomMargin = f14;
        this.startGoneMargin = f15;
        this.topGoneMargin = f16;
        this.endGoneMargin = f17;
        this.bottomGoneMargin = f18;
        this.weight = f19;
    }
}
