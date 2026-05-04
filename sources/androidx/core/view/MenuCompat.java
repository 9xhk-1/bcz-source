package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenu;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MenuCompat {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static void setGroupDividerEnabled(Menu menu, boolean z11) {
            menu.setGroupDividerEnabled(z11);
        }
    }

    private MenuCompat() {
    }

    public static void setGroupDividerEnabled(@NonNull Menu menu, boolean z11) {
        if (menu instanceof SupportMenu) {
            ((SupportMenu) menu).setGroupDividerEnabled(z11);
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setGroupDividerEnabled(menu, z11);
        }
    }

    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i11) {
        menuItem.setShowAsAction(i11);
    }
}
