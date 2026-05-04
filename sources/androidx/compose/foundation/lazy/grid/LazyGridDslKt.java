package androidx.compose.foundation.lazy.grid;

import a00.r0;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import x00.r;
import x00.s;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,656:1\n113#2:657\n113#2:658\n113#2:659\n113#2:660\n1247#3,6:661\n1247#3,6:667\n1#4:673\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n71#1:657\n103#1:658\n160#1:659\n192#1:660\n222#1:661,6\n249#1:667,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyHorizontalGrid(@m80.k final androidx.compose.foundation.lazy.grid.GridCells r31, @m80.l androidx.compose.ui.Modifier r32, @m80.l androidx.compose.foundation.lazy.grid.LazyGridState r33, @m80.l androidx.compose.foundation.layout.PaddingValues r34, boolean r35, @m80.l androidx.compose.foundation.layout.Arrangement.Horizontal r36, @m80.l androidx.compose.foundation.layout.Arrangement.Vertical r37, @m80.l androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, @m80.l androidx.compose.foundation.OverscrollEffect r40, @m80.k final x00.l<? super androidx.compose.foundation.lazy.grid.LazyGridScope, yz.g2> r41, @m80.l androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, x00.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyVerticalGrid(@m80.k final androidx.compose.foundation.lazy.grid.GridCells r31, @m80.l androidx.compose.ui.Modifier r32, @m80.l androidx.compose.foundation.lazy.grid.LazyGridState r33, @m80.l androidx.compose.foundation.layout.PaddingValues r34, boolean r35, @m80.l androidx.compose.foundation.layout.Arrangement.Vertical r36, @m80.l androidx.compose.foundation.layout.Arrangement.Horizontal r37, @m80.l androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, @m80.l androidx.compose.foundation.OverscrollEffect r40, @m80.k final x00.l<? super androidx.compose.foundation.lazy.grid.LazyGridScope, yz.g2> r41, @m80.l androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, x00.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i11, int i12, int i13) {
        int i14 = i11 - (i13 * (i12 - 1));
        int i15 = i14 / i12;
        int i16 = i14 % i12;
        ArrayList arrayList = new ArrayList(i12);
        int i17 = 0;
        while (i17 < i12) {
            arrayList.add(Integer.valueOf((i17 < i16 ? 1 : 0) + i15));
            i17++;
        }
        return arrayList;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@k LazyGridScope lazyGridScope, @k List<? extends T> list, @l x00.l<? super T, ? extends Object> lVar, @l p<? super LazyGridItemSpanScope, ? super T, GridItemSpan> pVar, @k x00.l<? super T, ? extends Object> lVar2, @k r<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, g2> rVar) {
        lazyGridScope.items(list.size(), lVar != null ? new LazyGridDslKt$items$2(lVar, list) : null, pVar != null ? new LazyGridDslKt$items$3(pVar, list) : null, new LazyGridDslKt$items$4(lVar2, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new LazyGridDslKt$items$5(rVar, list)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List list, x00.l lVar, p pVar, x00.l lVar2, r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            pVar = null;
        }
        if ((i11 & 8) != 0) {
            lVar2 = new x00.l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$1
                @Override // x00.l
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        lazyGridScope.items(list.size(), lVar != null ? new LazyGridDslKt$items$2(lVar, list) : null, pVar != null ? new LazyGridDslKt$items$3(pVar, list) : null, new LazyGridDslKt$items$4(lVar2, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new LazyGridDslKt$items$5(rVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@k LazyGridScope lazyGridScope, @k List<? extends T> list, @l p<? super Integer, ? super T, ? extends Object> pVar, @l q<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> qVar, @k p<? super Integer, ? super T, ? extends Object> pVar2, @k s<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, g2> sVar) {
        lazyGridScope.items(list.size(), pVar != null ? new LazyGridDslKt$itemsIndexed$2(pVar, list) : null, qVar != null ? new LazyGridDslKt$itemsIndexed$3(qVar, list) : null, new LazyGridDslKt$itemsIndexed$4(pVar2, list), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new LazyGridDslKt$itemsIndexed$5(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List list, p pVar, q qVar, p pVar2, s sVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = null;
        }
        if ((i11 & 4) != 0) {
            qVar = null;
        }
        if ((i11 & 8) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$1
                public final Void invoke(int i12, Object obj2) {
                    return null;
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyGridScope.items(list.size(), pVar != null ? new LazyGridDslKt$itemsIndexed$2(pVar, list) : null, qVar != null ? new LazyGridDslKt$itemsIndexed$3(qVar, list) : null, new LazyGridDslKt$itemsIndexed$4(pVar2, list), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new LazyGridDslKt$itemsIndexed$5(sVar, list)));
    }

    @Composable
    private static final LazyGridSlotsProvider rememberColumnWidthSums(final GridCells gridCells, final Arrangement.Horizontal horizontal, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-76500289, i11, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && composer.changed(gridCells)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i11 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GridSlotCache(new p<Density, Constraints, LazyGridSlots>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ LazyGridSlots invoke(Density density, Constraints constraints) {
                    return m860invoke0kLqBqw(density, constraints.m5074unboximpl());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridSlots m860invoke0kLqBqw(Density density, long j11) {
                    if (!(Constraints.m5068getMaxWidthimpl(j11) != Integer.MAX_VALUE)) {
                        InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
                    }
                    int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
                    GridCells gridCells2 = GridCells.this;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] Z5 = r0.Z5(gridCells2.calculateCrossAxisCellSizes(density, m5068getMaxWidthimpl, density.mo371roundToPx0680j_4(horizontal2.mo613getSpacingD9Ej5fM())));
                    int[] iArr = new int[Z5.length];
                    horizontal2.arrange(density, m5068getMaxWidthimpl, Z5, LayoutDirection.Ltr, iArr);
                    return new LazyGridSlots(Z5, iArr);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridSlotsProvider;
    }

    @Composable
    private static final LazyGridSlotsProvider rememberRowHeightSums(final GridCells gridCells, final Arrangement.Vertical vertical, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-150818144, i11, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:248)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && composer.changed(gridCells)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i11 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GridSlotCache(new p<Density, Constraints, LazyGridSlots>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ LazyGridSlots invoke(Density density, Constraints constraints) {
                    return m861invoke0kLqBqw(density, constraints.m5074unboximpl());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridSlots m861invoke0kLqBqw(Density density, long j11) {
                    if (!(Constraints.m5067getMaxHeightimpl(j11) != Integer.MAX_VALUE)) {
                        InlineClassHelperKt.throwIllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.");
                    }
                    int m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
                    GridCells gridCells2 = GridCells.this;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] Z5 = r0.Z5(gridCells2.calculateCrossAxisCellSizes(density, m5067getMaxHeightimpl, density.mo371roundToPx0680j_4(vertical2.mo613getSpacingD9Ej5fM())));
                    int[] iArr = new int[Z5.length];
                    vertical2.arrange(density, m5067getMaxHeightimpl, Z5, iArr);
                    return new LazyGridSlots(Z5, iArr);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridSlotsProvider;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@k LazyGridScope lazyGridScope, @k T[] tArr, @l x00.l<? super T, ? extends Object> lVar, @l p<? super LazyGridItemSpanScope, ? super T, GridItemSpan> pVar, @k x00.l<? super T, ? extends Object> lVar2, @k r<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, g2> rVar) {
        lazyGridScope.items(tArr.length, lVar != null ? new LazyGridDslKt$items$7(lVar, tArr) : null, pVar != null ? new LazyGridDslKt$items$8(pVar, tArr) : null, new LazyGridDslKt$items$9(lVar2, tArr), ComposableLambdaKt.composableLambdaInstance(407562193, true, new LazyGridDslKt$items$10(rVar, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@k LazyGridScope lazyGridScope, @k T[] tArr, @l p<? super Integer, ? super T, ? extends Object> pVar, @l q<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> qVar, @k p<? super Integer, ? super T, ? extends Object> pVar2, @k s<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, g2> sVar) {
        lazyGridScope.items(tArr.length, pVar != null ? new LazyGridDslKt$itemsIndexed$7(pVar, tArr) : null, qVar != null ? new LazyGridDslKt$itemsIndexed$8(qVar, tArr) : null, new LazyGridDslKt$itemsIndexed$9(pVar2, tArr), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new LazyGridDslKt$itemsIndexed$10(sVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] objArr, x00.l lVar, p pVar, x00.l lVar2, r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            pVar = null;
        }
        if ((i11 & 8) != 0) {
            lVar2 = new x00.l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$6
                @Override // x00.l
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        lazyGridScope.items(objArr.length, lVar != null ? new LazyGridDslKt$items$7(lVar, objArr) : null, pVar != null ? new LazyGridDslKt$items$8(pVar, objArr) : null, new LazyGridDslKt$items$9(lVar2, objArr), ComposableLambdaKt.composableLambdaInstance(407562193, true, new LazyGridDslKt$items$10(rVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] objArr, p pVar, q qVar, p pVar2, s sVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = null;
        }
        if ((i11 & 4) != 0) {
            qVar = null;
        }
        if ((i11 & 8) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$6
                public final Void invoke(int i12, Object obj2) {
                    return null;
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyGridScope.items(objArr.length, pVar != null ? new LazyGridDslKt$itemsIndexed$7(pVar, objArr) : null, qVar != null ? new LazyGridDslKt$itemsIndexed$8(qVar, objArr) : null, new LazyGridDslKt$itemsIndexed$9(pVar2, objArr), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new LazyGridDslKt$itemsIndexed$10(sVar, objArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyHorizontalGrid(final androidx.compose.foundation.lazy.grid.GridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.grid.LazyGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Horizontal r33, androidx.compose.foundation.layout.Arrangement.Vertical r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final x00.l r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyVerticalGrid(final androidx.compose.foundation.lazy.grid.GridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.grid.LazyGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final x00.l r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
