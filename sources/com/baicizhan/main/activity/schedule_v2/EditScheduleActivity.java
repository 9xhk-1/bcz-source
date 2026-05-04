package com.baicizhan.main.activity.schedule_v2;

import a00.a0;
import a00.d1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.appcompat.widget.TooltipCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanFragment;
import com.baicizhan.main.activity.schedule_v2.switchschedule.SwitchScheduleFragment;
import com.baicizhan.main.home.experiment.q0;
import com.baicizhan.main.vld.model.FavoritePlanInfo;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.b;
import com.jiongji.andriod.card.R;
import gs.d0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import oe.b1;
import oe.s0;
import q9.x;
import sa.q;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nEditScheduleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditScheduleActivity.kt\ncom/baicizhan/main/activity/schedule_v2/EditScheduleActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,279:1\n1#2:280\n1869#3:281\n1870#3:283\n35#4:282\n*S KotlinDebug\n*F\n+ 1 EditScheduleActivity.kt\ncom/baicizhan/main/activity/schedule_v2/EditScheduleActivity\n*L\n188#1:281\n188#1:283\n189#1:282\n*E\n"})
@qu.b
/* loaded from: classes4.dex */
public final class EditScheduleActivity extends Hilt_EditScheduleActivity implements s0 {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final b f18908j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f18909k = 8;

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final String f18910l = "EditScheduleActivity";

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final String f18911m = "key_book_id";

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final String f18912n = "key_top_category_name";

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final String f18913o = "key_type";

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final String f18914p = "tab_type";

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final String f18915q = "only_one_tab";

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final String f18916r = "device_id";

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final String f18917s = "plan_info";

    /* renamed from: t, reason: collision with root package name */
    public static final int f18918t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f18919u = 1;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public b1 f18921f;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c0 f18920e = e0.c(new x00.a() { // from class: oe.n0
        @Override // x00.a
        public final Object invoke() {
            gs.d0 Y0;
            Y0 = EditScheduleActivity.Y0(EditScheduleActivity.this);
            return Y0;
        }
    });

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String[] f18922g = {"修改计划", "更换词书"};

    /* renamed from: h, reason: collision with root package name */
    @k
    public final c0 f18923h = e0.c(new x00.a() { // from class: oe.o0
        @Override // x00.a
        public final Object invoke() {
            long O0;
            O0 = EditScheduleActivity.O0(EditScheduleActivity.this);
            return Long.valueOf(O0);
        }
    });

    /* renamed from: i, reason: collision with root package name */
    @k
    public final c0 f18924i = e0.c(new x00.a() { // from class: oe.p0
        @Override // x00.a
        public final Object invoke() {
            FavoritePlanInfo Z0;
            Z0 = EditScheduleActivity.Z0(EditScheduleActivity.this);
            return Z0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends ActivityResultContract<g2, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final int f18925a = 8;

        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public Intent createIntent(@k Context context, @k g2 input) {
            g0.p(context, "context");
            g0.p(input, "input");
            Intent intent = new Intent(context, (Class<?>) EditScheduleActivity.class);
            intent.putExtra(EditScheduleActivity.f18913o, ScheduleType.ADJUST);
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public Boolean parseResult(int i11, @l Intent intent) {
            return Boolean.valueOf(i11 == -1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public static /* synthetic */ void d(b bVar, Activity activity, int i11, String str, int i12, ScheduleType scheduleType, int i13, Object obj) {
            if ((i13 & 16) != 0) {
                scheduleType = ScheduleType.NEW;
            }
            bVar.c(activity, i11, str, i12, scheduleType);
        }

        @k
        public final Intent a(@k Activity activity, long j11, @k FavoritePlanInfo planInfo, @k ScheduleType type) {
            g0.p(activity, "activity");
            g0.p(planInfo, "planInfo");
            g0.p(type, "type");
            Intent intent = new Intent(activity, (Class<?>) EditScheduleActivity.class);
            intent.putExtra("device_id", j11);
            intent.putExtra("plan_info", planInfo);
            intent.putExtra(EditScheduleActivity.f18913o, type);
            intent.putExtra(EditScheduleActivity.f18914p, 0);
            intent.putExtra(EditScheduleActivity.f18915q, true);
            return intent;
        }

        public final void b(@k Activity activity, int i11) {
            g0.p(activity, "activity");
            qb.c.i(EditScheduleActivity.f18910l, "startAddBook", new Object[0]);
            Intent intent = new Intent(activity, (Class<?>) EditScheduleActivity.class);
            intent.putExtra(EditScheduleActivity.f18911m, i11);
            intent.putExtra(EditScheduleActivity.f18914p, 1);
            intent.putExtra(EditScheduleActivity.f18913o, ScheduleType.ADJUST);
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.business_push_left_in, R.anim.business_push_left_out);
        }

        public final void c(@k Activity activity, int i11, @k String topCategoryName, int i12, @k ScheduleType type) {
            g0.p(activity, "activity");
            g0.p(topCategoryName, "topCategoryName");
            g0.p(type, "type");
            qb.c.i(EditScheduleActivity.f18910l, "NewBook %d", Integer.valueOf(i11));
            Intent intent = new Intent(activity, (Class<?>) EditScheduleActivity.class);
            intent.putExtra(EditScheduleActivity.f18911m, i11);
            intent.putExtra(EditScheduleActivity.f18913o, type);
            intent.putExtra(EditScheduleActivity.f18912n, topCategoryName);
            intent.putExtra(EditScheduleActivity.f18914p, 0);
            intent.putExtra(EditScheduleActivity.f18915q, true);
            activity.startActivityForResult(intent, i12);
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends FragmentStateAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<Fragment> f18926a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<Fragment> list, FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
            this.f18926a = list;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            return this.f18926a.get(i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f18926a.size();
        }
    }

    public static final long O0(EditScheduleActivity editScheduleActivity) {
        return editScheduleActivity.getIntent().getLongExtra("device_id", 0L);
    }

    public static final void U0(EditScheduleActivity editScheduleActivity, TabLayout.i tab, int i11) {
        g0.p(tab, "tab");
        tab.D(editScheduleActivity.f18922g[i11]);
    }

    private final void V0() {
        T0();
        ImageView backImg = P0().f54522b;
        g0.o(backImg, "backImg");
        q.t(backImg, 0, new x00.l() { // from class: oe.l0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 W0;
                W0 = EditScheduleActivity.W0(EditScheduleActivity.this, (View) obj);
                return W0;
            }
        }, 1, null);
        TextView badgeText = P0().f54523c;
        g0.o(badgeText, "badgeText");
        q.t(badgeText, 0, new x00.l() { // from class: oe.m0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 X0;
                X0 = EditScheduleActivity.X0(EditScheduleActivity.this, (View) obj);
                return X0;
            }
        }, 1, null);
    }

    public static final g2 W0(EditScheduleActivity editScheduleActivity, View it) {
        g0.p(it, "it");
        editScheduleActivity.setResult(0);
        editScheduleActivity.finish();
        return g2.f100423a;
    }

    public static final g2 X0(EditScheduleActivity editScheduleActivity, View it) {
        g0.p(it, "it");
        SingleFragmentActivity.I0(editScheduleActivity, ne.a.class, null, editScheduleActivity.getString(R.string.user_center_completed_title));
        return g2.f100423a;
    }

    public static final d0 Y0(EditScheduleActivity editScheduleActivity) {
        return (d0) DataBindingUtil.setContentView(editScheduleActivity, R.layout.activity_edit_schedule);
    }

    public static final FavoritePlanInfo Z0(EditScheduleActivity editScheduleActivity) {
        Serializable serializableExtra = editScheduleActivity.getIntent().getSerializableExtra("plan_info");
        g0.n(serializableExtra, "null cannot be cast to non-null type com.baicizhan.main.vld.model.FavoritePlanInfo");
        return (FavoritePlanInfo) serializableExtra;
    }

    @Override // oe.s0
    public long L() {
        return ((Number) this.f18923h.getValue()).longValue();
    }

    @k
    public final d0 P0() {
        Object value = this.f18920e.getValue();
        g0.o(value, "getValue(...)");
        return (d0) value;
    }

    @k
    public final b1 Q0() {
        b1 b1Var = this.f18921f;
        if (b1Var != null) {
            return b1Var;
        }
        g0.S("model");
        return null;
    }

    @k
    public final String[] R0() {
        return this.f18922g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r3 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S0() {
        /*
            r5 = this;
            oe.b1 r0 = r5.Q0()
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r2 = "key_type"
            java.io.Serializable r1 = r1.getSerializableExtra(r2)
            boolean r2 = r1 instanceof com.baicizhan.main.activity.schedule_v2.ScheduleType
            r3 = 0
            if (r2 == 0) goto L16
            com.baicizhan.main.activity.schedule_v2.ScheduleType r1 = (com.baicizhan.main.activity.schedule_v2.ScheduleType) r1
            goto L17
        L16:
            r1 = r3
        L17:
            if (r1 != 0) goto L60
            android.content.Intent r1 = r5.getIntent()
            android.net.Uri r1 = r1.getData()
            if (r1 == 0) goto L54
            java.lang.String r2 = r1.getHost()
            java.lang.String r4 = "com.baicizhan.plan"
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto L54
            java.lang.String r2 = r1.getPath()
            java.lang.String r4 = "/edit"
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto L54
            java.lang.String r2 = "type"
            java.lang.String r1 = r1.getQueryParameter(r2)
            if (r1 == 0) goto L52
            java.lang.String r2 = "1"
            boolean r2 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r2 == 0) goto L4c
            r3 = r1
        L4c:
            if (r3 == 0) goto L52
            com.baicizhan.main.activity.schedule_v2.ScheduleType r3 = com.baicizhan.main.activity.schedule_v2.ScheduleType.ADJUST
            if (r3 != 0) goto L54
        L52:
            com.baicizhan.main.activity.schedule_v2.ScheduleType r3 = com.baicizhan.main.activity.schedule_v2.ScheduleType.ADJUST_BY_DEVICE
        L54:
            if (r3 == 0) goto L58
            r1 = r3
            goto L60
        L58:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "No type specified!"
            r0.<init>(r1)
            throw r0
        L60:
            r0.h(r1)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r2 = "key_book_id"
            r3 = -1
            int r1 = r1.getIntExtra(r2, r3)
            r0.f(r1)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r2 = "key_top_category_name"
            java.lang.String r1 = r1.getStringExtra(r2)
            if (r1 != 0) goto L7f
            java.lang.String r1 = ""
        L7f:
            r0.g(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.schedule_v2.EditScheduleActivity.S0():void");
    }

    public final void T0() {
        TabLayout.i D;
        int intExtra = getIntent().getIntExtra(f18914p, -1);
        if (getIntent().getBooleanExtra(f18915q, false)) {
            P0().f54526f.setVisibility(8);
            P0().f54524d.setVisibility(8);
            P0().f54527g.setVisibility(0);
            P0().f54525e.setVisibility(0);
            if (intExtra == 0) {
                d0 P0 = P0();
                P0.f54527g.setText("制定计划");
                P0.f54523c.setVisibility(4);
                getSupportFragmentManager().beginTransaction().add(R.id.single_container, q0.f21394a.b() ? new GamingPlanFragment() : AdjustScheduleClassicFragment.f18957p.a()).commit();
                return;
            }
            return;
        }
        TabLayout tabLayout = P0().f54526f;
        tabLayout.i(tabLayout.I().D(this.f18922g[0]));
        tabLayout.i(tabLayout.I().D(this.f18922g[1]));
        ArrayList arrayList = new ArrayList();
        arrayList.add(q0.f21394a.b() ? new GamingPlanFragment() : AdjustScheduleClassicFragment.f18957p.a());
        arrayList.add(SwitchScheduleFragment.f19450l.a());
        P0().f54524d.setAdapter(new c(arrayList, getSupportFragmentManager(), getLifecycle()));
        P0().f54524d.setOffscreenPageLimit(arrayList.size());
        P0().f54526f.h(new d());
        P0().f54524d.setUserInputEnabled(false);
        new com.google.android.material.tabs.b(P0().f54526f, P0().f54524d, new b.InterfaceC0378b() { // from class: oe.k0
            @Override // com.google.android.material.tabs.b.InterfaceC0378b
            public final void a(TabLayout.i iVar, int i11) {
                EditScheduleActivity.U0(EditScheduleActivity.this, iVar, i11);
            }
        }).a();
        if (intExtra >= 0 && (D = P0().f54526f.D(intExtra)) != null) {
            D.r();
        }
        Iterator<Integer> it = a0.Fe(this.f18922g).iterator();
        while (it.hasNext()) {
            TabLayout.i D2 = P0().f54526f.D(((d1) it).nextInt());
            TabLayout.TabView tabView = D2 != null ? D2.f32310i : null;
            if (tabView != null) {
                TooltipCompat.setTooltipText(tabView, null);
            }
        }
    }

    @Override // oe.s0
    @k
    public FavoritePlanInfo a0() {
        return (FavoritePlanInfo) this.f18924i.getValue();
    }

    public final void a1(@k b1 b1Var) {
        g0.p(b1Var, "<set-?>");
        this.f18921f = b1Var;
    }

    @Override // com.baicizhan.main.activity.schedule_v2.Hilt_EditScheduleActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (x.r().c(this)) {
            return;
        }
        S0();
        V0();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements TabLayout.f {
        public d() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(TabLayout.i iVar) {
            EditScheduleActivity.this.P0().f54523c.setVisibility((iVar != null ? iVar.k() : 0) != 1 ? 4 : 0);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(TabLayout.i iVar) {
        }
    }
}
