package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
final class CompositeOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {

    @NonNull
    private final List<ViewPager2.OnPageChangeCallback> mCallbacks;

    public CompositeOnPageChangeCallback(int i11) {
        this.mCallbacks = new ArrayList(i11);
    }

    private void throwCallbackListModifiedWhileInUse(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    public void addOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mCallbacks.add(onPageChangeCallback);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i11) {
        try {
            Iterator<ViewPager2.OnPageChangeCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i11);
            }
        } catch (ConcurrentModificationException e11) {
            throwCallbackListModifiedWhileInUse(e11);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i11, float f11, @Px int i12) {
        try {
            Iterator<ViewPager2.OnPageChangeCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i11, f11, i12);
            }
        } catch (ConcurrentModificationException e11) {
            throwCallbackListModifiedWhileInUse(e11);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i11) {
        try {
            Iterator<ViewPager2.OnPageChangeCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i11);
            }
        } catch (ConcurrentModificationException e11) {
            throwCallbackListModifiedWhileInUse(e11);
        }
    }

    public void removeOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mCallbacks.remove(onPageChangeCallback);
    }
}
