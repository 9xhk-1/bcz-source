package vm;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f94060a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f94061b = new FastOutSlowInInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f94062c = new FastOutLinearInInterpolator();

    /* renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f94063d = new LinearOutSlowInInterpolator();

    /* renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f94064e = new DecelerateInterpolator();

    public static float a(float f11, float f12, float f13) {
        return f11 + (f13 * (f12 - f11));
    }

    public static float b(float f11, float f12, float f13, float f14, float f15) {
        return f15 <= f13 ? f11 : f15 >= f14 ? f12 : a(f11, f12, (f15 - f13) / (f14 - f13));
    }

    public static int c(int i11, int i12, float f11) {
        return i11 + Math.round(f11 * (i12 - i11));
    }
}
