package com.baicizhan.main.activity.idenity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.activity.MainTabActivity;
import com.baicizhan.main.activity.idenity.UserGradleActivity;
import com.baicizhan.main.activity.schedule_v2.AllBooksActivity;
import com.baicizhan.main.activity.schedule_v2.IdentityBooksActivity;
import com.baicizhan.main.home.experiment.q0;
import com.baicizhan.main.home.player.HomeActivity;
import com.jiongji.andriod.card.R;
import ee.j;
import ee.m;
import gi.e;
import gs.r2;
import hi.f;
import java.util.LinkedHashMap;
import java.util.List;
import kc.d;
import kc.u;
import kotlin.Pair;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ma.t;
import q9.x;
import va.g;
import w00.o;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nUserGradleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserGradleActivity.kt\ncom/baicizhan/main/activity/idenity/UserGradleActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n+ 4 utils.kt\ncom/baicizhan/base/UtilsKt\n*L\n1#1,287:1\n1#2:288\n35#3:289\n35#3:290\n14#4,6:291\n*S KotlinDebug\n*F\n+ 1 UserGradleActivity.kt\ncom/baicizhan/main/activity/idenity/UserGradleActivity\n*L\n192#1:289\n193#1:290\n220#1:291,6\n*E\n"})
/* loaded from: classes4.dex */
public final class UserGradleActivity extends BaseAppCompatActivity {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f18481f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f18482g = 8;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f18483h = "form";

    /* renamed from: i, reason: collision with root package name */
    public static final int f18484i = 101;

    /* renamed from: j, reason: collision with root package name */
    public static final int f18485j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f18486k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f18487l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static final int f18488m = 3;

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final String f18489n = "update_confirm";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f18490a = e0.c(new x00.a() { // from class: ee.u
        @Override // x00.a
        public final Object invoke() {
            r2 Y0;
            Y0 = UserGradleActivity.Y0(UserGradleActivity.this);
            return Y0;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f18491b = e0.c(new x00.a() { // from class: ee.y
        @Override // x00.a
        public final Object invoke() {
            l W0;
            W0 = UserGradleActivity.W0(UserGradleActivity.this);
            return W0;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c0 f18492c = e0.c(new x00.a() { // from class: ee.z
        @Override // x00.a
        public final Object invoke() {
            va.f b12;
            b12 = UserGradleActivity.b1(UserGradleActivity.this);
            return b12;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public j f18493d;

    /* renamed from: e, reason: collision with root package name */
    public int f18494e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ void d(a aVar, Context context, int i11, Boolean bool, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                bool = Boolean.FALSE;
            }
            aVar.c(context, i11, bool);
        }

        public static /* synthetic */ void g(a aVar, Activity activity, int i11, Boolean bool, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                bool = Boolean.FALSE;
            }
            aVar.f(activity, i11, bool);
        }

        @k
        public final Intent a(@k Context context, int i11) {
            g0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) UserGradleActivity.class);
            intent.putExtra("form", i11);
            return intent;
        }

        @w00.k
        @o
        public final void b(@k Context context, int i11) {
            g0.p(context, "context");
            d(this, context, i11, null, 4, null);
        }

        @w00.k
        @o
        public final void c(@k Context context, int i11, @l Boolean bool) {
            g0.p(context, "context");
            if (g0.g(bool, Boolean.TRUE)) {
                com.baicizhan.main.activity.idenity.a.f18511a.c();
            }
            Intent intent = new Intent(context, (Class<?>) UserGradleActivity.class);
            intent.putExtra("form", i11);
            intent.putExtra(UserGradleActivity.f18489n, bool);
            context.startActivity(intent);
        }

        @w00.k
        @o
        public final void e(@k Activity activity, int i11) {
            g0.p(activity, "activity");
            g(this, activity, i11, null, 4, null);
        }

        @w00.k
        @o
        public final void f(@k Activity activity, int i11, @l Boolean bool) {
            g0.p(activity, "activity");
            c(activity, i11, bool);
            if (i11 == 2 || i11 == 3) {
                activity.overridePendingTransition(R.anim.business_push_up_in, R.anim.activity_nothing);
                f.f();
            }
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f18495a;

        public b(x00.l function) {
            g0.p(function, "function");
            this.f18495a = function;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @k
        public final w<?> getFunctionDelegate() {
            return this.f18495a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f18495a.invoke(obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends GridLayoutManager.SpanSizeLookup {
        public c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i11) {
            RecyclerView.Adapter adapter = UserGradleActivity.this.a1().f56564b.getAdapter();
            return (adapter == null || adapter.getItemViewType(i11) != 1) ? 1 : 3;
        }
    }

    private final va.f E0() {
        return (va.f) this.f18492c.getValue();
    }

    public static final ee.l W0(final UserGradleActivity userGradleActivity) {
        Context applicationContext = userGradleActivity.getApplicationContext();
        g0.o(applicationContext, "getApplicationContext(...)");
        return new ee.l(applicationContext, new x00.l() { // from class: ee.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 X0;
                X0 = UserGradleActivity.X0(UserGradleActivity.this, (a) obj);
                return X0;
            }
        });
    }

    public static final g2 X0(UserGradleActivity userGradleActivity, ee.a it) {
        g0.p(it, "it");
        j jVar = userGradleActivity.f18493d;
        j jVar2 = null;
        if (jVar == null) {
            g0.S("vm");
            jVar = null;
        }
        if (jVar.n()) {
            userGradleActivity.l1(it);
        } else {
            j jVar3 = userGradleActivity.f18493d;
            if (jVar3 == null) {
                g0.S("vm");
            } else {
                jVar2 = jVar3;
            }
            jVar2.p(it, userGradleActivity.f18494e);
        }
        return g2.f100423a;
    }

    public static final r2 Y0(UserGradleActivity userGradleActivity) {
        return r2.d(LayoutInflater.from(userGradleActivity));
    }

    public static final va.f b1(UserGradleActivity userGradleActivity) {
        return e.c(userGradleActivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [kc.d, kc.h] */
    private final void c1() {
        UserRecord.Role role;
        RecyclerView recyclerView = a1().f56564b;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        gridLayoutManager.setSpanSizeLookup(new c());
        recyclerView.setLayoutManager(gridLayoutManager);
        a1().f56564b.addItemDecoration(new ee.b(xb.f.a(this, 12.0f), xb.f.a(this, 12.0f), xb.f.a(this, 24.0f)));
        a1().f56564b.setAdapter(Z0());
        a1().f56563a.setOnClickListener(new View.OnClickListener() { // from class: ee.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserGradleActivity.d1(UserGradleActivity.this, view);
            }
        });
        a1().f56565c.setOnClickListener(new View.OnClickListener() { // from class: ee.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserGradleActivity.e1(UserGradleActivity.this, view);
            }
        });
        a1().f56567e.setText(R.string.identity_choose_grade_student_hint);
        a1().f56566d.setText((TimeUtil.isSummerVacation() ? this : null) != null ? R.string.identity_choose_grade_student_vacation : R.string.identity_choose_grade_student_normal);
        a1().f56563a.setVisibility(0);
        a1().f56565c.setVisibility(4);
        int i11 = this.f18494e;
        if (i11 == 0) {
            a1().f56563a.setVisibility(4);
            a1().f56565c.setVisibility(4);
        } else if (i11 == 1) {
            a1().f56563a.setVisibility(4);
            a1().f56565c.setVisibility(0);
        } else if (i11 == 2 || i11 == 3) {
            a1().f56563a.setImageResource(R.drawable.ic_page_close);
        } else {
            a1().f56563a.setImageResource(R.drawable.ic_ab_back_black);
        }
        boolean booleanExtra = getIntent().getBooleanExtra(f18489n, false);
        j jVar = this.f18493d;
        if (jVar == null) {
            g0.S("vm");
            jVar = null;
        }
        jVar.u(booleanExtra);
        if (booleanExtra) {
            UserRecord p11 = x.r().p();
            int i12 = -1;
            if (p11 != null && (role = p11.getRole()) != null) {
                i12 = role.grade;
            }
            String c11 = m.c(i12, this);
            mc.a.p(this, ((u.a) ((u.a) d.a.J(new u.a(this).M("恭喜你!\n学习上了一个新台阶").V("9月开始，你将成为" + c11 + "学生，你的百词斩身份卡已经进行相应更新"), "确认更新", null, new x00.l() { // from class: ee.v
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 f12;
                    f12 = UserGradleActivity.f1(UserGradleActivity.this, (View) obj);
                    return f12;
                }
            }, 2, null)).q("调整身份", new x00.l() { // from class: ee.w
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 g12;
                    g12 = UserGradleActivity.g1((View) obj);
                    return g12;
                }
            })).b0(ButtonType.DOUBLE).d(), null, 2, null);
        }
    }

    public static final void d1(UserGradleActivity userGradleActivity, View view) {
        userGradleActivity.setResult(0);
        userGradleActivity.finish();
        int i11 = userGradleActivity.f18494e;
        if (i11 == 2 || i11 == 3) {
            userGradleActivity.overridePendingTransition(R.anim.activity_nothing, R.anim.business_push_down_out);
        }
    }

    public static final void e1(UserGradleActivity userGradleActivity, View view) {
        f.g(userGradleActivity);
        ma.l.a(t.f73017p, ma.a.R1);
        userGradleActivity.finish();
    }

    public static final g2 f1(UserGradleActivity userGradleActivity, View it) {
        g0.p(it, "it");
        userGradleActivity.finish();
        return g2.f100423a;
    }

    public static final g2 g1(View it) {
        g0.p(it, "it");
        return g2.f100423a;
    }

    private final void h1() {
        j jVar = (j) new ViewModelProvider(this).get(j.class);
        this.f18493d = jVar;
        j jVar2 = null;
        if (jVar == null) {
            g0.S("vm");
            jVar = null;
        }
        jVar.k().observe(this, new b(new x00.l() { // from class: ee.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 i12;
                i12 = UserGradleActivity.i1(UserGradleActivity.this, (List) obj);
                return i12;
            }
        }));
        j jVar3 = this.f18493d;
        if (jVar3 == null) {
            g0.S("vm");
            jVar3 = null;
        }
        jVar3.l().observe(this, new b(new x00.l() { // from class: ee.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 j12;
                j12 = UserGradleActivity.j1(UserGradleActivity.this, (Boolean) obj);
                return j12;
            }
        }));
        j jVar4 = this.f18493d;
        if (jVar4 == null) {
            g0.S("vm");
            jVar4 = null;
        }
        jVar4.j().observe(this, new b(new x00.l() { // from class: ee.e0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 k12;
                k12 = UserGradleActivity.k1(UserGradleActivity.this, (Pair) obj);
                return k12;
            }
        }));
        j jVar5 = this.f18493d;
        if (jVar5 == null) {
            g0.S("vm");
        } else {
            jVar2 = jVar5;
        }
        jVar2.start();
    }

    public static final g2 i1(UserGradleActivity userGradleActivity, List list) {
        ee.l Z0 = userGradleActivity.Z0();
        g0.m(list);
        Z0.g(list, userGradleActivity.f18494e);
        return g2.f100423a;
    }

    public static final g2 j1(UserGradleActivity userGradleActivity, Boolean bool) {
        if (bool.booleanValue()) {
            userGradleActivity.E0().show();
        } else {
            userGradleActivity.E0().dismiss();
        }
        return g2.f100423a;
    }

    public static final g2 k1(UserGradleActivity userGradleActivity, Pair pair) {
        f.g(userGradleActivity);
        int i11 = userGradleActivity.f18494e;
        if (i11 == 0) {
            int intValue = ((Number) pair.getFirst()).intValue();
            if (23 > intValue || intValue >= 25) {
                IdentityBooksActivity.f18933o.a(userGradleActivity, ((Number) pair.getFirst()).intValue(), (String) pair.getSecond(), 101, 0);
            } else {
                AllBooksActivity.f18897q.d(userGradleActivity, (String) pair.getSecond(), 101, 0);
            }
        } else if (i11 != 1) {
            g.i("修改成功", 0);
            userGradleActivity.finish();
        } else {
            userGradleActivity.finish();
        }
        return g2.f100423a;
    }

    public static final g2 m1(UserGradleActivity userGradleActivity, ee.a aVar, View it) {
        g0.p(it, "it");
        j jVar = userGradleActivity.f18493d;
        if (jVar == null) {
            g0.S("vm");
            jVar = null;
        }
        jVar.p(aVar, userGradleActivity.f18494e);
        return g2.f100423a;
    }

    public static final g2 n1(View it) {
        g0.p(it, "it");
        return g2.f100423a;
    }

    @w00.k
    @o
    public static final void o1(@k Context context, int i11) {
        f18481f.b(context, i11);
    }

    @w00.k
    @o
    public static final void p1(@k Context context, int i11, @l Boolean bool) {
        f18481f.c(context, i11, bool);
    }

    @w00.k
    @o
    public static final void q1(@k Activity activity, int i11) {
        f18481f.e(activity, i11);
    }

    @w00.k
    @o
    public static final void r1(@k Activity activity, int i11, @l Boolean bool) {
        f18481f.f(activity, i11, bool);
    }

    public final ee.l Z0() {
        return (ee.l) this.f18491b.getValue();
    }

    public final r2 a1() {
        return (r2) this.f18490a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [kc.d, kc.h] */
    public final void l1(final ee.a aVar) {
        String c11 = m.c(aVar.e(), this);
        mc.a.p(this, ((u.a) ((u.a) d.a.J(new u.a(this).M("身份更新提醒").V("你的身份被手动变更为" + c11 + "，确认更新吗？"), gi.k.f53787g, null, new x00.l() { // from class: ee.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 m12;
                m12 = UserGradleActivity.m1(UserGradleActivity.this, aVar, (View) obj);
                return m12;
            }
        }, 2, null)).q("取消", new x00.l() { // from class: ee.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 n12;
                n12 = UserGradleActivity.n1((View) obj);
                return n12;
            }
        })).b0(ButtonType.DOUBLE).d(), null, 2, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, @l Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (101 == i11 && i12 == -1) {
            if (q0.f21394a.b()) {
                startActivity(new Intent(this, (Class<?>) HomeActivity.class));
            } else {
                MainTabActivity.Y1(this, false);
            }
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i11 = this.f18494e;
        if (i11 == 1 || i11 == 0) {
            return;
        }
        setResult(0);
        finish();
        if (this.f18494e == 2) {
            overridePendingTransition(R.anim.activity_nothing, R.anim.business_push_down_out);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a1().getRoot());
        this.f18494e = getIntent().getIntExtra("form", 0);
        h1();
        c1();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ma.b.Y, Integer.valueOf(this.f18494e));
        g2 g2Var = g2.f100423a;
        ma.l.e(t.f73017p, ma.a.P1, linkedHashMap);
    }
}
