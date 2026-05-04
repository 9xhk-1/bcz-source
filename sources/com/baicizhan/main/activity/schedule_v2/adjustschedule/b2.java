package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import android.app.Application;
import android.text.Spannable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.client.business.util.Standard_extKt;
import com.baicizhan.main.activity.schedule_v2.ScheduleType;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.c2;
import com.jiongji.andriod.card.R;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import k3.x2;
import kotlin.Result;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@av.b
@kotlin.jvm.internal.u0({"SMAP\nGamingPlanModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamingPlanModel.kt\ncom/baicizhan/main/activity/schedule_v2/adjustschedule/GamingPlanModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 4 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,261:1\n1#2:262\n10#3:263\n43#4:264\n124#5,4:265\n142#6:269\n*S KotlinDebug\n*F\n+ 1 GamingPlanModel.kt\ncom/baicizhan/main/activity/schedule_v2/adjustschedule/GamingPlanModel\n*L\n82#1:263\n82#1:264\n82#1:265,4\n82#1:269\n*E\n"})
/* loaded from: classes4.dex */
public final class b2 extends ViewModel implements DefaultLifecycleObserver {

    @m80.k
    public static final b B = new b(null);
    public static final int C = 8;

    @m80.k
    public static final String D = "GamingPlanModel";

    @m80.k
    public final String A;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ta.b f19000a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final oe.b1 f19001b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Application f19002c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<String>> f19003d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Integer> f19004e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Integer> f19005f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<String>> f19006g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Integer> f19007h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Spannable> f19008i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Spannable> f19009j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Triple<Integer, Integer, Integer>> f19010k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<n2> f19011l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<String> f19012m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<String> f19013n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<String> f19014o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Boolean> f19015p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Integer> f19016q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Boolean> f19017r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Serializable> f19018s;

    /* renamed from: t, reason: collision with root package name */
    public final int f19019t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final ScheduleType f19020u;

    /* renamed from: v, reason: collision with root package name */
    public q2 f19021v;

    /* renamed from: w, reason: collision with root package name */
    public int f19022w;

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public final yz.c0 f19023x;

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<k3.q0> f19024y;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public final String f19025z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanModel$1$1", f = "GamingPlanModel.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19026a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return b2.this.new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19026a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b2 b2Var = b2.this;
                this.f19026a = 1;
                if (b2.w(b2Var, false, this, 1, null) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            b2.this.start();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanModel$confirmReset$1", f = "GamingPlanModel.kt", i = {1, 1, 2, 2}, l = {R.styleable.Theme_drawable_tab_mall_new, R.styleable.Theme_drawable_test_nodate, 243}, m = "invokeSuspend", n = {"it", "$i$a$-onSuccess-GamingPlanModel$confirmReset$1$2", "it", "$i$a$-onSuccess-GamingPlanModel$confirmReset$1$2"}, s = {"L$2", "I$0", "L$2", "I$0"}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19028a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19029b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19030c;

        /* renamed from: d, reason: collision with root package name */
        public int f19031d;

        /* renamed from: e, reason: collision with root package name */
        public int f19032e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanModel$confirmReset$1$1", f = "GamingPlanModel.kt", i = {}, l = {R.styleable.Theme_drawable_tab_review}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19034a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b2 f19035b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b2 b2Var, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f19035b = b2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(j00.c<?> cVar) {
                return new a(this.f19035b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super yz.g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f19034a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    k3.r0 G = this.f19035b.G();
                    k3.q0 value = this.f19035b.u().getValue();
                    if (value == null) {
                        return yz.g2.f100423a;
                    }
                    int m11 = value.m();
                    this.f19034a = 1;
                    if (G.n(m11, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return yz.g2.f100423a;
            }
        }

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return b2.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        
            if (r13 == r0) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.schedule_v2.adjustschedule.b2.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanModel", f = "GamingPlanModel.kt", i = {0}, l = {95}, m = "getGamingSchedule", n = {com.alipay.sdk.m.x.d.f11177w}, s = {"Z$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f19036a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19037b;

        /* renamed from: d, reason: collision with root package name */
        public int f19039d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f19037b = obj;
            this.f19039d |= Integer.MIN_VALUE;
            return b2.this.v(false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanModel$getGamingSchedule$3", f = "GamingPlanModel.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<c40.r0, j00.c<? super k3.q0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19040a;

        public e(j00.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return b2.this.new e(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super k3.q0> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19040a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            k3.r0 G = b2.this.G();
            this.f19040a = 1;
            Object t11 = G.t(this);
            return t11 == l11 ? l11 : t11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanModel$initPickerData$1", f = "GamingPlanModel.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19042a;

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return b2.this.new f(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19042a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b2 b2Var = b2.this;
                this.f19042a = 1;
                if (b2.T(b2Var, null, null, this, 3, null) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanModel$savePlan$1", f = "GamingPlanModel.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19044a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanModel$savePlan$1$1", f = "GamingPlanModel.kt", i = {}, l = {R.styleable.Theme_drawable_share, R.styleable.Theme_drawable_sound}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19046a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b2 f19047b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b2 b2Var, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f19047b = b2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(j00.c<?> cVar) {
                return new a(this.f19047b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super yz.g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(yz.g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
            
                if (r5.J0(r1, r2, r4) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
            
                if (r5.C(r1, r3, r4) == r0) goto L19;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r4.f19046a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r3) goto L17
                    if (r1 != r2) goto Lf
                    goto L17
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    kotlin.e.n(r5)
                    goto L6c
                L1b:
                    kotlin.e.n(r5)
                    com.baicizhan.main.activity.schedule_v2.adjustschedule.b2 r5 = r4.f19047b
                    com.baicizhan.main.activity.schedule_v2.ScheduleType r5 = com.baicizhan.main.activity.schedule_v2.adjustschedule.b2.i(r5)
                    boolean r5 = oe.d1.d(r5)
                    if (r5 == 0) goto L45
                    com.baicizhan.main.activity.schedule_v2.adjustschedule.b2 r5 = r4.f19047b
                    k3.r0 r5 = com.baicizhan.main.activity.schedule_v2.adjustschedule.b2.h(r5)
                    com.baicizhan.main.activity.schedule_v2.adjustschedule.b2 r1 = r4.f19047b
                    int r1 = com.baicizhan.main.activity.schedule_v2.adjustschedule.b2.d(r1)
                    com.baicizhan.main.activity.schedule_v2.adjustschedule.b2 r2 = r4.f19047b
                    int r2 = com.baicizhan.main.activity.schedule_v2.adjustschedule.b2.f(r2)
                    r4.f19046a = r3
                    java.lang.Object r5 = r5.J0(r1, r2, r4)
                    if (r5 != r0) goto L6c
                    goto L6b
                L45:
                    com.baicizhan.main.activity.schedule_v2.adjustschedule.b2 r5 = r4.f19047b
                    k3.r0 r5 = com.baicizhan.main.activity.schedule_v2.adjustschedule.b2.h(r5)
                    com.baicizhan.main.activity.schedule_v2.adjustschedule.b2 r1 = r4.f19047b
                    androidx.lifecycle.MutableLiveData r1 = r1.u()
                    java.lang.Object r1 = r1.getValue()
                    k3.q0 r1 = (k3.q0) r1
                    if (r1 == 0) goto L6f
                    int r1 = r1.m()
                    com.baicizhan.main.activity.schedule_v2.adjustschedule.b2 r3 = r4.f19047b
                    int r3 = com.baicizhan.main.activity.schedule_v2.adjustschedule.b2.f(r3)
                    r4.f19046a = r2
                    java.lang.Object r5 = r5.C(r1, r3, r4)
                    if (r5 != r0) goto L6c
                L6b:
                    return r0
                L6c:
                    yz.g2 r5 = yz.g2.f100423a
                    return r5
                L6f:
                    yz.g2 r5 = yz.g2.f100423a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.schedule_v2.adjustschedule.b2.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public g(j00.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return b2.this.new g(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            g gVar;
            Object d11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19044a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b2.this.x().postValue(l00.a.a(true));
                c40.m0 c11 = c40.h1.c();
                a aVar = new a(b2.this, null);
                this.f19044a = 1;
                gVar = this;
                d11 = com.baicizhan.main.word_book.data.impl.c.d(c11, null, aVar, gVar, 2, null);
                if (d11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                d11 = ((Result) obj).m6317unboximpl();
                gVar = this;
            }
            b2 b2Var = b2.this;
            if (Result.m6315isSuccessimpl(d11)) {
                b2Var.t().call();
            }
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(d11);
            if (m6311exceptionOrNullimpl != null) {
                va.g.k(m6311exceptionOrNullimpl, R.string.schedule_unknow_error, 0);
            }
            b2.this.x().postValue(l00.a.a(false));
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanModel$start$1", f = "GamingPlanModel.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19048a;

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return b2.this.new h(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19048a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                if (oe.d1.d(b2.this.f19020u)) {
                    BookRecord bookById = BookListManager.getInstance().getBookById(b2.this.f19019t);
                    b2.this.z().postValue(Standard_extKt.triplet(yz.h1.a(l00.a.f(0), l00.a.f(0)), l00.a.f(bookById.wordCount)));
                    b2.this.L(bookById.wordCount, 10);
                    SingleLiveEvent<String> o11 = b2.this.o();
                    String str = bookById.descImage;
                    if (str == null) {
                        str = "";
                    }
                    o11.postValue(str);
                    b2.this.q().postValue(bookById.bookName);
                    b2.this.p().postValue(bookById.desc);
                    return yz.g2.f100423a;
                }
                b2 b2Var = b2.this;
                this.f19048a = 1;
                obj = b2.w(b2Var, false, this, 1, null);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            k3.q0 q0Var = (k3.q0) obj;
            b2.this.K(q0Var);
            b2.this.L(q0Var.v(), q0Var.q());
            b2.this.o().postValue(q0Var.n());
            b2.this.q().postValue(q0Var.o());
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanModel$toDayIndex$1", f = "GamingPlanModel.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class i extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19050a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f19052c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i11, j00.c<? super i> cVar) {
            super(2, cVar);
            this.f19052c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return b2.this.new i(this.f19052c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19050a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b2 b2Var = b2.this;
                Integer f11 = l00.a.f(this.f19052c);
                this.f19050a = 1;
                if (b2.T(b2Var, null, f11, this, 1, null) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanModel$toRoundIndex$1", f = "GamingPlanModel.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class j extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19053a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f19055c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i11, j00.c<? super j> cVar) {
            super(2, cVar);
            this.f19055c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return b2.this.new j(this.f19055c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19053a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b2 b2Var = b2.this;
                Integer f11 = l00.a.f(this.f19055c);
                this.f19053a = 1;
                if (b2.T(b2Var, f11, null, this, 2, null) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanModel", f = "GamingPlanModel.kt", i = {0, 0}, l = {143}, m = "updateSelection", n = {"fromRound", "fromDay"}, s = {"L$0", "L$1"}, v = 1)
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19056a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19057b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f19058c;

        /* renamed from: e, reason: collision with root package name */
        public int f19060e;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f19058c = obj;
            this.f19060e |= Integer.MIN_VALUE;
            return b2.this.S(null, null, this);
        }
    }

    @Inject
    public b2(@m80.k oe.b1 shareVM, @m80.k Application application, @m80.k ta.b loadingViewModel) {
        kotlin.jvm.internal.g0.p(shareVM, "shareVM");
        kotlin.jvm.internal.g0.p(application, "application");
        kotlin.jvm.internal.g0.p(loadingViewModel, "loadingViewModel");
        this.f19000a = loadingViewModel;
        this.f19001b = shareVM;
        this.f19002c = application;
        this.f19003d = new MutableLiveData<>();
        this.f19004e = new SingleLiveEvent<>();
        this.f19005f = new SingleLiveEvent<>();
        this.f19006g = new MutableLiveData<>();
        this.f19007h = new SingleLiveEvent<>();
        this.f19008i = new SingleLiveEvent<>();
        this.f19009j = new SingleLiveEvent<>();
        this.f19010k = new MutableLiveData<>(Standard_extKt.triplet(yz.h1.a(0, 0), 999));
        this.f19011l = new SingleLiveEvent<>();
        this.f19012m = new SingleLiveEvent<>();
        this.f19013n = new SingleLiveEvent<>();
        this.f19014o = new SingleLiveEvent<>();
        this.f19015p = new SingleLiveEvent<>();
        this.f19016q = new ClickProtectedEvent<>();
        this.f19017r = new SingleLiveEvent<>();
        this.f19018s = new ClickProtectedEvent<>();
        this.f19019t = shareVM.b();
        this.f19020u = shareVM.d();
        this.f19022w = 1;
        this.f19023x = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.z1
            @Override // x00.a
            public final Object invoke() {
                k3.r0 P;
                P = b2.P(b2.this);
                return P;
            }
        });
        this.f19024y = new MutableLiveData<>();
        loadingViewModel.f90403e.observeForever(new c2.a(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.a2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 c11;
                c11 = b2.c(b2.this, (Void) obj);
                return c11;
            }
        }));
        this.f19025z = "预计完成时间";
        this.A = "预计每日用时";
    }

    public static final k3.r0 P(b2 b2Var) {
        dd.h.g(b2Var.f19002c);
        return (k3.r0) ((x2) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(k3.r0.class), null, null));
    }

    public static /* synthetic */ Object T(b2 b2Var, Integer num, Integer num2, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        return b2Var.S(num, num2, cVar);
    }

    public static final yz.g2 c(b2 b2Var, Void r72) {
        c40.k.f(ViewModelKt.getViewModelScope(b2Var), null, null, b2Var.new a(null), 3, null);
        return yz.g2.f100423a;
    }

    public static /* synthetic */ Object w(b2 b2Var, boolean z11, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return b2Var.v(z11, cVar);
    }

    @m80.k
    public final SingleLiveEvent<n2> A() {
        return this.f19011l;
    }

    @m80.k
    public final SingleLiveEvent<Integer> B() {
        return this.f19004e;
    }

    @m80.k
    public final SingleLiveEvent<Integer> C() {
        return this.f19005f;
    }

    @m80.k
    public final MutableLiveData<List<String>> D() {
        return this.f19003d;
    }

    @m80.k
    public final SingleLiveEvent<Boolean> F() {
        return this.f19015p;
    }

    public final k3.r0 G() {
        return (k3.r0) this.f19023x.getValue();
    }

    @m80.k
    public final ClickProtectedEvent<Integer> H() {
        return this.f19016q;
    }

    @m80.k
    public final SingleLiveEvent<Spannable> I() {
        return this.f19008i;
    }

    @m80.k
    public final SingleLiveEvent<Spannable> J() {
        return this.f19009j;
    }

    public final void K(k3.q0 q0Var) {
        M(q0Var);
        this.f19022w = q0Var.r();
    }

    public final void L(int i11, int i12) {
        q2 q2Var = new q2(i12, i11);
        this.f19021v = q2Var;
        this.f19003d.postValue(q2Var.l("%d 组"));
        MutableLiveData<List<String>> mutableLiveData = this.f19006g;
        q2 q2Var2 = this.f19021v;
        if (q2Var2 == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            q2Var2 = null;
        }
        mutableLiveData.postValue(q2Var2.e("%d 天"));
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new f(null), 3, null);
    }

    public final void M(k3.q0 q0Var) {
        this.f19010k.postValue(Standard_extKt.triplet(yz.h1.a(Integer.valueOf(q0Var.s()), Integer.valueOf(q0Var.t())), Integer.valueOf(q0Var.v())));
    }

    public final void N() {
        ClickProtectedEvent<Integer> clickProtectedEvent = this.f19016q;
        k3.q0 value = this.f19024y.getValue();
        if (value != null) {
            clickProtectedEvent.postValue(Integer.valueOf(value.t()));
        }
    }

    public final void O() {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new g(null), 3, null);
    }

    public final void Q(int i11) {
        q2 q2Var = this.f19021v;
        if (q2Var == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            q2Var = null;
        }
        int k11 = q2Var.k(i11);
        q2 q2Var2 = this.f19021v;
        if (q2Var2 == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            q2Var2 = null;
        }
        int j11 = q2Var2.j(k11);
        this.f19022w = j11;
        qb.c.b(D, "toRoundIndex: " + j11, new Object[0]);
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new i(i11, null), 3, null);
    }

    public final void R(int i11) {
        q2 q2Var = this.f19021v;
        if (q2Var == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            q2Var = null;
        }
        int j11 = q2Var.j(i11);
        this.f19022w = j11;
        qb.c.b(D, "toRoundIndex: " + j11, new Object[0]);
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new j(i11, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(java.lang.Integer r13, java.lang.Integer r14, j00.c<? super yz.g2> r15) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.schedule_v2.adjustschedule.b2.S(java.lang.Integer, java.lang.Integer, j00.c):java.lang.Object");
    }

    public final void n() {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new c(null), 3, null);
    }

    @m80.k
    public final SingleLiveEvent<String> o() {
        return this.f19012m;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(@m80.k LifecycleOwner lifecycleOwner) {
        super.onCreate(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(@m80.k LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(@m80.k LifecycleOwner lifecycleOwner) {
        super.onPause(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(@m80.k LifecycleOwner lifecycleOwner) {
        super.onResume(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(@m80.k LifecycleOwner lifecycleOwner) {
        super.onStart(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(@m80.k LifecycleOwner lifecycleOwner) {
        super.onStop(lifecycleOwner);
    }

    @m80.k
    public final SingleLiveEvent<String> p() {
        return this.f19014o;
    }

    @m80.k
    public final SingleLiveEvent<String> q() {
        return this.f19013n;
    }

    @m80.k
    public final SingleLiveEvent<Integer> r() {
        return this.f19007h;
    }

    @m80.k
    public final MutableLiveData<List<String>> s() {
        return this.f19006g;
    }

    public final void start() {
        if (oe.d1.b(this.f19020u)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new h(null), 3, null);
    }

    @m80.k
    public final ClickProtectedEvent<Serializable> t() {
        return this.f19018s;
    }

    @m80.k
    public final MutableLiveData<k3.q0> u() {
        return this.f19024y;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(boolean r6, j00.c<? super k3.q0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.baicizhan.main.activity.schedule_v2.adjustschedule.b2.d
            if (r0 == 0) goto L13
            r0 = r7
            com.baicizhan.main.activity.schedule_v2.adjustschedule.b2$d r0 = (com.baicizhan.main.activity.schedule_v2.adjustschedule.b2.d) r0
            int r1 = r0.f19039d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19039d = r1
            goto L18
        L13:
            com.baicizhan.main.activity.schedule_v2.adjustschedule.b2$d r0 = new com.baicizhan.main.activity.schedule_v2.adjustschedule.b2$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19037b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f19039d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r7)
            goto L5b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.e.n(r7)
            androidx.lifecycle.MutableLiveData<k3.q0> r7 = r5.f19024y
            java.lang.Object r7 = r7.getValue()
            k3.q0 r7 = (k3.q0) r7
            r2 = 0
            if (r7 == 0) goto L47
            if (r6 != 0) goto L42
            goto L43
        L42:
            r7 = r2
        L43:
            if (r7 != 0) goto L46
            goto L47
        L46:
            return r7
        L47:
            c40.m0 r7 = c40.h1.c()
            com.baicizhan.main.activity.schedule_v2.adjustschedule.b2$e r4 = new com.baicizhan.main.activity.schedule_v2.adjustschedule.b2$e
            r4.<init>(r2)
            r0.f19036a = r6
            r0.f19039d = r3
            java.lang.Object r7 = c40.i.h(r7, r4, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            k3.q0 r7 = (k3.q0) r7
            androidx.lifecycle.MutableLiveData<k3.q0> r6 = r5.f19024y
            r6.setValue(r7)
            com.baicizhan.client.business.util.SingleLiveEvent<java.lang.Integer> r6 = r5.f19005f
            int r0 = r7.q()
            java.lang.Integer r0 = l00.a.f(r0)
            r6.postValue(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.schedule_v2.adjustschedule.b2.v(boolean, j00.c):java.lang.Object");
    }

    @m80.k
    public final SingleLiveEvent<Boolean> x() {
        return this.f19017r;
    }

    @m80.k
    public final ta.b y() {
        return this.f19000a;
    }

    @m80.k
    public final MutableLiveData<Triple<Integer, Integer, Integer>> z() {
        return this.f19010k;
    }
}
