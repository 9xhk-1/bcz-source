package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.main.home.experiment.r0;
import com.baicizhan.main.home.experiment.t3;
import com.baicizhan.online.notify.NotifyResult;
import com.jiongji.andriod.card.R;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@av.b
@kotlin.jvm.internal.u0({"SMAP\nWordModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordModel.kt\ncom/baicizhan/main/home/experiment/WordModel\n+ 2 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n18#2,3:205\n1563#3:208\n1634#3,3:209\n1563#3:212\n1634#3,3:213\n1563#3:216\n1634#3,3:217\n1#4:220\n*S KotlinDebug\n*F\n+ 1 WordModel.kt\ncom/baicizhan/main/home/experiment/WordModel\n*L\n128#1:205,3\n153#1:208\n153#1:209,3\n154#1:212\n154#1:213,3\n155#1:216\n155#1:217,3\n*E\n"})
/* loaded from: classes4.dex */
public final class p5 extends ViewModel {

    /* renamed from: j, reason: collision with root package name */
    public static final int f21353j = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final aa.a f21354a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.home.experiment.repo.s f21355b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.home.experiment.repo.x f21356c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.home.experiment.repo.j f21357d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final nc.a f21358e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableState<t3> f21359f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final State<t3> f21360g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableState<r0> f21361h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final State<r0> f21362i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21363a;

        static {
            int[] iArr = new int[WinningType.values().length];
            try {
                iArr[WinningType.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WinningType.Hinting.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WinningType.Default.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21363a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.WordModel", f = "WordModel.kt", i = {0, 0, 0, 0, 0}, l = {159}, m = "buildHomeModel", n = {"result", "equipmentInfo", "studyHomeInfo", "winningStreakInfo", "winningModel"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f21364a;

        /* renamed from: b, reason: collision with root package name */
        public Object f21365b;

        /* renamed from: c, reason: collision with root package name */
        public Object f21366c;

        /* renamed from: d, reason: collision with root package name */
        public Object f21367d;

        /* renamed from: e, reason: collision with root package name */
        public Object f21368e;

        /* renamed from: f, reason: collision with root package name */
        public Object f21369f;

        /* renamed from: g, reason: collision with root package name */
        public Object f21370g;

        /* renamed from: h, reason: collision with root package name */
        public Object f21371h;

        /* renamed from: i, reason: collision with root package name */
        public Object f21372i;

        /* renamed from: j, reason: collision with root package name */
        public Object f21373j;

        /* renamed from: k, reason: collision with root package name */
        public Object f21374k;

        /* renamed from: l, reason: collision with root package name */
        public Object f21375l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f21376m;

        /* renamed from: o, reason: collision with root package name */
        public int f21378o;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f21376m = obj;
            this.f21378o |= Integer.MIN_VALUE;
            return p5.this.j(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.WordModel$refresh$1", f = "WordModel.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {65, 65, 71}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-WordModel$refresh$1$1", "$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-WordModel$refresh$1$1", "$this$launch", "it", "$i$a$-onSuccess-WordModel$refresh$1$2"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$3", "I$0"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nWordModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordModel.kt\ncom/baicizhan/main/home/experiment/WordModel$refresh$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f21379a;

        /* renamed from: b, reason: collision with root package name */
        public Object f21380b;

        /* renamed from: c, reason: collision with root package name */
        public Object f21381c;

        /* renamed from: d, reason: collision with root package name */
        public int f21382d;

        /* renamed from: e, reason: collision with root package name */
        public int f21383e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f21384f;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = p5.this.new c(cVar);
            cVar2.f21384f = obj;
            return cVar2;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
        /* JADX WARN: Type inference failed for: r2v13, types: [com.baicizhan.main.home.experiment.t3$c] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 450
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.p5.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.WordModel$refreshWordsPlanStatus$1", f = "WordModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {102, 102, 106}, m = "invokeSuspend", n = {"$this$launch", "oldState", "$this$invokeSuspend_u24lambda_u242", "$i$a$-runCatching-WordModel$refreshWordsPlanStatus$1$1", "$this$launch", "oldState", "$this$invokeSuspend_u24lambda_u242", "$i$a$-runCatching-WordModel$refreshWordsPlanStatus$1$1", "$this$launch", "oldState", "it", "$i$a$-onSuccess-WordModel$refreshWordsPlanStatus$1$2"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$4", "I$0"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nWordModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordModel.kt\ncom/baicizhan/main/home/experiment/WordModel$refreshWordsPlanStatus$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f21386a;

        /* renamed from: b, reason: collision with root package name */
        public Object f21387b;

        /* renamed from: c, reason: collision with root package name */
        public Object f21388c;

        /* renamed from: d, reason: collision with root package name */
        public Object f21389d;

        /* renamed from: e, reason: collision with root package name */
        public int f21390e;

        /* renamed from: f, reason: collision with root package name */
        public int f21391f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f21392g;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            d dVar = p5.this.new d(cVar);
            dVar.f21392g = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x016d  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x015d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 484
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.p5.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public p5(@m80.k aa.a serverTime, @m80.k com.baicizhan.main.home.experiment.repo.s gameHomeRepo, @m80.k com.baicizhan.main.home.experiment.repo.x refreshAll, @m80.k com.baicizhan.main.home.experiment.repo.j doRefreshPop, @q9.k @m80.k nc.a kv2) {
        kotlin.jvm.internal.g0.p(serverTime, "serverTime");
        kotlin.jvm.internal.g0.p(gameHomeRepo, "gameHomeRepo");
        kotlin.jvm.internal.g0.p(refreshAll, "refreshAll");
        kotlin.jvm.internal.g0.p(doRefreshPop, "doRefreshPop");
        kotlin.jvm.internal.g0.p(kv2, "kv");
        this.f21354a = serverTime;
        this.f21355b = gameHomeRepo;
        this.f21356c = refreshAll;
        this.f21357d = doRefreshPop;
        this.f21358e = kv2;
        MutableState<t3> mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t3.b.f21673b, null, 2, null);
        this.f21359f = mutableStateOf$default;
        this.f21360g = mutableStateOf$default;
        MutableState<r0> mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0.c.f21424b, null, 2, null);
        this.f21361h = mutableStateOf$default2;
        this.f21362i = mutableStateOf$default2;
    }

    public static final String k(p5 p5Var, WinningType type) {
        String[] h22;
        kotlin.jvm.internal.g0.p(type, "type");
        int i11 = a.f21363a[type.ordinal()];
        if (i11 == 1) {
            h22 = n3.h2();
        } else if (i11 == 2) {
            h22 = n3.g2();
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            h22 = n3.i2();
        }
        return p5Var.n(type, h22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.baicizhan.main.home.experiment.repo.a0 r18, j00.c<? super com.baicizhan.main.home.experiment.s3> r19) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.p5.j(com.baicizhan.main.home.experiment.repo.a0, j00.c):java.lang.Object");
    }

    @m80.k
    public final State<t3> l() {
        return this.f21360g;
    }

    @m80.k
    public final State<r0> m() {
        return this.f21362i;
    }

    public final String n(WinningType winningType, String[] strArr) {
        Pair pair;
        int nextInt;
        long startOfDay = TimeUtil.getStartOfDay(System.currentTimeMillis());
        String str = "winning_action_tip_time_" + winningType;
        String string = this.f21358e.getString(str, "");
        if (string == null || string.length() == 0) {
            pair = null;
        } else {
            List o52 = u30.k0.o5(string, new String[]{","}, false, 0, 6, null);
            pair = yz.h1.a(Integer.valueOf(Integer.parseInt((String) o52.get(0))), Long.valueOf(Long.parseLong((String) o52.get(1))));
        }
        if (pair == null) {
            pair = yz.h1.a(null, null);
        }
        Integer num = (Integer) pair.component1();
        Long l11 = (Long) pair.component2();
        qb.c.b(q5.f21413a, winningType + " pick from " + startOfDay + org.junit.jupiter.api.j2.O + num + org.junit.jupiter.api.j2.O + l11, new Object[0]);
        if (l11 == null || l11.longValue() != startOfDay || num == null) {
            nextInt = e10.e.b(System.currentTimeMillis()).nextInt(strArr.length);
            qb.c.b(q5.f21413a, "new from [" + nextInt + "]", new Object[0]);
            this.f21358e.p(str, nextInt + "," + startOfDay);
        } else {
            nextInt = num.intValue();
        }
        return strArr[nextInt];
    }

    public final void o() {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new c(null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }

    public final void p() {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new d(null), 3, null);
    }

    public final void q(MutableState<r0> mutableState, com.baicizhan.main.home.experiment.repo.w wVar) {
        if (wVar.e()) {
            mutableState.setValue(r0.b.f21422b);
            return;
        }
        NotifyResult f11 = wVar.f();
        if ((f11 != null ? f11.notify : null) != null) {
            String str = wVar.f().notify.banner_img_url;
            String url = wVar.f().notify.url;
            kotlin.jvm.internal.g0.o(url, "url");
            String aid = wVar.f().notify.aid;
            kotlin.jvm.internal.g0.o(aid, "aid");
            String title = wVar.f().notify.title;
            kotlin.jvm.internal.g0.o(title, "title");
            String content = wVar.f().notify.content;
            kotlin.jvm.internal.g0.o(content, "content");
            mutableState.setValue(new r0.a(str, url, aid, title, content));
            return;
        }
        NotifyResult f12 = wVar.f();
        if ((f12 != null ? f12.advNotify : null) != null) {
            String img_url = wVar.f().advNotify.img_url;
            kotlin.jvm.internal.g0.o(img_url, "img_url");
            String url2 = wVar.f().advNotify.url;
            kotlin.jvm.internal.g0.o(url2, "url");
            String aid2 = wVar.f().advNotify.aid;
            kotlin.jvm.internal.g0.o(aid2, "aid");
            mutableState.setValue(new r0.d(img_url, url2, aid2));
        }
    }

    public final void r(MutableState<t3> mutableState, NotifyResult notifyResult) {
        s3 d11;
        s3 j11;
        t3 value = mutableState.getValue();
        t3.c cVar = value instanceof t3.c ? (t3.c) value : null;
        if (cVar == null || (d11 = cVar.d()) == null || (j11 = s3.j(d11, null, null, null, null, com.baicizhan.main.home.experiment.repo.i.m(notifyResult), null, null, null, R.styleable.Theme_drawable_tab_surrounding, null)) == null) {
            return;
        }
        mutableState.setValue(new t3.c(j11));
    }
}
