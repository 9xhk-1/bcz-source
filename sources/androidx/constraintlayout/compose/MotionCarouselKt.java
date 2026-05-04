package androidx.constraintlayout.compose;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.MotionLayoutScope;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMotionCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionCarousel.kt\nandroidx/constraintlayout/compose/MotionCarouselKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,373:1\n1225#2,6:374\n1225#2,6:380\n1225#2,6:386\n1225#2,6:392\n1225#2,6:398\n1225#2,6:404\n1225#2,6:410\n1225#2,6:429\n1225#2,6:492\n249#3:416\n245#3,12:417\n257#3,2:435\n262#3:438\n279#3,10:439\n278#3:449\n290#3:450\n1#4:437\n149#5:451\n149#5:452\n71#6:453\n69#6,5:454\n74#6:487\n78#6:491\n79#7,6:459\n86#7,4:474\n90#7,2:484\n94#7:490\n368#8,9:465\n377#8:486\n378#8,2:488\n4034#9,6:478\n79#10:498\n112#10,2:499\n81#11:501\n107#11,2:502\n78#12:504\n111#12,2:505\n*S KotlinDebug\n*F\n+ 1 MotionCarousel.kt\nandroidx/constraintlayout/compose/MotionCarouselKt\n*L\n156#1:374,6\n160#1:380,6\n163#1:386,6\n178#1:392,6\n194#1:398,6\n205#1:404,6\n231#1:410,6\n216#1:429,6\n310#1:492,6\n216#1:416\n216#1:417,12\n216#1:435,2\n216#1:438\n216#1:439,10\n216#1:449\n216#1:450\n216#1:437\n257#1:451\n258#1:452\n260#1:453\n260#1:454,5\n260#1:487\n260#1:491\n260#1:459,6\n260#1:474,4\n260#1:484,2\n260#1:490\n260#1:465,9\n260#1:486\n260#1:488,2\n260#1:478,6\n156#1:498\n156#1:499,2\n160#1:501\n160#1:502,2\n163#1:504\n163#1:505,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MotionCarouselKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ItemHolder(final int i11, @k final String str, final boolean z11, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1970516035);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changed(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= startRestartGroup.changed(z11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1970516035, i13, -1, "androidx.constraintlayout.compose.ItemHolder (MotionCarousel.kt:250)");
            }
            Modifier layoutId$default = ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, str + i11, null, 2, null);
            if (z11) {
                float f11 = 20;
                layoutId$default = BorderKt.m246borderxT4_qwU(ClipKt.clip(layoutId$default, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f11))), Dp.m5115constructorimpl(2), ColorKt.Color(0, 0, 0, 60), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f11)));
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf((i13 >> 9) & 14));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$ItemHolder$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i14) {
                    MotionCarouselKt.ItemHolder(i11, str, z11, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x041b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MotionCarousel(@m80.k final androidx.constraintlayout.compose.MotionScene r36, final int r37, final int r38, @m80.l java.lang.String r39, @m80.l java.lang.String r40, @m80.l java.lang.String r41, boolean r42, @m80.k final x00.l<? super androidx.constraintlayout.compose.MotionCarouselScope, yz.g2> r43, @m80.l androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionCarouselKt.MotionCarousel(androidx.constraintlayout.compose.MotionScene, int, int, java.lang.String, java.lang.String, java.lang.String, boolean, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CarouselState MotionCarousel$lambda$4(MutableState<CarouselState> mutableState) {
        return mutableState.getValue();
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@k MotionCarouselScope motionCarouselScope, @k final List<? extends T> list, @k final q<? super T, ? super Composer, ? super Integer, g2> qVar) {
        motionCarouselScope.items(list.size(), ComposableLambdaKt.composableLambdaInstance(85623574, true, new q<Integer, Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$items$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(Integer num, Composer composer, Integer num2) {
                invoke(num.intValue(), composer, num2.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(int i11, Composer composer, int i12) {
                if ((i12 & 6) == 0) {
                    i12 |= composer.changed(i11) ? 4 : 2;
                }
                if ((i12 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(85623574, i12, -1, "androidx.constraintlayout.compose.items.<anonymous> (MotionCarousel.kt:278)");
                }
                qVar.invoke(list.get(i11), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsWithProperties(@k MotionCarouselScope motionCarouselScope, @k final List<? extends T> list, @k final r<? super T, ? super androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>, ? super Composer, ? super Integer, g2> rVar) {
        motionCarouselScope.itemsWithProperties(list.size(), ComposableLambdaKt.composableLambdaInstance(1304172608, true, new r<Integer, androidx.compose.runtime.State<? extends MotionLayoutScope.MotionProperties>, Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$itemsWithProperties$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(Integer num, androidx.compose.runtime.State<? extends MotionLayoutScope.MotionProperties> state, Composer composer, Integer num2) {
                invoke(num.intValue(), (androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>) state, composer, num2.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(int i11, androidx.compose.runtime.State<MotionLayoutScope.MotionProperties> state, Composer composer, int i12) {
                int i13;
                if ((i12 & 6) == 0) {
                    i13 = (composer.changed(i11) ? 4 : 2) | i12;
                } else {
                    i13 = i12;
                }
                if ((i12 & 48) == 0) {
                    i13 |= composer.changed(state) ? 32 : 16;
                }
                if ((i13 & 147) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1304172608, i13, -1, "androidx.constraintlayout.compose.itemsWithProperties.<anonymous> (MotionCarousel.kt:302)");
                }
                rVar.invoke(list.get(i11), state, composer, Integer.valueOf(i13 & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Composable
    private static final androidx.compose.runtime.State<MotionItemsProvider> rememberStateOfItemsProvider(x00.l<? super MotionCarouselScope, g2> lVar, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507876322, i11, -1, "androidx.constraintlayout.compose.rememberStateOfItemsProvider (MotionCarousel.kt:307)");
        }
        final androidx.compose.runtime.State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i11 & 14);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new x00.a<MotionCarouselScopeImpl>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$rememberStateOfItemsProvider$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final MotionCarouselScopeImpl invoke() {
                    MotionCarouselScopeImpl motionCarouselScopeImpl = new MotionCarouselScopeImpl();
                    rememberUpdatedState.getValue().invoke(motionCarouselScopeImpl);
                    return motionCarouselScopeImpl;
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.State<MotionItemsProvider> state = (androidx.compose.runtime.State) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state;
    }
}
