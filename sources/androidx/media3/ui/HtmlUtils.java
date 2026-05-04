package androidx.media3.ui;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.media3.common.util.Util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class HtmlUtils {
    private HtmlUtils() {
    }

    public static String cssAllClassDescendantsSelector(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String toCssRgba(@ColorInt int i11) {
        return Util.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i11)), Integer.valueOf(Color.green(i11)), Integer.valueOf(Color.blue(i11)), Double.valueOf(Color.alpha(i11) / 255.0d));
    }
}
