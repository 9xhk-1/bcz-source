package com.baicizhan.main.activity.setting.privatessetting.debug;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.platform.base.widget.s4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nDebugWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugWebActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugWebActivity\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,90:1\n113#2:91\n113#2:92\n113#2:136\n1247#3,6:93\n1247#3,6:141\n1247#3,6:184\n1247#3,6:190\n70#4:99\n67#4,9:100\n77#4:140\n79#5,6:109\n86#5,3:124\n89#5,2:133\n93#5:139\n79#5,6:157\n86#5,3:172\n89#5,2:181\n93#5:198\n347#6,9:115\n356#6:135\n357#6,2:137\n347#6,9:163\n356#6:183\n357#6,2:196\n4206#7,6:127\n4206#7,6:175\n87#8:147\n84#8,9:148\n94#8:199\n*S KotlinDebug\n*F\n+ 1 DebugWebActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugWebActivity\n*L\n77#1:91\n78#1:92\n85#1:136\n79#1:93,6\n59#1:141,6\n63#1:184,6\n68#1:190,6\n78#1:99\n78#1:100,9\n78#1:140\n78#1:109,6\n78#1:124,3\n78#1:133,2\n78#1:139\n62#1:157,6\n62#1:172,3\n62#1:181,2\n62#1:198\n78#1:115,9\n78#1:135\n78#1:137,2\n62#1:163,9\n62#1:183\n62#1:196,2\n78#1:127,6\n62#1:175,6\n62#1:147\n62#1:148,9\n62#1:199\n*E\n"})
/* loaded from: classes4.dex */
public final class DebugWebActivity extends ComposeBaseActivity {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f19661b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f19662c = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<yz.g2> {
        public a(Object obj) {
            super(0, obj, DebugWebActivity.class, "finish", "finish()V", 0);
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            invoke2();
            return yz.g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((DebugWebActivity) this.receiver).finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final void a(@m80.k Context context) {
            kotlin.jvm.internal.g0.p(context, "context");
            context.startActivity(new Intent(context, (Class<?>) DebugWebActivity.class));
        }

        public b() {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 S0(DebugWebActivity debugWebActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1214105090, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugWebActivity.ActivityContent.<anonymous> (DebugWebActivity.kt:58)");
            }
            boolean changedInstance = composer.changedInstance(debugWebActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(debugWebActivity);
                composer.updateRememberedValue(rememberedValue);
            }
            s4.F(0, null, (x00.a) ((h10.i) rememberedValue), "web调试", null, null, composer, 3072, 51);
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
    public static final yz.g2 T0(final DebugWebActivity debugWebActivity, PaddingValues it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1310428422, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugWebActivity.ActivityContent.<anonymous> (DebugWebActivity.kt:61)");
            }
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(SizeKt.fillMaxHeight(Modifier.Companion, 1.0f), bk.b.L(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable)), null, 2, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m235backgroundbw27NRU$default);
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
            boolean changedInstance = composer.changedInstance(debugWebActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.e3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 U0;
                        U0 = DebugWebActivity.U0(DebugWebActivity.this);
                        return U0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            debugWebActivity.X0("JsBridge接口测试", (x00.a) rememberedValue, composer, 6);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.f3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 V0;
                        V0 = DebugWebActivity.V0();
                        return V0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            debugWebActivity.X0("Url跳转测试", (x00.a) rememberedValue2, composer, 54);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 U0(DebugWebActivity debugWebActivity) {
        BczWebExecutorKt.startNormalWeb$default(debugWebActivity, BczWebExecutorKt.URL_WEB_JS_TEST_LAB, null, false, 0, null, 60, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 V0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 W0(DebugWebActivity debugWebActivity, int i11, Composer composer, int i12) {
        debugWebActivity.R0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 Y0(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z0(DebugWebActivity debugWebActivity, String str, x00.a aVar, int i11, Composer composer, int i12) {
        debugWebActivity.X0(str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 a1(final DebugWebActivity debugWebActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(624208379, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugWebActivity.onCreate.<anonymous> (DebugWebActivity.kt:49)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(184869839, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.d3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 b12;
                    b12 = DebugWebActivity.b1(DebugWebActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                    return b12;
                }
            }, composer, 54), composer, 3072, 7);
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
    public static final yz.g2 b1(DebugWebActivity debugWebActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(184869839, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugWebActivity.onCreate.<anonymous>.<anonymous> (DebugWebActivity.kt:50)");
            }
            debugWebActivity.R0(composer, 0);
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
    public final void R0(@m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-354315115);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-354315115, i12, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugWebActivity.ActivityContent (DebugWebActivity.kt:56)");
            }
            composer2 = startRestartGroup;
            s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(-1214105090, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.j3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 S0;
                    S0 = DebugWebActivity.S0(DebugWebActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                    return S0;
                }
            }, startRestartGroup, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(1310428422, true, new x00.q() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.k3
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 T0;
                    T0 = DebugWebActivity.T0(DebugWebActivity.this, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return T0;
                }
            }, startRestartGroup, 54), composer2, 3072, 12582912, 131063);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.l3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 W0;
                    W0 = DebugWebActivity.W0(DebugWebActivity.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return W0;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void X0(@m80.k final String title, @m80.k final x00.a<yz.g2> click, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(click, "click");
        Composer startRestartGroup = composer.startRestartGroup(1147753305);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changed(title) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(click) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1147753305, i12, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugWebActivity.DebugItemView (DebugWebActivity.kt:75)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 10;
            SpacerKt.Spacer(PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m5115constructorimpl(f11), 7, null), startRestartGroup, 6);
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m726padding3ABfNKs(companion, Dp.m5115constructorimpl(5)), 0.0f, 1, null), Dp.m5115constructorimpl(50)), bk.b.A0(), null, 2, null);
            boolean z11 = (i12 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.g3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Y0;
                        Y0 = DebugWebActivity.Y0(x00.a.this);
                        return Y0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier m269clickableXHw0xAI$default = ClickableKt.m269clickableXHw0xAI$default(m235backgroundbw27NRU$default, false, null, null, (x00.a) rememberedValue, 7, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m269clickableXHw0xAI$default);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(title, PaddingKt.m730paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenterStart()), Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getH6(), composer2, i12 & 14, 0, 65532);
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.h3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Z0;
                    Z0 = DebugWebActivity.Z0(DebugWebActivity.this, title, click, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Z0;
                }
            });
        }
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(624208379, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.i3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 a12;
                a12 = DebugWebActivity.a1(DebugWebActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                return a12;
            }
        }), 1, null);
    }
}
