package com.baicizhan.main.home.experiment.repo;

import a00.h0;
import a00.i0;
import androidx.compose.runtime.MutableState;
import c40.r0;
import com.baicizhan.client.business.util.Standard_extKt;
import com.baicizhan.main.home.experiment.WinningType;
import com.baicizhan.main.home.experiment.a4;
import com.baicizhan.main.home.experiment.q3;
import com.baicizhan.main.home.experiment.r3;
import com.baicizhan.main.home.experiment.s3;
import com.baicizhan.main.home.experiment.t3;
import com.baicizhan.main.home.experiment.u3;
import com.baicizhan.main.home.experiment.w5;
import com.baicizhan.main.home.experiment.y3;
import com.baicizhan.online.game_api.AdvItem;
import com.baicizhan.online.game_api.BookInfo;
import com.baicizhan.online.game_api.ResourceItem;
import com.baicizhan.online.game_api.StudyHomeInfo;
import com.baicizhan.online.notify.NotifyResult;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Convert.kt\ncom/baicizhan/main/home/experiment/repo/ConvertKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n1#2:283\n1563#3:284\n1634#3,3:285\n*S KotlinDebug\n*F\n+ 1 Convert.kt\ncom/baicizhan/main/home/experiment/repo/ConvertKt\n*L\n129#1:284\n129#1:285,3\n*E\n"})
/* loaded from: classes4.dex */
public final class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21497a;

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
            f21497a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.ConvertKt", f = "Convert.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, l = {91, 102, 103, 107}, m = "asWordsPlanStatus", n = {"$this$asWordsPlanStatus", "gameHomeRepo", "state", "scope", "$this$asWordsPlanStatus", "gameHomeRepo", "state", "scope", "$this$asWordsPlanStatus", "gameHomeRepo", "state", "scope", "$this$asWordsPlanStatus", "gameHomeRepo", "state", "scope"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f21498a;

        /* renamed from: b, reason: collision with root package name */
        public Object f21499b;

        /* renamed from: c, reason: collision with root package name */
        public Object f21500c;

        /* renamed from: d, reason: collision with root package name */
        public Object f21501d;

        /* renamed from: e, reason: collision with root package name */
        public Object f21502e;

        /* renamed from: f, reason: collision with root package name */
        public Object f21503f;

        /* renamed from: g, reason: collision with root package name */
        public Object f21504g;

        /* renamed from: h, reason: collision with root package name */
        public Object f21505h;

        /* renamed from: i, reason: collision with root package name */
        public int f21506i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f21507j;

        /* renamed from: k, reason: collision with root package name */
        public int f21508k;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f21507j = obj;
            this.f21508k |= Integer.MIN_VALUE;
            return i.q(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.ConvertKt", f = "Convert.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {R.styleable.Theme_drawable_tab_friends, R.styleable.Theme_drawable_tab_friends_new}, m = "assembleReviewBehavior", n = {"$this$assembleReviewBehavior", "gameHomeRepo", "scope", "state", "behavior", "$this$assembleReviewBehavior", "gameHomeRepo", "scope", "state", "behavior"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f21509a;

        /* renamed from: b, reason: collision with root package name */
        public Object f21510b;

        /* renamed from: c, reason: collision with root package name */
        public Object f21511c;

        /* renamed from: d, reason: collision with root package name */
        public Object f21512d;

        /* renamed from: e, reason: collision with root package name */
        public Object f21513e;

        /* renamed from: f, reason: collision with root package name */
        public Object f21514f;

        /* renamed from: g, reason: collision with root package name */
        public Object f21515g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f21516h;

        /* renamed from: i, reason: collision with root package name */
        public int f21517i;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f21516h = obj;
            this.f21517i |= Integer.MIN_VALUE;
            return i.u(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.ConvertKt$assembleReviewBehavior$4$1", f = "Convert.kt", i = {}, l = {R.styleable.Theme_drawable_tab_surrounding}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21518a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f21519b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<t3> f21520c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s sVar, MutableState<t3> mutableState, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f21519b = sVar;
            this.f21520c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f21519b, this.f21520c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f21518a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                s sVar = this.f21519b;
                this.f21518a = 1;
                if (sVar.o(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            i.C(this.f21520c);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.ConvertKt", f = "Convert.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {180, 194}, m = "assembleStudyBehavior", n = {"$this$assembleStudyBehavior", "gameHomeRepo", "scope", "state", "behavior", "$this$assembleStudyBehavior", "gameHomeRepo", "scope", "state", "behavior"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f21521a;

        /* renamed from: b, reason: collision with root package name */
        public Object f21522b;

        /* renamed from: c, reason: collision with root package name */
        public Object f21523c;

        /* renamed from: d, reason: collision with root package name */
        public Object f21524d;

        /* renamed from: e, reason: collision with root package name */
        public Object f21525e;

        /* renamed from: f, reason: collision with root package name */
        public Object f21526f;

        /* renamed from: g, reason: collision with root package name */
        public Object f21527g;

        /* renamed from: h, reason: collision with root package name */
        public Object f21528h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f21529i;

        /* renamed from: j, reason: collision with root package name */
        public int f21530j;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f21529i = obj;
            this.f21530j |= Integer.MIN_VALUE;
            return i.y(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.ConvertKt$assembleStudyBehavior$2$1", f = "Convert.kt", i = {}, l = {201, 203}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21531a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f21532b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f21533c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(s sVar, boolean z11, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f21532b = sVar;
            this.f21533c = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new f(this.f21532b, this.f21533c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        
            if (r5.h(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
        
            if (r5.b(r4) == r0) goto L17;
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
                int r1 = r4.f21531a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                goto L3b
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.e.n(r5)
                goto L2c
            L1e:
                kotlin.e.n(r5)
                com.baicizhan.main.home.experiment.repo.s r5 = r4.f21532b
                r4.f21531a = r3
                java.lang.Object r5 = r5.b(r4)
                if (r5 != r0) goto L2c
                goto L3a
            L2c:
                boolean r5 = r4.f21533c
                if (r5 == 0) goto L3b
                com.baicizhan.main.home.experiment.repo.s r5 = r4.f21532b
                r4.f21531a = r2
                java.lang.Object r5 = r5.h(r4)
                if (r5 != r0) goto L3b
            L3a:
                return r0
            L3b:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.i.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.ConvertKt$assembleStudyBehavior$4$1", f = "Convert.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21534a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f21535b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<t3> f21536c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(s sVar, MutableState<t3> mutableState, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f21535b = sVar;
            this.f21536c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new g(this.f21535b, this.f21536c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f21534a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                s sVar = this.f21535b;
                this.f21534a = 1;
                if (sVar.s(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            i.C(this.f21536c);
            return g2.f100423a;
        }
    }

    public static final g2 A() {
        return g2.f100423a;
    }

    public static final g2 B(r0 r0Var, s sVar, MutableState mutableState) {
        c40.k.f(r0Var, null, null, new g(sVar, mutableState, null), 3, null);
        return g2.f100423a;
    }

    public static final void C(MutableState<t3> mutableState) {
        t3 value = mutableState.getValue();
        t3.c cVar = value instanceof t3.c ? (t3.c) value : null;
        if (cVar == null) {
            return;
        }
        w5 r11 = cVar.d().r();
        w5.c cVar2 = r11 instanceof w5.c ? (w5.c) r11 : null;
        if (cVar2 != null) {
            w5.c g11 = w5.c.g(cVar2, null, null, null, h0.J(), 7, null);
            List<com.baicizhan.main.home.experiment.b> h11 = cVar2.h();
            ArrayList arrayList = new ArrayList(i0.d0(h11, 10));
            Iterator<T> it = h11.iterator();
            while (it.hasNext()) {
                arrayList.add(com.baicizhan.main.home.experiment.b.i((com.baicizhan.main.home.experiment.b) it.next(), null, null, null, "", null, 23, null));
            }
            w5.c g12 = w5.c.g(g11, null, null, arrayList, null, 11, null);
            if (g12 == null) {
                return;
            }
            mutableState.setValue(new t3.c(s3.j(cVar.d(), null, null, null, null, null, null, null, g12, 127, null)));
        }
    }

    public static final long D(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 18);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    @m80.k
    public static final com.baicizhan.main.home.experiment.c j(@m80.k BookInfo bookInfo) {
        g0.p(bookInfo, "<this>");
        int i11 = bookInfo.book_id;
        String book_name = bookInfo.book_name;
        g0.o(book_name, "book_name");
        String cover = bookInfo.cover;
        g0.o(cover, "cover");
        return new com.baicizhan.main.home.experiment.c(i11, book_name, cover, bookInfo.total_count);
    }

    @m80.k
    public static final q3 k(@m80.k AdvItem advItem) {
        g0.p(advItem, "<this>");
        String icon = advItem.icon;
        g0.o(icon, "icon");
        String link = advItem.link;
        g0.o(link, "link");
        return new q3(icon, link, null, 4, null);
    }

    @m80.k
    public static final r3 l(@m80.k ResourceItem resourceItem) {
        g0.p(resourceItem, "<this>");
        String icon = resourceItem.icon;
        g0.o(icon, "icon");
        String link = resourceItem.link;
        g0.o(link, "link");
        String name = resourceItem.name;
        g0.o(name, "name");
        return new r3(icon, link, name);
    }

    @m80.k
    public static final y3 m(@m80.k NotifyResult notifyResult) {
        g0.p(notifyResult, "<this>");
        String service_url = notifyResult.service_url;
        g0.o(service_url, "service_url");
        return new y3(service_url, notifyResult.reddot == 1);
    }

    @m80.l
    public static final Object n(@m80.k List<String> list, @m80.k a4 winningModel) {
        Integer valueOf = Integer.valueOf(R.drawable.img_mascot_normal_local);
        g0.p(list, "<this>");
        g0.p(winningModel, "winningModel");
        if (!(winningModel instanceof a4.a)) {
            if (!g0.g(winningModel, a4.b.f21082b)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = (String) a00.r0.b3(list, 0);
            return str == null ? valueOf : str;
        }
        int i11 = a.f21497a[((a4.a) winningModel).h().ordinal()];
        if (i11 == 1) {
            String available = Standard_extKt.getAvailable((String) a00.r0.b3(list, 2));
            return available == null ? Integer.valueOf(R.drawable.img_mascot_finished_local) : available;
        }
        if (i11 == 2) {
            String available2 = Standard_extKt.getAvailable((String) a00.r0.b3(list, 1));
            return available2 == null ? Integer.valueOf(R.drawable.img_mascot_alert_local) : available2;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String available3 = Standard_extKt.getAvailable((String) a00.r0.b3(list, 0));
        return available3 == null ? valueOf : available3;
    }

    @m80.k
    public static final com.baicizhan.main.home.experiment.d o(@m80.k BookInfo bookInfo) {
        g0.p(bookInfo, "<this>");
        return new com.baicizhan.main.home.experiment.d(bookInfo.mastered, bookInfo.learned);
    }

    @m80.k
    public static final a4 p(@m80.k com.baicizhan.client.business.managers.winningstreak.f fVar, long j11, @m80.k x00.l<? super WinningType, String> onMessageCreate) {
        g0.p(fVar, "<this>");
        g0.p(onMessageCreate, "onMessageCreate");
        WinningType winningType = fVar.f() >= com.baicizhan.client.business.managers.winningstreak.b.c(j11) ? WinningType.Done : (fVar.f() >= com.baicizhan.client.business.managers.winningstreak.b.c(j11) || j11 < D(j11)) ? WinningType.Default : WinningType.Hinting;
        return new a4.a(fVar.e(), winningType, onMessageCreate.invoke(winningType));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(@m80.k com.baicizhan.online.game_api.StudyHomeInfo r10, @m80.k com.baicizhan.main.home.experiment.repo.s r11, @m80.k androidx.compose.runtime.MutableState<com.baicizhan.main.home.experiment.t3> r12, @m80.k c40.r0 r13, @m80.k j00.c<? super com.baicizhan.main.home.experiment.w5> r14) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.i.q(com.baicizhan.online.game_api.StudyHomeInfo, com.baicizhan.main.home.experiment.repo.s, androidx.compose.runtime.MutableState, c40.r0, j00.c):java.lang.Object");
    }

    public static final g2 r(s sVar, MutableState mutableState) {
        sVar.a();
        C(mutableState);
        return g2.f100423a;
    }

    @m80.k
    public static final com.baicizhan.main.home.experiment.b s(@m80.k StudyHomeInfo studyHomeInfo) {
        g0.p(studyHomeInfo, "<this>");
        return new com.baicizhan.main.home.experiment.b("学习其他计划", new u3.b("bcz://com.baicizhan.plan/edit", new x00.a() { // from class: com.baicizhan.main.home.experiment.repo.d
            @Override // x00.a
            public final Object invoke() {
                g2 t11;
                t11 = i.t();
                return t11;
            }
        }), null, null, null, 28, null);
    }

    public static final g2 t() {
        return g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        if (r4 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(@m80.k final com.baicizhan.online.game_api.StudyHomeInfo r8, @m80.k final com.baicizhan.main.home.experiment.repo.s r9, @m80.k final c40.r0 r10, @m80.k final androidx.compose.runtime.MutableState<com.baicizhan.main.home.experiment.t3> r11, @m80.k j00.c<? super com.baicizhan.main.home.experiment.b> r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.i.u(com.baicizhan.online.game_api.StudyHomeInfo, com.baicizhan.main.home.experiment.repo.s, c40.r0, androidx.compose.runtime.MutableState, j00.c):java.lang.Object");
    }

    public static final g2 v(StudyHomeInfo studyHomeInfo, s sVar) {
        BookInfo bookInfo = studyHomeInfo.book;
        if (bookInfo.status == 3) {
            sVar.e(bookInfo.book_id);
        }
        return g2.f100423a;
    }

    public static final g2 w(StudyHomeInfo studyHomeInfo, s sVar) {
        BookInfo bookInfo = studyHomeInfo.book;
        if (bookInfo.status == 3) {
            sVar.e(bookInfo.book_id);
        }
        return g2.f100423a;
    }

    public static final g2 x(r0 r0Var, s sVar, MutableState mutableState) {
        c40.k.f(r0Var, null, null, new d(sVar, mutableState, null), 3, null);
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(@m80.k com.baicizhan.online.game_api.StudyHomeInfo r17, @m80.k com.baicizhan.main.home.experiment.repo.s r18, @m80.k c40.r0 r19, @m80.k androidx.compose.runtime.MutableState<com.baicizhan.main.home.experiment.t3> r20, @m80.k j00.c<? super com.baicizhan.main.home.experiment.b> r21) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.i.y(com.baicizhan.online.game_api.StudyHomeInfo, com.baicizhan.main.home.experiment.repo.s, c40.r0, androidx.compose.runtime.MutableState, j00.c):java.lang.Object");
    }

    public static final g2 z(r0 r0Var, s sVar, boolean z11, String str) {
        g0.p(str, "<unused var>");
        c40.k.f(r0Var, null, null, new f(sVar, z11, null), 3, null);
        return g2.f100423a;
    }
}
