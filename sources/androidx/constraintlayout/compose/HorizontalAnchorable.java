package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConstraintScopeCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintScopeCommon.kt\nandroidx/constraintlayout/compose/HorizontalAnchorable\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,167:1\n149#2:168\n149#2:169\n149#2:170\n149#2:171\n*S KotlinDebug\n*F\n+ 1 ConstraintScopeCommon.kt\nandroidx/constraintlayout/compose/HorizontalAnchorable\n*L\n51#1:168\n52#1:169\n58#1:170\n59#1:171\n*E\n"})
/* loaded from: classes2.dex */
public interface HorizontalAnchorable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
    }

    /* renamed from: linkTo-VpY3zN4$default, reason: not valid java name */
    static /* synthetic */ void m5491linkToVpY3zN4$default(HorizontalAnchorable horizontalAnchorable, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f11, float f12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
        if ((i11 & 2) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 4) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        horizontalAnchorable.mo5374linkToVpY3zN4(horizontalAnchor, f11, f12);
    }

    /* renamed from: linkTo-VpY3zN4 */
    void mo5373linkToVpY3zN4(@k ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor, float f11, float f12);

    /* renamed from: linkTo-VpY3zN4 */
    void mo5374linkToVpY3zN4(@k ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f11, float f12);

    /* renamed from: linkTo-VpY3zN4$default, reason: not valid java name */
    static /* synthetic */ void m5490linkToVpY3zN4$default(HorizontalAnchorable horizontalAnchorable, ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor, float f11, float f12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
        if ((i11 & 2) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 4) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        horizontalAnchorable.mo5373linkToVpY3zN4(baselineAnchor, f11, f12);
    }
}
