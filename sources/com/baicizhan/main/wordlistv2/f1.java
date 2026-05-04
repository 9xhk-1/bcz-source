package com.baicizhan.main.wordlistv2;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class f1 extends FragmentStateAdapter {

    /* renamed from: b, reason: collision with root package name */
    public static final int f27873b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<WordListContentFragment> f27874a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(@m80.k FragmentActivity fragmentActivity, @m80.k List<WordListContentFragment> wordFragmentList) {
        super(fragmentActivity);
        kotlin.jvm.internal.g0.p(fragmentActivity, "fragmentActivity");
        kotlin.jvm.internal.g0.p(wordFragmentList, "wordFragmentList");
        this.f27874a = wordFragmentList;
    }

    @m80.k
    public final List<WordListContentFragment> b() {
        return this.f27874a;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @m80.k
    public Fragment createFragment(int i11) {
        return this.f27874a.get(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 5;
    }
}
