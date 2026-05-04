package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class TypedArrayUtils {
    private static final String NAMESPACE = "http://schemas.android.com/apk/res/android";

    private TypedArrayUtils() {
    }

    public static int getAttr(@NonNull Context context, int i11, int i12) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.resourceId != 0 ? i11 : i12;
    }

    public static boolean getBoolean(@NonNull TypedArray typedArray, @StyleableRes int i11, @StyleableRes int i12, boolean z11) {
        return typedArray.getBoolean(i11, typedArray.getBoolean(i12, z11));
    }

    @Nullable
    public static Drawable getDrawable(@NonNull TypedArray typedArray, @StyleableRes int i11, @StyleableRes int i12) {
        Drawable drawable = typedArray.getDrawable(i11);
        return drawable == null ? typedArray.getDrawable(i12) : drawable;
    }

    public static int getInt(@NonNull TypedArray typedArray, @StyleableRes int i11, @StyleableRes int i12, int i13) {
        return typedArray.getInt(i11, typedArray.getInt(i12, i13));
    }

    public static boolean getNamedBoolean(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i11, boolean z11) {
        return !hasAttribute(xmlPullParser, str) ? z11 : typedArray.getBoolean(i11, z11);
    }

    @ColorInt
    public static int getNamedColor(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i11, @ColorInt int i12) {
        return !hasAttribute(xmlPullParser, str) ? i12 : typedArray.getColor(i11, i12);
    }

    @Nullable
    public static ColorStateList getNamedColorStateList(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @StyleableRes int i11) {
        if (!hasAttribute(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i11, typedValue);
        int i12 = typedValue.type;
        if (i12 != 2) {
            return (i12 < 28 || i12 > 31) ? ColorStateListInflaterCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i11, 0), theme) : getNamedColorStateListFromInt(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i11 + ": " + typedValue);
    }

    @NonNull
    private static ColorStateList getNamedColorStateListFromInt(@NonNull TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static ComplexColorCompat getNamedComplexColor(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @StyleableRes int i11, @ColorInt int i12) {
        if (hasAttribute(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i11, typedValue);
            int i13 = typedValue.type;
            if (i13 >= 28 && i13 <= 31) {
                return ComplexColorCompat.from(typedValue.data);
            }
            ComplexColorCompat inflate = ComplexColorCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i11, 0), theme);
            if (inflate != null) {
                return inflate;
            }
        }
        return ComplexColorCompat.from(i12);
    }

    public static float getNamedFloat(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i11, float f11) {
        return !hasAttribute(xmlPullParser, str) ? f11 : typedArray.getFloat(i11, f11);
    }

    public static int getNamedInt(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i11, int i12) {
        return !hasAttribute(xmlPullParser, str) ? i12 : typedArray.getInt(i11, i12);
    }

    @AnyRes
    public static int getNamedResourceId(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i11, @AnyRes int i12) {
        return !hasAttribute(xmlPullParser, str) ? i12 : typedArray.getResourceId(i11, i12);
    }

    @Nullable
    public static String getNamedString(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i11) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.getString(i11);
        }
        return null;
    }

    @AnyRes
    public static int getResourceId(@NonNull TypedArray typedArray, @StyleableRes int i11, @StyleableRes int i12, @AnyRes int i13) {
        return typedArray.getResourceId(i11, typedArray.getResourceId(i12, i13));
    }

    @Nullable
    public static String getString(@NonNull TypedArray typedArray, @StyleableRes int i11, @StyleableRes int i12) {
        String string = typedArray.getString(i11);
        return string == null ? typedArray.getString(i12) : string;
    }

    @Nullable
    public static CharSequence getText(@NonNull TypedArray typedArray, @StyleableRes int i11, @StyleableRes int i12) {
        CharSequence text = typedArray.getText(i11);
        return text == null ? typedArray.getText(i12) : text;
    }

    @Nullable
    public static CharSequence[] getTextArray(@NonNull TypedArray typedArray, @StyleableRes int i11, @StyleableRes int i12) {
        CharSequence[] textArray = typedArray.getTextArray(i11);
        return textArray == null ? typedArray.getTextArray(i12) : textArray;
    }

    public static boolean hasAttribute(@NonNull XmlPullParser xmlPullParser, @NonNull String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @NonNull
    public static TypedArray obtainAttributes(@NonNull Resources resources, @Nullable Resources.Theme theme, @NonNull AttributeSet attributeSet, @NonNull int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @Nullable
    public static TypedValue peekNamedValue(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, int i11) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.peekValue(i11);
        }
        return null;
    }
}
