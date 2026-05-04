package hn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.CutCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.TypedArrayKt;
import androidx.media3.common.C;
import com.google.android.material.composethemeadapter.core.R;
import java.util.ArrayList;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import u30.k0;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final ThreadLocal<TypedValue> f59510a = new ThreadLocal<>();

    public static final FontWeight a(int i11) {
        return (i11 < 0 || i11 >= 150) ? (150 > i11 || i11 >= 250) ? (250 > i11 || i11 >= 350) ? (350 > i11 || i11 >= 450) ? (450 > i11 || i11 >= 550) ? (550 > i11 || i11 >= 650) ? (650 > i11 || i11 >= 750) ? (750 > i11 || i11 >= 850) ? (850 > i11 || i11 >= 1000) ? FontWeight.Companion.getW400() : FontWeight.Companion.getW900() : FontWeight.Companion.getW800() : FontWeight.Companion.getW700() : FontWeight.Companion.getW600() : FontWeight.Companion.getW500() : FontWeight.Companion.getW400() : FontWeight.Companion.getW300() : FontWeight.Companion.getW200() : FontWeight.Companion.getW100();
    }

    public static final int b(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    @n(message = "\n     compose-theme-adapter-core is deprecated.\n     The API has moved to accompanist/themeadapter/core.\n     For more information, please visit https://google.github.io/accompanist/themeadapter-core\n    ")
    public static final long c(@k TypedArray parseColor, int i11, long j11) {
        g0.p(parseColor, "$this$parseColor");
        return parseColor.hasValue(i11) ? ColorKt.Color(TypedArrayKt.getColorOrThrow(parseColor, i11)) : j11;
    }

    public static /* synthetic */ long d(TypedArray typedArray, int i11, long j11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            j11 = Color.Companion.m2545getUnspecified0d7_KjU();
        }
        return c(typedArray, i11, j11);
    }

    @l
    @n(message = "\n     compose-theme-adapter-core is deprecated.\n     The API has moved to accompanist/themeadapter/core.\n     For more information, please visit https://google.github.io/accompanist/themeadapter-core\n    ")
    public static final CornerSize e(@k TypedArray typedArray, int i11) {
        g0.p(typedArray, "<this>");
        ThreadLocal<TypedValue> threadLocal = f59510a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (!typedArray.getValue(i11, typedValue2)) {
            return null;
        }
        int i12 = typedValue2.type;
        if (i12 == 5) {
            int complexUnit = typedValue2.getComplexUnit();
            return complexUnit != 0 ? complexUnit != 1 ? CornerSizeKt.CornerSize(typedArray.getDimensionPixelSize(i11, 0)) : CornerSizeKt.m1011CornerSize0680j_4(Dp.m5115constructorimpl(TypedValue.complexToFloat(typedValue2.data))) : CornerSizeKt.CornerSize(TypedValue.complexToFloat(typedValue2.data));
        }
        if (i12 != 6) {
            return null;
        }
        return CornerSizeKt.CornerSize(typedValue2.getFraction(1.0f, 1.0f));
    }

    @l
    @n(message = "\n     compose-theme-adapter-core is deprecated.\n     The API has moved to accompanist/themeadapter/core.\n     For more information, please visit https://google.github.io/accompanist/themeadapter-core\n    ")
    public static final a f(@k TypedArray typedArray, int i11) {
        g0.p(typedArray, "<this>");
        ThreadLocal<TypedValue> threadLocal = f59510a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (typedArray.getValue(i11, typedValue2) && typedValue2.type == 3) {
            CharSequence charSequence = typedValue2.string;
            if (g0.g(charSequence, C.SANS_SERIF_NAME)) {
                return new a(FontFamily.Companion.getSansSerif(), null, 2, null);
            }
            if (g0.g(charSequence, "sans-serif-thin")) {
                return new a(FontFamily.Companion.getSansSerif(), FontWeight.Companion.getThin());
            }
            if (g0.g(charSequence, "sans-serif-light")) {
                return new a(FontFamily.Companion.getSansSerif(), FontWeight.Companion.getLight());
            }
            if (g0.g(charSequence, "sans-serif-medium")) {
                return new a(FontFamily.Companion.getSansSerif(), FontWeight.Companion.getMedium());
            }
            if (g0.g(charSequence, "sans-serif-black")) {
                return new a(FontFamily.Companion.getSansSerif(), FontWeight.Companion.getBlack());
            }
            if (g0.g(charSequence, C.SERIF_NAME)) {
                return new a(FontFamily.Companion.getSerif(), null, 2, null);
            }
            if (g0.g(charSequence, "cursive")) {
                return new a(FontFamily.Companion.getCursive(), null, 2, null);
            }
            if (g0.g(charSequence, "monospace")) {
                return new a(FontFamily.Companion.getMonospace(), null, 2, null);
            }
            if (typedValue2.resourceId != 0) {
                CharSequence charSequence2 = typedValue2.string;
                g0.o(charSequence2, "tv.string");
                if (k0.C5(charSequence2, "res/", false, 2, null)) {
                    CharSequence charSequence3 = typedValue2.string;
                    g0.o(charSequence3, "tv.string");
                    if (!k0.t3(charSequence3, ".xml", false, 2, null)) {
                        return new a(FontKt.toFontFamily(FontKt.m4651FontYpTlLL0$default(typedValue2.resourceId, null, 0, 0, 14, null)), null, 2, null);
                    }
                    Resources resources = typedArray.getResources();
                    g0.o(resources, "resources");
                    FontFamily k11 = k(resources, typedValue2.resourceId);
                    if (k11 != null) {
                        return new a(k11, null, 2, null);
                    }
                    return null;
                }
            }
        }
        return null;
    }

    @n(message = "\n     compose-theme-adapter-core is deprecated.\n     The API has moved to accompanist/themeadapter/core.\n     For more information, please visit https://google.github.io/accompanist/themeadapter-core\n    ")
    @k
    public static final CornerBasedShape g(@k Context context, @StyleRes int i11, @k LayoutDirection layoutDirection, @k CornerBasedShape fallbackShape) {
        CornerBasedShape roundedCornerShape;
        g0.p(context, "context");
        g0.p(layoutDirection, "layoutDirection");
        g0.p(fallbackShape, "fallbackShape");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, R.styleable.ComposeThemeAdapterShapeAppearance);
        g0.o(obtainStyledAttributes, "context.obtainStyledAttr…meAdapterShapeAppearance)");
        CornerSize e11 = e(obtainStyledAttributes, R.styleable.ComposeThemeAdapterShapeAppearance_cornerSize);
        CornerSize e12 = e(obtainStyledAttributes, R.styleable.ComposeThemeAdapterShapeAppearance_cornerSizeTopLeft);
        CornerSize e13 = e(obtainStyledAttributes, R.styleable.ComposeThemeAdapterShapeAppearance_cornerSizeTopRight);
        CornerSize e14 = e(obtainStyledAttributes, R.styleable.ComposeThemeAdapterShapeAppearance_cornerSizeBottomLeft);
        CornerSize e15 = e(obtainStyledAttributes, R.styleable.ComposeThemeAdapterShapeAppearance_cornerSizeBottomRight);
        boolean z11 = layoutDirection == LayoutDirection.Rtl;
        CornerSize cornerSize = z11 ? e13 : e12;
        if (!z11) {
            e12 = e13;
        }
        CornerSize cornerSize2 = z11 ? e15 : e14;
        if (!z11) {
            e14 = e15;
        }
        int i12 = obtainStyledAttributes.getInt(R.styleable.ComposeThemeAdapterShapeAppearance_cornerFamily, 0);
        if (i12 == 0) {
            if (cornerSize == null) {
                cornerSize = e11 == null ? fallbackShape.getTopStart() : e11;
            }
            if (e12 == null) {
                e12 = e11 == null ? fallbackShape.getTopEnd() : e11;
            }
            if (e14 == null) {
                e14 = e11 == null ? fallbackShape.getBottomEnd() : e11;
            }
            if (cornerSize2 != null) {
                e11 = cornerSize2;
            } else if (e11 == null) {
                e11 = fallbackShape.getBottomStart();
            }
            roundedCornerShape = new RoundedCornerShape(cornerSize, e12, e14, e11);
        } else {
            if (i12 != 1) {
                throw new IllegalArgumentException("Unknown cornerFamily set in ShapeAppearance");
            }
            if (cornerSize == null) {
                cornerSize = e11 == null ? fallbackShape.getTopStart() : e11;
            }
            if (e12 == null) {
                e12 = e11 == null ? fallbackShape.getTopEnd() : e11;
            }
            if (e14 == null) {
                e14 = e11 == null ? fallbackShape.getBottomEnd() : e11;
            }
            if (cornerSize2 != null) {
                e11 = cornerSize2;
            } else if (e11 == null) {
                e11 = fallbackShape.getBottomStart();
            }
            roundedCornerShape = new CutCornerShape(cornerSize, e12, e14, e11);
        }
        obtainStyledAttributes.recycle();
        return roundedCornerShape;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017b  */
    @yz.n(message = "\n     compose-theme-adapter-core is deprecated.\n     The API has moved to accompanist/themeadapter/core.\n     For more information, please visit https://google.github.io/accompanist/themeadapter-core\n    ")
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.text.TextStyle h(@m80.k android.content.Context r39, @androidx.annotation.StyleRes int r40, @m80.k androidx.compose.ui.unit.Density r41, boolean r42, @m80.l androidx.compose.ui.text.font.FontFamily r43) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.b.h(android.content.Context, int, androidx.compose.ui.unit.Density, boolean, androidx.compose.ui.text.font.FontFamily):androidx.compose.ui.text.TextStyle");
    }

    @n(message = "\n     compose-theme-adapter-core is deprecated.\n     The API has moved to accompanist/themeadapter/core.\n     For more information, please visit https://google.github.io/accompanist/themeadapter-core\n    ")
    public static final long i(@k TypedArray parseTextUnit, int i11, @k Density density, long j11) {
        g0.p(parseTextUnit, "$this$parseTextUnit");
        g0.p(density, "density");
        ThreadLocal<TypedValue> threadLocal = f59510a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (!parseTextUnit.getValue(i11, typedValue2) || typedValue2.type != 5) {
            return j11;
        }
        int complexUnit = typedValue2.getComplexUnit();
        return complexUnit != 1 ? complexUnit != 2 ? density.mo380toSpkPz2Gy4(parseTextUnit.getDimension(i11, 0.0f)) : TextUnitKt.getSp(TypedValue.complexToFloat(typedValue2.data)) : TextUnitKt.getEm(TypedValue.complexToFloat(typedValue2.data));
    }

    public static /* synthetic */ long j(TypedArray typedArray, int i11, Density density, long j11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            j11 = TextUnit.Companion.m5320getUnspecifiedXSAIIZE();
        }
        return i(typedArray, i11, density, j11);
    }

    @l
    @SuppressLint({"RestrictedApi"})
    @RequiresApi(23)
    @n(message = "\n     compose-theme-adapter-core is deprecated.\n     The API has moved to accompanist/themeadapter/core.\n     For more information, please visit https://google.github.io/accompanist/themeadapter-core\n    ")
    public static final FontFamily k(@k Resources resources, int i11) {
        g0.p(resources, "<this>");
        XmlResourceParser xml = resources.getXml(i11);
        g0.o(xml, "getXml(id)");
        try {
            FontResourcesParserCompat.FamilyResourceEntry parse = FontResourcesParserCompat.parse(xml, resources);
            if (!(parse instanceof FontResourcesParserCompat.FontFamilyFilesResourceEntry)) {
                xml.close();
                return null;
            }
            FontResourcesParserCompat.FontFileResourceEntry[] entries = ((FontResourcesParserCompat.FontFamilyFilesResourceEntry) parse).getEntries();
            g0.o(entries, "result.entries");
            ArrayList arrayList = new ArrayList(entries.length);
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : entries) {
                arrayList.add(FontKt.m4651FontYpTlLL0$default(fontFileResourceEntry.getResourceId(), a(fontFileResourceEntry.getWeight()), fontFileResourceEntry.isItalic() ? FontStyle.Companion.m4676getItalic_LCdwA() : FontStyle.Companion.m4677getNormal_LCdwA(), 0, 8, null));
            }
            FontFamily FontFamily = FontFamilyKt.FontFamily(arrayList);
            xml.close();
            return FontFamily;
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }
}
