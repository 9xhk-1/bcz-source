package iu;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a implements b {
    @Override // iu.b
    public int a(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        c(layoutManager);
        return ((LinearLayoutManager) layoutManager).getOrientation();
    }

    @Override // iu.b
    public boolean b(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        c(layoutManager);
        return ((LinearLayoutManager) layoutManager).getReverseLayout();
    }

    public final void c(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new IllegalStateException("StickyListHeadersDecoration can only be used with a LinearLayoutManager.");
        }
    }
}
