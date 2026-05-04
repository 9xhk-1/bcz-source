package p50;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {
    public i() {
        throw new AssertionError();
    }

    public static void a(@NonNull h hVar, @NonNull List<?> list) throws a, IllegalArgumentException, IllegalAccessError {
        o.a(hVar);
        o.a(list);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Your Items/List is empty.");
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            hVar.g(i11, list.get(0));
        }
    }

    public static void b(@NonNull RecyclerView recyclerView, @NonNull h hVar) throws IllegalArgumentException, IllegalAccessError {
        o.a(recyclerView);
        o.a(hVar);
        if (recyclerView.getAdapter() == null) {
            throw new IllegalAccessError("The assertHasTheSameAdapter() method must be placed after recyclerView.setAdapter()");
        }
        if (recyclerView.getAdapter() != hVar) {
            throw new IllegalArgumentException("Your recyclerView's adapter is not the sample with the argument adapter.");
        }
    }
}
