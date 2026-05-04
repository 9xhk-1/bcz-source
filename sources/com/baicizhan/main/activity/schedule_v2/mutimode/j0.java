package com.baicizhan.main.activity.schedule_v2.mutimode;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c40.l2;
import c40.r0;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.ModeDetail;
import com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC;
import com.baicizhan.main.activity.schedule_v2.mutimode.j0;
import com.baicizhan.main.activity.schedule_v2.mutimode.q0;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@av.b
/* loaded from: classes4.dex */
public final class j0 extends ViewModel {

    /* renamed from: n, reason: collision with root package name */
    public static final int f19351n = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final GetSelectModeListUC f19352a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.activity.schedule_v2.mutimode.data.b f19353b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ta.b f19354c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f19355d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<ModeDetail> f19356e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final LiveData<ModeDetail> f19357f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.activity.schedule_v2.mutimode.data.e f19358g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.y<q0> f19359h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.y<com.baicizhan.main.activity.schedule_v2.mutimode.data.e> f19360i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.m0<com.baicizhan.main.activity.schedule_v2.mutimode.data.e> f19361j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f19362k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f19363l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.i<q0> f19364m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.mutimode.ModelListVm$clickInfo$1", f = "ModelListVm.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19365a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.activity.schedule_v2.mutimode.data.h f19367c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.baicizhan.main.activity.schedule_v2.mutimode.data.h hVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f19367c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return j0.this.new a(this.f19367c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19365a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.main.activity.schedule_v2.mutimode.data.b m11 = j0.this.m();
                com.baicizhan.main.activity.schedule_v2.mutimode.data.e k11 = this.f19367c.e().k();
                this.f19365a = 1;
                if (m11.c(k11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            j0.this.f19356e.setValue(this.f19367c.e());
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.mutimode.ModelListVm$loadModeInfo$1", f = "ModelListVm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super List<? extends com.baicizhan.main.activity.schedule_v2.mutimode.data.h>>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19368a;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return j0.this.new b(cVar);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.j<? super List<? extends com.baicizhan.main.activity.schedule_v2.mutimode.data.h>> jVar, j00.c<? super g2> cVar) {
            return invoke2((kotlinx.coroutines.flow.j<? super List<com.baicizhan.main.activity.schedule_v2.mutimode.data.h>>) jVar, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f19368a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            j0.this.l().k();
            j0.this.f19359h.setValue(q0.d.f19419b);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.flow.j<? super List<com.baicizhan.main.activity.schedule_v2.mutimode.data.h>> jVar, j00.c<? super g2> cVar) {
            return ((b) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.mutimode.ModelListVm$loadModeInfo$2", f = "ModelListVm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<List<? extends com.baicizhan.main.activity.schedule_v2.mutimode.data.h>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19370a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19371b;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = j0.this.new c(cVar);
            cVar2.f19371b = obj;
            return cVar2;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<com.baicizhan.main.activity.schedule_v2.mutimode.data.h> list, j00.c<? super g2> cVar) {
            return ((c) create(list, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f19371b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f19370a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            j0.this.l().s();
            j0.this.f19359h.setValue(new q0.e(list));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.mutimode.ModelListVm$loadModeInfo$3", f = "ModelListVm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super List<? extends com.baicizhan.main.activity.schedule_v2.mutimode.data.h>>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19373a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19374b;

        public d(j00.c<? super d> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.j<? super List<? extends com.baicizhan.main.activity.schedule_v2.mutimode.data.h>> jVar, Throwable th2, j00.c<? super g2> cVar) {
            return invoke2((kotlinx.coroutines.flow.j<? super List<com.baicizhan.main.activity.schedule_v2.mutimode.data.h>>) jVar, th2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f19374b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f19373a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.c(j0.this.f19355d, "", th2);
            j0.this.l().f(th2);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.flow.j<? super List<com.baicizhan.main.activity.schedule_v2.mutimode.data.h>> jVar, Throwable th2, j00.c<? super g2> cVar) {
            d dVar = j0.this.new d(cVar);
            dVar.f19374b = th2;
            return dVar.invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f19376a;

        public e(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f19376a = function;
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
            return this.f19376a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f19376a.invoke(obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.mutimode.ModelListVm$selectMode$1", f = "ModelListVm.kt", i = {1}, l = {85, 87}, m = "invokeSuspend", n = {"isRead"}, s = {"Z$0"}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f19377a;

        /* renamed from: b, reason: collision with root package name */
        public int f19378b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.activity.schedule_v2.mutimode.data.h f19380d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.baicizhan.main.activity.schedule_v2.mutimode.data.h hVar, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f19380d = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return j0.this.new f(this.f19380d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
            if (r1.c(r3, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        
            if (r5 == r0) goto L17;
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
                int r1 = r4.f19378b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                goto L61
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.e.n(r5)
                goto L3e
            L1e:
                kotlin.e.n(r5)
                com.baicizhan.main.activity.schedule_v2.mutimode.j0 r5 = com.baicizhan.main.activity.schedule_v2.mutimode.j0.this
                com.baicizhan.main.activity.schedule_v2.mutimode.data.b r5 = r5.m()
                com.baicizhan.main.activity.schedule_v2.mutimode.data.h r1 = r4.f19380d
                com.baicizhan.main.activity.schedule_v2.mutimode.data.ModeDetail r1 = r1.e()
                com.baicizhan.main.activity.schedule_v2.mutimode.data.e r1 = r1.k()
                kotlinx.coroutines.flow.i r5 = r5.a(r1)
                r4.f19378b = r3
                java.lang.Object r5 = kotlinx.coroutines.flow.k.w0(r5, r4)
                if (r5 != r0) goto L3e
                goto L60
            L3e:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L70
                com.baicizhan.main.activity.schedule_v2.mutimode.j0 r1 = com.baicizhan.main.activity.schedule_v2.mutimode.j0.this
                com.baicizhan.main.activity.schedule_v2.mutimode.data.b r1 = r1.m()
                com.baicizhan.main.activity.schedule_v2.mutimode.data.h r3 = r4.f19380d
                com.baicizhan.main.activity.schedule_v2.mutimode.data.ModeDetail r3 = r3.e()
                com.baicizhan.main.activity.schedule_v2.mutimode.data.e r3 = r3.k()
                r4.f19377a = r5
                r4.f19378b = r2
                java.lang.Object r5 = r1.c(r3, r4)
                if (r5 != r0) goto L61
            L60:
                return r0
            L61:
                com.baicizhan.main.activity.schedule_v2.mutimode.j0 r5 = com.baicizhan.main.activity.schedule_v2.mutimode.j0.this
                com.baicizhan.client.business.util.ClickProtectedEvent r5 = com.baicizhan.main.activity.schedule_v2.mutimode.j0.f(r5)
                com.baicizhan.main.activity.schedule_v2.mutimode.data.h r0 = r4.f19380d
                com.baicizhan.main.activity.schedule_v2.mutimode.data.ModeDetail r0 = r0.e()
                r5.setValue(r0)
            L70:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.schedule_v2.mutimode.j0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.mutimode.ModelListVm$uiStatus$1", f = "ModelListVm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.q<q0, com.baicizhan.main.activity.schedule_v2.mutimode.data.e, j00.c<? super q0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19381a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19382b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f19383c;

        public g(j00.c<? super g> cVar) {
            super(3, cVar);
        }

        public static final com.baicizhan.main.activity.schedule_v2.mutimode.data.h k(com.baicizhan.main.activity.schedule_v2.mutimode.data.e eVar, com.baicizhan.main.activity.schedule_v2.mutimode.data.h hVar) {
            return com.baicizhan.main.activity.schedule_v2.mutimode.data.h.d(hVar, null, kotlin.jvm.internal.g0.g(hVar.e().k(), eVar), 1, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            q0 q0Var = (q0) this.f19382b;
            final com.baicizhan.main.activity.schedule_v2.mutimode.data.e eVar = (com.baicizhan.main.activity.schedule_v2.mutimode.data.e) this.f19383c;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f19381a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            j0.this.f19362k.setValue(l00.a.a(!kotlin.jvm.internal.g0.g(eVar, j0.this.j())));
            if (!(q0Var instanceof q0.e)) {
                return q0Var;
            }
            q0.e eVar2 = (q0.e) q0Var;
            return eVar2.d().isEmpty() ? q0.a.f19413b : new q0.e(q30.k0.I3(q30.k0.N1(a00.r0.E1(eVar2.d()), new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.k0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    com.baicizhan.main.activity.schedule_v2.mutimode.data.h k11;
                    k11 = j0.g.k(com.baicizhan.main.activity.schedule_v2.mutimode.data.e.this, (com.baicizhan.main.activity.schedule_v2.mutimode.data.h) obj2);
                    return k11;
                }
            })));
        }

        @Override // x00.q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(q0 q0Var, com.baicizhan.main.activity.schedule_v2.mutimode.data.e eVar, j00.c<? super q0> cVar) {
            g gVar = j0.this.new g(cVar);
            gVar.f19382b = q0Var;
            gVar.f19383c = eVar;
            return gVar.invokeSuspend(g2.f100423a);
        }
    }

    @Inject
    public j0(@m80.k GetSelectModeListUC getModeListUc, @m80.k com.baicizhan.main.activity.schedule_v2.mutimode.data.b multiModeRepo, @m80.k ta.b loadingViewModel) {
        kotlin.jvm.internal.g0.p(getModeListUc, "getModeListUc");
        kotlin.jvm.internal.g0.p(multiModeRepo, "multiModeRepo");
        kotlin.jvm.internal.g0.p(loadingViewModel, "loadingViewModel");
        this.f19352a = getModeListUc;
        this.f19353b = multiModeRepo;
        this.f19354c = loadingViewModel;
        this.f19355d = "ModelListVm";
        ClickProtectedEvent<ModeDetail> clickProtectedEvent = new ClickProtectedEvent<>();
        this.f19356e = clickProtectedEvent;
        this.f19357f = clickProtectedEvent;
        com.baicizhan.main.activity.schedule_v2.mutimode.data.e a11 = ch.m.f8648a.a();
        this.f19358g = a11;
        kotlinx.coroutines.flow.y<q0> a12 = kotlinx.coroutines.flow.o0.a(q0.c.f19417b);
        this.f19359h = a12;
        kotlinx.coroutines.flow.y<com.baicizhan.main.activity.schedule_v2.mutimode.data.e> a13 = kotlinx.coroutines.flow.o0.a(a11);
        this.f19360i = a13;
        this.f19361j = kotlinx.coroutines.flow.k.n(a13);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f19362k = mutableLiveData;
        this.f19363l = mutableLiveData;
        this.f19364m = kotlinx.coroutines.flow.k.I(a12, a13, new g(null));
        loadingViewModel.f90403e.observeForever(new e(new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.i0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b11;
                b11 = j0.b(j0.this, (Void) obj);
                return b11;
            }
        }));
    }

    public static final g2 b(j0 j0Var, Void r12) {
        j0Var.q();
        return g2.f100423a;
    }

    public final void h(@m80.k com.baicizhan.main.activity.schedule_v2.mutimode.data.h modeType) {
        kotlin.jvm.internal.g0.p(modeType, "modeType");
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new a(modeType, null), 3, null);
    }

    @m80.k
    public final kotlinx.coroutines.flow.m0<com.baicizhan.main.activity.schedule_v2.mutimode.data.e> i() {
        return this.f19361j;
    }

    @m80.k
    public final com.baicizhan.main.activity.schedule_v2.mutimode.data.e j() {
        return this.f19358g;
    }

    @m80.k
    public final GetSelectModeListUC k() {
        return this.f19352a;
    }

    @m80.k
    public final ta.b l() {
        return this.f19354c;
    }

    @m80.k
    public final com.baicizhan.main.activity.schedule_v2.mutimode.data.b m() {
        return this.f19353b;
    }

    @m80.k
    public final LiveData<ModeDetail> n() {
        return this.f19357f;
    }

    @m80.k
    public final kotlinx.coroutines.flow.i<q0> o() {
        return this.f19364m;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }

    @m80.k
    public final LiveData<Boolean> p() {
        return this.f19363l;
    }

    @m80.k
    public final l2 q() {
        return kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.v(kotlinx.coroutines.flow.k.h1(kotlinx.coroutines.flow.k.o1(this.f19352a.a(), new b(null)), new c(null)), new d(null)), ViewModelKt.getViewModelScope(this));
    }

    public final void r(@m80.k com.baicizhan.main.activity.schedule_v2.mutimode.data.h modeType) {
        kotlin.jvm.internal.g0.p(modeType, "modeType");
        this.f19360i.setValue(modeType.e().k());
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new f(modeType, null), 3, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ma.b.J1, Integer.valueOf(this.f19358g.a()));
        linkedHashMap.put(ma.b.K1, Integer.valueOf(modeType.e().k().a()));
        g2 g2Var = g2.f100423a;
        ma.l.e(ma.t.f73012k, ma.a.f72795m5, linkedHashMap);
    }
}
