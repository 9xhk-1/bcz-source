package com.baicizhan.client.business.thrift;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import org.apache.thrift.TServiceClient;
import org.apache.thrift.TServiceClientFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class r {

    /* renamed from: g, reason: collision with root package name */
    public static final int f16670g = 4;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, a> f16671a;

    /* renamed from: b, reason: collision with root package name */
    public int f16672b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<s> f16673c;

    /* renamed from: d, reason: collision with root package name */
    public PriorityBlockingQueue<q> f16674d;

    /* renamed from: e, reason: collision with root package name */
    public Set<q> f16675e;

    /* renamed from: f, reason: collision with root package name */
    public e f16676f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f16677a;

        /* renamed from: b, reason: collision with root package name */
        public com.baicizhan.client.business.thrift.a f16678b;

        /* renamed from: c, reason: collision with root package name */
        public TServiceClientFactory<?> f16679c;

        public a(String name, com.baicizhan.client.business.thrift.a urlPolicy, TServiceClientFactory<?> factory) {
            this.f16677a = name;
            this.f16678b = urlPolicy;
            this.f16679c = factory;
        }
    }

    public r() {
        this(4);
    }

    public static <T extends TServiceClient> T d(Context context, String token, String domain, String[] serverUrls, TServiceClientFactory<T> factory) throws TTransportException {
        k kVar = new k((serverUrls == null || serverUrls.length == 0) ? new com.baicizhan.client.business.thrift.a(domain) : new com.baicizhan.client.business.thrift.a(domain, serverUrls));
        j jVar = new j(kVar);
        b bVar = new b(context);
        if (!TextUtils.isEmpty(token)) {
            bVar.put("access_token", token);
        }
        kVar.i(bVar);
        kVar.j(2);
        jVar.open();
        return factory.getClient(new TCompactProtocol(jVar));
    }

    public static k i(TServiceClient client) throws IllegalStateException {
        TTransport transport = client.getInputProtocol().getTransport();
        if (transport instanceof j) {
            TTransport a11 = ((j) transport).a();
            if (a11 instanceof k) {
                return (k) a11;
            }
        }
        throw new IllegalStateException("thrift transport is not http");
    }

    public void a(ThriftRequest<?, ?> request) {
        if (request != null) {
            q qVar = new q(request);
            synchronized (this) {
                this.f16675e.add(qVar);
            }
            this.f16674d.add(qVar);
        }
    }

    public void b(String tag) {
        synchronized (this) {
            try {
                Iterator<q> it = this.f16675e.iterator();
                while (it.hasNext()) {
                    q next = it.next();
                    if (TextUtils.equals(next.c(), tag)) {
                        next.a();
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [org.apache.thrift.TServiceClient] */
    public TServiceClient c(String domain) throws TTransportException {
        a h11 = h(domain);
        if (h11 == null) {
            throw new TTransportException("service domain not exists " + domain);
        }
        k kVar = new k(h11.f16678b);
        j jVar = new j(kVar);
        kVar.i(this.f16676f);
        kVar.j(1);
        jVar.open();
        return h11.f16679c.getClient(new TCompactProtocol(jVar));
    }

    public void e(TServiceClient client) {
        client.getInputProtocol().getTransport().close();
        client.getOutputProtocol().getTransport().close();
    }

    public void f(q runner) {
        if (runner != null) {
            synchronized (this) {
                this.f16675e.remove(runner);
            }
        }
    }

    public Map<String, a> g() {
        return this.f16671a;
    }

    public a h(String domain) {
        return this.f16671a.get(domain);
    }

    public boolean j(String key) {
        return this.f16676f.b(key);
    }

    public void k(String key, String value) {
        this.f16676f.put(key, value);
    }

    public void l(a entry) {
        this.f16671a.put(entry.f16677a, entry);
    }

    public void m(String key) {
        this.f16676f.remove(key);
    }

    public void n(e cookieInflator) {
        this.f16676f = cookieInflator;
    }

    public void o() {
        p();
        for (int i11 = 0; i11 < this.f16672b; i11++) {
            s sVar = new s(this, this.f16674d);
            this.f16673c.add(sVar);
            sVar.start();
        }
    }

    public void p() {
        Iterator<s> it = this.f16673c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f16673c.clear();
        this.f16674d.clear();
    }

    public r(int threadPoolSize) {
        this.f16671a = new HashMap();
        this.f16675e = new HashSet();
        this.f16672b = threadPoolSize;
        this.f16673c = new ArrayList<>(threadPoolSize);
        this.f16674d = new PriorityBlockingQueue<>();
    }
}
