package androidx.compose.ui.res;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nImageResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,59:1\n1247#2,6:60\n1247#2,6:66\n*S KotlinDebug\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n*L\n54#1:60,6\n57#1:66,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ImageResources_androidKt {
    @k
    public static final ImageBitmap imageResource(@k ImageBitmap.Companion companion, @k Resources resources, @DrawableRes int i11) {
        Drawable drawable = resources.getDrawable(i11, null);
        g0.n(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap());
    }

    @Composable
    @k
    public static final ImageBitmap imageResource(@k ImageBitmap.Companion companion, @DrawableRes int i11, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304919470, i12, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:51)");
        }
        Resources resources = Resources_androidKt.resources(composer, 0);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = new TypedValue();
            composer.updateRememberedValue(rememberedValue);
        }
        TypedValue typedValue = (TypedValue) rememberedValue;
        resources.getValue(i11, typedValue, true);
        CharSequence charSequence = typedValue.string;
        g0.m(charSequence);
        boolean changed = composer.changed(charSequence.toString());
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = imageResource(companion, resources, i11);
            composer.updateRememberedValue(rememberedValue2);
        }
        ImageBitmap imageBitmap = (ImageBitmap) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageBitmap;
    }
}
