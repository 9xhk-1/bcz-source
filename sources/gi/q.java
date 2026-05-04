package gi;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDrablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrablePainter.kt\ncom/baicizhan/main/utils/DrablePainterKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,158:1\n1247#2,6:159\n33#3:165\n53#4,3:166\n*S KotlinDebug\n*F\n+ 1 DrablePainter.kt\ncom/baicizhan/main/utils/DrablePainterKt\n*L\n136#1:159,6\n150#1:165\n150#1:166,3\n*E\n"})
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f53836a = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a() { // from class: gi.p
        @Override // x00.a
        public final Object invoke() {
            Handler b11;
            b11 = q.b();
            return b11;
        }
    });

    public static final Handler b() {
        return new Handler(Looper.getMainLooper());
    }

    public static final long e(Drawable drawable) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return Size.Companion.m2345getUnspecifiedNHjbRc();
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        return Size.m2328constructorimpl((Float.floatToRawIntBits(intrinsicWidth) << 32) | (Float.floatToRawIntBits(intrinsicHeight) & 4294967295L));
    }

    public static final Handler f() {
        return (Handler) f53836a.getValue();
    }

    @Composable
    @m80.k
    public static final Painter g(@m80.l Drawable drawable, @m80.l Composer composer, int i11) {
        Object sVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(518618044, i11, -1, "com.baicizhan.main.utils.rememberDrawablePainter (DrablePainter.kt:135)");
        }
        boolean changed = composer.changed(drawable);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            if (drawable == null) {
                rememberedValue = t.f53845a;
            } else {
                if (drawable instanceof ColorDrawable) {
                    sVar = new ColorPainter(ColorKt.Color(((ColorDrawable) drawable).getColor()), null);
                } else {
                    Drawable mutate = drawable.mutate();
                    kotlin.jvm.internal.g0.o(mutate, "mutate(...)");
                    sVar = new s(mutate);
                }
                rememberedValue = sVar;
            }
            composer.updateRememberedValue(rememberedValue);
        }
        Painter painter = (Painter) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return painter;
    }
}
