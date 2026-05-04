package de;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.baicizhan.main.activity.mytab.MyTabFragment;
import com.baicizhan.main.home.plan.WordPlanFragment;
import hg.b;
import kotlin.jvm.internal.g0;
import m80.k;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a extends FragmentStateAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final int f47936a = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@k FragmentManager fragmentManager, @k Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        g0.p(fragmentManager, "fragmentManager");
        g0.p(lifecycle, "lifecycle");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @k
    public Fragment createFragment(int i11) {
        if (i11 == 0) {
            return new WordPlanFragment();
        }
        if (i11 == 2) {
            return zd.a.f102549a.a();
        }
        if (i11 == 3) {
            b x02 = b.x0(x.r().p());
            g0.o(x02, "newInstance(...)");
            return x02;
        }
        if (i11 != 4) {
            return ed.b.f49650a.a();
        }
        MyTabFragment Y = MyTabFragment.Y(4);
        g0.o(Y, "newInstance(...)");
        return Y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 5;
    }
}
