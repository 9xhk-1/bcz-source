package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TabLayout f32317a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f32318b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32319c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32320d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0378b f32321e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public RecyclerView.Adapter<?> f32322f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32323g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public c f32324h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public TabLayout.f f32325i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public RecyclerView.AdapterDataObserver f32326j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends RecyclerView.AdapterDataObserver {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i11, int i12) {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i11, int i12) {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i11, int i12, int i13) {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i11, int i12) {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i11, int i12, @Nullable Object obj) {
            b.this.d();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.tabs.b$b, reason: collision with other inner class name */
    public interface InterfaceC0378b {
        void a(@NonNull TabLayout.i iVar, int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final WeakReference<TabLayout> f32328a;

        /* renamed from: b, reason: collision with root package name */
        public int f32329b;

        /* renamed from: c, reason: collision with root package name */
        public int f32330c;

        public c(TabLayout tabLayout) {
            this.f32328a = new WeakReference<>(tabLayout);
            a();
        }

        public void a() {
            this.f32330c = 0;
            this.f32329b = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            this.f32329b = this.f32330c;
            this.f32330c = i11;
            TabLayout tabLayout = this.f32328a.get();
            if (tabLayout != null) {
                tabLayout.d0(this.f32330c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            boolean z11;
            TabLayout tabLayout = this.f32328a.get();
            if (tabLayout != null) {
                int i13 = this.f32330c;
                boolean z12 = true;
                if (i13 != 2 || this.f32329b == 1) {
                    z11 = true;
                } else {
                    z11 = true;
                    z12 = false;
                }
                if (i13 == 2 && this.f32329b == 0) {
                    z11 = false;
                }
                tabLayout.W(i11, f11, z12, z11, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            TabLayout tabLayout = this.f32328a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i11 || i11 >= tabLayout.getTabCount()) {
                return;
            }
            int i12 = this.f32330c;
            tabLayout.S(tabLayout.D(i11), i12 == 0 || (i12 == 2 && this.f32329b == 0));
        }
    }

    public b(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, @NonNull InterfaceC0378b interfaceC0378b) {
        this(tabLayout, viewPager2, true, interfaceC0378b);
    }

    public void a() {
        if (this.f32323g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.Adapter<?> adapter = this.f32318b.getAdapter();
        this.f32322f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f32323g = true;
        c cVar = new c(this.f32317a);
        this.f32324h = cVar;
        this.f32318b.registerOnPageChangeCallback(cVar);
        d dVar = new d(this.f32318b, this.f32320d);
        this.f32325i = dVar;
        this.f32317a.h(dVar);
        if (this.f32319c) {
            a aVar = new a();
            this.f32326j = aVar;
            this.f32322f.registerAdapterDataObserver(aVar);
        }
        d();
        this.f32317a.U(this.f32318b.getCurrentItem(), 0.0f, true);
    }

    public void b() {
        RecyclerView.Adapter<?> adapter;
        if (this.f32319c && (adapter = this.f32322f) != null) {
            adapter.unregisterAdapterDataObserver(this.f32326j);
            this.f32326j = null;
        }
        this.f32317a.N(this.f32325i);
        this.f32318b.unregisterOnPageChangeCallback(this.f32324h);
        this.f32325i = null;
        this.f32324h = null;
        this.f32322f = null;
        this.f32323g = false;
    }

    public boolean c() {
        return this.f32323g;
    }

    public void d() {
        this.f32317a.L();
        RecyclerView.Adapter<?> adapter = this.f32322f;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i11 = 0; i11 < itemCount; i11++) {
                TabLayout.i I = this.f32317a.I();
                this.f32321e.a(I, i11);
                this.f32317a.l(I, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.f32318b.getCurrentItem(), this.f32317a.getTabCount() - 1);
                if (min != this.f32317a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f32317a;
                    tabLayout.R(tabLayout.D(min));
                }
            }
        }
    }

    public b(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z11, @NonNull InterfaceC0378b interfaceC0378b) {
        this(tabLayout, viewPager2, z11, true, interfaceC0378b);
    }

    public b(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z11, boolean z12, @NonNull InterfaceC0378b interfaceC0378b) {
        this.f32317a = tabLayout;
        this.f32318b = viewPager2;
        this.f32319c = z11;
        this.f32320d = z12;
        this.f32321e = interfaceC0378b;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements TabLayout.f {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager2 f32331a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f32332b;

        public d(ViewPager2 viewPager2, boolean z11) {
            this.f32331a = viewPager2;
            this.f32332b = z11;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(@NonNull TabLayout.i iVar) {
            this.f32331a.setCurrentItem(iVar.k(), this.f32332b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(TabLayout.i iVar) {
        }
    }
}
