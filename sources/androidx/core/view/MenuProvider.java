package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface MenuProvider {
    void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater);

    boolean onMenuItemSelected(@NonNull MenuItem menuItem);

    default void onMenuClosed(@NonNull Menu menu) {
    }

    default void onPrepareMenu(@NonNull Menu menu) {
    }
}
