package com.baicizhan.main.activity.mytab.device;

import a00.r0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c40.l2;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.main.activity.mytab.device.v;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import q30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@av.b
@u0({"SMAP\nMyDeviceVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyDeviceVM.kt\ncom/baicizhan/main/activity/mytab/device/MyDeviceVM\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n17#2:54\n19#2:58\n46#3:55\n51#3:57\n105#4:56\n1#5:59\n*S KotlinDebug\n*F\n+ 1 MyDeviceVM.kt\ncom/baicizhan/main/activity/mytab/device/MyDeviceVM\n*L\n37#1:54\n37#1:58\n37#1:55\n37#1:57\n37#1:56\n*E\n"})
/* loaded from: classes4.dex */
public final class MyDeviceVM extends ViewModel {

    /* renamed from: f, reason: collision with root package name */
    public static final int f18600f = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ie.a f18601a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableState<v> f18602b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<String> f18603c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final LiveData<String> f18604d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public l2 f18605e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$2", f = "MyDeviceVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<List<? extends ie.b>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18608a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18609b;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = MyDeviceVM.this.new a(cVar);
            aVar.f18609b = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<ie.b> list, j00.c<? super g2> cVar) {
            return ((a) create(list, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f18609b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f18608a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            MyDeviceVM.this.d().setValue(new v.b(list));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$3", f = "MyDeviceVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super List<? extends ie.b>>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18611a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18612b;

        public b(j00.c<? super b> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.j<? super List<? extends ie.b>> jVar, Throwable th2, j00.c<? super g2> cVar) {
            return invoke2((kotlinx.coroutines.flow.j<? super List<ie.b>>) jVar, th2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f18612b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f18611a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.c(e.f18630a, "", th2);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.flow.j<? super List<ie.b>> jVar, Throwable th2, j00.c<? super g2> cVar) {
            b bVar = new b(cVar);
            bVar.f18612b = th2;
            return bVar.invokeSuspend(g2.f100423a);
        }
    }

    @Inject
    public MyDeviceVM(@m80.k ie.a devicesRepo) {
        g0.p(devicesRepo, "devicesRepo");
        this.f18601a = devicesRepo;
        this.f18602b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(v.a.f18657a, null, 2, null);
        ClickProtectedEvent<String> clickProtectedEvent = new ClickProtectedEvent<>();
        this.f18603c = clickProtectedEvent;
        this.f18604d = clickProtectedEvent;
    }

    public static final ie.b h(int i11, ie.b it) {
        ie.b h11;
        g0.p(it, "it");
        ie.b bVar = it.j() == i11 ? it : null;
        return (bVar == null || (h11 = ie.b.h(bVar, 0, null, null, null, null, 0L, 47, null)) == null) ? it : h11;
    }

    @m80.l
    public final l2 b() {
        return this.f18605e;
    }

    @m80.k
    public final LiveData<String> c() {
        return this.f18604d;
    }

    @m80.k
    public final MutableState<v> d() {
        return this.f18602b;
    }

    public final void f(@m80.k ie.b device) {
        g0.p(device, "device");
        this.f18603c.postValue(device.k());
        g(device.j(), device.l());
    }

    public final void g(final int i11, long j11) {
        List<ie.b> d11;
        this.f18601a.b(i11, j11);
        v value = this.f18602b.getValue();
        v.b bVar = value instanceof v.b ? (v.b) value : null;
        if (bVar == null || (d11 = bVar.d()) == null) {
            return;
        }
        this.f18602b.setValue(new v.b(k0.I3(k0.N1(r0.E1(d11), new x00.l() { // from class: com.baicizhan.main.activity.mytab.device.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                ie.b h11;
                h11 = MyDeviceVM.h(i11, (ie.b) obj);
                return h11;
            }
        }))));
    }

    public final void i() {
        l2 l2Var = this.f18605e;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        final kotlinx.coroutines.flow.i<List<ie.b>> a11 = this.f18601a.a();
        this.f18605e = kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.v(kotlinx.coroutines.flow.k.h1(new kotlinx.coroutines.flow.i<List<? extends ie.b>>() { // from class: com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$$inlined$filter$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MyDeviceVM.kt\ncom/baicizhan/main/activity/mytab/device/MyDeviceVM\n*L\n1#1,49:1\n18#2:50\n19#2:52\n37#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f18607a;

                @l00.d(c = "com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$$inlined$filter$1$2", f = "MyDeviceVM.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                    this.f18607a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, j00.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$$inlined$filter$1$2$1 r0 = (com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$$inlined$filter$1$2$1 r0 = new com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r5 = r0.L$3
                        kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                        java.lang.Object r5 = r0.L$1
                        com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$$inlined$filter$1$2$1 r5 = (com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r5
                        kotlin.e.n(r6)
                        goto L6d
                    L31:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L39:
                        kotlin.e.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f18607a
                        r2 = r5
                        java.util.List r2 = (java.util.List) r2
                        java.util.Collection r2 = (java.util.Collection) r2
                        boolean r2 = r2.isEmpty()
                        if (r2 != 0) goto L6d
                        java.lang.Object r2 = l00.k.a(r5)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r2 = l00.k.a(r5)
                        r0.L$2 = r2
                        java.lang.Object r2 = l00.k.a(r6)
                        r0.L$3 = r2
                        r2 = 0
                        r0.I$0 = r2
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L6d
                        return r1
                    L6d:
                        yz.g2 r5 = yz.g2.f100423a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.device.MyDeviceVM$refresh$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super List<? extends ie.b>> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, new a(null)), new b(null)), ViewModelKt.getViewModelScope(this));
    }

    public final void j(@m80.l l2 l2Var) {
        this.f18605e = l2Var;
    }
}
