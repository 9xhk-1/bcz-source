package com.jay.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.jay.widget.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class StickyHeadersStaggeredGridLayoutManager<T extends RecyclerView.Adapter & com.jay.widget.a> extends StaggeredGridLayoutManager {

    /* renamed from: j, reason: collision with root package name */
    public static final int f38798j = Integer.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public T f38799a;

    /* renamed from: b, reason: collision with root package name */
    public float f38800b;

    /* renamed from: c, reason: collision with root package name */
    public float f38801c;

    /* renamed from: d, reason: collision with root package name */
    public List<Integer> f38802d;

    /* renamed from: e, reason: collision with root package name */
    public RecyclerView.AdapterDataObserver f38803e;

    /* renamed from: f, reason: collision with root package name */
    public View f38804f;

    /* renamed from: g, reason: collision with root package name */
    public int f38805g;

    /* renamed from: h, reason: collision with root package name */
    public int f38806h;

    /* renamed from: i, reason: collision with root package name */
    public int f38807i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public Parcelable f38808a;

        /* renamed from: b, reason: collision with root package name */
        public int f38809b;

        /* renamed from: c, reason: collision with root package name */
        public int f38810c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            parcel.writeParcelable(this.f38808a, i11);
            parcel.writeInt(this.f38809b);
            parcel.writeInt(this.f38810c);
        }

        public SavedState(Parcel parcel) {
            this.f38808a = parcel.readParcelable(SavedState.class.getClassLoader());
            this.f38809b = parcel.readInt();
            this.f38810c = parcel.readInt();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserver f38811a;

        public a(ViewTreeObserver viewTreeObserver) {
            this.f38811a = viewTreeObserver;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f38811a.removeOnGlobalLayoutListener(this);
            if (StickyHeadersStaggeredGridLayoutManager.this.f38806h != -1) {
                StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager = StickyHeadersStaggeredGridLayoutManager.this;
                stickyHeadersStaggeredGridLayoutManager.scrollToPositionWithOffset(stickyHeadersStaggeredGridLayoutManager.f38806h, StickyHeadersStaggeredGridLayoutManager.this.f38807i);
                StickyHeadersStaggeredGridLayoutManager.this.D(-1, Integer.MIN_VALUE);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends RecyclerView.AdapterDataObserver {
        public b() {
        }

        private void a(int i11) {
            Integer num = (Integer) StickyHeadersStaggeredGridLayoutManager.this.f38802d.remove(i11);
            int t11 = StickyHeadersStaggeredGridLayoutManager.this.t(num.intValue());
            if (t11 != -1) {
                StickyHeadersStaggeredGridLayoutManager.this.f38802d.add(t11, num);
            } else {
                StickyHeadersStaggeredGridLayoutManager.this.f38802d.add(num);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            StickyHeadersStaggeredGridLayoutManager.this.f38802d.clear();
            int itemCount = StickyHeadersStaggeredGridLayoutManager.this.f38799a.getItemCount();
            for (int i11 = 0; i11 < itemCount; i11++) {
                if (((com.jay.widget.a) StickyHeadersStaggeredGridLayoutManager.this.f38799a).a(i11)) {
                    StickyHeadersStaggeredGridLayoutManager.this.f38802d.add(Integer.valueOf(i11));
                }
            }
            if (StickyHeadersStaggeredGridLayoutManager.this.f38804f == null || StickyHeadersStaggeredGridLayoutManager.this.f38802d.contains(Integer.valueOf(StickyHeadersStaggeredGridLayoutManager.this.f38805g))) {
                return;
            }
            StickyHeadersStaggeredGridLayoutManager.this.A(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i11, int i12) {
            int size = StickyHeadersStaggeredGridLayoutManager.this.f38802d.size();
            if (size > 0) {
                for (int t11 = StickyHeadersStaggeredGridLayoutManager.this.t(i11); t11 != -1 && t11 < size; t11++) {
                    StickyHeadersStaggeredGridLayoutManager.this.f38802d.set(t11, Integer.valueOf(((Integer) StickyHeadersStaggeredGridLayoutManager.this.f38802d.get(t11)).intValue() + i12));
                }
            }
            for (int i13 = i11; i13 < i11 + i12; i13++) {
                if (((com.jay.widget.a) StickyHeadersStaggeredGridLayoutManager.this.f38799a).a(i13)) {
                    int t12 = StickyHeadersStaggeredGridLayoutManager.this.t(i13);
                    if (t12 != -1) {
                        StickyHeadersStaggeredGridLayoutManager.this.f38802d.add(t12, Integer.valueOf(i13));
                    } else {
                        StickyHeadersStaggeredGridLayoutManager.this.f38802d.add(Integer.valueOf(i13));
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i11, int i12, int i13) {
            int size = StickyHeadersStaggeredGridLayoutManager.this.f38802d.size();
            if (size > 0) {
                if (i11 < i12) {
                    for (int t11 = StickyHeadersStaggeredGridLayoutManager.this.t(i11); t11 != -1 && t11 < size; t11++) {
                        int intValue = ((Integer) StickyHeadersStaggeredGridLayoutManager.this.f38802d.get(t11)).intValue();
                        if (intValue >= i11 && intValue < i11 + i13) {
                            StickyHeadersStaggeredGridLayoutManager.this.f38802d.set(t11, Integer.valueOf(intValue - (i12 - i11)));
                            a(t11);
                        } else {
                            if (intValue < i11 + i13 || intValue > i12) {
                                return;
                            }
                            StickyHeadersStaggeredGridLayoutManager.this.f38802d.set(t11, Integer.valueOf(intValue - i13));
                            a(t11);
                        }
                    }
                    return;
                }
                for (int t12 = StickyHeadersStaggeredGridLayoutManager.this.t(i12); t12 != -1 && t12 < size; t12++) {
                    int intValue2 = ((Integer) StickyHeadersStaggeredGridLayoutManager.this.f38802d.get(t12)).intValue();
                    if (intValue2 >= i11 && intValue2 < i11 + i13) {
                        StickyHeadersStaggeredGridLayoutManager.this.f38802d.set(t12, Integer.valueOf(intValue2 + (i12 - i11)));
                        a(t12);
                    } else {
                        if (intValue2 < i12 || intValue2 > i11) {
                            return;
                        }
                        StickyHeadersStaggeredGridLayoutManager.this.f38802d.set(t12, Integer.valueOf(intValue2 + i13));
                        a(t12);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i11, int i12) {
            int size = StickyHeadersStaggeredGridLayoutManager.this.f38802d.size();
            if (size > 0) {
                int i13 = i11 + i12;
                for (int i14 = i13 - 1; i14 >= i11; i14--) {
                    int r11 = StickyHeadersStaggeredGridLayoutManager.this.r(i14);
                    if (r11 != -1) {
                        StickyHeadersStaggeredGridLayoutManager.this.f38802d.remove(r11);
                        size--;
                    }
                }
                if (StickyHeadersStaggeredGridLayoutManager.this.f38804f != null && !StickyHeadersStaggeredGridLayoutManager.this.f38802d.contains(Integer.valueOf(StickyHeadersStaggeredGridLayoutManager.this.f38805g))) {
                    StickyHeadersStaggeredGridLayoutManager.this.A(null);
                }
                for (int t11 = StickyHeadersStaggeredGridLayoutManager.this.t(i13); t11 != -1 && t11 < size; t11++) {
                    StickyHeadersStaggeredGridLayoutManager.this.f38802d.set(t11, Integer.valueOf(((Integer) StickyHeadersStaggeredGridLayoutManager.this.f38802d.get(t11)).intValue() - i12));
                }
            }
        }

        public /* synthetic */ b(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager, a aVar) {
            this();
        }
    }

    public StickyHeadersStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f38802d = new ArrayList(0);
        this.f38803e = new b(this, null);
        this.f38805g = -1;
        this.f38806h = -1;
        this.f38807i = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(@Nullable RecyclerView.Recycler recycler) {
        View view = this.f38804f;
        this.f38804f = null;
        this.f38805g = -1;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        T t11 = this.f38799a;
        if (t11 instanceof a.InterfaceC0467a) {
            ((a.InterfaceC0467a) t11).b(view);
        }
        stopIgnoringView(view);
        removeView(view);
        if (recycler != null) {
            recycler.recycleView(view);
        }
    }

    private void B(int i11, int i12, boolean z11) {
        D(-1, Integer.MIN_VALUE);
        if (!z11) {
            super.scrollToPositionWithOffset(i11, i12);
            return;
        }
        int s11 = s(i11);
        if (s11 == -1 || r(i11) != -1) {
            super.scrollToPositionWithOffset(i11, i12);
            return;
        }
        int i13 = i11 - 1;
        if (r(i13) != -1) {
            super.scrollToPositionWithOffset(i13, i12);
            return;
        }
        if (this.f38804f == null || s11 != r(this.f38805g)) {
            D(i11, i12);
            super.scrollToPositionWithOffset(i11, i12);
        } else {
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            super.scrollToPositionWithOffset(i11, i12 + this.f38804f.getHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void C(RecyclerView.Adapter adapter) {
        T t11 = this.f38799a;
        if (t11 != null) {
            t11.unregisterAdapterDataObserver(this.f38803e);
        }
        if (!(adapter instanceof com.jay.widget.a)) {
            this.f38799a = null;
            this.f38802d.clear();
        } else {
            this.f38799a = adapter;
            adapter.registerAdapterDataObserver(this.f38803e);
            this.f38803e.onChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(int i11, int i12) {
        this.f38806h = i11;
        this.f38807i = i12;
    }

    private void G(RecyclerView.Recycler recycler, boolean z11) {
        View view;
        View view2;
        int i11;
        View childAt;
        int size = this.f38802d.size();
        int childCount = getChildCount();
        if (size > 0 && childCount > 0) {
            int i12 = 0;
            while (true) {
                view = null;
                if (i12 >= childCount) {
                    view2 = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                } else {
                    view2 = getChildAt(i12);
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view2.getLayoutParams();
                    if (y(view2, layoutParams)) {
                        i11 = layoutParams.getViewAdapterPosition();
                        break;
                    }
                    i12++;
                }
            }
            if (view2 != null && i11 != -1) {
                int s11 = s(i11);
                int intValue = s11 != -1 ? this.f38802d.get(s11).intValue() : -1;
                int i13 = s11 + 1;
                int intValue2 = size > i13 ? this.f38802d.get(i13).intValue() : -1;
                if (intValue != -1 && ((intValue != i11 || x(view2)) && intValue2 != intValue + 1)) {
                    View view3 = this.f38804f;
                    if (view3 != null && getItemViewType(view3) != this.f38799a.getItemViewType(intValue)) {
                        A(recycler);
                    }
                    if (this.f38804f == null) {
                        p(recycler, intValue);
                    }
                    if (z11 || getPosition(this.f38804f) != intValue) {
                        o(recycler, intValue);
                    }
                    if (intValue2 != -1 && (childAt = getChildAt(i12 + (intValue2 - i11))) != this.f38804f) {
                        view = childAt;
                    }
                    View view4 = this.f38804f;
                    view4.setTranslationX(u(view4, view));
                    View view5 = this.f38804f;
                    view5.setTranslationY(v(view5, view));
                    return;
                }
            }
        }
        if (this.f38804f != null) {
            A(recycler);
        }
    }

    private void n() {
        View view = this.f38804f;
        if (view != null) {
            attachView(view);
        }
    }

    private void o(@NonNull RecyclerView.Recycler recycler, int i11) {
        recycler.bindViewToPosition(this.f38804f, i11);
        this.f38805g = i11;
        z(this.f38804f);
        if (this.f38806h != -1) {
            ViewTreeObserver viewTreeObserver = this.f38804f.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new a(viewTreeObserver));
        }
    }

    private void p(@NonNull RecyclerView.Recycler recycler, int i11) {
        View viewForPosition = recycler.getViewForPosition(i11);
        T t11 = this.f38799a;
        if (t11 instanceof a.InterfaceC0467a) {
            ((a.InterfaceC0467a) t11).a(viewForPosition);
        }
        addView(viewForPosition);
        z(viewForPosition);
        ignoreView(viewForPosition);
        this.f38804f = viewForPosition;
        this.f38805g = i11;
    }

    private void q() {
        View view = this.f38804f;
        if (view != null) {
            detachView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int r(int i11) {
        int size = this.f38802d.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) / 2;
            if (this.f38802d.get(i13).intValue() > i11) {
                size = i13 - 1;
            } else {
                if (this.f38802d.get(i13).intValue() >= i11) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    private int s(int i11) {
        int size = this.f38802d.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) / 2;
            if (this.f38802d.get(i13).intValue() <= i11) {
                if (i13 < this.f38802d.size() - 1) {
                    int i14 = i13 + 1;
                    if (this.f38802d.get(i14).intValue() <= i11) {
                        i12 = i14;
                    }
                }
                return i13;
            }
            size = i13 - 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int t(int i11) {
        int size = this.f38802d.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) / 2;
            if (i13 > 0) {
                int i14 = i13 - 1;
                if (this.f38802d.get(i14).intValue() >= i11) {
                    size = i14;
                }
            }
            if (this.f38802d.get(i13).intValue() >= i11) {
                return i13;
            }
            i12 = i13 + 1;
        }
        return -1;
    }

    private float u(View view, View view2) {
        if (getOrientation() == 1) {
            return this.f38800b;
        }
        float f11 = this.f38800b;
        if (getReverseLayout()) {
            f11 += getWidth() - view.getWidth();
        }
        return view2 != null ? getReverseLayout() ? Math.max(view2.getRight(), f11) : Math.min(view2.getLeft() - view.getWidth(), f11) : f11;
    }

    private float v(View view, View view2) {
        if (getOrientation() != 1) {
            return this.f38801c;
        }
        float f11 = this.f38801c;
        if (getReverseLayout()) {
            f11 += getHeight() - view.getHeight();
        }
        return view2 != null ? getReverseLayout() ? Math.max(view2.getBottom(), f11) : Math.min(view2.getTop() - view.getHeight(), f11) : f11;
    }

    private boolean x(View view) {
        return getOrientation() == 1 ? getReverseLayout() ? ((float) view.getBottom()) - view.getTranslationY() > ((float) getHeight()) + this.f38801c : ((float) view.getTop()) + view.getTranslationY() < this.f38801c : getReverseLayout() ? ((float) view.getRight()) - view.getTranslationX() > ((float) getWidth()) + this.f38800b : ((float) view.getLeft()) + view.getTranslationX() < this.f38800b;
    }

    private boolean y(View view, RecyclerView.LayoutParams layoutParams) {
        if (!layoutParams.isItemRemoved() && !layoutParams.isViewInvalid()) {
            if (getOrientation() == 1) {
                return getReverseLayout() ? ((float) view.getTop()) + view.getTranslationY() <= ((float) getHeight()) + this.f38801c : ((float) view.getBottom()) - view.getTranslationY() >= this.f38801c;
            }
            if (getReverseLayout()) {
                return ((float) view.getLeft()) + view.getTranslationX() <= ((float) getWidth()) + this.f38800b;
            }
            if (view.getRight() - view.getTranslationX() >= this.f38800b) {
                return true;
            }
        }
        return false;
    }

    private void z(View view) {
        measureChildWithMargins(view, 0, 0);
        if (getOrientation() == 1) {
            view.layout(getPaddingLeft(), 0, getWidth() - getPaddingRight(), view.getMeasuredHeight());
        } else {
            view.layout(0, getPaddingTop(), view.getMeasuredWidth(), getHeight() - getPaddingBottom());
        }
    }

    public void E(float f11) {
        this.f38800b = f11;
        requestLayout();
    }

    public void F(float f11) {
        this.f38801c = f11;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        q();
        int computeHorizontalScrollExtent = super.computeHorizontalScrollExtent(state);
        n();
        return computeHorizontalScrollExtent;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        q();
        int computeHorizontalScrollOffset = super.computeHorizontalScrollOffset(state);
        n();
        return computeHorizontalScrollOffset;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        q();
        int computeHorizontalScrollRange = super.computeHorizontalScrollRange(state);
        n();
        return computeHorizontalScrollRange;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i11) {
        q();
        PointF computeScrollVectorForPosition = super.computeScrollVectorForPosition(i11);
        n();
        return computeScrollVectorForPosition;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        q();
        int computeVerticalScrollExtent = super.computeVerticalScrollExtent(state);
        n();
        return computeVerticalScrollExtent;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        q();
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset(state);
        n();
        return computeVerticalScrollOffset;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        q();
        int computeVerticalScrollRange = super.computeVerticalScrollRange(state);
        n();
        return computeVerticalScrollRange;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        super.onAdapterChanged(adapter, adapter2);
        C(adapter2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        C(recyclerView.getAdapter());
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        q();
        View onFocusSearchFailed = super.onFocusSearchFailed(view, i11, recycler, state);
        n();
        return onFocusSearchFailed;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        q();
        super.onLayoutChildren(recycler, state);
        n();
        if (state.isPreLayout()) {
            return;
        }
        G(recycler, true);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f38806h = savedState.f38809b;
            this.f38807i = savedState.f38810c;
            parcelable = savedState.f38808a;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f38808a = super.onSaveInstanceState();
        savedState.f38809b = this.f38806h;
        savedState.f38810c = this.f38807i;
        return savedState;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        q();
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i11, recycler, state);
        n();
        if (scrollHorizontallyBy != 0) {
            G(recycler, false);
        }
        return scrollHorizontallyBy;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i11) {
        scrollToPositionWithOffset(i11, Integer.MIN_VALUE);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
    public void scrollToPositionWithOffset(int i11, int i12) {
        B(i11, i12, true);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        q();
        int scrollVerticallyBy = super.scrollVerticallyBy(i11, recycler, state);
        n();
        if (scrollVerticallyBy != 0) {
            G(recycler, false);
        }
        return scrollVerticallyBy;
    }

    public boolean w(View view) {
        return view == this.f38804f;
    }

    public StickyHeadersStaggeredGridLayoutManager(int i11, int i12) {
        super(i11, i12);
        this.f38802d = new ArrayList(0);
        this.f38803e = new b(this, null);
        this.f38805g = -1;
        this.f38806h = -1;
        this.f38807i = 0;
    }
}
