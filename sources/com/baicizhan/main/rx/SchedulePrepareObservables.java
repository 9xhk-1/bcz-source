package com.baicizhan.main.rx;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.RoadmapRecord;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.dataset.models.WordClozeRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.RoadmapUtils;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.main.rx.SchedulePrepareObservables;
import com.baicizhan.online.bs_users.BSUsers;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.user_study_api.PrimarySchoolModeConfig;
import com.baicizhan.online.user_study_api.UserBasicInfoPlusV2;
import com.baicizhan.online.user_study_api.UserBasicInfoV2;
import com.baicizhan.online.user_study_api.UserLearnInfoV2;
import com.baicizhan.online.user_study_api.UserLimitInfoV2;
import com.baicizhan.online.user_study_api.UserRoadMapElementV2;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import com.baicizhan.online.user_study_api.UserStudyConfig;
import com.jiongji.andriod.card.R;
import gi.k0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.apache.thrift.TException;
import org.json.JSONObject;
import org.junit.jupiter.api.j2;
import pg.u0;
import qg.x0;
import rx.Notification;
import rx.c;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SchedulePrepareObservables {

    /* renamed from: a, reason: collision with root package name */
    public static final String f24809a = "SchedulePrepareObservables";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f24810b = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int f24812d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f24813e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f24814f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static rx.c<Boolean> f24815g;

    /* renamed from: c, reason: collision with root package name */
    public static final Executor f24811c = Executors.newCachedThreadPool();

    /* renamed from: h, reason: collision with root package name */
    public static dc0.b<Boolean> f24816h = dc0.b.y7();

    /* renamed from: i, reason: collision with root package name */
    public static Executor f24817i = Executors.newSingleThreadExecutor();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ForceSelectException extends PrepareException {
        public static final int NO_GRADE = 0;
        public int grade;

        public ForceSelectException(int grade) {
            super(2, "");
            this.grade = grade;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PrepareException extends RuntimeException {
        public static final int EMPTY_ROADMAP = 4;
        public static final int EMPTY_SCHEDULE = 3;
        public static final int FORCE_SELECT = 2;
        public static final int FORCE_SELECT_IDENTITY = 7;
        public static final int INVALID_USER = 1;
        public static final int LM_FAIL = 5;
        public static final int LOGIN_LOST = 6;
        private static final long serialVersionUID = 1;
        private int code;

        public PrepareException(int code, String message) {
            super(message);
            this.code = code;
        }

        public int getCode() {
            return this.code;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PrepareException{code=" + this.code + "message=" + getMessage() + com.alipay.sdk.m.u.i.f11099d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callable<ScheduleRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24818a;

        public a(final d0 val$env) {
            this.f24818a = val$env;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduleRecord call() throws Exception {
            qb.c.b(SchedulePrepareObservables.f24809a, "loadScheduleFromClient", new Object[0]);
            long currentTimeMillis = System.currentTimeMillis();
            ScheduleRecord h11 = i9.a.h(this.f24818a.f24828a);
            if (h11 == null || h11.dailyCount == 0 || TextUtils.isEmpty(h11.bookName)) {
                throw new RuntimeException("client book not intact");
            }
            qb.c.b(SchedulePrepareObservables.f24809a, "loadScheduleFromClient: " + h11, new Object[0]);
            qb.c.b(SchedulePrepareObservables.f24809a, "time consume, loadScheduleFromClient: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return h11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a0 implements wb0.p<ScheduleRecord, rx.c<Pair<ScheduleRecord, BookRecord>>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24819a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.p<BookRecord, Pair<ScheduleRecord, BookRecord>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ScheduleRecord f24820a;

            public a(final ScheduleRecord val$scheduleRecord) {
                this.f24820a = val$scheduleRecord;
            }

            @Override // wb0.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Pair<ScheduleRecord, BookRecord> call(BookRecord bookRecord) {
                return new Pair<>(this.f24820a, bookRecord);
            }
        }

        public a0(final d0 val$env) {
            this.f24819a = val$env;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Pair<ScheduleRecord, BookRecord>> call(final ScheduleRecord scheduleRecord) {
            return SchedulePrepareObservables.G(this.f24819a, scheduleRecord).c3(new a(scheduleRecord));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements wb0.p<UserStudyApiService.Client, ScheduleRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24822a;

        public b(final d0 val$env) {
            this.f24822a = val$env;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduleRecord call(UserStudyApiService.Client client) {
            ScheduleRecord scheduleRecord;
            boolean z11;
            long currentTimeMillis = System.currentTimeMillis();
            qb.c.b(SchedulePrepareObservables.f24809a, "loadScheduleFromServer " + this.f24822a, new Object[0]);
            d0 d0Var = this.f24822a;
            Context context = d0Var.f24828a;
            q9.x xVar = d0Var.f24830c;
            try {
                qb.c.b(SchedulePrepareObservables.f24809a, "loadScheduleFromServer start", new Object[0]);
                UserBasicInfoPlusV2 user_basic_info_v2 = client.user_basic_info_v2();
                qb.c.b(SchedulePrepareObservables.f24809a, "user_basic_info " + user_basic_info_v2, new Object[0]);
                d0 d0Var2 = this.f24822a;
                d0Var2.f24833f = user_basic_info_v2;
                if (user_basic_info_v2.learn_info.last_sync_done_score_time <= 1) {
                    i9.f.j(d0Var2.f24828a, i9.f.f60361a0, true);
                } else {
                    i9.f.j(d0Var2.f24828a, i9.f.f60361a0, false);
                }
                UserLearnInfoV2 learn_info = user_basic_info_v2.getLearn_info();
                UserRecord p11 = xVar.p();
                UserBasicInfoV2 user_info = user_basic_info_v2.getUser_info();
                p11.setSex(user_info.getGender_id());
                p11.setNickName(user_info.getNickname());
                p11.setBirthday(user_info.getBirthday());
                p11.setLocation(user_info.getPosition());
                p11.updateEduction(user_info.getUser_education_info());
                PrimarySchoolModeConfig primarySchoolModeConfig = null;
                p11.setRole(user_info.role == null ? null : new UserRecord.Role(user_info.getRole().role_up, user_info.role.grade));
                p11.setIpDescription(user_info.getIp_desc());
                ia.a.l(ia.a.f60467r, learn_info.last_sync_done_score_time * 1000);
                if (!TextUtils.isEmpty(user_info.avatar)) {
                    p11.setImage(m9.c.d(user_info.avatar));
                }
                i9.m.f(context, p11);
                hi.f.b(context, user_info.role);
                if (user_info.getCurrent_word_level_id() > 0) {
                    ScheduleRecord scheduleRecord2 = new ScheduleRecord();
                    scheduleRecord2.isCurrentSelect = 1;
                    scheduleRecord2.bookId = user_info.getCurrent_word_level_id();
                    scheduleRecord2.remoteSyncVer = learn_info.getLast_sync_done_score_time();
                    scheduleRecord2.reviewCount = learn_info.review_plan_count;
                    scheduleRecord2.dailyCount = learn_info.daily_plan_count;
                    scheduleRecord2.bookName = user_info.current_word_level_name;
                    scheduleRecord2.desc = user_info.current_book_desc;
                    scheduleRecord2.descImage = user_info.current_book_desc_img;
                    qb.c.i("", "load new schedule from server [%s]", scheduleRecord2.toString());
                    scheduleRecord = scheduleRecord2;
                } else {
                    scheduleRecord = null;
                }
                UserLimitInfoV2 limit_info = user_basic_info_v2.getLimit_info();
                if (limit_info != null && limit_info.cur_book_has_primary_school_mode == 1) {
                    try {
                        primarySchoolModeConfig = client.get_primary_school_mode_config();
                    } catch (TException e11) {
                        qb.c.d(SchedulePrepareObservables.f24809a, "loadScheduleFromServer: " + e11, new Object[0]);
                        z11 = false;
                    }
                }
                z11 = true;
                PrimarySchoolModeConfig primarySchoolModeConfig2 = primarySchoolModeConfig;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("loadScheduleFromServer: state = ");
                sb2.append(primarySchoolModeConfig2 == null ? "null" : Integer.valueOf(primarySchoolModeConfig2.state));
                qb.c.i(SchedulePrepareObservables.f24809a, sb2.toString(), new Object[0]);
                qb.c.i(SchedulePrepareObservables.f24809a, "limit info : %s", limit_info != null ? limit_info.toString() : "null");
                SchedulePrepareObservables.u(context, this.f24822a, scheduleRecord == null ? -1 : scheduleRecord.bookId, limit_info, primarySchoolModeConfig2, z11);
                qb.c.b(SchedulePrepareObservables.f24809a, "return schedule from server: " + scheduleRecord, new Object[0]);
                SchedulePrepareObservables.e0(this.f24822a).t6().t();
                qb.c.b("whiz", "time consume, loadScheduleFromServer: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                if (user_info.role != null && user_info.getCurrent_word_level_id() <= 0) {
                    qb.c.d(SchedulePrepareObservables.f24809a, "schedule from server error, book id not valid: " + user_info, new Object[0]);
                    throw new ForceSelectException(user_info.role.grade);
                }
                if (user_info.getCurrent_word_level_id() > 0) {
                    return scheduleRecord;
                }
                qb.c.d(SchedulePrepareObservables.f24809a, "schedule from server error, null == role " + user_info, new Object[0]);
                throw new PrepareException(7, "");
            } catch (Exception e12) {
                qb.c.b(SchedulePrepareObservables.f24809a, "user_basic_info fail, cause: " + e12.toString(), new Object[0]);
                d0 d0Var3 = this.f24822a;
                d0Var3.f24831d = true;
                i9.f.j(d0Var3.f24828a, i9.f.f60361a0, true);
                throw new RuntimeException(e12);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b0 implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24823a;

        public b0(final d0 val$env) {
            this.f24823a = val$env;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            d0 d0Var = this.f24823a;
            if ((d0Var.f24829b & 1) > 0) {
                try {
                    SchedulePrepareObservables.S(d0Var.f24828a, d0Var.f24830c.k());
                } catch (Exception e11) {
                    qb.c.c(SchedulePrepareObservables.f24809a, "refreshBookResourceInfo failed when load schedule. ", e11);
                }
            }
            qb.c.b(SchedulePrepareObservables.f24809a, "time consume, refreshBookRes end: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements wb0.p<UserStudyApiService.Client, Boolean> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(UserStudyApiService.Client client) {
            int i11;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                UserStudyConfig userStudyConfig = client.get_user_study_config();
                if (!TextUtils.isEmpty(userStudyConfig.extra_config)) {
                    JSONObject jSONObject = new JSONObject(userStudyConfig.extra_config);
                    boolean z11 = true;
                    if (jSONObject.has("show_image_mean")) {
                        i9.j.n("show_image_mean", jSONObject.getInt("show_image_mean") != 0);
                    }
                    if (jSONObject.has(th.b.f90577b)) {
                        com.baicizhan.main.activity.daka.datasource.k.g(jSONObject.getInt(th.b.f90577b) == 2);
                    }
                    int e11 = i9.j.e("show_deformation", 0);
                    if (jSONObject.has("show_deformation")) {
                        i11 = jSONObject.getInt("show_deformation");
                        i9.j.k("show_deformation", i11);
                    } else {
                        i9.j.k("show_deformation", 1);
                        i11 = 0;
                    }
                    if (i11 != 0) {
                        i9.j.k("show_deformation", i11);
                    }
                    qb.c.i(SchedulePrepareObservables.f24809a, "update show deformation, [local, server, has] [%d, %d, %b]", Integer.valueOf(e11), Integer.valueOf(i11), Boolean.valueOf(jSONObject.has("show_deformation")));
                    if (jSONObject.has("show_sentence_translation")) {
                        i9.j.n("show_sentence_translation", jSONObject.getInt("show_sentence_translation") == 2);
                    }
                    if (jSONObject.has(th.b.f90579d)) {
                        if (jSONObject.getInt(th.b.f90579d) != 2) {
                            z11 = false;
                        }
                        i9.j.n(i9.j.f60415f, z11);
                    }
                }
                qb.c.b("whiz", "time consume, updateStudyConfig: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                return Boolean.TRUE;
            } catch (Exception e12) {
                qb.c.b(SchedulePrepareObservables.f24809a, "update study config failed, cause: " + e12.toString(), new Object[0]);
                e12.printStackTrace();
                return Boolean.FALSE;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c0 implements wb0.p<UserStudyApiService.Client, BookRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ScheduleRecord f24824a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f24825b;

        public c0(final ScheduleRecord val$scheduleRecord, final d0 val$env) {
            this.f24824a = val$scheduleRecord;
            this.f24825b = val$env;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BookRecord call(UserStudyApiService.Client client) {
            if (this.f24824a == null) {
                throw new PrepareException(3, "空计划");
            }
            long currentTimeMillis = System.currentTimeMillis();
            BookRecord lazyLoadCurrentBookRecord = BookListManager.getInstance().lazyLoadCurrentBookRecord(this.f24825b.f24828a, this.f24824a);
            qb.c.b(SchedulePrepareObservables.f24809a, "loadBook input: " + this.f24824a + "; output: " + lazyLoadCurrentBookRecord, new Object[0]);
            if (lazyLoadCurrentBookRecord == null) {
                throw new PrepareException(3, "找不到书" + this.f24824a.bookId);
            }
            BookRecord k11 = this.f24825b.f24830c.k();
            if (k11 != null) {
                lazyLoadCurrentBookRecord.updateRemoteInfo(k11);
            }
            if (lazyLoadCurrentBookRecord.dailyCount == 0) {
                qb.c.b(SchedulePrepareObservables.f24809a, "loadBook " + lazyLoadCurrentBookRecord, new Object[0]);
                UserRecord.Role role = q9.x.r().p().getRole();
                throw new ForceSelectException(role != null ? role.grade : 0);
            }
            qb.c.b(SchedulePrepareObservables.f24809a, "time consume, loadBook: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            fh.g.f51865a.g();
            return lazyLoadCurrentBookRecord;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements wb0.o<rx.c<Boolean>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24826a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.p<List<RoadmapRecord>, Boolean> {
            public a() {
            }

            @Override // wb0.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean call(List<RoadmapRecord> records) {
                qb.c.i(SchedulePrepareObservables.f24809a, "loadRoadmap %d", Integer.valueOf(records.size()));
                d.this.f24826a.f24830c.o0(records);
                return Boolean.TRUE;
            }
        }

        public d(final d0 val$env) {
            this.f24826a = val$env;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Boolean> call() {
            rx.c U3 = SchedulePrepareObservables.W(this.f24826a).U3(SchedulePrepareObservables.X(this.f24826a));
            BookRecord k11 = this.f24826a.f24830c.k();
            qb.c.b(SchedulePrepareObservables.f24809a, "loadRoadmap, local ver: " + k11.localRoadmapVer + "; remote ver: " + k11.remoteRoadmapVer, new Object[0]);
            d0 d0Var = this.f24826a;
            if ((d0Var.f24829b & 1) > 0) {
                long j11 = k11.localRoadmapVer;
                if (j11 == 0 || j11 != k11.remoteRoadmapVer) {
                    U3 = SchedulePrepareObservables.X(d0Var).U3(U3);
                }
            }
            return U3.c3(new a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d0 {

        /* renamed from: a, reason: collision with root package name */
        public Context f24828a;

        /* renamed from: b, reason: collision with root package name */
        public int f24829b;

        /* renamed from: c, reason: collision with root package name */
        public q9.x f24830c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f24831d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f24832e;

        /* renamed from: f, reason: collision with root package name */
        public UserBasicInfoPlusV2 f24833f;

        /* renamed from: g, reason: collision with root package name */
        public int f24834g;

        /* renamed from: h, reason: collision with root package name */
        public UserLimitInfoV2 f24835h;

        /* renamed from: i, reason: collision with root package name */
        public PrimarySchoolModeConfig f24836i;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Callable<List<RoadmapRecord>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24837a;

        public e(final d0 val$env) {
            this.f24837a = val$env;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<RoadmapRecord> call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            qb.c.b(SchedulePrepareObservables.f24809a, "roadmapFromClient " + this.f24837a.f24830c.l(), new Object[0]);
            d0 d0Var = this.f24837a;
            List<RoadmapRecord> loadRoadmap = RoadmapUtils.loadRoadmap(d0Var.f24828a, d0Var.f24830c.l());
            qb.c.b("whiz", "time consume, loadRoadmap: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            if (loadRoadmap != null && loadRoadmap.size() > 0) {
                return loadRoadmap;
            }
            qb.c.b(SchedulePrepareObservables.f24809a, "roadmapFromClient failed", new Object[0]);
            throw new PrepareException(4, "roadmapFromClient failed");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e0 {

        /* renamed from: a, reason: collision with root package name */
        public dc0.c<f0> f24838a;

        /* renamed from: b, reason: collision with root package name */
        public int f24839b;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements wb0.p<UserStudyApiService.Client, List<RoadmapRecord>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24840a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements e.b<UserRoadMapElementV2, RoadmapRecord> {
            public a() {
            }

            @Override // xb.e.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RoadmapRecord map(UserRoadMapElementV2 t11) {
                return RoadmapRecord.from(t11);
            }
        }

        public f(final d0 val$env) {
            this.f24840a = val$env;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<RoadmapRecord> call(UserStudyApiService.Client client) {
            long currentTimeMillis = System.currentTimeMillis();
            qb.c.b(SchedulePrepareObservables.f24809a, "roadmapFromServer: " + this.f24840a.f24830c.k(), new Object[0]);
            List<RoadmapRecord> list = Collections.EMPTY_LIST;
            BookRecord k11 = this.f24840a.f24830c.k();
            int i11 = k11.bookId;
            try {
                List<UserRoadMapElementV2> roadmap_by_word_level_v2 = client.roadmap_by_word_level_v2(i11);
                if (!xb.e.h(roadmap_by_word_level_v2)) {
                    list = xb.e.j(roadmap_by_word_level_v2, new a());
                    if (RoadmapUtils.saveRoadmap(i11, list)) {
                        qb.c.b(SchedulePrepareObservables.f24809a, "save roadmap " + i11 + " size " + list.size(), new Object[0]);
                        this.f24840a.f24830c.o0(list);
                        d0 d0Var = this.f24840a;
                        d0Var.f24834g = d0Var.f24834g | 2;
                        if (0 != k11.remoteBookResVer) {
                            k11.localRoadmapVer = k11.remoteRoadmapVer;
                        }
                        i9.a.n(d0Var.f24828a, k11);
                    }
                }
                qb.c.i(SchedulePrepareObservables.f24809a, "elements size %d", Integer.valueOf(roadmap_by_word_level_v2 == null ? -1 : roadmap_by_word_level_v2.size()));
                i9.f.j(this.f24840a.f24828a, "global.word_cloze_book_table_base." + i11, false);
                qb.c.b("whiz", "time consume, roadmapFromServer: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            } catch (Exception e11) {
                qb.c.c(SchedulePrepareObservables.f24809a, "roadmapFromServer failed. ", e11);
            }
            if (list.size() != 0) {
                return list;
            }
            throw new PrepareException(4, "roadmapFromServer error");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f0 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f24842c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f24843d = 2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f24844e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f24845f = 8;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public static final int f24846g = 16;

        /* renamed from: h, reason: collision with root package name */
        public static final int f24847h = 32;

        /* renamed from: a, reason: collision with root package name */
        public String f24848a;

        /* renamed from: b, reason: collision with root package name */
        public int f24849b;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements wb0.p<UserStudyApiService.Client, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24850a;

        public g(final d0 val$env) {
            this.f24850a = val$env;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
        
            if (r8 <= 1) goto L27;
         */
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean call(com.baicizhan.online.user_study_api.UserStudyApiService.Client r15) {
            /*
                Method dump skipped, instructions count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.rx.SchedulePrepareObservables.g.call(com.baicizhan.online.user_study_api.UserStudyApiService$Client):java.lang.Boolean");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements wb0.o<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24851a;

        public h(final d0 val$env) {
            this.f24851a = val$env;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            long currentTimeMillis = System.currentTimeMillis();
            if (LearnRecordManager.A().d0()) {
                this.f24851a.f24834g |= 4;
            }
            qb.c.b(SchedulePrepareObservables.f24809a, "time consume, verifyLearnRecord: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements wb0.o<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24852a;

        public i(final d0 val$env) {
            this.f24852a = val$env;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            long currentTimeMillis = System.currentTimeMillis();
            q9.x xVar = this.f24852a.f24830c;
            Map<Integer, WordClozeRecord> I = xVar.I();
            if (I != null && !I.isEmpty()) {
                return Boolean.TRUE;
            }
            List<Integer> z11 = xVar.z();
            Map<Integer, WordClozeRecord> b11 = i9.n.b(this.f24852a.f24828a, xVar.l(), z11, true);
            if (b11 == null || b11.isEmpty()) {
                b11 = i9.n.b(this.f24852a.f24828a, xVar.l(), z11, false);
            }
            xVar.D0(b11);
            qb.c.b("whiz", "time consume, loadWordClozeRecordMap: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements wb0.o<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24853a;

        public j(final d0 val$env) {
            this.f24853a = val$env;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            long currentTimeMillis = System.currentTimeMillis();
            q9.x xVar = this.f24853a.f24830c;
            int A = xVar.A();
            BookRecord k11 = xVar.k();
            ScheduleRecord o11 = xVar.o();
            int remainCount = k11.getRemainCount();
            k11.finishCount = LearnRecordManager.A().M();
            if (A > 0) {
                k11.wordCount = A;
            }
            int i11 = k11.dailyCount;
            int i12 = xVar.m().wantMoreCount;
            int max = Math.max(LearnRecordManager.A().H(), Math.min(remainCount, i11 + i12));
            o11.completeReviewMode = false;
            LearnRecordManager A2 = LearnRecordManager.A();
            if (remainCount == 0 && A2.H() == 0) {
                max = A2.M() - A2.B();
                qb.c.b(SchedulePrepareObservables.f24809a, "allReviewCount " + max, new Object[0]);
                int c11 = ia.a.c(ia.a.f60459j);
                if (c11 <= max) {
                    max = c11;
                }
                if (max == 0) {
                    max = k11.reviewCount;
                }
                o11.completeReviewMode = true;
            }
            xVar.B0(max);
            qb.c.b(SchedulePrepareObservables.f24809a, "fixSchedule [totalCount %d, learned %d, remainCount %d, dailyNewCount %d, todayNewCount %d, wantMoreCount %d]", Integer.valueOf(A), Integer.valueOf(LearnRecordManager.A().M()), Integer.valueOf(remainCount), Integer.valueOf(i11), Integer.valueOf(max), Integer.valueOf(i12));
            i9.a.n(this.f24853a.f24828a, k11);
            i9.a.t(this.f24853a.f24828a, o11, new String[0]);
            qb.c.b(SchedulePrepareObservables.f24809a, "save current book " + k11, new Object[0]);
            qb.c.b(SchedulePrepareObservables.f24809a, "save current schedule " + o11, new Object[0]);
            qb.c.b(SchedulePrepareObservables.f24809a, "time consume, fixAll: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k extends qb0.g<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0 f24854a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f24855b;

        public k(final e0 val$wrapper, final Context val$context) {
            this.f24854a = val$wrapper;
            this.f24855b = val$context;
        }

        @Override // qb0.c
        public void onCompleted() {
            SchedulePrepareObservables.a0(this.f24854a);
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            this.f24854a.f24838a.onError(e11);
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            f0 f0Var = new f0();
            f0Var.f24849b = (aBoolean == null || !aBoolean.booleanValue()) ? 8 : 4;
            Context context = this.f24855b;
            i9.f.n(context, i9.f.f60373g0, (String) k0.c(context).first, false);
            e0 e0Var = this.f24854a;
            e0Var.f24839b |= f0Var.f24849b;
            e0Var.f24838a.onNext(f0Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24856a;

        public l(final d0 val$env) {
            this.f24856a = val$env;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            SchedulePrepareObservables.Q(this.f24856a);
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m extends qb0.g<Boolean> {
        @Override // qb0.c
        public void onError(Throwable e11) {
            SchedulePrepareObservables.f24816h.onNext(Boolean.FALSE);
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            SchedulePrepareObservables.f24816h.onNext(Boolean.TRUE);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class n implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24857a;

        public n(final d0 val$env) {
            this.f24857a = val$env;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r16v0 */
        /* JADX WARN: Type inference failed for: r16v1 */
        /* JADX WARN: Type inference failed for: r16v2 */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            boolean z11;
            q9.x xVar = this.f24857a.f24830c;
            if (xVar.b0()) {
                qb.c.b(SchedulePrepareObservables.f24809a, "initLearningManager cancelled for studying..", new Object[0]);
                return Boolean.TRUE;
            }
            xVar.u0(true);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                Context context = this.f24857a.f24828a;
                qb.c.b(SchedulePrepareObservables.f24809a, "initLearningManager " + this.f24857a.f24834g + j2.O + this.f24857a.f24829b, new Object[0]);
                ad.a s11 = xVar.s();
                if (s11 == null) {
                    try {
                        SchedulePrepareObservables.I(context).t6().p();
                        s11 = xVar.s();
                        if (s11 == null) {
                            throw new PrepareException(5, "初始化学习策略失败");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = false;
                        xVar.u0(z11);
                        throw th;
                    }
                }
                ad.a aVar = s11;
                try {
                    if (aVar.E()) {
                        d0 d0Var = this.f24857a;
                        if (d0Var.f24834g == 0 && (d0Var.f24829b & 4) == 0) {
                            b(aVar);
                            Boolean bool = Boolean.TRUE;
                            xVar.u0(false);
                            return bool;
                        }
                    }
                } catch (Exception e11) {
                    qb.c.c(SchedulePrepareObservables.f24809a, "", e11);
                }
                qb.c.b(SchedulePrepareObservables.f24809a, "***** reinit LearningManager", new Object[0]);
                long currentTimeMillis2 = System.currentTimeMillis();
                Map<Integer, yc.b> x11 = xVar.x();
                x11.clear();
                List<yc.b> i11 = xVar.i(xVar.A());
                List<Integer> z12 = xVar.z();
                Map<Integer, WordClozeRecord> I = xVar.I();
                int l11 = q9.x.r().l();
                ?? r16 = 1;
                qb.c.b(SchedulePrepareObservables.f24809a, "***** middle", new Object[0]);
                Map<Integer, Integer> g11 = i9.l.g(context, l11);
                qb.c.b(SchedulePrepareObservables.f24809a, "***** queryAllTopicRecordCoverage", new Object[0]);
                for (int i12 = 0; i12 < i11.size(); i12++) {
                    yc.b bVar = i11.get(i12);
                    Integer num = z12.get(i12);
                    int intValue = num.intValue();
                    x11.put(num, bVar);
                    bVar.x0(intValue);
                    Integer num2 = g11.get(num);
                    if (I.get(num) != null) {
                        num2 = Integer.valueOf(num2 == null ? 1 : num2.intValue() | 1);
                    }
                    sh.e.e().f(intValue, num2 == null ? 0 : num2.intValue());
                }
                qb.c.b(SchedulePrepareObservables.f24809a, "***** after judgeClozeMode", new Object[0]);
                HashMap hashMap = new HashMap();
                long j11 = currentTimeMillis2 - 86400000;
                boolean z13 = LearnRecordManager.A().L().values().size() >= z12.size();
                qb.c.i(SchedulePrepareObservables.f24809a, "initLearningManagerObs getTotalTableSize:" + LearnRecordManager.A().M(), new Object[0]);
                boolean z14 = z13;
                for (TopicLearnRecord topicLearnRecord : LearnRecordManager.A().L().values()) {
                    yc.b bVar2 = x11.get(Integer.valueOf(topicLearnRecord.topicId));
                    Map<Integer, yc.b> map = x11;
                    bVar2.x0(topicLearnRecord.topicId);
                    int i13 = topicLearnRecord.topicScore;
                    boolean z15 = z14;
                    if (i13 == 3 && z15) {
                        i13++;
                    }
                    bVar2.D0(i13);
                    if (topicLearnRecord.topicDay == 0) {
                        bVar2.y0(currentTimeMillis2);
                    } else {
                        bVar2.y0(j11);
                    }
                    int i14 = topicLearnRecord.extra.f16072ls;
                    if (i14 > 0) {
                        bVar2.A0(i14);
                    }
                    int i15 = topicLearnRecord.extra.f16073ms;
                    if (i15 > 0) {
                        bVar2.t0(i15);
                    }
                    boolean z16 = r16;
                    bVar2.E0(topicLearnRecord.isTodayNew == z16 ? z16 : false);
                    bVar2.B0(topicLearnRecord.extra.reviewedMore ? 1 : 0);
                    bVar2.w0(0);
                    bVar2.C0(topicLearnRecord.reviewRound);
                    hashMap.put(Integer.valueOf(topicLearnRecord.topicId), bVar2);
                    x11 = map;
                    z14 = z15;
                    r16 = 1;
                }
                qb.c.i(SchedulePrepareObservables.f24809a, "problems %d, doneProblems %d, roadmapOrder %d", Integer.valueOf(i11.size()), Integer.valueOf(hashMap.size()), Integer.valueOf(z12.size()));
                aVar.A(i11, hashMap);
                b(aVar);
                qb.c.b("whiz", "time consume, initLearningManager: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                Boolean bool2 = Boolean.TRUE;
                xVar.u0(false);
                return bool2;
            } catch (Throwable th3) {
                th = th3;
                z11 = false;
                xVar.u0(z11);
                throw th;
            }
        }

        public final void b(ad.a lm2) {
            lm2.w(this.f24857a.f24830c.D(), sh.e.b());
            lm2.D(null);
            qb.c.i(SchedulePrepareObservables.f24809a, "try setSequenceModeNewAndReview " + this.f24857a.f24830c.D() + ", getNewLearningCount " + lm2.u().d() + ", getReviewCount " + lm2.u().a(), new Object[0]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class p implements Callable<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f24858a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f24859b;

        public p(final Object val$object, final String val$key) {
            this.f24858a = val$object;
            this.f24859b = val$key;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            String z11 = new com.google.gson.d().z(this.f24858a);
            int i11 = 0;
            while (i11 < z11.length()) {
                int i12 = 3000;
                if (z11.length() - i11 <= 3000) {
                    i12 = z11.length() - i11;
                }
                int i13 = i12 + i11;
                qb.c.i(SchedulePrepareObservables.f24809a, "%s %s", this.f24859b, z11.substring(i11, i13));
                i11 = i13;
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class q implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24860a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends bp.a<List<Integer>> {
            public a() {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends bp.a<List<Integer>> {
            public b() {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c extends bp.a<List<Integer>> {
            public c() {
            }
        }

        public q(final d0 val$env) {
            this.f24860a = val$env;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            String h11 = i9.f.h(i9.f.Y, String.valueOf(this.f24860a.f24830c.l()));
            List<Integer> B = this.f24860a.f24830c.B();
            if (B == null || B.isEmpty()) {
                List<Integer> list = (List) i9.f.e(this.f24860a.f24828a, h11, new a().getType(), false);
                if (list != null && !list.isEmpty() && SchedulePrepareObservables.Y(list)) {
                    list.clear();
                    i9.f.l(this.f24860a.f24828a, h11, list, new b().getType(), false);
                }
                this.f24860a.f24830c.y0(list);
            } else {
                if (!B.isEmpty() && SchedulePrepareObservables.Y(B)) {
                    String g11 = sh.f.g(q9.x.r().l(), 7);
                    int a11 = gi.m.a(7, 50);
                    this.f24860a.f24830c.d0(g11, a11);
                    i9.f.k(this.f24860a.f24828a, g11, a11);
                    B.clear();
                    this.f24860a.f24830c.y0(B);
                }
                i9.f.l(this.f24860a.f24828a, h11, B, new c().getType(), false);
            }
            qb.c.b("whiz", "time consume, updateSpeedListenIds: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class r implements wb0.o<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24864a;

        public r(final d0 val$env) {
            this.f24864a = val$env;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            long currentTimeMillis = System.currentTimeMillis();
            boolean b11 = sh.u.b(this.f24864a.f24828a);
            qb.c.b(SchedulePrepareObservables.f24809a, "time consume, refreshUpdateFlagMD5: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return Boolean.valueOf(b11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class s implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24865a;

        public s(final d0 val$env) {
            this.f24865a = val$env;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            String f11 = ia.a.f(ia.a.f60466q);
            String todayDateString = TimeUtil.getTodayDateString();
            boolean equals = TextUtils.equals(f11, todayDateString);
            SchedulePrepareObservables.x(this.f24865a, !equals);
            if (!equals) {
                ia.a.m(ia.a.f60466q, todayDateString);
            }
            qb.c.b(SchedulePrepareObservables.f24809a, "time consume, getPlusReviewCounts: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class t extends bp.a<List<Integer>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class u implements e.b<UserRoadMapElementV2, RoadmapRecord> {
        @Override // xb.e.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RoadmapRecord map(UserRoadMapElementV2 t11) {
            return RoadmapRecord.from(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class w implements wb0.b<Notification<? super Boolean>> {
        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Notification<? super Boolean> notification) {
            qb.c.b(SchedulePrepareObservables.f24809a, "loadLeaningManager " + notification, new Object[0]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class x implements c.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f24868a;

        public x(final Context val$context) {
            this.f24868a = val$context;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super Boolean> subscriber) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                qb.c.b(SchedulePrepareObservables.f24809a, "loadLearningManager start " + currentTimeMillis, new Object[0]);
                if (!SchedulePrepareObservables.f24810b) {
                    SchedulePrepareObservables.f24810b = true;
                    zc.c.d().e(-1);
                }
                qb.c.b(SchedulePrepareObservables.f24809a, "time consume, JsRuntime: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                String readTextStringFromRaw = FileUtils.readTextStringFromRaw(this.f24868a.getResources(), R.raw.learning_strategy);
                if (TextUtils.isEmpty(readTextStringFromRaw)) {
                    throw new PrepareException(5, "读取学习策略失败");
                }
                qb.c.b(SchedulePrepareObservables.f24809a, "time consume, readTextStringFromRaw: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                boolean c02 = q9.x.r().c0(readTextStringFromRaw);
                if (!subscriber.isUnsubscribed()) {
                    qb.c.b(SchedulePrepareObservables.f24809a, "loadLearningManager " + c02 + j2.O + readTextStringFromRaw.length(), new Object[0]);
                    if (c02) {
                        subscriber.onNext(Boolean.TRUE);
                        subscriber.onCompleted();
                    } else {
                        qb.c.d(SchedulePrepareObservables.f24809a, "try again ...", new Object[0]);
                        zc.c.d().e(-1);
                        if (!q9.x.r().c0(readTextStringFromRaw)) {
                            qb.c.d(SchedulePrepareObservables.f24809a, "still failed ...", new Object[0]);
                            throw new PrepareException(5, "加载学习策略失败");
                        }
                        subscriber.onNext(Boolean.TRUE);
                        subscriber.onCompleted();
                    }
                }
                qb.c.b(SchedulePrepareObservables.f24809a, "time consume, loadLearningManager: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            } catch (Exception e11) {
                qb.c.q(SchedulePrepareObservables.f24809a, "loadLearningManager error: " + e11.getMessage(), new Object[0]);
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onError(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class y implements wb0.p<ScheduleRecord, rx.c<ScheduleRecord>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24869a;

        public y(final d0 val$env) {
            this.f24869a = val$env;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<ScheduleRecord> call(ScheduleRecord scheduleRecord) {
            if (scheduleRecord != null && scheduleRecord.bookId > 0) {
                return rx.c.M2(scheduleRecord);
            }
            qb.c.d(SchedulePrepareObservables.f24809a, "pre load schedule failed, try from server again. invalid schedule: " + scheduleRecord, new Object[0]);
            return SchedulePrepareObservables.N(this.f24869a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class z implements wb0.p<Pair<ScheduleRecord, BookRecord>, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f24870a;

        public z(final d0 val$env) {
            this.f24870a = val$env;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Pair<ScheduleRecord, BookRecord> scheduleRecordBookRecordPair) {
            long currentTimeMillis = System.currentTimeMillis();
            d0 d0Var = this.f24870a;
            Context context = d0Var.f24828a;
            q9.x xVar = d0Var.f24830c;
            ScheduleRecord scheduleRecord = (ScheduleRecord) scheduleRecordBookRecordPair.first;
            BookRecord bookRecord = (BookRecord) scheduleRecordBookRecordPair.second;
            ScheduleRecord o11 = xVar.o();
            if (o11 == null || o11.bookId != scheduleRecord.bookId) {
                qb.c.i(SchedulePrepareObservables.f24809a, "update new schedule " + scheduleRecord, new Object[0]);
                d0 d0Var2 = this.f24870a;
                d0Var2.f24834g = d0Var2.f24834g | 1;
                d0Var2.f24832e = true;
                ScheduleRecord k11 = i9.a.k(context, scheduleRecord.bookId);
                if (k11 != null) {
                    scheduleRecord.localSyncVer = k11.localSyncVer;
                }
                xVar.d();
                xVar.p0(scheduleRecord);
                tj.z.g().f();
            } else {
                qb.c.i(SchedulePrepareObservables.f24809a, "update old schedule", new Object[0]);
                this.f24870a.f24832e = false;
                o11.bookName = scheduleRecord.bookName;
                o11.remoteSyncVer = scheduleRecord.remoteSyncVer;
                o11.dakaDays = scheduleRecord.dakaDays;
                o11.descImage = scheduleRecord.descImage;
                o11.desc = scheduleRecord.desc;
                o11.dailyCount = scheduleRecord.dailyCount;
                o11.reviewCount = scheduleRecord.reviewCount;
                xVar.p0(o11);
            }
            qb.c.b(SchedulePrepareObservables.f24809a, "setCurrentBook [hash, bookRecord] [hash,newSchedule] [%d,%s] [%d,%s]", Integer.valueOf(bookRecord.hashCode()), bookRecord.toString(), Integer.valueOf(scheduleRecord.hashCode()), scheduleRecord.toString());
            xVar.m0(bookRecord);
            i9.a.q(context, scheduleRecord);
            i9.j.k("current_book_id", bookRecord.bookId);
            qb.c.b(SchedulePrepareObservables.f24809a, "time consume, loadSchedule end: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return Boolean.TRUE;
        }
    }

    public static rx.c<Boolean> A(final d0 env) {
        return rx.c.z2(new s(env)).w5(bc0.c.e());
    }

    public static rx.c<UserStudyApiService.Client> B() {
        return com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/user_study").c(1).b(3000).d(3000));
    }

    public static rx.c<Boolean> C(final d0 env) {
        return rx.c.z2(new l(env));
    }

    public static rx.c<Boolean> D(final d0 env) {
        return rx.c.z2(new n(env));
    }

    public static rx.c<Boolean> E() {
        return f24816h;
    }

    public static rx.c<f0> F(final Context context, final int requestFlag) {
        qb.c.i(f24809a, "start refresh %d", Integer.valueOf(requestFlag));
        f24816h.onNext(Boolean.FALSE);
        d0 d0Var = new d0();
        d0Var.f24828a = context;
        d0Var.f24829b = requestFlag;
        d0Var.f24830c = q9.x.r();
        d0Var.f24835h = q9.x.r().G();
        if (hi.e.d() || ch.m.f8648a.a() == e.C0296e.f19310d) {
            d0Var.f24834g |= 4;
        }
        e0 e0Var = new e0();
        e0Var.f24838a = dc0.c.y7();
        b0(context, e0Var).p5();
        rx.c<Boolean> M2 = requestFlag == 0 ? rx.c.M2(Boolean.TRUE) : L(context, d0Var);
        rx.c<Boolean> cVar = f24815g;
        if (cVar == null) {
            cVar = I(context);
        }
        rx.c.j3(M2, cVar).f1(rx.c.j3(C(d0Var), d0(d0Var))).H5(1).w5(bc0.c.a()).r5(new k(e0Var, context));
        return e0Var.f24838a;
    }

    public static rx.c<BookRecord> G(final d0 env, final ScheduleRecord scheduleRecord) {
        return B().w5(bc0.c.e()).c3(new c0(scheduleRecord, env));
    }

    public static rx.c<Boolean> H(final d0 env) {
        return com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/user_study").c(1).b(3000).d(5000)).w5(bc0.c.a()).c3(new g(env));
    }

    public static rx.c<Boolean> I(final Context context) {
        return rx.c.j1(new x(context)).w5(bc0.c.a()).J1(new w());
    }

    public static rx.c<Boolean> J(final d0 env) {
        return rx.c.r1(new d(env));
    }

    public static rx.c<Boolean> K(final d0 env) {
        rx.c b22;
        ScheduleRecord C = env.f24830c.C();
        if (C != null) {
            env.f24830c.A0(null);
            b22 = rx.c.M2(C);
        } else {
            if (i9.f.c(env.f24828a, i9.f.f60361a0)) {
                env.f24829b |= 1;
            } else {
                String g11 = i9.f.g(env.f24828a, i9.f.f60373g0, false);
                if (g11 == null || !g11.equals(k0.c(env.f24828a).first)) {
                    env.f24829b |= 1;
                }
            }
            b22 = ((env.f24829b & 1) > 0 ? N(env).V3(new wb0.p() { // from class: th.l
                @Override // wb0.p
                public final Object call(Object obj) {
                    return SchedulePrepareObservables.c(SchedulePrepareObservables.d0.this, (Throwable) obj);
                }
            }) : M(env).U3(N(env))).b2(new y(env));
        }
        return b22.b2(new a0(env)).c3(new z(env));
    }

    public static rx.c<Boolean> L(Context context, d0 env) {
        return K(env).f1(R(env).f1(J(env))).f1(rx.c.k3(H(env), V(env), A(env)).f1(f0(env)).f1(y(env))).H5(1);
    }

    public static rx.c<ScheduleRecord> M(final d0 env) {
        return rx.c.z2(new a(env)).w5(bc0.c.e());
    }

    public static rx.c<ScheduleRecord> N(final d0 env) {
        return B().w5(bc0.c.e()).c3(new b(env));
    }

    public static rx.c<Boolean> O(final d0 env) {
        return rx.c.z2(new i(env)).w5(bc0.c.e());
    }

    public static void P() {
        if (f24815g == null) {
            synchronized (SchedulePrepareObservables.class) {
                try {
                    if (f24815g == null) {
                        yb0.c u42 = rx.c.r7(I(pb.a.a().getApplicationContext()), ((x0) qu.e.d(pb.a.a(), x0.class)).a().Y(), new wb0.q() { // from class: th.m
                            @Override // wb0.q
                            public final Object call(Object obj, Object obj2) {
                                Boolean bool;
                                bool = Boolean.TRUE;
                                return bool;
                            }
                        }).u4();
                        f24815g = u42;
                        u42.z7();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void Q(final d0 env) {
        O(env).b2(new wb0.p() { // from class: th.o
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c w52;
                w52 = SchedulePrepareObservables.D(SchedulePrepareObservables.d0.this).w5(bc0.c.b(SchedulePrepareObservables.f24817i));
                return w52;
            }
        }).r5(new m());
    }

    public static rx.c<Boolean> R(final d0 env) {
        return rx.c.z2(new b0(env));
    }

    public static void S(Context context, BookRecord bookRecord) {
        try {
            ResourceService.Client client = (ResourceService.Client) com.baicizhan.client.business.thrift.c.b().c("/rpc/resource_api");
            bookRecord.updateSelectedInfo(client.get_book_resource_update_info(bookRecord.bookId));
            if (bookRecord.localRadioResVer != bookRecord.remoteRadioResVer) {
                j9.a.m(context, bookRecord.bookId, client);
                bookRecord.localRadioResVer = bookRecord.remoteRadioResVer;
                i9.a.s(context, bookRecord, "localRadioResVer");
            }
            if (bookRecord.localRoadmapVer != bookRecord.remoteRoadmapVer) {
                w(context, bookRecord);
            }
        } catch (Throwable th2) {
            qb.c.c(f24809a, "refresh book resource update info failed. ", th2);
        }
        U(context, bookRecord);
    }

    public static rx.c<UserLimitInfoV2> T(final Context context, final BookRecord bookRecord) {
        return com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/user_study")).c3(new wb0.p() { // from class: th.p
            @Override // wb0.p
            public final Object call(Object obj) {
                return SchedulePrepareObservables.b(context, bookRecord, (UserStudyApiService.Client) obj);
            }
        });
    }

    public static void U(Context context, BookRecord bookRecord) {
        try {
            qb.c.b(f24809a, "set localBookResVer: %d; remoteBookResVer: %d", Long.valueOf(bookRecord.localBookResVer), Long.valueOf(bookRecord.remoteBookResVer));
            long j11 = bookRecord.localBookResVer;
            if (j11 != 0) {
                long j12 = bookRecord.remoteBookResVer;
                if (j12 <= 0 || j11 == j12) {
                    return;
                }
            }
            sh.u.b(context);
        } catch (Exception e11) {
            qb.c.d(f24809a, "refreshBookLastUpdatedTime failed. " + e11, new Object[0]);
        }
    }

    public static rx.c<Boolean> V(final d0 env) {
        return (env.f24829b & 16) > 0 ? rx.c.z2(new r(env)).w5(bc0.c.e()) : rx.c.M2(Boolean.TRUE);
    }

    public static rx.c<List<RoadmapRecord>> W(final d0 env) {
        return rx.c.z2(new e(env)).w5(bc0.c.e());
    }

    public static rx.c<List<RoadmapRecord>> X(final d0 env) {
        return B().w5(bc0.c.e()).c3(new f(env));
    }

    public static boolean Y(List<Integer> listenSpeedIds) {
        HashSet hashSet = new HashSet(listenSpeedIds);
        for (TopicLearnRecord topicLearnRecord : LearnRecordManager.A().L().values()) {
            if (!LearnRecordManager.A().R(topicLearnRecord.topicId) && !hashSet.contains(Integer.valueOf(topicLearnRecord.topicId))) {
                return false;
            }
        }
        return true;
    }

    public static void Z(final String key, final Object object) {
        if (object == null) {
            return;
        }
        rx.c.z2(new p(object, key)).w5(bc0.c.e()).r5(new o());
    }

    public static void a0(e0 wrapper) {
        int i11 = wrapper.f24839b;
        if ((i11 & 4) > 0 || (i11 & 8) > 0) {
            if ((i11 & 1) > 0 || (i11 & 2) > 0) {
                wrapper.f24838a.onCompleted();
            }
        }
    }

    public static /* synthetic */ UserLimitInfoV2 b(Context context, BookRecord bookRecord, UserStudyApiService.Client client) {
        Exception exc;
        UserLimitInfoV2 userLimitInfoV2 = null;
        r2 = null;
        PrimarySchoolModeConfig primarySchoolModeConfig = null;
        try {
            UserLimitInfoV2 user_limit_info_v2 = client.user_limit_info_v2();
            if (user_limit_info_v2 != null) {
                try {
                    if (user_limit_info_v2.cur_book_has_primary_school_mode == 1) {
                        primarySchoolModeConfig = client.get_primary_school_mode_config();
                    }
                } catch (Exception e11) {
                    exc = e11;
                    userLimitInfoV2 = user_limit_info_v2;
                    qb.c.c(f24809a, "refresh user limit failed.", exc);
                    return userLimitInfoV2;
                }
            }
            PrimarySchoolModeConfig primarySchoolModeConfig2 = primarySchoolModeConfig;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("refreshLimitInfo: state = ");
            String str = "null";
            sb2.append(primarySchoolModeConfig2 == null ? "null" : Integer.valueOf(primarySchoolModeConfig2.state));
            qb.c.i(f24809a, sb2.toString(), new Object[0]);
            if (user_limit_info_v2 != null) {
                str = user_limit_info_v2.toString();
            }
            qb.c.i(f24809a, "limit info : %s", str);
            u(context, null, bookRecord == null ? -1 : bookRecord.bookId, user_limit_info_v2, primarySchoolModeConfig2, true);
            return user_limit_info_v2;
        } catch (Exception e12) {
            exc = e12;
        }
    }

    public static rx.c<f0> b0(final Context context, final e0 wrapper) {
        return rx.c.j1(new v(context, wrapper)).w5(bc0.c.b(f24811c));
    }

    public static /* synthetic */ rx.c c(d0 d0Var, Throwable th2) {
        int code;
        return ((th2 instanceof PrepareException) && ((code = ((PrepareException) th2).getCode()) == 2 || code == 7)) ? rx.c.T1(th2) : M(d0Var);
    }

    public static void c0(d0 env, List<Integer> updateList, String probKey) {
        int f11 = sh.f.f(probKey);
        int intValue = updateList.get(f11).intValue();
        String h11 = sh.f.h(env.f24830c.l(), probKey);
        int max = Math.max(env.f24830c.t(h11), intValue);
        updateList.set(f11, Integer.valueOf(max));
        env.f24830c.d0(h11, max);
    }

    public static /* synthetic */ Void d(Context context, BookRecord bookRecord, long j11, UserLimitInfoV2 userLimitInfoV2) {
        S(context, bookRecord);
        qb.c.b("whiz", "time consume, refreshUserLimit: " + (System.currentTimeMillis() - j11), new Object[0]);
        return null;
    }

    public static rx.c<Boolean> d0(final d0 env) {
        return rx.c.z2(new q(env)).w5(bc0.c.a());
    }

    public static rx.c<Boolean> e0(final d0 env) {
        return B().c3(new c());
    }

    public static rx.c<Boolean> f0(final d0 env) {
        return rx.c.z2(new h(env)).w5(bc0.c.a());
    }

    public static void u(@NonNull Context context, @Nullable d0 env, int bookId, UserLimitInfoV2 userlimit, PrimarySchoolModeConfig primarySchoolModeConfig, boolean reset) {
        if (env != null) {
            env.f24835h = userlimit;
            env.f24836i = primarySchoolModeConfig;
        }
        if (userlimit == null) {
            i9.f.m(context, i9.f.N, 0L);
            return;
        }
        q9.x.r().C0(userlimit);
        hi.e.i(primarySchoolModeConfig);
        if (primarySchoolModeConfig != null || reset) {
            hi.e.h(context, primarySchoolModeConfig);
        }
        i9.f.m(context, i9.f.N, userlimit.getHas_word_friends());
        sh.e.e().d(1).g(userlimit.getSpell_mode());
        sh.e.e().d(2).g(userlimit.getListening_mode());
        sh.e.e().d(3).g(userlimit.getChn_mode());
        i9.h.f().g(ph.a.f80517a, userlimit.getNew_wiki() == 1);
        i9.h.f().g(ph.a.f80518b, userlimit.getChn_style() == 2);
        BookListManager.getInstance().setRemoteBookListVersion(userlimit.getUpdate_at_of_book_info());
        ch.m mVar = ch.m.f8648a;
        mVar.c(com.baicizhan.main.activity.schedule_v2.mutimode.data.e.f19301b.a(userlimit.current_mode));
        ((x0) qu.e.d(pb.a.a(), x0.class)).g().a(userlimit.x_mode_setting);
        u0.f80487a.x();
        mVar.a();
        e.a aVar = e.a.f19304d;
        ((q9.w) qu.e.d(pb.a.a(), q9.w.class)).i().a(userlimit.server_timestamp * 1000);
    }

    public static rx.c<Void> v(final Context context, final BookRecord bookRecord) {
        final long currentTimeMillis = System.currentTimeMillis();
        return T(context, bookRecord).c3(new wb0.p() { // from class: th.n
            @Override // wb0.p
            public final Object call(Object obj) {
                return SchedulePrepareObservables.d(context, bookRecord, currentTimeMillis, (UserLimitInfoV2) obj);
            }
        }).w5(bc0.c.e());
    }

    public static void w(Context context, BookRecord bookRecord) throws TException {
        qb.c.i(f24809a, "background %d", Integer.valueOf(bookRecord.bookId));
        List<UserRoadMapElementV2> roadmap_by_word_level_v2 = ((UserStudyApiService.Client) com.baicizhan.client.business.thrift.c.b().c("/rpc/user_study")).roadmap_by_word_level_v2(bookRecord.bookId);
        int i11 = bookRecord.bookId;
        if (!xb.e.h(roadmap_by_word_level_v2)) {
            List j11 = xb.e.j(roadmap_by_word_level_v2, new u());
            if (RoadmapUtils.saveRoadmap(i11, j11)) {
                qb.c.b(f24809a, "save roadmap " + i11 + "size " + j11.size(), new Object[0]);
                if (0 != bookRecord.remoteBookResVer) {
                    bookRecord.localRoadmapVer = bookRecord.remoteRoadmapVer;
                }
                i9.a.n(context, bookRecord);
            }
        }
        qb.c.i(f24809a, "elements size %d", Integer.valueOf(roadmap_by_word_level_v2 == null ? -1 : roadmap_by_word_level_v2.size()));
        i9.f.j(context, "global.word_cloze_book_table_base." + i11, false);
    }

    public static void x(d0 env, boolean dateChanged) {
        String h11 = i9.f.h(i9.f.X, String.valueOf(env.f24830c.l()));
        Type type = new t().getType();
        if (dateChanged) {
            env.f24830c.f();
            i9.f.b(env.f24828a, i9.f.X);
        }
        List list = (List) i9.f.e(env.f24828a, h11, type, false);
        if (list == null || list.size() != 7) {
            list = new ArrayList(7);
            for (int i11 = 0; i11 < 7; i11++) {
                list.add(0);
            }
        }
        c0(env, list, sh.f.f88600s);
        c0(env, list, sh.f.f88601t);
        c0(env, list, sh.f.f88602u);
        c0(env, list, sh.f.f88603v);
        c0(env, list, sh.f.f88604w);
        c0(env, list, sh.f.f88605x);
        c0(env, list, sh.f.f88606y);
        i9.f.l(env.f24828a, h11, list, type, false);
    }

    public static rx.c<Boolean> y(final d0 env) {
        return rx.c.z2(new j(env)).w5(bc0.c.a());
    }

    public static rx.c<BSUsers.Client> z() {
        return com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/users").c(1).b(3000).d(3000));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class o extends qb0.g<Object> {
        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }

        @Override // qb0.c
        public void onNext(Object o11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class v implements c.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f24866a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f24867b;

        public v(final Context val$context, final e0 val$wrapper) {
            this.f24866a = val$context;
            this.f24867b = val$wrapper;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00a6 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:3:0x0003, B:5:0x001a, B:8:0x0046, B:10:0x0068, B:11:0x0079, B:13:0x007f, B:15:0x0087, B:20:0x00a2, B:22:0x00a6, B:23:0x00b9), top: B:2:0x0003 }] */
        @Override // wb0.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void call(qb0.g<? super com.baicizhan.main.rx.SchedulePrepareObservables.f0> r13) {
            /*
                Method dump skipped, instructions count: 325
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.rx.SchedulePrepareObservables.v.call(qb0.g):void");
        }

        public static /* synthetic */ void a(Boolean bool) {
        }
    }
}
