package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.KeyEventDispatcher;
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
import com.baicizhan.client.business.util.CombinedLiveData;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;
import com.baicizhan.main.activity.schedule_v2.ScheduleType;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.n2;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.y0;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.ModeDetail;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.main.home.plan.data.LearnCardStatus;
import com.jiongji.andriod.card.R;
import gs.l3;
import gs.n3;
import gs.p7;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kc.d;
import kc.u;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nAdjustScheduleClassicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdjustScheduleClassicFragment.kt\ncom/baicizhan/main/activity/schedule_v2/adjustschedule/AdjustScheduleClassicFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,590:1\n106#2,15:591\n106#2,15:606\n1#3:621\n*S KotlinDebug\n*F\n+ 1 AdjustScheduleClassicFragment.kt\ncom/baicizhan/main/activity/schedule_v2/adjustschedule/AdjustScheduleClassicFragment\n*L\n61#1:591,15\n63#1:606,15\n*E\n"})
@qu.b
/* loaded from: classes4.dex */
public final class AdjustScheduleClassicFragment extends j2 {

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final a f18957p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f18958q = 8;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final String f18959r = "AdjustScheduleTAG";

    /* renamed from: i, reason: collision with root package name */
    @Inject
    public oe.b1 f18960i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final yz.c0 f18961j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final yz.c0 f18962k;

    /* renamed from: l, reason: collision with root package name */
    public p7 f18963l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final yz.c0 f18964m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    public l3 f18965n;

    /* renamed from: o, reason: collision with root package name */
    @m80.l
    public n3 f18966o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final Fragment a() {
            return new AdjustScheduleClassicFragment();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18967a;

        static {
            int[] iArr = new int[ScheduleStatus.values().length];
            try {
                iArr[ScheduleStatus.NORMAL_REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f18967a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends sa.c {
        public c() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View view) {
            super.onClick(view);
            AdjustScheduleClassicFragment.this.l0().d0();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment$initView$3$1", f = "AdjustScheduleClassicFragment.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"$this$launch", "config"}, s = {"L$0", "L$1"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nAdjustScheduleClassicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdjustScheduleClassicFragment.kt\ncom/baicizhan/main/activity/schedule_v2/adjustschedule/AdjustScheduleClassicFragment$initView$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,590:1\n1#2:591\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18969a;

        /* renamed from: b, reason: collision with root package name */
        public int f18970b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f18971c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ij.e f18973e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ij.e eVar, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f18973e = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            d dVar = AdjustScheduleClassicFragment.this.new d(this.f18973e, cVar);
            dVar.f18971c = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            oe.s0 s0Var;
            Object obj2;
            c40.r0 r0Var = (c40.r0) this.f18971c;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f18970b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                KeyEventDispatcher.Component requireActivity = AdjustScheduleClassicFragment.this.requireActivity();
                kotlin.jvm.internal.g0.n(requireActivity, "null cannot be cast to non-null type com.baicizhan.main.activity.schedule_v2.FavoritePlanConfig");
                oe.s0 s0Var2 = (oe.s0) requireActivity;
                ij.q O = this.f18973e.O();
                long bookId = s0Var2.a0().getBookId();
                this.f18971c = r0Var;
                this.f18969a = s0Var2;
                this.f18970b = 1;
                Object j02 = O.j0(bookId, this);
                if (j02 == l11) {
                    return l11;
                }
                s0Var = s0Var2;
                obj2 = j02;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s0Var = (oe.s0) this.f18969a;
                kotlin.e.n(obj);
                obj2 = ((Result) obj).m6317unboximpl();
            }
            AdjustScheduleClassicFragment adjustScheduleClassicFragment = AdjustScheduleClassicFragment.this;
            if (Result.m6315isSuccessimpl(obj2)) {
                kj.a aVar = (kj.a) obj2;
                Long g11 = l00.a.g(s0Var.L());
                if (g11.longValue() == 0) {
                    g11 = null;
                }
                if (g11 == null) {
                    qb.c.d(AdjustScheduleClassicFragment.f18959r, "device id illegal!", new Object[0]);
                    return yz.g2.f100423a;
                }
                adjustScheduleClassicFragment.l0().h0(aVar, g11.longValue(), s0Var.a0().getPlanCount());
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f18974a;

        public e(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f18974a = function;
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
            return this.f18974a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f18974a.invoke(obj);
        }
    }

    public AdjustScheduleClassicFragment() {
        final x00.a<Fragment> aVar = new x00.a<Fragment>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final yz.c0 b11 = yz.e0.b(lazyThreadSafetyMode, new x00.a<ViewModelStoreOwner>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment$special$$inlined$viewModels$default$2
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
        this.f18961j = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.o0.d(com.baicizhan.main.activity.schedule_v2.adjustschedule.e.class), new x00.a<ViewModelStore>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment$special$$inlined$viewModels$default$3
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
        }, new x00.a<CreationExtras>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment$special$$inlined$viewModels$default$4
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
        }, new x00.a<ViewModelProvider.Factory>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment$special$$inlined$viewModels$default$5
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
        final x00.a<Fragment> aVar3 = new x00.a<Fragment>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment$special$$inlined$viewModels$default$6
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
        final yz.c0 b12 = yz.e0.b(lazyThreadSafetyMode, new x00.a<ViewModelStoreOwner>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment$special$$inlined$viewModels$default$7
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
        this.f18962k = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.o0.d(com.baicizhan.main.activity.schedule_v2.mutimode.j0.class), new x00.a<ViewModelStore>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment$special$$inlined$viewModels$default$8
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
        }, new x00.a<CreationExtras>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment$special$$inlined$viewModels$default$9
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
                x00.a aVar4 = x00.a.this;
                if (aVar4 != null && (creationExtras = (CreationExtras) aVar4.invoke()) != null) {
                    return creationExtras;
                }
                m5612viewModels$lambda1 = FragmentViewModelLazyKt.m5612viewModels$lambda1(b12);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5612viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5612viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new x00.a<ViewModelProvider.Factory>() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment$special$$inlined$viewModels$default$10
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
                m5612viewModels$lambda1 = FragmentViewModelLazyKt.m5612viewModels$lambda1(b12);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5612viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5612viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? Fragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.f18964m = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.u0
            @Override // x00.a
            public final Object invoke() {
                va.f U0;
                U0 = AdjustScheduleClassicFragment.U0(AdjustScheduleClassicFragment.this);
                return U0;
            }
        });
    }

    public static final yz.g2 A0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, Integer num) {
        kotlin.jvm.internal.g0.m(num);
        adjustScheduleClassicFragment.V0(num.intValue());
        return yz.g2.f100423a;
    }

    public static final yz.g2 B0(final AdjustScheduleClassicFragment adjustScheduleClassicFragment, final com.baicizhan.main.activity.schedule_v2.adjustschedule.e eVar, Boolean bool) {
        if (bool.booleanValue()) {
            oe.g1.e(adjustScheduleClassicFragment, new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.p0
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 C0;
                    C0 = AdjustScheduleClassicFragment.C0(e.this, adjustScheduleClassicFragment);
                    return C0;
                }
            });
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 C0(com.baicizhan.main.activity.schedule_v2.adjustschedule.e eVar, AdjustScheduleClassicFragment adjustScheduleClassicFragment) {
        eVar.l(adjustScheduleClassicFragment.n0().i().getValue());
        return yz.g2.f100423a;
    }

    public static final yz.g2 D0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, com.baicizhan.main.activity.schedule_v2.adjustschedule.e eVar, y0 y0Var) {
        p7 p7Var = null;
        if (y0Var instanceof y0.b) {
            p7 p7Var2 = adjustScheduleClassicFragment.f18963l;
            if (p7Var2 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var2 = null;
            }
            p7Var2.f56335s.setIndicatorCheck(null);
            p7 p7Var3 = adjustScheduleClassicFragment.f18963l;
            if (p7Var3 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var3 = null;
            }
            p7Var3.f56323g.setVisibility(0);
            LearnCardStatus value = eVar.I().getValue();
            if (value != null && !value.isAllKill()) {
                p7 p7Var4 = adjustScheduleClassicFragment.f18963l;
                if (p7Var4 == null) {
                    kotlin.jvm.internal.g0.S("binding");
                    p7Var4 = null;
                }
                p7Var4.f56324h.setVisibility(0);
            }
            p7 p7Var5 = adjustScheduleClassicFragment.f18963l;
            if (p7Var5 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                p7Var = p7Var5;
            }
            p7Var.f56323g.setData(((y0.b) y0Var).d());
        } else {
            p7 p7Var6 = adjustScheduleClassicFragment.f18963l;
            if (p7Var6 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var6 = null;
            }
            p7Var6.f56335s.setIndicatorCheck(adjustScheduleClassicFragment.getResources().getDrawable(R.drawable.schedule_done_icon, null));
            p7 p7Var7 = adjustScheduleClassicFragment.f18963l;
            if (p7Var7 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var7 = null;
            }
            p7Var7.f56323g.setVisibility(8);
            p7 p7Var8 = adjustScheduleClassicFragment.f18963l;
            if (p7Var8 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var8 = null;
            }
            p7Var8.f56324h.setVisibility(8);
            p7 p7Var9 = adjustScheduleClassicFragment.f18963l;
            if (p7Var9 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                p7Var = p7Var9;
            }
            p7Var.f56335s.setIndicator(true);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 E0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, Boolean bool) {
        if (bool.booleanValue()) {
            adjustScheduleClassicFragment.m0().show();
        } else {
            adjustScheduleClassicFragment.m0().dismiss();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 F0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, Serializable serializable) {
        FragmentActivity activity = adjustScheduleClassicFragment.getActivity();
        EditScheduleActivity editScheduleActivity = activity instanceof EditScheduleActivity ? (EditScheduleActivity) activity : null;
        if (editScheduleActivity != null) {
            oe.g1.c(editScheduleActivity, serializable);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 G0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, Boolean bool) {
        if (bool.booleanValue()) {
            adjustScheduleClassicFragment.n0().q();
        } else {
            adjustScheduleClassicFragment.n0().l().s();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 H0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, Integer num) {
        p7 p7Var = adjustScheduleClassicFragment.f18963l;
        if (p7Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var = null;
        }
        WheelPicker wheelPicker = p7Var.f56335s;
        kotlin.jvm.internal.g0.m(num);
        wheelPicker.s(num.intValue(), false);
        return yz.g2.f100423a;
    }

    public static final yz.g2 I0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, Integer num) {
        p7 p7Var = adjustScheduleClassicFragment.f18963l;
        if (p7Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var = null;
        }
        WheelPicker wheelPicker = p7Var.f56323g;
        kotlin.jvm.internal.g0.m(num);
        wheelPicker.s(num.intValue(), false);
        return yz.g2.f100423a;
    }

    public static final yz.g2 J0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, Long l11) {
        p7 p7Var = adjustScheduleClassicFragment.f18963l;
        if (p7Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var = null;
        }
        TextView textView = p7Var.f56331o;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(adjustScheduleClassicFragment.getString(R.string.schedule_adjust_finish_date), Locale.getDefault());
        kotlin.jvm.internal.g0.m(l11);
        textView.setText(simpleDateFormat.format(new Date(l11.longValue())));
        return yz.g2.f100423a;
    }

    public static final yz.g2 K0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, String str) {
        p7 p7Var = adjustScheduleClassicFragment.f18963l;
        if (p7Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var = null;
        }
        p7Var.f56334r.setText(str);
        return yz.g2.f100423a;
    }

    public static final yz.g2 L0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, String str) {
        p7 p7Var = adjustScheduleClassicFragment.f18963l;
        p7 p7Var2 = null;
        if (p7Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var = null;
        }
        p7Var.f56329m.setText(str);
        p7 p7Var3 = adjustScheduleClassicFragment.f18963l;
        if (p7Var3 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            p7Var2 = p7Var3;
        }
        Group groupExpectedTime = p7Var2.f56319c;
        kotlin.jvm.internal.g0.o(groupExpectedTime, "groupExpectedTime");
        sa.q.z(groupExpectedTime, str != null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 M0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, Integer num) {
        String string = num.intValue() >= 60 ? adjustScheduleClassicFragment.getString(R.string.schedule_adjust_everyday_cost_hour, Integer.valueOf(num.intValue() / 60)) : "";
        kotlin.jvm.internal.g0.m(string);
        if (num.intValue() % 60 != 0) {
            string = string + adjustScheduleClassicFragment.getString(R.string.schedule_adjust_everyday_cost_min, Integer.valueOf(num.intValue() % 60));
        }
        p7 p7Var = adjustScheduleClassicFragment.f18963l;
        if (p7Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var = null;
        }
        p7Var.f56328l.setText(adjustScheduleClassicFragment.getString(R.string.schedule_adjust_everyday_cost, string));
        return yz.g2.f100423a;
    }

    public static final yz.g2 N0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, r2 r2Var) {
        l3 l3Var = adjustScheduleClassicFragment.f18965n;
        if (l3Var != null) {
            l3Var.f55697d.setMax(r2Var.h());
            l3Var.f55697d.setProgress(r2Var.f());
            l3Var.f55699f.setMax(r2Var.h());
            l3Var.f55699f.setProgress(r2Var.g());
            ThemeResUtil.setBaicizhanProgress(adjustScheduleClassicFragment.getContext(), l3Var.f55697d, 50, ColorKt.m2563toArgb8_81llA(bk.b.J()), ColorKt.m2563toArgb8_81llA(bk.b.g0()));
            ThemeResUtil.setBaicizhanProgress(adjustScheduleClassicFragment.getContext(), l3Var.f55699f, 50, adjustScheduleClassicFragment.getResources().getColor(R.color.transparent), ColorKt.m2563toArgb8_81llA(bk.b.e0()));
            l3Var.f55705l.setText(adjustScheduleClassicFragment.getString(R.string.schedule_adjust_total_count_des, Integer.valueOf(r2Var.h())));
            l3Var.f55704k.setText(adjustScheduleClassicFragment.getString(R.string.schedule_adjust_total_count_des, Integer.valueOf(r2Var.h())));
            TextView textView = l3Var.f55704k;
            textView.setText(textView.getContext().getString(R.string.schedule_adjust_total_master_count_des, Integer.valueOf(r2Var.g())));
            TextView textView2 = l3Var.f55703j;
            textView2.setText(textView2.getContext().getString(R.string.schedule_adjust_total_learn_count_des, Integer.valueOf(r2Var.f())));
            int i11 = r2Var.g() == 0 ? 8 : 0;
            l3Var.f55700g.setVisibility(i11);
            l3Var.f55704k.setVisibility(i11);
        }
        n3 n3Var = adjustScheduleClassicFragment.f18966o;
        if (n3Var != null) {
            n3Var.f55982d.setText(adjustScheduleClassicFragment.getString(R.string.schedule_adjust_total_count_des, Integer.valueOf(r2Var.h())));
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 O0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, ModeDetail modeDetail) {
        kotlin.jvm.internal.g0.m(modeDetail);
        adjustScheduleClassicFragment.i1(modeDetail);
        return yz.g2.f100423a;
    }

    public static final boolean P0(Boolean bool, Boolean bool2) {
        if (bool == null || bool2 == null) {
            return false;
        }
        return bool.booleanValue() || bool2.booleanValue();
    }

    public static final yz.g2 Q0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, Boolean bool) {
        p7 p7Var = adjustScheduleClassicFragment.f18963l;
        if (p7Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var = null;
        }
        TextView textView = p7Var.f56322f;
        kotlin.jvm.internal.g0.m(bool);
        textView.setEnabled(bool.booleanValue());
        return yz.g2.f100423a;
    }

    private final void R0() {
        p7 p7Var = null;
        if (oe.d1.a(o0().d())) {
            l3 d11 = l3.d(LayoutInflater.from(getContext()));
            this.f18965n = d11;
            kotlin.jvm.internal.g0.m(d11);
            d11.f55701h.setOnClickListener(new c());
            p7 p7Var2 = this.f18963l;
            if (p7Var2 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var2 = null;
            }
            p7Var2.f56322f.setText(getString(R.string.schedule_adjust_confirm));
            l0().start();
        } else if (oe.d1.d(o0().d())) {
            p7 p7Var3 = this.f18963l;
            if (p7Var3 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var3 = null;
            }
            p7Var3.f56322f.setText(getString(R.string.schedule_adjust_confirm_new));
            this.f18966o = n3.d(LayoutInflater.from(getContext()));
            l0().start();
        } else if (oe.d1.b(o0().d())) {
            p7 p7Var4 = this.f18963l;
            if (p7Var4 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var4 = null;
            }
            p7Var4.f56322f.setText(getString(R.string.schedule_adjust_confirm_new));
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
            this.f18966o = d12;
            if (!(requireActivity() instanceof oe.s0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            hj.p.e(this, new rj.e() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.v
                @Override // rj.e
                public final void a(ij.e eVar) {
                    AdjustScheduleClassicFragment.S0(AdjustScheduleClassicFragment.this, eVar);
                }
            });
        }
        n3 n3Var = this.f18966o;
        if (n3Var != null) {
            p7 p7Var5 = this.f18963l;
            if (p7Var5 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var5 = null;
            }
            p7Var5.f56337u.addView(n3Var.f55983e);
        }
        l3 l3Var = this.f18965n;
        if (l3Var != null) {
            p7 p7Var6 = this.f18963l;
            if (p7Var6 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var6 = null;
            }
            p7Var6.f56337u.addView(l3Var.getRoot());
        }
        p7 p7Var7 = this.f18963l;
        if (p7Var7 == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var7 = null;
        }
        p7Var7.f56322f.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdjustScheduleClassicFragment.T0(AdjustScheduleClassicFragment.this, view);
            }
        });
        Y0(!oe.d1.b(o0().d()));
        p7 p7Var8 = this.f18963l;
        if (p7Var8 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            p7Var = p7Var8;
        }
        Group tipsNewTimeGroup = p7Var.f56341y;
        kotlin.jvm.internal.g0.o(tipsNewTimeGroup, "tipsNewTimeGroup");
        sa.q.z(tipsNewTimeGroup, false);
        Group groupExpectedTime = p7Var.f56319c;
        kotlin.jvm.internal.g0.o(groupExpectedTime, "groupExpectedTime");
        sa.q.z(groupExpectedTime, false);
        Group tipsDateGroup = p7Var.f56340x;
        kotlin.jvm.internal.g0.o(tipsDateGroup, "tipsDateGroup");
        sa.q.z(tipsDateGroup, true);
        Drawable drawable = KotlinExtKt.getDrawable(R.drawable.ic_schedule_exam_review_tip);
        if (drawable != null) {
            drawable.setBounds(0, 0, KotlinExtKt.getDpPixels(20), KotlinExtKt.getDpPixels(20));
        }
    }

    public static final void S0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, ij.e it) {
        kotlin.jvm.internal.g0.p(it, "it");
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(adjustScheduleClassicFragment), null, null, adjustScheduleClassicFragment.new d(it, null), 3, null);
    }

    public static final void T0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, View view) {
        if (!kotlin.jvm.internal.g0.g(adjustScheduleClassicFragment.l0().K().getValue(), Boolean.TRUE)) {
            adjustScheduleClassicFragment.l0().k(e.f.f19312d);
            return;
        }
        adjustScheduleClassicFragment.l0().k(adjustScheduleClassicFragment.n0().i().getValue());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ma.b.J1, Integer.valueOf(adjustScheduleClassicFragment.n0().j().a()));
        linkedHashMap.put(ma.b.K1, Integer.valueOf(adjustScheduleClassicFragment.n0().i().getValue().a()));
        linkedHashMap.put(ma.b.L1, Integer.valueOf(adjustScheduleClassicFragment.l0().y()));
        yz.g2 g2Var = yz.g2.f100423a;
        ma.l.e(ma.t.f73012k, ma.a.f72802n5, linkedHashMap);
    }

    public static final va.f U0(AdjustScheduleClassicFragment adjustScheduleClassicFragment) {
        return gi.e.c(adjustScheduleClassicFragment.getActivity());
    }

    public static final yz.g2 W0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        adjustScheduleClassicFragment.l0().p();
        adjustScheduleClassicFragment.o0().e(true);
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z0() {
        ma.l.a(ma.t.f73012k, ma.a.f72788l5);
        return yz.g2.f100423a;
    }

    public static final void a1(AdjustScheduleClassicFragment adjustScheduleClassicFragment, x00.a aVar, WheelPicker wheelPicker, Object obj, int i11) {
        qb.c.i(f18959r, "day to pos %d", Integer.valueOf(i11));
        adjustScheduleClassicFragment.l0().s(i11);
        aVar.invoke();
    }

    public static final void b1(AdjustScheduleClassicFragment adjustScheduleClassicFragment, x00.a aVar, WheelPicker wheelPicker, Object obj, int i11) {
        qb.c.i(f18959r, "word to pos %d", Integer.valueOf(i11));
        adjustScheduleClassicFragment.l0().k0(i11);
        aVar.invoke();
    }

    public static final yz.g2 d1(final AdjustScheduleClassicFragment adjustScheduleClassicFragment, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (oe.d1.c(adjustScheduleClassicFragment.o0().d())) {
            Result.m6307boximpl(oe.g1.e(adjustScheduleClassicFragment, new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.k
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 e12;
                    e12 = AdjustScheduleClassicFragment.e1(AdjustScheduleClassicFragment.this);
                    return e12;
                }
            }));
        } else if (kotlin.jvm.internal.g0.g(adjustScheduleClassicFragment.l0().K().getValue(), Boolean.TRUE)) {
            adjustScheduleClassicFragment.l0().l(adjustScheduleClassicFragment.n0().i().getValue());
        } else {
            com.baicizhan.main.activity.schedule_v2.adjustschedule.e.m(adjustScheduleClassicFragment.l0(), null, 1, null);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 e1(AdjustScheduleClassicFragment adjustScheduleClassicFragment) {
        com.baicizhan.main.activity.schedule_v2.adjustschedule.e.m(adjustScheduleClassicFragment.l0(), null, 1, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 g1(AdjustScheduleClassicFragment adjustScheduleClassicFragment, int i11, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        adjustScheduleClassicFragment.l0().o();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ma.b.F1, Integer.valueOf(i11));
        linkedHashMap.put(ma.b.G1, 1);
        yz.g2 g2Var = yz.g2.f100423a;
        ma.l.e(ma.t.f73012k, ma.a.f72718b5, linkedHashMap);
        return g2Var;
    }

    public static final yz.g2 h1(AdjustScheduleClassicFragment adjustScheduleClassicFragment, int i11, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ma.b.F1, Integer.valueOf(i11));
        linkedHashMap.put(ma.b.G1, 0);
        yz.g2 g2Var = yz.g2.f100423a;
        ma.l.e(ma.t.f73012k, ma.a.f72718b5, linkedHashMap);
        FragmentActivity activity = adjustScheduleClassicFragment.getActivity();
        EditScheduleActivity editScheduleActivity = activity instanceof EditScheduleActivity ? (EditScheduleActivity) activity : null;
        if (editScheduleActivity != null) {
            oe.g1.d(editScheduleActivity, null, 1, null);
        }
        return g2Var;
    }

    private final va.f m0() {
        Object value = this.f18964m.getValue();
        kotlin.jvm.internal.g0.o(value, "getValue(...)");
        return (va.f) value;
    }

    private final void p0() {
        final com.baicizhan.main.activity.schedule_v2.adjustschedule.e l02 = l0();
        l02.x().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 q02;
                q02 = AdjustScheduleClassicFragment.q0(AdjustScheduleClassicFragment.this, (ScheduleStatus) obj);
                return q02;
            }
        }));
        l02.W().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 r02;
                r02 = AdjustScheduleClassicFragment.r0(AdjustScheduleClassicFragment.this, (List) obj);
                return r02;
            }
        }));
        l02.A().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.h0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 D0;
                D0 = AdjustScheduleClassicFragment.D0(AdjustScheduleClassicFragment.this, l02, (y0) obj);
                return D0;
            }
        }));
        l02.V().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.i0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 H0;
                H0 = AdjustScheduleClassicFragment.H0(AdjustScheduleClassicFragment.this, (Integer) obj);
                return H0;
            }
        }));
        l02.z().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.j0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 I0;
                I0 = AdjustScheduleClassicFragment.I0(AdjustScheduleClassicFragment.this, (Integer) obj);
                return I0;
            }
        }));
        l02.D().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.k0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 J0;
                J0 = AdjustScheduleClassicFragment.J0(AdjustScheduleClassicFragment.this, (Long) obj);
                return J0;
            }
        }));
        l02.M().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.l0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 K0;
                K0 = AdjustScheduleClassicFragment.K0(AdjustScheduleClassicFragment.this, (String) obj);
                return K0;
            }
        }));
        l02.L().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.m0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 L0;
                L0 = AdjustScheduleClassicFragment.L0(AdjustScheduleClassicFragment.this, (String) obj);
                return L0;
            }
        }));
        l02.B().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.n0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 M0;
                M0 = AdjustScheduleClassicFragment.M0(AdjustScheduleClassicFragment.this, (Integer) obj);
                return M0;
            }
        }));
        l02.O().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.o0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 N0;
                N0 = AdjustScheduleClassicFragment.N0(AdjustScheduleClassicFragment.this, (r2) obj);
                return N0;
            }
        }));
        l02.P().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 s02;
                s02 = AdjustScheduleClassicFragment.s0(AdjustScheduleClassicFragment.this, (n2) obj);
                return s02;
            }
        }));
        l02.I().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 t02;
                t02 = AdjustScheduleClassicFragment.t0(AdjustScheduleClassicFragment.this, (LearnCardStatus) obj);
                return t02;
            }
        }));
        l02.t().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 u02;
                u02 = AdjustScheduleClassicFragment.u0(AdjustScheduleClassicFragment.this, (String) obj);
                return u02;
            }
        }));
        l02.v().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 v02;
                v02 = AdjustScheduleClassicFragment.v0(AdjustScheduleClassicFragment.this, (String) obj);
                return v02;
            }
        }));
        l02.u().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 w02;
                w02 = AdjustScheduleClassicFragment.w0(AdjustScheduleClassicFragment.this, (String) obj);
                return w02;
            }
        }));
        l02.Q().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 x02;
                x02 = AdjustScheduleClassicFragment.x0(AdjustScheduleClassicFragment.this, (Integer) obj);
                return x02;
            }
        }));
        l02.R().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.u
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 y02;
                y02 = AdjustScheduleClassicFragment.y0(AdjustScheduleClassicFragment.this, (Integer) obj);
                return y02;
            }
        }));
        l02.S().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 z02;
                z02 = AdjustScheduleClassicFragment.z0(AdjustScheduleClassicFragment.this, (Integer) obj);
                return z02;
            }
        }));
        l02.T().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 A0;
                A0 = AdjustScheduleClassicFragment.A0(AdjustScheduleClassicFragment.this, (Integer) obj);
                return A0;
            }
        }));
        l02.N().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 B0;
                B0 = AdjustScheduleClassicFragment.B0(AdjustScheduleClassicFragment.this, l02, (Boolean) obj);
                return B0;
            }
        }));
        l02.J().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 E0;
                E0 = AdjustScheduleClassicFragment.E0(AdjustScheduleClassicFragment.this, (Boolean) obj);
                return E0;
            }
        }));
        l02.C().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 F0;
                F0 = AdjustScheduleClassicFragment.F0(AdjustScheduleClassicFragment.this, (Serializable) obj);
                return F0;
            }
        }));
        l02.K().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 G0;
                G0 = AdjustScheduleClassicFragment.G0(AdjustScheduleClassicFragment.this, (Boolean) obj);
                return G0;
            }
        }));
        n0().n().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 O0;
                O0 = AdjustScheduleClassicFragment.O0(AdjustScheduleClassicFragment.this, (ModeDetail) obj);
                return O0;
            }
        }));
        new CombinedLiveData(l0().w(), n0().p(), new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.e0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                boolean P0;
                P0 = AdjustScheduleClassicFragment.P0((Boolean) obj, (Boolean) obj2);
                return Boolean.valueOf(P0);
            }
        }).observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.f0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 Q0;
                Q0 = AdjustScheduleClassicFragment.Q0(AdjustScheduleClassicFragment.this, (Boolean) obj);
                return Q0;
            }
        }));
    }

    public static final yz.g2 q0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, ScheduleStatus scheduleStatus) {
        String string = adjustScheduleClassicFragment.getString((scheduleStatus == null ? -1 : b.f18967a[scheduleStatus.ordinal()]) == 1 ? R.string.schedule_manager_pick_review : R.string.schedule_manager_pick_study);
        kotlin.jvm.internal.g0.o(string, "let(...)");
        p7 p7Var = adjustScheduleClassicFragment.f18963l;
        p7 p7Var2 = null;
        if (p7Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var = null;
        }
        p7Var.f56336t.setText(string);
        p7 p7Var3 = adjustScheduleClassicFragment.f18963l;
        if (p7Var3 == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var3 = null;
        }
        Group tipsNewTimeGroup = p7Var3.f56341y;
        kotlin.jvm.internal.g0.o(tipsNewTimeGroup, "tipsNewTimeGroup");
        sa.q.z(tipsNewTimeGroup, false);
        p7 p7Var4 = adjustScheduleClassicFragment.f18963l;
        if (p7Var4 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            p7Var2 = p7Var4;
        }
        Group tipsDateGroup = p7Var2.f56340x;
        kotlin.jvm.internal.g0.o(tipsDateGroup, "tipsDateGroup");
        sa.q.z(tipsDateGroup, scheduleStatus.compareTo(ScheduleStatus.NORMAL_REVIEW) < 0);
        return yz.g2.f100423a;
    }

    public static final yz.g2 r0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, List list) {
        p7 p7Var = adjustScheduleClassicFragment.f18963l;
        if (p7Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var = null;
        }
        p7Var.f56335s.setData(list);
        return yz.g2.f100423a;
    }

    public static final yz.g2 s0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, n2 n2Var) {
        l3 l3Var = adjustScheduleClassicFragment.f18965n;
        if (l3Var != null) {
            if (n2Var instanceof n2.b) {
                n2.b bVar = (n2.b) n2Var;
                l3Var.f55695b.setText(adjustScheduleClassicFragment.getString(R.string.schedule_adjust_remain, Integer.valueOf(bVar.e()), Integer.valueOf(bVar.f())));
            } else {
                if (!(n2Var instanceof n2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                l3Var.f55695b.setText(adjustScheduleClassicFragment.getString(R.string.schedule_switch_reviewing, Integer.valueOf(((n2.a) n2Var).d())));
            }
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 t0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, LearnCardStatus learnCardStatus) {
        TextView textView;
        TextView textView2;
        p7 p7Var = adjustScheduleClassicFragment.f18963l;
        p7 p7Var2 = null;
        if (p7Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var = null;
        }
        p7Var.f56318b.setVisibility(0);
        p7 p7Var3 = adjustScheduleClassicFragment.f18963l;
        if (p7Var3 == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var3 = null;
        }
        p7Var3.f56317a.setVisibility(8);
        p7 p7Var4 = adjustScheduleClassicFragment.f18963l;
        if (p7Var4 == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var4 = null;
        }
        Group tipsDateGroup = p7Var4.f56340x;
        kotlin.jvm.internal.g0.o(tipsDateGroup, "tipsDateGroup");
        sa.q.z(tipsDateGroup, true);
        if (learnCardStatus.isAllKill()) {
            l3 l3Var = adjustScheduleClassicFragment.f18965n;
            if (l3Var != null && (textView2 = l3Var.f55695b) != null) {
                textView2.setText(adjustScheduleClassicFragment.getString(R.string.schedule_adjust_tips_all_killed));
            }
            p7 p7Var5 = adjustScheduleClassicFragment.f18963l;
            if (p7Var5 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var5 = null;
            }
            p7Var5.f56318b.setVisibility(8);
            p7 p7Var6 = adjustScheduleClassicFragment.f18963l;
            if (p7Var6 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var6 = null;
            }
            p7Var6.f56317a.setVisibility(0);
            p7 p7Var7 = adjustScheduleClassicFragment.f18963l;
            if (p7Var7 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                p7Var2 = p7Var7;
            }
            Group tipsDateGroup2 = p7Var2.f56340x;
            kotlin.jvm.internal.g0.o(tipsDateGroup2, "tipsDateGroup");
            sa.q.z(tipsDateGroup2, false);
        } else if (learnCardStatus.isNewLearnDoneOfToday()) {
            l3 l3Var2 = adjustScheduleClassicFragment.f18965n;
            if (l3Var2 != null && (textView = l3Var2.f55695b) != null) {
                textView.setText(adjustScheduleClassicFragment.getString(R.string.schedule_adjust_tips_new_learn_done));
            }
        } else {
            p7 p7Var8 = adjustScheduleClassicFragment.f18963l;
            if (p7Var8 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var8 = null;
            }
            p7Var8.f56318b.setVisibility(0);
            p7 p7Var9 = adjustScheduleClassicFragment.f18963l;
            if (p7Var9 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var9 = null;
            }
            p7Var9.f56317a.setVisibility(8);
            p7 p7Var10 = adjustScheduleClassicFragment.f18963l;
            if (p7Var10 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                p7Var2 = p7Var10;
            }
            Group tipsDateGroup3 = p7Var2.f56340x;
            kotlin.jvm.internal.g0.o(tipsDateGroup3, "tipsDateGroup");
            sa.q.z(tipsDateGroup3, true);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 u0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, String str) {
        ImageView imageView;
        l3 l3Var = adjustScheduleClassicFragment.f18965n;
        if (l3Var == null || (imageView = l3Var.f55694a) == null) {
            n3 n3Var = adjustScheduleClassicFragment.f18966o;
            imageView = n3Var != null ? n3Var.f55979a : null;
        }
        if (imageView != null) {
            kotlin.jvm.internal.g0.m(str);
            hc.c.l(str).f(R.drawable.ic_book_cover_default).j(R.drawable.ic_book_cover_default).o(imageView);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 v0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, String str) {
        TextView textView;
        l3 l3Var = adjustScheduleClassicFragment.f18965n;
        if (l3Var == null || (textView = l3Var.f55696c) == null) {
            n3 n3Var = adjustScheduleClassicFragment.f18966o;
            textView = n3Var != null ? n3Var.f55981c : null;
        }
        if (textView != null) {
            textView.setText(str);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 w0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, String str) {
        TextView textView;
        n3 n3Var = adjustScheduleClassicFragment.f18966o;
        if (n3Var != null && (textView = n3Var.f55980b) != null) {
            textView.setText(str);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 x0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, Integer num) {
        l3 l3Var = adjustScheduleClassicFragment.f18965n;
        if (l3Var != null) {
            l3Var.f55702i.setVisibility((num != null && num.intValue() == 0) ? 8 : 0);
            l3Var.f55702i.setText(adjustScheduleClassicFragment.getString(R.string.schedule_adjust_round, num));
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 y0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, Integer num) {
        kotlin.jvm.internal.g0.m(num);
        adjustScheduleClassicFragment.c1(num.intValue());
        return yz.g2.f100423a;
    }

    public static final yz.g2 z0(AdjustScheduleClassicFragment adjustScheduleClassicFragment, Integer num) {
        kotlin.jvm.internal.g0.m(num);
        adjustScheduleClassicFragment.f1(num.intValue());
        return yz.g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [kc.d, kc.h] */
    public final void V0(int i11) {
        mc.a.l(this, ((u.a) d.a.J(mc.a.e(this).L(R.string.schedule_dialog_title_reset).V(getString(R.string.main_alert_message_reset_schedule, Integer.valueOf(i11))), null, null, new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.v0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 W0;
                W0 = AdjustScheduleClassicFragment.W0(AdjustScheduleClassicFragment.this, (View) obj);
                return W0;
            }
        }, 3, null)).d(), "reset");
    }

    public final void X0(@m80.k oe.b1 b1Var) {
        kotlin.jvm.internal.g0.p(b1Var, "<set-?>");
        this.f18960i = b1Var;
    }

    public final void Y0(boolean z11) {
        p7 p7Var = null;
        if (!z11) {
            ConstraintSet constraintSet = new ConstraintSet();
            p7 p7Var2 = this.f18963l;
            if (p7Var2 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var2 = null;
            }
            constraintSet.clone(p7Var2.f56320d);
            constraintSet.setMargin(R.id.noproguard_picker_area, 3, xb.f.a(requireContext(), 28.0f));
            p7 p7Var3 = this.f18963l;
            if (p7Var3 == null) {
                kotlin.jvm.internal.g0.S("binding");
                p7Var3 = null;
            }
            constraintSet.applyTo(p7Var3.f56320d);
        }
        final x00.a aVar = new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.r0
            @Override // x00.a
            public final Object invoke() {
                yz.g2 Z0;
                Z0 = AdjustScheduleClassicFragment.Z0();
                return Z0;
            }
        };
        p7 p7Var4 = this.f18963l;
        if (p7Var4 == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var4 = null;
        }
        p7Var4.f56323g.setOnItemSelectedListener(new WheelPicker.a() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.s0
            @Override // com.aigestudio.wheelpicker.WheelPicker.a
            public final void W(WheelPicker wheelPicker, Object obj, int i11) {
                AdjustScheduleClassicFragment.a1(AdjustScheduleClassicFragment.this, aVar, wheelPicker, obj, i11);
            }
        });
        p7 p7Var5 = this.f18963l;
        if (p7Var5 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            p7Var = p7Var5;
        }
        p7Var.f56335s.setOnItemSelectedListener(new WheelPicker.a() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.t0
            @Override // com.aigestudio.wheelpicker.WheelPicker.a
            public final void W(WheelPicker wheelPicker, Object obj, int i11) {
                AdjustScheduleClassicFragment.b1(AdjustScheduleClassicFragment.this, aVar, wheelPicker, obj, i11);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [kc.d, kc.h] */
    public final void c1(int i11) {
        mc.a.l(this, ((u.a) d.a.J(mc.a.e(this).V(getString(R.string.schedule_manager_word_plan_exceeded_message, Integer.valueOf(i11))), null, null, new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.q0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 d12;
                d12 = AdjustScheduleClassicFragment.d1(AdjustScheduleClassicFragment.this, (View) obj);
                return d12;
            }
        }, 3, null)).d(), "greedy");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [kc.d, kc.h] */
    public final void f1(final int i11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ma.b.F1, Integer.valueOf(i11));
        yz.g2 g2Var = yz.g2.f100423a;
        ma.l.e(ma.t.f73012k, ma.a.f72711a5, linkedHashMap);
        mc.a.l(this, ((u.a) ((u.a) d.a.I(mc.a.e(this).V(getString(R.string.schedule_new_book_merge, Integer.valueOf(i11))), R.string.schedule_new_book_merge_permit, null, new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 g12;
                g12 = AdjustScheduleClassicFragment.g1(AdjustScheduleClassicFragment.this, i11, (View) obj);
                return g12;
            }
        }, 2, null)).o(R.string.schedule_new_book_merge_deny, new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 h12;
                h12 = AdjustScheduleClassicFragment.h1(AdjustScheduleClassicFragment.this, i11, (View) obj);
                return h12;
            }
        })).d(), "merge");
    }

    public final void i1(ModeDetail modeDetail) {
        com.baicizhan.main.activity.schedule_v2.mutimode.l.f19388g.a(modeDetail).show(getChildFragmentManager(), "modeDialog");
    }

    public final com.baicizhan.main.activity.schedule_v2.adjustschedule.e l0() {
        return (com.baicizhan.main.activity.schedule_v2.adjustschedule.e) this.f18961j.getValue();
    }

    public final com.baicizhan.main.activity.schedule_v2.mutimode.j0 n0() {
        return (com.baicizhan.main.activity.schedule_v2.mutimode.j0) this.f18962k.getValue();
    }

    @m80.k
    public final oe.b1 o0() {
        oe.b1 b1Var = this.f18960i;
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
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.fragment_adjust_schedule, viewGroup, false);
        kotlin.jvm.internal.g0.o(inflate, "inflate(...)");
        p7 p7Var = (p7) inflate;
        this.f18963l = p7Var;
        p7 p7Var2 = null;
        if (p7Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var = null;
        }
        p7Var.setLifecycleOwner(this);
        p7 p7Var3 = this.f18963l;
        if (p7Var3 == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var3 = null;
        }
        p7Var3.l(l0());
        p7 p7Var4 = this.f18963l;
        if (p7Var4 == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var4 = null;
        }
        p7Var4.k(n0().l());
        getLifecycle().addObserver(l0());
        R0();
        p0();
        if (o0().d() == ScheduleType.ADJUST) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(ma.b.J1, Integer.valueOf(n0().j().a()));
            linkedHashMap.put(ma.b.L1, Integer.valueOf(l0().y()));
            yz.g2 g2Var = yz.g2.f100423a;
            ma.l.e(ma.t.f73012k, ma.a.f72781k5, linkedHashMap);
        }
        p7 p7Var5 = this.f18963l;
        if (p7Var5 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            p7Var2 = p7Var5;
        }
        View root = p7Var2.getRoot();
        kotlin.jvm.internal.g0.o(root, "getRoot(...)");
        return root;
    }

    @Override // com.baicizhan.base.c
    public void w() {
        p7 p7Var = this.f18963l;
        if (p7Var == null) {
            kotlin.jvm.internal.g0.S("binding");
            p7Var = null;
        }
        View root = p7Var.getRoot();
        if (root instanceof ViewGroup) {
            Context requireContext = requireContext();
            kotlin.jvm.internal.g0.o(requireContext, "requireContext(...)");
            if (com.baicizhan.base.a.a(requireContext)) {
                Context requireContext2 = requireContext();
                kotlin.jvm.internal.g0.o(requireContext2, "requireContext(...)");
                com.baicizhan.base.d.d((ViewGroup) root, requireContext2);
            }
        }
    }
}
