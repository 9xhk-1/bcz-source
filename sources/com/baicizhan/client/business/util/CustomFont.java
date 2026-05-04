package com.baicizhan.client.business.util;

import android.graphics.Typeface;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class CustomFont {
    public static final String DEFAULT_FONT_ACCENT = "fonts/HelveticaNeue.otf";
    public static final String DEFAULT_FONT_BLACK_ITALIC = "fonts/DIN-BlackItalic.ttf";
    public static final String DEFAULT_FONT_LIGHT = "fonts/DIN-Light.otf";
    public static final String DEFAULT_FONT_LIGHT_NUM = "fonts/DIN-Light-Num.otf";
    public static final String DEFAULT_FONT_REGULAR = "fonts/DIN-Regular.otf";
    public static final int TYPEFACE_ACCENT = 3;
    public static final int TYPEFACE_BLACK_ITALIC = 4;
    public static final int TYPEFACE_LIGHT = 1;
    public static final int TYPEFACE_LIGHT_NUM = 2;
    public static final int TYPEFACE_REGULAR = 0;
    private static Map<String, Typeface> typefaceCache = new HashMap();
    private static SparseArray<String> whichFontToUseForEachTypefaceStyle;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        whichFontToUseForEachTypefaceStyle = sparseArray;
        sparseArray.put(0, DEFAULT_FONT_REGULAR);
        whichFontToUseForEachTypefaceStyle.put(1, DEFAULT_FONT_LIGHT);
        whichFontToUseForEachTypefaceStyle.put(2, DEFAULT_FONT_LIGHT_NUM);
        whichFontToUseForEachTypefaceStyle.put(3, DEFAULT_FONT_ACCENT);
        whichFontToUseForEachTypefaceStyle.put(4, DEFAULT_FONT_BLACK_ITALIC);
    }

    private CustomFont() {
    }

    public static Typeface getFont(int type) {
        Typeface typeface = typefaceCache.get(whichFontToUseForEachTypefaceStyle.get(type));
        if (typeface != null) {
            return typeface;
        }
        if (type != 0 && type != 1 && type != 2 && type != 3 && type != 4) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(pb.a.a().getAssets(), whichFontToUseForEachTypefaceStyle.get(type));
        typefaceCache.put(whichFontToUseForEachTypefaceStyle.get(type), createFromAsset);
        return createFromAsset;
    }

    public static void setFont(TextView tv2, int type) {
        Typeface font = getFont(type);
        if (font != null) {
            tv2.setTypeface(font);
        }
    }
}
