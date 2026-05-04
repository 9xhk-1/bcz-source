package com.baicizhan.main.home.experiment.repo;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import c40.r0;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.main.rx.SchedulePrepareObservables;
import com.baicizhan.online.user_study_api.UserBasicInfoPlusV2;
import com.baicizhan.online.user_study_api.UserBasicInfoV2;
import com.baicizhan.online.user_study_api.UserLearnInfoV2;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class c0 implements t {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f21465d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f21466e = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q9.x f21467a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final BookListManager f21468b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Context f21469c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.l
        public final UserRecord a(@m80.l UserBasicInfoPlusV2 userBasicInfoPlusV2, @m80.k q9.x manager) {
            g0.p(manager, "manager");
            if (userBasicInfoPlusV2 == null) {
                qb.c.i(d0.f21486a, "refreshUser: userBasicInfoPlusV2 is null", new Object[0]);
                return null;
            }
            UserLearnInfoV2 learn_info = userBasicInfoPlusV2.getLearn_info();
            g0.o(learn_info, "getLearn_info(...)");
            UserRecord p11 = manager.p();
            g0.o(p11, "getCurrentUser(...)");
            UserBasicInfoV2 user_info = userBasicInfoPlusV2.getUser_info();
            g0.o(user_info, "getUser_info(...)");
            p11.setSex(user_info.getGender_id());
            p11.setNickName(user_info.getNickname());
            p11.setBirthday(user_info.getBirthday());
            p11.setLocation(user_info.getPosition());
            p11.updateEduction(user_info.getUser_education_info());
            p11.setRole(user_info.role == null ? null : new UserRecord.Role(user_info.getRole().role_up, user_info.role.grade));
            p11.setIpDescription(user_info.getIp_desc());
            ia.a.l(ia.a.f60467r, learn_info.last_sync_done_score_time * 1000);
            if (!TextUtils.isEmpty(user_info.avatar)) {
                p11.setImage(m9.c.d(user_info.avatar));
            }
            i9.m.f(null, p11);
            return p11;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.TmpRepo$refresh$2", f = "TmpRepo.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21470a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserBasicInfoPlusV2 f21471b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0 f21472c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UserBasicInfoPlusV2 userBasicInfoPlusV2, c0 c0Var, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f21471b = userBasicInfoPlusV2;
            this.f21472c = c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f21471b, this.f21472c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f21470a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c0.f21465d.a(this.f21471b, this.f21472c.f21467a);
                c0 c0Var = this.f21472c;
                UserBasicInfoPlusV2 userBasicInfoPlusV2 = this.f21471b;
                q9.x xVar = c0Var.f21467a;
                BookListManager bookListManager = this.f21472c.f21468b;
                this.f21470a = 1;
                if (c0Var.l(userBasicInfoPlusV2, xVar, bookListManager, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.TmpRepo", f = "TmpRepo.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {57, 62}, m = "refreshScheduleBook", n = {"userBasicInfoPlusV2", "studyMgr", "bookMgr", a.r.C0259a.f16302o, "userBasicInfoPlusV2", "studyMgr", "bookMgr", a.r.C0259a.f16302o}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f21473a;

        /* renamed from: b, reason: collision with root package name */
        public Object f21474b;

        /* renamed from: c, reason: collision with root package name */
        public Object f21475c;

        /* renamed from: d, reason: collision with root package name */
        public int f21476d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f21477e;

        /* renamed from: g, reason: collision with root package name */
        public int f21479g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f21477e = obj;
            this.f21479g |= Integer.MIN_VALUE;
            return c0.this.l(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.TmpRepo", f = "TmpRepo.kt", i = {0, 0, 1, 1, 1}, l = {109, 110}, m = "remoteRefreshBookAdnSchedule", n = {"userBasicInfoPlusV2", "manager", "userBasicInfoPlusV2", "manager", "scheduleRecord"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f21480a;

        /* renamed from: b, reason: collision with root package name */
        public Object f21481b;

        /* renamed from: c, reason: collision with root package name */
        public Object f21482c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f21483d;

        /* renamed from: f, reason: collision with root package name */
        public int f21485f;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f21483d = obj;
            this.f21485f |= Integer.MIN_VALUE;
            return c0.this.m(null, null, this);
        }
    }

    @Inject
    public c0(@m80.k q9.x studyMgr, @m80.k BookListManager bookMgr, @cv.b @m80.k Context context) {
        g0.p(studyMgr, "studyMgr");
        g0.p(bookMgr, "bookMgr");
        g0.p(context, "context");
        this.f21467a = studyMgr;
        this.f21468b = bookMgr;
        this.f21469c = context;
    }

    @Override // com.baicizhan.main.home.experiment.repo.t
    @m80.l
    public Object a(@m80.l UserBasicInfoPlusV2 userBasicInfoPlusV2, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(h1.c(), new b(userBasicInfoPlusV2, this, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    public final void i(ScheduleRecord scheduleRecord, BookRecord bookRecord) {
        this.f21467a.m0(bookRecord);
        this.f21467a.p0(scheduleRecord);
        i9.a.q(this.f21469c, scheduleRecord);
        i9.j.k("current_book_id", bookRecord.bookId);
    }

    public final Object j(j00.c<? super g2> cVar) {
        ScheduleRecord h11 = i9.a.h(this.f21469c);
        if (h11 == null || h11.dailyCount == 0 || TextUtils.isEmpty(h11.bookName)) {
            throw new RuntimeException("client book not intact");
        }
        BookRecord lazyLoadCurrentBookRecord = this.f21468b.lazyLoadCurrentBookRecord(this.f21469c, h11);
        qb.c.b(d0.f21486a, "loadBook input: " + h11 + "; output: " + lazyLoadCurrentBookRecord, new Object[0]);
        if (lazyLoadCurrentBookRecord == null) {
            throw new SchedulePrepareObservables.PrepareException(3, "找不到书" + h11.bookId);
        }
        if (lazyLoadCurrentBookRecord.dailyCount != 0) {
            i(h11, lazyLoadCurrentBookRecord);
            return g2.f100423a;
        }
        qb.c.b(SchedulePrepareObservables.f24809a, "loadBook " + lazyLoadCurrentBookRecord, new Object[0]);
        UserRecord.Role role = q9.x.r().p().getRole();
        throw new SchedulePrepareObservables.ForceSelectException(role != null ? role.grade : 0);
    }

    public final Object k(ScheduleRecord scheduleRecord, j00.c<? super BookRecord> cVar) {
        BookRecord k11 = this.f21467a.k();
        if (k11 == null) {
            k11 = this.f21468b.lazyLoadCurrentBookRecord(this.f21469c, scheduleRecord);
        }
        qb.c.b(d0.f21486a, "loadBook input: " + scheduleRecord + "; output: " + k11, new Object[0]);
        if (k11 != null) {
            return k11;
        }
        throw new SchedulePrepareObservables.PrepareException(3, "找不到书" + scheduleRecord.bookId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (m(r9, r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (j(r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.baicizhan.online.user_study_api.UserBasicInfoPlusV2 r9, q9.x r10, com.baicizhan.client.business.managers.booklist.BookListManager r11, j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.c0.l(com.baicizhan.online.user_study_api.UserBasicInfoPlusV2, q9.x, com.baicizhan.client.business.managers.booklist.BookListManager, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.baicizhan.online.user_study_api.UserBasicInfoPlusV2 r7, q9.x r8, j00.c<? super yz.g2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.baicizhan.main.home.experiment.repo.c0.d
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.main.home.experiment.repo.c0$d r0 = (com.baicizhan.main.home.experiment.repo.c0.d) r0
            int r1 = r0.f21485f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21485f = r1
            goto L18
        L13:
            com.baicizhan.main.home.experiment.repo.c0$d r0 = new com.baicizhan.main.home.experiment.repo.c0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f21483d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f21485f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f21482c
            com.baicizhan.client.business.dataset.models.ScheduleRecord r7 = (com.baicizhan.client.business.dataset.models.ScheduleRecord) r7
            java.lang.Object r8 = r0.f21481b
            q9.x r8 = (q9.x) r8
            java.lang.Object r8 = r0.f21480a
            com.baicizhan.online.user_study_api.UserBasicInfoPlusV2 r8 = (com.baicizhan.online.user_study_api.UserBasicInfoPlusV2) r8
            kotlin.e.n(r9)
            goto L81
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f21481b
            r8 = r7
            q9.x r8 = (q9.x) r8
            java.lang.Object r7 = r0.f21480a
            com.baicizhan.online.user_study_api.UserBasicInfoPlusV2 r7 = (com.baicizhan.online.user_study_api.UserBasicInfoPlusV2) r7
            kotlin.e.n(r9)
            goto L65
        L4d:
            kotlin.e.n(r9)
            java.lang.Object r9 = l00.k.a(r7)
            r0.f21480a = r9
            java.lang.Object r9 = l00.k.a(r8)
            r0.f21481b = r9
            r0.f21485f = r4
            java.lang.Object r9 = r6.n(r7, r8, r0)
            if (r9 != r1) goto L65
            goto L7d
        L65:
            com.baicizhan.client.business.dataset.models.ScheduleRecord r9 = (com.baicizhan.client.business.dataset.models.ScheduleRecord) r9
            java.lang.Object r7 = l00.k.a(r7)
            r0.f21480a = r7
            java.lang.Object r7 = l00.k.a(r8)
            r0.f21481b = r7
            r0.f21482c = r9
            r0.f21485f = r3
            java.lang.Object r7 = r6.k(r9, r0)
            if (r7 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r5 = r9
            r9 = r7
            r7 = r5
        L81:
            com.baicizhan.client.business.dataset.models.BookRecord r9 = (com.baicizhan.client.business.dataset.models.BookRecord) r9
            r6.i(r7, r9)
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.c0.m(com.baicizhan.online.user_study_api.UserBasicInfoPlusV2, q9.x, j00.c):java.lang.Object");
    }

    public final Object n(UserBasicInfoPlusV2 userBasicInfoPlusV2, q9.x xVar, j00.c<? super ScheduleRecord> cVar) {
        UserBasicInfoV2 userBasicInfoV2 = userBasicInfoPlusV2.user_info;
        UserLearnInfoV2 userLearnInfoV2 = userBasicInfoPlusV2.learn_info;
        if (userBasicInfoV2.getCurrent_word_level_id() <= 0) {
            throw new IllegalArgumentException("current_word_level_id is invalid " + userBasicInfoV2.getCurrent_word_level_id());
        }
        ScheduleRecord scheduleRecord = new ScheduleRecord();
        scheduleRecord.isCurrentSelect = 1;
        scheduleRecord.bookId = userBasicInfoV2.getCurrent_word_level_id();
        scheduleRecord.remoteSyncVer = userLearnInfoV2.getLast_sync_done_score_time();
        scheduleRecord.reviewCount = userLearnInfoV2.review_plan_count;
        scheduleRecord.dailyCount = userLearnInfoV2.daily_plan_count;
        scheduleRecord.bookName = userBasicInfoV2.current_word_level_name;
        scheduleRecord.desc = userBasicInfoV2.current_book_desc;
        scheduleRecord.descImage = userBasicInfoV2.current_book_desc_img;
        qb.c.i("", "load new schedule from server [%s]", scheduleRecord.toString());
        return scheduleRecord;
    }
}
