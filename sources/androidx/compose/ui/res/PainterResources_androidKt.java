package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n75#2:125\n75#2:126\n75#2:127\n75#2:134\n1247#3,6:128\n*S KotlinDebug\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n*L\n58#1:125\n61#1:126\n63#1:127\n91#1:134\n74#1:128,6\n*E\n"})
/* loaded from: classes2.dex */
public final class PainterResources_androidKt {

    @k
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP";

    private static final ImageBitmap loadImageBitmapResource(CharSequence charSequence, Resources resources, int i11) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.Companion, resources, i11);
        } catch (Exception e11) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e11);
        }
    }

    @Composable
    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i11, int i12, Composer composer, int i13) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21855625, i13, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:89)");
        }
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i11);
        ImageVectorCache.ImageVectorEntry imageVectorEntry = imageVectorCache.get(key);
        if (imageVectorEntry == null) {
            XmlResourceParser xml = resources.getXml(i11);
            if (!g0.g(XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                throw new IllegalArgumentException(errorMessage);
            }
            imageVectorEntry = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml, i12);
            imageVectorCache.set(key, imageVectorEntry);
        }
        ImageVector imageVector = imageVectorEntry.getImageVector();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageVector;
    }

    @Composable
    @k
    public static final Painter painterResource(@DrawableRes int i11, @l Composer composer, int i12) {
        Painter painter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(473971343, i12, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = context.getResources();
        TypedValue resolveResourcePath = ((ResourceIdCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalResourceIdCache())).resolveResourcePath(resources, i11);
        CharSequence charSequence = resolveResourcePath.string;
        boolean z11 = true;
        if (charSequence == null || !k0.t3(charSequence, ".xml", false, 2, null)) {
            composer.startReplaceGroup(-802887899);
            Object theme = context.getTheme();
            boolean changed = composer.changed(charSequence);
            if ((((i12 & 14) ^ 6) <= 4 || !composer.changed(i11)) && (i12 & 6) != 4) {
                z11 = false;
            }
            boolean changed2 = composer.changed(theme) | changed | z11;
            Object rememberedValue = composer.rememberedValue();
            if (changed2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = loadImageBitmapResource(charSequence, resources, i11);
                composer.updateRememberedValue(rememberedValue);
            }
            BitmapPainter bitmapPainter = new BitmapPainter((ImageBitmap) rememberedValue, 0L, 0L, 6, null);
            composer.endReplaceGroup();
            painter = bitmapPainter;
        } else {
            composer.startReplaceGroup(-803043333);
            painter = VectorPainterKt.rememberVectorPainter(loadVectorResource(context.getTheme(), resources, i11, resolveResourcePath.changingConfigurations, composer, (i12 << 6) & 896), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return painter;
    }
}
