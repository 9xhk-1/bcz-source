package vn;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class n implements e {

    /* renamed from: a, reason: collision with root package name */
    public final float f94152a;

    public n(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        this.f94152a = f11;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static n b(@NonNull RectF rectF, @NonNull e eVar) {
        return eVar instanceof n ? (n) eVar : new n(eVar.a(rectF) / c(rectF));
    }

    private static float c(@NonNull RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // vn.e
    public float a(@NonNull RectF rectF) {
        return this.f94152a * c(rectF);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float d() {
        return this.f94152a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f94152a == ((n) obj).f94152a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f94152a)});
    }
}
