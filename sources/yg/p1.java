package yg;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.baicizhan.app.api.service.model.BookLanguageType;
import com.baicizhan.client.fm.activity.AudioCenterActivity;
import com.baicizhan.client.video.activity.WordTVActivity;
import com.baicizhan.main.activity.FastTestActivity;
import com.baicizhan.main.model.data.GoldenNavigationAndTrainingConfig;
import com.baicizhan.main.phrasetraining.activity.PhraseGroupActivity;
import com.baicizhan.main.plusreview.activity.DefaultPreloadActivity;
import com.baicizhan.online.user_study_api.ModuleResourceType;
import fd.w4;
import fd.x4;
import fd.z4;
import java.util.List;
import k3.x2;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nTrainingModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingModel.kt\ncom/baicizhan/main/model/TrainingModel\n+ 2 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 3 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,379:1\n10#2:380\n43#3:381\n124#4,4:382\n142#5:386\n*S KotlinDebug\n*F\n+ 1 TrainingModel.kt\ncom/baicizhan/main/model/TrainingModel\n*L\n145#1:380\n145#1:381\n145#1:382,4\n145#1:386\n*E\n"})
/* loaded from: classes4.dex */
public final class p1 extends z {

    /* renamed from: o, reason: collision with root package name */
    public static final int f100058o = 8;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableState<Pair<String, Integer>> f100059d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final State<Pair<String, Integer>> f100060e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableState<List<x4>> f100061f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final State<List<x4>> f100062g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableState<List<fd.o>> f100063h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final State<List<fd.o>> f100064i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final MutableState<List<zg.h>> f100065j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final State<List<zg.h>> f100066k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final yz.c0 f100067l;

    /* renamed from: m, reason: collision with root package name */
    public GoldenNavigationAndTrainingConfig f100068m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public BookLanguageType f100069n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100070a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f100071b;

        static {
            int[] iArr = new int[BookLanguageType.values().length];
            try {
                iArr[BookLanguageType.English.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f100070a = iArr;
            int[] iArr2 = new int[ModuleResourceType.values().length];
            try {
                iArr2[ModuleResourceType.WORD_CHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ModuleResourceType.WORD_TRAINING.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f100071b = iArr2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements x00.p<Integer, Integer, Boolean> {
        public b(Object obj) {
            super(2, obj, p1.class, "isSupported", "isSupported(II)Z", 0);
        }

        public final Boolean a(int i11, int i12) {
            return Boolean.valueOf(((p1) this.receiver).I(i11, i12));
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2) {
            return a(num.intValue(), num2.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.model.TrainingModel$build$2", f = "TrainingModel.kt", i = {0, 1}, l = {293, 296}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nTrainingModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingModel.kt\ncom/baicizhan/main/model/TrainingModel$build$2\n+ 2 CommonUtils2.kt\ncom/baicizhan/main/utils/CommonUtils2Kt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,379:1\n144#2:380\n144#2:382\n1869#3:381\n774#3:385\n865#3,2:386\n1563#3:388\n1634#3,3:389\n1617#3,9:393\n1869#3:402\n1870#3:404\n1626#3:405\n1870#3:406\n37#4,2:383\n1#5:392\n1#5:403\n*S KotlinDebug\n*F\n+ 1 TrainingModel.kt\ncom/baicizhan/main/model/TrainingModel$build$2\n*L\n298#1:380\n305#1:382\n304#1:381\n307#1:385\n307#1:386,2\n307#1:388\n307#1:389,3\n334#1:393,9\n334#1:402\n334#1:404\n334#1:405\n304#1:406\n305#1:383,2\n334#1:403\n*E\n"})
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f100072a;

        /* renamed from: b, reason: collision with root package name */
        public Object f100073b;

        /* renamed from: c, reason: collision with root package name */
        public int f100074c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f100075d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f100077f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f100078g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ i1 f100079h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ w4 f100080i;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.model.TrainingModel$build$2$1", f = "TrainingModel.kt", i = {}, l = {296}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super BookLanguageType>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f100081a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1 f100082b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f100083c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p1 p1Var, int i11, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f100082b = p1Var;
                this.f100083c = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f100082b, this.f100083c, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super BookLanguageType> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f100081a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                k3.s0 G = this.f100082b.G();
                int i12 = this.f100083c;
                this.f100081a = 1;
                Object r02 = G.r0(i12, this);
                return r02 == l11 ? l11 : r02;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11, AppCompatActivity appCompatActivity, i1 i1Var, w4 w4Var, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f100077f = i11;
            this.f100078g = appCompatActivity;
            this.f100079h = i1Var;
            this.f100080i = w4Var;
        }

        public static final yz.g2 k(AppCompatActivity appCompatActivity) {
            appCompatActivity.startActivity(new Intent(appCompatActivity, (Class<?>) WordTVActivity.class));
            ma.l.a(ma.t.f73003b, ma.a.N);
            return yz.g2.f100423a;
        }

        public static final yz.g2 m(AppCompatActivity appCompatActivity) {
            AudioCenterActivity.N0(appCompatActivity);
            ma.l.a(ma.t.f73003b, ma.a.O);
            return yz.g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = p1.this.new c(this.f100077f, this.f100078g, this.f100079h, this.f100080i, cVar);
            cVar2.f100075d = obj;
            return cVar2;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0052, code lost:
        
            if (r6 == r0) goto L26;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0375  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x037a  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0087  */
        /* JADX WARN: Type inference failed for: r3v0, types: [int] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v22 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                Method dump skipped, instructions count: 901
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: yg.p1.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.model.TrainingModel$readLocalConfig$2", f = "TrainingModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nTrainingModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingModel.kt\ncom/baicizhan/main/model/TrainingModel$readLocalConfig$2\n+ 2 CommonUtils2.kt\ncom/baicizhan/main/utils/CommonUtils2Kt\n*L\n1#1,379:1\n144#2:380\n144#2:381\n*S KotlinDebug\n*F\n+ 1 TrainingModel.kt\ncom/baicizhan/main/model/TrainingModel$readLocalConfig$2\n*L\n159#1:380\n166#1:381\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super GoldenNavigationAndTrainingConfig>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f100084a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f100085b;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(cVar);
            dVar.f100085b = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super GoldenNavigationAndTrainingConfig> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c40.r0 r0Var = (c40.r0) this.f100085b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f100084a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            zg.b bVar = zg.b.f102640a;
            String b11 = bVar.b(bVar.a());
            String simpleName = r0Var.getClass().getSimpleName();
            kotlin.jvm.internal.g0.o(simpleName, "getSimpleName(...)");
            qb.c.b(simpleName, "local config: " + b11, new Object[0]);
            if (b11 == null || b11.length() == 0) {
                return null;
            }
            try {
                return bVar.c(b11);
            } catch (Exception e11) {
                String simpleName2 = b11.getClass().getSimpleName();
                kotlin.jvm.internal.g0.o(simpleName2, "getSimpleName(...)");
                qb.c.c(simpleName2, b11 + " - ", e11);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(@m80.k final Application application) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        MutableState<Pair<String, Integer>> mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair("", 0), null, 2, null);
        this.f100059d = mutableStateOf$default;
        this.f100060e = mutableStateOf$default;
        MutableState<List<x4>> mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(a00.h0.J(), null, 2, null);
        this.f100061f = mutableStateOf$default2;
        this.f100062g = mutableStateOf$default2;
        MutableState<List<fd.o>> mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(a00.h0.J(), null, 2, null);
        this.f100063h = mutableStateOf$default3;
        this.f100064i = mutableStateOf$default3;
        MutableState<List<zg.h>> mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f100065j = mutableStateOf$default4;
        this.f100066k = mutableStateOf$default4;
        this.f100067l = yz.e0.c(new x00.a() { // from class: yg.n1
            @Override // x00.a
            public final Object invoke() {
                k3.s0 B;
                B = p1.B(application);
                return B;
            }
        });
        this.f100069n = BookLanguageType.English;
    }

    public static final yz.g2 A(AppCompatActivity appCompatActivity) {
        PhraseGroupActivity.R0(appCompatActivity);
        ma.l.a(ma.t.f73011j, ma.a.O0);
        return yz.g2.f100423a;
    }

    public static final k3.s0 B(Application application) {
        dd.h.g(application);
        return (k3.s0) ((x2) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(k3.s0.class), null, null));
    }

    public static final z4 t(p1 p1Var, AppCompatActivity appCompatActivity, int i11, i1 i1Var, int i12) {
        return p1Var.w(appCompatActivity, i11, i1Var, i12);
    }

    public static final z4 u(ModuleResourceType moduleResourceType, p1 p1Var, AppCompatActivity appCompatActivity, int i11, i1 i1Var, w4 w4Var) {
        return p1Var.x(moduleResourceType, appCompatActivity, i11, i1Var, w4Var);
    }

    public static /* synthetic */ void v(p1 p1Var, AppCompatActivity appCompatActivity, int i11, i1 i1Var, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i1Var = new k1(appCompatActivity, new b(p1Var));
        }
        p1Var.s(appCompatActivity, i11, i1Var);
    }

    public static final yz.g2 y(AppCompatActivity appCompatActivity) {
        DefaultPreloadActivity.Z0(appCompatActivity, 7);
        ma.l.a(ma.t.f73011j, ma.a.M0);
        return yz.g2.f100423a;
    }

    public static final yz.g2 z(AppCompatActivity appCompatActivity) {
        FastTestActivity.f17888h.a(appCompatActivity);
        ma.l.a(ma.t.f73011j, ma.a.N0);
        return yz.g2.f100423a;
    }

    @m80.k
    public final State<List<zg.h>> C() {
        return this.f100066k;
    }

    @m80.k
    public final State<Pair<String, Integer>> D() {
        return this.f100060e;
    }

    @m80.k
    public final State<List<fd.o>> F() {
        return this.f100064i;
    }

    public final k3.s0 G() {
        return (k3.s0) this.f100067l.getValue();
    }

    @m80.k
    public final State<List<x4>> H() {
        return this.f100062g;
    }

    public final boolean I(int i11, int i12) {
        if (a.f100070a[this.f100069n.ordinal()] == 1) {
            return true;
        }
        return (i12 == 5 || i12 == 4 || i12 == 22 || i12 == 21) ? false : true;
    }

    public final Object J(j00.c<? super GoldenNavigationAndTrainingConfig> cVar) {
        return c40.i.h(c40.h1.c(), new d(null), cVar);
    }

    @VisibleForTesting(otherwise = 2)
    public final void K(@m80.k Pair<String, Integer> info, @m80.k List<x4> trainings, @m80.k List<fd.o> extensions) {
        kotlin.jvm.internal.g0.p(info, "info");
        kotlin.jvm.internal.g0.p(trainings, "trainings");
        kotlin.jvm.internal.g0.p(extensions, "extensions");
        this.f100059d.setValue(info);
        this.f100061f.setValue(trainings);
        this.f100063h.setValue(extensions);
    }

    public final void s(@m80.k AppCompatActivity activity, int i11, @m80.k i1 trainingCreator) {
        kotlin.jvm.internal.g0.p(activity, "activity");
        kotlin.jvm.internal.g0.p(trainingCreator, "trainingCreator");
        w4 b11 = trainingCreator.b(i11);
        this.f100059d.setValue(new Pair<>(b11.f(), Integer.valueOf(b11.g())));
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new c(i11, activity, trainingCreator, b11, null), 3, null);
    }

    public final z4 w(final AppCompatActivity appCompatActivity, int i11, i1 i1Var, int i12) {
        if (i12 == 3) {
            return i1.c(i1Var, appCompatActivity, "单词选义", i11, 3, "阅读", 0, 32, null);
        }
        if (i12 == 4) {
            return i1Var.a(appCompatActivity, "单词拼写", i11, 4, "写作", 20);
        }
        if (i12 == 5) {
            return i1.c(i1Var, appCompatActivity, "读词填空", i11, 5, "口语", 0, 32, null);
        }
        if (i12 == 7) {
            return new z4("单词速听", null, null, new x00.a() { // from class: yg.o1
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 y11;
                    y11 = p1.y(AppCompatActivity.this);
                    return y11;
                }
            }, 6, null);
        }
        switch (i12) {
            case 21:
                return i1.c(i1Var, appCompatActivity, "填空拼写", i11, 21, "写作", 0, 32, null);
            case 22:
                return i1Var.a(appCompatActivity, "组合拼写", i11, 22, "写作", 20);
            case 23:
                return i1.c(i1Var, appCompatActivity, "听音选义", i11, 23, "听力", 0, 32, null);
            case 24:
                return i1.c(i1Var, appCompatActivity, "中文选词", i11, 24, "阅读", 0, 32, null);
            default:
                return null;
        }
    }

    public final z4 x(ModuleResourceType moduleResourceType, final AppCompatActivity appCompatActivity, int i11, i1 i1Var, w4 w4Var) {
        int a11 = dh.b.a(moduleResourceType);
        if (a11 != 3 && a11 != 4 && a11 != 5 && a11 != 7) {
            switch (a11) {
                case 21:
                case 22:
                case 23:
                case 24:
                    break;
                default:
                    int i12 = a.f100071b[moduleResourceType.ordinal()];
                    if (i12 == 1) {
                        return new z4("单词自检", null, null, new x00.a() { // from class: yg.l1
                            @Override // x00.a
                            public final Object invoke() {
                                yz.g2 z11;
                                z11 = p1.z(AppCompatActivity.this);
                                return z11;
                            }
                        }, 6, null);
                    }
                    if (i12 == 2 && w4Var.h()) {
                        return new z4("词组特训", "阅读", null, new x00.a() { // from class: yg.m1
                            @Override // x00.a
                            public final Object invoke() {
                                yz.g2 A;
                                A = p1.A(AppCompatActivity.this);
                                return A;
                            }
                        }, 4, null);
                    }
                    return null;
            }
        }
        return w(appCompatActivity, i11, i1Var, a11);
    }
}
