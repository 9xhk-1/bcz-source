package pf;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {
    @BindingAdapter({"schools"})
    public static void a(RecyclerView recyclerView, List<gf.d> schools) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter instanceof c) {
            ((c) adapter).g(schools);
        }
    }

    @BindingAdapter({"searchWord"})
    public static void b(RecyclerView recyclerView, String s11) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter instanceof c) {
            ((c) adapter).h(s11);
        }
    }
}
