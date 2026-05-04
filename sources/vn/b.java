package vn;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e f94085a;

    /* renamed from: b, reason: collision with root package name */
    public final float f94086b;

    public b(float f11, @NonNull e eVar) {
        while (eVar instanceof b) {
            eVar = ((b) eVar).f94085a;
            f11 += ((b) eVar).f94086b;
        }
        this.f94085a = eVar;
        this.f94086b = f11;
    }

    @Override // vn.e
    public float a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f94085a.a(rectF) + this.f94086b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f94085a.equals(bVar.f94085a) && this.f94086b == bVar.f94086b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f94085a, Float.valueOf(this.f94086b)});
    }
}
