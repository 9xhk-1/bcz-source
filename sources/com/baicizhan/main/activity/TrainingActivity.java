package com.baicizhan.main.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.activity.TrainingActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import fd.v4;
import fd.x4;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import ma.t;
import q9.x;
import w00.o;
import x00.l;
import x00.p;
import yg.p1;
import yz.c0;
import yz.e0;
import yz.g2;
import zg.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTrainingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingActivity.kt\ncom/baicizhan/main/activity/TrainingActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,612:1\n1247#2,6:613\n1247#2,6:619\n*S KotlinDebug\n*F\n+ 1 TrainingActivity.kt\ncom/baicizhan/main/activity/TrainingActivity\n*L\n89#1:613,6\n91#1:619,6\n*E\n"})
/* loaded from: classes4.dex */
public final class TrainingActivity extends ComposeBaseActivity {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f18233c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f18234d = 8;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f18235b = e0.c(new x00.a() { // from class: fd.l3
        @Override // x00.a
        public final Object invoke() {
            yg.p1 O0;
            O0 = TrainingActivity.O0(TrainingActivity.this);
            return O0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @o
        public final void a(@k Activity activity) {
            g0.p(activity, "activity");
            activity.startActivity(new Intent(activity, (Class<?>) TrainingActivity.class));
        }

        public a() {
        }
    }

    public static final p1 O0(TrainingActivity trainingActivity) {
        return (p1) new ViewModelProvider(trainingActivity).get(p1.class);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 P0(final TrainingActivity trainingActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2059830594, i11, -1, "com.baicizhan.main.activity.TrainingActivity.onCreate.<anonymous> (TrainingActivity.kt:83)");
            }
            State<Pair<String, Integer>> D = trainingActivity.N0().D();
            State<List<x4>> H = trainingActivity.N0().H();
            State<List<fd.o>> F = trainingActivity.N0().F();
            State<List<h>> C = trainingActivity.N0().C();
            boolean changedInstance = composer.changedInstance(trainingActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: fd.m3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Q0;
                        Q0 = TrainingActivity.Q0(TrainingActivity.this);
                        return Q0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.a aVar = (x00.a) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(trainingActivity);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new l() { // from class: fd.n3
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 R0;
                        R0 = TrainingActivity.R0(TrainingActivity.this, (zg.h) obj);
                        return R0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            v4.x0(D, H, F, C, aVar, (l) rememberedValue2, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 Q0(TrainingActivity trainingActivity) {
        trainingActivity.finish();
        return g2.f100423a;
    }

    public static final g2 R0(TrainingActivity trainingActivity, h banner) {
        g0.p(banner, "banner");
        trainingActivity.M0(trainingActivity, banner);
        return g2.f100423a;
    }

    @o
    public static final void S0(@k Activity activity) {
        f18233c.a(activity);
    }

    public final void M0(@k Context context, @k h banner) {
        g0.p(context, "context");
        g0.p(banner, "banner");
        int g11 = banner.g();
        if (g11 == 1) {
            context.startActivity(new Intent(jc.a.f64014a, Uri.parse(banner.j())));
        } else {
            if (g11 == 2) {
                BczWebExecutorKt.startNormalWeb$default(context, banner.j(), null, false, 0, null, 60, null);
                return;
            }
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(banner.j()));
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public final p1 N0() {
        return (p1) this.f18235b.getValue();
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        ma.l.a(t.f73011j, ma.a.f72858v5);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(2059830594, true, new p() { // from class: fd.o3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 P0;
                P0 = TrainingActivity.P0(TrainingActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                return P0;
            }
        }), 1, null);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        p1.v(N0(), this, x.r().l(), null, 4, null);
    }
}
