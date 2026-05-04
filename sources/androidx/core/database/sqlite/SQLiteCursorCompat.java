package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SQLiteCursorCompat {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static void setFillWindowForwardOnly(SQLiteCursor sQLiteCursor, boolean z11) {
            sQLiteCursor.setFillWindowForwardOnly(z11);
        }
    }

    private SQLiteCursorCompat() {
    }

    public static void setFillWindowForwardOnly(@NonNull SQLiteCursor sQLiteCursor, boolean z11) {
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setFillWindowForwardOnly(sQLiteCursor, z11);
        }
    }
}
