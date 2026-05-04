package com.baicizhan.main.activity.mytab.task;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.tencent.liteav.TXLiteAVCode;
import he.a;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUiAchievement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiAchievement.kt\ncom/baicizhan/main/activity/mytab/task/ComposableSingletons$UiAchievementKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,110:1\n1247#2,6:111\n*S KotlinDebug\n*F\n+ 1 UiAchievement.kt\ncom/baicizhan/main/activity/mytab/task/ComposableSingletons$UiAchievementKt\n*L\n89#1:111,6\n*E\n"})
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f f18822a = new f();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f18823b = ComposableLambdaKt.composableLambdaInstance(1781607352, false, new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.d
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 d11;
            d11 = f.d((Composer) obj, ((Integer) obj2).intValue());
            return d11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 d(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1781607352, i11, -1, "com.baicizhan.main.activity.mytab.task.ComposableSingletons$UiAchievementKt.lambda$1781607352.<anonymous> (UiAchievement.kt:88)");
            }
            a.b bVar = new a.b(new com.baicizhan.main.activity.mytab.task.data.a(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE, TXLiteAVCode.WARNING_CAMERA_DEVICE_EMPTY));
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.mytab.task.e
                    @Override // x00.a
                    public final Object invoke() {
                        g2 e11;
                        e11 = f.e();
                        return e11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x.c(bVar, (x00.a) rememberedValue, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 e() {
        return g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> c() {
        return f18823b;
    }
}
