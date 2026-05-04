package androidx.compose.runtime.internal;

import com.google.common.math.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FloatingPointEquality_androidKt {
    public static final boolean equalsWithNanFix(double d11, double d12) {
        return d11 == d12;
    }

    public static final boolean isNan(float f11) {
        return (Float.floatToRawIntBits(f11) & Integer.MAX_VALUE) > 2139095040;
    }

    public static final boolean equalsWithNanFix(float f11, float f12) {
        return f11 == f12;
    }

    public static final boolean isNan(double d11) {
        return (Double.doubleToRawLongBits(d11) & Long.MAX_VALUE) > d.f34310b;
    }
}
