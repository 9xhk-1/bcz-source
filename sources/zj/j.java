package zj;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGuide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Guide.kt\ncom/baicizhan/platform/base/guide/GuideKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1247#2,3:22\n1250#2,3:26\n1#3:25\n*S KotlinDebug\n*F\n+ 1 Guide.kt\ncom/baicizhan/platform/base/guide/GuideKt\n*L\n18#1:22,3\n18#1:26,3\n*E\n"})
/* loaded from: classes6.dex */
public final class j {
    @Composable
    @m80.k
    public static final c a(@m80.k x00.p<? super Composer, ? super Integer, g2> content, @m80.l Composer composer, int i11) {
        g0.p(content, "content");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-165853650, i11, -1, "com.baicizhan.platform.base.guide.rememberGuide (Guide.kt:16)");
        }
        Object rememberedValue = composer.rememberedValue();
        Object obj = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            c cVar = new c();
            cVar.b(content);
            composer.updateRememberedValue(cVar);
            obj = cVar;
        }
        c cVar2 = (c) obj;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cVar2;
    }
}
