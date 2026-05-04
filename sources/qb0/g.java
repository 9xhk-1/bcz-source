package qb0;

import rx.internal.util.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class g<T> implements c<T>, h {
    private static final long NOT_SET = Long.MIN_VALUE;
    private d producer;
    private long requested;
    private final g<?> subscriber;
    private final m subscriptions;

    public g() {
        this(null, false);
    }

    public final void add(h hVar) {
        this.subscriptions.a(hVar);
    }

    @Override // qb0.h
    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public final void n(long j11) {
        long j12 = this.requested;
        if (j12 == Long.MIN_VALUE) {
            this.requested = j11;
            return;
        }
        long j13 = j12 + j11;
        if (j13 < 0) {
            this.requested = Long.MAX_VALUE;
        } else {
            this.requested = j13;
        }
    }

    public final void request(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("number requested cannot be negative: " + j11);
        }
        synchronized (this) {
            d dVar = this.producer;
            if (dVar != null) {
                dVar.request(j11);
            } else {
                n(j11);
            }
        }
    }

    public void setProducer(d dVar) {
        long j11;
        g<?> gVar;
        boolean z11;
        synchronized (this) {
            j11 = this.requested;
            this.producer = dVar;
            gVar = this.subscriber;
            z11 = gVar != null && j11 == Long.MIN_VALUE;
        }
        if (z11) {
            gVar.setProducer(dVar);
        } else if (j11 == Long.MIN_VALUE) {
            dVar.request(Long.MAX_VALUE);
        } else {
            dVar.request(j11);
        }
    }

    @Override // qb0.h
    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    public g(g<?> gVar) {
        this(gVar, true);
    }

    public g(g<?> gVar, boolean z11) {
        this.requested = Long.MIN_VALUE;
        this.subscriber = gVar;
        this.subscriptions = (!z11 || gVar == null) ? new m() : gVar.subscriptions;
    }

    public void onStart() {
    }
}
