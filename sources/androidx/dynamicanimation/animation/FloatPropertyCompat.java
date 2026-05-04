package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class FloatPropertyCompat<T> {
    final String mPropertyName;

    public FloatPropertyCompat(String str) {
        this.mPropertyName = str;
    }

    @RequiresApi(24)
    public static <T> FloatPropertyCompat<T> createFloatPropertyCompat(final FloatProperty<T> floatProperty) {
        return new FloatPropertyCompat<T>(floatProperty.getName()) { // from class: androidx.dynamicanimation.animation.FloatPropertyCompat.1
            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(T t11) {
                return ((Float) floatProperty.get(t11)).floatValue();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(T t11, float f11) {
                floatProperty.setValue(t11, f11);
            }
        };
    }

    public abstract float getValue(T t11);

    public abstract void setValue(T t11, float f11);
}
