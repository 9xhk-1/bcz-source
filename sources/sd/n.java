package sd;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import com.baicizhan.main.activity.daka.imagedaka.imagedakav2.BonusUiData;
import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nBonusActivityDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BonusActivityDialog.kt\ncom/baicizhan/main/activity/daka/imagedaka/imagedakav2/BonusActivityDialogKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,258:1\n87#2:259\n84#2,9:260\n87#2:352\n84#2,9:353\n94#2:392\n94#2:400\n87#2:401\n84#2,9:402\n94#2:442\n87#2:443\n84#2,9:444\n87#2:480\n83#2,10:481\n94#2:578\n94#2:582\n79#3,6:269\n86#3,3:284\n89#3,2:293\n79#3,6:306\n86#3,3:321\n89#3,2:330\n79#3,6:362\n86#3,3:377\n89#3,2:386\n93#3:391\n93#3:395\n93#3:399\n79#3,6:411\n86#3,3:426\n89#3,2:435\n93#3:441\n79#3,6:453\n86#3,3:468\n89#3,2:477\n79#3,6:491\n86#3,3:506\n89#3,2:515\n79#3,6:540\n86#3,3:555\n89#3,2:564\n93#3:573\n93#3:577\n93#3:581\n79#3,6:593\n86#3,3:608\n89#3,2:617\n93#3:622\n347#4,9:275\n356#4:295\n347#4,9:312\n356#4:332\n347#4,9:368\n356#4,3:388\n357#4,2:393\n357#4,2:397\n347#4,9:417\n356#4:437\n357#4,2:439\n347#4,9:459\n356#4:479\n347#4,9:497\n356#4:517\n347#4,9:546\n356#4:566\n357#4,2:571\n357#4,2:575\n357#4,2:579\n347#4,9:599\n356#4,3:619\n4206#5,6:287\n4206#5,6:324\n4206#5,6:380\n4206#5,6:429\n4206#5,6:471\n4206#5,6:509\n4206#5,6:558\n4206#5,6:611\n70#6:296\n67#6,9:297\n77#6:396\n70#6:583\n67#6,9:584\n77#6:623\n113#7:333\n113#7:438\n113#7:518\n113#7:519\n113#7:520\n113#7:521\n113#7:567\n113#7:568\n113#7:569\n113#7:570\n113#7:633\n1247#8,6:334\n1247#8,6:340\n1247#8,6:346\n1247#8,6:522\n1247#8,6:528\n1247#8,6:624\n99#9,6:534\n106#9:574\n85#10:630\n113#10,2:631\n85#10:634\n*S KotlinDebug\n*F\n+ 1 BonusActivityDialog.kt\ncom/baicizhan/main/activity/daka/imagedaka/imagedakav2/BonusActivityDialogKt\n*L\n108#1:259\n108#1:260,9\n132#1:352\n132#1:353,9\n132#1:392\n108#1:400\n157#1:401\n157#1:402,9\n157#1:442\n168#1:443\n168#1:444,9\n173#1:480\n173#1:481,10\n173#1:578\n168#1:582\n108#1:269,6\n108#1:284,3\n108#1:293,2\n113#1:306,6\n113#1:321,3\n113#1:330,2\n132#1:362,6\n132#1:377,3\n132#1:386,2\n132#1:391\n113#1:395\n108#1:399\n157#1:411,6\n157#1:426,3\n157#1:435,2\n157#1:441\n168#1:453,6\n168#1:468,3\n168#1:477,2\n173#1:491,6\n173#1:506,3\n173#1:515,2\n185#1:540,6\n185#1:555,3\n185#1:564,2\n185#1:573\n173#1:577\n168#1:581\n217#1:593,6\n217#1:608,3\n217#1:617,2\n217#1:622\n108#1:275,9\n108#1:295\n113#1:312,9\n113#1:332\n132#1:368,9\n132#1:388,3\n113#1:393,2\n108#1:397,2\n157#1:417,9\n157#1:437\n157#1:439,2\n168#1:459,9\n168#1:479\n173#1:497,9\n173#1:517\n185#1:546,9\n185#1:566\n185#1:571,2\n173#1:575,2\n168#1:579,2\n217#1:599,9\n217#1:619,3\n108#1:287,6\n113#1:324,6\n132#1:380,6\n157#1:429,6\n168#1:471,6\n173#1:509,6\n185#1:558,6\n217#1:611,6\n113#1:296\n113#1:297,9\n113#1:396\n217#1:583\n217#1:584,9\n217#1:623\n117#1:333\n162#1:438\n177#1:518\n184#1:519\n188#1:520\n189#1:521\n200#1:567\n203#1:568\n204#1:569\n206#1:570\n145#1:633\n118#1:334,6\n125#1:340,6\n127#1:346,6\n193#1:522,6\n190#1:528,6\n248#1:624,6\n185#1:534,6\n185#1:574\n125#1:630\n125#1:631,2\n219#1:634\n*E\n"})
/* loaded from: classes4.dex */
public final class n {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.BonusActivityDialogKt$BonusView$1$1$2$1", f = "BonusActivityDialog.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f88322a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f88323b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState<Boolean> mutableState, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f88323b = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f88323b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f88322a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f88322a = 1;
                if (c40.a1.b(300L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            n.p(this.f88323b, true);
            return g2.f100423a;
        }
    }

    public static final g2 A() {
        return g2.f100423a;
    }

    public static final g2 B(String str) {
        return g2.f100423a;
    }

    public static final g2 C(int i11, Composer composer, int i12) {
        z(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void k(@m80.l Modifier modifier, @m80.k final BonusUiData bonusUiData, @m80.k final x00.l<? super String, g2> doAction, @m80.l Composer composer, final int i11, final int i12) {
        int i13;
        kotlin.jvm.internal.g0.p(bonusUiData, "bonusUiData");
        kotlin.jvm.internal.g0.p(doAction, "doAction");
        Composer startRestartGroup = composer.startRestartGroup(-385894436);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? startRestartGroup.changed(bonusUiData) : startRestartGroup.changedInstance(bonusUiData) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(doAction) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-385894436, i13, -1, "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.Body (BonusActivityDialog.kt:155)");
            }
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            s(null, startRestartGroup, 0, 1);
            v(OffsetKt.m686offsetVpY3zN4$default(modifier, 0.0f, Dp.m5115constructorimpl(-14), 1, null), bonusUiData, doAction, startRestartGroup, i13 & 1008, 0);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: sd.j
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 l11;
                    l11 = n.l(Modifier.this, bonusUiData, doAction, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return l11;
                }
            });
        }
    }

    public static final g2 l(Modifier modifier, BonusUiData bonusUiData, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        k(modifier, bonusUiData, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void m(@m80.k final BonusUiData bonusUiData, @m80.k final x00.a<g2> close, @m80.k final x00.l<? super String, g2> doAction, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(bonusUiData, "bonusUiData");
        kotlin.jvm.internal.g0.p(close, "close");
        kotlin.jvm.internal.g0.p(doAction, "doAction");
        Composer startRestartGroup = composer.startRestartGroup(-1043201517);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? startRestartGroup.changed(bonusUiData) : startRestartGroup.changedInstance(bonusUiData) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(close) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(doAction) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1043201517, i12, -1, "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.BonusView (BonusActivityDialog.kt:106)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(SizeKt.wrapContentSize$default(companion, null, false, 3, null), bk.b.m(), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m235backgroundbw27NRU$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopEnd()), 0.0f, Dp.m5115constructorimpl(49), Dp.m5115constructorimpl(29), 0.0f, 9, null);
            boolean z11 = (i12 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: sd.f
                    @Override // x00.a
                    public final Object invoke() {
                        g2 n11;
                        n11 = n.n(x00.a.this);
                        return n11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int i13 = i12;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_bonus_close, startRestartGroup, 6), "", ClickableKt.m269clickableXHw0xAI$default(m730paddingqDBjuR0$default, false, null, null, (x00.a) rememberedValue, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.Companion;
            if (rememberedValue2 == companion4.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion4.getEmpty()) {
                rememberedValue3 = new a(mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            EffectsKt.LaunchedEffect(bonusUiData, (x00.p<? super c40.r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue3, startRestartGroup, i13 & 14);
            Modifier align = boxScopeInstance.align(companion, companion2.getCenter());
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, align);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, o(mutableState), (Modifier) null, EnterExitTransitionKt.m77scaleInL8ZKhE$default(null, 0.3f, 0L, 5, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.3f, 1, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(1550900317, true, new x00.q() { // from class: sd.g
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 q11;
                    q11 = n.q(BonusUiData.this, doAction, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return q11;
                }
            }, startRestartGroup, 54), startRestartGroup, 1600518, 18);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: sd.h
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 r11;
                    r11 = n.r(BonusUiData.this, close, doAction, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return r11;
                }
            });
        }
    }

    public static final g2 n(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }

    public static final boolean o(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void p(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 q(BonusUiData bonusUiData, x00.l lVar, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1550900317, i11, -1, "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.BonusView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BonusActivityDialog.kt:142)");
        }
        k(SizeKt.m778width3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(303)), bonusUiData, lVar, composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return g2.f100423a;
    }

    public static final g2 r(BonusUiData bonusUiData, x00.a aVar, x00.l lVar, int i11, Composer composer, int i12) {
        m(bonusUiData, aVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void s(@m80.l Modifier modifier, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(115733242);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if (startRestartGroup.shouldExecute((i13 & 3) != 2, i13 & 1)) {
            modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(115733242, i13, -1, "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.Coins (BonusActivityDialog.kt:215)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_bonus_bg, startRestartGroup, 6), "", RotateKt.rotate(Modifier.Companion, t(InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1), 0.0f, 360.0f, AnimationSpecKt.m136infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(8000, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_bonus_coins, startRestartGroup, 6), "", boxScopeInstance.align(modifier3, companion.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            composer2 = startRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: sd.i
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 u11;
                    u11 = n.u(Modifier.this, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return u11;
                }
            });
        }
    }

    public static final float t(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final g2 u(Modifier modifier, int i11, int i12, Composer composer, int i13) {
        s(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void v(@m80.l Modifier modifier, @m80.k final BonusUiData bonusUiData, @m80.k final x00.l<? super String, g2> doAction, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Modifier modifier4;
        int i14;
        Modifier.Companion companion;
        kotlin.jvm.internal.g0.p(bonusUiData, "bonusUiData");
        kotlin.jvm.internal.g0.p(doAction, "doAction");
        Composer startRestartGroup = composer.startRestartGroup(432712257);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? startRestartGroup.changed(bonusUiData) : startRestartGroup.changedInstance(bonusUiData) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(doAction) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            Modifier modifier5 = i15 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(432712257, i13, -1, "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.Content (BonusActivityDialog.kt:166)");
            }
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier5);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String j11 = bonusUiData.j();
            long n11 = bk.d.n();
            int i16 = i13;
            long A0 = bk.b.A0();
            FontWeight.Companion companion4 = FontWeight.Companion;
            TextKt.m1845Text4IGK_g(j11, (Modifier) null, A0, n11, (FontStyle) null, companion4.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, startRestartGroup, 200064, 0, 131026);
            Composer composer2 = startRestartGroup;
            Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
            Modifier.Companion companion5 = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer2, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion5);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer2);
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            if (bonusUiData.i() != null) {
                composer2.startReplaceGroup(-265693365);
                SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion5, Dp.m5115constructorimpl(12)), composer2, 6);
                Modifier modifier6 = modifier5;
                i14 = 6;
                companion = companion5;
                modifier4 = modifier6;
                TextKt.m1845Text4IGK_g(bonusUiData.i(), (Modifier) null, bk.b.A0(), bk.d.m(), (FontStyle) null, companion4.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, composer2, 200064, 0, 130514);
                composer2 = composer2;
            } else {
                modifier4 = modifier5;
                i14 = 6;
                companion = companion5;
                composer2.startReplaceGroup(-272330899);
            }
            composer2.endReplaceGroup();
            float f11 = 56;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer2, i14);
            Modifier m234backgroundbw27NRU = BackgroundKt.m234backgroundbw27NRU(SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(f11)), bk.b.e0(), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(28)));
            Object rememberedValue = composer2.rememberedValue();
            Composer.Companion companion6 = Composer.Companion;
            if (rememberedValue == companion6.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(rememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            boolean z11 = ((i16 & 896) == 256) | ((i16 & 112) == 32 || ((i16 & 64) != 0 && composer2.changedInstance(bonusUiData)));
            Object rememberedValue2 = composer2.rememberedValue();
            if (z11 || rememberedValue2 == companion6.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: sd.d
                    @Override // x00.a
                    public final Object invoke() {
                        g2 w11;
                        w11 = n.w(x00.l.this, bonusUiData);
                        return w11;
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(m234backgroundbw27NRU, mutableInteractionSource, null, false, null, null, (x00.a) rememberedValue2, 28, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composer2, 54);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m267clickableO2vRcR0$default);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(composer2);
            Updater.m1958setimpl(m1951constructorimpl3, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Composer composer3 = composer2;
            TextKt.m1845Text4IGK_g(bonusUiData.h(), (Modifier) null, bk.b.A0(), bk.d.m(), (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, composer3, 200064, 3072, 122834);
            startRestartGroup = composer3;
            if (bonusUiData.k() != null) {
                startRestartGroup.startReplaceGroup(2141312620);
                SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(16)), startRestartGroup, i14);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_bonus_coin, startRestartGroup, i14), "", OffsetKt.m686offsetVpY3zN4$default(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(24)), 0.0f, Dp.m5115constructorimpl(1), 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(4)), startRestartGroup, i14);
                TextKt.m1845Text4IGK_g("x2", (Modifier) null, bk.b.A0(), bk.d.o(), (FontStyle) null, (FontWeight) null, yj.a.a(R.font.din_medium_italic), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, startRestartGroup, 3462, 3072, 122802);
                startRestartGroup = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(2133570897);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: sd.e
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 x11;
                    x11 = n.x(Modifier.this, bonusUiData, doAction, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return x11;
                }
            });
        }
    }

    public static final g2 w(x00.l lVar, BonusUiData bonusUiData) {
        lVar.invoke(bonusUiData.k());
        return g2.f100423a;
    }

    public static final g2 x(Modifier modifier, BonusUiData bonusUiData, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        v(modifier, bonusUiData, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void z(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(2135467741);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2135467741, i11, -1, "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.preview (BonusActivityDialog.kt:240)");
            }
            BonusUiData bonusUiData = new BonusUiData("分享成功，获得+10铜板！", "有小班的人每次可以多领一份铜板", "123", "去加小班");
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: sd.k
                    @Override // x00.a
                    public final Object invoke() {
                        g2 A;
                        A = n.A();
                        return A;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            x00.a aVar = (x00.a) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: sd.l
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 B;
                        B = n.B((String) obj);
                        return B;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            m(bonusUiData, aVar, (x00.l) rememberedValue2, startRestartGroup, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: sd.m
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 C;
                    C = n.C(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return C;
                }
            });
        }
    }
}
