package ji;

import android.content.Context;
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
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.DividerKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import coil.request.ImageRequest;
import com.baicizhan.main.vld.model.VocabularyDeviceInfo;
import com.baicizhan.platform.base.widget.s4;
import com.jiongji.andriod.card.R;
import kc.o;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDeviceDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDetailActivity.kt\ncom/baicizhan/main/vld/DeviceDetailActivityKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,324:1\n75#2:325\n75#2:463\n1247#3,6:326\n1247#3,6:420\n1247#3,6:467\n1247#3,6:475\n70#4:332\n67#4,9:333\n77#4:419\n79#5,6:342\n86#5,3:357\n89#5,2:366\n79#5,6:380\n86#5,3:395\n89#5,2:404\n93#5:413\n93#5:418\n79#5,6:436\n86#5,3:451\n89#5,2:460\n93#5:483\n347#6,9:348\n356#6:368\n347#6,9:386\n356#6:406\n357#6,2:411\n357#6,2:416\n347#6,9:442\n356#6:462\n357#6,2:481\n4206#7,6:360\n4206#7,6:398\n4206#7,6:454\n113#8:369\n113#8:407\n113#8:408\n113#8:409\n113#8:410\n113#8:415\n113#8:464\n113#8:465\n113#8:466\n113#8:473\n113#8:474\n99#9:370\n96#9,9:371\n106#9:414\n87#10:426\n84#10,9:427\n94#10:484\n*S KotlinDebug\n*F\n+ 1 DeviceDetailActivity.kt\ncom/baicizhan/main/vld/DeviceDetailActivityKt\n*L\n144#1:325\n150#1:463\n237#1:326,6\n147#1:420,6\n176#1:467,6\n208#1:475,6\n237#1:332\n237#1:333,9\n237#1:419\n237#1:342,6\n237#1:357,3\n237#1:366,2\n240#1:380,6\n240#1:395,3\n240#1:404,2\n240#1:413\n237#1:418\n148#1:436,6\n148#1:451,3\n148#1:460,2\n148#1:483\n237#1:348,9\n237#1:368\n240#1:386,9\n240#1:406\n240#1:411,2\n237#1:416,2\n148#1:442,9\n148#1:462\n148#1:481,2\n237#1:360,6\n240#1:398,6\n148#1:454,6\n240#1:369\n250#1:407\n265#1:408\n266#1:409\n277#1:410\n284#1:415\n154#1:464\n155#1:465\n174#1:466\n206#1:473\n218#1:474\n240#1:370\n240#1:371,9\n240#1:414\n148#1:426\n148#1:427,9\n148#1:484\n*E\n"})
/* loaded from: classes4.dex */
public final class k0 {
    public static final g2 A(n1 n1Var, int i11, Composer composer, int i12) {
        y(n1Var, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4294967295L, showBackground = true)
    public static final void B(@PreviewParameter(provider = s1.class) @m80.k final n1 info, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(info, "info");
        Composer startRestartGroup = composer.startRestartGroup(376238606);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(info) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(376238606, i12, -1, "com.baicizhan.main.vld.PreferenceItemPreview (DeviceDetailActivity.kt:304)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(81964986, true, new x00.p() { // from class: ji.e0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 C;
                    C = k0.C(n1.this, (Composer) obj, ((Integer) obj2).intValue());
                    return C;
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: ji.f0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 D;
                    D = k0.D(n1.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return D;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 C(n1 n1Var, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(81964986, i11, -1, "com.baicizhan.main.vld.PreferenceItemPreview.<anonymous> (DeviceDetailActivity.kt:306)");
            }
            y(n1Var, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 D(n1 n1Var, int i11, Composer composer, int i12) {
        B(n1Var, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void n(final VocabularyDeviceInfo vocabularyDeviceInfo, final x00.l<? super String, g2> lVar, final x00.a<g2> aVar, final x00.a<g2> aVar2, final x00.a<g2> aVar3, Composer composer, final int i11) {
        int i12;
        x00.l<? super String, g2> lVar2;
        Composer startRestartGroup = composer.startRestartGroup(-315604286);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(vocabularyDeviceInfo) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            lVar2 = lVar;
            i12 |= startRestartGroup.changedInstance(lVar2) ? 32 : 16;
        } else {
            lVar2 = lVar;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar3) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i12 & 9235) != 9234, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-315604286, i12, -1, "com.baicizhan.main.vld.DeviceInfo (DeviceDetailActivity.kt:142)");
            }
            final Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final x00.l<? super String, g2> lVar3 = lVar2;
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-910998122, true, new x00.p() { // from class: ji.x
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 o11;
                    o11 = k0.o(x00.a.this, vocabularyDeviceInfo, context, lVar3, aVar2, (Composer) obj, ((Integer) obj2).intValue());
                    return o11;
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: ji.b0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 v11;
                    v11 = k0.v(VocabularyDeviceInfo.this, lVar, aVar, aVar2, aVar3, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return v11;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 o(final x00.a aVar, final VocabularyDeviceInfo vocabularyDeviceInfo, final Context context, final x00.l lVar, final x00.a aVar2, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-910998122, i11, -1, "com.baicizhan.main.vld.DeviceInfo.<anonymous> (DeviceDetailActivity.kt:145)");
            }
            s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(-716974387, true, new x00.p() { // from class: ji.h0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 p11;
                    p11 = k0.p(x00.a.this, (Composer) obj, ((Integer) obj2).intValue());
                    return p11;
                }
            }, composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(2115096773, true, new x00.q() { // from class: ji.i0
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 r11;
                    r11 = k0.r(VocabularyDeviceInfo.this, context, lVar, aVar2, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return r11;
                }
            }, composer, 54), composer, 3072, 12582912, 131063);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 p(final x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-716974387, i11, -1, "com.baicizhan.main.vld.DeviceInfo.<anonymous>.<anonymous> (DeviceDetailActivity.kt:146)");
            }
            String stringResource = StringResources_androidKt.stringResource(R.string.devices_management_detail_title, composer, 6);
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: ji.c0
                    @Override // x00.a
                    public final Object invoke() {
                        g2 q11;
                        q11 = k0.q(x00.a.this);
                        return q11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            s4.F(0, null, (x00.a) rememberedValue, stringResource, null, null, composer, 0, 51);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 q(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 r(VocabularyDeviceInfo vocabularyDeviceInfo, final Context context, final x00.l lVar, final x00.a aVar, PaddingValues it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2115096773, i11, -1, "com.baicizhan.main.vld.DeviceInfo.<anonymous>.<anonymous> (DeviceDetailActivity.kt:147)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            float f11 = 20;
            coil.compose.l.b(new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).j(vocabularyDeviceInfo.getImage()).f(), "vld-model", ColumnScopeInstance.INSTANCE.align(SizeKt.m773size3ABfNKs(PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(32), 0.0f, Dp.m5115constructorimpl(f11), 5, null), Dp.m5115constructorimpl(110)), companion2.getCenterHorizontally()), PainterResources_androidKt.painterResource(R.drawable.ic_mytab_exchange_placeholder, composer, 6), null, null, null, null, null, null, ContentScale.Companion.getFit(), 0.0f, null, 0, false, null, composer, 48, 6, 64496);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(36)), composer, 6);
            String stringResource = StringResources_androidKt.stringResource(R.string.devices_management_detail_preference_name, composer, 6);
            String name = vocabularyDeviceInfo.getName();
            boolean changedInstance = composer.changedInstance(context) | composer.changed(lVar);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: ji.j0
                    @Override // x00.a
                    public final Object invoke() {
                        g2 s11;
                        s11 = k0.s(context, lVar);
                        return s11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            y(new n1(stringResource, name, null, (x00.a) rememberedValue, 4, null), composer, 0);
            y(new n1(StringResources_androidKt.stringResource(R.string.devices_management_detail_preference_sn, composer, 6), vocabularyDeviceInfo.getSerialNumber(), null, null, 12, null), composer, 0);
            y(new n1(StringResources_androidKt.stringResource(R.string.devices_management_detail_preference_version, composer, 6), vocabularyDeviceInfo.getVersion(), null, null, 12, null), composer, 0);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(48)), composer, 6);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.devices_management_detail_btn_remove, composer, 6);
            long q02 = bk.b.q0();
            long r02 = bk.b.r0();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i12 = MaterialTheme.$stable;
            bk.e a11 = bk.f.a(q02, r02, bk.b.C0(materialTheme.getColors(composer, i12)), Color.m2508copywmQWz5c$default(bk.b.I(materialTheme.getColors(composer, i12)), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer, 54, 0);
            CornerBasedShape small = materialTheme.getShapes(composer, i12).getSmall();
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m728paddingVpY3zN4$default(companion, Dp.m5115constructorimpl(f11), 0.0f, 2, null), 0.0f, 1, null);
            boolean changed = composer.changed(aVar);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: ji.y
                    @Override // x00.a
                    public final Object invoke() {
                        g2 u11;
                        u11 = k0.u(x00.a.this);
                        return u11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.baicizhan.platform.base.widget.r.C(fillMaxWidth$default2, (x00.a) rememberedValue2, stringResource2, 0L, null, 0, false, false, small, a11, null, composer, 6, 0, 1272);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [kc.d, kc.h] */
    public static final g2 s(Context context, final x00.l lVar) {
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            mc.a.p(fragmentActivity, new o.a(context).L(R.string.devices_management_detail_dialog_rename_title).R(R.string.devices_management_detail_dialog_rename_hint).T(true).V(10).Q(new x00.l() { // from class: ji.d0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 t11;
                    t11 = k0.t(x00.l.this, (String) obj);
                    return t11;
                }
            }).d(), null, 2, null);
        }
        return g2.f100423a;
    }

    public static final g2 t(x00.l lVar, String it) {
        kotlin.jvm.internal.g0.p(it, "it");
        lVar.invoke(it);
        return g2.f100423a;
    }

    public static final g2 u(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }

    public static final g2 v(VocabularyDeviceInfo vocabularyDeviceInfo, x00.l lVar, x00.a aVar, x00.a aVar2, x00.a aVar3, int i11, Composer composer, int i12) {
        n(vocabularyDeviceInfo, lVar, aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void w(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-498540063);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498540063, i11, -1, "com.baicizhan.main.vld.DeviceInfoPreview (DeviceDetailActivity.kt:313)");
            }
            bk.k.e(null, null, null, f.f64119a.f(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: ji.g0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 x11;
                    x11 = k0.x(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return x11;
                }
            });
        }
    }

    public static final g2 x(int i11, Composer composer, int i12) {
        w(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void y(@m80.k final n1 info, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Modifier.Companion companion;
        kotlin.jvm.internal.g0.p(info, "info");
        Composer startRestartGroup = composer.startRestartGroup(309416798);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changed(info) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(309416798, i12, -1, "com.baicizhan.main.vld.PreferenceItem (DeviceDetailActivity.kt:235)");
            }
            Modifier.Companion companion2 = Modifier.Companion;
            MutableInteractionSource MutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
            boolean z11 = info.i() != null;
            boolean z12 = (i12 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: ji.z
                    @Override // x00.a
                    public final Object invoke() {
                        g2 z13;
                        z13 = k0.z(n1.this);
                        return z13;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(companion2, MutableInteractionSource, null, z11, null, null, (x00.a) rememberedValue, 24, null);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m267clickableO2vRcR0$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f11 = 20;
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(companion2, Dp.m5115constructorimpl(f11), bk.d.c());
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion3.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m727paddingVpY3zN4);
            x00.a<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String j11 = info.j();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i13 = MaterialTheme.$stable;
            TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(startRestartGroup, i13).getBody2(), 0L, 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
            TextOverflow.Companion companion5 = TextOverflow.Companion;
            TextKt.m1845Text4IGK_g(j11, rowScopeInstance.align(companion2, companion3.getCenterVertically()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, m4572copyp1EtxEg$default, startRestartGroup, 0, 3120, 55292);
            float f12 = 12;
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, SizeKt.m780widthInVpY3zN4$default(companion2, Dp.m5115constructorimpl(f12), 0.0f, 2, null), 1.0f, false, 2, null), startRestartGroup, 0);
            TextKt.m1845Text4IGK_g(info.h(), rowScopeInstance.align(companion2, companion3.getCenterVertically()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, materialTheme.getTypography(startRestartGroup, i13).getSubtitle1(), startRestartGroup, 0, 3120, 55292);
            Composer composer3 = startRestartGroup;
            if (info.g().length() > 0) {
                composer3.startReplaceGroup(-1451102370);
                TextKt.m1845Text4IGK_g(info.g(), rowScopeInstance.align(SizeKt.m780widthInVpY3zN4$default(PaddingKt.m730paddingqDBjuR0$default(companion2, Dp.m5115constructorimpl(f12), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m5115constructorimpl(80), 1, null), companion3.getCenterVertically()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer3, i13).getSubtitle1(), materialTheme.getColors(composer3, i13).m1600getPrimary0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer3, 0, 3120, 55292);
                composer3 = composer3;
                composer3.endReplaceGroup();
                companion = companion2;
            } else {
                if (info.i() != null) {
                    composer3.startReplaceGroup(-1450611950);
                    companion = companion2;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_word_plan_arrow_right, composer3, 6), "arrow", rowScopeInstance.align(PaddingKt.m730paddingqDBjuR0$default(companion2, Dp.m5115constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), companion3.getCenterVertically()), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2550tintxETnrds$default(ColorFilter.Companion, bk.b.E(materialTheme.getColors(composer3, i13)), 0, 2, null), composer3, 48, 56);
                    composer3 = composer3;
                } else {
                    companion = companion2;
                    composer3.startReplaceGroup(-1462122994);
                }
                composer3.endReplaceGroup();
            }
            composer3.endNode();
            DividerKt.m1643DivideroMI9zvI(boxScopeInstance.align(PaddingKt.m728paddingVpY3zN4$default(companion, Dp.m5115constructorimpl(f11), 0.0f, 2, null), companion3.getBottomCenter()), Color.m2508copywmQWz5c$default(bk.b.G(materialTheme.getColors(composer3, i13)), 0.24f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0.0f, composer3, 0, 12);
            composer2 = composer3;
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
            endRestartGroup.updateScope(new x00.p() { // from class: ji.a0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 A;
                    A = k0.A(n1.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return A;
                }
            });
        }
    }

    public static final g2 z(n1 n1Var) {
        x00.a<g2> i11 = n1Var.i();
        if (i11 != null) {
            i11.invoke();
        }
        return g2.f100423a;
    }
}
