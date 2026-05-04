package vi;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j {
    public static final void c(@k ViewPager2 viewPager2) {
        g0.p(viewPager2, "<this>");
        f(viewPager2);
    }

    public static final void d(@k final ViewPager2 viewPager2) {
        g0.p(viewPager2, "<this>");
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: vi.h
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                j.e(ViewPager2.this);
            }
        });
    }

    public static final void e(ViewPager2 viewPager2) {
        f(viewPager2);
    }

    public static final void f(@k final ViewPager2 viewPager2) {
        g0.p(viewPager2, "<this>");
        viewPager2.post(new Runnable() { // from class: vi.i
            @Override // java.lang.Runnable
            public final void run() {
                j.g(ViewPager2.this);
            }
        });
    }

    public static final void g(ViewPager2 viewPager2) {
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(viewPager2.getCurrentItem());
        View view = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView : null;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(viewPager2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight <= 0 || viewPager2.getLayoutParams().height == measuredHeight) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
            layoutParams.height = measuredHeight;
            viewPager2.setLayoutParams(layoutParams);
        }
    }
}
