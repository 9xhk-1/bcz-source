package com.baicizhan.main.activity.daka.imagedaka.imagedakav2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.activity.daka.imagedaka.imagedakav2.BonusActivityDialog;
import com.baicizhan.main.activity.daka.imagedaka.imagedakav2.BonusUiData;
import com.baicizhan.online.user_study_api.DakaShareBonusResult;
import gs.k6;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import ma.l;
import ma.t;
import qu.b;
import sd.n;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBonusActivityDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BonusActivityDialog.kt\ncom/baicizhan/main/activity/daka/imagedaka/imagedakav2/BonusActivityDialog\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,258:1\n1247#2,6:259\n1247#2,6:265\n*S KotlinDebug\n*F\n+ 1 BonusActivityDialog.kt\ncom/baicizhan/main/activity/daka/imagedaka/imagedakav2/BonusActivityDialog\n*L\n61#1:259,6\n69#1:265,6\n*E\n"})
@b
/* loaded from: classes4.dex */
public final class BonusActivityDialog extends Hilt_BonusActivityDialog {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f18390f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f18391g = 8;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f18392h = "bonus";

    /* renamed from: e, reason: collision with root package name */
    public k6 f18393e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final void a(@k Context context, @k DakaShareBonusResult result) {
            g0.p(context, "context");
            g0.p(result, "result");
            if (result.shareSuccess == null) {
                return;
            }
            String shareSuccess = result.shareSuccess;
            g0.o(shareSuccess, "shareSuccess");
            String str = result.extraTip;
            String str2 = result.actionUrl;
            String action = result.action;
            g0.o(action, "action");
            BonusUiData bonusUiData = new BonusUiData(shareSuccess, str, str2, action);
            context.startActivity(new Intent(context, (Class<?>) BonusActivityDialog.class).putExtra(BonusActivityDialog.f18392h, bonusUiData));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(ma.b.E1, bonusUiData.h());
            g2 g2Var = g2.f100423a;
            l.e(t.f73023v, ma.a.f72823q5, linkedHashMap);
        }

        public a() {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 O0(final BonusUiData bonusUiData, final BonusActivityDialog bonusActivityDialog, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-140215733, i11, -1, "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.BonusActivityDialog.onCreate.<anonymous>.<anonymous> (BonusActivityDialog.kt:60)");
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: sd.a
                    @Override // x00.a
                    public final Object invoke() {
                        g2 P0;
                        P0 = BonusActivityDialog.P0(BonusActivityDialog.this);
                        return P0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.a aVar = (x00.a) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: sd.b
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 Q0;
                        Q0 = BonusActivityDialog.Q0(BonusActivityDialog.this, bonusUiData, (String) obj);
                        return Q0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            n.m(bonusUiData, aVar, (x00.l) rememberedValue2, composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 P0(BonusActivityDialog bonusActivityDialog) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ma.b.E1, "close");
        g2 g2Var = g2.f100423a;
        l.e(t.f73023v, ma.a.f72830r5, linkedHashMap);
        bonusActivityDialog.finish();
        return g2Var;
    }

    public static final g2 Q0(BonusActivityDialog bonusActivityDialog, BonusUiData bonusUiData, String str) {
        BonusActivityDialog bonusActivityDialog2;
        if (str != null) {
            bonusActivityDialog2 = bonusActivityDialog;
            BczWebExecutorKt.startNormalWeb$default(bonusActivityDialog2, str, null, false, 0, null, 60, null);
        } else {
            bonusActivityDialog2 = bonusActivityDialog;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ma.b.E1, bonusUiData.h());
        g2 g2Var = g2.f100423a;
        l.e(t.f73023v, ma.a.f72830r5, linkedHashMap);
        bonusActivityDialog2.finish();
        return g2Var;
    }

    @k
    public final k6 M0() {
        k6 k6Var = this.f18393e;
        if (k6Var != null) {
            return k6Var;
        }
        g0.S("binding");
        return null;
    }

    public final void N0() {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.systemBars());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
    }

    public final void R0(@k k6 k6Var) {
        g0.p(k6Var, "<set-?>");
        this.f18393e = k6Var;
    }

    @Override // com.baicizhan.main.activity.daka.imagedaka.imagedakav2.Hilt_BonusActivityDialog, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        final BonusUiData bonusUiData;
        super.onCreate(bundle);
        N0();
        Bundle extras = getIntent().getExtras();
        if (extras == null || (bonusUiData = (BonusUiData) extras.getParcelable(f18392h)) == null) {
            finish();
        } else {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-140215733, true, new p() { // from class: sd.c
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 O0;
                    O0 = BonusActivityDialog.O0(BonusUiData.this, this, (Composer) obj, ((Integer) obj2).intValue());
                    return O0;
                }
            }), 1, null);
        }
    }
}
