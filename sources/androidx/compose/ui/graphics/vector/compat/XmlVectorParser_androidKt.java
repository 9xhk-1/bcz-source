package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nXmlVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,693:1\n1#2:694\n123#3:695\n123#3:696\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n*L\n234#1:695\n235#1:696\n*E\n"})
/* loaded from: classes.dex */
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;

    @k
    private static final String SHAPE_CLIP_PATH = "clip-path";

    @k
    private static final String SHAPE_GROUP = "group";

    @k
    private static final String SHAPE_PATH = "path";

    @k
    public static final ImageVector.Builder createVectorImageBuilder(@k AndroidVectorParser androidVectorParser, @k Resources resources, @l Resources.Theme theme, @k AttributeSet attributeSet) {
        long m2545getUnspecified0d7_KjU;
        int m2449getSrcIn0nO6VwU;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean namedBoolean = androidVectorParser.getNamedBoolean(obtainAttributes, "autoMirrored", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, "viewportWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "viewportHeight", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (namedFloat <= 0.0f) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (namedFloat2 <= 0.0f) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float dimension = androidVectorParser.getDimension(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
        float dimension2 = androidVectorParser.getDimension(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
        if (obtainAttributes.hasValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) {
            TypedValue typedValue = new TypedValue();
            obtainAttributes.getValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), typedValue);
            if (typedValue.type == 2) {
                m2545getUnspecified0d7_KjU = Color.Companion.m2545getUnspecified0d7_KjU();
            } else {
                ColorStateList namedColorStateList = androidVectorParser.getNamedColorStateList(obtainAttributes, theme, "tint", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT());
                m2545getUnspecified0d7_KjU = namedColorStateList != null ? ColorKt.Color(namedColorStateList.getDefaultColor()) : Color.Companion.m2545getUnspecified0d7_KjU();
            }
        } else {
            m2545getUnspecified0d7_KjU = Color.Companion.m2545getUnspecified0d7_KjU();
        }
        long j11 = m2545getUnspecified0d7_KjU;
        int i11 = androidVectorParser.getInt(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
        if (i11 == -1) {
            m2449getSrcIn0nO6VwU = BlendMode.Companion.m2449getSrcIn0nO6VwU();
        } else if (i11 == 3) {
            m2449getSrcIn0nO6VwU = BlendMode.Companion.m2451getSrcOver0nO6VwU();
        } else if (i11 == 5) {
            m2449getSrcIn0nO6VwU = BlendMode.Companion.m2449getSrcIn0nO6VwU();
        } else if (i11 != 9) {
            switch (i11) {
                case 14:
                    m2449getSrcIn0nO6VwU = BlendMode.Companion.m2440getModulate0nO6VwU();
                    break;
                case 15:
                    m2449getSrcIn0nO6VwU = BlendMode.Companion.m2445getScreen0nO6VwU();
                    break;
                case 16:
                    m2449getSrcIn0nO6VwU = BlendMode.Companion.m2443getPlus0nO6VwU();
                    break;
                default:
                    m2449getSrcIn0nO6VwU = BlendMode.Companion.m2449getSrcIn0nO6VwU();
                    break;
            }
        } else {
            m2449getSrcIn0nO6VwU = BlendMode.Companion.m2448getSrcAtop0nO6VwU();
        }
        int i12 = m2449getSrcIn0nO6VwU;
        float m5115constructorimpl = Dp.m5115constructorimpl(dimension / resources.getDisplayMetrics().density);
        float m5115constructorimpl2 = Dp.m5115constructorimpl(dimension2 / resources.getDisplayMetrics().density);
        obtainAttributes.recycle();
        return new ImageVector.Builder(null, m5115constructorimpl, m5115constructorimpl2, namedFloat, namedFloat2, j11, i12, namedBoolean, 1, null);
    }

    /* renamed from: getStrokeLineCap-CSYIeUk, reason: not valid java name */
    private static final int m3227getStrokeLineCapCSYIeUk(int i11, int i12) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i12 : StrokeCap.Companion.m2864getSquareKaPHkGw() : StrokeCap.Companion.m2863getRoundKaPHkGw() : StrokeCap.Companion.m2862getButtKaPHkGw();
    }

    /* renamed from: getStrokeLineCap-CSYIeUk$default, reason: not valid java name */
    public static /* synthetic */ int m3228getStrokeLineCapCSYIeUk$default(int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = StrokeCap.Companion.m2862getButtKaPHkGw();
        }
        return m3227getStrokeLineCapCSYIeUk(i11, i12);
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA, reason: not valid java name */
    private static final int m3229getStrokeLineJoinkLtJ_vA(int i11, int i12) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i12 : StrokeJoin.Companion.m2872getBevelLxFBmk8() : StrokeJoin.Companion.m2874getRoundLxFBmk8() : StrokeJoin.Companion.m2873getMiterLxFBmk8();
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA$default, reason: not valid java name */
    public static /* synthetic */ int m3230getStrokeLineJoinkLtJ_vA$default(int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = StrokeJoin.Companion.m2873getMiterLxFBmk8();
        }
        return m3229getStrokeLineJoinkLtJ_vA(i11, i12);
    }

    public static final boolean isAtEnd(@k XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    private static final Brush obtainBrushFromComplexColor(ComplexColorCompat complexColorCompat) {
        if (!complexColorCompat.willDraw()) {
            return null;
        }
        Shader shader = complexColorCompat.getShader();
        return shader != null ? BrushKt.ShaderBrush(shader) : new SolidColor(ColorKt.Color(complexColorCompat.getColor()), null);
    }

    public static final void parseClipPath(@k AndroidVectorParser androidVectorParser, @k Resources resources, @l Resources.Theme theme, @k AttributeSet attributeSet, @k ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        String string2 = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA());
        List emptyPath = string2 == null ? VectorKt.getEmptyPath() : PathParser.pathStringToNodes$default(androidVectorParser.pathParser, string2, null, 2, null);
        obtainAttributes.recycle();
        ImageVector.Builder.addGroup$default(builder, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, emptyPath, 254, null);
    }

    public static final int parseCurrentVectorNode(@k AndroidVectorParser androidVectorParser, @k Resources resources, @k AttributeSet attributeSet, @l Resources.Theme theme, @k ImageVector.Builder builder, int i11) {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !g0.g(SHAPE_GROUP, androidVectorParser.getXmlParser().getName())) {
                return i11;
            }
            int i12 = i11 + 1;
            for (int i13 = 0; i13 < i12; i13++) {
                builder.clearGroup();
            }
            return 0;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name == null) {
            return i11;
        }
        int hashCode = name.hashCode();
        if (hashCode == -1649314686) {
            if (!name.equals(SHAPE_CLIP_PATH)) {
                return i11;
            }
            parseClipPath(androidVectorParser, resources, theme, attributeSet, builder);
            return i11 + 1;
        }
        if (hashCode == 3433509) {
            if (!name.equals("path")) {
                return i11;
            }
            parsePath(androidVectorParser, resources, theme, attributeSet, builder);
            return i11;
        }
        if (hashCode != 98629247 || !name.equals(SHAPE_GROUP)) {
            return i11;
        }
        parseGroup(androidVectorParser, resources, theme, attributeSet, builder);
        return i11;
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(androidVectorParser, resources, attributeSet, theme, builder, i11);
    }

    public static final void parseGroup(@k AndroidVectorParser androidVectorParser, @k Resources resources, @l Resources.Theme theme, @k AttributeSet attributeSet, @k ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, Key.ROTATION, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f11 = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f12 = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(obtainAttributes, "translateX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(obtainAttributes, "translateY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        obtainAttributes.recycle();
        builder.addGroup(string, namedFloat, f11, f12, namedFloat2, namedFloat3, namedFloat4, namedFloat5, VectorKt.getEmptyPath());
    }

    public static final void parsePath(@k AndroidVectorParser androidVectorParser, @k Resources resources, @l Resources.Theme theme, @k AttributeSet attributeSet, @k ImageVector.Builder builder) throws IllegalArgumentException {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (!TypedArrayUtils.hasAttribute(androidVectorParser.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        String string2 = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA());
        List<? extends PathNode> emptyPath = string2 == null ? VectorKt.getEmptyPath() : PathParser.pathStringToNodes$default(androidVectorParser.pathParser, string2, null, 2, null);
        ComplexColorCompat namedComplexColor = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "fillColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, "fillAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
        int m3227getStrokeLineCapCSYIeUk = m3227getStrokeLineCapCSYIeUk(androidVectorParser.getNamedInt(obtainAttributes, "strokeLineCap", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1), StrokeCap.Companion.m2862getButtKaPHkGw());
        int m3229getStrokeLineJoinkLtJ_vA = m3229getStrokeLineJoinkLtJ_vA(androidVectorParser.getNamedInt(obtainAttributes, "strokeLineJoin", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1), StrokeJoin.Companion.m2872getBevelLxFBmk8());
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
        ComplexColorCompat namedComplexColor2 = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
        float namedFloat3 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
        float namedFloat6 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
        float namedFloat7 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
        int namedInt = androidVectorParser.getNamedInt(obtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), FILL_TYPE_WINDING);
        obtainAttributes.recycle();
        builder.m3195addPathoIyEayM(emptyPath, namedInt == 0 ? PathFillType.Companion.m2792getNonZeroRgk1Os() : PathFillType.Companion.m2791getEvenOddRgk1Os(), str, obtainBrushFromComplexColor(namedComplexColor), namedFloat, obtainBrushFromComplexColor(namedComplexColor2), namedFloat3, namedFloat4, m3227getStrokeLineCapCSYIeUk, m3229getStrokeLineJoinkLtJ_vA, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
    }

    @k
    public static final XmlPullParser seekToStartTag(@k XmlPullParser xmlPullParser) throws XmlPullParserException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
