package sh;

import android.content.Context;
import android.database.Cursor;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.main.receiver.NetworkChangeReceiver;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.ZpkInfo;
import com.squareup.picasso.h0;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.j2;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: l, reason: collision with root package name */
    public static final String f88531l = "OfflineResourceRepo";

    /* renamed from: m, reason: collision with root package name */
    public static final float f88532m = 0.05f;

    /* renamed from: n, reason: collision with root package name */
    public static final float f88533n = 1048576.0f;

    /* renamed from: o, reason: collision with root package name */
    public static d f88534o;

    /* renamed from: a, reason: collision with root package name */
    public Context f88535a;

    /* renamed from: d, reason: collision with root package name */
    public int f88538d;

    /* renamed from: e, reason: collision with root package name */
    public int f88539e;

    /* renamed from: g, reason: collision with root package name */
    public f f88541g;

    /* renamed from: h, reason: collision with root package name */
    public rx.d f88542h;

    /* renamed from: i, reason: collision with root package name */
    public dc0.b<g> f88543i;

    /* renamed from: j, reason: collision with root package name */
    public qb0.h f88544j;

    /* renamed from: k, reason: collision with root package name */
    public qb0.h f88545k;

    /* renamed from: b, reason: collision with root package name */
    public int f88536b = -1;

    /* renamed from: c, reason: collision with root package name */
    public float f88537c = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public Set<Integer> f88540f = Collections.EMPTY_SET;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callable<Set<Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f88546a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f88547b;

        public a(final Context val$context, final int val$bookId) {
            this.f88546a = val$context;
            this.f88547b = val$bookId;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<Integer> call() throws Exception {
            u.a(this.f88546a);
            HashSet hashSet = new HashSet(x.r().z());
            qb.c.b(d.f88531l, "all ids size " + hashSet.size(), new Object[0]);
            Cursor cursor = null;
            try {
                try {
                    cursor = k9.c.i(a.i.a(this.f88547b)).g("topic", "zpk_path").d(this.f88546a);
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        int i11 = cursor.getInt(0);
                        File zpkFileByName = ZPackUtils.getZpkFileByName(this.f88547b, cursor.getString(1));
                        if (zpkFileByName != null) {
                            boolean exists = zpkFileByName.exists();
                            long length = zpkFileByName.length();
                            if (exists && length > 0) {
                                hashSet.remove(Integer.valueOf(i11));
                            } else if (zpkFileByName.exists() && zpkFileByName.length() > 0) {
                                hashSet.remove(Integer.valueOf(i11));
                            }
                        }
                        cursor.moveToNext();
                    }
                    cursor.close();
                    return hashSet;
                } catch (Exception e11) {
                    qb.c.c(d.f88531l, "", e11);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return hashSet;
                }
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends qb0.g<TopicRecord> {
        public c() {
        }

        @Override // qb0.c
        public void onCompleted() {
            ma.l.a(ma.t.f73016o, ma.a.f72861w1);
            ma.l.a(ma.t.f73011j, ma.a.f72753g5);
            d.this.v(6);
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(d.f88531l, "", e11);
            d.this.v(1);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(TopicRecord topicRecord) {
            synchronized (d.this) {
                try {
                    if (topicRecord.bookId == d.this.f88536b) {
                        d.this.f88539e++;
                        d.this.f88540f.remove(Integer.valueOf(topicRecord.topicId));
                        if (d.this.f88541g.a()) {
                            qb.c.b(d.f88531l, "onNext while paused " + topicRecord.topicId, new Object[0]);
                        } else {
                            d.this.v(3);
                        }
                    } else {
                        qb.c.q(d.f88531l, "pack download success with conflict book " + topicRecord.bookId + ", current " + d.this.f88536b, new Object[0]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: sh.d$d, reason: collision with other inner class name */
    public class C1158d implements wb0.p<List<ZpkInfo>, rx.c<TopicRecord>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f88550a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: sh.d$d$a */
        public class a implements wb0.p<ZpkInfo, rx.c<TopicRecord>> {
            public a() {
            }

            @Override // wb0.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public rx.c<TopicRecord> call(ZpkInfo zpkInfo) {
                s sVar = new s(C1158d.this.f88550a, zpkInfo.getTopic_key().topic_id);
                sVar.n(zpkInfo);
                return th.s.d(sVar, d.this.f88542h).w5(d.this.f88542h).D4(3L);
            }
        }

        public C1158d(final int val$bookId) {
            this.f88550a = val$bookId;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<TopicRecord> call(List<ZpkInfo> zpkInfos) {
            Iterator<ZpkInfo> it = zpkInfos.iterator();
            float f11 = 0.0f;
            int i11 = 0;
            while (it.hasNext()) {
                if (it.next().getZpk_size() > 0) {
                    f11 += r4.getZpk_size();
                    i11++;
                }
            }
            d.this.f88537c = i11 > 0 ? (f11 / i11) / 1048576.0f : 0.05f;
            qb.c.b(d.f88531l, "mMeanSize " + d.this.f88537c, new Object[0]);
            return rx.c.u2(zpkInfos).b2(new a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements wb0.p<List<Integer>, rx.c<ZpkInfo>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f88553a;

        public e(final int val$bookId) {
            this.f88553a = val$bookId;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<ZpkInfo> call(final List<Integer> integers) {
            try {
                return rx.c.u2(((ResourceService.Client) new com.baicizhan.client.business.thrift.l("/rpc/resource_api").d(10000).b(5000).c(2).a()).get_zpk_infos(TopicIdMapingUtils.buildTopicKeyList(integers, this.f88553a)));
            } catch (Exception e11) {
                qb.c.c(d.f88531l, "", e11);
                d.this.w(1, "无法获取单词包信息，请检查您的网络是否畅通");
                throw vb0.a.c(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends ThreadPoolExecutor {

        /* renamed from: a, reason: collision with root package name */
        public boolean f88555a;

        /* renamed from: b, reason: collision with root package name */
        public ReentrantLock f88556b;

        /* renamed from: c, reason: collision with root package name */
        public Condition f88557c;

        public f(int nThreads) {
            super(nThreads, nThreads, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f88556b = reentrantLock;
            this.f88557c = reentrantLock.newCondition();
        }

        public boolean a() {
            this.f88556b.lock();
            try {
                return this.f88555a;
            } finally {
                this.f88556b.unlock();
            }
        }

        public void b() {
            this.f88556b.lock();
            try {
                this.f88555a = true;
                qb.c.b(d.f88531l, h0.C, new Object[0]);
            } finally {
                this.f88556b.unlock();
            }
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void beforeExecute(Thread t11, Runnable r11) {
            super.beforeExecute(t11, r11);
            this.f88556b.lock();
            while (this.f88555a) {
                try {
                    try {
                        qb.c.b(d.f88531l, "waitPaused", new Object[0]);
                        this.f88557c.await();
                    } catch (InterruptedException unused) {
                        t11.interrupt();
                    }
                } finally {
                    this.f88556b.unlock();
                }
            }
        }

        public void c() {
            this.f88556b.lock();
            try {
                this.f88555a = false;
                this.f88557c.signalAll();
            } finally {
                this.f88556b.unlock();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g {

        /* renamed from: e, reason: collision with root package name */
        public static final int f88558e = 0;

        /* renamed from: f, reason: collision with root package name */
        public static final int f88559f = 1;

        /* renamed from: g, reason: collision with root package name */
        public static final int f88560g = 2;

        /* renamed from: h, reason: collision with root package name */
        public static final int f88561h = 3;

        /* renamed from: i, reason: collision with root package name */
        public static final int f88562i = 4;

        /* renamed from: j, reason: collision with root package name */
        public static final int f88563j = 6;

        /* renamed from: a, reason: collision with root package name */
        public int f88564a;

        /* renamed from: b, reason: collision with root package name */
        public int f88565b;

        /* renamed from: c, reason: collision with root package name */
        public int f88566c;

        /* renamed from: d, reason: collision with root package name */
        public String f88567d;

        public g(int code, int doneProgress, int totalProgress, String error) {
            this.f88564a = code;
            this.f88565b = doneProgress;
            this.f88566c = totalProgress;
            this.f88567d = error;
        }

        public String toString() {
            return "State{code=" + this.f88564a + ", doneProgress=" + this.f88565b + ", totalProgress=" + this.f88566c + ", error='" + this.f88567d + '\'' + l50.b.f69928j;
        }
    }

    public d() {
        f fVar = new f(10);
        this.f88541g = fVar;
        this.f88542h = bc0.c.b(fVar);
        this.f88543i = dc0.b.z7(new g(0, 0, 0, null));
    }

    public static rx.c<Set<Integer>> m(final Context context, final int bookId) {
        return rx.c.z2(new a(context, bookId)).w5(bc0.c.f());
    }

    public static d s() {
        if (f88534o == null) {
            synchronized (d.class) {
                try {
                    if (f88534o == null) {
                        f88534o = new d();
                        i80.c.f().v(f88534o);
                    }
                } finally {
                }
            }
        }
        return f88534o;
    }

    public final void l() {
        qb0.h hVar = this.f88544j;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f88544j.unsubscribe();
        }
        this.f88544j = m(this.f88535a, this.f88536b).I3(tb0.a.a()).r5(new b());
    }

    public int n() {
        return this.f88536b;
    }

    public g o() {
        return this.f88543i.C7();
    }

    @i80.l
    public void onEventMainThread(NetworkChangeReceiver.a event) {
        qb.c.b(f88531l, "NetworkChangedTo " + event.f24796a, new Object[0]);
        if (event.f24796a != 0) {
            int i11 = s().o().f88564a;
            if (i11 == 3 || i11 == 2) {
                qb.c.b(f88531l, "Offline downloading, paused", new Object[0]);
                t();
            }
        }
    }

    public int p() {
        return o().f88564a;
    }

    public dc0.b<g> q() {
        return this.f88543i;
    }

    public float r() {
        return this.f88537c;
    }

    public void t() {
        qb.c.b(f88531l, "pauseOfflineDownload", new Object[0]);
        this.f88541g.b();
        v(4);
    }

    public final void u() {
        int i11;
        Set<Integer> set;
        if (p() == 2) {
            qb.c.d(f88531l, "prepareBatchDownload error " + p(), new Object[0]);
            return;
        }
        qb0.h hVar = this.f88545k;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f88545k.unsubscribe();
        }
        v(2);
        synchronized (this) {
            i11 = this.f88536b;
            set = this.f88540f;
            int A = x.r().A();
            this.f88538d = A;
            this.f88539e = A - this.f88540f.size();
        }
        qb.c.b(f88531l, "prepareDownload " + i11 + j2.O + set.size(), new Object[0]);
        this.f88545k = rx.c.u2(set).D(200).I3(bc0.c.e()).b2(new e(i11)).v6().b2(new C1158d(i11)).r5(new c());
    }

    public final void v(int state) {
        w(state, null);
    }

    public final void w(int state, String errmsg) {
        this.f88543i.onNext(new g(state, this.f88539e, this.f88538d, errmsg));
    }

    public synchronized void x(Context context, int bookId) {
        try {
            i9.l.a(context, bookId);
            i9.o.a(context, bookId);
            this.f88535a = context.getApplicationContext();
            this.f88536b = bookId;
            s.l();
            w.g().j(context, this.f88536b);
            m.g().c();
            qb0.h hVar = this.f88545k;
            if (hVar != null) {
                hVar.unsubscribe();
            }
            this.f88541g.purge();
            this.f88536b = bookId;
            l();
            this.f88540f.clear();
            this.f88538d = 0;
            this.f88539e = 0;
            v(0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void y() {
        int p11 = p();
        if (p11 == 1) {
            this.f88541g.c();
            u();
        } else if (p11 == 4) {
            this.f88541g.c();
            v(3);
        } else {
            qb.c.d(f88531l, "resumeOfflineDownload error code " + o(), new Object[0]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Set<Integer>> {
        public b() {
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Set<Integer> integers) {
            d.this.f88540f = integers;
            qb.c.i(d.f88531l, "missing %d", Integer.valueOf(d.this.f88540f.size()));
            if (d.this.f88540f.size() == 0) {
                d.this.v(6);
            } else {
                d.this.v(1);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }
}
