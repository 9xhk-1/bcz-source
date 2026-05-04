package com.baicizhan.main.activity.schedule_v2;

import a00.h0;
import a00.k1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.widget.NoScrollViewPager;
import com.baicizhan.main.activity.MainTabActivity;
import com.baicizhan.main.activity.idenity.UserIdentity;
import com.baicizhan.main.activity.schedule_v2.AllBooksActivity;
import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;
import com.baicizhan.main.activity.schedule_v2.a;
import com.baicizhan.main.activity.schedule_v2.b;
import com.baicizhan.main.home.experiment.q0;
import com.baicizhan.main.home.player.HomeActivity;
import com.baicizhan.online.user_study_api.UserSelectedBookInfo;
import com.jiongji.andriod.card.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import gs.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ma.t;
import oe.i0;
import w00.o;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAllBooksActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllBooksActivity.kt\ncom/baicizhan/main/activity/schedule_v2/AllBooksActivity\n+ 2 utils.kt\ncom/baicizhan/base/UtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n+ 5 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,192:1\n14#2,6:193\n1563#3:199\n1634#3,3:200\n1878#3,3:203\n35#4:206\n18#5,3:207\n*S KotlinDebug\n*F\n+ 1 AllBooksActivity.kt\ncom/baicizhan/main/activity/schedule_v2/AllBooksActivity\n*L\n122#1:193,6\n71#1:199\n71#1:200,3\n71#1:203,3\n83#1:206\n87#1:207,3\n*E\n"})
/* loaded from: classes4.dex */
public final class AllBooksActivity extends IdentityInfoActivity implements b.a {

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final a f18897q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f18898r = 8;

    /* renamed from: s, reason: collision with root package name */
    public static final int f18899s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f18900t = 2;

    /* renamed from: u, reason: collision with root package name */
    @k
    public static final String f18901u = "to_navigate";

    /* renamed from: v, reason: collision with root package name */
    @k
    public static final String f18902v = "from_type";

    /* renamed from: m, reason: collision with root package name */
    public i f18903m;

    /* renamed from: n, reason: collision with root package name */
    public int f18904n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18905o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final c0 f18906p = e0.c(new x00.a() { // from class: oe.e
        @Override // x00.a
        public final Object invoke() {
            i0 Z0;
            Z0 = AllBooksActivity.Z0(AllBooksActivity.this);
            return Z0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final Intent a(@k Context context, @l ScheduleType scheduleType, int i11) {
            g0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) AllBooksActivity.class);
            intent.putExtra(AllBooksActivity.f18902v, scheduleType);
            intent.putExtra("form", i11);
            return intent;
        }

        @o
        public final void b(@k Context context) {
            g0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) AllBooksActivity.class);
            intent.putExtra(AllBooksActivity.f18901u, true);
            context.startActivity(intent);
        }

        @o
        public final void c(@k Activity activity, int i11) {
            g0.p(activity, "activity");
            activity.startActivityForResult(new Intent(activity, (Class<?>) AllBooksActivity.class), i11);
        }

        @o
        public final void d(@k Activity activity, @k String config, int i11, int i12) {
            g0.p(activity, "activity");
            g0.p(config, "config");
            Intent intent = new Intent(activity, (Class<?>) AllBooksActivity.class);
            intent.putExtra(IdentityInfoActivity.f18944g, config);
            intent.putExtra("form", i12);
            activity.startActivityForResult(intent, i11);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends ViewPager.SimpleOnPageChangeListener {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i11) {
            if (i11 != AllBooksActivity.this.f18904n) {
                i iVar = AllBooksActivity.this.f18903m;
                i iVar2 = null;
                if (iVar == null) {
                    g0.S("binding");
                    iVar = null;
                }
                SmartTabLayout contentTab = iVar.f55242c;
                g0.o(contentTab, "contentTab");
                com.baicizhan.main.activity.schedule_v2.a.a(contentTab, AllBooksActivity.this.f18904n, false);
                i iVar3 = AllBooksActivity.this.f18903m;
                if (iVar3 == null) {
                    g0.S("binding");
                } else {
                    iVar2 = iVar3;
                }
                SmartTabLayout contentTab2 = iVar2.f55242c;
                g0.o(contentTab2, "contentTab");
                com.baicizhan.main.activity.schedule_v2.a.a(contentTab2, i11, true);
                AllBooksActivity.this.f18904n = i11;
            }
        }
    }

    private final i0 X0() {
        return (i0) this.f18906p.getValue();
    }

    public static final i0 Z0(AllBooksActivity allBooksActivity) {
        return (i0) new ViewModelProvider(allBooksActivity).get(i0.class);
    }

    public static final void a1(AllBooksActivity allBooksActivity, View view) {
        allBooksActivity.setResult(0);
        allBooksActivity.finish();
    }

    public static final g2 b1(AllBooksActivity allBooksActivity, List list) {
        i iVar = allBooksActivity.f18903m;
        i iVar2 = null;
        if (iVar == null) {
            g0.S("binding");
            iVar = null;
        }
        NoScrollViewPager noScrollViewPager = iVar.f55241b;
        FragmentManager supportFragmentManager = allBooksActivity.getSupportFragmentManager();
        FragmentPagerItems.a with = FragmentPagerItems.with(allBooksActivity);
        g0.m(list);
        List list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((qe.a) it.next()).f());
        }
        int i11 = 0;
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable(d.f19250a, Integer.valueOf(i11));
            g2 g2Var = g2.f100423a;
            with.g((String) obj, PositionedBooksFragment.class, bundle);
            i11 = i12;
        }
        g2 g2Var2 = g2.f100423a;
        noScrollViewPager.setAdapter(new ht.c(supportFragmentManager, with.h()));
        i iVar3 = allBooksActivity.f18903m;
        if (iVar3 == null) {
            g0.S("binding");
            iVar3 = null;
        }
        SmartTabLayout smartTabLayout = iVar3.f55242c;
        i iVar4 = allBooksActivity.f18903m;
        if (iVar4 == null) {
            g0.S("binding");
            iVar4 = null;
        }
        smartTabLayout.setViewPager(iVar4.f55241b);
        i iVar5 = allBooksActivity.f18903m;
        if (iVar5 == null) {
            g0.S("binding");
        } else {
            iVar2 = iVar5;
        }
        SmartTabLayout contentTab = iVar2.f55242c;
        g0.o(contentTab, "contentTab");
        com.baicizhan.main.activity.schedule_v2.a.a(contentTab, allBooksActivity.f18904n, true);
        return g2Var2;
    }

    public static final g2 c1(AllBooksActivity allBooksActivity, UserSelectedBookInfo userSelectedBookInfo) {
        g2 g2Var;
        String str = userSelectedBookInfo.mode_switch_url;
        if (str != null) {
            BczWebExecutorKt.startWebForResult$default(allBooksActivity, str, 2, false, 0, 16, null);
            return g2.f100423a;
        }
        String J0 = allBooksActivity.J0();
        if (J0 == null || J0.length() == 0) {
            g2Var = null;
        } else {
            BczWebExecutorKt.startWebForResult$default(allBooksActivity, J0, 2, false, 0, 16, null);
            g2Var = g2.f100423a;
        }
        if (g2Var == null) {
            allBooksActivity.setResult(-1);
            allBooksActivity.finish();
        }
        return g2.f100423a;
    }

    public static final g2 d1(AllBooksActivity allBooksActivity, Boolean bool) {
        if (g0.g(bool, Boolean.TRUE)) {
            allBooksActivity.E0().show();
        } else {
            allBooksActivity.E0().dismiss();
        }
        return g2.f100423a;
    }

    @o
    public static final void e1(@k Context context) {
        f18897q.b(context);
    }

    @o
    public static final void f1(@k Activity activity, int i11) {
        f18897q.c(activity, i11);
    }

    @o
    public static final void g1(@k Activity activity, @k String str, int i11, int i12) {
        f18897q.d(activity, str, i11, i12);
    }

    public final void Y0(int i11, String str) {
        Serializable serializableExtra = getIntent().getSerializableExtra(f18902v);
        ScheduleType scheduleType = serializableExtra instanceof ScheduleType ? (ScheduleType) serializableExtra : null;
        if (scheduleType != null) {
            EditScheduleActivity.f18908j.c(this, i11, str, 1, scheduleType);
        } else {
            EditScheduleActivity.b.d(EditScheduleActivity.f18908j, this, i11, str, 1, null, 16, null);
        }
    }

    @Override // com.baicizhan.main.activity.schedule_v2.b.a
    public void l(@k qe.c book, @k String category) {
        g0.p(book, "book");
        g0.p(category, "category");
        Y0(book.m(), category);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, @l Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i12 == -1) {
            if (i11 == 1 || i11 == 2) {
                if (this.f18905o) {
                    if (q0.f21394a.b()) {
                        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
                    } else {
                        MainTabActivity.Y1(this, false);
                    }
                    overridePendingTransition(R.anim.alpha_fade_in, R.anim.business_push_right_out);
                } else {
                    setResult(-1);
                }
                finish();
            }
        }
    }

    @Override // com.baicizhan.main.activity.schedule_v2.IdentityInfoActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        this.f18905o = getIntent().getBooleanExtra(f18901u, false);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R.layout.activity_all_books);
        g0.o(contentView, "setContentView(...)");
        i iVar = (i) contentView;
        this.f18903m = iVar;
        i iVar2 = null;
        if (iVar == null) {
            g0.S("binding");
            iVar = null;
        }
        iVar.f55242c.i(R.layout.smart_tab_custom_all_books, R.id.tab);
        i iVar3 = this.f18903m;
        if (iVar3 == null) {
            g0.S("binding");
            iVar3 = null;
        }
        iVar3.f55242c.setOnPageChangeListener(new b());
        i iVar4 = this.f18903m;
        if (iVar4 == null) {
            g0.S("binding");
        } else {
            iVar2 = iVar4;
        }
        iVar2.f55240a.D(new View.OnClickListener() { // from class: oe.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AllBooksActivity.a1(AllBooksActivity.this, view);
            }
        });
        X0().y().observe(this, new a.C0292a(new x00.l() { // from class: oe.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b12;
                b12 = AllBooksActivity.b1(AllBooksActivity.this, (List) obj);
                return b12;
            }
        }));
        X0().C().observe(this, new a.C0292a(new x00.l() { // from class: oe.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 c12;
                c12 = AllBooksActivity.c1(AllBooksActivity.this, (UserSelectedBookInfo) obj);
                return c12;
            }
        }));
        X0().A().observe(this, new a.C0292a(new x00.l() { // from class: oe.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d12;
                d12 = AllBooksActivity.d1(AllBooksActivity.this, (Boolean) obj);
                return d12;
            }
        }));
        X0().D();
        ma.l.e(t.f73017p, ma.a.f72882z1, k1.k(h1.a(ma.b.f72933p, gi.i0.a(UserIdentity.ALL))));
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        X0().U();
    }
}
