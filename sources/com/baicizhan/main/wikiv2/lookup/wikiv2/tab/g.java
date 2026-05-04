package com.baicizhan.main.wikiv2.lookup.wikiv2.tab;

import a00.h0;
import a00.i0;
import a00.l1;
import a00.v1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import g10.l;
import g10.u;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWikiTabAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiTabAdapter.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/tab/WikiTabAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n827#2:50\n855#2,2:51\n1573#2:53\n1604#2,4:54\n*S KotlinDebug\n*F\n+ 1 WikiTabAdapter.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/tab/WikiTabAdapter\n*L\n25#1:50\n25#1:51,2\n26#1:53\n26#1:54,4\n*E\n"})
/* loaded from: classes3.dex */
public final class g extends FragmentStateAdapter {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f25776a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f25777b = 8;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Set<Integer> f25778c = v1.f(1);

    /* renamed from: d, reason: collision with root package name */
    public static final int f25779d = 6;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final Map<Integer, Integer> f25780e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    static {
        int i11 = 0;
        l W1 = u.W1(0, 6);
        ArrayList arrayList = new ArrayList();
        for (Integer num : W1) {
            if (!f25778c.contains(Integer.valueOf(num.intValue()))) {
                arrayList.add(num);
            }
        }
        ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            arrayList2.add(h1.a(Integer.valueOf(i11), Integer.valueOf(((Number) obj).intValue())));
            i11 = i12;
        }
        f25780e = l1.B0(arrayList2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@k FragmentManager fragmentManager, @k Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        g0.p(fragmentManager, "fragmentManager");
        g0.p(lifecycle, "lifecycle");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @k
    public Fragment createFragment(int i11) {
        Integer num = f25780e.get(Integer.valueOf(i11));
        if (num != null) {
            i11 = num.intValue();
        }
        if (i11 == 0) {
            return c.f25758h.a();
        }
        if (i11 == 1) {
            return f.f25772g.a();
        }
        if (i11 == 2) {
            return e.f25767h.a();
        }
        if (i11 == 3) {
            return d.f25763g.a();
        }
        if (i11 == 4) {
            return b.f25754g.a();
        }
        if (i11 == 5) {
            return OtherFragment.f25728q.a();
        }
        throw new IllegalArgumentException("Invalid position: " + i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 6 - f25778c.size();
    }
}
