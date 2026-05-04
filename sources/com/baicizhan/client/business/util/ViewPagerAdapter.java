package com.baicizhan.client.business.util;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class ViewPagerAdapter extends PagerAdapter {
    private SparseArray<View> mPageViews = new SparseArray<>();
    private List<View> mPageViewPool = new ArrayList();

    private View pullViewFromPool() {
        Iterator<View> it = this.mPageViewPool.iterator();
        View next = it.hasNext() ? it.next() : null;
        if (next != null) {
            this.mPageViewPool.remove(next);
        }
        return next;
    }

    private void pushViewToPool(View view) {
        if (this.mPageViewPool.contains(view)) {
            return;
        }
        this.mPageViewPool.add(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = this.mPageViews.get(position);
        pushViewToPool(view);
        container.removeView(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object object) {
        return -2;
    }

    public abstract View getView(View convertView, int position);

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup container, int position) {
        View view = getView(pullViewFromPool(), position);
        this.mPageViews.put(position, view);
        container.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
