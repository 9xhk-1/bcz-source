package fd;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTrainingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingActivity.kt\ncom/baicizhan/main/activity/ComposableSingletons$TrainingActivityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,612:1\n1247#2,6:613\n*S KotlinDebug\n*F\n+ 1 TrainingActivity.kt\ncom/baicizhan/main/activity/ComposableSingletons$TrainingActivityKt\n*L\n609#1:613,6\n*E\n"})
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final m f51646a = new m();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f51647b = ComposableLambdaKt.composableLambdaInstance(803263931, false, new x00.p() { // from class: fd.l
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 d11;
            d11 = m.d((Composer) obj, ((Integer) obj2).intValue());
            return d11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 d(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(803263931, i11, -1, "com.baicizhan.main.activity.ComposableSingletons$TrainingActivityKt.lambda$803263931.<anonymous> (TrainingActivity.kt:608)");
            }
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: fd.k
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 e11;
                        e11 = m.e();
                        return e11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            v4.X((x00.a) rememberedValue, composer, 6, 0);
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
        return f51647b;
    }
}
