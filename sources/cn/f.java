package cn;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f extends SnapHelper {

    /* renamed from: c, reason: collision with root package name */
    public static final float f9273c = 100.0f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f9274d = 50.0f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9275a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f9276b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends LinearSmoothScroller {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.LayoutManager f9277a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, RecyclerView.LayoutManager layoutManager) {
            super(context);
            this.f9277a = layoutManager;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            float f11;
            float f12;
            if (this.f9277a.canScrollVertically()) {
                f11 = displayMetrics.densityDpi;
                f12 = 50.0f;
            } else {
                f11 = displayMetrics.densityDpi;
                f12 = 100.0f;
            }
            return f12 / f11;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            if (f.this.f9276b != null) {
                f fVar = f.this;
                int[] c11 = fVar.c(fVar.f9276b.getLayoutManager(), view, true);
                int i11 = c11[0];
                int i12 = c11[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i11), Math.abs(i12)));
                if (calculateTimeForDeceleration > 0) {
                    action.update(i11, i12, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                }
            }
        }
    }

    public f() {
        this(true);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.f9276b = recyclerView;
    }

    public final int[] c(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view, boolean z11) {
        if (!(layoutManager instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int d11 = d(view, (CarouselLayoutManager) layoutManager, z11);
        return layoutManager.canScrollHorizontally() ? new int[]{d11, 0} : layoutManager.canScrollVertically() ? new int[]{0, d11} : new int[]{0, 0};
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        return c(layoutManager, view, false);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new a(this.f9276b.getContext(), layoutManager);
        }
        return null;
    }

    public final int d(@NonNull View view, CarouselLayoutManager carouselLayoutManager, boolean z11) {
        return carouselLayoutManager.E(carouselLayoutManager.getPosition(view), z11);
    }

    @Nullable
    public final View e(RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount != 0 && (layoutManager instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = layoutManager.getChildAt(i12);
                int abs = Math.abs(carouselLayoutManager.E(layoutManager.getPosition(childAt), false));
                if (abs < i11) {
                    view = childAt;
                    i11 = abs;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return e(layoutManager);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i11, int i12) {
        int itemCount;
        if (!this.f9275a || (itemCount = layoutManager.getItemCount()) == 0) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = layoutManager.getChildAt(i15);
            if (childAt != null) {
                int d11 = d(childAt, (CarouselLayoutManager) layoutManager, false);
                if (d11 <= 0 && d11 > i14) {
                    view2 = childAt;
                    i14 = d11;
                }
                if (d11 >= 0 && d11 < i13) {
                    view = childAt;
                    i13 = d11;
                }
            }
        }
        boolean isForwardFling = isForwardFling(layoutManager, i11, i12);
        if (isForwardFling && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!isForwardFling && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (isForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view) + (isReverseLayout(layoutManager) == isForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    public final boolean isForwardFling(RecyclerView.LayoutManager layoutManager, int i11, int i12) {
        return layoutManager.canScrollHorizontally() ? i11 > 0 : i12 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isReverseLayout(RecyclerView.LayoutManager layoutManager) {
        PointF computeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f;
    }

    public f(boolean z11) {
        this.f9275a = z11;
    }
}
