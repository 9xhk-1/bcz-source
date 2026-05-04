package rx.internal.producers;

import qb0.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a implements d {

    /* renamed from: g, reason: collision with root package name */
    public static final d f86499g = new C1110a();

    /* renamed from: a, reason: collision with root package name */
    public long f86500a;

    /* renamed from: b, reason: collision with root package name */
    public d f86501b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f86502c;

    /* renamed from: d, reason: collision with root package name */
    public long f86503d;

    /* renamed from: e, reason: collision with root package name */
    public long f86504e;

    /* renamed from: f, reason: collision with root package name */
    public d f86505f;

    public void a() {
        while (true) {
            synchronized (this) {
                try {
                    long j11 = this.f86503d;
                    long j12 = this.f86504e;
                    d dVar = this.f86505f;
                    if (j11 == 0 && j12 == 0 && dVar == null) {
                        this.f86502c = false;
                        return;
                    }
                    this.f86503d = 0L;
                    this.f86504e = 0L;
                    this.f86505f = null;
                    long j13 = this.f86500a;
                    if (j13 != Long.MAX_VALUE) {
                        long j14 = j13 + j11;
                        if (j14 < 0 || j14 == Long.MAX_VALUE) {
                            this.f86500a = Long.MAX_VALUE;
                            j13 = Long.MAX_VALUE;
                        } else {
                            j13 = j14 - j12;
                            if (j13 < 0) {
                                throw new IllegalStateException("more produced than requested");
                            }
                            this.f86500a = j13;
                        }
                    }
                    if (dVar == null) {
                        d dVar2 = this.f86501b;
                        if (dVar2 != null && j11 != 0) {
                            dVar2.request(j11);
                        }
                    } else if (dVar == f86499g) {
                        this.f86501b = null;
                    } else {
                        this.f86501b = dVar;
                        dVar.request(j13);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void b(long j11) {
        if (j11 <= 0) {
            throw new IllegalArgumentException("n > 0 required");
        }
        synchronized (this) {
            try {
                if (this.f86502c) {
                    this.f86504e += j11;
                    return;
                }
                this.f86502c = true;
                try {
                    long j12 = this.f86500a;
                    if (j12 != Long.MAX_VALUE) {
                        long j13 = j12 - j11;
                        if (j13 < 0) {
                            throw new IllegalStateException("more items arrived than were requested");
                        }
                        this.f86500a = j13;
                    }
                    a();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f86502c = false;
                        throw th2;
                    }
                }
            } finally {
            }
        }
    }

    public void c(d dVar) {
        synchronized (this) {
            try {
                if (this.f86502c) {
                    if (dVar == null) {
                        dVar = f86499g;
                    }
                    this.f86505f = dVar;
                    return;
                }
                this.f86502c = true;
                try {
                    this.f86501b = dVar;
                    if (dVar != null) {
                        dVar.request(this.f86500a);
                    }
                    a();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f86502c = false;
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
                if (this.f86502c) {
                    this.f86503d += j11;
                    return;
                }
                this.f86502c = true;
                try {
                    long j12 = this.f86500a + j11;
                    if (j12 < 0) {
                        j12 = Long.MAX_VALUE;
                    }
                    this.f86500a = j12;
                    d dVar = this.f86501b;
                    if (dVar != null) {
                        dVar.request(j11);
                    }
                    a();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f86502c = false;
                        throw th2;
                    }
                }
            } finally {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: rx.internal.producers.a$a, reason: collision with other inner class name */
    public static class C1110a implements d {
        @Override // qb0.d
        public void request(long j11) {
        }
    }
}
