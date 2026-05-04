package vn;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final float f94084a;

    public a(float f11) {
        this.f94084a = f11;
    }

    @Override // vn.e
    public float a(@NonNull RectF rectF) {
        return this.f94084a;
    }

    public float b() {
        return this.f94084a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f94084a == ((a) obj).f94084a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f94084a)});
    }
}
