package androidx.databinding.adapters;

import android.widget.AbsListView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@BindingMethods({@BindingMethod(attribute = "android:listSelector", method = "setSelector", type = AbsListView.class), @BindingMethod(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = AbsListView.class), @BindingMethod(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = AbsListView.class), @BindingMethod(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = AbsListView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class AbsListViewBindingAdapter {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnScroll {
        void onScroll(AbsListView absListView, int i11, int i12, int i13);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnScrollStateChanged {
        void onScrollStateChanged(AbsListView absListView, int i11);
    }

    @BindingAdapter(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    public static void setOnScroll(AbsListView absListView, final OnScroll onScroll, final OnScrollStateChanged onScrollStateChanged) {
        absListView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: androidx.databinding.adapters.AbsListViewBindingAdapter.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView2, int i11, int i12, int i13) {
                OnScroll onScroll2 = onScroll;
                if (onScroll2 != null) {
                    onScroll2.onScroll(absListView2, i11, i12, i13);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView2, int i11) {
                OnScrollStateChanged onScrollStateChanged2 = OnScrollStateChanged.this;
                if (onScrollStateChanged2 != null) {
                    onScrollStateChanged2.onScrollStateChanged(absListView2, i11);
                }
            }
        });
    }
}
