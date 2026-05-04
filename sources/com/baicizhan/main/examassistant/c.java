package com.baicizhan.main.examassistant;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWidgets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Widgets.kt\ncom/baicizhan/main/examassistant/ComposableSingletons$WidgetsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,61:1\n1247#2,6:62\n*S KotlinDebug\n*F\n+ 1 Widgets.kt\ncom/baicizhan/main/examassistant/ComposableSingletons$WidgetsKt\n*L\n57#1:62,6\n*E\n"})
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c f20453a = new c();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f20454b = ComposableLambdaKt.composableLambdaInstance(-671691775, false, new x00.p() { // from class: com.baicizhan.main.examassistant.b
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 d11;
            d11 = c.d((Composer) obj, ((Integer) obj2).intValue());
            return d11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 d(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-671691775, i11, -1, "com.baicizhan.main.examassistant.ComposableSingletons$WidgetsKt.lambda$-671691775.<anonymous> (Widgets.kt:56)");
            }
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.examassistant.a
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 e11;
                        e11 = c.e();
                        return e11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            l3.c(null, (x00.a) rememberedValue, composer, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 e() {
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> c() {
        return f20454b;
    }
}
