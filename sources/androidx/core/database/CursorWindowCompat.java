package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CursorWindowCompat {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static CursorWindow createCursorWindow(String str, long j11) {
            return new CursorWindow(str, j11);
        }
    }

    private CursorWindowCompat() {
    }

    @NonNull
    public static CursorWindow create(@Nullable String str, long j11) {
        return Build.VERSION.SDK_INT >= 28 ? Api28Impl.createCursorWindow(str, j11) : new CursorWindow(str);
    }
}
