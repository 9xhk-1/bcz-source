package ht;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.SparseArrayCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends FragmentStatePagerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentPagerItems f59785a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArrayCompat<WeakReference<Fragment>> f59786b;

    public d(FragmentManager fragmentManager, FragmentPagerItems fragmentPagerItems) {
        super(fragmentManager);
        this.f59785a = fragmentPagerItems;
        this.f59786b = new SparseArrayCompat<>(fragmentPagerItems.size());
    }

    public Fragment a(int i11) {
        WeakReference<Fragment> weakReference = this.f59786b.get(i11);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b b(int i11) {
        return (b) this.f59785a.get(i11);
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i11, @NonNull Object obj) {
        this.f59786b.remove(i11);
        super.destroyItem(viewGroup, i11, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f59785a.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i11) {
        return b(i11).e(this.f59785a.getContext(), i11);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i11) {
        return b(i11).a();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i11) {
        return b(i11).b();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i11) {
        Object instantiateItem = super.instantiateItem(viewGroup, i11);
        if (instantiateItem instanceof Fragment) {
            this.f59786b.put(i11, new WeakReference<>((Fragment) instantiateItem));
        }
        return instantiateItem;
    }
}
