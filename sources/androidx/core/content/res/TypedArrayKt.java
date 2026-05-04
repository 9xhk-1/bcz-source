package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class TypedArrayKt {
    private static final void checkAttribute(TypedArray typedArray, @StyleableRes int i11) {
        if (!typedArray.hasValue(i11)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean getBooleanOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        return typedArray.getBoolean(i11, false);
    }

    @ColorInt
    public static final int getColorOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        return typedArray.getColor(i11, 0);
    }

    @k
    public static final ColorStateList getColorStateListOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        ColorStateList colorStateList = typedArray.getColorStateList(i11);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.");
    }

    public static final float getDimensionOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        return typedArray.getDimension(i11, 0.0f);
    }

    @Dimension
    public static final int getDimensionPixelOffsetOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        return typedArray.getDimensionPixelOffset(i11, 0);
    }

    @Dimension
    public static final int getDimensionPixelSizeOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        return typedArray.getDimensionPixelSize(i11, 0);
    }

    @k
    public static final Drawable getDrawableOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        Drawable drawable = typedArray.getDrawable(i11);
        g0.m(drawable);
        return drawable;
    }

    public static final float getFloatOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        return typedArray.getFloat(i11, 0.0f);
    }

    @RequiresApi(26)
    @k
    public static final Typeface getFontOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        return TypedArrayApi26ImplKt.getFont(typedArray, i11);
    }

    public static final int getIntOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        return typedArray.getInt(i11, 0);
    }

    public static final int getIntegerOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        return typedArray.getInteger(i11, 0);
    }

    @AnyRes
    public static final int getResourceIdOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        return typedArray.getResourceId(i11, 0);
    }

    @k
    public static final String getStringOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        String string = typedArray.getString(i11);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.");
    }

    @k
    public static final CharSequence[] getTextArrayOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        return typedArray.getTextArray(i11);
    }

    @k
    public static final CharSequence getTextOrThrow(@k TypedArray typedArray, @StyleableRes int i11) {
        checkAttribute(typedArray, i11);
        CharSequence text = typedArray.getText(i11);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.");
    }

    public static final <R> R use(@k TypedArray typedArray, @k l<? super TypedArray, ? extends R> lVar) {
        R invoke = lVar.invoke(typedArray);
        typedArray.recycle();
        return invoke;
    }
}
