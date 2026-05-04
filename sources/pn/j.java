package pn;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.core.graphics.PathParser;
import androidx.core.view.animation.PathInterpolatorCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f81004a = "cubic-bezier";

    /* renamed from: b, reason: collision with root package name */
    public static final String f81005b = "path";

    /* renamed from: c, reason: collision with root package name */
    public static final String f81006c = "(";

    /* renamed from: d, reason: collision with root package name */
    public static final String f81007d = ")";

    public static float a(String[] strArr, int i11) {
        float parseFloat = Float.parseFloat(strArr[i11]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    public static TimeInterpolator c(String str) {
        if (!e(str, f81004a)) {
            if (e(str, "path")) {
                return PathInterpolatorCompat.create(PathParser.createPathFromPathData(b(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] split = b(str, f81004a).split(",");
        if (split.length == 4) {
            return PathInterpolatorCompat.create(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
    }

    public static boolean d(String str) {
        return e(str, f81004a) || e(str, "path");
    }

    public static boolean e(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(f81006c);
        return str.startsWith(sb2.toString()) && str.endsWith(f81007d);
    }

    public static int f(@NonNull Context context, @AttrRes int i11, int i12) {
        return sn.b.e(context, i11, i12);
    }

    @NonNull
    public static TimeInterpolator g(@NonNull Context context, @AttrRes int i11, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i11, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        return d(valueOf) ? c(valueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }
}
