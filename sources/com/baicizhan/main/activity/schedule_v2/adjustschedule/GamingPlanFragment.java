package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import android.os.Bundle;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.aigestudio.wheelpicker.WheelPicker;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.n2;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.jiongji.andriod.card.R;
import gs.l3;
import gs.n3;
import gs.t8;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import kc.d;
import kc.u;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nGamingPlanFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamingPlanFragment.kt\ncom/baicizhan/main/activity/schedule_v2/adjustschedule/GamingPlanFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,342:1\n106#2,15:343\n*S KotlinDebug\n*F\n+ 1 GamingPlanFragment.kt\ncom/baicizhan/main/activity/schedule_v2/adjustschedule/GamingPlanFragment\n*L\n49#1:343,15\n*E\n"})
@qu.b
/* loaded from: classes4.dex */
public final class GamingPlanFragment extends k2 {

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final a f18975l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f18976m = 8;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final String f18977n = "GamingPlanFragment";

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public oe.b1 f18978f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final yz.c0 f18979g;

    /* renamed from: h, reason: collision with root package name */
    public t8 f18980h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final yz.c0 f18981i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public l3 f18982j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public n3 f18983k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanFragment$initObs$1$10$2", f = "GamingPlanFragment.kt", i = {}, l = {DefaultImageHeaderParser.f28794q}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18984a;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return GamingPlanFragment.this.new b(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f18984a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f18984a = 1;
                if (c40.a1.b(150L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            t8 t8Var = GamingPlanFragment.this.f18980h;
            if (t8Var == null) {
                kotlin.jvm.internal.g0.S("binding");
                t8Var = null;
            }
            t8Var.f56855o.setVisibility(0);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends sa.c {
        public c() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View view) {
            super.onClick(view);
            GamingPlanFragment.this.T().N();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f18987a;

        public d(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f18987a = function;
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
            return this.f18987a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f18987a.invoke(obj);
        }
    }

    public GamingPlanFragment() {
        final x00.a<Fragment> aVar = new x00.a<Fragment>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanFragment$special$$inlined$viewModels$default$1
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
        final yz.c0 b11 = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a<ViewModelStoreOwner>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanFragment$special$$inlined$viewModels$default$2
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
        this.f18979g = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.o0.d(b2.class), new x00.a<ViewModelStore>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanFragment$special$$inlined$viewModels$default$3
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
        }, new x00.a<CreationExtras>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanFragment$special$$inlined$viewModels$default$4
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
        }, new x00.a<ViewModelProvider.Factory>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanFragment$special$$inlined$viewModels$default$5
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
        this.f18981i = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.m1
            @Override // x00.a
            public final Object invoke() {
                va.f r02;
                r02 = GamingPlanFragment.r0(GamingPlanFragment.this);
                return r02;
            }
        });
    }

    private final va.f S() {
        Object value = this.f18981i.getValue();
        kotlin.jvm.internal.g0.o(value, "getValue(...)");
        return (va.f) value;
    }

    private final void V() {
        b2 T = T();
        T.D().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.s1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 W;
                W = GamingPlanFragment.W(GamingPlanFragment.this, (List) obj);
                return W;
            }
        }));
        T.B().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.f1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 X;
                X = GamingPlanFragment.X(GamingPlanFragment.this, (Integer) obj);
                return X;
            }
        }));
        T.C().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.g1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 e02;
                e02 = GamingPlanFragment.e0(GamingPlanFragment.this, (Integer) obj);
                return e02;
            }
        }));
        T.s().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.h1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 f02;
                f02 = GamingPlanFragment.f0(GamingPlanFragment.this, (List) obj);
                return f02;
            }
        }));
        T.r().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.i1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 g02;
                g02 = GamingPlanFragment.g0(GamingPlanFragment.this, (Integer) obj);
                return g02;
            }
        }));
        T.I().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.j1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 h02;
                h02 = GamingPlanFragment.h0(GamingPlanFragment.this, (Spannable) obj);
                return h02;
            }
        }));
        T.J().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.k1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 i02;
                i02 = GamingPlanFragment.i0(GamingPlanFragment.this, (Spannable) obj);
                return i02;
            }
        }));
        T.z().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.l1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 j02;
                j02 = GamingPlanFragment.j0(GamingPlanFragment.this, (Triple) obj);
                return j02;
            }
        }));
        T.A().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.n1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 k02;
                k02 = GamingPlanFragment.k0(GamingPlanFragment.this, (n2) obj);
                return k02;
            }
        }));
        T.u().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.o1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 l02;
                l02 = GamingPlanFragment.l0(GamingPlanFragment.this, (k3.q0) obj);
                return l02;
            }
        }));
        T.o().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.t1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 Y;
                Y = GamingPlanFragment.Y(GamingPlanFragment.this, (String) obj);
                return Y;
            }
        }));
        T.q().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.u1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 Z;
                Z = GamingPlanFragment.Z(GamingPlanFragment.this, (String) obj);
                return Z;
            }
        }));
        T.p().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.v1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 a02;
                a02 = GamingPlanFragment.a0(GamingPlanFragment.this, (String) obj);
                return a02;
            }
        }));
        T.H().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.w1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 b02;
                b02 = GamingPlanFragment.b0(GamingPlanFragment.this, (Integer) obj);
                return b02;
            }
        }));
        T.x().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.c1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 c02;
                c02 = GamingPlanFragment.c0(GamingPlanFragment.this, (Boolean) obj);
                return c02;
            }
        }));
        T.t().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.d1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 d02;
                d02 = GamingPlanFragment.d0(GamingPlanFragment.this, (Serializable) obj);
                return d02;
            }
        }));
        T().F().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.e1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 m02;
                m02 = GamingPlanFragment.m0(GamingPlanFragment.this, (Boolean) obj);
                return m02;
            }
        }));
    }

    public static final yz.g2 W(GamingPlanFragment gamingPlanFragment, List list) {
        t8 t8Var = gamingPlanFragment.f18980h;
        if (t8Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            t8Var = null;
        }
        t8Var.f56852l.setData(list);
        return yz.g2.f100423a;
    }

    public static final yz.g2 X(GamingPlanFragment gamingPlanFragment, Integer num) {
        t8 t8Var = gamingPlanFragment.f18980h;
        if (t8Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            t8Var = null;
        }
        WheelPicker wheelPicker = t8Var.f56852l;
        kotlin.jvm.internal.g0.m(num);
        wheelPicker.s(num.intValue(), false);
        return yz.g2.f100423a;
    }

    public static final yz.g2 Y(GamingPlanFragment gamingPlanFragment, String str) {
        ImageView imageView;
        l3 l3Var = gamingPlanFragment.f18982j;
        if (l3Var == null || (imageView = l3Var.f55694a) == null) {
            n3 n3Var = gamingPlanFragment.f18983k;
            imageView = n3Var != null ? n3Var.f55979a : null;
        }
        if (imageView != null) {
            kotlin.jvm.internal.g0.m(str);
            hc.c.l(str).f(R.drawable.ic_book_cover_default).j(R.drawable.ic_book_cover_default).o(imageView);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z(GamingPlanFragment gamingPlanFragment, String str) {
        TextView textView;
        l3 l3Var = gamingPlanFragment.f18982j;
        if (l3Var == null || (textView = l3Var.f55696c) == null) {
            n3 n3Var = gamingPlanFragment.f18983k;
            textView = n3Var != null ? n3Var.f55981c : null;
        }
        if (textView != null) {
            textView.setText(str);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 a0(GamingPlanFragment gamingPlanFragment, String str) {
        TextView textView;
        n3 n3Var = gamingPlanFragment.f18983k;
        if (n3Var != null && (textView = n3Var.f55980b) != null) {
            textView.setText(str);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 b0(GamingPlanFragment gamingPlanFragment, Integer num) {
        kotlin.jvm.internal.g0.m(num);
        gamingPlanFragment.s0(num.intValue());
        return yz.g2.f100423a;
    }

    public static final yz.g2 c0(GamingPlanFragment gamingPlanFragment, Boolean bool) {
        if (bool.booleanValue()) {
            gamingPlanFragment.S().show();
        } else {
            gamingPlanFragment.S().dismiss();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 d0(GamingPlanFragment gamingPlanFragment, Serializable serializable) {
        FragmentActivity activity = gamingPlanFragment.getActivity();
        EditScheduleActivity editScheduleActivity = activity instanceof EditScheduleActivity ? (EditScheduleActivity) activity : null;
        if (editScheduleActivity != null) {
            oe.g1.c(editScheduleActivity, serializable);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 e0(GamingPlanFragment gamingPlanFragment, Integer num) {
        t8 t8Var = gamingPlanFragment.f18980h;
        if (t8Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            t8Var = null;
        }
        t8Var.f56851k.setText("每日组数 (每组 " + num + " 词)");
        return yz.g2.f100423a;
    }

    public static final yz.g2 f0(GamingPlanFragment gamingPlanFragment, List list) {
        t8 t8Var = gamingPlanFragment.f18980h;
        if (t8Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            t8Var = null;
        }
        t8Var.f56854n.setData(list);
        return yz.g2.f100423a;
    }

    public static final yz.g2 g0(GamingPlanFragment gamingPlanFragment, Integer num) {
        t8 t8Var = gamingPlanFragment.f18980h;
        if (t8Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            t8Var = null;
        }
        WheelPicker wheelPicker = t8Var.f56854n;
        kotlin.jvm.internal.g0.m(num);
        wheelPicker.s(num.intValue(), false);
        return yz.g2.f100423a;
    }

    public static final yz.g2 h0(GamingPlanFragment gamingPlanFragment, Spannable spannable) {
        t8 t8Var = gamingPlanFragment.f18980h;
        if (t8Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            t8Var = null;
        }
        t8Var.f56849i.setText(spannable);
        return yz.g2.f100423a;
    }

    public static final yz.g2 i0(GamingPlanFragment gamingPlanFragment, Spannable spannable) {
        t8 t8Var = gamingPlanFragment.f18980h;
        if (t8Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            t8Var = null;
        }
        t8Var.f56850j.setText(spannable);
        return yz.g2.f100423a;
    }

    public static final yz.g2 j0(GamingPlanFragment gamingPlanFragment, Triple triple) {
        int intValue = ((Number) triple.component1()).intValue();
        int intValue2 = ((Number) triple.component2()).intValue();
        int intValue3 = ((Number) triple.component3()).intValue();
        l3 l3Var = gamingPlanFragment.f18982j;
        if (l3Var != null) {
            l3Var.f55697d.setMax(intValue3);
            l3Var.f55697d.setProgress(intValue2);
            l3Var.f55699f.setMax(intValue3);
            l3Var.f55699f.setProgress(intValue);
            ThemeResUtil.setBaicizhanProgress(gamingPlanFragment.getContext(), l3Var.f55697d, 50, ColorKt.m2563toArgb8_81llA(bk.b.J()), ColorKt.m2563toArgb8_81llA(bk.b.g0()));
            ThemeResUtil.setBaicizhanProgress(gamingPlanFragment.getContext(), l3Var.f55699f, 50, gamingPlanFragment.getResources().getColor(R.color.transparent), ColorKt.m2563toArgb8_81llA(bk.b.e0()));
            l3Var.f55705l.setText(gamingPlanFragment.getString(R.string.schedule_adjust_total_count_des, Integer.valueOf(intValue3)));
            l3Var.f55704k.setText(gamingPlanFragment.getString(R.string.schedule_adjust_total_count_des, Integer.valueOf(intValue3)));
            TextView textView = l3Var.f55704k;
            textView.setText(textView.getContext().getString(R.string.schedule_adjust_total_master_count_des, Integer.valueOf(intValue)));
            TextView textView2 = l3Var.f55703j;
            textView2.setText(textView2.getContext().getString(R.string.schedule_adjust_total_learn_count_des, Integer.valueOf(intValue2)));
            int i11 = intValue == 0 ? 8 : 0;
            l3Var.f55700g.setVisibility(i11);
            l3Var.f55704k.setVisibility(i11);
        }
        n3 n3Var = gamingPlanFragment.f18983k;
        if (n3Var != null) {
            n3Var.f55982d.setText(gamingPlanFragment.getString(R.string.schedule_adjust_total_count_des, Integer.valueOf(intValue3)));
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 k0(GamingPlanFragment gamingPlanFragment, n2 n2Var) {
        l3 l3Var = gamingPlanFragment.f18982j;
        if (l3Var != null) {
            if (n2Var instanceof n2.b) {
                n2.b bVar = (n2.b) n2Var;
                l3Var.f55695b.setText(gamingPlanFragment.getString(R.string.schedule_adjust_remain, Integer.valueOf(bVar.e()), Integer.valueOf(bVar.f())));
            } else {
                if (!(n2Var instanceof n2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                l3Var.f55695b.setText(gamingPlanFragment.getString(R.string.schedule_switch_reviewing, Integer.valueOf(((n2.a) n2Var).d())));
            }
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 l0(GamingPlanFragment gamingPlanFragment, k3.q0 q0Var) {
        TextView textView;
        if (q0Var == null) {
            gamingPlanFragment.T().y().d();
            return yz.g2.f100423a;
        }
        gamingPlanFragment.T().y().s();
        t8 t8Var = gamingPlanFragment.f18980h;
        t8 t8Var2 = null;
        if (t8Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            t8Var = null;
        }
        t8Var.f56841a.setVisibility(8);
        if (q0Var.s() >= q0Var.v()) {
            l3 l3Var = gamingPlanFragment.f18982j;
            if (l3Var != null && (textView = l3Var.f55695b) != null) {
                textView.setText(gamingPlanFragment.getString(R.string.schedule_adjust_tips_all_killed));
            }
            t8 t8Var3 = gamingPlanFragment.f18980h;
            if (t8Var3 == null) {
                kotlin.jvm.internal.g0.S("binding");
                t8Var3 = null;
            }
            t8Var3.f56841a.setVisibility(0);
            t8 t8Var4 = gamingPlanFragment.f18980h;
            if (t8Var4 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                t8Var2 = t8Var4;
            }
            Group noproguardTipsGroup = t8Var2.f56848h;
            kotlin.jvm.internal.g0.o(noproguardTipsGroup, "noproguardTipsGroup");
            sa.q.z(noproguardTipsGroup, false);
        } else {
            t8 t8Var5 = gamingPlanFragment.f18980h;
            if (t8Var5 == null) {
                kotlin.jvm.internal.g0.S("binding");
                t8Var5 = null;
            }
            t8Var5.f56841a.setVisibility(8);
            t8 t8Var6 = gamingPlanFragment.f18980h;
            if (t8Var6 == null) {
                kotlin.jvm.internal.g0.S("binding");
                t8Var6 = null;
            }
            Group noproguardTipsGroup2 = t8Var6.f56848h;
            kotlin.jvm.internal.g0.o(noproguardTipsGroup2, "noproguardTipsGroup");
            sa.q.z(noproguardTipsGroup2, true);
            c40.k.f(LifecycleOwnerKt.getLifecycleScope(gamingPlanFragment), null, null, gamingPlanFragment.new b(null), 3, null);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 m0(GamingPlanFragment gamingPlanFragment, Boolean bool) {
        t8 t8Var = gamingPlanFragment.f18980h;
        if (t8Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            t8Var = null;
        }
        TextView textView = t8Var.f56844d;
        kotlin.jvm.internal.g0.m(bool);
        textView.setEnabled(bool.booleanValue());
        return yz.g2.f100423a;
    }

    private final void n0() {
        t8 t8Var = null;
        if (oe.d1.a(U().d())) {
            l3 d11 = l3.d(LayoutInflater.from(getContext()));
            this.f18982j = d11;
            kotlin.jvm.internal.g0.m(d11);
            d11.f55701h.setOnClickListener(new c());
            t8 t8Var2 = this.f18980h;
            if (t8Var2 == null) {
                kotlin.jvm.internal.g0.S("binding");
                t8Var2 = null;
            }
            t8Var2.f56844d.setText(getString(R.string.schedule_adjust_confirm));
            T().start();
        } else if (oe.d1.d(U().d())) {
            t8 t8Var3 = this.f18980h;
            if (t8Var3 == null) {
                kotlin.jvm.internal.g0.S("binding");
                t8Var3 = null;
            }
            t8Var3.f56844d.setText(getString(R.string.schedule_adjust_confirm_new));
            t8 t8Var4 = this.f18980h;
            if (t8Var4 == null) {
                kotlin.jvm.internal.g0.S("binding");
                t8Var4 = null;
            }
            t8Var4.f56844d.setEnabled(true);
            this.f18983k = n3.d(LayoutInflater.from(getContext()));
            T().start();
        } else if (oe.d1.b(U().d())) {
            t8 t8Var5 = this.f18980h;
            if (t8Var5 == null) {
                kotlin.jvm.internal.g0.S("binding");
                t8Var5 = null;
            }
            t8Var5.f56844d.setText(getString(R.string.schedule_adjust_confirm_new));
            n3 d12 = n3.d(LayoutInflater.from(getContext()));
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(d12.f55983e);
            constraintSet.clear(R.id.book_word_count);
            constraintSet.connect(R.id.book_word_count, 6, R.id.book_name, 6);
            constraintSet.connect(R.id.book_word_count, 7, R.id.root, 7);
            constraintSet.connect(R.id.book_word_count, 3, R.id.book_name, 4);
            constraintSet.connect(R.id.book_word_count, 4, R.id.root, 4);
            constraintSet.setMargin(R.id.book_word_count, 3, xb.f.a(requireContext(), 8.0f));
            constraintSet.applyTo(d12.f55983e);
            this.f18983k = d12;
            if (!(requireActivity() instanceof oe.s0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        n3 n3Var = this.f18983k;
        if (n3Var != null) {
            t8 t8Var6 = this.f18980h;
            if (t8Var6 == null) {
                kotlin.jvm.internal.g0.S("binding");
                t8Var6 = null;
            }
            t8Var6.f56856p.addView(n3Var.f55983e);
        }
        l3 l3Var = this.f18982j;
        if (l3Var != null) {
            l3Var.f55702i.setVisibility(8);
            t8 t8Var7 = this.f18980h;
            if (t8Var7 == null) {
                kotlin.jvm.internal.g0.S("binding");
                t8Var7 = null;
            }
            t8Var7.f56856p.addView(l3Var.getRoot());
        }
        t8 t8Var8 = this.f18980h;
        if (t8Var8 == null) {
            kotlin.jvm.internal.g0.S("binding");
            t8Var8 = null;
        }
        t8Var8.f56844d.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GamingPlanFragment.o0(GamingPlanFragment.this, view);
            }
        });
        t8 t8Var9 = this.f18980h;
        if (t8Var9 == null) {
            kotlin.jvm.internal.g0.S("binding");
            t8Var9 = null;
        }
        t8Var9.f56852l.setOnItemSelectedListener(new WheelPicker.a() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.q1
            @Override // com.aigestudio.wheelpicker.WheelPicker.a
            public final void W(WheelPicker wheelPicker, Object obj, int i11) {
                GamingPlanFragment.p0(GamingPlanFragment.this, wheelPicker, obj, i11);
            }
        });
        t8 t8Var10 = this.f18980h;
        if (t8Var10 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            t8Var = t8Var10;
        }
        t8Var.f56854n.setOnItemSelectedListener(new WheelPicker.a() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.r1
            @Override // com.aigestudio.wheelpicker.WheelPicker.a
            public final void W(WheelPicker wheelPicker, Object obj, int i11) {
                GamingPlanFragment.q0(GamingPlanFragment.this, wheelPicker, obj, i11);
            }
        });
    }

    public static final void o0(GamingPlanFragment gamingPlanFragment, View view) {
        gamingPlanFragment.T().O();
    }

    public static final void p0(GamingPlanFragment gamingPlanFragment, WheelPicker wheelPicker, Object obj, int i11) {
        qb.c.i(f18977n, "round to pos %d", Integer.valueOf(i11));
        gamingPlanFragment.T().R(i11);
    }

    public static final void q0(GamingPlanFragment gamingPlanFragment, WheelPicker wheelPicker, Object obj, int i11) {
        qb.c.i(f18977n, "day to pos %d", Integer.valueOf(i11));
        gamingPlanFragment.T().Q(i11);
    }

    public static final va.f r0(GamingPlanFragment gamingPlanFragment) {
        return gi.e.c(gamingPlanFragment.getActivity());
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [kc.d, kc.h] */
    private final void s0(int i11) {
        mc.a.l(this, ((u.a) d.a.J(mc.a.e(this).L(R.string.schedule_dialog_title_reset).V(getString(R.string.main_alert_message_reset_schedule, Integer.valueOf(i11))), null, null, new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.b1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 t02;
                t02 = GamingPlanFragment.t0(GamingPlanFragment.this, (View) obj);
                return t02;
            }
        }, 3, null)).d(), "reset");
    }

    public static final yz.g2 t0(GamingPlanFragment gamingPlanFragment, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        gamingPlanFragment.T().n();
        gamingPlanFragment.U().e(true);
        return yz.g2.f100423a;
    }

    public final b2 T() {
        return (b2) this.f18979g.getValue();
    }

    @m80.k
    public final oe.b1 U() {
        oe.b1 b1Var = this.f18978f;
        if (b1Var != null) {
            return b1Var;
        }
        kotlin.jvm.internal.g0.S("shareModel");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @m80.k
    public View onCreateView(@m80.k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.fragment_gaming_plan, viewGroup, false);
        kotlin.jvm.internal.g0.o(inflate, "inflate(...)");
        t8 t8Var = (t8) inflate;
        this.f18980h = t8Var;
        t8 t8Var2 = null;
        if (t8Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            t8Var = null;
        }
        t8Var.setLifecycleOwner(this);
        t8 t8Var3 = this.f18980h;
        if (t8Var3 == null) {
            kotlin.jvm.internal.g0.S("binding");
            t8Var3 = null;
        }
        t8Var3.j(T().y());
        getLifecycle().addObserver(T());
        n0();
        V();
        t8 t8Var4 = this.f18980h;
        if (t8Var4 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            t8Var2 = t8Var4;
        }
        View root = t8Var2.getRoot();
        kotlin.jvm.internal.g0.o(root, "getRoot(...)");
        return root;
    }

    public final void u0(@m80.k oe.b1 b1Var) {
        kotlin.jvm.internal.g0.p(b1Var, "<set-?>");
        this.f18978f = b1Var;
    }
}
