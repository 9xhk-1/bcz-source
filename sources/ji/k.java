package ji;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.baicizhan.main.vld.model.VocabularyDeviceInfo;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDeviceManagementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManagementActivity.kt\ncom/baicizhan/main/vld/ComposableSingletons$DeviceManagementActivityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,347:1\n1247#2,6:348\n1247#2,6:354\n*S KotlinDebug\n*F\n+ 1 DeviceManagementActivity.kt\ncom/baicizhan/main/vld/ComposableSingletons$DeviceManagementActivityKt\n*L\n329#1:348,6\n342#1:354,6\n*E\n"})
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final k f64147a = new k();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f64148b = ComposableLambdaKt.composableLambdaInstance(-2138103054, false, new x00.p() { // from class: ji.h
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 i11;
            i11 = k.i((Composer) obj, ((Integer) obj2).intValue());
            return i11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f64149c = ComposableLambdaKt.composableLambdaInstance(1992841173, false, new x00.p() { // from class: ji.i
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 g11;
            g11 = k.g((Composer) obj, ((Integer) obj2).intValue());
            return g11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 g(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1992841173, i11, -1, "com.baicizhan.main.vld.ComposableSingletons$DeviceManagementActivityKt.lambda$1992841173.<anonymous> (DeviceManagementActivity.kt:336)");
            }
            List Q = a00.h0.Q(new VocabularyDeviceInfo(1L, 12, "我的单词机你想不想要啊反正也不会给你", "a", "百词斩单词机A1", "xinsihfur32dhhiw29383273", "v1.0", true), new VocabularyDeviceInfo(2L, 11, "单词机一个", "百词斩单词机A1", "a", "xinsihfur32dhhiw293832df", "v1.0", false));
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: ji.j
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 h11;
                        h11 = k.h((VocabularyDeviceInfo) obj);
                        return h11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            m1.o(Q, (x00.l) rememberedValue, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 h(VocabularyDeviceInfo it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 i(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2138103054, i11, -1, "com.baicizhan.main.vld.ComposableSingletons$DeviceManagementActivityKt.lambda$-2138103054.<anonymous> (DeviceManagementActivity.kt:328)");
            }
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: ji.g
                    @Override // x00.a
                    public final Object invoke() {
                        g2 j11;
                        j11 = k.j();
                        return j11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            m1.D((x00.a) rememberedValue, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 j() {
        return g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> e() {
        return f64148b;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> f() {
        return f64149c;
    }
}
