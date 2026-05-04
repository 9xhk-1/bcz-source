package rx.internal.producers;

import java.util.ArrayList;
import java.util.List;
import qb0.c;
import qb0.d;
import qb0.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b<T> implements d, c<T> {

    /* renamed from: j, reason: collision with root package name */
    public static final d f86506j = new a();

    /* renamed from: a, reason: collision with root package name */
    public final g<? super T> f86507a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f86508b;

    /* renamed from: c, reason: collision with root package name */
    public List<T> f86509c;

    /* renamed from: d, reason: collision with root package name */
    public d f86510d;

    /* renamed from: e, reason: collision with root package name */
    public long f86511e;

    /* renamed from: f, reason: collision with root package name */
    public long f86512f;

    /* renamed from: g, reason: collision with root package name */
    public d f86513g;

    /* renamed from: h, reason: collision with root package name */
    public Object f86514h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f86515i;

    public b(g<? super T> gVar) {
        this.f86507a = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0009, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.producers.b.c():void");
    }

    @Override // qb0.c
    public void onCompleted() {
        synchronized (this) {
            try {
                if (this.f86508b) {
                    this.f86514h = Boolean.TRUE;
                } else {
                    this.f86508b = true;
                    this.f86507a.onCompleted();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        boolean z11;
        synchronized (this) {
            try {
                if (this.f86508b) {
                    this.f86514h = th2;
                    z11 = false;
                } else {
                    this.f86508b = true;
                    z11 = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z11) {
            this.f86507a.onError(th2);
        } else {
            this.f86515i = true;
        }
    }

    @Override // qb0.c
    public void onNext(T t11) {
        synchronized (this) {
            try {
                if (this.f86508b) {
                    List list = this.f86509c;
                    if (list == null) {
                        list = new ArrayList(4);
                        this.f86509c = list;
                    }
                    list.add(t11);
                    return;
                }
                this.f86508b = true;
                try {
                    this.f86507a.onNext(t11);
                    long j11 = this.f86511e;
                    if (j11 != Long.MAX_VALUE) {
                        this.f86511e = j11 - 1;
                    }
                    c();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f86508b = false;
                        throw th2;
                    }
                }
            } finally {
            }
        }
    }

    @Override // qb0.d
    public void request(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j11 == 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f86508b) {
                    this.f86512f += j11;
                    return;
                }
                this.f86508b = true;
                d dVar = this.f86510d;
                try {
                    long j12 = this.f86511e + j11;
                    if (j12 < 0) {
                        j12 = Long.MAX_VALUE;
                    }
                    this.f86511e = j12;
                    c();
                    if (dVar != null) {
                        dVar.request(j11);
                    }
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f86508b = false;
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void setProducer(d dVar) {
        synchronized (this) {
            try {
                if (this.f86508b) {
                    if (dVar == null) {
                        dVar = f86506j;
                    }
                    this.f86513g = dVar;
                    return;
                }
                this.f86508b = true;
                this.f86510d = dVar;
                long j11 = this.f86511e;
                try {
                    c();
                    if (dVar == null || j11 == 0) {
                        return;
                    }
                    dVar.request(j11);
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f86508b = false;
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements d {
        @Override // qb0.d
        public void request(long j11) {
        }
    }
}
