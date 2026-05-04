package gt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.SparseArrayCompat;
import androidx.viewpager.widget.PagerAdapter;
import com.ogaclejapan.smarttablayout.utils.ViewPagerItems;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends PagerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final ViewPagerItems f57822a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArrayCompat<WeakReference<View>> f57823b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f57824c;

    public d(ViewPagerItems viewPagerItems) {
        this.f57822a = viewPagerItems;
        this.f57823b = new SparseArrayCompat<>(viewPagerItems.size());
        this.f57824c = LayoutInflater.from(viewPagerItems.getContext());
    }

    public View a(int i11) {
        WeakReference<View> weakReference = this.f57823b.get(i11);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c b(int i11) {
        return (c) this.f57822a.get(i11);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i11, @NonNull Object obj) {
        this.f57823b.remove(i11);
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f57822a.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i11) {
        return b(i11).a();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i11) {
        return b(i11).b();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i11) {
        View c11 = b(i11).c(this.f57824c, viewGroup);
        viewGroup.addView(c11);
        this.f57823b.put(i11, new WeakReference<>(c11));
        return c11;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return obj == view;
    }
}
