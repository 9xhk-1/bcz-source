package com.baicizhan.main.home.plan;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.managers.booklist.BookUpdateInfos;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.client.business.util.Standard_extKt;
import com.baicizhan.main.activity.schedule.data.BookDataSource;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.main.home.plan.PrioritizedTask;
import com.baicizhan.main.home.plan.a3;
import com.baicizhan.main.home.plan.data.LearnCardStatus;
import com.baicizhan.main.home.plan.data.WordBanner;
import com.baicizhan.main.home.plan.module.UpgradeType;
import com.baicizhan.main.model.data.GoldenItem;
import com.baicizhan.main.model.data.GoldenNavigation;
import com.baicizhan.main.model.data.GoldenNavigationAndTrainingConfig;
import com.baicizhan.main.temporary.NewUserGuideOrderMgr;
import com.baicizhan.online.ad_property.AdLunchWechatProgram;
import com.baicizhan.online.advertise_api.BottomAdvInfos;
import com.baicizhan.online.notify.Notify;
import com.baicizhan.online.notify.NotifyResult;
import com.baicizhan.online.user_assistant_api.ClipboardResp;
import com.baicizhan.online.user_assistant_api.UserAssistantApiService;
import com.baicizhan.online.user_study_api.TrainPageResources;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import zg.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWordPlanViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanViewModel.kt\ncom/baicizhan/main/home/plan/WordPlanViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,635:1\n1563#2:636\n1634#2,3:637\n1563#2:641\n1634#2,3:642\n1563#2:645\n1634#2,2:646\n1563#2:648\n1634#2,3:649\n1636#2:652\n1563#2:653\n1634#2,3:654\n360#2,7:657\n360#2,7:664\n360#2,7:671\n1#3:640\n*S KotlinDebug\n*F\n+ 1 WordPlanViewModel.kt\ncom/baicizhan/main/home/plan/WordPlanViewModel\n*L\n390#1:636\n390#1:637,3\n447#1:641\n447#1:642,3\n451#1:645\n451#1:646,2\n452#1:648\n452#1:649,3\n451#1:652\n454#1:653\n454#1:654,3\n475#1:657,7\n479#1:664,7\n488#1:671,7\n*E\n"})
/* loaded from: classes4.dex */
public final class a3 extends AndroidViewModel {

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public static final a f21905v = new a(null);

    /* renamed from: w, reason: collision with root package name */
    public static final int f21906w = 8;

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public static final String f21907x = "WordPlanViewModel";

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public static final String f21908y = "user.last_vocab_test_time";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final og.t f21909a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final be.i f21910b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<Object>> f21911c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<String> f21912d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<String> f21913e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<AdLunchWechatProgram> f21914f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f21915g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f21916h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21917i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final LiveData<LearnCardStatus> f21918j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f21919k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<fe.k> f21920l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f21921m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final yz.c0 f21922n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final Observer<String> f21923o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public String f21924p;

    /* renamed from: q, reason: collision with root package name */
    @m80.l
    public n40.h f21925q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final b f21926r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<String> f21927s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final LiveData<String> f21928t;

    /* renamed from: u, reason: collision with root package name */
    @m80.l
    public qb0.h f21929u;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordPlanViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanViewModel.kt\ncom/baicizhan/main/home/plan/WordPlanViewModel$TaskParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,635:1\n1#2:636\n*E\n"})
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final yz.c0 f21930a = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.plan.d3
            @Override // x00.a
            public final Object invoke() {
                nc.a m11;
                m11 = a3.b.m();
                return m11;
            }
        });

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final n40.a f21931b = n40.g.b(false, 1, null);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21933a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f21934b;

            static {
                int[] iArr = new int[NewUserGuideOrderMgr.ShowType.values().length];
                try {
                    iArr[NewUserGuideOrderMgr.ShowType.Praise.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NewUserGuideOrderMgr.ShowType.Remind.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f21933a = iArr;
                int[] iArr2 = new int[LearnCardStatus.values().length];
                try {
                    iArr2[LearnCardStatus.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[LearnCardStatus.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[LearnCardStatus.CAKE_ALL_KILL_TODAY.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[LearnCardStatus.CAKE_ALL_FINISHING_LEARNING_TODAY.ordinal()] = 4;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[LearnCardStatus.ALL_KILLED_TODAY.ordinal()] = 5;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[LearnCardStatus.ALL_FINISH_REVIEW_TODAY.ordinal()] = 6;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[LearnCardStatus.ALL_FINISHING_LEARNING_TODAY.ordinal()] = 7;
                } catch (NoSuchFieldError unused9) {
                }
                f21934b = iArr2;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.main.home.plan.a3$b$b, reason: collision with other inner class name */
        public static final class C0309b implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AtomicLong f21935a;

            public C0309b(AtomicLong atomicLong) {
                this.f21935a = atomicLong;
            }

            @Override // wb0.a
            public final void call() {
                this.f21935a.set(System.currentTimeMillis());
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c implements x00.l<NotifyResult, yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a3 f21936a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j00.c<NotifyResult> f21937b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AtomicLong f21938c;

            /* JADX WARN: Multi-variable type inference failed */
            public c(a3 a3Var, j00.c<? super NotifyResult> cVar, AtomicLong atomicLong) {
                this.f21936a = a3Var;
                this.f21937b = cVar;
                this.f21938c = atomicLong;
            }

            public final void a(NotifyResult notifyResult) {
                Notify notify = notifyResult.notify;
                if (notify != null) {
                    AtomicLong atomicLong = this.f21938c;
                    b.j(notify);
                    long longValue = atomicLong.longValue();
                    String aid = notify.aid;
                    kotlin.jvm.internal.g0.o(aid, "aid");
                    b.k(true, longValue, aid);
                }
                Notify notify2 = notifyResult.advNotify;
                if (notify2 != null) {
                    AtomicLong atomicLong2 = this.f21938c;
                    b.j(notify2);
                    long longValue2 = atomicLong2.longValue();
                    String aid2 = notify2.aid;
                    kotlin.jvm.internal.g0.o(aid2, "aid");
                    b.k(true, longValue2, aid2);
                }
                a3 a3Var = this.f21936a;
                String service_url = notifyResult.service_url;
                kotlin.jvm.internal.g0.o(service_url, "service_url");
                a3Var.f21924p = service_url;
                j00.c<NotifyResult> cVar = this.f21937b;
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m6308constructorimpl(notifyResult));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ yz.g2 invoke(NotifyResult notifyResult) {
                a(notifyResult);
                return yz.g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class d<T> implements wb0.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AtomicLong f21939a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j00.c<NotifyResult> f21940b;

            /* JADX WARN: Multi-variable type inference failed */
            public d(AtomicLong atomicLong, j00.c<? super NotifyResult> cVar) {
                this.f21939a = atomicLong;
                this.f21940b = cVar;
            }

            @Override // wb0.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void call(Throwable th2) {
                b.k(false, this.f21939a.longValue(), "null");
                j00.c<NotifyResult> cVar = this.f21940b;
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m6308constructorimpl(null));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.plan.WordPlanViewModel$TaskParser", f = "WordPlanViewModel.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11}, l = {R.styleable.Theme_drawable_tab_review, R.styleable.Theme_drawable_test_nodate, 244, R.styleable.Theme_drawable_walk_sound4, 253, 258, 275, 286, 299, 307, 339, 349}, m = "parsePrioritizedTasks", n = {"checker", "onDone", "onUpdate", "codeSharePending", "roleValue", "newUserOn", "checker", "onDone", "onUpdate", "codeSharePending", "roleValue", "newUserOn", "checker", "onDone", "onUpdate", "codeSharePending", "roleValue", "newUserOn", "checker", "onDone", "onUpdate", "codeSharePending", "roleValue", "notifyResult", "$this$parsePrioritizedTasks_u24lambda_u243", "newUserOn", "$i$a$-run-WordPlanViewModel$TaskParser$parsePrioritizedTasks$5", "checker", "onDone", "onUpdate", "codeSharePending", "roleValue", "notifyResult", "$this$parsePrioritizedTasks_u24lambda_u244", "newUserOn", "$i$a$-run-WordPlanViewModel$TaskParser$parsePrioritizedTasks$6", "checker", "onDone", "onUpdate", "codeSharePending", "roleValue", "notifyResult", "newUserOn", "checker", "onDone", "onUpdate", "codeSharePending", "roleValue", "newUserOn", "checker", "onDone", "onUpdate", "codeSharePending", "roleValue", "it", "newUserOn", "$i$a$-let-WordPlanViewModel$TaskParser$parsePrioritizedTasks$8", "checker", "onDone", "onUpdate", "codeSharePending", "roleValue", "newUserOn", "checker", "onDone", "onUpdate", "codeSharePending", "roleValue", "newUserOn", "checker", "onDone", "onUpdate", "codeSharePending", "roleValue", "newUserOn", "lastVocabTestTime", "now", "checker", "onDone", "onUpdate", "codeSharePending", "roleValue", "newUserOn"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 1)
        public static final class e extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f21941a;

            /* renamed from: b, reason: collision with root package name */
            public Object f21942b;

            /* renamed from: c, reason: collision with root package name */
            public Object f21943c;

            /* renamed from: d, reason: collision with root package name */
            public Object f21944d;

            /* renamed from: e, reason: collision with root package name */
            public Object f21945e;

            /* renamed from: f, reason: collision with root package name */
            public Object f21946f;

            /* renamed from: g, reason: collision with root package name */
            public Object f21947g;

            /* renamed from: h, reason: collision with root package name */
            public int f21948h;

            /* renamed from: i, reason: collision with root package name */
            public int f21949i;

            /* renamed from: j, reason: collision with root package name */
            public long f21950j;

            /* renamed from: k, reason: collision with root package name */
            public long f21951k;

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f21952l;

            /* renamed from: n, reason: collision with root package name */
            public int f21954n;

            public e(j00.c<? super e> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @m80.l
            public final Object invokeSuspend(@m80.k Object obj) {
                this.f21952l = obj;
                this.f21954n |= Integer.MIN_VALUE;
                return b.this.o(null, null, null, this);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.plan.WordPlanViewModel$TaskParser$parsePrioritizedTasks$3$1", f = "WordPlanViewModel.kt", i = {}, l = {R.styleable.Theme_drawable_syncview_update, R.styleable.Theme_drawable_syncview_update}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class f extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f21955a;

            /* renamed from: b, reason: collision with root package name */
            public int f21956b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x00.p<PrioritizedTask, j00.c<? super yz.g2>, Object> f21957c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f21958d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f21959e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public f(x00.p<? super PrioritizedTask, ? super j00.c<? super yz.g2>, ? extends Object> pVar, b bVar, String str, j00.c<? super f> cVar) {
                super(2, cVar);
                this.f21957c = pVar;
                this.f21958d = bVar;
                this.f21959e = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new f(this.f21957c, this.f21958d, this.f21959e, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((f) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
            
                if (r1.invoke(r4, r5) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
            
                if (r6 == r0) goto L19;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r5.f21956b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.e.n(r6)
                    goto L50
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1a:
                    java.lang.Object r1 = r5.f21955a
                    x00.p r1 = (x00.p) r1
                    kotlin.e.n(r6)
                    goto L36
                L22:
                    kotlin.e.n(r6)
                    x00.p<com.baicizhan.main.home.plan.PrioritizedTask, j00.c<? super yz.g2>, java.lang.Object> r1 = r5.f21957c
                    com.baicizhan.main.home.plan.a3$b r6 = r5.f21958d
                    java.lang.String r4 = r5.f21959e
                    r5.f21955a = r1
                    r5.f21956b = r3
                    java.lang.Object r6 = com.baicizhan.main.home.plan.a3.b.h(r6, r4, r5)
                    if (r6 != r0) goto L36
                    goto L4f
                L36:
                    com.baicizhan.online.user_assistant_api.ClipboardResp r6 = (com.baicizhan.online.user_assistant_api.ClipboardResp) r6
                    if (r6 != 0) goto L3d
                    yz.g2 r6 = yz.g2.f100423a
                    return r6
                L3d:
                    java.lang.String r3 = r5.f21959e
                    com.baicizhan.main.home.plan.PrioritizedTask$CodeShare r4 = new com.baicizhan.main.home.plan.PrioritizedTask$CodeShare
                    r4.<init>(r6, r3)
                    r6 = 0
                    r5.f21955a = r6
                    r5.f21956b = r2
                    java.lang.Object r6 = r1.invoke(r4, r5)
                    if (r6 != r0) goto L50
                L4f:
                    return r0
                L50:
                    yz.g2 r6 = yz.g2.f100423a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.a3.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class g extends FunctionReferenceImpl implements x00.a<yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a3 f21960a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x00.l<PrioritizedTask, yz.g2> f21961b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public g(a3 a3Var, x00.l<? super PrioritizedTask, yz.g2> lVar) {
                super(0, g0.a.class, "showGuideIfNeed", "parsePrioritizedTasks$showGuideIfNeed(Lcom/baicizhan/main/home/plan/WordPlanViewModel;Lkotlin/jvm/functions/Function1;)V", 0);
                this.f21960a = a3Var;
                this.f21961b = lVar;
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ yz.g2 invoke() {
                invoke2();
                return yz.g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                b.s(this.f21960a, this.f21961b);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class h extends FunctionReferenceImpl implements x00.a<yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a3 f21962a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x00.l<PrioritizedTask, yz.g2> f21963b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public h(a3 a3Var, x00.l<? super PrioritizedTask, yz.g2> lVar) {
                super(0, g0.a.class, "showGuideIfNeed", "parsePrioritizedTasks$showGuideIfNeed(Lcom/baicizhan/main/home/plan/WordPlanViewModel;Lkotlin/jvm/functions/Function1;)V", 0);
                this.f21962a = a3Var;
                this.f21963b = lVar;
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ yz.g2 invoke() {
                invoke2();
                return yz.g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                b.s(this.f21962a, this.f21963b);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.plan.WordPlanViewModel$TaskParser$parsePrioritizedTasks$showGuideIfNeed$2", f = "WordPlanViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class i extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f21964a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x00.l<PrioritizedTask, yz.g2> f21965b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a3 f21966c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public i(x00.l<? super PrioritizedTask, yz.g2> lVar, a3 a3Var, j00.c<? super i> cVar) {
                super(2, cVar);
                this.f21965b = lVar;
                this.f21966c = a3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new i(this.f21965b, this.f21966c, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((i) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f21964a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                this.f21965b.invoke(PrioritizedTask.MainGuider.f21804j);
                this.f21966c.f21917i = false;
                return yz.g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.plan.WordPlanViewModel$TaskParser", f = "WordPlanViewModel.kt", i = {0}, l = {204}, m = "parseShareCode", n = {"shareCode"}, s = {"L$0"}, v = 1)
        public static final class j extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f21967a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f21968b;

            /* renamed from: d, reason: collision with root package name */
            public int f21970d;

            public j(j00.c<? super j> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @m80.l
            public final Object invokeSuspend(@m80.k Object obj) {
                this.f21968b = obj;
                this.f21970d |= Integer.MIN_VALUE;
                return b.this.t(null, this);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.plan.WordPlanViewModel$TaskParser$parseShareCode$clipResult$1", f = "WordPlanViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class k extends SuspendLambda implements x00.p<c40.r0, j00.c<? super Result<? extends ClipboardResp>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f21971a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f21972b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(String str, j00.c<? super k> cVar) {
                super(2, cVar);
                this.f21972b = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new k(this.f21972b, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super Result<? extends ClipboardResp>> cVar) {
                return ((k) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f21971a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                try {
                    ClipboardResp analyze_clipboard = ((UserAssistantApiService.Client) new com.baicizhan.client.business.thrift.l("/rpc/assistant").a()).analyze_clipboard(this.f21972b);
                    Result.a aVar = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(analyze_clipboard);
                } catch (Exception e11) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(e11));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }
        }

        public b() {
        }

        public static final void j(Notify notify) {
            HashMap hashMap = new HashMap();
            hashMap.put(ma.b.f72900e, gi.k.o(notify));
            kotlin.jvm.internal.w0 w0Var = kotlin.jvm.internal.w0.f67050a;
            String format = String.format("{\"%s\":\"%s\"}", Arrays.copyOf(new Object[]{"adv_id", gi.k.o(notify)}, 2));
            kotlin.jvm.internal.g0.o(format, "format(...)");
            hashMap.put("extra_info", format);
            yz.g2 g2Var = yz.g2.f100423a;
            ma.l.b("notify-popup", ma.a.U, hashMap);
        }

        public static final void k(boolean z11, long j11, String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("adv_id", str);
            hashMap.put(ma.b.f72906g, Integer.valueOf(z11 ? 1 : 0));
            hashMap.put(ma.b.f72903f, Long.valueOf(System.currentTimeMillis() - j11));
            yz.g2 g2Var = yz.g2.f100423a;
            ma.l.e("notify-popup", ma.a.X, hashMap);
        }

        public static final nc.a m() {
            return nc.b.b();
        }

        public static final yz.g2 p() {
            va.g.i("请求剪贴板以识别口令", 0);
            return yz.g2.f100423a;
        }

        public static final yz.g2 q(Ref.BooleanRef booleanRef, a3 a3Var, x00.p pVar, b bVar, String it) {
            kotlin.jvm.internal.g0.p(it, "it");
            booleanRef.element = true;
            c40.k.f(ViewModelKt.getViewModelScope(a3Var), null, null, new f(pVar, bVar, it, null), 3, null);
            return yz.g2.f100423a;
        }

        public static final void r() {
            ma.l.b(ma.t.f73005d, "first-finish-hint", null);
        }

        public static final void s(a3 a3Var, x00.l<? super PrioritizedTask, yz.g2> lVar) {
            be.h o11 = a3Var.f21910b.o();
            if (o11 == null || !be.h.d(o11, false, new h(a3Var, lVar), 1, null)) {
                c40.k.f(ViewModelKt.getViewModelScope(a3Var), null, null, new i(lVar, a3Var, null), 3, null);
            }
        }

        public final Object i(j00.c<? super NotifyResult> cVar) {
            String d11;
            a3 a3Var = a3.this;
            j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
            AtomicLong atomicLong = new AtomicLong();
            Application application = a3Var.getApplication();
            UserRecord p11 = q9.x.r().p();
            if (p11 == null || (d11 = p11.getToken()) == null) {
                d11 = i9.m.d();
            }
            ha.c.b(application, d11).N1(new C0309b(atomicLong)).e6(3000L, TimeUnit.MILLISECONDS).I3(tb0.a.a()).u5(new e(new c(a3Var, gVar, atomicLong)), new d(atomicLong, gVar));
            Object b11 = gVar.b();
            if (b11 == kotlin.coroutines.intrinsics.b.l()) {
                l00.f.c(cVar);
            }
            return b11;
        }

        public final nc.a l() {
            return (nc.a) this.f21930a.getValue();
        }

        public final boolean n() {
            if (q9.x.r().a0() && kotlin.jvm.internal.g0.g(ch.m.f8648a.a(), e.d.f19308d) && Standard_extKt.anyOf(new pg.l0().d().getStatus(), new LearnCardStatus[]{LearnCardStatus.CAKE_ALL_KILL_TODAY, LearnCardStatus.CAKE_ALL_FINISHING_LEARNING_TODAY, LearnCardStatus.ALL_KILLED_TODAY, LearnCardStatus.ALL_FINISH_REVIEW_TODAY, LearnCardStatus.ALL_FINISHING_LEARNING_TODAY})) {
                BookRecord k11 = q9.x.r().k();
                if (k11 != null ? pg.x0.f80512a.e(k11.bookId) : false) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:123:0x02e9, code lost:
        
            if (r11.invoke(r8, r3) == r4) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:149:0x0209, code lost:
        
            if (r20.invoke(r5, r3) == r4) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:152:0x023d, code lost:
        
            if (r20.invoke(r5, r3) == r4) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0371, code lost:
        
            if (r15.invoke(r5, r3) == r4) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x03f1, code lost:
        
            if (r15.invoke(r1, r3) == r4) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0469, code lost:
        
            if (r15.invoke(r5, r3) == r4) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x04d5, code lost:
        
            if (r15.invoke(r1, r3) == r4) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x051c, code lost:
        
            if (r15.invoke(r1, r3) == r4) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x05f0, code lost:
        
            if (r15.invoke(r0, r3) == r4) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0662, code lost:
        
            if (r15.invoke(r0, r3) == r4) goto L179;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x0633  */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0613  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x028c  */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0331  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0337  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0378  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x03c3  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0403  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x047a  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x052d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x060a  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0630  */
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object o(@m80.k x00.a<? extends com.baicizhan.main.home.plan.PrioritizedTask> r18, @m80.k x00.l<? super com.baicizhan.main.home.plan.PrioritizedTask, yz.g2> r19, @m80.k final x00.p<? super com.baicizhan.main.home.plan.PrioritizedTask, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r20, @m80.k j00.c<? super yz.g2> r21) {
            /*
                Method dump skipped, instructions count: 1688
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.a3.b.o(x00.a, x00.l, x00.p, j00.c):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object t(java.lang.String r8, j00.c<? super com.baicizhan.online.user_assistant_api.ClipboardResp> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.baicizhan.main.home.plan.a3.b.j
                if (r0 == 0) goto L13
                r0 = r9
                com.baicizhan.main.home.plan.a3$b$j r0 = (com.baicizhan.main.home.plan.a3.b.j) r0
                int r1 = r0.f21970d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f21970d = r1
                goto L18
            L13:
                com.baicizhan.main.home.plan.a3$b$j r0 = new com.baicizhan.main.home.plan.a3$b$j
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f21968b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f21970d
                r3 = 0
                r4 = 0
                java.lang.String r5 = "WordPlanViewModel"
                r6 = 1
                if (r2 == 0) goto L39
                if (r2 != r6) goto L31
                java.lang.Object r8 = r0.f21967a
                java.lang.String r8 = (java.lang.String) r8
                kotlin.e.n(r9)
                goto L5b
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                kotlin.e.n(r9)
                java.lang.String r9 = "start analyze share code"
                java.lang.Object[] r2 = new java.lang.Object[r4]
                qb.c.b(r5, r9, r2)
                c40.m0 r9 = c40.h1.c()
                com.baicizhan.main.home.plan.a3$b$k r2 = new com.baicizhan.main.home.plan.a3$b$k
                r2.<init>(r8, r3)
                java.lang.Object r8 = l00.k.a(r8)
                r0.f21967a = r8
                r0.f21970d = r6
                java.lang.Object r9 = c40.i.h(r9, r2, r0)
                if (r9 != r1) goto L5b
                return r1
            L5b:
                kotlin.Result r9 = (kotlin.Result) r9
                java.lang.Object r8 = r9.m6317unboximpl()
                java.lang.String r9 = kotlin.Result.m6316toStringimpl(r8)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "analyze clipboard result: "
                r0.append(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                java.lang.Object[] r0 = new java.lang.Object[r4]
                qb.c.b(r5, r9, r0)
                boolean r9 = kotlin.Result.m6314isFailureimpl(r8)
                if (r9 == 0) goto L82
                return r3
            L82:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.a3.b.t(java.lang.String, j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends qb0.g<Integer> {
        public c() {
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            a3.this.H0().postValue(100);
            if (th2 instanceof BookDataSource.SelectBookException) {
                va.g.g(R.string.learn_tab_upgrade_book_fail, 1);
            } else {
                pg.u0.f80487a.s().postValue(Boolean.TRUE);
            }
            qb.c.c(a3.f21907x, "", th2);
        }

        @Override // qb0.g
        public void onStart() {
            a3.this.H0().postValue(0);
        }

        @Override // qb0.c
        public void onNext(Integer num) {
            a3.this.H0().postValue(100);
            pg.u0.f80487a.s().postValue(Boolean.TRUE);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.WordPlanViewModel$onResume$1", f = "WordPlanViewModel.kt", i = {}, l = {503}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21974a;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return a3.this.new d(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f21974a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                n40.h hVar = a3.this.f21925q;
                if (hVar != null) {
                    this.f21974a = 1;
                    if (hVar.a(this) == l11) {
                        return l11;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            a3.this.f21925q = null;
            if (!a3.this.f21917i) {
                a3.this.X0();
                a3.this.f21909a.r0();
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements wb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f21976a;

        public e(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f21976a = function;
        }

        @Override // wb0.b
        public final /* synthetic */ void call(Object obj) {
            this.f21976a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(@m80.k Application app2, @m80.k og.t learnVM, @m80.k be.i retriever) {
        super(app2);
        kotlin.jvm.internal.g0.p(app2, "app");
        kotlin.jvm.internal.g0.p(learnVM, "learnVM");
        kotlin.jvm.internal.g0.p(retriever, "retriever");
        this.f21909a = learnVM;
        this.f21910b = retriever;
        this.f21911c = new MutableLiveData<>();
        this.f21912d = new ClickProtectedEvent<>();
        this.f21913e = new ClickProtectedEvent<>();
        this.f21914f = new ClickProtectedEvent<>();
        this.f21915g = new MutableLiveData<>();
        this.f21916h = new MutableLiveData<>();
        this.f21918j = learnVM.U();
        this.f21919k = learnVM.m0();
        this.f21920l = new MutableLiveData<>();
        this.f21921m = new MutableLiveData<>();
        this.f21922n = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.plan.r2
            @Override // x00.a
            public final Object invoke() {
                nc.a J0;
                J0 = a3.J0();
                return J0;
            }
        });
        Observer<String> observer = new Observer() { // from class: com.baicizhan.main.home.plan.s2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a3.c0(a3.this, (String) obj);
            }
        };
        this.f21923o = observer;
        this.f21924p = "";
        this.f21926r = new b();
        SingleLiveEvent<String> singleLiveEvent = new SingleLiveEvent<>();
        this.f21927s = singleLiveEvent;
        this.f21928t = singleLiveEvent;
        learnVM.N().observeForever(observer);
    }

    public static final nc.a J0() {
        return zg.b.f102640a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.baicizhan.main.model.data.GoldenNavigationAndTrainingConfig M0(com.baicizhan.main.home.plan.a3 r4, java.lang.String r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L28
            int r1 = r5.length()
            if (r1 != 0) goto La
            goto L28
        La:
            zg.b r1 = zg.b.f102640a     // Catch: java.lang.Exception -> L11
            com.baicizhan.main.model.data.GoldenNavigationAndTrainingConfig r4 = r1.c(r5)     // Catch: java.lang.Exception -> L11
            goto L29
        L11:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = " - "
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "WordPlanViewModel"
            qb.c.c(r1, r4, r5)
        L28:
            r4 = r0
        L29:
            if (r4 == 0) goto L72
            java.util.List r5 = r4.getGoldenItems()
            int r5 = r5.size()
            r1 = 4
            if (r5 != r1) goto L72
            java.util.List r5 = r4.getGoldenItems()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L40:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r5.next()
            r2 = r1
            com.baicizhan.main.model.data.GoldenItem r2 = (com.baicizhan.main.model.data.GoldenItem) r2
            java.lang.String r3 = r2.getIcon()
            int r3 = r3.length()
            if (r3 != 0) goto L58
            goto L6f
        L58:
            java.lang.String r3 = r2.getName()
            int r3 = r3.length()
            if (r3 != 0) goto L63
            goto L6f
        L63:
            java.lang.String r2 = r2.getIntent()
            int r2 = r2.length()
            if (r2 != 0) goto L40
            goto L6f
        L6e:
            r1 = r0
        L6f:
            if (r1 != 0) goto L72
            r0 = r4
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.a3.M0(com.baicizhan.main.home.plan.a3, java.lang.String):com.baicizhan.main.model.data.GoldenNavigationAndTrainingConfig");
    }

    public static final GoldenNavigationAndTrainingConfig N0(x00.l lVar, Object obj) {
        return (GoldenNavigationAndTrainingConfig) lVar.invoke(obj);
    }

    public static final GoldenNavigation O0(a3 a3Var, GoldenNavigationAndTrainingConfig goldenNavigationAndTrainingConfig) {
        return a3Var.I0(goldenNavigationAndTrainingConfig);
    }

    public static final GoldenNavigation P0(x00.l lVar, Object obj) {
        return (GoldenNavigation) lVar.invoke(obj);
    }

    public static final yz.g2 Q0(GoldenNavigation goldenNavigation) {
        qb.c.i(f21907x, "local: " + (goldenNavigation != null), new Object[0]);
        return yz.g2.f100423a;
    }

    public static final void R0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final GoldenNavigation S0(Throwable th2) {
        qb.c.h(f21907x, "error:", th2);
        return null;
    }

    public static final GoldenNavigation T0(x00.l lVar, Object obj) {
        return (GoldenNavigation) lVar.invoke(obj);
    }

    public static final Boolean Y0(a3 a3Var, BottomAdvInfos bottomAdvInfos, WordBanner wordBanner) {
        qb.c.b(f21907x, "aditems:" + bottomAdvInfos, new Object[0]);
        MutableLiveData<List<Object>> mutableLiveData = a3Var.f21911c;
        kotlin.jvm.internal.g0.m(bottomAdvInfos);
        boolean j11 = k3.j(mutableLiveData, bottomAdvInfos);
        boolean o11 = k3.o(a3Var.f21911c, wordBanner);
        if (o11) {
            k3.t(a3Var.f21911c);
        }
        return Boolean.valueOf(j11 || o11);
    }

    public static final void Z0(a3 a3Var) {
        qb.c.i(f21907x, "ad refresh complete", new Object[0]);
        a3Var.f21915g.postValue(Boolean.TRUE);
    }

    public static final Integer a0(a3 a3Var, Integer num) {
        if (num == null) {
            return null;
        }
        a3Var.f21921m.postValue(num);
        return num;
    }

    public static final Boolean a1(x00.p pVar, Object obj, Object obj2) {
        return (Boolean) pVar.invoke(obj, obj2);
    }

    public static final Integer b0(x00.l lVar, Object obj) {
        return (Integer) lVar.invoke(obj);
    }

    public static final void c0(a3 a3Var, String it) {
        kotlin.jvm.internal.g0.p(it, "it");
        a3Var.Z();
    }

    public static final Boolean c1(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final yz.g2 d1(com.baicizhan.main.home.plan.a3 r2, java.lang.Boolean r3) {
        /*
            androidx.lifecycle.MutableLiveData<java.util.List<java.lang.Object>> r3 = r2.f21911c
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L22
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r3.next()
            boolean r1 = r0 instanceof com.baicizhan.main.home.plan.data.WordBanner
            if (r1 == 0) goto L10
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 != 0) goto L2a
        L22:
            og.t r2 = r2.f21909a
            r3 = 0
            r2.F0(r3)
            yz.g2 r2 = yz.g2.f100423a
        L2a:
            yz.g2 r2 = yz.g2.f100423a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.a3.d1(com.baicizhan.main.home.plan.a3, java.lang.Boolean):yz.g2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        r1 = java.lang.Boolean.TRUE;
        r4 = r19.enable;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        if (r4 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        r2 = a00.h0.J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d3, code lost:
    
        if (r19.enable != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d5, code lost:
    
        r5 = a00.h0.J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x013d, code lost:
    
        r0 = r19.banners;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x013f, code lost:
    
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0141, code lost:
    
        r0 = r0;
        r3 = new java.util.ArrayList(a00.i0.d0(r0, 10));
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0154, code lost:
    
        if (r0.hasNext() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0156, code lost:
    
        r8 = (com.baicizhan.online.user_study_api.TrainPageBannerItem) r0.next();
        r10 = r8.aid;
        kotlin.jvm.internal.g0.o(r10, "aid");
        r11 = r8.img;
        kotlin.jvm.internal.g0.o(r11, "img");
        r12 = r8.action;
        r8 = r8.link;
        kotlin.jvm.internal.g0.o(r8, "link");
        r3.add(new zg.h(r10, r11, r12, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0178, code lost:
    
        r0 = new com.baicizhan.main.model.data.GoldenNavigationAndTrainingConfig(r4, r2, r5, r3);
        zg.b.f102640a.e(r18.x0(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x018b, code lost:
    
        return new kotlin.Pair(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        r5 = r19.getResources();
        kotlin.jvm.internal.g0.o(r5, "getResources(...)");
        r5 = r5;
        r9 = new java.util.ArrayList(a00.i0.d0(r5, 10));
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        if (r5.hasNext() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f8, code lost:
    
        r10 = (com.baicizhan.online.user_study_api.TrainPageResource) r5.next();
        r11 = r10.module_name;
        kotlin.jvm.internal.g0.o(r11, "module_name");
        r10 = r10.items;
        kotlin.jvm.internal.g0.o(r10, "items");
        r10 = r10;
        r12 = new java.util.ArrayList(a00.i0.d0(r10, 10));
        r10 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011f, code lost:
    
        if (r10.hasNext() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0121, code lost:
    
        r12.add(java.lang.Integer.valueOf(((com.baicizhan.online.user_study_api.ModuleResourceType) r10.next()).getValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0133, code lost:
    
        r9.add(new com.baicizhan.main.model.data.TrainingConfig(r11, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013c, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        r9 = r19.getOuterResource();
        kotlin.jvm.internal.g0.o(r9, "getOuterResource(...)");
        r9 = r9;
        r2 = new java.util.ArrayList(a00.i0.d0(r9, 10));
        r9 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
    
        if (r9.hasNext() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a8, code lost:
    
        r10 = (com.baicizhan.online.user_study_api.ResourceItem) r9.next();
        r12 = r10.aid;
        r13 = r10.img;
        kotlin.jvm.internal.g0.o(r13, "img");
        r14 = r10.title;
        kotlin.jvm.internal.g0.o(r14, "title");
        r11 = r10.action;
        r15 = r10.link;
        kotlin.jvm.internal.g0.o(r15, "link");
        r2.add(new com.baicizhan.main.model.data.GoldenItem(r12, r13, r14, r10.type, r11, r15));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair e0(com.baicizhan.main.home.plan.a3 r18, com.baicizhan.online.user_study_api.TrainPageResources r19) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.a3.e0(com.baicizhan.main.home.plan.a3, com.baicizhan.online.user_study_api.TrainPageResources):kotlin.Pair");
    }

    public static final void e1(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final Pair f0(x00.l lVar, Object obj) {
        return (Pair) lVar.invoke(obj);
    }

    public static final yz.g2 f1(a3 a3Var, Boolean bool) {
        qb.c.i(f21907x, "%s", String.valueOf(a3Var.f21911c.getValue()));
        MutableLiveData<List<Object>> mutableLiveData = a3Var.f21911c;
        mutableLiveData.postValue(mutableLiveData.getValue());
        return yz.g2.f100423a;
    }

    public static final Pair g0(a3 a3Var, Pair pair) {
        return new Pair(pair.getFirst(), a3Var.I0((GoldenNavigationAndTrainingConfig) pair.getSecond()));
    }

    public static final void g1(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final Pair h0(x00.l lVar, Object obj) {
        return (Pair) lVar.invoke(obj);
    }

    public static final void h1(a3 a3Var, Throwable th2) {
        qb.c.c(f21907x, "", th2);
        a3Var.f21915g.postValue(Boolean.TRUE);
    }

    public static final yz.g2 i0(Pair pair) {
        qb.c.i(f21907x, "network: " + (pair != null), new Object[0]);
        return yz.g2.f100423a;
    }

    public static final void j0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final Pair j1(WordBanner wordBanner, GoldenNavigation goldenNavigation) {
        return new Pair(wordBanner, goldenNavigation);
    }

    public static final yz.g2 k0(a3 a3Var, Pair pair) {
        Integer num;
        boolean booleanValue = ((Boolean) pair.component1()).booleanValue();
        GoldenNavigation goldenNavigation = (GoldenNavigation) pair.component2();
        List<Object> value = a3Var.f21911c.getValue();
        if (value == null) {
            value = new ArrayList<>();
        }
        int i11 = 0;
        if (value.isEmpty()) {
            qb.c.i(f21907x, "cur null", new Object[0]);
            return yz.g2.f100423a;
        }
        qb.c.i(f21907x, "configuration [" + goldenNavigation + "]", new Object[0]);
        if (goldenNavigation != null) {
            Iterator<Object> it = value.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                Object next = it.next();
                if ((next instanceof mg.h) || (next instanceof GoldenNavigation)) {
                    break;
                }
                i12++;
            }
            Integer valueOf = Integer.valueOf(i12);
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                value.remove(intValue);
                value.add(intValue, goldenNavigation);
                a3Var.f21911c.setValue(value);
            } else {
                Iterator<Object> it2 = value.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (it2.next() instanceof og.t) {
                        break;
                    }
                    i11++;
                }
                Integer valueOf2 = Integer.valueOf(i11);
                num = valueOf2.intValue() != -1 ? valueOf2 : null;
                if (num != null) {
                    int intValue2 = num.intValue();
                    if (intValue2 < value.size() - 1) {
                        value.add(intValue2 + 1, goldenNavigation);
                    } else {
                        value.add(goldenNavigation);
                    }
                    a3Var.f21911c.setValue(value);
                }
            }
        } else if (booleanValue) {
            Iterator<Object> it3 = value.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (it3.next() instanceof GoldenNavigation) {
                    break;
                }
                i11++;
            }
            Integer valueOf3 = Integer.valueOf(i11);
            num = valueOf3.intValue() != -1 ? valueOf3 : null;
            if (num != null) {
                int intValue3 = num.intValue();
                value.remove(intValue3);
                mg.h Y = a3Var.Y();
                if (Y != null) {
                    value.add(intValue3, Y);
                    a3Var.f21911c.setValue(value);
                }
            }
        }
        return yz.g2.f100423a;
    }

    public static final Pair k1(x00.p pVar, Object obj, Object obj2) {
        return (Pair) pVar.invoke(obj, obj2);
    }

    public static final yz.g2 l1(a3 a3Var, Pair pair) {
        WordBanner wordBanner = (WordBanner) pair.component1();
        Object obj = (GoldenNavigation) pair.component2();
        qb.c.b(f21907x, "init: " + (wordBanner != null) + org.junit.jupiter.api.j2.O + (obj != null), new Object[0]);
        MutableLiveData<List<Object>> mutableLiveData = a3Var.f21911c;
        ArrayList arrayList = new ArrayList();
        if (wordBanner != null) {
            k3.v(wordBanner);
            arrayList.add(wordBanner);
        }
        arrayList.add(a3Var.f21909a);
        if (obj == null) {
            obj = a3Var.Y();
        }
        if (obj != null) {
            arrayList.add(obj);
        }
        mutableLiveData.setValue(arrayList);
        n40.h hVar = a3Var.f21925q;
        if (hVar != null) {
            hVar.release();
        }
        a3Var.d0();
        return yz.g2.f100423a;
    }

    public static final void m0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void m1(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void n0(Throwable th2) {
        qb.c.c(f21907x, "golden configuration:", th2);
    }

    public static final void n1(a3 a3Var, Throwable th2) {
        qb.c.c(f21907x, "", th2);
        a3Var.d0();
    }

    @m80.k
    public final String A0() {
        return this.f21924p;
    }

    @m80.k
    public final LiveData<Object> B0() {
        return this.f21909a.R();
    }

    @m80.k
    public final LiveData<Boolean> C0() {
        return this.f21909a.Z();
    }

    @m80.k
    public final MutableLiveData<fe.k> D0() {
        return this.f21920l;
    }

    @m80.k
    public final LiveData<Boolean> E0() {
        return this.f21916h;
    }

    @m80.k
    public final LiveData<Pair<BookUpdateInfos.BookUpdateInfo, String>> F0() {
        return this.f21909a.b0();
    }

    @m80.k
    public final ClickProtectedEvent G0() {
        return this.f21909a.c0();
    }

    @m80.k
    public final MutableLiveData<Integer> H0() {
        return this.f21921m;
    }

    public final GoldenNavigation I0(GoldenNavigationAndTrainingConfig goldenNavigationAndTrainingConfig) {
        Bitmap bitmap;
        zg.a bVar;
        Bitmap bitmap2;
        if (goldenNavigationAndTrainingConfig == null || !goldenNavigationAndTrainingConfig.getOn() || com.baicizhan.base.a.a(getApplication())) {
            return null;
        }
        List<GoldenItem> goldenItems = goldenNavigationAndTrainingConfig.getGoldenItems();
        ArrayList arrayList = new ArrayList(a00.i0.d0(goldenItems, 10));
        for (GoldenItem goldenItem : goldenItems) {
            if (goldenItem.getItemType() == 1) {
                int aid = goldenItem.getAid();
                Resources resources = getApplication().getResources();
                try {
                    bitmap2 = hc.c.p(goldenItem.getIcon()).get();
                } catch (Exception e11) {
                    qb.c.c(f21907x, "nav icon error", e11);
                    bitmap2 = hc.c.m(R.drawable.ic_golden_navigation_placeholder).get();
                }
                bVar = new a.C1395a(aid, new BitmapDrawable(resources, bitmap2), goldenItem.getType(), goldenItem.getIntent());
            } else {
                int aid2 = goldenItem.getAid();
                Resources resources2 = getApplication().getResources();
                try {
                    bitmap = hc.c.p(goldenItem.getIcon()).get();
                } catch (Exception e12) {
                    qb.c.c(f21907x, "nav icon error", e12);
                    bitmap = hc.c.m(R.drawable.ic_golden_navigation_placeholder).get();
                }
                bVar = new a.b(aid2, new BitmapDrawable(resources2, bitmap), goldenItem.getName(), goldenItem.getType(), goldenItem.getIntent());
            }
            arrayList.add(bVar);
        }
        return new GoldenNavigation(arrayList);
    }

    @m80.k
    public final LiveData<Boolean> K0() {
        return this.f21919k;
    }

    public final rx.c<GoldenNavigation> L0() {
        rx.c M2 = rx.c.M2(zg.b.f102640a.b(x0()));
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.home.plan.v2
            @Override // x00.l
            public final Object invoke(Object obj) {
                GoldenNavigationAndTrainingConfig M0;
                M0 = a3.M0(a3.this, (String) obj);
                return M0;
            }
        };
        rx.c c32 = M2.c3(new wb0.p() { // from class: com.baicizhan.main.home.plan.w2
            @Override // wb0.p
            public final Object call(Object obj) {
                GoldenNavigationAndTrainingConfig N0;
                N0 = a3.N0(x00.l.this, obj);
                return N0;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: com.baicizhan.main.home.plan.x2
            @Override // x00.l
            public final Object invoke(Object obj) {
                GoldenNavigation O0;
                O0 = a3.O0(a3.this, (GoldenNavigationAndTrainingConfig) obj);
                return O0;
            }
        };
        rx.c c33 = c32.c3(new wb0.p() { // from class: com.baicizhan.main.home.plan.y2
            @Override // wb0.p
            public final Object call(Object obj) {
                GoldenNavigation P0;
                P0 = a3.P0(x00.l.this, obj);
                return P0;
            }
        });
        final x00.l lVar3 = new x00.l() { // from class: com.baicizhan.main.home.plan.z2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 Q0;
                Q0 = a3.Q0((GoldenNavigation) obj);
                return Q0;
            }
        };
        rx.c L1 = c33.L1(new wb0.b() { // from class: com.baicizhan.main.home.plan.r1
            @Override // wb0.b
            public final void call(Object obj) {
                a3.R0(x00.l.this, obj);
            }
        });
        final x00.l lVar4 = new x00.l() { // from class: com.baicizhan.main.home.plan.s1
            @Override // x00.l
            public final Object invoke(Object obj) {
                GoldenNavigation S0;
                S0 = a3.S0((Throwable) obj);
                return S0;
            }
        };
        return L1.W3(new wb0.p() { // from class: com.baicizhan.main.home.plan.t1
            @Override // wb0.p
            public final Object call(Object obj) {
                GoldenNavigation T0;
                T0 = a3.T0(x00.l.this, obj);
                return T0;
            }
        }).w5(bc0.c.e());
    }

    public final void U0(@m80.k WordBanner item, boolean z11) {
        Object obj;
        kotlin.jvm.internal.g0.p(item, "item");
        qb.c.i(f21907x, "success " + z11 + " item= " + item, new Object[0]);
        List<Object> value = this.f21911c.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if ((obj instanceof WordBanner) && kotlin.jvm.internal.g0.g(((WordBanner) obj).getId(), item.getId())) {
                    break;
                }
            }
            if (obj != null) {
                if (z11) {
                    this.f21909a.F0(item.getImageGradientColor());
                    return;
                } else {
                    if (k3.o(this.f21911c, null)) {
                        this.f21909a.F0(0);
                        MutableLiveData<List<Object>> mutableLiveData = this.f21911c;
                        mutableLiveData.postValue(mutableLiveData.getValue());
                        return;
                    }
                    return;
                }
            }
        }
        qb.c.i(f21907x, "notify late, drop", new Object[0]);
    }

    public final void V0() {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new d(null), 3, null);
    }

    public final void W(@m80.k mg.g item) {
        kotlin.jvm.internal.g0.p(item, "item");
        k3.q(item);
    }

    @m80.l
    public final Object W0(@m80.k x00.a<? extends PrioritizedTask> aVar, @m80.k x00.l<? super PrioritizedTask, yz.g2> lVar, @m80.k x00.p<? super PrioritizedTask, ? super j00.c<? super yz.g2>, ? extends Object> pVar, @m80.k j00.c<? super yz.g2> cVar) {
        Object o11 = this.f21926r.o(aVar, lVar, pVar, cVar);
        return o11 == kotlin.coroutines.intrinsics.b.l() ? o11 : yz.g2.f100423a;
    }

    public final void X(@m80.k WordBanner banner) {
        kotlin.jvm.internal.g0.p(banner, "banner");
        if (TextUtils.isEmpty(banner.getLink())) {
            return;
        }
        k3.u(banner);
        ClickProtectedEvent<String> clickProtectedEvent = this.f21912d;
        String link = banner.getLink();
        if (link == null) {
            return;
        }
        clickProtectedEvent.postValue(link);
    }

    public final void X0() {
        this.f21915g.postValue(Boolean.FALSE);
        qb0.h hVar = this.f21929u;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        rx.c<BottomAdvInfos> I3 = pg.c.f80434a.c().I3(tb0.a.a());
        rx.c<WordBanner> I32 = pg.d0.f80438a.N().I3(tb0.a.a());
        final x00.p pVar = new x00.p() { // from class: com.baicizhan.main.home.plan.e2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                Boolean Y0;
                Y0 = a3.Y0(a3.this, (BottomAdvInfos) obj, (WordBanner) obj2);
                return Y0;
            }
        };
        rx.c r72 = rx.c.r7(I3, I32, new wb0.q() { // from class: com.baicizhan.main.home.plan.f2
            @Override // wb0.q
            public final Object call(Object obj, Object obj2) {
                Boolean a12;
                a12 = a3.a1(x00.p.this, obj, obj2);
                return a12;
            }
        });
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.home.plan.g2
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean b12;
                b12 = a3.b1((Boolean) obj);
                return b12;
            }
        };
        rx.c V1 = r72.V1(new wb0.p() { // from class: com.baicizhan.main.home.plan.h2
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean c12;
                c12 = a3.c1(x00.l.this, obj);
                return c12;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: com.baicizhan.main.home.plan.i2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 d12;
                d12 = a3.d1(a3.this, (Boolean) obj);
                return d12;
            }
        };
        rx.c L1 = V1.L1(new wb0.b() { // from class: com.baicizhan.main.home.plan.j2
            @Override // wb0.b
            public final void call(Object obj) {
                a3.e1(x00.l.this, obj);
            }
        });
        final x00.l lVar3 = new x00.l() { // from class: com.baicizhan.main.home.plan.k2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 f12;
                f12 = a3.f1(a3.this, (Boolean) obj);
                return f12;
            }
        };
        this.f21929u = L1.v5(new wb0.b() { // from class: com.baicizhan.main.home.plan.l2
            @Override // wb0.b
            public final void call(Object obj) {
                a3.g1(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: com.baicizhan.main.home.plan.n2
            @Override // wb0.b
            public final void call(Object obj) {
                a3.h1(a3.this, (Throwable) obj);
            }
        }, new wb0.a() { // from class: com.baicizhan.main.home.plan.o2
            @Override // wb0.a
            public final void call() {
                a3.Z0(a3.this);
            }
        });
    }

    public final mg.h Y() {
        if (com.baicizhan.base.a.a(getApplication())) {
            return null;
        }
        String string = getApplication().getString(R.string.word_extra_title_training);
        kotlin.jvm.internal.g0.o(string, "getString(...)");
        String string2 = getApplication().getString(R.string.word_extra_desc_training);
        kotlin.jvm.internal.g0.o(string2, "getString(...)");
        String string3 = getApplication().getString(R.string.word_extra_enter_training);
        kotlin.jvm.internal.g0.o(string3, "getString(...)");
        return new mg.h(string, string2, string3);
    }

    public final void Z() {
        pg.e1 e1Var = pg.e1.f80462a;
        if (e1Var.n() == UpgradeType.NO_NEED) {
            qb.c.d(f21907x, "NO NEED UPGRADE", new Object[0]);
            return;
        }
        rx.c<Integer> g11 = e1Var.g();
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.home.plan.p2
            @Override // x00.l
            public final Object invoke(Object obj) {
                Integer a02;
                a02 = a3.a0(a3.this, (Integer) obj);
                return a02;
            }
        };
        g11.c3(new wb0.p() { // from class: com.baicizhan.main.home.plan.q2
            @Override // wb0.p
            public final Object call(Object obj) {
                Integer b02;
                b02 = a3.b0(x00.l.this, obj);
                return b02;
            }
        }).H5(1).e6(1L, TimeUnit.MINUTES).q5(new c());
    }

    public final void d0() {
        rx.c<TrainPageResources> c11 = com.baicizhan.main.home.plan.d.c();
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.home.plan.u1
            @Override // x00.l
            public final Object invoke(Object obj) {
                Pair e02;
                e02 = a3.e0(a3.this, (TrainPageResources) obj);
                return e02;
            }
        };
        rx.c<R> c32 = c11.c3(new wb0.p() { // from class: com.baicizhan.main.home.plan.v1
            @Override // wb0.p
            public final Object call(Object obj) {
                Pair f02;
                f02 = a3.f0(x00.l.this, obj);
                return f02;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: com.baicizhan.main.home.plan.w1
            @Override // x00.l
            public final Object invoke(Object obj) {
                Pair g02;
                g02 = a3.g0(a3.this, (Pair) obj);
                return g02;
            }
        };
        rx.c c33 = c32.c3(new wb0.p() { // from class: com.baicizhan.main.home.plan.x1
            @Override // wb0.p
            public final Object call(Object obj) {
                Pair h02;
                h02 = a3.h0(x00.l.this, obj);
                return h02;
            }
        });
        final x00.l lVar3 = new x00.l() { // from class: com.baicizhan.main.home.plan.y1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 i02;
                i02 = a3.i0((Pair) obj);
                return i02;
            }
        };
        rx.c I3 = c33.L1(new wb0.b() { // from class: com.baicizhan.main.home.plan.z1
            @Override // wb0.b
            public final void call(Object obj) {
                a3.j0(x00.l.this, obj);
            }
        }).w5(bc0.c.e()).I3(tb0.a.a());
        final x00.l lVar4 = new x00.l() { // from class: com.baicizhan.main.home.plan.a2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 k02;
                k02 = a3.k0(a3.this, (Pair) obj);
                return k02;
            }
        };
        I3.u5(new wb0.b() { // from class: com.baicizhan.main.home.plan.c2
            @Override // wb0.b
            public final void call(Object obj) {
                a3.m0(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: com.baicizhan.main.home.plan.d2
            @Override // wb0.b
            public final void call(Object obj) {
                a3.n0((Throwable) obj);
            }
        });
    }

    public final void i1(@m80.k be.k guider) {
        kotlin.jvm.internal.g0.p(guider, "guider");
        be.h o11 = this.f21910b.o();
        if (o11 != null) {
            o11.e(guider);
        }
    }

    @m80.k
    public final MutableLiveData<Boolean> o0() {
        return this.f21915g;
    }

    public final void o1() {
        this.f21909a.j0();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f21909a.N().removeObserver(this.f21923o);
    }

    @m80.k
    public final LiveData<String> p0() {
        return this.f21928t;
    }

    public final void p1() {
        Z();
    }

    @m80.k
    public final LiveData<String> q0() {
        return this.f21913e;
    }

    public final void q1() {
        pg.e1.f80462a.o();
    }

    @m80.k
    public final ClickProtectedEvent<Pair<String, Boolean>> r0() {
        return this.f21909a.P();
    }

    public final void r1(int i11) {
        pg.u0.f80487a.E(i11);
        this.f21909a.j0();
    }

    @m80.k
    public final ClickProtectedEvent<Boolean> s0() {
        return this.f21909a.Q();
    }

    public final void start() {
        this.f21925q = n40.l.a(1, 1);
        rx.c<WordBanner> F = pg.d0.f80438a.F();
        rx.c<GoldenNavigation> L0 = L0();
        final x00.p pVar = new x00.p() { // from class: com.baicizhan.main.home.plan.q1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                Pair j12;
                j12 = a3.j1((WordBanner) obj, (GoldenNavigation) obj2);
                return j12;
            }
        };
        rx.c I3 = rx.c.r7(F, L0, new wb0.q() { // from class: com.baicizhan.main.home.plan.b2
            @Override // wb0.q
            public final Object call(Object obj, Object obj2) {
                Pair k12;
                k12 = a3.k1(x00.p.this, obj, obj2);
                return k12;
            }
        }).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.home.plan.m2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 l12;
                l12 = a3.l1(a3.this, (Pair) obj);
                return l12;
            }
        };
        I3.u5(new wb0.b() { // from class: com.baicizhan.main.home.plan.t2
            @Override // wb0.b
            public final void call(Object obj) {
                a3.m1(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: com.baicizhan.main.home.plan.u2
            @Override // wb0.b
            public final void call(Object obj) {
                a3.n1(a3.this, (Throwable) obj);
            }
        });
    }

    @m80.k
    public final LiveData<AdLunchWechatProgram> t0() {
        return this.f21914f;
    }

    @m80.k
    public final LiveData<Object> u0() {
        return this.f21909a.S();
    }

    @m80.k
    public final ClickProtectedEvent v0() {
        return this.f21909a.T();
    }

    @m80.k
    public final LiveData<String> w0() {
        return this.f21912d;
    }

    public final nc.a x0() {
        return (nc.a) this.f21922n.getValue();
    }

    @m80.k
    public final LiveData<List<Object>> y0() {
        MutableLiveData<List<Object>> mutableLiveData = this.f21911c;
        kotlin.jvm.internal.g0.n(mutableLiveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.collections.List<kotlin.Any>>");
        return mutableLiveData;
    }

    @m80.k
    public final LiveData<LearnCardStatus> z0() {
        return this.f21918j;
    }

    public static final Boolean b1(Boolean bool) {
        return bool;
    }
}
