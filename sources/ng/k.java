package ng;

import a00.h0;
import a00.l1;
import a00.r0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
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
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.baicizhan.client.business.util.navigate.Navigator;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.model.data.GoldenNavigation;
import com.baicizhan.main.wikiv2.studyv2.data.EntryPage;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.jiongji.andriod.card.R;
import gi.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import ma.t;
import ma.u;
import x00.r;
import yz.g2;
import yz.h1;
import zg.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGoldenUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoldenUI.kt\ncom/baicizhan/main/home/plan/golden/GoldenUIKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,331:1\n1878#2,3:332\n1634#2,3:340\n1634#2,3:343\n360#2,7:346\n1788#2,4:353\n75#3:335\n75#3:336\n1247#4,3:337\n1250#4,3:358\n1247#4,6:364\n1247#4,6:373\n1247#4,6:379\n1247#4,6:473\n1247#4,6:481\n1#5:357\n113#6:361\n113#6:362\n113#6:363\n113#6:370\n113#6:371\n113#6:372\n113#6:385\n113#6:386\n113#6:461\n113#6:462\n113#6:463\n113#6:472\n113#6:479\n113#6:480\n70#7:387\n68#7,8:388\n77#7:471\n79#8,6:396\n86#8,3:411\n89#8,2:420\n79#8,6:434\n86#8,3:449\n89#8,2:458\n93#8:466\n93#8:470\n347#9,9:402\n356#9:422\n347#9,9:440\n356#9:460\n357#9,2:464\n357#9,2:468\n4206#10,6:414\n4206#10,6:452\n87#11:423\n83#11,10:424\n94#11:467\n*S KotlinDebug\n*F\n+ 1 GoldenUI.kt\ncom/baicizhan/main/home/plan/golden/GoldenUIKt\n*L\n130#1:332,3\n166#1:340,3\n172#1:343,3\n180#1:346,7\n192#1:353,4\n163#1:335\n164#1:336\n164#1:337,3\n164#1:358,3\n202#1:364,6\n234#1:373,6\n248#1:379,6\n208#1:473,6\n217#1:481,6\n197#1:361\n198#1:362\n201#1:363\n229#1:370\n230#1:371\n231#1:372\n251#1:385\n252#1:386\n258#1:461\n259#1:462\n263#1:463\n206#1:472\n215#1:479\n216#1:480\n244#1:387\n244#1:388,8\n244#1:471\n244#1:396,6\n244#1:411,3\n244#1:420,2\n255#1:434,6\n255#1:449,3\n255#1:458,2\n255#1:466\n244#1:470\n244#1:402,9\n244#1:422\n255#1:440,9\n255#1:460\n255#1:464,2\n244#1:468,2\n244#1:414,6\n255#1:452,6\n255#1:423\n255#1:424,10\n255#1:467\n*E\n"})
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f75118a = "GoldenUI";

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void i(Modifier modifier, final a.C1395a c1395a, final x00.a<g2> aVar, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        x00.a<g2> aVar2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(-591471672);
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
            i13 |= startRestartGroup.changedInstance(c1395a) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            aVar2 = aVar;
            i13 |= startRestartGroup.changedInstance(aVar2) ? 256 : 128;
        } else {
            aVar2 = aVar;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-591471672, i13, -1, "com.baicizhan.main.home.plan.golden.GoldenBanner (GoldenUI.kt:225)");
            }
            Modifier clip = ClipKt.clip(SizeKt.m759height3ABfNKs(SizeKt.m778width3ABfNKs(modifier3, Dp.m5115constructorimpl(140)), Dp.m5115constructorimpl(70)), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4)));
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ImageKt.Image(q.g(c1395a.h(), startRestartGroup, 0), "", ClickableKt.m267clickableO2vRcR0$default(clip, (MutableInteractionSource) rememberedValue, null, false, null, null, aVar2, 28, null), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: ng.c
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 j11;
                    j11 = k.j(Modifier.this, c1395a, aVar, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return j11;
                }
            });
        }
    }

    public static final g2 j(Modifier modifier, a.C1395a c1395a, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        i(modifier, c1395a, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void k(Modifier modifier, final a.b bVar, final x00.a<g2> aVar, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        x00.a<g2> aVar2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(1996329358);
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
            i13 |= startRestartGroup.changedInstance(bVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            aVar2 = aVar;
            i13 |= startRestartGroup.changedInstance(aVar2) ? 256 : 128;
        } else {
            aVar2 = aVar;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1996329358, i13, -1, "com.baicizhan.main.home.plan.golden.GoldenIcon (GoldenUI.kt:242)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            modifier3 = modifier4;
            float f11 = 4;
            float f12 = 12;
            float f13 = 8;
            Modifier m729paddingqDBjuR0 = PaddingKt.m729paddingqDBjuR0(BackgroundKt.m234backgroundbw27NRU(ClickableKt.m267clickableO2vRcR0$default(modifier4, (MutableInteractionSource) rememberedValue, null, false, null, null, aVar2, 28, null), bk.b.A0(), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f11))), Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f13), Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f13));
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m729paddingqDBjuR0);
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
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion3 = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
            x00.a<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f14 = 32;
            ImageKt.Image(q.g(bVar.i(), startRestartGroup, 0), "", SizeKt.m759height3ABfNKs(SizeKt.m778width3ABfNKs(companion3, Dp.m5115constructorimpl(f14)), Dp.m5115constructorimpl(f14)), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            TextKt.m1845Text4IGK_g(bVar.k(), (Modifier) null, bk.b.B(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, 0, false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, startRestartGroup, 200064, 3072, 122322);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: ng.d
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 l11;
                    l11 = k.l(Modifier.this, bVar, aVar, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return l11;
                }
            });
        }
    }

    public static final g2 l(Modifier modifier, a.b bVar, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        k(modifier, bVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void m(@m80.l Modifier modifier, @m80.k final GoldenNavigation goldens, @m80.k final x00.l<? super Integer, g2> click, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        int i14;
        Object valueOf;
        int i15;
        g0.p(goldens, "goldens");
        g0.p(click, "click");
        Composer startRestartGroup = composer.startRestartGroup(-272638151);
        int i16 = i12 & 1;
        if (i16 != 0) {
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
            i13 |= startRestartGroup.changedInstance(goldens) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(click) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            modifier3 = i16 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-272638151, i13, -1, "com.baicizhan.main.home.plan.golden.GoldenUI (GoldenUI.kt:161)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean changed = startRestartGroup.changed((Configuration) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())) | startRestartGroup.changed(goldens);
            final Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                int i17 = xb.i.c(context).x;
                List<zg.a> items = goldens.getItems();
                ArrayList arrayList = new ArrayList();
                for (zg.a aVar : items) {
                    if (aVar instanceof a.C1395a) {
                        i15 = 140;
                    } else {
                        if (!(aVar instanceof a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i15 = 0;
                    }
                    arrayList.add(Integer.valueOf(i15));
                }
                int H5 = r0.H5(arrayList);
                List<zg.a> items2 = goldens.getItems();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = items2.iterator();
                while (true) {
                    int i18 = 81;
                    if (it.hasNext()) {
                        zg.a aVar2 = (zg.a) it.next();
                        if (aVar2 instanceof a.C1395a) {
                            i18 = 0;
                        } else if (!(aVar2 instanceof a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList2.add(Integer.valueOf(i18));
                    } else {
                        int H52 = r0.H5(arrayList2);
                        int size = (goldens.getItems().size() * 12) + 20;
                        if (H52 + H5 + size > i17 + 40) {
                            Iterator<zg.a> it2 = goldens.getItems().iterator();
                            int i19 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i19 = -1;
                                    break;
                                } else if (it2.next() instanceof a.C1395a) {
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                            valueOf = (i19 == -1 || i19 >= 4) ? Float.valueOf((i17 - 64) / 4.5f) : (i19 < 0 || i19 >= 3) ? 81 : Float.valueOf((i17 - 192) / 2.5f);
                        } else {
                            int i21 = (i17 - H5) - size;
                            List<zg.a> items3 = goldens.getItems();
                            if ((items3 instanceof Collection) && items3.isEmpty()) {
                                i14 = 0;
                            } else {
                                Iterator<T> it3 = items3.iterator();
                                i14 = 0;
                                while (it3.hasNext()) {
                                    if ((((zg.a) it3.next()) instanceof a.b) && (i14 = i14 + 1) < 0) {
                                        h0.a0();
                                    }
                                }
                            }
                            Integer valueOf2 = Integer.valueOf(i14);
                            if (valueOf2.intValue() == 0) {
                                valueOf2 = null;
                            }
                            valueOf = Integer.valueOf(i21 / (valueOf2 != null ? valueOf2.intValue() : 1));
                        }
                        rememberedValue = valueOf;
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                }
            }
            float f11 = 10;
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m759height3ABfNKs(PaddingKt.m728paddingVpY3zN4$default(modifier3, 0.0f, Dp.m5115constructorimpl(f11), 1, null), Dp.m5115constructorimpl(70)), 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            PaddingValues m721PaddingValuesYgX7TsA$default = PaddingKt.m721PaddingValuesYgX7TsA$default(Dp.m5115constructorimpl(f11), 0.0f, 2, null);
            boolean changedInstance = startRestartGroup.changedInstance(goldens) | ((i13 & 896) == 256) | startRestartGroup.changedInstance(rememberedValue);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: ng.g
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 n11;
                        n11 = k.n(GoldenNavigation.this, click, rememberedValue, (LazyListScope) obj);
                        return n11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.LazyRow(fillMaxHeight$default, null, m721PaddingValuesYgX7TsA$default, false, null, centerVertically, null, false, null, (x00.l) rememberedValue2, startRestartGroup, 196992, 474);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: ng.h
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 r11;
                    r11 = k.r(Modifier.this, goldens, click, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return r11;
                }
            });
        }
    }

    public static final g2 n(final GoldenNavigation goldenNavigation, final x00.l lVar, final Object obj, LazyListScope LazyRow) {
        g0.p(LazyRow, "$this$LazyRow");
        LazyListScope.items$default(LazyRow, goldenNavigation.getItems().size(), null, null, ComposableLambdaKt.composableLambdaInstance(-1236251931, true, new r() { // from class: ng.e
            @Override // x00.r
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                g2 o11;
                o11 = k.o(GoldenNavigation.this, lVar, obj, (LazyItemScope) obj2, ((Integer) obj3).intValue(), (Composer) obj4, ((Integer) obj5).intValue());
                return o11;
            }
        }), 6, null);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 o(GoldenNavigation goldenNavigation, final x00.l lVar, Object obj, LazyItemScope items, final int i11, Composer composer, int i12) {
        int i13;
        g0.p(items, "$this$items");
        if ((i12 & 6) == 0) {
            i13 = i12 | (composer.changed(items) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= composer.changed(i11) ? 32 : 16;
        }
        if (composer.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1236251931, i13, -1, "com.baicizhan.main.home.plan.golden.GoldenUI.<anonymous>.<anonymous>.<anonymous> (GoldenUI.kt:203)");
            }
            zg.a aVar = goldenNavigation.getItems().get(i11);
            if (aVar instanceof a.C1395a) {
                composer.startReplaceGroup(1667838729);
                Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(Modifier.Companion, Dp.m5115constructorimpl(6), 0.0f, 2, null);
                a.C1395a c1395a = (a.C1395a) aVar;
                boolean changed = composer.changed(lVar) | ((i13 & 112) == 32);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: ng.i
                        @Override // x00.a
                        public final Object invoke() {
                            g2 p11;
                            p11 = k.p(x00.l.this, i11);
                            return p11;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                i(m728paddingVpY3zN4$default, c1395a, (x00.a) rememberedValue, composer, 6, 0);
                composer.endReplaceGroup();
            } else {
                if (!(aVar instanceof a.b)) {
                    composer.startReplaceGroup(1667836539);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1667845608);
                Modifier m778width3ABfNKs = SizeKt.m778width3ABfNKs(PaddingKt.m728paddingVpY3zN4$default(LazyItemScope.fillParentMaxHeight$default(items, Modifier.Companion, 0.0f, 1, null), Dp.m5115constructorimpl(6), 0.0f, 2, null), Dp.m5115constructorimpl(((Number) obj).intValue()));
                a.b bVar = (a.b) aVar;
                boolean changed2 = composer.changed(lVar) | ((i13 & 112) == 32);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new x00.a() { // from class: ng.j
                        @Override // x00.a
                        public final Object invoke() {
                            g2 q11;
                            q11 = k.q(x00.l.this, i11);
                            return q11;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                k(m778width3ABfNKs, bVar, (x00.a) rememberedValue2, composer, 0, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 p(x00.l lVar, int i11) {
        lVar.invoke(Integer.valueOf(i11));
        return g2.f100423a;
    }

    public static final g2 q(x00.l lVar, int i11) {
        lVar.invoke(Integer.valueOf(i11));
        return g2.f100423a;
    }

    public static final g2 r(Modifier modifier, GoldenNavigation goldenNavigation, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        m(modifier, goldenNavigation, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @Composable
    @Preview
    public static final void s(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1246355291);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1246355291, i11, -1, "com.baicizhan.main.home.plan.golden.Preview (GoldenUI.kt:325)");
            }
            bk.k.e(null, null, null, b.f75090a.b(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: ng.f
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 t11;
                    t11 = k.t(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return t11;
                }
            });
        }
    }

    public static final g2 t(int i11, Composer composer, int i12) {
        s(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    public static final void w(int i11, int i12, String str, String str2, Boolean bool, Context context) {
        try {
            com.baicizhan.main.wikiv2.studyv2.data.u0.f26107a.q(EntryPage.H5_PAGE);
            if (i12 != 1) {
                if (i12 != 2) {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str2));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                } else {
                    BczWebExecutorKt.startNormalWeb$default(context, str2, null, false, 0, null, 60, null);
                }
            } else {
                if (!g0.g(bool, Boolean.TRUE)) {
                    if (g0.g(bool, Boolean.FALSE)) {
                        va.g.g(R.string.loading_progress, 0);
                        return;
                    } else {
                        va.g.g(R.string.base_loading_view_failed, 0);
                        return;
                    }
                }
                Navigator.navigate(context, str2, null, 0);
            }
            ma.l.b(t.f73003b, ma.a.f72884z3, u.d(new String[]{"idx", ma.b.f72943s0, "url"}, new Object[]{Integer.valueOf(i11), str, str2}, false, 4, null));
        } catch (Exception e11) {
            qb.c.c(f75118a, "navigate:", e11);
        }
    }

    public static final void x(@m80.k GoldenNavigation golden) {
        g0.p(golden, "golden");
        int i11 = 0;
        qb.c.i(f75118a, "report show", new Object[0]);
        if (golden.getItems().isEmpty()) {
            return;
        }
        for (Object obj : golden.getItems()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            zg.a aVar = (zg.a) obj;
            if (aVar instanceof a.C1395a) {
                ma.l.e(t.f73003b, ma.a.A3, l1.W(h1.a("idx", String.valueOf(i11)), h1.a("url", ((a.C1395a) aVar).i()), h1.a(ma.b.f72943s0, "")));
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.b bVar = (a.b) aVar;
                ma.l.e(t.f73003b, ma.a.A3, l1.W(h1.a("idx", String.valueOf(i11)), h1.a("url", bVar.j()), h1.a(ma.b.f72943s0, bVar.k())));
            }
            i11 = i12;
        }
    }
}
