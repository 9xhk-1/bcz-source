package en;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public interface l {
    @Nullable
    static l c() {
        int i11 = Build.VERSION.SDK_INT;
        if (30 <= i11 && i11 <= 33) {
            return v.c();
        }
        if (i11 >= 34) {
            return v.c();
        }
        return null;
    }

    @NonNull
    Context a(@NonNull Context context, @NonNull Map<Integer, Integer> map);

    boolean b(@NonNull Context context, @NonNull Map<Integer, Integer> map);
}
