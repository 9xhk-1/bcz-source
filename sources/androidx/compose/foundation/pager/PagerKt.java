package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c10.d;
import c40.r0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,592:1\n113#2:593\n113#2:594\n113#2:595\n113#2:596\n113#2:597\n113#2:598\n113#2:599\n113#2:600\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n116#1:593\n119#1:594\n157#1:595\n160#1:596\n246#1:597\n249#1:598\n287#1:599\n290#1:600\n*E\n"})
/* loaded from: classes.dex */
public final class PagerKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03db  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: HorizontalPager--8jOkeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m970HorizontalPager8jOkeI(@m80.k final androidx.compose.foundation.pager.PagerState r36, @m80.l androidx.compose.ui.Modifier r37, @m80.l androidx.compose.foundation.layout.PaddingValues r38, @m80.l androidx.compose.foundation.pager.PageSize r39, int r40, float r41, @m80.l androidx.compose.ui.Alignment.Vertical r42, @m80.l androidx.compose.foundation.gestures.TargetedFlingBehavior r43, boolean r44, boolean r45, @m80.l x00.l<? super java.lang.Integer, ? extends java.lang.Object> r46, @m80.l androidx.compose.ui.input.nestedscroll.NestedScrollConnection r47, @m80.l androidx.compose.foundation.gestures.snapping.SnapPosition r48, @m80.l androidx.compose.foundation.OverscrollEffect r49, @m80.k final x00.r<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r50, @m80.l androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m970HorizontalPager8jOkeI(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, x00.l, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, androidx.compose.foundation.OverscrollEffect, x00.r, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: HorizontalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m971HorizontalPageroI3XNZo(final androidx.compose.foundation.pager.PagerState r34, androidx.compose.ui.Modifier r35, androidx.compose.foundation.layout.PaddingValues r36, androidx.compose.foundation.pager.PageSize r37, int r38, float r39, androidx.compose.ui.Alignment.Vertical r40, androidx.compose.foundation.gestures.TargetedFlingBehavior r41, boolean r42, boolean r43, x00.l r44, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r45, androidx.compose.foundation.gestures.snapping.SnapPosition r46, final x00.r r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m971HorizontalPageroI3XNZo(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, x00.l, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, x00.r, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03db  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: VerticalPager--8jOkeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m972VerticalPager8jOkeI(@m80.k final androidx.compose.foundation.pager.PagerState r36, @m80.l androidx.compose.ui.Modifier r37, @m80.l androidx.compose.foundation.layout.PaddingValues r38, @m80.l androidx.compose.foundation.pager.PageSize r39, int r40, float r41, @m80.l androidx.compose.ui.Alignment.Horizontal r42, @m80.l androidx.compose.foundation.gestures.TargetedFlingBehavior r43, boolean r44, boolean r45, @m80.l x00.l<? super java.lang.Integer, ? extends java.lang.Object> r46, @m80.l androidx.compose.ui.input.nestedscroll.NestedScrollConnection r47, @m80.l androidx.compose.foundation.gestures.snapping.SnapPosition r48, @m80.l androidx.compose.foundation.OverscrollEffect r49, @m80.k final x00.r<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r50, @m80.l androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m972VerticalPager8jOkeI(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, x00.l, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, androidx.compose.foundation.OverscrollEffect, x00.r, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: VerticalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m973VerticalPageroI3XNZo(final androidx.compose.foundation.pager.PagerState r34, androidx.compose.ui.Modifier r35, androidx.compose.foundation.layout.PaddingValues r36, androidx.compose.foundation.pager.PageSize r37, int r38, float r39, androidx.compose.ui.Alignment.Horizontal r40, androidx.compose.foundation.gestures.TargetedFlingBehavior r41, boolean r42, boolean r43, x00.l r44, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r45, androidx.compose.foundation.gestures.snapping.SnapPosition r46, final x00.r r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m973VerticalPageroI3XNZo(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, x00.l, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, x00.r, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final int currentPageOffset(@k SnapPosition snapPosition, int i11, int i12, int i13, int i14, int i15, int i16, float f11, int i17) {
        return d.L0(snapPosition.position(i11, i12, i14, i15, i16, i17) - (f11 * (i12 + i13)));
    }

    @k
    public static final Modifier pagerSemantics(@k Modifier modifier, @k final PagerState pagerState, final boolean z11, @k final r0 r0Var, boolean z12) {
        return z12 ? modifier.then(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (z11) {
                    final PagerState pagerState2 = pagerState;
                    final r0 r0Var2 = r0Var;
                    SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new a<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // x00.a
                        public final Boolean invoke() {
                            boolean pagerSemantics$performBackwardPaging;
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(PagerState.this, r0Var2);
                            return Boolean.valueOf(pagerSemantics$performBackwardPaging);
                        }
                    }, 1, null);
                    final PagerState pagerState3 = pagerState;
                    final r0 r0Var3 = r0Var;
                    SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new a<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // x00.a
                        public final Boolean invoke() {
                            boolean pagerSemantics$performForwardPaging;
                            pagerSemantics$performForwardPaging = PagerKt.pagerSemantics$performForwardPaging(PagerState.this, r0Var3);
                            return Boolean.valueOf(pagerSemantics$performForwardPaging);
                        }
                    }, 1, null);
                    return;
                }
                final PagerState pagerState4 = pagerState;
                final r0 r0Var4 = r0Var;
                SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new a<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final Boolean invoke() {
                        boolean pagerSemantics$performBackwardPaging;
                        pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(PagerState.this, r0Var4);
                        return Boolean.valueOf(pagerSemantics$performBackwardPaging);
                    }
                }, 1, null);
                final PagerState pagerState5 = pagerState;
                final r0 r0Var5 = r0Var;
                SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new a<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final Boolean invoke() {
                        boolean pagerSemantics$performForwardPaging;
                        pagerSemantics$performForwardPaging = PagerKt.pagerSemantics$performForwardPaging(PagerState.this, r0Var5);
                        return Boolean.valueOf(pagerSemantics$performForwardPaging);
                    }
                }, 1, null);
            }
        }, 1, null)) : modifier.then(Modifier.Companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, r0 r0Var) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        c40.k.f(r0Var, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, r0 r0Var) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        c40.k.f(r0Var, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    private static final void debugLog(a<String> aVar) {
    }
}
