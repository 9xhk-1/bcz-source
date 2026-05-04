package fd;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.Colors;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.main.wikiv2.studyv2.data.EntryPage;
import com.baicizhan.main.wikiv2.studyv2.data.WikiStyle;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.baicizhan.platform.base.widget.WidgetsKt;
import com.google.accompanist.pager.Pager;
import com.jiongji.andriod.card.R;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nFastTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTestActivity.kt\ncom/baicizhan/main/activity/FastTestActivityKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,509:1\n75#2:510\n87#3:511\n84#3,9:512\n94#3:552\n87#3:611\n83#3,10:612\n94#3:716\n79#4,6:521\n86#4,3:536\n89#4,2:545\n93#4:551\n79#4,6:570\n86#4,3:585\n89#4,2:594\n93#4:609\n79#4,6:622\n86#4,3:637\n89#4,2:646\n79#4,6:668\n86#4,3:683\n89#4,2:692\n93#4:711\n93#4:715\n79#4,6:733\n86#4,3:748\n89#4,2:757\n93#4:762\n347#5,9:527\n356#5:547\n357#5,2:549\n347#5,9:576\n356#5:596\n357#5,2:607\n347#5,9:628\n356#5:648\n347#5,9:674\n356#5:694\n357#5,2:709\n357#5,2:713\n347#5,9:739\n356#5,3:759\n4206#6,6:539\n4206#6,6:588\n4206#6,6:640\n4206#6,6:686\n4206#6,6:751\n113#7:548\n113#7:597\n113#7:598\n113#7:606\n113#7:649\n113#7:656\n113#7:657\n113#7:658\n113#7:695\n113#7:702\n1247#8,6:553\n1247#8,6:600\n1247#8,6:650\n1247#8,6:696\n1247#8,6:703\n1247#8,6:717\n99#9:559\n95#9,10:560\n106#9:610\n99#9:659\n97#9,8:660\n106#9:712\n1#10:599\n70#11:723\n67#11,9:724\n77#11:763\n*S KotlinDebug\n*F\n+ 1 FastTestActivity.kt\ncom/baicizhan/main/activity/FastTestActivityKt\n*L\n428#1:510\n429#1:511\n429#1:512,9\n429#1:552\n340#1:611\n340#1:612,10\n340#1:716\n429#1:521,6\n429#1:536,3\n429#1:545,2\n429#1:551\n302#1:570,6\n302#1:585,3\n302#1:594,2\n302#1:609\n340#1:622,6\n340#1:637,3\n340#1:646,2\n367#1:668,6\n367#1:683,3\n367#1:692,2\n367#1:711\n340#1:715\n350#1:733,6\n350#1:748,3\n350#1:757,2\n350#1:762\n429#1:527,9\n429#1:547\n429#1:549,2\n302#1:576,9\n302#1:596\n302#1:607,2\n340#1:628,9\n340#1:648\n367#1:674,9\n367#1:694\n367#1:709,2\n340#1:713,2\n350#1:739,9\n350#1:759,3\n429#1:539,6\n302#1:588,6\n340#1:640,6\n367#1:686,6\n350#1:751,6\n440#1:548\n305#1:597\n313#1:598\n331#1:606\n345#1:649\n370#1:656\n371#1:657\n372#1:658\n386#1:695\n407#1:702\n301#1:553,6\n324#1:600,6\n347#1:650,6\n375#1:696,6\n396#1:703,6\n353#1:717,6\n302#1:559\n302#1:560,10\n302#1:610\n367#1:659\n367#1:660,8\n367#1:712\n350#1:723\n350#1:724,9\n350#1:763\n*E\n"})
/* loaded from: classes4.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f51791a = "FastTestUi";

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 A(List list, final x00.l lVar, x00.l lVar2, com.google.accompanist.pager.d VerticalPager, int i11, Composer composer, int i12) {
        int i13;
        kotlin.jvm.internal.g0.p(VerticalPager, "$this$VerticalPager");
        if ((i12 & 48) == 0) {
            i13 = i12 | (composer.changed(i11) ? 32 : 16);
        } else {
            i13 = i12;
        }
        if (composer.shouldExecute((i13 & 145) != 144, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-87108115, i13, -1, "com.baicizhan.main.activity.FastTestContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FastTestActivity.kt:348)");
            }
            final uh.f fVar = (uh.f) a00.r0.b3(list, i11);
            if (fVar == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return yz.g2.f100423a;
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            boolean changed = composer.changed(lVar) | composer.changedInstance(fVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: fd.m0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 B;
                        B = x0.B(x00.l.this, fVar);
                        return B;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Modifier k11 = ComposeUtilsKt.k(fillMaxSize$default, 0L, false, (x00.a) rememberedValue, 3, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, k11);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TopicRecord c11 = fVar.c();
            if (c11 == null) {
                composer.startReplaceGroup(647437546);
                WidgetsKt.G(boxScopeInstance.align(companion, companion2.getCenter()), composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(647544341);
                Modifier align = boxScopeInstance.align(companion, companion2.getCenter());
                String word = c11.word;
                kotlin.jvm.internal.g0.o(word, "word");
                String phonetic = c11.phonetic;
                kotlin.jvm.internal.g0.o(phonetic, "phonetic");
                H(align, word, phonetic, composer, 0, 0);
                composer.endReplaceGroup();
            }
            composer.endNode();
            lVar2.invoke(Integer.valueOf(i11));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 B(x00.l lVar, uh.f fVar) {
        lVar.invoke(fVar);
        return yz.g2.f100423a;
    }

    public static final yz.g2 C(com.google.accompanist.pager.f fVar, x00.l lVar, List list) {
        if (fVar.isScrollInProgress()) {
            qb.c.q(f51791a, "in scroll, forget disabled.", new Object[0]);
            return yz.g2.f100423a;
        }
        uh.f fVar2 = (uh.f) a00.r0.b3(list, fVar.k());
        if (fVar2 == null) {
            return yz.g2.f100423a;
        }
        lVar.invoke(fVar2);
        return yz.g2.f100423a;
    }

    public static final yz.g2 D(com.google.accompanist.pager.f fVar, x00.p pVar, List list) {
        if (fVar.isScrollInProgress()) {
            qb.c.q(f51791a, "in scroll, remember disabled.", new Object[0]);
            return yz.g2.f100423a;
        }
        Integer valueOf = Integer.valueOf(fVar.k());
        uh.f fVar2 = (uh.f) a00.r0.b3(list, fVar.k());
        if (fVar2 == null) {
            return yz.g2.f100423a;
        }
        pVar.invoke(valueOf, fVar2);
        return yz.g2.f100423a;
    }

    public static final yz.g2 E(List list, int i11, com.google.accompanist.pager.f fVar, x00.l lVar, x00.l lVar2, x00.l lVar3, x00.p pVar, x00.l lVar4, int i12, Composer composer, int i13) {
        s(list, i11, fVar, lVar, lVar2, lVar3, pVar, lVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4294506745L, showBackground = true)
    public static final void F(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(86300132);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(86300132, i11, -1, "com.baicizhan.main.activity.FastTestContentPreview (FastTestActivity.kt:450)");
            }
            bk.k.e(null, null, null, j.f51600a.j(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: fd.v0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 G;
                    G = x0.G(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return G;
                }
            });
        }
    }

    public static final yz.g2 G(int i11, Composer composer, int i12) {
        F(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void H(Modifier modifier, final String str, final String str2, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(-697908768);
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
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-697908768, i13, -1, "com.baicizhan.main.activity.FastTestWord (FastTestActivity.kt:426)");
            }
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier align = columnScopeInstance.align(companion3, companion.getCenterHorizontally());
            int i15 = i13;
            long r11 = bk.d.r();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i16 = MaterialTheme.$stable;
            composer2 = startRestartGroup;
            Modifier modifier5 = modifier4;
            TextKt.m1845Text4IGK_g(str, align, bk.b.A(materialTheme.getColors(startRestartGroup, i16)), r11, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, ((i15 >> 3) & 14) | 199680, 0, 131024);
            TextKt.m1845Text4IGK_g(str2, PaddingKt.m730paddingqDBjuR0$default(columnScopeInstance.align(companion3, companion.getCenterHorizontally()), 0.0f, Dp.m5115constructorimpl(4), 0.0f, 0.0f, 13, null), bk.b.A(materialTheme.getColors(composer2, i16)), bk.d.n(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, ((i15 >> 6) & 14) | 3072, 0, 131056);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: fd.j0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 I;
                    I = x0.I(Modifier.this, str, str2, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return I;
                }
            });
        }
    }

    public static final yz.g2 I(Modifier modifier, String str, String str2, int i11, int i12, Composer composer, int i13) {
        H(modifier, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 16777215, showBackground = true)
    public static final void J(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-530897171);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-530897171, i11, -1, "com.baicizhan.main.activity.FastTestWordPreview (FastTestActivity.kt:504)");
            }
            bk.k.e(null, null, null, j.f51600a.l(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: fd.n0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 K;
                    K = x0.K(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return K;
                }
            });
        }
    }

    public static final yz.g2 K(int i11, Composer composer, int i12) {
        J(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final void O() {
        com.baicizhan.main.wikiv2.studyv2.data.u0 u0Var = com.baicizhan.main.wikiv2.studyv2.data.u0.f26107a;
        u0Var.q(EntryPage.SELF_TEST);
        u0Var.r(com.baicizhan.main.wikiv2.studyv2.data.v0.f26118a.b() ? WikiStyle.TEST_GUIDE_WIKI : WikiStyle.STUDY_WIKI);
        u0Var.n(ma.v.f73041l, "");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4294506745L, showBackground = true)
    public static final void q(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-905629261);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-905629261, i11, -1, "com.baicizhan.main.activity.ButtonDisabled (FastTestActivity.kt:474)");
            }
            bk.k.e(null, null, null, j.f51600a.k(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: fd.o0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 r11;
                    r11 = x0.r(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return r11;
                }
            });
        }
    }

    public static final yz.g2 r(int i11, Composer composer, int i12) {
        q(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void s(final List<uh.f> list, final int i11, final com.google.accompanist.pager.f fVar, final x00.l<? super uh.f, yz.g2> lVar, final x00.l<? super uh.f, yz.g2> lVar2, final x00.l<? super uh.f, yz.g2> lVar3, final x00.p<? super Integer, ? super uh.f, yz.g2> pVar, final x00.l<? super Integer, yz.g2> lVar4, Composer composer, final int i12) {
        int i13;
        x00.l<? super uh.f, yz.g2> lVar5;
        Colors m1592copypvPzIIM;
        Composer startRestartGroup = composer.startRestartGroup(-1214729385);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= startRestartGroup.changed(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= startRestartGroup.changed(fVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(lVar) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            lVar5 = lVar2;
            i13 |= startRestartGroup.changedInstance(lVar5) ? 16384 : 8192;
        } else {
            lVar5 = lVar2;
        }
        if ((196608 & i12) == 0) {
            i13 |= startRestartGroup.changedInstance(lVar3) ? 131072 : 65536;
        }
        if ((1572864 & i12) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= startRestartGroup.changedInstance(lVar4) ? 8388608 : 4194304;
        }
        if (startRestartGroup.shouldExecute((4793491 & i13) != 4793490, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1214729385, i13, -1, "com.baicizhan.main.activity.FastTestContent (FastTestActivity.kt:296)");
            }
            OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, LocalOnBackPressedDispatcherOwner.$stable);
            final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
            m1592copypvPzIIM = r16.m1592copypvPzIIM((r45 & 1) != 0 ? r16.m1600getPrimary0d7_KjU() : 0L, (r45 & 2) != 0 ? r16.m1601getPrimaryVariant0d7_KjU() : 0L, (r45 & 4) != 0 ? r16.m1602getSecondary0d7_KjU() : 0L, (r45 & 8) != 0 ? r16.m1603getSecondaryVariant0d7_KjU() : 0L, (r45 & 16) != 0 ? r16.m1593getBackground0d7_KjU() : Color.Companion.m2544getTransparent0d7_KjU(), (r45 & 32) != 0 ? r16.m1604getSurface0d7_KjU() : 0L, (r45 & 64) != 0 ? r16.m1594getError0d7_KjU() : 0L, (r45 & 128) != 0 ? r16.m1597getOnPrimary0d7_KjU() : 0L, (r45 & 256) != 0 ? r16.m1598getOnSecondary0d7_KjU() : 0L, (r45 & 512) != 0 ? r16.m1595getOnBackground0d7_KjU() : 0L, (r45 & 1024) != 0 ? r16.m1599getOnSurface0d7_KjU() : 0L, (r45 & 2048) != 0 ? r16.m1596getOnError0d7_KjU() : 0L, (r45 & 4096) != 0 ? bk.k.k().isLight() : false);
            final x00.l<? super uh.f, yz.g2> lVar6 = lVar5;
            bk.k.e(m1592copypvPzIIM, null, null, ComposableLambdaKt.rememberComposableLambda(-717410813, true, new x00.p() { // from class: fd.k0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 t11;
                    t11 = x0.t(OnBackPressedDispatcher.this, i11, list, fVar, lVar, lVar6, lVar4, lVar3, pVar, (Composer) obj, ((Integer) obj2).intValue());
                    return t11;
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: fd.l0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 E;
                    E = x0.E(list, i11, fVar, lVar, lVar2, lVar3, pVar, lVar4, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return E;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 t(final OnBackPressedDispatcher onBackPressedDispatcher, final int i11, final List list, final com.google.accompanist.pager.f fVar, final x00.l lVar, final x00.l lVar2, final x00.l lVar3, final x00.l lVar4, final x00.p pVar, Composer composer, int i12) {
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-717410813, i12, -1, "com.baicizhan.main.activity.FastTestContent.<anonymous> (FastTestActivity.kt:299)");
            }
            com.baicizhan.platform.base.widget.s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(1286547436, true, new x00.p() { // from class: fd.p0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 u11;
                    u11 = x0.u(OnBackPressedDispatcher.this, i11, list, fVar, lVar, (Composer) obj, ((Integer) obj2).intValue());
                    return u11;
                }
            }, composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1235288332, true, new x00.q() { // from class: fd.q0
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 y11;
                    y11 = x0.y(list, fVar, lVar2, lVar3, lVar4, pVar, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return y11;
                }
            }, composer, 54), composer, 3072, 12582912, 131063);
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
    public static final yz.g2 u(final OnBackPressedDispatcher onBackPressedDispatcher, final int i11, final List list, final com.google.accompanist.pager.f fVar, final x00.l lVar, Composer composer, int i12) {
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1286547436, i12, -1, "com.baicizhan.main.activity.FastTestContent.<anonymous>.<anonymous> (FastTestActivity.kt:300)");
            }
            boolean changedInstance = composer.changedInstance(onBackPressedDispatcher);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: fd.w0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 v11;
                        v11 = x0.v(OnBackPressedDispatcher.this);
                        return v11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.baicizhan.platform.base.widget.s4.f0(null, 0L, 0L, 0, (x00.a) rememberedValue, null, null, false, false, ComposableLambdaKt.rememberComposableLambda(101269208, true, new x00.p() { // from class: fd.i0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 w11;
                    w11 = x0.w(i11, list, fVar, lVar, (Composer) obj, ((Integer) obj2).intValue());
                    return w11;
                }
            }, composer, 54), composer, 817889280, 367);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 v(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.onBackPressed();
        }
        return yz.g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x019e, code lost:
    
        if (r4 == null) goto L30;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final yz.g2 w(int r33, java.util.List r34, final com.google.accompanist.pager.f r35, final x00.l r36, androidx.compose.runtime.Composer r37, int r38) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.x0.w(int, java.util.List, com.google.accompanist.pager.f, x00.l, androidx.compose.runtime.Composer, int):yz.g2");
    }

    public static final yz.g2 x(com.google.accompanist.pager.f fVar, x00.l lVar, uh.f fVar2) {
        if (fVar.isScrollInProgress()) {
            qb.c.q(f51791a, "in scroll, no click...", new Object[0]);
            return yz.g2.f100423a;
        }
        lVar.invoke(fVar2);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 y(final List list, final com.google.accompanist.pager.f fVar, final x00.l lVar, final x00.l lVar2, final x00.l lVar3, final x00.p pVar, PaddingValues it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1235288332, i11, -1, "com.baicizhan.main.activity.FastTestContent.<anonymous>.<anonymous> (FastTestActivity.kt:339)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int size = list.size();
            Modifier weight$default = ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null);
            float f11 = 20;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(weight$default, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), 0.0f, 8, null);
            boolean changedInstance = composer.changedInstance(list);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: fd.r0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        Object z11;
                        z11 = x0.z(list, ((Integer) obj).intValue());
                        return z11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Pager.c(size, m730paddingqDBjuR0$default, fVar, false, 0.0f, null, null, null, (x00.l) rememberedValue, ComposableLambdaKt.rememberComposableLambda(-87108115, true, new x00.r() { // from class: fd.s0
                @Override // x00.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    yz.g2 A;
                    A = x0.A(list, lVar, lVar2, (com.google.accompanist.pager.d) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
                    return A;
                }
            }, composer, 54), composer, 805306368, R.styleable.Theme_drawable_walk_sound4);
            Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(PaddingKt.m728paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(16), 0.0f, 2, null), Dp.m5115constructorimpl(100));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(12)), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m759height3ABfNKs);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            uh.f fVar2 = (uh.f) a00.r0.b3(list, fVar.k());
            boolean z11 = (fVar2 != null ? fVar2.c() : null) != null;
            float f12 = 60;
            Modifier align = rowScopeInstance.align(SizeKt.m759height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m5115constructorimpl(f12)), companion2.getCenterVertically());
            bk.e a11 = bk.f.a(bk.b.A0(), bk.b.J0(), Color.m2508copywmQWz5c$default(bk.b.A0(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), Color.m2508copywmQWz5c$default(bk.b.A0(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), composer, 3510, 0);
            boolean changed = composer.changed(fVar) | composer.changed(lVar3) | composer.changedInstance(list);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: fd.t0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 C;
                        C = x0.C(com.google.accompanist.pager.f.this, lVar3, list);
                        return C;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.baicizhan.platform.base.widget.r.C(align, (x00.a) rememberedValue2, "不记得", 0L, null, 0, z11, false, null, a11, null, composer, 384, 0, 1464);
            uh.f fVar3 = (uh.f) a00.r0.b3(list, fVar.k());
            boolean z12 = (fVar3 != null ? fVar3.c() : null) != null;
            Modifier align2 = rowScopeInstance.align(SizeKt.m759height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m5115constructorimpl(f12)), companion2.getCenterVertically());
            bk.e a12 = bk.f.a(bk.b.A0(), bk.b.J0(), Color.m2508copywmQWz5c$default(bk.b.A0(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), Color.m2508copywmQWz5c$default(bk.b.A0(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), composer, 3510, 0);
            boolean changed2 = composer.changed(fVar) | composer.changed(pVar) | composer.changedInstance(list);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: fd.u0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 D;
                        D = x0.D(com.google.accompanist.pager.f.this, pVar, list);
                        return D;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.baicizhan.platform.base.widget.r.C(align2, (x00.a) rememberedValue3, "记得", 0L, null, 0, z12, false, null, a12, null, composer, 384, 0, 1464);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final Object z(List list, int i11) {
        uh.f fVar = (uh.f) a00.r0.b3(list, i11);
        return Integer.valueOf(fVar != null ? fVar.a() : 0);
    }
}
