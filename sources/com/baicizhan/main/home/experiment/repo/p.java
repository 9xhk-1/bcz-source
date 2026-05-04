package com.baicizhan.main.home.experiment.repo;

import a00.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import c40.r0;
import com.baicizhan.client.business.util.AdCommonHelper;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.online.ad_property.AdDeviceInfo;
import com.baicizhan.online.game_api.BookInfo;
import com.baicizhan.online.game_api.EquipmentInfo;
import com.baicizhan.online.game_api.GameApiService;
import com.baicizhan.online.game_api.StudyHomeInfo;
import com.baicizhan.online.notify.NotifyResult;
import com.baicizhan.online.notify.NotifyService;
import com.baicizhan.online.user_study_api.UserBasicInfoPlusV2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.o0;
import org.apache.thrift.TBase;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TIOStreamTransport;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class p implements s {

    /* renamed from: f, reason: collision with root package name */
    public static final int f21555f = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final nc.a f21556a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final nc.a f21557b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final q9.x f21558c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.y<m> f21559d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f21560e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21561a;

        static {
            int[] iArr = new int[StudyButton.values().length];
            try {
                iArr[StudyButton.STUDY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StudyButton.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21561a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.GameHomeRepo$basicInfo$2", f = "GameHomeRepo.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super UserBasicInfoPlusV2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21562a;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super UserBasicInfoPlusV2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f21562a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            this.f21562a = 1;
            Object b11 = StudyServiceFxKt.b(this);
            return b11 == l11 ? l11 : b11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.GameHomeRepo", f = "GameHomeRepo.kt", i = {}, l = {121}, m = "gameStudy", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f21563a;

        /* renamed from: c, reason: collision with root package name */
        public int f21565c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f21563a = obj;
            this.f21565c |= Integer.MIN_VALUE;
            return p.this.m(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.GameHomeRepo$gameStudy$2", f = "GameHomeRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super StudyHomeInfo>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21566a;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return p.this.new d(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super StudyHomeInfo> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21566a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            StudyHomeInfo home = p.this.z().home();
            kotlinx.coroutines.flow.y<m> q11 = p.this.q();
            BookInfo bookInfo = home.book;
            q11.setValue(new m(bookInfo.learned, bookInfo.total_count, bookInfo.mastered));
            return home;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.GameHomeRepo", f = "GameHomeRepo.kt", i = {}, l = {102}, m = "queryHomeAd", n = {}, s = {}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f21568a;

        /* renamed from: c, reason: collision with root package name */
        public int f21570c;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f21568a = obj;
            this.f21570c |= Integer.MIN_VALUE;
            return p.this.f(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.GameHomeRepo$queryHomeAd$2", f = "GameHomeRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nGameHomeRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameHomeRepo.kt\ncom/baicizhan/main/home/experiment/repo/GameHomeRepo$queryHomeAd$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 thrift_utils.kt\ncom/baicizhan/client/business/util/Thrift_utilsKt\n*L\n1#1,242:1\n3919#2:243\n4434#2,2:244\n1869#3,2:246\n14#4,10:248\n28#4:258\n43#4,4:259\n29#4,11:263\n*S KotlinDebug\n*F\n+ 1 GameHomeRepo.kt\ncom/baicizhan/main/home/experiment/repo/GameHomeRepo$queryHomeAd$2\n*L\n105#1:243\n105#1:244,2\n107#1:246,2\n108#1:248,10\n112#1:258\n112#1:259,4\n112#1:263,11\n*E\n"})
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super EquipmentInfo>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21571a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21572b;

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            f fVar = p.this.new f(cVar);
            fVar.f21572b = obj;
            return fVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super EquipmentInfo> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            byte[] bArr;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21571a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            p pVar = p.this;
            try {
                Result.a aVar = Result.Companion;
                EquipmentInfo equipmentInfo = pVar.z().get_equipments();
                String[] a11 = pVar.f21557b.a();
                g0.o(a11, "allKeys(...)");
                ArrayList arrayList = new ArrayList();
                for (String str : a11) {
                    g0.m(str);
                    if (k0.n3(str, "game_equipment", false, 2, null)) {
                        arrayList.add(str);
                    }
                }
                nc.a aVar2 = pVar.f21557b;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    aVar2.r((String) it.next());
                }
                nc.a aVar3 = pVar.f21557b;
                String C = pVar.C("game_equipment");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    equipmentInfo.write(new TBinaryProtocol(new TIOStreamTransport(byteArrayOutputStream)));
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (Exception e11) {
                    qb.c.c(KotlinExtKt.TAG, "", e11);
                    bArr = null;
                }
                aVar3.k(C, bArr);
                m6308constructorimpl = Result.m6308constructorimpl(equipmentInfo);
            } catch (Throwable th2) {
                Result.a aVar4 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            byte[] d11 = p.this.f21557b.d(p.this.C("game_equipment"));
            Constructor declaredConstructor = EquipmentInfo.class.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            TBase tBase = (TBase) declaredConstructor.newInstance(null);
            Result.a aVar5 = Result.Companion;
            Object m6308constructorimpl2 = Result.m6308constructorimpl(tBase);
            try {
                tBase.read(new TBinaryProtocol(new TIOStreamTransport(new ByteArrayInputStream(d11))));
            } catch (Exception e12) {
                Result.a aVar6 = Result.Companion;
                m6308constructorimpl2 = Result.m6308constructorimpl(kotlin.e.a(e12));
                qb.c.c(KotlinExtKt.TAG, "", e12);
            }
            EquipmentInfo equipmentInfo2 = (EquipmentInfo) (Result.m6314isFailureimpl(m6308constructorimpl2) ? null : m6308constructorimpl2);
            if (Result.m6315isSuccessimpl(m6308constructorimpl)) {
                kotlin.e.n(m6308constructorimpl);
                return (EquipmentInfo) m6308constructorimpl;
            }
            if (equipmentInfo2 != null) {
                return equipmentInfo2;
            }
            kotlin.e.n(m6308constructorimpl);
            return (EquipmentInfo) m6308constructorimpl;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.GameHomeRepo", f = "GameHomeRepo.kt", i = {}, l = {133}, m = "queryNotify", n = {}, s = {}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f21574a;

        /* renamed from: c, reason: collision with root package name */
        public int f21576c;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f21574a = obj;
            this.f21576c |= Integer.MIN_VALUE;
            return p.this.g(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.GameHomeRepo$queryNotify$2", f = "GameHomeRepo.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<r0, j00.c<? super NotifyResult>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21577a;

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return p.this.new h(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super NotifyResult> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f21577a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                AdCommonHelper adCommonHelper = AdCommonHelper.INSTANCE;
                this.f21577a = 1;
                obj = adCommonHelper.buildAdDeviceInfo(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return p.this.D().get_latest_notify_v2((AdDeviceInfo) obj);
        }
    }

    @Inject
    public p(@q9.k @m80.k nc.a kv2, @q9.y @m80.k nc.a thriftKv, @m80.k q9.x studyMgr) {
        g0.p(kv2, "kv");
        g0.p(thriftKv, "thriftKv");
        g0.p(studyMgr, "studyMgr");
        this.f21556a = kv2;
        this.f21557b = thriftKv;
        this.f21558c = studyMgr;
        this.f21559d = o0.a(null);
        this.f21560e = t5.e.f89573e;
    }

    public final String A(String str, int i11) {
        String todayEn = TimeUtil.getTodayEn();
        return str + "_" + this.f21558c.p().getUniqueId() + "_" + i11 + "_" + todayEn;
    }

    public final String B(String str) {
        return str + "_" + this.f21558c.p().getUniqueId();
    }

    public final String C(String str) {
        return str + "_" + TimeUtil.getTodayEn() + "_" + this.f21558c.p().getUniqueId();
    }

    public final NotifyService.Client D() {
        Object a11 = new com.baicizhan.client.business.thrift.l("/rpc/notify").a();
        g0.o(a11, "build(...)");
        return (NotifyService.Client) a11;
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    public void a() {
        this.f21556a.j(B("read_word_list_tips"), true);
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.l
    public Object b(@m80.k j00.c<? super g2> cVar) {
        this.f21556a.j(C("review_before_study_tips"), true);
        return g2.f100423a;
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.l
    public Object c(@m80.k j00.c<? super Boolean> cVar) {
        return l00.a.a(this.f21556a.getBoolean(B("study_tips"), false));
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.k
    public String d() {
        return this.f21560e;
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    public void e(int i11) {
        this.f21556a.j(A("read_finish_learn_today", i11), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(@m80.k j00.c<? super com.baicizhan.online.game_api.EquipmentInfo> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.baicizhan.main.home.experiment.repo.p.e
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.main.home.experiment.repo.p$e r0 = (com.baicizhan.main.home.experiment.repo.p.e) r0
            int r1 = r0.f21570c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21570c = r1
            goto L18
        L13:
            com.baicizhan.main.home.experiment.repo.p$e r0 = new com.baicizhan.main.home.experiment.repo.p$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f21568a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f21570c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.e.n(r6)
            c40.m0 r6 = c40.h1.c()
            com.baicizhan.main.home.experiment.repo.p$f r2 = new com.baicizhan.main.home.experiment.repo.p$f
            r4 = 0
            r2.<init>(r4)
            r0.f21570c = r3
            java.lang.Object r6 = c40.i.h(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.p.f(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@m80.k j00.c<? super com.baicizhan.online.notify.NotifyResult> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.baicizhan.main.home.experiment.repo.p.g
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.main.home.experiment.repo.p$g r0 = (com.baicizhan.main.home.experiment.repo.p.g) r0
            int r1 = r0.f21576c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21576c = r1
            goto L18
        L13:
            com.baicizhan.main.home.experiment.repo.p$g r0 = new com.baicizhan.main.home.experiment.repo.p$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f21574a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f21576c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.e.n(r6)
            c40.m0 r6 = c40.h1.c()
            com.baicizhan.main.home.experiment.repo.p$h r2 = new com.baicizhan.main.home.experiment.repo.p$h
            r4 = 0
            r2.<init>(r4)
            r0.f21576c = r3
            java.lang.Object r6 = c40.i.h(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.p.g(j00.c):java.lang.Object");
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.l
    public Object h(@m80.k j00.c<? super g2> cVar) {
        this.f21556a.j(B("review_before_study_tips"), true);
        return g2.f100423a;
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.k
    public String i() {
        return q.f21580b;
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.k
    public List<String> j(@m80.k StudyButton studyButton, int i11) {
        g0.p(studyButton, "studyButton");
        int i12 = a.f21561a[studyButton.ordinal()];
        String str = "";
        if (i12 == 1) {
            if (i11 != 0) {
                str = String.format(q.f21583e, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
                g0.o(str, "format(...)");
            }
            return h0.Q(q.f21581c, str);
        }
        if (i12 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (i11 != 0) {
            str = String.format(q.f21584f, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
            g0.o(str, "format(...)");
        }
        return h0.Q(q.f21582d, str);
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.l
    public Object k(@m80.k j00.c<? super UserBasicInfoPlusV2> cVar) {
        return c40.i.h(h1.c(), new b(null), cVar);
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.l
    public Object l(@m80.k j00.c<? super Boolean> cVar) {
        return l00.a.a(this.f21556a.getBoolean(B("review_tips"), false));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(@m80.k j00.c<? super com.baicizhan.online.game_api.StudyHomeInfo> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.baicizhan.main.home.experiment.repo.p.c
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.main.home.experiment.repo.p$c r0 = (com.baicizhan.main.home.experiment.repo.p.c) r0
            int r1 = r0.f21565c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21565c = r1
            goto L18
        L13:
            com.baicizhan.main.home.experiment.repo.p$c r0 = new com.baicizhan.main.home.experiment.repo.p$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f21563a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f21565c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.e.n(r6)
            c40.m0 r6 = c40.h1.c()
            com.baicizhan.main.home.experiment.repo.p$d r2 = new com.baicizhan.main.home.experiment.repo.p$d
            r4 = 0
            r2.<init>(r4)
            r0.f21565c = r3
            java.lang.Object r6 = c40.i.h(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.p.m(j00.c):java.lang.Object");
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    public boolean n(int i11) {
        return this.f21556a.getBoolean(A("read_finish_learn_today", i11), false);
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.l
    public Object o(@m80.k j00.c<? super g2> cVar) {
        this.f21556a.j(B("review_tips"), true);
        return g2.f100423a;
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.l
    public Object p(@m80.k j00.c<? super Boolean> cVar) {
        return l00.a.a(this.f21556a.getBoolean(B("review_before_study_tips"), false) || this.f21556a.getBoolean(C("review_before_study_tips"), false));
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    public boolean r() {
        return this.f21556a.getBoolean(B("read_word_list_tips"), false);
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.l
    public Object s(@m80.k j00.c<? super g2> cVar) {
        this.f21556a.j(B("study_tips"), true);
        return g2.f100423a;
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.k
    public String t() {
        return q.f21579a;
    }

    @Override // com.baicizhan.main.home.experiment.repo.s
    @m80.k
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.flow.y<m> q() {
        return this.f21559d;
    }

    public final GameApiService.Client z() {
        Object a11 = new com.baicizhan.client.business.thrift.l("/rpc/game").a();
        g0.o(a11, "build(...)");
        return (GameApiService.Client) a11;
    }
}
