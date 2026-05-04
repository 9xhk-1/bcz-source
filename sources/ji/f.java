package ji;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.baicizhan.main.vld.model.VocabularyDeviceInfo;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDeviceDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDetailActivity.kt\ncom/baicizhan/main/vld/ComposableSingletons$DeviceDetailActivityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,324:1\n1247#2,6:325\n1247#2,6:331\n1247#2,6:337\n1247#2,6:343\n*S KotlinDebug\n*F\n+ 1 DeviceDetailActivity.kt\ncom/baicizhan/main/vld/ComposableSingletons$DeviceDetailActivityKt\n*L\n318#1:325,6\n319#1:331,6\n320#1:337,6\n321#1:343,6\n*E\n"})
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f f64119a = new f();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f64120b = ComposableLambdaKt.composableLambdaInstance(-1272384883, false, new x00.p() { // from class: ji.e
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 g11;
            g11 = f.g((Composer) obj, ((Integer) obj2).intValue());
            return g11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 g(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1272384883, i11, -1, "com.baicizhan.main.vld.ComposableSingletons$DeviceDetailActivityKt.lambda$-1272384883.<anonymous> (DeviceDetailActivity.kt:315)");
            }
            VocabularyDeviceInfo vocabularyDeviceInfo = new VocabularyDeviceInfo(1L, 123, "我的单词机你", "asb", "百词斩单词机A1", "xinsihfur32dhhiw29383273", "v1.0", false);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: ji.a
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 h11;
                        h11 = f.h((String) obj);
                        return h11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.l lVar = (x00.l) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: ji.b
                    @Override // x00.a
                    public final Object invoke() {
                        g2 i12;
                        i12 = f.i();
                        return i12;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.a aVar = (x00.a) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: ji.c
                    @Override // x00.a
                    public final Object invoke() {
                        g2 j11;
                        j11 = f.j();
                        return j11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            x00.a aVar2 = (x00.a) rememberedValue3;
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: ji.d
                    @Override // x00.a
                    public final Object invoke() {
                        g2 k11;
                        k11 = f.k();
                        return k11;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            k0.n(vocabularyDeviceInfo, lVar, aVar, aVar2, (x00.a) rememberedValue4, composer, 28080);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 h(String it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return g2.f100423a;
    }

    public static final g2 i() {
        return g2.f100423a;
    }

    public static final g2 j() {
        return g2.f100423a;
    }

    public static final g2 k() {
        return g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> f() {
        return f64120b;
    }
}
