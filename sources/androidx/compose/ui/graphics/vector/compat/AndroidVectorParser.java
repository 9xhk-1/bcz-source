package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.xmlpull.v1.XmlPullParser;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidVectorParser {
    public static final int $stable = 8;
    private int config;

    @g
    @k
    public final PathParser pathParser;

    @k
    private final XmlPullParser xmlParser;

    public AndroidVectorParser(@k XmlPullParser xmlPullParser, int i11) {
        this.xmlParser = xmlPullParser;
        this.config = i11;
        this.pathParser = new PathParser();
    }

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i12 & 2) != 0) {
            i11 = androidVectorParser.config;
        }
        return androidVectorParser.copy(xmlPullParser, i11);
    }

    private final void updateConfig(int i11) {
        this.config = i11 | this.config;
    }

    @k
    public final XmlPullParser component1() {
        return this.xmlParser;
    }

    public final int component2() {
        return this.config;
    }

    @k
    public final AndroidVectorParser copy(@k XmlPullParser xmlPullParser, int i11) {
        return new AndroidVectorParser(xmlPullParser, i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        return g0.g(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public final int getConfig() {
        return this.config;
    }

    public final float getDimension(@k TypedArray typedArray, int i11, float f11) {
        float dimension = typedArray.getDimension(i11, f11);
        updateConfig(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(@k TypedArray typedArray, int i11, float f11) {
        float f12 = typedArray.getFloat(i11, f11);
        updateConfig(typedArray.getChangingConfigurations());
        return f12;
    }

    public final int getInt(@k TypedArray typedArray, int i11, int i12) {
        int i13 = typedArray.getInt(i11, i12);
        updateConfig(typedArray.getChangingConfigurations());
        return i13;
    }

    public final boolean getNamedBoolean(@k TypedArray typedArray, @k String str, @StyleableRes int i11, boolean z11) {
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(typedArray, this.xmlParser, str, i11, z11);
        updateConfig(typedArray.getChangingConfigurations());
        return namedBoolean;
    }

    @l
    public final ColorStateList getNamedColorStateList(@k TypedArray typedArray, @l Resources.Theme theme, @k String str, @StyleableRes int i11) {
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArray, this.xmlParser, theme, str, i11);
        updateConfig(typedArray.getChangingConfigurations());
        return namedColorStateList;
    }

    @k
    public final ComplexColorCompat getNamedComplexColor(@k TypedArray typedArray, @l Resources.Theme theme, @k String str, @StyleableRes int i11, @ColorInt int i12) {
        ComplexColorCompat namedComplexColor = TypedArrayUtils.getNamedComplexColor(typedArray, this.xmlParser, theme, str, i11, i12);
        updateConfig(typedArray.getChangingConfigurations());
        return namedComplexColor;
    }

    public final float getNamedFloat(@k TypedArray typedArray, @k String str, @StyleableRes int i11, float f11) {
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, this.xmlParser, str, i11, f11);
        updateConfig(typedArray.getChangingConfigurations());
        return namedFloat;
    }

    public final int getNamedInt(@k TypedArray typedArray, @k String str, @StyleableRes int i11, int i12) {
        int namedInt = TypedArrayUtils.getNamedInt(typedArray, this.xmlParser, str, i11, i12);
        updateConfig(typedArray.getChangingConfigurations());
        return namedInt;
    }

    @l
    public final String getString(@k TypedArray typedArray, int i11) {
        String string = typedArray.getString(i11);
        updateConfig(typedArray.getChangingConfigurations());
        return string;
    }

    @k
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + Integer.hashCode(this.config);
    }

    @k
    public final TypedArray obtainAttributes(@k Resources resources, @l Resources.Theme theme, @k AttributeSet attributeSet, @k int[] iArr) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, iArr);
        updateConfig(obtainAttributes.getChangingConfigurations());
        return obtainAttributes;
    }

    public final void setConfig(int i11) {
        this.config = i11;
    }

    @k
    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.xmlParser + ", config=" + this.config + ')';
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i11, int i12, v vVar) {
        this(xmlPullParser, (i12 & 2) != 0 ? 0 : i11);
    }
}
