package lf;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {
    @BindingAdapter({"locations"})
    public static void a(RecyclerView recyclerView, List<gf.b> locationInfos) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter instanceof b) {
            ((b) adapter).d(locationInfos);
        }
    }
}
