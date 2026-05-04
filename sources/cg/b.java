package cg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b {
    public static final void a(@k ViewPager2 viewPager2, int i11, int i12) {
        g0.p(viewPager2, "<this>");
        viewPager2.setOffscreenPageLimit(2);
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setPadding(i11, 0, i11, 0);
            recyclerView.setClipToPadding(false);
        }
        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        if (i12 != 0) {
            compositePageTransformer.addTransformer(new MarginPageTransformer(i12));
        }
        compositePageTransformer.addTransformer(new a());
        viewPager2.setPageTransformer(compositePageTransformer);
    }

    public static /* synthetic */ void b(ViewPager2 viewPager2, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        a(viewPager2, i11, i12);
    }
}
