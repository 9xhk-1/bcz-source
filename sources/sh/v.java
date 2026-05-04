package sh;

import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.AuthCallback;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class v {

    /* renamed from: e, reason: collision with root package name */
    public static final String f88692e = "TopicWaitingHall";

    /* renamed from: a, reason: collision with root package name */
    public AtomicInteger f88693a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    public Set<f> f88694b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public Map<Integer, f> f88695c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public AuthCallback<f> f88696d;

    public void a(int count) {
        this.f88693a.addAndGet(count);
    }

    public synchronized void b() {
        this.f88693a.set(0);
        this.f88694b.clear();
        this.f88695c.clear();
    }

    public int c() {
        return this.f88695c.size();
    }

    public int d() {
        return this.f88693a.get();
    }

    public synchronized void e(Throwable throwable) {
        AuthCallback<f> authCallback = this.f88696d;
        if (authCallback != null) {
            authCallback.postError(throwable);
        }
    }

    public synchronized void f(TopicRecord record) {
        if (record == null) {
            return;
        }
        try {
            qb.c.b(f88692e, "notifyTopicFinish " + record, new Object[0]);
            Iterator<f> it = this.f88694b.iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next.a(record)) {
                    AuthCallback<f> authCallback = this.f88696d;
                    if (authCallback != null) {
                        authCallback.postProgress(next);
                    }
                    if (next.m()) {
                        this.f88695c.put(Integer.valueOf(next.c()), next);
                        AuthCallback<f> authCallback2 = this.f88696d;
                        if (authCallback2 != null) {
                            authCallback2.postSuccess(next);
                        }
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void g(int topicId, f waiter) {
        this.f88694b.add(waiter);
    }

    public void h(AuthCallback<f> observer) {
        this.f88696d = observer;
    }

    public void i(int count) {
        this.f88693a.addAndGet(-count);
    }

    public synchronized f j(int waiterId) {
        f fVar;
        fVar = this.f88695c.get(Integer.valueOf(waiterId));
        if (fVar != null) {
            this.f88693a.decrementAndGet();
        }
        return fVar;
    }
}
