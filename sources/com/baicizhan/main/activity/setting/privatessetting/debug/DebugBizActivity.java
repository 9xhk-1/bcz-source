package com.baicizhan.main.activity.setting.privatessetting.debug;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.LifecycleOwnerKt;
import com.baicizhan.app.api.AppType;
import com.baicizhan.app.api.LogLevel;
import com.baicizhan.base.ComposeBaseActivity;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nDebugBizActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugBizActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugBizActivity\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,105:1\n113#2:106\n87#3:107\n84#3,9:108\n94#3:159\n79#4,6:117\n86#4,3:132\n89#4,2:141\n93#4:158\n347#5,9:123\n356#5:143\n357#5,2:156\n4206#6,6:135\n1247#7,6:144\n1247#7,6:150\n*S KotlinDebug\n*F\n+ 1 DebugBizActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugBizActivity\n*L\n68#1:106\n65#1:107\n65#1:108,9\n65#1:159\n65#1:117,6\n65#1:132,3\n65#1:141,2\n65#1:158\n65#1:123,9\n65#1:143\n65#1:156,2\n65#1:135,6\n72#1:144,6\n92#1:150,6\n*E\n"})
/* loaded from: classes4.dex */
public final class DebugBizActivity extends ComposeBaseActivity {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f19633c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f19634d = 8;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f19635b = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.j0
        @Override // x00.a
        public final Object invoke() {
            n3.e X0;
            X0 = DebugBizActivity.X0();
            return X0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final void a(@m80.k Context context) {
            kotlin.jvm.internal.g0.p(context, "context");
            context.startActivity(new Intent(context, (Class<?>) DebugBizActivity.class));
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.setting.privatessetting.debug.DebugBizActivity$MainContent$1$1$1$1", f = "DebugBizActivity.kt", i = {0, 0, 0}, l = {75}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-DebugBizActivity$MainContent$1$1$1$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nDebugBizActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugBizActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugBizActivity$MainContent$1$1$1$1\n+ 2 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 3 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,105:1\n10#2:106\n43#3:107\n124#4,4:108\n142#5:112\n*S KotlinDebug\n*F\n+ 1 DebugBizActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugBizActivity$MainContent$1$1$1$1\n*L\n75#1:106\n75#1:107\n75#1:108,4\n75#1:112\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19636a;

        /* renamed from: b, reason: collision with root package name */
        public int f19637b;

        /* renamed from: c, reason: collision with root package name */
        public int f19638c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f19639d;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            b bVar = DebugBizActivity.this.new b(cVar);
            bVar.f19639d = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            c40.r0 r0Var = (c40.r0) this.f19639d;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19638c;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    DebugBizActivity debugBizActivity = DebugBizActivity.this;
                    Result.a aVar = Result.Companion;
                    debugBizActivity.U0();
                    k3.j jVar = (k3.j) ((k3.x2) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(k3.j.class), null, null));
                    this.f19639d = l00.k.a(r0Var);
                    this.f19636a = l00.k.a(r0Var);
                    this.f19637b = 0;
                    this.f19638c = 1;
                    obj = jVar.S0(this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                m6308constructorimpl = Result.m6308constructorimpl((k3.l1) obj);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            if (Result.m6315isSuccessimpl(m6308constructorimpl)) {
                va.g.i("成功 " + ((k3.l1) m6308constructorimpl), 0);
            }
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6308constructorimpl);
            if (m6311exceptionOrNullimpl != null) {
                va.g.j(m6311exceptionOrNullimpl, 0);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements i3.b {
        @Override // i3.b
        public void a(String msg) {
            kotlin.jvm.internal.g0.p(msg, "msg");
            qb.c.i("sdk", msg, new Object[0]);
        }

        @Override // i3.b
        public void d(String msg) {
            kotlin.jvm.internal.g0.p(msg, "msg");
            qb.c.b("sdk", msg, new Object[0]);
        }

        @Override // i3.b
        public void e(String msg) {
            kotlin.jvm.internal.g0.p(msg, "msg");
            qb.c.d("sdk", msg, new Object[0]);
        }
    }

    public static final yz.g2 Q0(DebugBizActivity debugBizActivity) {
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(debugBizActivity), null, null, debugBizActivity.new b(null), 3, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 R0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 S0(DebugBizActivity debugBizActivity, int i11, Composer composer, int i12) {
        debugBizActivity.P0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 V0(final DebugBizActivity debugBizActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2065888963, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugBizActivity.onCreate.<anonymous> (DebugBizActivity.kt:55)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(1789739793, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.m0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 W0;
                    W0 = DebugBizActivity.W0(DebugBizActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                    return W0;
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
    public static final yz.g2 W0(DebugBizActivity debugBizActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1789739793, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugBizActivity.onCreate.<anonymous>.<anonymous> (DebugBizActivity.kt:56)");
            }
            debugBizActivity.P0(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final n3.e X0() {
        return n3.h.e(new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.k0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 Y0;
                Y0 = DebugBizActivity.Y0((n3.a) obj);
                return Y0;
            }
        });
    }

    public static final yz.g2 Y0(n3.a bizSdk) {
        kotlin.jvm.internal.g0.p(bizSdk, "$this$bizSdk");
        bizSdk.n(pb.a.a());
        bizSdk.i(true);
        bizSdk.h(AppType.BCZ);
        bizSdk.j(LogLevel.Debug);
        bizSdk.k(new c());
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void P0(@m80.l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(99948525);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(99948525, i12, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugBizActivity.MainContent (DebugBizActivity.kt:63)");
            }
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m5115constructorimpl(16));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m726padding3ABfNKs);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(this);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.g0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Q0;
                        Q0 = DebugBizActivity.Q0(DebugBizActivity.this);
                        return Q0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            p0.c("TestLoggin", (x00.a) rememberedValue, startRestartGroup, 6);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.h0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 R0;
                        R0 = DebugBizActivity.R0();
                        return R0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            p0.c("Watch", (x00.a) rememberedValue2, startRestartGroup, 54);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.i0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 S0;
                    S0 = DebugBizActivity.S0(DebugBizActivity.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return S0;
                }
            });
        }
    }

    public final n3.e U0() {
        return (n3.e) this.f19635b.getValue();
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-2065888963, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.l0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 V0;
                V0 = DebugBizActivity.V0(DebugBizActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                return V0;
            }
        }), 1, null);
        U0().a();
    }
}
