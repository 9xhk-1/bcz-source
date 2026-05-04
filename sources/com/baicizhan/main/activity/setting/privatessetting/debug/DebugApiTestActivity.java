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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.LifecycleOwnerKt;
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.platform.base.widget.s4;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nDebugApiTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugApiTestActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugApiTestActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,147:1\n1247#2,6:148\n1247#2,6:191\n1247#2,6:197\n1247#2,6:203\n87#3:154\n84#3,9:155\n94#3:212\n79#4,6:164\n86#4,3:179\n89#4,2:188\n93#4:211\n347#5,9:170\n356#5:190\n357#5,2:209\n4206#6,6:182\n*S KotlinDebug\n*F\n+ 1 DebugApiTestActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugApiTestActivity\n*L\n33#1:148,6\n40#1:191,6\n54#1:197,6\n121#1:203,6\n35#1:154\n35#1:155,9\n35#1:212\n35#1:164,6\n35#1:179,3\n35#1:188,2\n35#1:211\n35#1:170,9\n35#1:190\n35#1:209,2\n35#1:182,6\n*E\n"})
/* loaded from: classes4.dex */
public final class DebugApiTestActivity extends ComposeBaseActivity {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f19616b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f19617c = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final void a(@m80.k Context context) {
            kotlin.jvm.internal.g0.p(context, "context");
            context.startActivity(new Intent(context, (Class<?>) DebugApiTestActivity.class));
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.setting.privatessetting.debug.DebugApiTestActivity$onCreate$1$1$2$1$1$1$1", f = "DebugApiTestActivity.kt", i = {0, 0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-DebugApiTestActivity$onCreate$1$1$2$1$1$1$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nDebugApiTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugApiTestActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugApiTestActivity$onCreate$1$1$2$1$1$1$1\n+ 2 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 3 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,147:1\n10#2:148\n43#3:149\n124#4,4:150\n142#5:154\n*S KotlinDebug\n*F\n+ 1 DebugApiTestActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugApiTestActivity$onCreate$1$1$2$1$1$1$1\n*L\n44#1:148\n44#1:149\n44#1:150,4\n44#1:154\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19618a;

        /* renamed from: b, reason: collision with root package name */
        public int f19619b;

        /* renamed from: c, reason: collision with root package name */
        public int f19620c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f19621d;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            b bVar = DebugApiTestActivity.this.new b(cVar);
            bVar.f19621d = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            c40.r0 r0Var = (c40.r0) this.f19621d;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19620c;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    DebugApiTestActivity debugApiTestActivity = DebugApiTestActivity.this;
                    Result.a aVar = Result.Companion;
                    dd.h.g(debugApiTestActivity);
                    k3.j3 j3Var = (k3.j3) ((k3.x2) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(k3.j3.class), null, null));
                    this.f19621d = l00.k.a(r0Var);
                    this.f19618a = l00.k.a(r0Var);
                    this.f19619b = 0;
                    this.f19620c = 1;
                    obj = j3Var.i1(533, 3949, this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                m6308constructorimpl = Result.m6308constructorimpl((l3.i0) obj);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            if (Result.m6315isSuccessimpl(m6308constructorimpl)) {
                va.g.i("获取成功: " + ((l3.i0) m6308constructorimpl), 0);
            }
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6308constructorimpl);
            if (m6311exceptionOrNullimpl != null) {
                va.g.i("获取失败: " + m6311exceptionOrNullimpl.getMessage(), 0);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.setting.privatessetting.debug.DebugApiTestActivity$onCreate$1$1$2$1$2$1$1", f = "DebugApiTestActivity.kt", i = {0, 0, 0}, l = {58}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-DebugApiTestActivity$onCreate$1$1$2$1$2$1$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nDebugApiTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugApiTestActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugApiTestActivity$onCreate$1$1$2$1$2$1$1\n+ 2 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 3 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,147:1\n10#2:148\n43#3:149\n124#4,4:150\n142#5:154\n*S KotlinDebug\n*F\n+ 1 DebugApiTestActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugApiTestActivity$onCreate$1$1$2$1$2$1$1\n*L\n58#1:148\n58#1:149\n58#1:150,4\n58#1:154\n*E\n"})
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19623a;

        /* renamed from: b, reason: collision with root package name */
        public int f19624b;

        /* renamed from: c, reason: collision with root package name */
        public int f19625c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f19626d;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = DebugApiTestActivity.this.new c(cVar);
            cVar2.f19626d = obj;
            return cVar2;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            c40.r0 r0Var = (c40.r0) this.f19626d;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19625c;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    DebugApiTestActivity debugApiTestActivity = DebugApiTestActivity.this;
                    Result.a aVar = Result.Companion;
                    dd.h.g(debugApiTestActivity);
                    k3.j3 j3Var = (k3.j3) ((k3.x2) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(k3.j3.class), null, null));
                    List<Integer> Q = a00.h0.Q(l00.a.f(3949), l00.a.f(16618), l00.a.f(6134), l00.a.f(3863), l00.a.f(9896), l00.a.f(6225), l00.a.f(9307));
                    this.f19626d = l00.k.a(r0Var);
                    this.f19623a = l00.k.a(r0Var);
                    this.f19624b = 0;
                    this.f19625c = 1;
                    obj = j3Var.M0(533, Q, this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                m6308constructorimpl = Result.m6308constructorimpl((List) obj);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            if (Result.m6315isSuccessimpl(m6308constructorimpl)) {
                va.g.i("获取成功: " + ((List) m6308constructorimpl), 0);
            }
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6308constructorimpl);
            if (m6311exceptionOrNullimpl != null) {
                va.g.i("获取失败: " + m6311exceptionOrNullimpl.getMessage(), 0);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.setting.privatessetting.debug.DebugApiTestActivity$onCreate$1$1$2$1$3$1$1", f = "DebugApiTestActivity.kt", i = {0, 0, 0}, l = {125}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-DebugApiTestActivity$onCreate$1$1$2$1$3$1$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nDebugApiTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugApiTestActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugApiTestActivity$onCreate$1$1$2$1$3$1$1\n+ 2 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 3 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,147:1\n10#2:148\n43#3:149\n124#4,4:150\n142#5:154\n*S KotlinDebug\n*F\n+ 1 DebugApiTestActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugApiTestActivity$onCreate$1$1$2$1$3$1$1\n*L\n125#1:148\n125#1:149\n125#1:150,4\n125#1:154\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19628a;

        /* renamed from: b, reason: collision with root package name */
        public int f19629b;

        /* renamed from: c, reason: collision with root package name */
        public int f19630c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f19631d;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            d dVar = DebugApiTestActivity.this.new d(cVar);
            dVar.f19631d = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            c40.r0 r0Var = (c40.r0) this.f19631d;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19630c;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    DebugApiTestActivity debugApiTestActivity = DebugApiTestActivity.this;
                    Result.a aVar = Result.Companion;
                    dd.h.g(debugApiTestActivity);
                    k3.j3 j3Var = (k3.j3) ((k3.x2) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(k3.j3.class), null, null));
                    this.f19631d = l00.k.a(r0Var);
                    this.f19628a = l00.k.a(r0Var);
                    this.f19629b = 0;
                    this.f19630c = 1;
                    obj = j3Var.m0(1154360, this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                m6308constructorimpl = Result.m6308constructorimpl((l3.y2) obj);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            if (Result.m6315isSuccessimpl(m6308constructorimpl)) {
                va.g.i("获取成功: " + ((l3.y2) m6308constructorimpl), 0);
            }
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6308constructorimpl);
            if (m6311exceptionOrNullimpl != null) {
                va.g.i("获取失败: " + m6311exceptionOrNullimpl.getMessage(), 0);
            }
            return yz.g2.f100423a;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 Q0(final DebugApiTestActivity debugApiTestActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-108904309, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugApiTestActivity.onCreate.<anonymous> (DebugApiTestActivity.kt:30)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(347432543, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.f0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 R0;
                    R0 = DebugApiTestActivity.R0(DebugApiTestActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                    return R0;
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
    public static final yz.g2 R0(final DebugApiTestActivity debugApiTestActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(347432543, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugApiTestActivity.onCreate.<anonymous>.<anonymous> (DebugApiTestActivity.kt:31)");
            }
            s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(1795365846, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.d0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 S0;
                    S0 = DebugApiTestActivity.S0(DebugApiTestActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                    return S0;
                }
            }, composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1522161714, true, new x00.q() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.e0
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 U0;
                    U0 = DebugApiTestActivity.U0(DebugApiTestActivity.this, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return U0;
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
    public static final yz.g2 S0(final DebugApiTestActivity debugApiTestActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1795365846, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugApiTestActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DebugApiTestActivity.kt:32)");
            }
            boolean changedInstance = composer.changedInstance(debugApiTestActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.c0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 T0;
                        T0 = DebugApiTestActivity.T0(DebugApiTestActivity.this);
                        return T0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            s4.F(0, null, (x00.a) rememberedValue, "接口测试", null, null, composer, 3072, 51);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 T0(DebugApiTestActivity debugApiTestActivity) {
        debugApiTestActivity.finish();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 U0(final DebugApiTestActivity debugApiTestActivity, PaddingValues it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1522161714, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugApiTestActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DebugApiTestActivity.kt:34)");
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
            boolean changedInstance = composer.changedInstance(debugApiTestActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.y
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 V0;
                        V0 = DebugApiTestActivity.V0(DebugApiTestActivity.this);
                        return V0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            p0.c("获取资源", (x00.a) rememberedValue, composer, 6);
            boolean changedInstance2 = composer.changedInstance(debugApiTestActivity);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.z
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 W0;
                        W0 = DebugApiTestActivity.W0(DebugApiTestActivity.this);
                        return W0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            p0.c("获取多个资源", (x00.a) rememberedValue2, composer, 6);
            boolean changedInstance3 = composer.changedInstance(debugApiTestActivity);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.a0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 X0;
                        X0 = DebugApiTestActivity.X0(DebugApiTestActivity.this);
                        return X0;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            p0.c("获取查词资源", (x00.a) rememberedValue3, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 V0(DebugApiTestActivity debugApiTestActivity) {
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(debugApiTestActivity), null, null, debugApiTestActivity.new b(null), 3, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 W0(DebugApiTestActivity debugApiTestActivity) {
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(debugApiTestActivity), null, null, debugApiTestActivity.new c(null), 3, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 X0(DebugApiTestActivity debugApiTestActivity) {
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(debugApiTestActivity), null, null, debugApiTestActivity.new d(null), 3, null);
        return yz.g2.f100423a;
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-108904309, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.b0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 Q0;
                Q0 = DebugApiTestActivity.Q0(DebugApiTestActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                return Q0;
            }
        }), 1, null);
    }
}
