package com.baicizhan.main.activity.schedule_v2.switchschedule;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.activity.schedule_v2.AllBooksActivity;
import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;
import com.baicizhan.main.activity.schedule_v2.ScheduleType;
import com.jiongji.andriod.card.R;
import gs.ya;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kc.d;
import kc.u;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import oe.b1;
import oe.d1;
import oe.g1;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSwitchScheduleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchScheduleFragment.kt\ncom/baicizhan/main/activity/schedule_v2/switchschedule/SwitchScheduleFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n106#2,15:192\n360#3,7:207\n1#4:214\n*S KotlinDebug\n*F\n+ 1 SwitchScheduleFragment.kt\ncom/baicizhan/main/activity/schedule_v2/switchschedule/SwitchScheduleFragment\n*L\n39#1:192,15\n127#1:207,7\n*E\n"})
@qu.b
/* loaded from: classes4.dex */
public final class SwitchScheduleFragment extends com.baicizhan.main.activity.schedule_v2.switchschedule.a {

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final a f19450l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f19451m = 8;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final String f19452n = "SwitchScheduleTag";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final yz.c0 f19453f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public b1 f19454g;

    /* renamed from: h, reason: collision with root package name */
    public ya f19455h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final yz.c0 f19456i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final yz.c0 f19457j;

    /* renamed from: k, reason: collision with root package name */
    public ActivityResultLauncher<Intent> f19458k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final Fragment a() {
            return new SwitchScheduleFragment();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends sa.c {
        public b() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View view) {
            super.onClick(view);
            ActivityResultLauncher activityResultLauncher = SwitchScheduleFragment.this.f19458k;
            if (activityResultLauncher == null) {
                kotlin.jvm.internal.g0.S("launcher");
                activityResultLauncher = null;
            }
            AllBooksActivity.a aVar = AllBooksActivity.f18897q;
            Context requireContext = SwitchScheduleFragment.this.requireContext();
            kotlin.jvm.internal.g0.o(requireContext, "requireContext(...)");
            activityResultLauncher.launch(aVar.a(requireContext, SwitchScheduleFragment.this.K().d() == ScheduleType.ADJUST_BY_DEVICE ? ScheduleType.NEW_BY_DEVICE : null, 1));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f19460a;

        public c(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f19460a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return kotlin.jvm.internal.g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f19460a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f19460a.invoke(obj);
        }
    }

    public SwitchScheduleFragment() {
        final x00.a<Fragment> aVar = new x00.a<Fragment>() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.SwitchScheduleFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        final yz.c0 b11 = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a<ViewModelStoreOwner>() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.SwitchScheduleFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) x00.a.this.invoke();
            }
        });
        final x00.a aVar2 = null;
        this.f19453f = FragmentViewModelLazyKt.createViewModelLazy(this, o0.d(f0.class), new x00.a<ViewModelStore>() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.SwitchScheduleFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final ViewModelStore invoke() {
                ViewModelStoreOwner m5612viewModels$lambda1;
                m5612viewModels$lambda1 = FragmentViewModelLazyKt.m5612viewModels$lambda1(yz.c0.this);
                return m5612viewModels$lambda1.getViewModelStore();
            }
        }, new x00.a<CreationExtras>() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.SwitchScheduleFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final CreationExtras invoke() {
                ViewModelStoreOwner m5612viewModels$lambda1;
                CreationExtras creationExtras;
                x00.a aVar3 = x00.a.this;
                if (aVar3 != null && (creationExtras = (CreationExtras) aVar3.invoke()) != null) {
                    return creationExtras;
                }
                m5612viewModels$lambda1 = FragmentViewModelLazyKt.m5612viewModels$lambda1(b11);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5612viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5612viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new x00.a<ViewModelProvider.Factory>() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.SwitchScheduleFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final ViewModelProvider.Factory invoke() {
                ViewModelStoreOwner m5612viewModels$lambda1;
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                m5612viewModels$lambda1 = FragmentViewModelLazyKt.m5612viewModels$lambda1(b11);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5612viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5612viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? Fragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.f19456i = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.d
            @Override // x00.a
            public final Object invoke() {
                va.f W;
                W = SwitchScheduleFragment.W(SwitchScheduleFragment.this);
                return W;
            }
        });
        this.f19457j = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.g
            @Override // x00.a
            public final Object invoke() {
                p50.h H;
                H = SwitchScheduleFragment.H(SwitchScheduleFragment.this);
                return H;
            }
        });
    }

    public static final p50.h H(SwitchScheduleFragment switchScheduleFragment) {
        p50.h hVar = new p50.h();
        hVar.i(com.baicizhan.main.activity.schedule_v2.switchschedule.b.class, new pe.g(switchScheduleFragment, switchScheduleFragment.L()));
        return hVar;
    }

    private final va.f J() {
        Object value = this.f19456i.getValue();
        kotlin.jvm.internal.g0.o(value, "getValue(...)");
        return (va.f) value;
    }

    private final void M() {
        f0 L = L();
        L.C().observe(getViewLifecycleOwner(), new c(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 N;
                N = SwitchScheduleFragment.N(SwitchScheduleFragment.this, (Integer) obj);
                return N;
            }
        }));
        L.A().observe(getViewLifecycleOwner(), new c(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 O;
                O = SwitchScheduleFragment.O(SwitchScheduleFragment.this, (Boolean) obj);
                return O;
            }
        }));
        L.F().observe(getViewLifecycleOwner(), new c(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 P;
                P = SwitchScheduleFragment.P(SwitchScheduleFragment.this, (Boolean) obj);
                return P;
            }
        }));
        L.G().observe(getViewLifecycleOwner(), new c(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Q;
                Q = SwitchScheduleFragment.Q(SwitchScheduleFragment.this, (b) obj);
                return Q;
            }
        }));
        L.H().observe(getViewLifecycleOwner(), new c(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 R;
                R = SwitchScheduleFragment.R(SwitchScheduleFragment.this, (b) obj);
                return R;
            }
        }));
        L.D().observe(getViewLifecycleOwner(), new c(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 S;
                S = SwitchScheduleFragment.S(SwitchScheduleFragment.this, (List) obj);
                return S;
            }
        }));
        L.B().f90403e.observe(getViewLifecycleOwner(), new c(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 T;
                T = SwitchScheduleFragment.T(SwitchScheduleFragment.this, (Void) obj);
                return T;
            }
        }));
        L().J(K().b());
    }

    public static final g2 N(SwitchScheduleFragment switchScheduleFragment, Integer num) {
        p50.h I = switchScheduleFragment.I();
        kotlin.jvm.internal.g0.m(num);
        I.notifyItemRemoved(num.intValue());
        return g2.f100423a;
    }

    public static final g2 O(SwitchScheduleFragment switchScheduleFragment, Boolean bool) {
        if (bool.booleanValue()) {
            switchScheduleFragment.J().show();
        } else {
            switchScheduleFragment.J().dismiss();
        }
        return g2.f100423a;
    }

    public static final g2 P(SwitchScheduleFragment switchScheduleFragment, Boolean bool) {
        FragmentActivity activity = switchScheduleFragment.getActivity();
        EditScheduleActivity editScheduleActivity = activity instanceof EditScheduleActivity ? (EditScheduleActivity) activity : null;
        if (editScheduleActivity != null) {
            g1.d(editScheduleActivity, null, 1, null);
        }
        return g2.f100423a;
    }

    public static final g2 Q(SwitchScheduleFragment switchScheduleFragment, com.baicizhan.main.activity.schedule_v2.switchschedule.b bVar) {
        kotlin.jvm.internal.g0.m(bVar);
        switchScheduleFragment.Y(bVar);
        return g2.f100423a;
    }

    public static final g2 R(SwitchScheduleFragment switchScheduleFragment, com.baicizhan.main.activity.schedule_v2.switchschedule.b bVar) {
        kotlin.jvm.internal.g0.m(bVar);
        switchScheduleFragment.a0(bVar);
        return g2.f100423a;
    }

    public static final g2 S(SwitchScheduleFragment switchScheduleFragment, List list) {
        switchScheduleFragment.I().m(list);
        switchScheduleFragment.I().notifyDataSetChanged();
        ya yaVar = switchScheduleFragment.f19455h;
        ya yaVar2 = null;
        if (yaVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            yaVar = null;
        }
        if (yaVar.f57575c.getItemDecorationCount() < 1) {
            ya yaVar3 = switchScheduleFragment.f19455h;
            if (yaVar3 == null) {
                kotlin.jvm.internal.g0.S("binding");
                yaVar3 = null;
            }
            yaVar3.f57575c.addItemDecoration(new com.baicizhan.main.activity.schedule_v2.switchschedule.c());
        }
        kotlin.jvm.internal.g0.m(list);
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (((com.baicizhan.main.activity.schedule_v2.switchschedule.b) it.next()).r()) {
                break;
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            qb.c.i(f19452n, String.valueOf(intValue), new Object[0]);
            ya yaVar4 = switchScheduleFragment.f19455h;
            if (yaVar4 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                yaVar2 = yaVar4;
            }
            RecyclerView.LayoutManager layoutManager = yaVar2.f57575c.getLayoutManager();
            kotlin.jvm.internal.g0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(intValue, 0);
        }
        return g2.f100423a;
    }

    public static final g2 T(SwitchScheduleFragment switchScheduleFragment, Void r12) {
        switchScheduleFragment.L().J(switchScheduleFragment.K().b());
        return g2.f100423a;
    }

    private final void U() {
        ya yaVar = this.f19455h;
        ya yaVar2 = null;
        if (yaVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            yaVar = null;
        }
        yaVar.setLifecycleOwner(this);
        yaVar.j(L());
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.o
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SwitchScheduleFragment.V(SwitchScheduleFragment.this, (ActivityResult) obj);
            }
        });
        kotlin.jvm.internal.g0.o(registerForActivityResult, "registerForActivityResult(...)");
        this.f19458k = registerForActivityResult;
        yaVar.f57573a.setOnClickListener(new b());
        ya yaVar3 = this.f19455h;
        if (yaVar3 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            yaVar2 = yaVar3;
        }
        yaVar2.f57575c.setAdapter(I());
    }

    public static final void V(SwitchScheduleFragment switchScheduleFragment, ActivityResult it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (it.getResultCode() == -1) {
            FragmentActivity activity = switchScheduleFragment.getActivity();
            EditScheduleActivity editScheduleActivity = activity instanceof EditScheduleActivity ? (EditScheduleActivity) activity : null;
            if (editScheduleActivity != null) {
                g1.d(editScheduleActivity, null, 1, null);
            }
        }
    }

    public static final va.f W(SwitchScheduleFragment switchScheduleFragment) {
        return gi.e.c(switchScheduleFragment.getActivity());
    }

    public static final g2 Z(SwitchScheduleFragment switchScheduleFragment, com.baicizhan.main.activity.schedule_v2.switchschedule.b bVar, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        switchScheduleFragment.L().p(bVar);
        return g2.f100423a;
    }

    public static final g2 b0(SwitchScheduleFragment switchScheduleFragment, com.baicizhan.main.activity.schedule_v2.switchschedule.b bVar, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        switchScheduleFragment.L().t(bVar);
        return g2.f100423a;
    }

    public final p50.h I() {
        return (p50.h) this.f19457j.getValue();
    }

    @m80.k
    public final b1 K() {
        b1 b1Var = this.f19454g;
        if (b1Var != null) {
            return b1Var;
        }
        kotlin.jvm.internal.g0.S("shareModel");
        return null;
    }

    public final f0 L() {
        return (f0) this.f19453f.getValue();
    }

    public final void X(@m80.k b1 b1Var) {
        kotlin.jvm.internal.g0.p(b1Var, "<set-?>");
        this.f19454g = b1Var;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [kc.d, kc.h] */
    public final void Y(final com.baicizhan.main.activity.schedule_v2.switchschedule.b bVar) {
        mc.a.l(this, ((u.a) d.a.I(mc.a.e(this).L(R.string.schedule_dialog_title_delete).V(getString(R.string.main_alert_message_delete_schedule, Integer.valueOf(bVar.p()))), R.string.main_alert_message_delete_schedule_confirm, null, new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Z;
                Z = SwitchScheduleFragment.Z(SwitchScheduleFragment.this, bVar, (View) obj);
                return Z;
            }
        }, 2, null)).d(), "delete");
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [kc.d, kc.h] */
    public final void a0(final com.baicizhan.main.activity.schedule_v2.switchschedule.b bVar) {
        mc.a.l(this, ((u.a) d.a.J(mc.a.e(this).V(getString(d1.c(K().d()) ? R.string.schedule_switch_select_confirm_from_device : R.string.schedule_switch_select_confirm, bVar.o())), null, null, new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b02;
                b02 = SwitchScheduleFragment.b0(SwitchScheduleFragment.this, bVar, (View) obj);
                return b02;
            }
        }, 3, null)).d(), "switch");
    }

    @Override // androidx.fragment.app.Fragment
    @m80.k
    public View onCreateView(@m80.k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.fragment_switch_schedule, viewGroup, false);
        kotlin.jvm.internal.g0.o(inflate, "inflate(...)");
        this.f19455h = (ya) inflate;
        U();
        M();
        ya yaVar = this.f19455h;
        if (yaVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            yaVar = null;
        }
        View root = yaVar.getRoot();
        kotlin.jvm.internal.g0.o(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (K().a()) {
            L().J(K().b());
            K().e(false);
        }
    }
}
