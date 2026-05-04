package com.baicizhan.main.activity.setting.privatessetting.debug;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.ContextCompat;
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.platform.base.widget.s4;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nDebugWatchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugWatchActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugWatchActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,148:1\n1247#2,6:149\n1247#2,6:192\n1247#2,6:198\n1247#2,6:204\n1247#2,6:210\n1247#2,6:216\n87#3:155\n84#3,9:156\n94#3:226\n79#4,6:165\n86#4,3:180\n89#4,2:189\n93#4:225\n347#5,9:171\n356#5:191\n357#5,2:223\n4206#6,6:183\n113#7:222\n85#8:227\n113#8,2:228\n*S KotlinDebug\n*F\n+ 1 DebugWatchActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugWatchActivity\n*L\n72#1:149,6\n79#1:192,6\n88#1:198,6\n97#1:204,6\n107#1:210,6\n110#1:216,6\n74#1:155\n74#1:156,9\n74#1:226\n74#1:165,6\n74#1:180,3\n74#1:189,2\n74#1:225\n74#1:171,9\n74#1:191\n74#1:223,2\n74#1:183,6\n115#1:222\n107#1:227\n107#1:228,2\n*E\n"})
/* loaded from: classes4.dex */
public final class DebugWatchActivity extends ComposeBaseActivity {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f19656d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f19657e = 8;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final BroadcastReceiver f19658b = new BroadcastReceiver() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.DebugWatchActivity$receiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            qb.c.i("DebugWatchActivity", "ACTION onReceive", new Object[0]);
            MutableState<String> d12 = DebugWatchActivity.this.d1();
            String stringExtra = intent != null ? intent.getStringExtra("result") : null;
            d12.setValue("from br: " + stringExtra + ((Object) DebugWatchActivity.this.d1().getValue()));
        }
    };

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableState<String> f19659c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final void a(@m80.k Context context) {
            kotlin.jvm.internal.g0.p(context, "context");
            context.startActivity(new Intent(context, (Class<?>) DebugWatchActivity.class));
        }

        public a() {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 T0(final DebugWatchActivity debugWatchActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(65196126, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugWatchActivity.MainContent.<anonymous> (DebugWatchActivity.kt:71)");
            }
            boolean changedInstance = composer.changedInstance(debugWatchActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.c3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 U0;
                        U0 = DebugWatchActivity.U0(DebugWatchActivity.this);
                        return U0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            s4.F(0, null, (x00.a) rememberedValue, "测试手表", null, null, composer, 3072, 51);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 U0(DebugWatchActivity debugWatchActivity) {
        debugWatchActivity.finish();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 V0(final DebugWatchActivity debugWatchActivity, PaddingValues it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1705237658, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugWatchActivity.MainContent.<anonymous> (DebugWatchActivity.kt:73)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(BackgroundKt.m235backgroundbw27NRU$default(companion, bk.b.K(), null, 2, null), 0.0f, 1, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxHeight$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            boolean changedInstance = composer.changedInstance(debugWatchActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.x2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 W0;
                        W0 = DebugWatchActivity.W0(DebugWatchActivity.this);
                        return W0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            p0.c("跳 home", (x00.a) rememberedValue, composer, 6);
            boolean changedInstance2 = composer.changedInstance(debugWatchActivity);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.y2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 X0;
                        X0 = DebugWatchActivity.X0(DebugWatchActivity.this);
                        return X0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            p0.c("跳 selectBook", (x00.a) rememberedValue2, composer, 6);
            boolean changedInstance3 = composer.changedInstance(debugWatchActivity);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.z2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Y0;
                        Y0 = DebugWatchActivity.Y0(DebugWatchActivity.this);
                        return Y0;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            p0.c("跳 Learning", (x00.a) rememberedValue3, composer, 6);
            Object rememberedValue4 = composer.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue4 == companion3.getEmpty()) {
                rememberedValue4 = debugWatchActivity.f19659c;
                composer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState = (MutableState) rememberedValue4;
            boolean changedInstance4 = composer.changedInstance(debugWatchActivity);
            Object rememberedValue5 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue5 == companion3.getEmpty()) {
                rememberedValue5 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.a3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 b12;
                        b12 = DebugWatchActivity.b1(DebugWatchActivity.this);
                        return b12;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            p0.c("获取数据", (x00.a) rememberedValue5, composer, 6);
            float f11 = 16;
            TextKt.m1845Text4IGK_g(Z0(mutableState), PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), 0.0f, 8, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 0, 0, 131068);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 W0(DebugWatchActivity debugWatchActivity) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("bcz://com.baicizhan.watch/launch?page=home"));
        intent.setFlags(268435456);
        try {
            debugWatchActivity.startActivity(intent);
        } catch (Exception e11) {
            qb.c.c("", "", e11);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 X0(DebugWatchActivity debugWatchActivity) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("bcz://com.baicizhan.watch/launch?page=selectBook"));
        intent.setFlags(268435456);
        try {
            debugWatchActivity.startActivity(intent);
        } catch (Exception e11) {
            qb.c.c("", "", e11);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 Y0(DebugWatchActivity debugWatchActivity) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("bcz://com.baicizhan.watch/launch?page=selfTest"));
        intent.setFlags(268435456);
        try {
            debugWatchActivity.startActivity(intent);
        } catch (Exception e11) {
            qb.c.c("", "", e11);
        }
        return yz.g2.f100423a;
    }

    public static final String Z0(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final void a1(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }

    public static final yz.g2 b1(DebugWatchActivity debugWatchActivity) {
        debugWatchActivity.f19659c.setValue(debugWatchActivity.h1() + " \n " + ((Object) debugWatchActivity.f19659c.getValue()));
        return yz.g2.f100423a;
    }

    public static final yz.g2 c1(DebugWatchActivity debugWatchActivity, int i11, Composer composer, int i12) {
        debugWatchActivity.S0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 f1(final DebugWatchActivity debugWatchActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(856749125, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugWatchActivity.onCreate.<anonymous> (DebugWatchActivity.kt:49)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-540531687, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.t2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 g12;
                    g12 = DebugWatchActivity.g1(DebugWatchActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                    return g12;
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
    public static final yz.g2 g1(DebugWatchActivity debugWatchActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-540531687, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugWatchActivity.onCreate.<anonymous>.<anonymous> (DebugWatchActivity.kt:50)");
            }
            debugWatchActivity.S0(composer, 0);
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
    public final void S0(@m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(924986101);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(924986101, i12, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugWatchActivity.MainContent (DebugWatchActivity.kt:69)");
            }
            composer2 = startRestartGroup;
            s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(65196126, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.u2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 T0;
                    T0 = DebugWatchActivity.T0(DebugWatchActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                    return T0;
                }
            }, startRestartGroup, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1705237658, true, new x00.q() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.v2
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 V0;
                    V0 = DebugWatchActivity.V0(DebugWatchActivity.this, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return V0;
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.w2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 c12;
                    c12 = DebugWatchActivity.c1(DebugWatchActivity.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return c12;
                }
            });
        }
    }

    @m80.k
    public final MutableState<String> d1() {
        return this.f19659c;
    }

    @m80.k
    public final BroadcastReceiver e1() {
        return this.f19658b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h1() {
        /*
            r10 = this;
            java.lang.String r1 = ""
            android.app.Application r0 = r10.getApplication()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r2 = "content://com.baicizhan.watch.provider/studyInfo"
            android.net.Uri r4 = android.net.Uri.parse(r2)
            android.content.ContentProviderClient r3 = r0.acquireUnstableContentProviderClient(r4)     // Catch: java.lang.Exception -> L36
            kotlin.jvm.internal.g0.m(r3)     // Catch: java.lang.Throwable -> L2d
            r8 = 0
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L30
            r0.moveToNext()     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            java.lang.String r0 = r0.getString(r2)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L31
            goto L30
        L2d:
            r0 = move-exception
            r2 = r0
            goto L38
        L30:
            r0 = r1
        L31:
            r2 = 0
            u00.a.c(r3, r2)     // Catch: java.lang.Exception -> L36
            return r0
        L36:
            r0 = move-exception
            goto L3e
        L38:
            throw r2     // Catch: java.lang.Throwable -> L39
        L39:
            r0 = move-exception
            u00.a.c(r3, r2)     // Catch: java.lang.Exception -> L36
            throw r0     // Catch: java.lang.Exception -> L36
        L3e:
            java.lang.String r2 = "MyTabViewModel"
            qb.c.c(r2, r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.setting.privatessetting.debug.DebugWatchActivity.h1():java.lang.String");
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(856749125, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.b3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 f12;
                f12 = DebugWatchActivity.f1(DebugWatchActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                return f12;
            }
        }), 1, null);
        ContextCompat.registerReceiver(this, this.f19658b, new IntentFilter("com.baicizhan.watch.STUDY_INFO_CHANGE"), 4);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f19658b);
        super.onDestroy();
    }
}
