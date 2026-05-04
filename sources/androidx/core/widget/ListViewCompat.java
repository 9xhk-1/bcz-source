package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes2.dex */
public final class ListViewCompat {
    private ListViewCompat() {
    }

    @Deprecated
    public static boolean canScrollList(@NonNull ListView listView, int i11) {
        return listView.canScrollList(i11);
    }

    @Deprecated
    public static void scrollListBy(@NonNull ListView listView, int i11) {
        listView.scrollListBy(i11);
    }
}
