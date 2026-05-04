package com.baicizhan.main.activity.setting.privatessetting.debug;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nAdCacheDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdCacheDetailActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/AdCacheDetailActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,298:1\n1247#2,6:299\n*S KotlinDebug\n*F\n+ 1 AdCacheDetailActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/AdCacheDetailActivity\n*L\n40#1:299,6\n*E\n"})
/* loaded from: classes4.dex */
public final class AdCacheDetailActivity extends ComponentActivity {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f19594a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f19595b = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final void a(@m80.k Context context) {
            kotlin.jvm.internal.g0.p(context, "context");
            context.startActivity(new Intent(context, (Class<?>) AdCacheDetailActivity.class));
        }

        public a() {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 C0(final AdCacheDetailActivity adCacheDetailActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(360360153, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivity.onCreate.<anonymous> (AdCacheDetailActivity.kt:38)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(-283372667, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.c
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 D0;
                    D0 = AdCacheDetailActivity.D0(AdCacheDetailActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                    return D0;
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
    public static final yz.g2 D0(final AdCacheDetailActivity adCacheDetailActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-283372667, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivity.onCreate.<anonymous>.<anonymous> (AdCacheDetailActivity.kt:39)");
            }
            boolean changedInstance = composer.changedInstance(adCacheDetailActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.b
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 E0;
                        E0 = AdCacheDetailActivity.E0(AdCacheDetailActivity.this);
                        return E0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            AdCacheDetailActivityKt.m(null, (x00.a) rememberedValue, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 E0(AdCacheDetailActivity adCacheDetailActivity) {
        adCacheDetailActivity.finish();
        return yz.g2.f100423a;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(360360153, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.a
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 C0;
                C0 = AdCacheDetailActivity.C0(AdCacheDetailActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                return C0;
            }
        }), 1, null);
    }
}
