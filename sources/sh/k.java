package sh;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.WordClozeRecord;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.ZpkInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.j2;
import q9.x;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class k {

    /* renamed from: m, reason: collision with root package name */
    public static final String f88617m = "ProblemLoader";

    /* renamed from: n, reason: collision with root package name */
    public static final k f88618n = new k();

    /* renamed from: o, reason: collision with root package name */
    public static final qb0.c<Object> f88619o = new g();

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f88620a;

    /* renamed from: b, reason: collision with root package name */
    public int f88621b;

    /* renamed from: c, reason: collision with root package name */
    public ec0.b f88622c;

    /* renamed from: d, reason: collision with root package name */
    public qb0.h f88623d;

    /* renamed from: h, reason: collision with root package name */
    public sh.l f88627h;

    /* renamed from: k, reason: collision with root package name */
    public dc0.c<sh.f> f88630k;

    /* renamed from: e, reason: collision with root package name */
    public Map<Integer, Pair<TopicRecord, Boolean>> f88624e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public Map<Integer, dc0.a<TopicRecord>> f88625f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public Map<Integer, ZpkInfo> f88626g = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Queue<Integer> f88628i = new LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public LinkedBlockingQueue<sh.f> f88629j = new LinkedBlockingQueue<>();

    /* renamed from: l, reason: collision with root package name */
    public Set<Integer> f88631l = new HashSet();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.p<Integer, rx.c<TopicRecord>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f88632a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f88633b;

        public a(final int val$bookId, final int val$id) {
            this.f88632a = val$bookId;
            this.f88633b = val$id;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<TopicRecord> call(Integer integer) {
            return k.this.u(this.f88632a, integer.intValue(), this.f88633b == integer.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements wb0.p<List<Integer>, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f88642a;

        public c(final int val$bookId) {
            this.f88642a = val$bookId;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(List<Integer> integers) {
            try {
                List<ZpkInfo> list = ((ResourceService.Client) new com.baicizhan.client.business.thrift.l("/rpc/resource_api").c(1).b(10000).d(10000).a()).get_zpk_infos(TopicIdMapingUtils.buildTopicKeyList(integers, this.f88642a));
                synchronized (k.this) {
                    try {
                        for (ZpkInfo zpkInfo : list) {
                            k.this.f88626g.put(Integer.valueOf(zpkInfo.getTopic_key().getTopic_id()), zpkInfo);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Boolean.TRUE;
            } catch (Throwable th3) {
                throw vb0.a.c(th3);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements wb0.p<List<Integer>, rx.c<sh.f>> {
        public e() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<sh.f> call(List<Integer> integers) {
            k kVar = k.this;
            return kVar.H(kVar.f88621b, integers);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements c.a<List<Integer>> {
        public f() {
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super List<Integer>> subscriber) {
            subscriber.onStart();
            try {
                qb.c.i(k.f88617m, "===== preload ====", new Object[0]);
                k.this.v();
                subscriber.onNext(new ArrayList(k.this.f88628i));
            } catch (Exception e11) {
                subscriber.onError(e11);
            }
            subscriber.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements wb0.p<Integer, rx.c<sh.f>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f88647a;

        public h(final int val$bookId) {
            this.f88647a = val$bookId;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<sh.f> call(Integer id2) {
            return k.this.F(this.f88647a, id2.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements wb0.p<Collection<Integer>, rx.c<Integer>> {
        public i() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Integer> call(Collection<Integer> integers) {
            return rx.c.u2(integers);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements wb0.p<Collection<Integer>, Collection<Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f88650a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends qb0.g<Boolean> {
            public a() {
            }

            @Override // qb0.c
            public void onNext(Boolean aBoolean) {
            }

            @Override // qb0.c
            public void onCompleted() {
            }

            @Override // qb0.c
            public void onError(Throwable e11) {
            }
        }

        public j(final int val$bookId) {
            this.f88650a = val$bookId;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<Integer> call(Collection<Integer> ids) {
            qb.c.b(k.f88617m, "===== start load =====" + TextUtils.join(",", ids), new Object[0]);
            Collection M = k.this.M(this.f88650a, ids);
            qb.c.i(k.f88617m, "needDownload " + TextUtils.join(j2.O, M), new Object[0]);
            qb.c.i(k.f88617m, "network %d mPreloadingTopics %s", Integer.valueOf(rb.d.b(k.this.x())), new com.google.gson.d().z(k.this.f88624e.keySet()));
            if (M.size() > 0) {
                k.this.N(this.f88650a, M).t6().v(new a());
            }
            return ids;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: sh.k$k, reason: collision with other inner class name */
    public class C1160k implements wb0.p<rx.c<? extends Throwable>, rx.c<Long>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: sh.k$k$a */
        public class a implements wb0.p<Integer, rx.c<Long>> {
            public a() {
            }

            @Override // wb0.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public rx.c<Long> call(Integer integer) {
                qb.c.b(k.f88617m, "backoff retry " + integer + ", seconds " + (integer.intValue() * 20), new Object[0]);
                return rx.c.o6(integer.intValue() * 20, TimeUnit.SECONDS);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: sh.k$k$b */
        public class b implements wb0.q<Throwable, Integer, Integer> {
            public b() {
            }

            @Override // wb0.q
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer call(Throwable throwable, Integer integer) {
                qb.c.c("", "load problem error occurred.", throwable);
                if (throwable instanceof IllegalStateException) {
                    throw vb0.a.c(throwable);
                }
                if (!rb.d.f(k.this.x())) {
                    qb.c.d(k.f88617m, "load failed, reason: network unreachable", new Object[0]);
                    throw new RuntimeException("network unreachable");
                }
                if (integer.intValue() < 3) {
                    return integer;
                }
                qb.c.d(k.f88617m, "load failed, reason: backoff retry exceed", new Object[0]);
                throw new RuntimeException("backoff retry exceed");
            }
        }

        public C1160k() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Long> call(rx.c<? extends Throwable> attempts) {
            return attempts.v7(rx.c.b4(1, 3), new b()).b2(new a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l implements wb0.q<sh.f, TopicRecord, sh.f> {
        public l() {
        }

        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sh.f call(sh.f problemAsset, TopicRecord topicRecord) {
            problemAsset.a(topicRecord);
            k.this.G(problemAsset);
            return problemAsset;
        }
    }

    public static k D() {
        return f88618n;
    }

    public synchronized boolean A() {
        if (!this.f88629j.isEmpty() || !this.f88628i.isEmpty()) {
            return true;
        }
        return this.f88627h.hasNext();
    }

    public final <T> qb0.c<T> B() {
        return (qb0.c<T>) f88619o;
    }

    public synchronized void C(sh.l source) {
        P();
        this.f88627h = source;
        this.f88621b = x.r().l();
        this.f88622c = new ec0.b();
        this.f88629j.clear();
        this.f88628i.clear();
        this.f88625f.clear();
        this.f88626g.clear();
        this.f88630k = dc0.c.y7();
        r.f88672a.d().clear();
        ed.a.f49644a.c();
        qb.c.i(f88617m, "%s", source.getClass());
    }

    public final synchronized boolean E() {
        boolean z11;
        qb0.h hVar = this.f88623d;
        if (hVar != null) {
            z11 = hVar.isUnsubscribed() ? false : true;
        }
        return z11;
    }

    public final rx.c<sh.f> F(final int bookId, final int id2) {
        int[] E = x.r().E(id2);
        return rx.c.P2(Integer.valueOf(id2), Integer.valueOf(E[0]), Integer.valueOf(E[1]), Integer.valueOf(E[2])).b2(new a(bookId, id2)).e4(new sh.f(id2, E), new l()).L1(new wb0.b() { // from class: sh.h
            @Override // wb0.b
            public final void call(Object obj) {
                r.f88672a.e(bookId, id2).t6().x(new wb0.b() { // from class: sh.i
                    @Override // wb0.b
                    public final void call(Object obj2) {
                        k.c(obj2);
                    }
                }, new wb0.b() { // from class: sh.j
                    @Override // wb0.b
                    public final void call(Object obj2) {
                        qb.c.c(k.f88617m, "", (Throwable) obj2);
                    }
                });
            }
        }).F4(new C1160k());
    }

    public final void G(sh.f problemAsset) {
        int c11 = problemAsset.c();
        Map<Integer, WordClozeRecord> I = x.r().I();
        WordClozeRecord wordClozeRecord = I.get(Integer.valueOf(c11));
        if (wordClozeRecord == null || wordClozeRecord.getClozeData() == null) {
            I.put(Integer.valueOf(c11), i9.n.a(x(), c11));
        }
    }

    public final rx.c<sh.f> H(final int bookId, Collection<Integer> problemProxies) {
        return rx.c.M2(problemProxies).I3(bc0.c.a()).c3(new j(bookId)).b2(new i()).Z0(new h(bookId));
    }

    public synchronized rx.c<sh.f> I() {
        if (!A()) {
            return rx.c.M2(null);
        }
        if (!E() && this.f88629j.size() < 3) {
            L();
        }
        sh.f peek = this.f88629j.peek();
        if (peek != null) {
            return rx.c.M2(peek);
        }
        return this.f88630k.X1().I3(tb0.a.a());
    }

    public synchronized int J() {
        if (this.f88629j.size() > 0) {
            return this.f88629j.peek().c();
        }
        v();
        if (this.f88628i.size() <= 0) {
            return 0;
        }
        return this.f88628i.peek().intValue();
    }

    @Deprecated
    public synchronized void K() {
        try {
            if (this.f88629j.size() > 0) {
                sh.l lVar = this.f88627h;
                if (lVar instanceof o) {
                    ((o) lVar).b();
                }
                this.f88629j.poll();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void L() {
        if (E()) {
            return;
        }
        this.f88623d = rx.c.j1(new f()).w5(bc0.c.d()).b2(new e()).I3(tb0.a.a()).r5(new d());
    }

    public final Collection<Integer> M(final int bookId, Collection<Integer> ids) {
        this.f88624e.clear();
        Set<Integer> b11 = gi.e.b(ids);
        qb.c.b(f88617m, "===== checkiDS =====" + TextUtils.join(",", b11), new Object[0]);
        HashSet hashSet = new HashSet();
        Map<Integer, TopicRecord> e11 = i9.l.e(x(), bookId, b11);
        for (Integer num : b11) {
            int intValue = num.intValue();
            TopicRecord topicRecord = e11.get(num);
            if (!sh.c.d().g(intValue) && topicRecord == null) {
                topicRecord = sh.a.b().e(bookId, intValue);
            }
            if (topicRecord == null) {
                hashSet.add(num);
            } else if (!t.b(topicRecord)) {
                hashSet.add(num);
            } else if (ids.contains(num) && rb.d.f(x()) && !t.c(topicRecord)) {
                hashSet.add(num);
                this.f88624e.put(num, Pair.create(topicRecord, Boolean.FALSE));
            } else {
                this.f88624e.put(num, Pair.create(topicRecord, Boolean.TRUE));
            }
        }
        return hashSet;
    }

    public final rx.c<Boolean> N(final int bookId, Collection<Integer> ids) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                for (Integer num : ids) {
                    num.intValue();
                    if (!this.f88626g.containsKey(num)) {
                        arrayList.add(num);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList.size() == 0 ? rx.c.M2(Boolean.TRUE) : rx.c.M2(arrayList).I3(bc0.c.e()).c3(new c(bookId));
    }

    public final boolean O(int bookId, int mainTopic) {
        sh.c d11 = sh.c.d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(mainTopic));
        Set<Integer> b11 = gi.e.b(arrayList);
        Map<Integer, TopicRecord> e11 = i9.l.e(x(), bookId, b11);
        for (Integer num : b11) {
            TopicRecord topicRecord = e11.get(num);
            if (d11.g(num.intValue()) && !t.c(topicRecord) && !t.a(topicRecord)) {
                return true;
            }
        }
        return false;
    }

    public synchronized void P() {
        try {
            qb.c.b(f88617m, "unsubscribe", new Object[0]);
            if (E()) {
                this.f88623d.unsubscribe();
            }
            ec0.b bVar = this.f88622c;
            if (bVar != null && !bVar.isUnsubscribed()) {
                this.f88622c.unsubscribe();
            }
            this.f88622c = null;
            this.f88623d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void Q(Context context) {
        this.f88620a = new WeakReference<>(context);
        this.f88631l.clear();
    }

    public synchronized void s(int topicId) {
        sh.f fVar = new sh.f(topicId, new int[4]);
        fVar.o(topicId);
        t(fVar);
    }

    public synchronized void t(sh.f asset) {
        if (asset == null) {
            return;
        }
        try {
            if (this.f88629j.size() > 0) {
                if ((this.f88627h instanceof o) && this.f88629j.contains(asset)) {
                    ((o) this.f88627h).b();
                }
                this.f88629j.remove(asset);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final rx.c<TopicRecord> u(final int bookId, final int topicId, final boolean isPrimary) {
        Pair<TopicRecord, Boolean> pair = this.f88624e.get(Integer.valueOf(topicId));
        return (pair == null || !((Boolean) pair.second).booleanValue()) ? rx.c.r1(new b(topicId, bookId, pair)).w5(bc0.c.e()) : rx.c.M2((TopicRecord) pair.first);
    }

    public synchronized void v() {
        if (this.f88628i.size() > 0) {
            return;
        }
        List<Integer> a11 = this.f88627h.a(5);
        while (!a11.isEmpty()) {
            qb.c.b(f88617m, "drain " + TextUtils.join(j2.O, a11), new Object[0]);
            w(a11);
            this.f88628i.addAll(a11);
            if (!a11.isEmpty()) {
                break;
            } else {
                a11 = this.f88627h.a(5);
            }
        }
    }

    public final void w(List<Integer> ids) {
        if (xb.e.h(ids)) {
            return;
        }
        Iterator<Integer> it = ids.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            int intValue = next.intValue();
            if (O(this.f88621b, intValue)) {
                if (this.f88631l.contains(next)) {
                    qb.c.i(f88617m, "skip problem failed %d", next);
                } else {
                    this.f88631l.add(next);
                    x r11 = x.r();
                    r11.s().u().e(r11.w(intValue));
                    sh.l lVar = this.f88627h;
                    if (lVar instanceof o) {
                        ((o) lVar).b();
                    }
                    it.remove();
                    qb.c.i(f88617m, "skip problem %s", next);
                }
            }
        }
    }

    public final Context x() {
        WeakReference<Context> weakReference;
        synchronized (this) {
            weakReference = this.f88620a;
        }
        if (weakReference == null) {
            throw new IllegalStateException("context has not set");
        }
        Context context = weakReference.get();
        if (context == null) {
            context = pb.a.a();
        }
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("context has been destroyed");
    }

    public rx.c<sh.f> y() {
        return this.f88630k;
    }

    public synchronized int z() {
        return this.f88629j.size();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements wb0.o<rx.c<TopicRecord>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f88635a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f88636b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Pair f88637c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: sh.k$b$b, reason: collision with other inner class name */
        public class C1159b implements wb0.a {
            public C1159b() {
            }

            @Override // wb0.a
            public void call() {
                synchronized (k.this) {
                    k.this.f88625f.remove(Integer.valueOf(b.this.f88635a));
                }
            }
        }

        public b(final int val$topicId, final int val$bookId, final Pair val$entry) {
            this.f88635a = val$topicId;
            this.f88636b = val$bookId;
            this.f88637c = val$entry;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<TopicRecord> call() {
            dc0.a aVar;
            synchronized (k.this) {
                try {
                    aVar = (dc0.a) k.this.f88625f.get(Integer.valueOf(this.f88635a));
                    if (aVar == null) {
                        aVar = dc0.a.y7();
                        a aVar2 = new a(aVar);
                        aVar2.add(ec0.f.a(new C1159b()));
                        k.this.f88625f.put(Integer.valueOf(this.f88635a), aVar);
                        s sVar = new s(this.f88636b, this.f88635a);
                        ZpkInfo zpkInfo = (ZpkInfo) k.this.f88626g.get(Integer.valueOf(this.f88635a));
                        if (zpkInfo != null) {
                            sVar.n(zpkInfo);
                        }
                        sVar.m(i9.l.d(pb.a.a(), this.f88636b, this.f88635a));
                        Pair pair = this.f88637c;
                        if (pair != null) {
                            sVar.m((TopicRecord) pair.first);
                        }
                        k.this.f88622c.a(th.s.d(sVar, bc0.c.e()).r5(aVar2));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return aVar;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends qb0.g<TopicRecord> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dc0.a f88639a;

            public a(final dc0.a val$o) {
                this.f88639a = val$o;
            }

            @Override // qb0.c
            public void onError(Throwable e11) {
                this.f88639a.onError(e11);
            }

            @Override // qb0.c
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public void onNext(TopicRecord topicRecord) {
                this.f88639a.onNext(topicRecord);
                this.f88639a.onCompleted();
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends qb0.g<sh.f> {
        public d() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(k.f88617m, "", e11);
            k.this.f88630k.onError(e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(sh.f problemAsset) {
            qb.c.i(k.f88617m, "preload success " + problemAsset, new Object[0]);
            sh.e.e().f(problemAsset.c(), problemAsset.j().coverage);
            synchronized (k.this) {
                k.this.f88628i.remove(Integer.valueOf(problemAsset.c()));
                k.this.f88629j.offer(problemAsset);
                k.this.f88630k.onNext(problemAsset);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements qb0.c<Object> {
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

    public static /* synthetic */ void c(Object obj) {
    }
}
