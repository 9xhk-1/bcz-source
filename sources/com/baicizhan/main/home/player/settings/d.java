package com.baicizhan.main.home.player.settings;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\ncom/baicizhan/main/home/player/settings/ComposableSingletons$SettingsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,186:1\n1247#2,6:187\n*S KotlinDebug\n*F\n+ 1 Settings.kt\ncom/baicizhan/main/home/player/settings/ComposableSingletons$SettingsKt\n*L\n126#1:187,6\n*E\n"})
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d f24027a = new d();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.r<ColumnScope, Modifier, Composer, Integer, g2> f24028b = ComposableLambdaKt.composableLambdaInstance(-1582297432, false, new x00.r() { // from class: com.baicizhan.main.home.player.settings.b
        @Override // x00.r
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            g2 h11;
            h11 = d.h((ColumnScope) obj, (Modifier) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            return h11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f24029c = ComposableLambdaKt.composableLambdaInstance(1924857597, false, new x00.p() { // from class: com.baicizhan.main.home.player.settings.c
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 f11;
            f11 = d.f((Composer) obj, ((Integer) obj2).intValue());
            return f11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 f(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1924857597, i11, -1, "com.baicizhan.main.home.player.settings.ComposableSingletons$SettingsKt.lambda$1924857597.<anonymous> (Settings.kt:125)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.settings.a
                    @Override // x00.a
                    public final Object invoke() {
                        g2 g11;
                        g11 = d.g();
                        return g11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            y.v(fillMaxWidth$default, "按键", (x00.a) rememberedValue, composer, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 g() {
        return g2.f100423a;
    }

    @Composable
    public static final g2 h(ColumnScope columnScope, Modifier it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(columnScope, "<this>");
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 129) != 128, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1582297432, i11, -1, "com.baicizhan.main.home.player.settings.ComposableSingletons$SettingsKt.lambda$-1582297432.<anonymous> (Settings.kt:70)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @m80.k
    public final x00.r<ColumnScope, Modifier, Composer, Integer, g2> d() {
        return f24028b;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> e() {
        return f24029c;
    }
}
