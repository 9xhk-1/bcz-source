package eu;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f50148a;

    /* renamed from: b, reason: collision with root package name */
    public final iu.b f50149b;

    /* renamed from: c, reason: collision with root package name */
    public final fu.a f50150c;

    /* renamed from: d, reason: collision with root package name */
    public final gu.a f50151d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f50152e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f50153f = new Rect();

    public b(d adapter, fu.a headerProvider, iu.b orientationProvider, gu.a dimensionCalculator) {
        this.f50148a = adapter;
        this.f50150c = headerProvider;
        this.f50149b = orientationProvider;
        this.f50151d = dimensionCalculator;
    }

    public final View a(RecyclerView parent, View firstHeader) {
        boolean b11 = this.f50149b.b(parent);
        int i11 = b11 ? -1 : 1;
        for (int childCount = b11 ? parent.getChildCount() - 1 : 0; childCount >= 0 && childCount <= parent.getChildCount() - 1; childCount += i11) {
            View childAt = parent.getChildAt(childCount);
            if (!j(parent, childAt, firstHeader, this.f50149b.a(parent))) {
                return childAt;
            }
        }
        return null;
    }

    public final int b(RecyclerView view) {
        if (view.getLayoutManager().getClipToPadding()) {
            return view.getPaddingLeft();
        }
        return 0;
    }

    public final int c(RecyclerView view) {
        if (view.getLayoutManager().getClipToPadding()) {
            return view.getPaddingTop();
        }
        return 0;
    }

    public boolean d(int position, boolean isReverseLayout) {
        if (f(position)) {
            return false;
        }
        long c11 = this.f50148a.c(position);
        if (c11 < 0) {
            return false;
        }
        int i11 = (isReverseLayout ? 1 : -1) + position;
        return position == (isReverseLayout ? this.f50148a.getItemCount() - 1 : 0) || c11 != (!f(i11) ? this.f50148a.c(i11) : -1L);
    }

    public boolean e(View itemView, int orientation, int position) {
        int left;
        int i11;
        this.f50151d.b(this.f50152e, itemView);
        if (orientation == 1) {
            left = itemView.getTop();
            i11 = this.f50152e.top;
        } else {
            left = itemView.getLeft();
            i11 = this.f50152e.left;
        }
        return left <= i11 && this.f50148a.c(position) >= 0;
    }

    public final boolean f(int position) {
        return position < 0 || position >= this.f50148a.getItemCount();
    }

    public final void g(Rect headerMargins, RecyclerView recyclerView, View header, View firstView, int orientation) {
        int i11;
        int i12;
        int max;
        int i13;
        this.f50151d.b(this.f50152e, header);
        ViewGroup.LayoutParams layoutParams = firstView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i11 = marginLayoutParams.leftMargin;
            i12 = marginLayoutParams.topMargin;
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (orientation == 1) {
            max = (firstView.getLeft() - i11) + this.f50152e.left;
            i13 = Math.max(((firstView.getTop() - i12) - header.getHeight()) - this.f50152e.bottom, c(recyclerView) + this.f50152e.top);
        } else {
            int top = (firstView.getTop() - i12) + this.f50152e.top;
            max = Math.max(((firstView.getLeft() - i11) - header.getWidth()) - this.f50152e.right, b(recyclerView) + this.f50152e.left);
            i13 = top;
        }
        headerMargins.set(max, i13, header.getWidth() + max, header.getHeight() + i13);
    }

    public void h(Rect bounds, RecyclerView recyclerView, View header, View firstView, boolean firstHeader) {
        g(bounds, recyclerView, header, firstView, this.f50149b.a(recyclerView));
        if (firstHeader && i(recyclerView, header)) {
            View a11 = a(recyclerView, header);
            k(recyclerView, this.f50149b.a(recyclerView), bounds, header, a11, this.f50150c.a(recyclerView, recyclerView.getChildAdapterPosition(a11)));
        }
    }

    public final boolean i(RecyclerView recyclerView, View stickyHeader) {
        View a11 = a(recyclerView, stickyHeader);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(a11);
        if (childAdapterPosition == -1) {
            return false;
        }
        boolean b11 = this.f50149b.b(recyclerView);
        if (childAdapterPosition > 0 && d(childAdapterPosition, b11)) {
            View a12 = this.f50150c.a(recyclerView, childAdapterPosition);
            this.f50151d.b(this.f50152e, a12);
            this.f50151d.b(this.f50153f, stickyHeader);
            if (this.f50149b.a(recyclerView) == 1) {
                int top = ((a11.getTop() - this.f50152e.bottom) - a12.getHeight()) - this.f50152e.top;
                int paddingTop = recyclerView.getPaddingTop() + stickyHeader.getBottom();
                Rect rect = this.f50153f;
                if (top < paddingTop + rect.top + rect.bottom) {
                    return true;
                }
            } else {
                int left = ((a11.getLeft() - this.f50152e.right) - a12.getWidth()) - this.f50152e.left;
                int paddingLeft = recyclerView.getPaddingLeft() + stickyHeader.getRight();
                Rect rect2 = this.f50153f;
                if (left < paddingLeft + rect2.left + rect2.right) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j(RecyclerView parent, View item, View header, int orientation) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) item.getLayoutParams();
        this.f50151d.b(this.f50152e, header);
        int childAdapterPosition = parent.getChildAdapterPosition(item);
        if (childAdapterPosition == -1 || this.f50150c.a(parent, childAdapterPosition) != header) {
            return false;
        }
        if (orientation == 1) {
            int top = item.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int bottom = header.getBottom();
            Rect rect = this.f50152e;
            if (top > bottom + rect.bottom + rect.top) {
                return false;
            }
        } else {
            int left = item.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int right = header.getRight();
            Rect rect2 = this.f50152e;
            if (left > right + rect2.right + rect2.left) {
                return false;
            }
        }
        return true;
    }

    public final void k(RecyclerView recyclerView, int orientation, Rect translation, View currentHeader, View viewAfterNextHeader, View nextHeader) {
        this.f50151d.b(this.f50152e, nextHeader);
        this.f50151d.b(this.f50153f, currentHeader);
        if (orientation == 1) {
            int c11 = c(recyclerView);
            Rect rect = this.f50153f;
            int i11 = c11 + rect.top + rect.bottom;
            int top = viewAfterNextHeader.getTop() - nextHeader.getHeight();
            Rect rect2 = this.f50152e;
            int height = (((top - rect2.bottom) - rect2.top) - currentHeader.getHeight()) - i11;
            if (height < i11) {
                translation.top += height;
                return;
            }
            return;
        }
        int b11 = b(recyclerView);
        Rect rect3 = this.f50153f;
        int i12 = b11 + rect3.left + rect3.right;
        int left = viewAfterNextHeader.getLeft() - nextHeader.getWidth();
        Rect rect4 = this.f50152e;
        int width = (((left - rect4.right) - rect4.left) - currentHeader.getWidth()) - i12;
        if (width < i12) {
            translation.left += width;
        }
    }
}
