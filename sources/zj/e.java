package zj;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGuideAnchorState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideAnchorState.kt\ncom/baicizhan/platform/base/guide/GuideAnchorStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,29:1\n1247#2,6:30\n*S KotlinDebug\n*F\n+ 1 GuideAnchorState.kt\ncom/baicizhan/platform/base/guide/GuideAnchorStateKt\n*L\n26#1:30,6\n*E\n"})
/* loaded from: classes6.dex */
public final class e {
    @Composable
    @m80.k
    public static final d a(@m80.k c guide, @m80.l Object obj, @m80.l Object obj2, @m80.l Composer composer, int i11, int i12) {
        g0.p(guide, "guide");
        if ((i12 & 2) != 0) {
            obj = null;
        }
        if ((i12 & 4) != 0) {
            obj2 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-678283327, i11, -1, "com.baicizhan.platform.base.guide.rememberGuideAnchorState (GuideAnchorState.kt:24)");
        }
        boolean changed = composer.changed(obj2) | ((((i11 & 14) ^ 6) > 4 && composer.changed(guide)) || (i11 & 6) == 4) | composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new d(guide, obj);
            composer.updateRememberedValue(rememberedValue);
        }
        d dVar = (d) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dVar;
    }
}
