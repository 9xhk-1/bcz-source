package sm;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDrawablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainterKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,175:1\n36#2:176\n1097#3,6:177\n*S KotlinDebug\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainterKt\n*L\n152#1:176\n152#1:177,6\n*E\n"})
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c0 f88841a = e0.b(LazyThreadSafetyMode.NONE, a.f88842a);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.a<Handler> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f88842a = new a();

        public a() {
            super(0);
        }

        @Override // x00.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final long c(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? Size.Companion.m2345getUnspecifiedNHjbRc() : SizeKt.Size(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static final Handler d() {
        return (Handler) f88841a.getValue();
    }

    @Composable
    @k
    public static final Painter e(@l Drawable drawable, @l Composer composer, int i11) {
        Object aVar;
        composer.startReplaceableGroup(1756822313);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1756822313, i11, -1, "com.google.accompanist.drawablepainter.rememberDrawablePainter (DrawablePainter.kt:151)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(drawable);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            if (drawable == null) {
                rememberedValue = c.f88843a;
            } else {
                if (drawable instanceof ColorDrawable) {
                    aVar = new ColorPainter(ColorKt.Color(((ColorDrawable) drawable).getColor()), null);
                } else {
                    Drawable mutate = drawable.mutate();
                    g0.o(mutate, "mutate(...)");
                    aVar = new sm.a(mutate);
                }
                rememberedValue = aVar;
            }
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Painter painter = (Painter) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return painter;
    }
}
