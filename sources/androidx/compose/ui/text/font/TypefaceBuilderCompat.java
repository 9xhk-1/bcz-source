package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(api = 26)
@u0({"SMAP\nAndroidPreloadedFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,241:1\n150#2,3:242\n34#2,6:245\n153#2:251\n37#3,2:252\n*S KotlinDebug\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n*L\n235#1:242,3\n235#1:245,6\n235#1:251\n238#1:252,2\n*E\n"})
/* loaded from: classes2.dex */
final class TypefaceBuilderCompat {

    @k
    public static final TypefaceBuilderCompat INSTANCE = new TypefaceBuilderCompat();

    private TypefaceBuilderCompat() {
    }

    @ExperimentalTextApi
    @RequiresApi(26)
    private final FontVariationAxis[] toVariationSettings(FontVariation.Settings settings, Context context) {
        Density Density;
        if (context != null) {
            Density = AndroidDensity_androidKt.Density(context);
        } else {
            if (settings.getNeedsDensity$ui_text_release()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            Density = DensityKt.Density(1.0f, 1.0f);
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        ArrayList arrayList = new ArrayList(settings2.size());
        int size = settings2.size();
        for (int i11 = 0; i11 < size; i11++) {
            FontVariation.Setting setting = settings2.get(i11);
            g.a();
            arrayList.add(f.a(setting.getAxisName(), setting.toVariationValue(Density)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    @l
    @ExperimentalTextApi
    public final android.graphics.Typeface createFromAssets(@k AssetManager assetManager, @k String str, @l Context context, @k FontVariation.Settings settings) {
        Typeface.Builder fontVariationSettings;
        android.graphics.Typeface build;
        if (context == null) {
            return null;
        }
        fontVariationSettings = e.a(assetManager, str).setFontVariationSettings(toVariationSettings(settings, context));
        build = fontVariationSettings.build();
        return build;
    }

    @l
    @ExperimentalTextApi
    public final android.graphics.Typeface createFromFile(@k File file, @l Context context, @k FontVariation.Settings settings) {
        Typeface.Builder fontVariationSettings;
        android.graphics.Typeface build;
        if (context == null) {
            return null;
        }
        fontVariationSettings = d.a(file).setFontVariationSettings(toVariationSettings(settings, context));
        build = fontVariationSettings.build();
        return build;
    }

    @l
    @ExperimentalTextApi
    public final android.graphics.Typeface createFromFileDescriptor(@k ParcelFileDescriptor parcelFileDescriptor, @l Context context, @k FontVariation.Settings settings) {
        Typeface.Builder fontVariationSettings;
        android.graphics.Typeface build;
        if (context == null) {
            return null;
        }
        i.a();
        fontVariationSettings = h.a(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(settings, context));
        build = fontVariationSettings.build();
        return build;
    }
}
