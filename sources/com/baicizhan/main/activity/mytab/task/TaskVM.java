package com.baicizhan.main.activity.mytab.task;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.main.activity.mytab.task.data.ActionType;
import com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC;
import he.a;
import he.x;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.h0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@av.b
@u0({"SMAP\nTaskVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskVM.kt\ncom/baicizhan/main/activity/mytab/task/TaskVM\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n49#2:115\n51#2:119\n49#2:120\n51#2:124\n46#3:116\n51#3:118\n46#3:121\n51#3:123\n105#4:117\n105#4:122\n1#5:125\n*S KotlinDebug\n*F\n+ 1 TaskVM.kt\ncom/baicizhan/main/activity/mytab/task/TaskVM\n*L\n37#1:115\n37#1:119\n52#1:120\n52#1:124\n37#1:116\n37#1:118\n52#1:121\n52#1:123\n37#1:117\n52#1:122\n*E\n"})
/* loaded from: classes4.dex */
public final class TaskVM extends ViewModel {

    /* renamed from: n, reason: collision with root package name */
    public static final int f18665n = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.activity.mytab.task.data.g f18666a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.activity.mytab.task.data.h f18667b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.activity.mytab.task.domain.b f18668c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final DoReceiveAwardUC f18669d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.activity.mytab.task.domain.d f18670e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f18671f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.m0<he.a> f18672g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f18673h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.m0<he.x> f18674i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<String> f18675j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<String> f18676k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final LiveData<String> f18677l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final LiveData<String> f18678m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18683a;

        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                iArr[ActionType.H5.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionType.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionType.SIGN_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActionType.GET_AWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f18683a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.task.TaskVM$achievementState$2", f = "TaskVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super a.b>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18684a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18685b;

        public b(j00.c<? super b> cVar) {
            super(3, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f18685b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f18684a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.c(TaskVM.this.f18671f, "", th2);
            return g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(kotlinx.coroutines.flow.j<? super a.b> jVar, Throwable th2, j00.c<? super g2> cVar) {
            b bVar = TaskVM.this.new b(cVar);
            bVar.f18685b = th2;
            return bVar.invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.task.TaskVM$doTask$3", f = "TaskVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<String, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18687a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18688b;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(cVar);
            cVar2.f18688b = obj;
            return cVar2;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, j00.c<? super g2> cVar) {
            return ((c) create(str, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.f18688b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f18687a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            va.g.i(str, 0);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.task.TaskVM$doTask$4", f = "TaskVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super String>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18689a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18690b;

        public d(j00.c<? super d> cVar) {
            super(3, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f18690b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f18689a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            va.g.j(th2, 0);
            qb.c.c(TaskVM.this.f18671f, "", th2);
            return g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(kotlinx.coroutines.flow.j<? super String> jVar, Throwable th2, j00.c<? super g2> cVar) {
            d dVar = TaskVM.this.new d(cVar);
            dVar.f18690b = th2;
            return dVar.invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.task.TaskVM$exchangeNewRead$1", f = "TaskVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super Object>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18692a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18693b;

        public e(j00.c<? super e> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.j<? super Object> jVar, Throwable th2, j00.c<? super g2> cVar) {
            return invoke2((kotlinx.coroutines.flow.j<Object>) jVar, th2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f18693b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f18692a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.c(TaskVM.this.f18671f, "", th2);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.flow.j<Object> jVar, Throwable th2, j00.c<? super g2> cVar) {
            e eVar = TaskVM.this.new e(cVar);
            eVar.f18693b = th2;
            return eVar.invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.task.TaskVM$tasksCenter$2", f = "TaskVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super x.b>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18695a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18696b;

        public f(j00.c<? super f> cVar) {
            super(3, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f18696b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f18695a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.c(TaskVM.this.f18671f, "", th2);
            return g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(kotlinx.coroutines.flow.j<? super x.b> jVar, Throwable th2, j00.c<? super g2> cVar) {
            f fVar = TaskVM.this.new f(cVar);
            fVar.f18696b = th2;
            return fVar.invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.task.TaskVM$todayNewCoinRead$1", f = "TaskVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super Object>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18698a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18699b;

        public g(j00.c<? super g> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.j<? super Object> jVar, Throwable th2, j00.c<? super g2> cVar) {
            return invoke2((kotlinx.coroutines.flow.j<Object>) jVar, th2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f18699b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f18698a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.c(TaskVM.this.f18671f, "", th2);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.flow.j<Object> jVar, Throwable th2, j00.c<? super g2> cVar) {
            g gVar = TaskVM.this.new g(cVar);
            gVar.f18699b = th2;
            return gVar.invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.task.TaskVM$update$1", f = "TaskVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super Object>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18701a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18702b;

        public h(j00.c<? super h> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.j<? super Object> jVar, Throwable th2, j00.c<? super g2> cVar) {
            return invoke2((kotlinx.coroutines.flow.j<Object>) jVar, th2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f18702b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f18701a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.c(TaskVM.this.f18671f, "", th2);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.flow.j<Object> jVar, Throwable th2, j00.c<? super g2> cVar) {
            h hVar = TaskVM.this.new h(cVar);
            hVar.f18702b = th2;
            return hVar.invokeSuspend(g2.f100423a);
        }
    }

    @Inject
    public TaskVM(@m80.k com.baicizhan.main.activity.mytab.task.data.g achievement, @m80.k com.baicizhan.main.activity.mytab.task.data.h taskRepository, @m80.k com.baicizhan.main.activity.mytab.task.domain.b doSynUC, @m80.k DoReceiveAwardUC doReceiveAwardUC, @m80.k com.baicizhan.main.activity.mytab.task.domain.d getCoinTaskCenters) {
        kotlin.jvm.internal.g0.p(achievement, "achievement");
        kotlin.jvm.internal.g0.p(taskRepository, "taskRepository");
        kotlin.jvm.internal.g0.p(doSynUC, "doSynUC");
        kotlin.jvm.internal.g0.p(doReceiveAwardUC, "doReceiveAwardUC");
        kotlin.jvm.internal.g0.p(getCoinTaskCenters, "getCoinTaskCenters");
        this.f18666a = achievement;
        this.f18667b = taskRepository;
        this.f18668c = doSynUC;
        this.f18669d = doReceiveAwardUC;
        this.f18670e = getCoinTaskCenters;
        this.f18671f = "TaskVM";
        final kotlinx.coroutines.flow.i<com.baicizhan.main.activity.mytab.task.data.a> b11 = achievement.b();
        kotlinx.coroutines.flow.i v11 = kotlinx.coroutines.flow.k.v(new kotlinx.coroutines.flow.i<a.b>() { // from class: com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TaskVM.kt\ncom/baicizhan/main/activity/mytab/task/TaskVM\n*L\n1#1,49:1\n50#2:50\n38#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f18680a;

                @l00.d(c = "com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$1$2", f = "TaskVM.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$1$2$1, reason: invalid class name */
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
                    this.f18680a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, j00.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$1$2$1 r0 = (com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$1$2$1 r0 = new com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r6 = r0.L$3
                        kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                        java.lang.Object r6 = r0.L$1
                        com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$1$2$1 r6 = (com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L6a
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f18680a
                        r2 = r6
                        com.baicizhan.main.activity.mytab.task.data.a r2 = (com.baicizhan.main.activity.mytab.task.data.a) r2
                        he.a$b r4 = new he.a$b
                        r4.<init>(r2)
                        java.lang.Object r2 = l00.k.a(r6)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r6 = l00.k.a(r6)
                        r0.L$2 = r6
                        java.lang.Object r6 = l00.k.a(r7)
                        r0.L$3 = r6
                        r6 = 0
                        r0.I$0 = r6
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r4, r0)
                        if (r6 != r1) goto L6a
                        return r1
                    L6a:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super a.b> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, new b(null));
        c40.r0 viewModelScope = ViewModelKt.getViewModelScope(this);
        h0.a aVar = kotlinx.coroutines.flow.h0.f68148a;
        this.f18672g = kotlinx.coroutines.flow.k.Q1(v11, viewModelScope, h0.a.b(aVar, 5000L, 0L, 2, null), a.C0671a.f59182a);
        this.f18673h = FlowLiveDataConversions.asLiveData$default(taskRepository.g(), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        final kotlinx.coroutines.flow.i<le.a> b12 = getCoinTaskCenters.b();
        this.f18674i = kotlinx.coroutines.flow.k.Q1(kotlinx.coroutines.flow.k.v(new kotlinx.coroutines.flow.i<x.b>() { // from class: com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TaskVM.kt\ncom/baicizhan/main/activity/mytab/task/TaskVM\n*L\n1#1,49:1\n50#2:50\n52#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f18682a;

                @l00.d(c = "com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$2$2", f = "TaskVM.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$2$2$1, reason: invalid class name */
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
                    this.f18682a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, j00.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$2$2$1 r0 = (com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$2$2$1 r0 = new com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r6 = r0.L$3
                        kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                        java.lang.Object r6 = r0.L$1
                        com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$2$2$1 r6 = (com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L6a
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f18682a
                        r2 = r6
                        le.a r2 = (le.a) r2
                        he.x$b r4 = new he.x$b
                        r4.<init>(r2)
                        java.lang.Object r2 = l00.k.a(r6)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r6 = l00.k.a(r6)
                        r0.L$2 = r6
                        java.lang.Object r6 = l00.k.a(r7)
                        r0.L$3 = r6
                        r6 = 0
                        r0.I$0 = r6
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r4, r0)
                        if (r6 != r1) goto L6a
                        return r1
                    L6a:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.TaskVM$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super x.b> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, new f(null)), ViewModelKt.getViewModelScope(this), h0.a.b(aVar, 5000L, 0L, 2, null), x.a.f59231a);
        ClickProtectedEvent<String> clickProtectedEvent = new ClickProtectedEvent<>();
        this.f18675j = clickProtectedEvent;
        ClickProtectedEvent<String> clickProtectedEvent2 = new ClickProtectedEvent<>();
        this.f18676k = clickProtectedEvent2;
        this.f18677l = clickProtectedEvent;
        this.f18678m = clickProtectedEvent2;
    }

    public final void b(@m80.k com.baicizhan.main.activity.mytab.task.data.i task) {
        kotlin.jvm.internal.g0.p(task, "task");
        int i11 = a.f18683a[task.l().ordinal()];
        if (i11 == 1) {
            String k11 = task.k();
            if (k11 != null) {
                this.f18675j.postValue(k11);
            }
        } else if (i11 == 2) {
            String k12 = task.k();
            if (k12 != null) {
                this.f18676k.postValue(k12);
            }
        } else if (i11 == 3 || i11 == 4) {
            kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.v(kotlinx.coroutines.flow.k.h1(this.f18669d.b(task.o()), new c(null)), new d(null)), ViewModelKt.getViewModelScope(this));
        } else {
            qb.c.i(this.f18671f, "do nothing", new Object[0]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("task_id", Integer.valueOf(task.o()));
        linkedHashMap.put(ma.b.D1, task.q());
        linkedHashMap.put(ma.b.E1, task.m());
        g2 g2Var = g2.f100423a;
        ma.l.e("activity-common", ma.a.Y4, linkedHashMap);
    }

    public final void c() {
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.v(this.f18667b.h(), new e(null)), ViewModelKt.getViewModelScope(this));
    }

    @m80.k
    public final com.baicizhan.main.activity.mytab.task.data.g d() {
        return this.f18666a;
    }

    @m80.k
    public final kotlinx.coroutines.flow.m0<he.a> f() {
        return this.f18672g;
    }

    @m80.k
    public final DoReceiveAwardUC g() {
        return this.f18669d;
    }

    @m80.k
    public final com.baicizhan.main.activity.mytab.task.domain.b h() {
        return this.f18668c;
    }

    @m80.k
    public final com.baicizhan.main.activity.mytab.task.domain.d i() {
        return this.f18670e;
    }

    @m80.k
    public final LiveData<String> j() {
        return this.f18678m;
    }

    @m80.k
    public final LiveData<String> k() {
        return this.f18677l;
    }

    @m80.k
    public final com.baicizhan.main.activity.mytab.task.data.h l() {
        return this.f18667b;
    }

    @m80.k
    public final kotlinx.coroutines.flow.m0<he.x> m() {
        return this.f18674i;
    }

    @m80.k
    public final LiveData<Boolean> n() {
        return this.f18673h;
    }

    public final void o(int i11) {
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.v(this.f18667b.e(i11), new g(null)), ViewModelKt.getViewModelScope(this));
    }

    public final void p() {
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.v(this.f18668c.a(), new h(null)), ViewModelKt.getViewModelScope(this));
    }
}
