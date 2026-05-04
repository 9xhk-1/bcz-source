package yg;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.platform.base.widget.WidgetsKt;
import com.baicizhan.platform.base.widget.s4;
import com.jiongji.andriod.card.R;
import dg.d;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yg.i2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/baicizhan/main/model/UtilsKt\n+ 2 Result.kt\ncom/baicizhan/main/data/ResultKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,187:1\n39#2,4:188\n1247#3,6:192\n1247#3,6:198\n1247#3,6:204\n1247#3,6:210\n1247#3,6:216\n1247#3,6:222\n1247#3,6:228\n1247#3,6:234\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/baicizhan/main/model/UtilsKt\n*L\n54#1:188,4\n108#1:192,6\n128#1:198,6\n138#1:204,6\n153#1:210,6\n154#1:216,6\n168#1:222,6\n145#1:228,6\n157#1:234,6\n*E\n"})
/* loaded from: classes4.dex */
public final class i2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.model.UtilsKt$ContentByTask$4$1", f = "Utils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f100001a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LoadingDialogActivity f100002b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f100003c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f100004d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f100005e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.l<Boolean, yz.g2> f100006f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MutableState<T> f100007g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Boolean f100008h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ MutableState<Throwable> f100009i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ x00.l<j00.c<? super Result<? extends T>>, Object> f100010j;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.model.UtilsKt$ContentByTask$4$1$3", f = "Utils.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: yg.i2$a$a, reason: collision with other inner class name */
        public static final class C1365a<T> extends SuspendLambda implements x00.l<j00.c<? super Result<? extends T>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f100011a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x00.l<j00.c<? super Result<? extends T>>, Object> f100012b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1365a(x00.l<? super j00.c<? super Result<? extends T>>, ? extends Object> lVar, j00.c<? super C1365a> cVar) {
                super(1, cVar);
                this.f100012b = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(j00.c<?> cVar) {
                return new C1365a(this.f100012b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super Result<? extends T>> cVar) {
                return ((C1365a) create(cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f100011a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                x00.l<j00.c<? super Result<? extends T>>, Object> lVar = this.f100012b;
                this.f100011a = 1;
                Object invoke = lVar.invoke(this);
                return invoke == l11 ? l11 : invoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(LoadingDialogActivity loadingDialogActivity, boolean z11, boolean z12, long j11, x00.l<? super Boolean, yz.g2> lVar, MutableState<T> mutableState, Boolean bool, MutableState<Throwable> mutableState2, x00.l<? super j00.c<? super Result<? extends T>>, ? extends Object> lVar2, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f100002b = loadingDialogActivity;
            this.f100003c = z11;
            this.f100004d = z12;
            this.f100005e = j11;
            this.f100006f = lVar;
            this.f100007g = mutableState;
            this.f100008h = bool;
            this.f100009i = mutableState2;
            this.f100010j = lVar2;
        }

        public static final yz.g2 k(x00.l lVar, MutableState mutableState, Object obj) {
            lVar.invoke(Boolean.TRUE);
            mutableState.setValue(obj);
            return yz.g2.f100423a;
        }

        public static final yz.g2 m(Boolean bool, x00.l lVar, MutableState mutableState, Throwable th2) {
            if (bool == null) {
                lVar.invoke(Boolean.FALSE);
            }
            mutableState.setValue(th2);
            return yz.g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f100002b, this.f100003c, this.f100004d, this.f100005e, this.f100006f, this.f100007g, this.f100008h, this.f100009i, this.f100010j, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f100001a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            LoadingDialogActivity loadingDialogActivity = this.f100002b;
            boolean z11 = this.f100003c;
            boolean z12 = this.f100004d;
            long j11 = this.f100005e;
            final x00.l<Boolean, yz.g2> lVar = this.f100006f;
            final MutableState<T> mutableState = this.f100007g;
            x00.l lVar2 = new x00.l() { // from class: yg.g2
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 k11;
                    k11 = i2.a.k(x00.l.this, mutableState, obj2);
                    return k11;
                }
            };
            final Boolean bool = this.f100008h;
            final x00.l<Boolean, yz.g2> lVar3 = this.f100006f;
            final MutableState<Throwable> mutableState2 = this.f100009i;
            i2.F(loadingDialogActivity, z11, z12, j11, lVar2, new x00.l() { // from class: yg.h2
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 m11;
                    m11 = i2.a.m(bool, lVar3, mutableState2, (Throwable) obj2);
                    return m11;
                }
            }, new C1365a(this.f100010j, null));
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.model.UtilsKt$launch$3", f = "Utils.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/baicizhan/main/model/UtilsKt$launch$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f100013a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<j00.c<? super Result<? extends T>>, Object> f100014b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, yz.g2> f100015c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f100016d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ LoadingDialogActivity f100017e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.l<Throwable, yz.g2> f100018f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f100019g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.l<? super j00.c<? super Result<? extends T>>, ? extends Object> lVar, x00.l<? super T, yz.g2> lVar2, boolean z11, LoadingDialogActivity loadingDialogActivity, x00.l<? super Throwable, yz.g2> lVar3, boolean z12, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f100014b = lVar;
            this.f100015c = lVar2;
            this.f100016d = z11;
            this.f100017e = loadingDialogActivity;
            this.f100018f = lVar3;
            this.f100019g = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f100014b, this.f100015c, this.f100016d, this.f100017e, this.f100018f, this.f100019g, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f100013a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                x00.l<j00.c<? super Result<? extends T>>, Object> lVar = this.f100014b;
                this.f100013a = 1;
                obj = lVar.invoke(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            boolean z11 = this.f100016d;
            LoadingDialogActivity loadingDialogActivity = this.f100017e;
            Result result = (Result) obj;
            result.m6317unboximpl();
            if (z11) {
                LoadingDialogActivity.setLoading$default(loadingDialogActivity, false, 0L, null, 6, null);
            }
            Object m6317unboximpl = result.m6317unboximpl();
            x00.l<T, yz.g2> lVar2 = this.f100015c;
            if (Result.m6315isSuccessimpl(m6317unboximpl)) {
                lVar2.invoke(m6317unboximpl);
            }
            x00.l<Throwable, yz.g2> lVar3 = this.f100018f;
            boolean z12 = this.f100019g;
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6317unboximpl);
            if (m6311exceptionOrNullimpl != null) {
                lVar3.invoke(m6311exceptionOrNullimpl);
                if (z12) {
                    va.g.j(m6311exceptionOrNullimpl, 0);
                }
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.model.UtilsKt$launchWhenCreated$3", f = "Utils.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/baicizhan/main/model/UtilsKt$launchWhenCreated$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f100020a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<j00.c<? super Result<? extends T>>, Object> f100021b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, yz.g2> f100022c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f100023d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ LoadingDialogActivity f100024e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.l<Throwable, yz.g2> f100025f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f100026g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x00.l<? super j00.c<? super Result<? extends T>>, ? extends Object> lVar, x00.l<? super T, yz.g2> lVar2, boolean z11, LoadingDialogActivity loadingDialogActivity, x00.l<? super Throwable, yz.g2> lVar3, boolean z12, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f100021b = lVar;
            this.f100022c = lVar2;
            this.f100023d = z11;
            this.f100024e = loadingDialogActivity;
            this.f100025f = lVar3;
            this.f100026g = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f100021b, this.f100022c, this.f100023d, this.f100024e, this.f100025f, this.f100026g, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f100020a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                x00.l<j00.c<? super Result<? extends T>>, Object> lVar = this.f100021b;
                this.f100020a = 1;
                obj = lVar.invoke(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            boolean z11 = this.f100023d;
            LoadingDialogActivity loadingDialogActivity = this.f100024e;
            Result result = (Result) obj;
            result.m6317unboximpl();
            if (z11) {
                LoadingDialogActivity.setLoading$default(loadingDialogActivity, false, 0L, null, 6, null);
            }
            Object m6317unboximpl = result.m6317unboximpl();
            x00.l<T, yz.g2> lVar2 = this.f100022c;
            if (Result.m6315isSuccessimpl(m6317unboximpl)) {
                lVar2.invoke(m6317unboximpl);
            }
            x00.l<Throwable, yz.g2> lVar3 = this.f100025f;
            boolean z12 = this.f100026g;
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6317unboximpl);
            if (m6311exceptionOrNullimpl != null) {
                lVar3.invoke(m6311exceptionOrNullimpl);
                if (z12) {
                    va.g.j(m6311exceptionOrNullimpl, 0);
                }
            }
            return yz.g2.f100423a;
        }
    }

    public static final boolean A(@m80.k MutableState<Boolean> mutableState) {
        kotlin.jvm.internal.g0.p(mutableState, "<this>");
        return mutableState.getValue() == null;
    }

    public static final <T> void B(@m80.k LoadingDialogActivity loadingDialogActivity, boolean z11, boolean z12, long j11, @m80.k x00.l<? super T, yz.g2> onSuccess, @m80.k x00.l<? super Throwable, yz.g2> onFailure, @m80.k x00.l<? super j00.c<? super Result<? extends T>>, ? extends Object> task) {
        kotlin.jvm.internal.g0.p(loadingDialogActivity, "<this>");
        kotlin.jvm.internal.g0.p(onSuccess, "onSuccess");
        kotlin.jvm.internal.g0.p(onFailure, "onFailure");
        kotlin.jvm.internal.g0.p(task, "task");
        if (z11) {
            LoadingDialogActivity.setLoading$default(loadingDialogActivity, true, j11, null, 4, null);
        }
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(loadingDialogActivity), null, null, new b(task, onSuccess, z11, loadingDialogActivity, onFailure, z12, null), 3, null);
    }

    public static /* synthetic */ void C(LoadingDialogActivity loadingDialogActivity, boolean z11, boolean z12, long j11, x00.l lVar, x00.l lVar2, x00.l lVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            j11 = 0;
        }
        if ((i11 & 8) != 0) {
            lVar = new x00.l() { // from class: yg.f2
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 D;
                    D = i2.D(obj2);
                    return D;
                }
            };
        }
        if ((i11 & 16) != 0) {
            lVar2 = new x00.l() { // from class: yg.u1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 E;
                    E = i2.E((Throwable) obj2);
                    return E;
                }
            };
        }
        B(loadingDialogActivity, z11, z12, j11, lVar, lVar2, lVar3);
    }

    public static final yz.g2 D(Object obj) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 E(Throwable it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    public static final <T> void F(@m80.k LoadingDialogActivity loadingDialogActivity, boolean z11, boolean z12, long j11, @m80.k x00.l<? super T, yz.g2> onSuccess, @m80.k x00.l<? super Throwable, yz.g2> onFailure, @m80.k x00.l<? super j00.c<? super Result<? extends T>>, ? extends Object> task) {
        kotlin.jvm.internal.g0.p(loadingDialogActivity, "<this>");
        kotlin.jvm.internal.g0.p(onSuccess, "onSuccess");
        kotlin.jvm.internal.g0.p(onFailure, "onFailure");
        kotlin.jvm.internal.g0.p(task, "task");
        if (z11) {
            LoadingDialogActivity.setLoading$default(loadingDialogActivity, true, j11, null, 4, null);
        }
        LifecycleOwnerKt.getLifecycleScope(loadingDialogActivity).launchWhenCreated(new c(task, onSuccess, z11, loadingDialogActivity, onFailure, z12, null));
    }

    public static /* synthetic */ void G(LoadingDialogActivity loadingDialogActivity, boolean z11, boolean z12, long j11, x00.l lVar, x00.l lVar2, x00.l lVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            j11 = 0;
        }
        if ((i11 & 8) != 0) {
            lVar = new x00.l() { // from class: yg.d2
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 H;
                    H = i2.H(obj2);
                    return H;
                }
            };
        }
        if ((i11 & 16) != 0) {
            lVar2 = new x00.l() { // from class: yg.e2
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 I;
                    I = i2.I((Throwable) obj2);
                    return I;
                }
            };
        }
        F(loadingDialogActivity, z11, z12, j11, lVar, lVar2, lVar3);
    }

    public static final yz.g2 H(Object obj) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 I(Throwable it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    public static final void J(@m80.k MutableState<Integer> mutableState) {
        kotlin.jvm.internal.g0.p(mutableState, "<this>");
        mutableState.setValue(Integer.valueOf(mutableState.getValue().intValue() + 1));
    }

    @Composable
    @m80.k
    public static final MutableState<Boolean> K(@m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(609927000, i11, -1, "com.baicizhan.main.model.rememberInitializedState (Utils.kt:127)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState<Boolean> mutableState = (MutableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    @Composable
    @m80.k
    public static final MutableState<Integer> L(@m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(887564387, i11, -1, "com.baicizhan.main.model.rememberRefresher (Utils.kt:107)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState<Integer> mutableState = (MutableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final void M(@m80.k LoadingDialogActivity loadingDialogActivity, @m80.k dg.d<?> state, boolean z11, long j11) {
        kotlin.jvm.internal.g0.p(loadingDialogActivity, "<this>");
        kotlin.jvm.internal.g0.p(state, "state");
        LoadingDialogActivity.setLoading$default(loadingDialogActivity, state instanceof d.b, j11, null, 4, null);
        if (z11 && dg.e.b(state)) {
            va.g.j(((d.a) state).d(), 0);
        }
    }

    public static /* synthetic */ void N(LoadingDialogActivity loadingDialogActivity, dg.d dVar, boolean z11, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            j11 = 0;
        }
        M(loadingDialogActivity, dVar, z11, j11);
    }

    public static final void O(@m80.k MutableState<Boolean> mutableState, boolean z11) {
        kotlin.jvm.internal.g0.p(mutableState, "<this>");
        if (!z11 || A(mutableState)) {
            mutableState.setValue(Boolean.FALSE);
        }
    }

    public static /* synthetic */ void P(MutableState mutableState, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        O(mutableState, z11);
    }

    public static final void Q(@m80.k MutableState<Boolean> mutableState) {
        kotlin.jvm.internal.g0.p(mutableState, "<this>");
        mutableState.setValue(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x034c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void n(@m80.k final com.baicizhan.base.LoadingDialogActivity r30, @m80.l androidx.compose.runtime.MutableState<java.lang.Boolean> r31, @m80.l androidx.compose.runtime.MutableState<java.lang.Integer> r32, boolean r33, boolean r34, long r35, @m80.l java.lang.String r37, @m80.l x00.a<yz.g2> r38, @m80.l x00.q<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r39, @m80.l x00.q<? super java.lang.Throwable, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r40, @m80.k final x00.l<? super j00.c<? super kotlin.Result<? extends T>>, ? extends java.lang.Object> r41, @m80.l androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.i2.n(com.baicizhan.base.LoadingDialogActivity, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, boolean, boolean, long, java.lang.String, x00.a, x00.q, x00.q, x00.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final yz.g2 o() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 p(final MutableState mutableState, Throwable it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1035439545, i11, -1, "com.baicizhan.main.model.ContentByTask.<anonymous> (Utils.kt:140)");
        }
        String stringResource = StringResources_androidKt.stringResource(R.string.base_loading_view_failed, composer, 6);
        String stringResource2 = StringResources_androidKt.stringResource(R.string.base_loading_view_retry, composer, 6);
        boolean changed = composer.changed(mutableState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.a() { // from class: yg.w1
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 q11;
                    q11 = i2.q(MutableState.this);
                    return q11;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        WidgetsKt.r(R.drawable.ic_common_page_error, stringResource, stringResource2, (x00.a) rememberedValue, composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 q(MutableState mutableState) {
        J(mutableState);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 r(final x00.a aVar, final String str, final Boolean bool, final x00.q qVar, final MutableState mutableState, final x00.q qVar2, final MutableState mutableState2, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(438402242, i11, -1, "com.baicizhan.main.model.ContentByTask.<anonymous> (Utils.kt:155)");
            }
            s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(-1760055559, true, new x00.p() { // from class: yg.b2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 s11;
                    s11 = i2.s(x00.a.this, str, (Composer) obj, ((Integer) obj2).intValue());
                    return s11;
                }
            }, composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1575194383, true, new x00.q() { // from class: yg.c2
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 u11;
                    u11 = i2.u(bool, qVar, mutableState, qVar2, mutableState2, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return u11;
                }
            }, composer, 54), composer, 3072, 12582912, 131063);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 s(final x00.a aVar, String str, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1760055559, i11, -1, "com.baicizhan.main.model.ContentByTask.<anonymous>.<anonymous> (Utils.kt:156)");
            }
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: yg.t1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 t11;
                        t11 = i2.t(x00.a.this);
                        return t11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            s4.F(0, null, (x00.a) rememberedValue, str, null, null, composer, 0, 51);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 t(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 u(Boolean bool, x00.q qVar, MutableState mutableState, x00.q qVar2, MutableState mutableState2, PaddingValues it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1575194383, i11, -1, "com.baicizhan.main.model.ContentByTask.<anonymous>.<anonymous> (Utils.kt:157)");
            }
            if (bool != null) {
                composer.startReplaceGroup(196858397);
                if (bool.booleanValue()) {
                    composer.startReplaceGroup(196888312);
                    Object value = mutableState.getValue();
                    if (value == null) {
                        composer.endReplaceGroup();
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        return yz.g2.f100423a;
                    }
                    qVar.invoke(value, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(196982893);
                    Throwable th2 = (Throwable) mutableState2.getValue();
                    if (th2 == null) {
                        th2 = new Throwable("no specific error");
                    }
                    qVar2.invoke(th2, composer, 0);
                    composer.endReplaceGroup();
                }
            } else {
                composer.startReplaceGroup(191976145);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 v(LoadingDialogActivity loadingDialogActivity, MutableState mutableState, MutableState mutableState2, boolean z11, boolean z12, long j11, String str, x00.a aVar, x00.q qVar, x00.q qVar2, x00.l lVar, int i11, int i12, int i13, Composer composer, int i14) {
        n(loadingDialogActivity, mutableState, mutableState2, z11, z12, j11, str, aVar, qVar, qVar2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12), i13);
        return yz.g2.f100423a;
    }

    @m80.k
    public static final ActivityResultLauncher<Intent> w(@m80.k ComponentActivity activity, @m80.k final hj.a<Intent> callback) {
        kotlin.jvm.internal.g0.p(activity, "activity");
        kotlin.jvm.internal.g0.p(callback, "callback");
        return activity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: yg.v1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                i2.x(hj.a.this, (ActivityResult) obj);
            }
        });
    }

    public static final void x(hj.a aVar, ActivityResult it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (it.getResultCode() == -1) {
            aVar.onResult(it.getData());
        }
    }

    public static final boolean y(@m80.k MutableState<Boolean> mutableState) {
        kotlin.jvm.internal.g0.p(mutableState, "<this>");
        return kotlin.jvm.internal.g0.g(mutableState.getValue(), Boolean.FALSE);
    }

    public static final boolean z(@m80.k MutableState<Boolean> mutableState) {
        kotlin.jvm.internal.g0.p(mutableState, "<this>");
        return kotlin.jvm.internal.g0.g(mutableState.getValue(), Boolean.TRUE);
    }
}
