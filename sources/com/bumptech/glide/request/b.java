package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import bl.d;
import com.bumptech.glide.request.RequestCoordinator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b implements RequestCoordinator, d {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final RequestCoordinator f28858a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28859b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f28860c;

    /* renamed from: d, reason: collision with root package name */
    public volatile d f28861d;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f28862e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f28863f;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("requestLock")
    public boolean f28864g;

    public b(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f28862e = requestState;
        this.f28863f = requestState;
        this.f28859b = obj;
        this.f28858a = requestCoordinator;
    }

    @GuardedBy("requestLock")
    private boolean j() {
        RequestCoordinator requestCoordinator = this.f28858a;
        return requestCoordinator == null || requestCoordinator.i(this);
    }

    @GuardedBy("requestLock")
    private boolean k() {
        RequestCoordinator requestCoordinator = this.f28858a;
        return requestCoordinator == null || requestCoordinator.e(this);
    }

    @GuardedBy("requestLock")
    private boolean l() {
        RequestCoordinator requestCoordinator = this.f28858a;
        return requestCoordinator == null || requestCoordinator.b(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void a(d dVar) {
        synchronized (this.f28859b) {
            try {
                if (dVar.equals(this.f28861d)) {
                    this.f28863f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f28862e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f28858a;
                if (requestCoordinator != null) {
                    requestCoordinator.a(this);
                }
                if (!this.f28863f.isComplete()) {
                    this.f28861d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean b(d dVar) {
        boolean z11;
        synchronized (this.f28859b) {
            try {
                z11 = l() && (dVar.equals(this.f28860c) || this.f28862e != RequestCoordinator.RequestState.SUCCESS);
            } finally {
            }
        }
        return z11;
    }

    @Override // bl.d
    public void c() {
        synchronized (this.f28859b) {
            try {
                this.f28864g = true;
                try {
                    if (this.f28862e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f28863f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f28863f = requestState2;
                            this.f28861d.c();
                        }
                    }
                    if (this.f28864g) {
                        RequestCoordinator.RequestState requestState3 = this.f28862e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f28862e = requestState4;
                            this.f28860c.c();
                        }
                    }
                    this.f28864g = false;
                } catch (Throwable th2) {
                    this.f28864g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // bl.d
    public void clear() {
        synchronized (this.f28859b) {
            this.f28864g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f28862e = requestState;
            this.f28863f = requestState;
            this.f28861d.clear();
            this.f28860c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, bl.d
    public boolean d() {
        boolean z11;
        synchronized (this.f28859b) {
            try {
                z11 = this.f28861d.d() || this.f28860c.d();
            } finally {
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean e(d dVar) {
        boolean z11;
        synchronized (this.f28859b) {
            try {
                z11 = k() && dVar.equals(this.f28860c) && !d();
            } finally {
            }
        }
        return z11;
    }

    @Override // bl.d
    public boolean f() {
        boolean z11;
        synchronized (this.f28859b) {
            z11 = this.f28862e == RequestCoordinator.RequestState.CLEARED;
        }
        return z11;
    }

    @Override // bl.d
    public boolean g(d dVar) {
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            if (this.f28860c != null ? this.f28860c.g(bVar.f28860c) : bVar.f28860c == null) {
                if (this.f28861d == null) {
                    if (bVar.f28861d == null) {
                        return true;
                    }
                } else if (this.f28861d.g(bVar.f28861d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f28859b) {
            try {
                RequestCoordinator requestCoordinator = this.f28858a;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void h(d dVar) {
        synchronized (this.f28859b) {
            try {
                if (!dVar.equals(this.f28860c)) {
                    this.f28863f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f28862e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f28858a;
                if (requestCoordinator != null) {
                    requestCoordinator.h(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean i(d dVar) {
        boolean z11;
        synchronized (this.f28859b) {
            try {
                z11 = j() && dVar.equals(this.f28860c) && this.f28862e != RequestCoordinator.RequestState.PAUSED;
            } finally {
            }
        }
        return z11;
    }

    @Override // bl.d
    public boolean isComplete() {
        boolean z11;
        synchronized (this.f28859b) {
            z11 = this.f28862e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z11;
    }

    @Override // bl.d
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f28859b) {
            z11 = this.f28862e == RequestCoordinator.RequestState.RUNNING;
        }
        return z11;
    }

    public void m(d dVar, d dVar2) {
        this.f28860c = dVar;
        this.f28861d = dVar2;
    }

    @Override // bl.d
    public void pause() {
        synchronized (this.f28859b) {
            try {
                if (!this.f28863f.isComplete()) {
                    this.f28863f = RequestCoordinator.RequestState.PAUSED;
                    this.f28861d.pause();
                }
                if (!this.f28862e.isComplete()) {
                    this.f28862e = RequestCoordinator.RequestState.PAUSED;
                    this.f28860c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
