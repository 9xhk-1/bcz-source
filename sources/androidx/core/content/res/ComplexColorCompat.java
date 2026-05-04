package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class ComplexColorCompat {
    private static final String LOG_TAG = "ComplexColorCompat";
    private int mColor;
    private final ColorStateList mColorStateList;
    private final Shader mShader;

    private ComplexColorCompat(Shader shader, ColorStateList colorStateList, @ColorInt int i11) {
        this.mShader = shader;
        this.mColorStateList = colorStateList;
        this.mColor = i11;
    }

    @NonNull
    private static ComplexColorCompat createFromXml(@NonNull Resources resources, @ColorRes int i11, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i11);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return from(GradientColorInflaterCompat.createFromXmlInner(resources, xml, asAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return from(ColorStateListInflaterCompat.createFromXmlInner(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    public static ComplexColorCompat from(@NonNull Shader shader) {
        return new ComplexColorCompat(shader, null, 0);
    }

    @Nullable
    public static ComplexColorCompat inflate(@NonNull Resources resources, @ColorRes int i11, @Nullable Resources.Theme theme) {
        try {
            return createFromXml(resources, i11, theme);
        } catch (Exception e11) {
            Log.e(LOG_TAG, "Failed to inflate ComplexColor.", e11);
            return null;
        }
    }

    @ColorInt
    public int getColor() {
        return this.mColor;
    }

    @Nullable
    public Shader getShader() {
        return this.mShader;
    }

    public boolean isGradient() {
        return this.mShader != null;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        return this.mShader == null && (colorStateList = this.mColorStateList) != null && colorStateList.isStateful();
    }

    public boolean onStateChanged(int[] iArr) {
        if (!isStateful()) {
            return false;
        }
        ColorStateList colorStateList = this.mColorStateList;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.mColor) {
            return false;
        }
        this.mColor = colorForState;
        return true;
    }

    public void setColor(@ColorInt int i11) {
        this.mColor = i11;
    }

    public boolean willDraw() {
        return isGradient() || this.mColor != 0;
    }

    public static ComplexColorCompat from(@NonNull ColorStateList colorStateList) {
        return new ComplexColorCompat(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static ComplexColorCompat from(@ColorInt int i11) {
        return new ComplexColorCompat(null, null, i11);
    }
}
