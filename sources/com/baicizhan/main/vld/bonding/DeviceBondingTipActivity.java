package com.baicizhan.main.vld.bonding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.base.ComposeBaseActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nDeviceBondingTipActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceBondingTipActivity.kt\ncom/baicizhan/main/vld/bonding/DeviceBondingTipActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,223:1\n1247#2,6:224\n1247#2,6:230\n1247#2,6:236\n*S KotlinDebug\n*F\n+ 1 DeviceBondingTipActivity.kt\ncom/baicizhan/main/vld/bonding/DeviceBondingTipActivity\n*L\n43#1:224,6\n49#1:230,6\n53#1:236,6\n*E\n"})
/* loaded from: classes4.dex */
public final class DeviceBondingTipActivity extends ComposeBaseActivity {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f25258b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f25259c = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final Intent a(@m80.k Context context, @m80.k String url) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(url, "url");
            Intent intent = new Intent(context, (Class<?>) DeviceBondingTipActivity.class);
            intent.putExtra(DeviceBondingActivityKt.f25226a, url);
            return intent;
        }

        public a() {
        }
    }

    @w00.o
    @m80.k
    public static final Intent M0(@m80.k Context context, @m80.k String str) {
        return f25258b.a(context, str);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 N0(final DeviceBondingTipActivity deviceBondingTipActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(146370536, i11, -1, "com.baicizhan.main.vld.bonding.DeviceBondingTipActivity.onCreate.<anonymous> (DeviceBondingTipActivity.kt:42)");
            }
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            boolean changedInstance = composer.changedInstance(deviceBondingTipActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.vld.bonding.a2
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 O0;
                        O0 = DeviceBondingTipActivity.O0(DeviceBondingTipActivity.this, (ActivityResult) obj);
                        return O0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (x00.l) rememberedValue, composer, 0);
            boolean changedInstance2 = composer.changedInstance(rememberLauncherForActivityResult) | composer.changedInstance(deviceBondingTipActivity);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.vld.bonding.b2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 P0;
                        P0 = DeviceBondingTipActivity.P0(ManagedActivityResultLauncher.this, deviceBondingTipActivity);
                        return P0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.a aVar = (x00.a) rememberedValue2;
            boolean changedInstance3 = composer.changedInstance(deviceBondingTipActivity);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.vld.bonding.c2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Q0;
                        Q0 = DeviceBondingTipActivity.Q0(DeviceBondingTipActivity.this);
                        return Q0;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            r2.x(aVar, (x00.a) rememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 O0(DeviceBondingTipActivity deviceBondingTipActivity, ActivityResult it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (it.getResultCode() == -1) {
            deviceBondingTipActivity.setResult(-1, it.getData());
            deviceBondingTipActivity.finish();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 P0(ManagedActivityResultLauncher managedActivityResultLauncher, DeviceBondingTipActivity deviceBondingTipActivity) {
        Intent intent = new Intent(deviceBondingTipActivity, (Class<?>) DeviceBondingActivity.class);
        intent.putExtra(DeviceBondingActivityKt.f25226a, deviceBondingTipActivity.getIntent().getStringExtra(DeviceBondingActivityKt.f25226a));
        managedActivityResultLauncher.launch(intent);
        return yz.g2.f100423a;
    }

    public static final yz.g2 Q0(DeviceBondingTipActivity deviceBondingTipActivity) {
        deviceBondingTipActivity.finish();
        return yz.g2.f100423a;
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(146370536, true, new x00.p() { // from class: com.baicizhan.main.vld.bonding.d2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 N0;
                N0 = DeviceBondingTipActivity.N0(DeviceBondingTipActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                return N0;
            }
        }), 1, null);
    }
}
