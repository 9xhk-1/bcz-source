package com.baicizhan.main.activity.setting.privatessetting.debug;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
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
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.webview.MapLearnHelper;
import com.baicizhan.platform.base.widget.s4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nDebugNewGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugNewGuideActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugNewGuideActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,96:1\n1247#2,6:97\n1247#2,6:140\n1247#2,6:146\n1247#2,6:152\n1247#2,6:158\n1247#2,6:164\n1247#2,6:170\n1247#2,6:176\n87#3:103\n84#3,9:104\n94#3:185\n79#4,6:113\n86#4,3:128\n89#4,2:137\n93#4:184\n347#5,9:119\n356#5:139\n357#5,2:182\n4206#6,6:131\n*S KotlinDebug\n*F\n+ 1 DebugNewGuideActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugNewGuideActivity\n*L\n46#1:97,6\n51#1:140,6\n55#1:146,6\n59#1:152,6\n63#1:158,6\n67#1:164,6\n72#1:170,6\n77#1:176,6\n48#1:103\n48#1:104,9\n48#1:185\n48#1:113,6\n48#1:128,3\n48#1:137,2\n48#1:184\n48#1:119,9\n48#1:139\n48#1:182,2\n48#1:131,6\n*E\n"})
/* loaded from: classes4.dex */
public final class DebugNewGuideActivity extends ComposeBaseActivity {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f19645b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f19646c = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final void a(@m80.k Context context) {
            kotlin.jvm.internal.g0.p(context, "context");
            context.startActivity(new Intent(context, (Class<?>) DebugNewGuideActivity.class));
        }

        public a() {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 W0(final DebugNewGuideActivity debugNewGuideActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1021349550, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugNewGuideActivity.MainContent.<anonymous> (DebugNewGuideActivity.kt:45)");
            }
            boolean changedInstance = composer.changedInstance(debugNewGuideActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.z0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 X0;
                        X0 = DebugNewGuideActivity.X0(DebugNewGuideActivity.this);
                        return X0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            s4.F(0, null, (x00.a) rememberedValue, "新手引导测试", null, null, composer, 3072, 51);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 X0(DebugNewGuideActivity debugNewGuideActivity) {
        debugNewGuideActivity.finish();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 Y0(final DebugNewGuideActivity debugNewGuideActivity, PaddingValues it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(658529882, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugNewGuideActivity.MainContent.<anonymous> (DebugNewGuideActivity.kt:47)");
            }
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(BackgroundKt.m235backgroundbw27NRU$default(Modifier.Companion, bk.b.K(), null, 2, null), 0.0f, 1, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxHeight$default);
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
            boolean changedInstance = composer.changedInstance(debugNewGuideActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.d1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Z0;
                        Z0 = DebugNewGuideActivity.Z0(DebugNewGuideActivity.this);
                        return Z0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            p0.c("重置\"新版分享打卡\"新手引导", (x00.a) rememberedValue, composer, 6);
            boolean changedInstance2 = composer.changedInstance(debugNewGuideActivity);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.e1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 a12;
                        a12 = DebugNewGuideActivity.a1(DebugNewGuideActivity.this);
                        return a12;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            p0.c("重置\"单词本\"新手引导", (x00.a) rememberedValue2, composer, 6);
            boolean changedInstance3 = composer.changedInstance(debugNewGuideActivity);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.f1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 b12;
                        b12 = DebugNewGuideActivity.b1(DebugNewGuideActivity.this);
                        return b12;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            p0.c("重置\"记忆模式\"新手引导", (x00.a) rememberedValue3, composer, 6);
            boolean changedInstance4 = composer.changedInstance(debugNewGuideActivity);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.g1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 c12;
                        c12 = DebugNewGuideActivity.c1(DebugNewGuideActivity.this);
                        return c12;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            p0.c("重置\"拍照查词\"tip", (x00.a) rememberedValue4, composer, 6);
            boolean changedInstance5 = composer.changedInstance(debugNewGuideActivity);
            Object rememberedValue5 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.h1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 d12;
                        d12 = DebugNewGuideActivity.d1(DebugNewGuideActivity.this);
                        return d12;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            p0.c("重置\"一键收藏\"tip", (x00.a) rememberedValue5, composer, 6);
            boolean changedInstance6 = composer.changedInstance(debugNewGuideActivity);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance6 || rememberedValue6 == Composer.Companion.getEmpty()) {
                rememberedValue6 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.i1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 e12;
                        e12 = DebugNewGuideActivity.e1(DebugNewGuideActivity.this);
                        return e12;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            p0.c("重置\"单词地图\"tip", (x00.a) rememberedValue6, composer, 6);
            boolean changedInstance7 = composer.changedInstance(debugNewGuideActivity);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance7 || rememberedValue7 == Composer.Companion.getEmpty()) {
                rememberedValue7 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.j1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 f12;
                        f12 = DebugNewGuideActivity.f1(DebugNewGuideActivity.this);
                        return f12;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            p0.c("重置\"年级更新提醒\"tip", (x00.a) rememberedValue7, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z0(DebugNewGuideActivity debugNewGuideActivity) {
        jg.d.f(pd.h.f80365b);
        debugNewGuideActivity.j1();
        return yz.g2.f100423a;
    }

    public static final yz.g2 a1(DebugNewGuideActivity debugNewGuideActivity) {
        jg.d.f(jg.d.f64079c);
        debugNewGuideActivity.j1();
        return yz.g2.f100423a;
    }

    public static final yz.g2 b1(DebugNewGuideActivity debugNewGuideActivity) {
        i9.f.j(KotlinExtKt.getGlobalApplicationContext(), i9.f.f60403z, false);
        debugNewGuideActivity.j1();
        return yz.g2.f100423a;
    }

    public static final yz.g2 c1(DebugNewGuideActivity debugNewGuideActivity) {
        KotlinExtKt.setKvFlagTrue(i9.f.D, false);
        debugNewGuideActivity.j1();
        return yz.g2.f100423a;
    }

    public static final yz.g2 d1(DebugNewGuideActivity debugNewGuideActivity) {
        KotlinExtKt.setKvFlagTrue(i9.f.B, false);
        debugNewGuideActivity.j1();
        return yz.g2.f100423a;
    }

    public static final yz.g2 e1(DebugNewGuideActivity debugNewGuideActivity) {
        KotlinExtKt.setKvFlagTrue(MapLearnHelper.INSTANCE.getKEY_HAS_SHOW_MAP_TIP(), false);
        debugNewGuideActivity.j1();
        return yz.g2.f100423a;
    }

    public static final yz.g2 f1(DebugNewGuideActivity debugNewGuideActivity) {
        i9.f.k(debugNewGuideActivity, i9.f.f60387n0, -1);
        debugNewGuideActivity.j1();
        return yz.g2.f100423a;
    }

    public static final yz.g2 g1(DebugNewGuideActivity debugNewGuideActivity, int i11, Composer composer, int i12) {
        debugNewGuideActivity.V0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 h1(final DebugNewGuideActivity debugNewGuideActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1918448647, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugNewGuideActivity.onCreate.<anonymous> (DebugNewGuideActivity.kt:36)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-1465398067, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.y0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 i12;
                    i12 = DebugNewGuideActivity.i1(DebugNewGuideActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                    return i12;
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
    public static final yz.g2 i1(DebugNewGuideActivity debugNewGuideActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1465398067, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugNewGuideActivity.onCreate.<anonymous>.<anonymous> (DebugNewGuideActivity.kt:37)");
            }
            debugNewGuideActivity.V0(composer, 0);
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
    public final void V0(@m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1874869929);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1874869929, i12, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugNewGuideActivity.MainContent (DebugNewGuideActivity.kt:43)");
            }
            composer2 = startRestartGroup;
            s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(-1021349550, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.x0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 W0;
                    W0 = DebugNewGuideActivity.W0(DebugNewGuideActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                    return W0;
                }
            }, startRestartGroup, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(658529882, true, new x00.q() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.b1
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 Y0;
                    Y0 = DebugNewGuideActivity.Y0(DebugNewGuideActivity.this, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return Y0;
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.c1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 g12;
                    g12 = DebugNewGuideActivity.g1(DebugNewGuideActivity.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return g12;
                }
            });
        }
    }

    public final void j1() {
        KotlinExtKt.showToast("重置成功");
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1918448647, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.a1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 h12;
                h12 = DebugNewGuideActivity.h1(DebugNewGuideActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                return h12;
            }
        }), 1, null);
    }
}
