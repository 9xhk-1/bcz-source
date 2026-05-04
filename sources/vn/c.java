package vn;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final float f94087a;

    public c(float f11) {
        this.f94087a = f11;
    }

    @NonNull
    public static c b(@NonNull a aVar) {
        return new c(aVar.b());
    }

    public static float c(@NonNull RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // vn.e
    public float a(@NonNull RectF rectF) {
        return Math.min(this.f94087a, c(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f94087a == ((c) obj).f94087a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f94087a)});
    }
}
