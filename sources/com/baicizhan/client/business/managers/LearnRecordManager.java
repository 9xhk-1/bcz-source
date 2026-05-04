package com.baicizhan.client.business.managers;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.collection.LruCache;
import com.baicizhan.client.business.dataset.models.OfflineStateRecord;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.online.user_study_api.UserDoneWordRecord;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import com.google.android.material.timepicker.TimeModel;
import i9.k;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.jupiter.api.j2;
import q9.x;
import rx.c;
import wb0.p;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class LearnRecordManager {

    /* renamed from: l, reason: collision with root package name */
    public static final String f16378l = "LearnRecordManager";

    /* renamed from: m, reason: collision with root package name */
    public static volatile LearnRecordManager f16379m;

    /* renamed from: a, reason: collision with root package name */
    public Context f16380a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16382c;

    /* renamed from: e, reason: collision with root package name */
    public f f16384e;

    /* renamed from: f, reason: collision with root package name */
    public f f16385f;

    /* renamed from: g, reason: collision with root package name */
    public HandlerThread f16386g;

    /* renamed from: h, reason: collision with root package name */
    public Handler f16387h;

    /* renamed from: j, reason: collision with root package name */
    public g f16389j;

    /* renamed from: b, reason: collision with root package name */
    public int f16381b = -1;

    /* renamed from: d, reason: collision with root package name */
    public Map<Integer, TopicLearnRecord> f16383d = new ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public Long f16388i = 0L;

    /* renamed from: k, reason: collision with root package name */
    public Set<Integer> f16390k = new HashSet();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Answer {
        WRONG,
        CORRECT,
        KILL
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f16391a;

        public a(final int val$bookId) {
            this.f16391a = val$bookId;
        }

        @Override // java.lang.Runnable
        public void run() {
            LearnRecordManager.this.f16384e.b(LearnRecordManager.this.f16380a, this.f16391a);
            LearnRecordManager.this.f16385f.b(LearnRecordManager.this.f16380a, this.f16391a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends bp.a<TopicLearnRecord.Extra> {
        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements e.a<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f16394a;

        public c(final x val$sm) {
            this.f16394a = val$sm;
        }

        @Override // xb.e.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean filter(Integer id2) {
            return this.f16394a.X(id2.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements e.a<TopicLearnRecord> {
        public d() {
        }

        @Override // xb.e.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean filter(TopicLearnRecord topicLearnRecord) {
            return topicLearnRecord.isKilled();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e {

        /* renamed from: a, reason: collision with root package name */
        public TopicLearnRecord f16397a;

        /* renamed from: b, reason: collision with root package name */
        public TopicLearnRecord f16398b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                LearnRecordManager.this.f16384e.c(Integer.valueOf(e.this.f16397a.topicId), e.this.f16397a);
                LearnRecordManager.this.f16385f.c(Integer.valueOf(e.this.f16398b.topicId), e.this.f16398b);
                LearnRecordManager.this.f16389j.e();
            }
        }

        public e(TopicLearnRecord totalRecord, TopicLearnRecord syncingRecord) {
            this.f16397a = totalRecord;
            this.f16398b = syncingRecord;
        }

        public void c() {
            LearnRecordManager.this.f16383d.put(Integer.valueOf(this.f16397a.topicId), this.f16397a);
            if (this.f16397a.isTodayNew == 1) {
                LearnRecordManager.this.f16390k.add(Integer.valueOf(this.f16397a.topicId));
            }
            LearnRecordManager.this.f16384e.put(Integer.valueOf(this.f16397a.topicId), this.f16397a);
            LearnRecordManager.this.f16385f.put(Integer.valueOf(this.f16398b.topicId), this.f16398b);
            LearnRecordManager.this.f16387h.post(new a());
            LearnRecordManager.this.p();
        }

        public int d() {
            return this.f16398b.topicScore;
        }

        public e e() {
            this.f16397a.syncState = 0L;
            this.f16398b.syncState = 0L;
            return this;
        }

        public e f(yc.b problemProxy) {
            int k02 = problemProxy.k0();
            TopicLearnRecord topicLearnRecord = this.f16397a;
            topicLearnRecord.topicScore = k02;
            this.f16398b.topicScore = k02;
            topicLearnRecord.reviewRound = problemProxy.j0();
            this.f16398b.reviewRound = problemProxy.j0();
            this.f16397a.extra.f16072ls = problemProxy.h0();
            this.f16397a.extra.f16074ss = problemProxy.l0();
            this.f16397a.extra.f16073ms = problemProxy.c0();
            this.f16397a.lastDoTime = problemProxy.f0();
            this.f16398b.lastDoTime = problemProxy.f0();
            if (TimeUtil.getBetweenDays(System.currentTimeMillis(), problemProxy.f0()) == 0) {
                this.f16397a.topicDay = 0;
                this.f16398b.topicDay = 0;
            }
            e();
            return this;
        }

        public e g(Answer answer, long useTimeMillis, int tagId, boolean reviewMore) {
            if (answer == Answer.WRONG) {
                this.f16397a.errNum++;
                this.f16398b.errNum++;
            } else if (reviewMore) {
                this.f16397a.extra.reviewedMore = true;
            }
            TopicLearnRecord topicLearnRecord = this.f16397a;
            topicLearnRecord.doNum++;
            TopicLearnRecord topicLearnRecord2 = this.f16398b;
            topicLearnRecord2.doNum++;
            topicLearnRecord.totalTime += useTimeMillis;
            topicLearnRecord2.totalTime += useTimeMillis;
            topicLearnRecord2.tagId = tagId;
            e();
            return this;
        }

        public e h(int score, long lastDoTime) {
            TopicLearnRecord topicLearnRecord = this.f16397a;
            topicLearnRecord.topicScore = score;
            TopicLearnRecord topicLearnRecord2 = this.f16398b;
            topicLearnRecord2.topicScore = score;
            topicLearnRecord.lastDoTime = lastDoTime;
            topicLearnRecord2.lastDoTime = lastDoTime;
            e();
            return this;
        }

        public String toString() {
            return "TopicLearnProxy{syncRecord=" + this.f16398b + ", totalRecord=" + this.f16397a + l50.b.f69928j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends LruCache<Integer, TopicLearnRecord> {

        /* renamed from: e, reason: collision with root package name */
        public static final int f16401e = 1;

        /* renamed from: f, reason: collision with root package name */
        public static final int f16402f = 2;

        /* renamed from: a, reason: collision with root package name */
        public Context f16403a;

        /* renamed from: b, reason: collision with root package name */
        public int f16404b;

        /* renamed from: c, reason: collision with root package name */
        public Uri f16405c;

        /* renamed from: d, reason: collision with root package name */
        public Map<String, String> f16406d;

        @Override // androidx.collection.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TopicLearnRecord create(Integer key) {
            return (TopicLearnRecord) k9.a.q(k9.c.i(this.f16405c).m("topic_id = " + key, new String[0]).d(this.f16403a), TopicLearnRecord.class, this.f16406d);
        }

        public void b(Context context, int bookId) {
            this.f16403a = context;
            int i11 = this.f16404b;
            if (i11 == 1) {
                this.f16405c = a.j.a(bookId);
                this.f16406d = TopicLearnRecord.TOTAL_TABLE_COLUMN_MAP;
            } else if (i11 == 2) {
                this.f16405c = a.k.a(bookId);
                this.f16406d = TopicLearnRecord.SYNCING_TABLE_COLUMN_MAP;
            }
            evictAll();
        }

        public void c(Integer key, TopicLearnRecord value) {
            put(key, value);
            try {
                this.f16403a.getContentResolver().insert(this.f16405c, k9.a.f(value, TopicLearnRecord.class, this.f16406d, null));
            } catch (Exception e11) {
                qb.c.c(LearnRecordManager.f16378l, "", e11);
            }
        }

        public f(int table, int maxSize) {
            super(maxSize);
            this.f16404b = table;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g {

        /* renamed from: d, reason: collision with root package name */
        public static final int f16407d = 800;

        /* renamed from: e, reason: collision with root package name */
        public static final int f16408e = 50;

        /* renamed from: a, reason: collision with root package name */
        public List<qb0.g<? super Integer>> f16409a;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f16410b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements c.a<Integer> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f16412a;

            public a(final Context val$context) {
                this.f16412a = val$context;
            }

            @Override // wb0.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(qb0.g<? super Integer> subscriber) {
                synchronized (g.this) {
                    try {
                        qb.c.i(LearnRecordManager.f16378l, TimeModel.f32588i, Integer.valueOf(subscriber.hashCode()));
                        g.this.f16409a.add(subscriber);
                        if (!g.this.f16410b) {
                            qb.c.i(LearnRecordManager.f16378l, "", new Object[0]);
                            g.this.h(this.f16412a);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends qb0.g<Integer> {

            /* renamed from: a, reason: collision with root package name */
            public List<qb0.g<? super Integer>> f16414a = new ArrayList();

            public b() {
            }

            @Override // qb0.c
            public void onCompleted() {
                synchronized (g.this) {
                    try {
                        qb.c.i(LearnRecordManager.f16378l, "onCompleted", new Object[0]);
                        for (qb0.g<? super Integer> gVar : this.f16414a) {
                            gVar.onCompleted();
                            qb.c.i(LearnRecordManager.f16378l, TimeModel.f32588i, Integer.valueOf(gVar.hashCode()));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // qb0.c
            public void onError(Throwable e11) {
                synchronized (g.this) {
                    try {
                        qb.c.c(LearnRecordManager.f16378l, "error", e11);
                        g.this.f16410b = false;
                        for (qb0.g gVar : g.this.f16409a) {
                            gVar.onError(e11);
                            qb.c.i(LearnRecordManager.f16378l, TimeModel.f32588i, Integer.valueOf(gVar.hashCode()));
                        }
                        g.this.f16409a.clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // qb0.c
            public void onNext(Integer integer) {
                synchronized (g.this) {
                    try {
                        g.this.f16410b = false;
                        qb.c.i(LearnRecordManager.f16378l, "success " + integer, new Object[0]);
                        for (qb0.g gVar : g.this.f16409a) {
                            gVar.onNext(integer);
                            qb.c.i(LearnRecordManager.f16378l, TimeModel.f32588i, Integer.valueOf(gVar.hashCode()));
                        }
                        this.f16414a.addAll(g.this.f16409a);
                        g.this.f16409a.clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c implements p<UserStudyApiService.Client, Integer> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f16416a;

            public c(final Context val$context) {
                this.f16416a = val$context;
            }

            @Override // wb0.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer call(UserStudyApiService.Client client) {
                try {
                    g gVar = g.this;
                    int j11 = gVar.j(this.f16416a, LearnRecordManager.this.f16381b, client);
                    qb.c.b(LearnRecordManager.f16378l, "uploaded total count: " + j11, new Object[0]);
                    return Integer.valueOf(j11);
                } catch (Throwable th2) {
                    qb.c.c(LearnRecordManager.f16378l, "", th2);
                    throw vb0.a.c(th2);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d implements e.b<TopicLearnRecord, UserDoneWordRecord> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ LearnRecordManager f16418a;

            public d(final LearnRecordManager val$lrm) {
                this.f16418a = val$lrm;
            }

            @Override // xb.e.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public UserDoneWordRecord map(TopicLearnRecord t11) {
                TopicLearnRecord.Extra extra;
                UserDoneWordRecord userDoneWordRecord = new UserDoneWordRecord();
                userDoneWordRecord.setWord_topic_id(t11.topicId);
                userDoneWordRecord.setCurrent_score(t11.topicScore);
                userDoneWordRecord.setSpan_days(t11.topicDay);
                userDoneWordRecord.setWrong_times(t11.errNum);
                userDoneWordRecord.setDone_times(t11.doNum);
                userDoneWordRecord.setIs_first_do_at_today(t11.isTodayNew);
                userDoneWordRecord.setUsed_time((int) t11.totalTime);
                userDoneWordRecord.setTag_id(t11.tagId);
                userDoneWordRecord.setReview_round(t11.reviewRound);
                TopicLearnRecord J = this.f16418a.J(t11.topicId);
                if (J != null && (extra = J.extra) != null) {
                    userDoneWordRecord.setSpell_score(extra.f16074ss);
                    userDoneWordRecord.setListening_score(J.extra.f16072ls);
                    userDoneWordRecord.setChn_score(J.extra.f16073ms);
                }
                return userDoneWordRecord;
            }
        }

        public void e() {
            if (rb.d.f(LearnRecordManager.this.f16380a)) {
                synchronized (this) {
                    try {
                        if (this.f16410b) {
                            qb.c.i(LearnRecordManager.f16378l, "uploading", new Object[0]);
                        } else {
                            int N = LearnRecordManager.N(LearnRecordManager.this.f16380a, LearnRecordManager.this.f16381b);
                            if (N >= 50) {
                                qb.c.i(LearnRecordManager.f16378l, "auto upload", new Object[0]);
                                h(LearnRecordManager.this.f16380a);
                            }
                            qb.c.i(LearnRecordManager.f16378l, TimeModel.f32588i, Integer.valueOf(N));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final List<UserDoneWordRecord> f(Context context, int bookId, int batch) {
            return xb.e.j(k9.a.n(k9.c.i(a.k.a(bookId)).m("sync_state = 0 LIMIT " + batch, new String[0]).d(context), TopicLearnRecord.class, TopicLearnRecord.SYNCING_TABLE_COLUMN_MAP), new d(LearnRecordManager.A()));
        }

        public final void g(Context context, int bookId, List<UserDoneWordRecord> doneRecords) throws Exception {
            ArrayList arrayList = new ArrayList(doneRecords.size());
            Iterator<UserDoneWordRecord> it = doneRecords.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().getWord_topic_id()));
            }
            if (LearnRecordManager.this.r(context, bookId, arrayList) < 0) {
                throw new Exception("上传学习记录错误，数据库操作异常");
            }
        }

        public final void h(final Context context) {
            this.f16410b = true;
            com.baicizhan.client.business.thrift.p.b("/rpc/user_study").w5(bc0.c.e()).c3(new c(context)).F4(new ha.a(null)).r5(new b());
        }

        public final void i(Context context, int bookId, long version) {
            ScheduleRecord o11 = x.r().o();
            if (o11 != null && o11.bookId == bookId) {
                o11.remoteSyncVer = version;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("sync_state", Long.valueOf(version));
            context.getContentResolver().update(a.y.f16334b, contentValues, "book_id=" + bookId, null);
        }

        public int j(Context context, int bookId, UserStudyApiService.Client client) throws Exception {
            int N = LearnRecordManager.N(context, bookId);
            qb.c.b(LearnRecordManager.f16378l, "upload total count " + N, new Object[0]);
            int i11 = 0;
            while (N > 0) {
                List<UserDoneWordRecord> f11 = f(context, bookId, 800);
                if (xb.e.h(f11)) {
                    qb.c.b(LearnRecordManager.f16378l, "upload complete", new Object[0]);
                    return i11;
                }
                l(context, bookId, client, f11);
                N -= f11.size();
                i11 += f11.size();
            }
            return i11;
        }

        public rx.c<Integer> k(final Context context) {
            return rx.c.j1(new a(context));
        }

        public final int l(Context context, int bookId, UserStudyApiService.Client client, List<UserDoneWordRecord> doneRecords) throws Exception {
            long currentTimeSeconds = TimeUtil.currentTimeSeconds();
            qb.c.b(LearnRecordManager.f16378l, "+++++++ upload learn records batch start: " + bookId + j2.O + doneRecords.size() + ", timestamp " + currentTimeSeconds, new Object[0]);
            int update_done_data = client.update_done_data(currentTimeSeconds, doneRecords, bookId, false);
            if (update_done_data != 0) {
                qb.c.d("", "update_done_data called failed, result [%d]", Integer.valueOf(update_done_data));
                throw new IllegalStateException("update_done_data called failed, result: " + update_done_data);
            }
            i(context, bookId, currentTimeSeconds);
            g(context, bookId, doneRecords);
            ScheduleRecord o11 = x.r().o();
            if (o11 != null && o11.bookId == bookId) {
                o11.localSyncVer = currentTimeSeconds;
                qb.c.b(LearnRecordManager.f16378l, "upload learn records batch end: " + bookId + ", version " + currentTimeSeconds, new Object[0]);
            }
            return 0;
        }

        public g() {
            this.f16409a = new ArrayList();
            this.f16410b = false;
        }
    }

    public LearnRecordManager() {
        int i11 = 200;
        this.f16384e = new f(1, i11);
        this.f16385f = new f(2, i11);
        this.f16389j = new g();
        HandlerThread handlerThread = new HandlerThread("LearnRecordManager-Commit");
        this.f16386g = handlerThread;
        handlerThread.start();
        this.f16387h = new Handler(this.f16386g.getLooper());
    }

    public static LearnRecordManager A() {
        if (f16379m == null) {
            synchronized (LearnRecordManager.class) {
                try {
                    if (f16379m == null) {
                        f16379m = new LearnRecordManager();
                    }
                } finally {
                }
            }
        }
        return f16379m;
    }

    public static int N(Context context, int bookId) {
        return i9.c.j(context, a.c.f16130e, a.k.b(bookId), "sync_state=  0", null);
    }

    public static void V(Context context, int bookId, int topicId) {
        long currentTimeMillis = System.currentTimeMillis();
        TopicLearnRecord h11 = k.h(context, bookId, topicId);
        if (h11 == null) {
            h11 = new TopicLearnRecord();
            h11.topicId = topicId;
            h11.isTodayNew = 1;
        }
        h11.topicDay = 0;
        h11.lastDoTime = currentTimeMillis;
        int i11 = h11.topicScore;
        if (i11 > 0) {
            h11.topicScore = i11 * (-1);
        } else if (i11 == 0) {
            h11.topicScore = -1;
        } else if (i11 == -1024) {
            h11.topicScore = -1;
        }
        if (h11.topicScore < -9) {
            h11.topicScore = -9;
        }
        ad.a s11 = x.r().s();
        if (s11 != null && s11.E()) {
            h11.reviewRound = s11.u().k();
        }
        TopicLearnRecord f11 = k.f(context, bookId, topicId);
        if (f11 == null) {
            f11 = new TopicLearnRecord();
            f11.topicId = topicId;
        }
        f11.topicDay = 0;
        f11.topicScore = -1;
        f11.lastDoTime = currentTimeMillis;
        f11.isTodayNew = h11.isTodayNew;
        k.o(context, bookId, h11);
        k.m(context, bookId, f11);
        A().p();
    }

    public int B() {
        return xb.e.a(this.f16383d.values(), new d());
    }

    public int C() {
        return y() - H();
    }

    public long D() {
        return this.f16388i.longValue();
    }

    public int E() {
        return x.r().A() - y();
    }

    public int F() {
        return (x.r().A() - y()) + H();
    }

    public int G() {
        int i11;
        int i12;
        int i13 = 0;
        for (TopicLearnRecord topicLearnRecord : x()) {
            int i14 = topicLearnRecord.isTodayNew;
            if ((i14 == 1 && (i12 = topicLearnRecord.topicScore) < 3 && i12 >= 0) || (i14 != 1 && (i11 = topicLearnRecord.topicScore) < 4 && i11 >= 0)) {
                i13++;
            }
        }
        return i13;
    }

    public int H() {
        return this.f16390k.size();
    }

    public int I() {
        Iterator<TopicLearnRecord> it = this.f16383d.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().topicDay == 0) {
                i11++;
            }
        }
        return i11;
    }

    public TopicLearnRecord J(int topicId) {
        return this.f16383d.get(Integer.valueOf(topicId));
    }

    public int K(int topicId) {
        TopicLearnRecord topicLearnRecord = this.f16383d.get(Integer.valueOf(topicId));
        if (topicLearnRecord == null) {
            return 0;
        }
        return topicLearnRecord.topicScore;
    }

    public Map<Integer, TopicLearnRecord> L() {
        return this.f16383d;
    }

    public int M() {
        return this.f16383d.size();
    }

    public boolean O() {
        return this.f16382c;
    }

    public void P(int topicId) {
        x.r().s().u().l(x.r().w(topicId));
    }

    public boolean Q(int topicId) {
        return this.f16383d.get(Integer.valueOf(topicId)) == null;
    }

    public boolean R(int topicId) {
        TopicLearnRecord topicLearnRecord = this.f16383d.get(Integer.valueOf(topicId));
        return topicLearnRecord != null && topicLearnRecord.isKilled();
    }

    public boolean S(int topicId) {
        TopicLearnRecord topicLearnRecord = this.f16383d.get(Integer.valueOf(topicId));
        return topicLearnRecord == null || topicLearnRecord.isTodayNew == 1;
    }

    public boolean T(int topicId) {
        return K(topicId) >= 3;
    }

    public void U(int topicId, long useTimeMillis, int tagId) {
        ad.a s11 = x.r().s();
        yc.b w11 = x.r().w(topicId);
        if (w11 == null || s11 == null) {
            qb.c.b(f16378l, "problem proxy null!", new Object[0]);
            return;
        }
        s11.u().t(w11);
        qb.c.b(f16378l, "learnrecord_kill [topicId, scorce] [%d, %d]", Integer.valueOf(topicId), Integer.valueOf(w11.k0()));
        a0(topicId).f(w11).g(Answer.KILL, useTimeMillis, tagId, false).c();
    }

    public boolean W(Context context, int bookId, boolean force) {
        qb.c.i(f16378l, "load bookId " + bookId + ", mBookId " + this.f16381b, new Object[0]);
        this.f16380a = context.getApplicationContext();
        int i11 = this.f16381b;
        this.f16381b = bookId;
        boolean n11 = n();
        if (!n11 && i11 == this.f16381b && !force) {
            return false;
        }
        qb.c.i(f16378l, "reload learn record from client, spanDays[%b], lastBookId[%d], mBookId[%d], force [%b]", Boolean.valueOf(n11), Integer.valueOf(i11), Integer.valueOf(this.f16381b), Boolean.valueOf(force));
        b0();
        return true;
    }

    public void X() {
        qb.c.i(f16378l, "++++ load local learn records, bookId " + this.f16381b, new Object[0]);
        k.b(this.f16380a, this.f16381b);
        k.a(this.f16380a, this.f16381b);
        this.f16383d.clear();
        Cursor d11 = k9.c.i(a.j.a(this.f16381b)).g("topic_id", "topic_obn", "topic_day", "is_today_new", "err_num", "create_at", "extra", "review_round").d(this.f16380a);
        if (d11 != null) {
            ArrayList<TopicLearnRecord> arrayList = new ArrayList(k9.a.h(d11));
            com.google.gson.d dVar = new com.google.gson.d();
            Type type = new b().getType();
            d11.moveToFirst();
            while (!d11.isAfterLast()) {
                TopicLearnRecord topicLearnRecord = new TopicLearnRecord();
                topicLearnRecord.topicId = d11.getInt(0);
                topicLearnRecord.topicScore = d11.getInt(1);
                topicLearnRecord.topicDay = d11.getInt(2);
                topicLearnRecord.isTodayNew = d11.getInt(3);
                topicLearnRecord.errNum = d11.getInt(4);
                topicLearnRecord.createAt = d11.getLong(5);
                String string = d11.getString(6);
                topicLearnRecord.reviewRound = d11.getInt(7);
                if (!TextUtils.isEmpty(string)) {
                    topicLearnRecord.extra = (TopicLearnRecord.Extra) dVar.o(d11.getString(6), type);
                }
                arrayList.add(topicLearnRecord);
                d11.moveToNext();
            }
            d11.close();
            for (TopicLearnRecord topicLearnRecord2 : arrayList) {
                this.f16383d.put(Integer.valueOf(topicLearnRecord2.topicId), topicLearnRecord2);
            }
        }
        qb.c.i(f16378l, "---- load local learn records total " + this.f16383d.size(), new Object[0]);
    }

    public void Y(int topicId) {
        TopicLearnRecord topicLearnRecord = this.f16383d.get(Integer.valueOf(topicId));
        if (topicLearnRecord == null || topicLearnRecord.topicScore <= 4) {
            return;
        }
        topicLearnRecord.topicScore = 4;
        k.q(this.f16380a, this.f16381b, topicId, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (r13.createAt == 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Z(java.util.List<com.baicizhan.online.user_study_api.UserLearnedWordInfo> r25) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.managers.LearnRecordManager.Z(java.util.List):boolean");
    }

    public e a0(int topicId) {
        TopicLearnRecord topicLearnRecord = this.f16384e.get(Integer.valueOf(topicId));
        if (topicLearnRecord == null) {
            topicLearnRecord = new TopicLearnRecord();
            topicLearnRecord.topicId = topicId;
            topicLearnRecord.isTodayNew = 1;
            topicLearnRecord.topicScore = TopicLearnRecord.SCORE_UNTOUCH;
            topicLearnRecord.createAt = System.currentTimeMillis();
        }
        TopicLearnRecord topicLearnRecord2 = this.f16385f.get(Integer.valueOf(topicId));
        if (topicLearnRecord2 == null) {
            topicLearnRecord2 = new TopicLearnRecord();
            topicLearnRecord2.topicId = topicId;
        }
        topicLearnRecord2.isTodayNew = topicLearnRecord.isTodayNew;
        topicLearnRecord2.topicDay = topicLearnRecord.topicDay;
        return new e(topicLearnRecord, topicLearnRecord2);
    }

    public void b0() {
        int i11 = this.f16381b;
        o();
        this.f16381b = i11;
        this.f16387h.post(new a(i11));
        X();
        this.f16382c = true;
    }

    public rx.c<Integer> c0(final Context context) {
        return this.f16389j.k(context);
    }

    public boolean d0() {
        boolean z11;
        boolean z12;
        x r11 = x.r();
        ArrayList arrayList = new ArrayList();
        xb.e.e(this.f16383d.keySet().iterator(), new c(r11), arrayList);
        if (arrayList.size() > 0) {
            qb.c.i(f16378l, "+++ total removed " + TextUtils.join(j2.O, arrayList), new Object[0]);
            k.e(this.f16380a, this.f16381b, arrayList);
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (TopicLearnRecord topicLearnRecord : this.f16383d.values()) {
            int i11 = topicLearnRecord.topicDay;
            if (i11 <= 0 || i11 >= 8 || topicLearnRecord.topicScore >= 3 || topicLearnRecord.isKilled()) {
                z12 = false;
            } else {
                topicLearnRecord.topicScore = 3;
                z12 = true;
            }
            if (topicLearnRecord.topicDay > 7 && topicLearnRecord.topicScore < 4 && !topicLearnRecord.isKilled()) {
                topicLearnRecord.topicScore = 4;
                z12 = true;
            }
            if (z12) {
                TopicLearnRecord topicLearnRecord2 = new TopicLearnRecord();
                topicLearnRecord2.topicId = topicLearnRecord.topicId;
                topicLearnRecord2.topicDay = topicLearnRecord.topicDay;
                topicLearnRecord2.topicScore = topicLearnRecord.topicScore;
                topicLearnRecord2.syncState = 0L;
                topicLearnRecord2.lastDoTime = topicLearnRecord.lastDoTime;
                topicLearnRecord2.isTodayNew = topicLearnRecord.isTodayNew;
                topicLearnRecord2.doNum = 0;
                topicLearnRecord2.errNum = 0;
                topicLearnRecord2.totalTime = 0L;
                arrayList2.add(topicLearnRecord2);
            }
        }
        if (arrayList2.size() > 0) {
            qb.c.q(f16378l, "fixScore syncing table " + arrayList2.size(), new Object[0]);
            k.n(this.f16380a, this.f16381b, arrayList2);
            z11 = true;
        }
        Uri a11 = a.j.a(this.f16381b);
        ContentValues contentValues = new ContentValues();
        contentValues.put("topic_obn", (Integer) 3);
        this.f16380a.getContentResolver().update(a11, contentValues, "topic_day > 0 and topic_day < 8 and topic_obn < 3 and topic_obn > -1", null);
        contentValues.put("topic_obn", (Integer) 4);
        this.f16380a.getContentResolver().update(a11, contentValues, "topic_day > 7 and topic_obn < 4 and topic_obn > -1", null);
        for (TopicLearnRecord topicLearnRecord3 : this.f16383d.values()) {
            if (topicLearnRecord3.isTodayNew == 1) {
                this.f16390k.add(Integer.valueOf(topicLearnRecord3.topicId));
            }
        }
        qb.c.b(f16378l, "mTodayNewLearnedSet size " + this.f16390k.size(), new Object[0]);
        return z11;
    }

    public void k(int i11, int i12, int i13, boolean z11, int i14, int i15, int i16) {
        qb.c.i(f16378l, "[Id, score, spanDay, isTodayNew, wrongTimes, round][%d, %d, %d, %b, %d, %d]", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Boolean.valueOf(z11), Integer.valueOf(i14), Integer.valueOf(i15));
        TopicLearnRecord topicLearnRecord = this.f16384e.get(Integer.valueOf(i11));
        if (topicLearnRecord == null) {
            topicLearnRecord = new TopicLearnRecord();
            topicLearnRecord.topicId = i11;
            topicLearnRecord.isTodayNew = 1;
            topicLearnRecord.createAt = System.currentTimeMillis();
        }
        TopicLearnRecord.Extra extra = topicLearnRecord.extra;
        int i17 = extra.f16072ls;
        extra.f16072ls = w(i17, i16);
        TopicLearnRecord.Extra extra2 = topicLearnRecord.extra;
        extra2.f16074ss = 3;
        extra2.f16073ms = 3;
        topicLearnRecord.topicScore = i12;
        topicLearnRecord.topicDay = i13;
        topicLearnRecord.isTodayNew = z11 ? 1 : 0;
        topicLearnRecord.doNum++;
        topicLearnRecord.errNum += i14;
        topicLearnRecord.lastDoTime = System.currentTimeMillis();
        if (i15 >= 0) {
            topicLearnRecord.reviewRound = i15;
        }
        TopicLearnRecord topicLearnRecord2 = this.f16385f.get(Integer.valueOf(i11));
        if (topicLearnRecord2 == null) {
            topicLearnRecord2 = new TopicLearnRecord();
            topicLearnRecord2.topicId = i11;
        }
        topicLearnRecord2.isTodayNew = topicLearnRecord.isTodayNew;
        topicLearnRecord2.topicDay = topicLearnRecord.topicDay;
        topicLearnRecord2.lastDoTime = topicLearnRecord.lastDoTime;
        topicLearnRecord2.topicScore = topicLearnRecord.topicScore;
        topicLearnRecord2.reviewRound = topicLearnRecord.reviewRound;
        topicLearnRecord2.errNum += i14;
        topicLearnRecord2.extra.f16072ls = w(i17, i16);
        TopicLearnRecord.Extra extra3 = topicLearnRecord2.extra;
        extra3.f16074ss = 3;
        extra3.f16073ms = 3;
        topicLearnRecord2.doNum++;
        new e(topicLearnRecord, topicLearnRecord2).e().c();
    }

    public void l(int topicId) {
        yc.b w11 = x.r().w(topicId);
        if (w11 == null) {
            return;
        }
        qb.c.i(f16378l, "learnrecord_cancel_kill %d", Integer.valueOf(topicId));
        x.r().s().u().b(w11);
        a0(topicId).f(w11).c();
    }

    public void m(List<Integer> topicIds) {
        if (xb.e.h(topicIds)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList(topicIds.size());
            ArrayList arrayList2 = new ArrayList(topicIds.size());
            for (Integer num : topicIds) {
                int intValue = num.intValue();
                TopicLearnRecord topicLearnRecord = this.f16383d.get(num);
                if (topicLearnRecord == null) {
                    topicLearnRecord = new TopicLearnRecord();
                    topicLearnRecord.topicId = intValue;
                    topicLearnRecord.isTodayNew = 1;
                    topicLearnRecord.topicScore = TopicLearnRecord.SCORE_UNTOUCH;
                    topicLearnRecord.createAt = System.currentTimeMillis();
                }
                int i11 = topicLearnRecord.topicScore;
                if (i11 <= -1 && i11 >= -4) {
                    topicLearnRecord.topicScore = 5;
                } else if (i11 < 0) {
                    topicLearnRecord.topicScore = i11 * (-1);
                }
                if (topicLearnRecord.topicScore > 9) {
                    topicLearnRecord.topicScore = 9;
                }
                ad.a s11 = x.r().s();
                if (s11 != null && s11.E()) {
                    topicLearnRecord.reviewRound = s11.u().k();
                }
                topicLearnRecord.topicDay = 0;
                arrayList.add(k9.a.f(topicLearnRecord, TopicLearnRecord.class, TopicLearnRecord.TOTAL_TABLE_COLUMN_MAP, null));
                arrayList2.add(k9.a.f(topicLearnRecord, TopicLearnRecord.class, TopicLearnRecord.SYNCING_TABLE_COLUMN_MAP, null));
            }
            qb.c.b(f16378l, "cancel kill js: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            long currentTimeMillis2 = System.currentTimeMillis();
            this.f16380a.getContentResolver().bulkInsert(a.j.a(this.f16381b), (ContentValues[]) arrayList.toArray(new ContentValues[arrayList.size()]));
            qb.c.b(f16378l, "cancel kill total db: " + (System.currentTimeMillis() - currentTimeMillis2), new Object[0]);
            long currentTimeMillis3 = System.currentTimeMillis();
            this.f16380a.getContentResolver().bulkInsert(a.k.a(this.f16381b), (ContentValues[]) arrayList2.toArray(new ContentValues[arrayList2.size()]));
            qb.c.b(f16378l, "cancel kill sync db: " + (System.currentTimeMillis() - currentTimeMillis3), new Object[0]);
            p();
        } catch (Exception e11) {
            qb.c.c(f16378l, "cancel kill topic ids failed.", e11);
        }
    }

    public boolean n() {
        long currentTimeMillis = System.currentTimeMillis();
        OfflineStateRecord j11 = i9.a.j(this.f16380a, this.f16381b);
        if (j11 == null) {
            j11 = new OfflineStateRecord();
            j11.bookId = this.f16381b;
            j11.runTime = currentTimeMillis;
            j11.wantMoreCount = 0;
        }
        qb.c.b(f16378l, "get OfflineStateRecord " + j11 + " now" + currentTimeMillis, new Object[0]);
        int betweenDays = TimeUtil.getBetweenDays(currentTimeMillis, j11.runTime);
        if (betweenDays > 0) {
            qb.c.b(f16378l, "span days " + betweenDays, new Object[0]);
            k.k(this.f16380a, this.f16381b, betweenDays);
            j11.wantMoreCount = 0;
            j11.comboCount = 0;
            j11.maxComboCount = 0;
        }
        j11.runTime = currentTimeMillis;
        i9.a.p(this.f16380a, j11);
        x.r().n0(j11);
        return betweenDays > 0;
    }

    public void o() {
        this.f16381b = -1;
        this.f16383d.clear();
        this.f16384e.evictAll();
        this.f16385f.evictAll();
        this.f16390k.clear();
        p();
        this.f16382c = false;
    }

    public final void p() {
        this.f16388i = Long.valueOf(System.currentTimeMillis());
    }

    public void q(Context context) {
        List<String> m11 = k9.a.m(k9.c.j(a.c.f16130e, "SELECT name FROM sqlite_master WHERE type=?", "table").d(context), String.class);
        v(context);
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>(m11.size());
        for (String str : m11) {
            if (!str.equals("android_metadata")) {
                arrayList.add(ContentProviderOperation.newDelete(com.baicizhan.client.business.dataset.provider.a.d(a.c.f16130e, str)).build());
            }
        }
        try {
            context.getContentResolver().applyBatch(com.baicizhan.client.business.dataset.provider.a.f16088b, arrayList);
        } catch (OperationApplicationException | RemoteException e11) {
            qb.c.c(f16378l, "", e11);
        }
    }

    public final int r(Context context, int bookId, List<Integer> ids) {
        if (bookId == this.f16381b) {
            for (Integer num : ids) {
                num.intValue();
                this.f16385f.remove(num);
            }
        }
        return context.getContentResolver().delete(a.k.a(bookId), k9.c.a("topic_id", "IN", ids), null);
    }

    public void s(int topicId, long useTimeMillis, int tagId, boolean reviewMore) {
        yc.b w11 = x.r().w(topicId);
        x.r().s().u().r(w11, useTimeMillis, null);
        qb.c.i(f16378l, "done correct %d, %d, %d, %b", Integer.valueOf(topicId), Long.valueOf(useTimeMillis), Integer.valueOf(tagId), Boolean.valueOf(reviewMore));
        e a02 = a0(topicId);
        qb.c.i(f16378l, "done correct step 2 %d, %d, %d, %b", Integer.valueOf(topicId), Long.valueOf(useTimeMillis), Integer.valueOf(tagId), Boolean.valueOf(reviewMore));
        a02.f(w11).g(Answer.CORRECT, useTimeMillis, tagId, reviewMore).c();
        qb.c.i(f16378l, "done correct step 3 %d, %d, %d, %b", Integer.valueOf(topicId), Long.valueOf(useTimeMillis), Integer.valueOf(tagId), Boolean.valueOf(reviewMore));
    }

    public void t(int topicId, long useTimeMillis, int tagId) {
        yc.b w11 = x.r().w(topicId);
        x.r().s().u().p(w11, useTimeMillis, null);
        a0(topicId).f(w11).g(Answer.WRONG, useTimeMillis, tagId, false).c();
    }

    public void u(int topicId) {
        e a02 = a0(topicId);
        if (a02.d() >= 4) {
            a02.h(3, System.currentTimeMillis()).g(Answer.WRONG, 0L, 0, false).e().c();
        }
    }

    public void v(Context context) {
        List<String> m11 = k9.a.m(k9.c.j(a.c.f16130e, "SELECT name FROM sqlite_master WHERE type=?", "table").d(context), String.class);
        HashMap hashMap = new HashMap();
        for (String str : m11) {
            if (!str.equals("android_metadata")) {
                Cursor d11 = k9.c.j(a.c.f16130e, "SELECT count(*) FROM " + str, new String[0]).d(context);
                d11.moveToFirst();
                hashMap.put(str, String.valueOf(d11.getLong(0)));
            }
        }
        qb.c.i(f16378l, "[%s]", new com.google.gson.d().z(hashMap));
    }

    public final int w(int oldValue, int newValue) {
        if (newValue != 0) {
            return newValue;
        }
        if (oldValue < 0 || oldValue > 2) {
            return oldValue;
        }
        return 3;
    }

    public Collection<TopicLearnRecord> x() {
        return this.f16383d.values();
    }

    public int y() {
        return this.f16383d.size();
    }

    public int z() {
        return this.f16381b;
    }
}
