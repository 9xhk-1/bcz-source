package rn;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static float f84319a = 1.0f;

    @VisibleForTesting
    public static void b(float f11) {
        f84319a = f11;
    }

    public float a(@NonNull ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
