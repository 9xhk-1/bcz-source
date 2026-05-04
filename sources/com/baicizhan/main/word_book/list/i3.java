package com.baicizhan.main.word_book.list;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.extractor.WavUtil;
import com.jiongji.andriod.card.R;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWordBookCreateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookCreateActivity.kt\ncom/baicizhan/main/word_book/list/WordBookCreateActivityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,430:1\n1247#2,6:431\n1247#2,6:437\n1247#2,6:443\n1247#2,3:449\n1250#2,3:455\n1247#2,6:459\n1247#2,6:465\n1247#2,6:510\n1247#2,6:608\n1247#2,6:700\n1247#2,6:743\n1247#2,6:749\n1247#2,6:838\n1247#2,6:844\n1247#2,6:855\n774#3:452\n865#3,2:453\n1869#3:854\n1870#3:861\n75#4:458\n87#5:471\n83#5,10:472\n94#5:519\n87#5:520\n83#5,10:521\n87#5:559\n83#5,10:560\n94#5:600\n94#5:606\n87#5:655\n84#5,9:656\n94#5:696\n87#5:707\n85#5,8:708\n94#5:758\n79#6,6:482\n86#6,3:497\n89#6,2:506\n93#6:518\n79#6,6:531\n86#6,3:546\n89#6,2:555\n79#6,6:570\n86#6,3:585\n89#6,2:594\n93#6:599\n93#6:605\n79#6,6:624\n86#6,3:639\n89#6,2:648\n93#6:653\n79#6,6:665\n86#6,3:680\n89#6,2:689\n93#6:695\n79#6,6:716\n86#6,3:731\n89#6,2:740\n93#6:757\n79#6,6:769\n86#6,3:784\n89#6,2:793\n79#6,6:806\n86#6,3:821\n89#6,2:830\n93#6:835\n93#6:852\n347#7,9:488\n356#7:508\n357#7,2:516\n347#7,9:537\n356#7:557\n347#7,9:576\n356#7,3:596\n357#7,2:603\n347#7,9:630\n356#7,3:650\n347#7,9:671\n356#7:691\n357#7,2:693\n347#7,9:722\n356#7:742\n357#7,2:755\n347#7,9:775\n356#7:795\n347#7,9:812\n356#7,3:832\n357#7,2:850\n4206#8,6:500\n4206#8,6:549\n4206#8,6:588\n4206#8,6:642\n4206#8,6:683\n4206#8,6:734\n4206#8,6:787\n4206#8,6:824\n1565#9:509\n113#10:558\n113#10:601\n113#10:602\n113#10:607\n113#10:614\n113#10:692\n113#10:706\n113#10:759\n113#10:760\n113#10:761\n113#10:762\n113#10:837\n70#11:615\n68#11,8:616\n77#11:654\n70#11:796\n67#11,9:797\n77#11:836\n85#12:697\n113#12,2:698\n99#13,6:763\n106#13:853\n*S KotlinDebug\n*F\n+ 1 WordBookCreateActivity.kt\ncom/baicizhan/main/word_book/list/WordBookCreateActivityKt\n*L\n167#1:431,6\n168#1:437,6\n170#1:443,6\n178#1:449,3\n178#1:455,3\n238#1:459,6\n240#1:465,6\n268#1:510,6\n371#1:608,6\n196#1:700,6\n210#1:743,6\n219#1:749,6\n305#1:838,6\n307#1:844,6\n346#1:855,6\n180#1:452\n180#1:453,2\n342#1:854\n342#1:861\n237#1:458\n244#1:471\n244#1:472,10\n244#1:519\n322#1:520\n322#1:521,10\n323#1:559\n323#1:560,10\n323#1:600\n322#1:606\n394#1:655\n394#1:656,9\n394#1:696\n201#1:707\n201#1:708,8\n201#1:758\n244#1:482,6\n244#1:497,3\n244#1:506,2\n244#1:518\n322#1:531,6\n322#1:546,3\n322#1:555,2\n323#1:570,6\n323#1:585,3\n323#1:594,2\n323#1:599\n322#1:605\n360#1:624,6\n360#1:639,3\n360#1:648,2\n360#1:653\n394#1:665,6\n394#1:680,3\n394#1:689,2\n394#1:695\n201#1:716,6\n201#1:731,3\n201#1:740,2\n201#1:757\n273#1:769,6\n273#1:784,3\n273#1:793,2\n286#1:806,6\n286#1:821,3\n286#1:830,2\n286#1:835\n273#1:852\n244#1:488,9\n244#1:508\n244#1:516,2\n322#1:537,9\n322#1:557\n323#1:576,9\n323#1:596,3\n322#1:603,2\n360#1:630,9\n360#1:650,3\n394#1:671,9\n394#1:691\n394#1:693,2\n201#1:722,9\n201#1:742\n201#1:755,2\n273#1:775,9\n273#1:795\n286#1:812,9\n286#1:832,3\n273#1:850,2\n244#1:500,6\n322#1:549,6\n323#1:588,6\n360#1:642,6\n394#1:683,6\n201#1:734,6\n273#1:787,6\n286#1:824,6\n246#1:509\n323#1:558\n339#1:601\n340#1:602\n367#1:607\n375#1:614\n403#1:692\n206#1:706\n276#1:759\n279#1:760\n282#1:761\n284#1:762\n303#1:837\n360#1:615\n360#1:616,8\n360#1:654\n286#1:796\n286#1:797,9\n286#1:836\n170#1:697\n170#1:698,2\n273#1:763,6\n273#1:853\n*E\n"})
/* loaded from: classes5.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f27201a = 10;

    /* renamed from: b, reason: collision with root package name */
    public static final int f27202b = 2;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final List<j3> f27203c = a00.h0.Q(new j3(1, "小学"), new j3(2, "中考"), new j3(3, "高考"), new j3(4, "四六级"), new j3(5, "考研"), new j3(6, "专升本"), new j3(7, "出国"), new j3(8, "专业词汇"), new j3(9, "日常积累"), new j3(10, "游戏影音"));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordBookCreateActivityKt$NameSection$1$1", f = "WordBookCreateActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f27204a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FocusRequester f27205b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FocusRequester focusRequester, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f27205b = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f27205b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f27204a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            FocusRequester.m2179requestFocus3ESFkO8$default(this.f27205b, 0, 1, null);
            return yz.g2.f100423a;
        }
    }

    public static final yz.g2 A(x00.l lVar) {
        lVar.invoke(new TextFieldValue("", 0L, (TextRange) null, 6, (kotlin.jvm.internal.v) null));
        return yz.g2.f100423a;
    }

    public static final yz.g2 B(TextFieldValue textFieldValue, x00.l lVar, int i11, Composer composer, int i12) {
        x(textFieldValue, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void C(final String str, final boolean z11, final x00.a<yz.g2> aVar, Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Modifier border;
        long A;
        Composer startRestartGroup = composer.startRestartGroup(1862992912);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 256 : 128;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1862992912, i13, -1, "com.baicizhan.main.word_book.list.TagChip (WordBookCreateActivity.kt:357)");
            }
            RoundedCornerShape m1019RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(bk.d.e());
            Modifier.Companion companion = Modifier.Companion;
            if (z11) {
                startRestartGroup.startReplaceGroup(854659730);
                border = BackgroundKt.m234backgroundbw27NRU(companion, MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1600getPrimary0d7_KjU(), m1019RoundedCornerShape0680j_4);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(854762154);
                border = BorderKt.border(companion, BorderStrokeKt.m262BorderStrokecXLIe8U(Dp.m5115constructorimpl(1), bk.b.G(MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable))), m1019RoundedCornerShape0680j_4);
                startRestartGroup.endReplaceGroup();
            }
            Modifier then = companion.then(border);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(ClickableKt.m267clickableO2vRcR0$default(then, (MutableInteractionSource) rememberedValue, null, false, null, null, aVar, 28, null), Dp.m5115constructorimpl(24), Dp.m5115constructorimpl(8));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m727paddingVpY3zN4);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            long l11 = bk.d.l();
            FontWeight.Companion companion3 = FontWeight.Companion;
            FontWeight medium = z11 ? companion3.getMedium() : companion3.getNormal();
            if (z11) {
                startRestartGroup.startReplaceGroup(-418868362);
                startRestartGroup.endReplaceGroup();
                A = bk.b.A0();
            } else {
                startRestartGroup.startReplaceGroup(-418867120);
                A = bk.b.A(MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable));
                startRestartGroup.endReplaceGroup();
            }
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(str, (Modifier) null, A, l11, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, (i13 & 14) | 3072, 6, 130002);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.x2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 D;
                    D = i3.D(str, z11, aVar, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return D;
                }
            });
        }
    }

    public static final yz.g2 D(String str, boolean z11, x00.a aVar, int i11, Composer composer, int i12) {
        C(str, z11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void E(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-617811201);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-617811201, i11, -1, "com.baicizhan.main.word_book.list.TagChipPreview (WordBookCreateActivity.kt:422)");
            }
            bk.k.e(null, null, null, k.f27247a.d(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.a3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 F;
                    F = i3.F(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return F;
                }
            });
        }
    }

    public static final yz.g2 F(int i11, Composer composer, int i12) {
        E(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void G(final List<j3> list, final List<j3> list2, final x00.l<? super j3, yz.g2> lVar, Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(587179089);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(lVar) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(587179089, i12, -1, "com.baicizhan.main.word_book.list.TagSection (WordBookCreateActivity.kt:320)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = arrangement.m607spacedBy0680j_4(bk.d.c());
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m607spacedBy0680j_4, companion2.getStart(), startRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(8)), companion2.getStart(), startRestartGroup, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            long m11 = bk.d.m();
            FontWeight medium = FontWeight.Companion.getMedium();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i13 = MaterialTheme.$stable;
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g("请选择标签", (Modifier) null, bk.b.y(materialTheme.getColors(startRestartGroup, i13)), m11, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 199686, 0, 131026);
            TextKt.m1845Text4IGK_g("选择1-2个类型，方便归类学习", (Modifier) null, bk.b.E(materialTheme.getColors(composer2, i13)), bk.d.l(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3078, 6, 130034);
            composer2.endNode();
            float f11 = 12;
            tm.a.c(null, null, null, Dp.m5115constructorimpl(f11), null, Dp.m5115constructorimpl(f11), null, ComposableLambdaKt.rememberComposableLambda(-296474527, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.n2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 H;
                    H = i3.H(list, list2, lVar, (Composer) obj, ((Integer) obj2).intValue());
                    return H;
                }
            }, composer2, 54), composer2, 12782592, 87);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.y2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 J;
                    J = i3.J(list, list2, lVar, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return J;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 H(List list, List list2, final x00.l lVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-296474527, i11, -1, "com.baicizhan.main.word_book.list.TagSection.<anonymous>.<anonymous> (WordBookCreateActivity.kt:341)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final j3 j3Var = (j3) it.next();
                String f11 = j3Var.f();
                boolean contains = list2.contains(j3Var);
                boolean changed = composer.changed(lVar) | composer.changed(j3Var);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: com.baicizhan.main.word_book.list.b3
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 I;
                            I = i3.I(x00.l.this, j3Var);
                            return I;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                C(f11, contains, (x00.a) rememberedValue, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 I(x00.l lVar, j3 j3Var) {
        lVar.invoke(j3Var);
        return yz.g2.f100423a;
    }

    public static final yz.g2 J(List list, List list2, x00.l lVar, int i11, Composer composer, int i12) {
        G(list, list2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K(java.lang.String r26, java.util.List<java.lang.Integer> r27, boolean r28, x00.a<yz.g2> r29, x00.p<? super java.lang.String, ? super java.util.List<com.baicizhan.main.word_book.list.j3>, yz.g2> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.i3.K(java.lang.String, java.util.List, boolean, x00.a, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 L() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 M(String str, List list) {
        kotlin.jvm.internal.g0.p(str, "<unused var>");
        kotlin.jvm.internal.g0.p(list, "<unused var>");
        return yz.g2.f100423a;
    }

    public static final TextFieldValue N(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    public static final void O(MutableState<TextFieldValue> mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 P(final boolean z11, final x00.a aVar, final boolean z12, final x00.p pVar, final SnapshotStateList snapshotStateList, final MutableState mutableState, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(649551819, i11, -1, "com.baicizhan.main.word_book.list.WordBookCreateScreen.<anonymous> (WordBookCreateActivity.kt:185)");
            }
            com.baicizhan.platform.base.widget.s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(-1872199870, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.e3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Q;
                    Q = i3.Q(z11, aVar, (Composer) obj, ((Integer) obj2).intValue());
                    return Q;
                }
            }, composer, 54), ComposableLambdaKt.rememberComposableLambda(-708618685, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.f3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 R;
                    R = i3.R(z12, z11, pVar, snapshotStateList, mutableState, (Composer) obj, ((Integer) obj2).intValue());
                    return R;
                }
            }, composer, 54), null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, bk.b.L(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable)), 0L, ComposableLambdaKt.rememberComposableLambda(1033886522, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.g3
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 T;
                    T = i3.T(SnapshotStateList.this, mutableState, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return T;
                }
            }, composer, 54), composer, 27648, 12582912, 98279);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 Q(boolean z11, x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1872199870, i11, -1, "com.baicizhan.main.word_book.list.WordBookCreateScreen.<anonymous>.<anonymous> (WordBookCreateActivity.kt:188)");
            }
            com.baicizhan.platform.base.widget.s4.g0(null, MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1593getBackground0d7_KjU(), 0L, 0, aVar, z11 ? "编辑单词本" : "新建单词本", null, null, composer, 0, 205);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 R(boolean z11, boolean z12, final x00.p pVar, final SnapshotStateList snapshotStateList, final MutableState mutableState, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-708618685, i11, -1, "com.baicizhan.main.word_book.list.WordBookCreateScreen.<anonymous>.<anonymous> (WordBookCreateActivity.kt:195)");
            }
            String str = z12 ? "保存" : gi.k.f53787g;
            boolean changed = composer.changed(pVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.word_book.list.c3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 S;
                        S = i3.S(x00.p.this, snapshotStateList, mutableState);
                        return S;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            v(z11, str, (x00.a) rememberedValue, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 S(x00.p pVar, SnapshotStateList snapshotStateList, MutableState mutableState) {
        pVar.invoke(N(mutableState).getText(), snapshotStateList.toList());
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 T(final SnapshotStateList snapshotStateList, final MutableState mutableState, PaddingValues it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if ((i11 & 6) == 0) {
            i11 |= composer.changed(it) ? 4 : 2;
        }
        if (composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1033886522, i11, -1, "com.baicizhan.main.word_book.list.WordBookCreateScreen.<anonymous>.<anonymous> (WordBookCreateActivity.kt:200)");
            }
            Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), it), 0.0f, bk.d.b(), 1, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(40)), Alignment.Companion.getStart(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m728paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextFieldValue N = N(mutableState);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue == companion2.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.word_book.list.h3
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 U;
                        U = i3.U(MutableState.this, (TextFieldValue) obj);
                        return U;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x(N, (x00.l) rememberedValue, composer, 48);
            List<j3> list = f27203c;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.word_book.list.o2
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 V;
                        V = i3.V(SnapshotStateList.this, (j3) obj);
                        return V;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            G(list, snapshotStateList, (x00.l) rememberedValue2, composer, 432);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 U(MutableState mutableState, TextFieldValue input) {
        kotlin.jvm.internal.g0.p(input, "input");
        if (input.getText().length() <= 10) {
            O(mutableState, input);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 V(SnapshotStateList snapshotStateList, j3 tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        if (snapshotStateList.contains(tag)) {
            snapshotStateList.remove(tag);
        } else if (snapshotStateList.size() < 2) {
            snapshotStateList.add(tag);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 W(String str, List list, boolean z11, x00.a aVar, x00.p pVar, int i11, int i12, Composer composer, int i13) {
        K(str, list, z11, aVar, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void X(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(90614032);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(90614032, i11, -1, "com.baicizhan.main.word_book.list.WordBookCreateScreenPreview (WordBookCreateActivity.kt:416)");
            }
            K(null, null, false, null, null, startRestartGroup, 0, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.z2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Y;
                    Y = i3.Y(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Y;
                }
            });
        }
    }

    public static final yz.g2 Y(int i11, Composer composer, int i12) {
        X(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @m80.k
    public static final List<j3> b0() {
        return f27203c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(final boolean r21, java.lang.String r22, final x00.a<yz.g2> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.i3.v(boolean, java.lang.String, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 w(boolean z11, String str, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        v(z11, str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void x(final TextFieldValue textFieldValue, final x00.l<? super TextFieldValue, yz.g2> lVar, Composer composer, final int i11) {
        int i12;
        Composer composer2;
        final TextFieldValue textFieldValue2 = textFieldValue;
        final x00.l<? super TextFieldValue, yz.g2> lVar2 = lVar;
        Composer startRestartGroup = composer.startRestartGroup(111677236);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changed(textFieldValue2) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(lVar2) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(111677236, i12, -1, "com.baicizhan.main.word_book.list.NameSection (WordBookCreateActivity.kt:235)");
            }
            final FocusManager focusManager = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            yz.g2 g2Var = yz.g2.f100423a;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new a(focusRequester, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.LaunchedEffect(g2Var, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = Arrangement.INSTANCE.m607spacedBy0680j_4(bk.d.c());
            Modifier.Companion companion2 = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m607spacedBy0680j_4, Alignment.Companion.getStart(), startRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("单词本名称");
            builder.pushStyle(new SpanStyle(bk.b.y0(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (kotlin.jvm.internal.v) null));
            builder.append("*");
            builder.pop();
            AnnotatedString annotatedString = builder.toAnnotatedString();
            long m11 = bk.d.m();
            FontWeight medium = FontWeight.Companion.getMedium();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i13 = MaterialTheme.$stable;
            int i14 = i12;
            TextKt.m1846TextIbK3jfQ(annotatedString, null, bk.b.y(materialTheme.getColors(startRestartGroup, i13)), m11, null, medium, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, startRestartGroup, 199680, 0, 262098);
            TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(startRestartGroup, i13).getBody2(), bk.b.y(materialTheme.getColors(startRestartGroup, i13)), bk.d.m(), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(22), null, null, null, 0, 0, null, 16646140, null);
            SolidColor solidColor = new SolidColor(materialTheme.getColors(startRestartGroup, i13).m1600getPrimary0d7_KjU(), null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.Companion.m4739getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (kotlin.jvm.internal.v) null);
            boolean changedInstance = startRestartGroup.changedInstance(focusManager);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.word_book.list.p2
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 y11;
                        y11 = i3.y(FocusManager.this, (KeyboardActionScope) obj);
                        return y11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            composer2 = startRestartGroup;
            textFieldValue2 = textFieldValue;
            lVar2 = lVar;
            BasicTextFieldKt.BasicTextField(textFieldValue2, lVar2, FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), focusRequester), false, false, m4572copyp1EtxEg$default, keyboardOptions, new KeyboardActions((x00.l) rememberedValue3, null, null, null, null, null, 62, null), true, 0, 0, (VisualTransformation) null, (x00.l<? super TextLayoutResult, yz.g2>) null, (MutableInteractionSource) null, (Brush) solidColor, (x00.q<? super x00.p<? super Composer, ? super Integer, yz.g2>, ? super Composer, ? super Integer, yz.g2>) ComposableLambdaKt.rememberComposableLambda(1800142881, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.q2
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 z11;
                    z11 = i3.z(TextFieldValue.this, lVar, (x00.p) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return z11;
                }
            }, startRestartGroup, 54), composer2, (i14 & 14) | 102236160 | (i14 & 112), 196608, 15896);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.r2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 B;
                    B = i3.B(TextFieldValue.this, lVar2, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return B;
                }
            });
        }
    }

    public static final yz.g2 y(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        kotlin.jvm.internal.g0.p(KeyboardActions, "$this$KeyboardActions");
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        return yz.g2.f100423a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final yz.g2 z(TextFieldValue textFieldValue, final x00.l lVar, x00.p innerTextField, Composer composer, int i11) {
        int i12;
        int i13;
        Modifier.Companion companion;
        Composer composer2 = composer;
        kotlin.jvm.internal.g0.p(innerTextField, "innerTextField");
        if ((i11 & 6) == 0) {
            i12 = i11 | (composer2.changedInstance(innerTextField) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (composer2.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1800142881, i12, -1, "com.baicizhan.main.word_book.list.NameSection.<anonymous>.<anonymous> (WordBookCreateActivity.kt:272)");
            }
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier m758defaultMinSizeVpY3zN4$default = SizeKt.m758defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, Dp.m5115constructorimpl(50), 1, null);
            Color.Companion companion3 = Color.Companion;
            Modifier m234backgroundbw27NRU = BackgroundKt.m234backgroundbw27NRU(m758defaultMinSizeVpY3zN4$default, companion3.m2544getTransparent0d7_KjU(), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(bk.d.i()));
            float m5115constructorimpl = Dp.m5115constructorimpl(1);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i14 = MaterialTheme.$stable;
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(BorderKt.border(m234backgroundbw27NRU, BorderStrokeKt.m262BorderStrokecXLIe8U(m5115constructorimpl, bk.b.G(materialTheme.getColors(composer2, i14))), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(bk.d.i())), bk.d.c(), Dp.m5115constructorimpl(13));
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(10)), companion4.getCenterVertically(), composer2, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m727paddingVpY3zN4);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion5.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer2);
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion5.getSetModifier());
            Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
            x00.a<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (textFieldValue.getText().length() == 0) {
                composer2.startReplaceGroup(-531275498);
                companion = companion2;
                i13 = i12;
                TextKt.m1845Text4IGK_g("请输入名称，最多10字", (Modifier) null, bk.b.E(materialTheme.getColors(composer2, i14)), bk.d.m(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3072, 6, 130034);
                composer2 = composer;
            } else {
                i13 = i12;
                companion = companion2;
                composer2.startReplaceGroup(-542583957);
            }
            composer2.endReplaceGroup();
            innerTextField.invoke(composer2, Integer.valueOf(i13 & 14));
            composer2.endNode();
            if (textFieldValue.getText().length() > 0) {
                composer2.startReplaceGroup(1825037556);
                Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_input_clear_24, composer2, 6);
                long m2545getUnspecified0d7_KjU = companion3.m2545getUnspecified0d7_KjU();
                Modifier m773size3ABfNKs = SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(24));
                Object rememberedValue = composer2.rememberedValue();
                Composer.Companion companion6 = Composer.Companion;
                if (rememberedValue == companion6.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer2.updateRememberedValue(rememberedValue);
                }
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                boolean changed = composer2.changed(lVar);
                Object rememberedValue2 = composer2.rememberedValue();
                if (changed || rememberedValue2 == companion6.getEmpty()) {
                    rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.word_book.list.d3
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 A;
                            A = i3.A(x00.l.this);
                            return A;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                IconKt.m1691Iconww6aTOc(painterResource, kc.o.N, ClickableKt.m267clickableO2vRcR0$default(m773size3ABfNKs, mutableInteractionSource, null, false, null, null, (x00.a) rememberedValue2, 28, null), m2545getUnspecified0d7_KjU, composer2, 3120, 0);
            } else {
                composer2.startReplaceGroup(1813246117);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }
}
