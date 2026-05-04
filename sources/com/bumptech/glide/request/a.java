package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import bl.d;
import com.bumptech.glide.request.RequestCoordinator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a implements RequestCoordinator, d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f28852a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final RequestCoordinator f28853b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f28854c;

    /* renamed from: d, reason: collision with root package name */
    public volatile d f28855d;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f28856e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f28857f;

    public a(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f28856e = requestState;
        this.f28857f = requestState;
        this.f28852a = obj;
        this.f28853b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void a(d dVar) {
        synchronized (this.f28852a) {
            try {
                if (dVar.equals(this.f28854c)) {
                    this.f28856e = RequestCoordinator.RequestState.SUCCESS;
                } else if (dVar.equals(this.f28855d)) {
                    this.f28857f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f28853b;
                if (requestCoordinator != null) {
                    requestCoordinator.a(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean b(d dVar) {
        boolean m11;
        synchronized (this.f28852a) {
            m11 = m();
        }
        return m11;
    }

    @Override // bl.d
    public void c() {
        synchronized (this.f28852a) {
            try {
                RequestCoordinator.RequestState requestState = this.f28856e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f28856e = requestState2;
                    this.f28854c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bl.d
    public void clear() {
        synchronized (this.f28852a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f28856e = requestState;
                this.f28854c.clear();
                if (this.f28857f != requestState) {
                    this.f28857f = requestState;
                    this.f28855d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, bl.d
    public boolean d() {
        boolean z11;
        synchronized (this.f28852a) {
            try {
                z11 = this.f28854c.d() || this.f28855d.d();
            } finally {
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean e(d dVar) {
        boolean z11;
        synchronized (this.f28852a) {
            try {
                z11 = l() && j(dVar);
            } finally {
            }
        }
        return z11;
    }

    @Override // bl.d
    public boolean f() {
        boolean z11;
        synchronized (this.f28852a) {
            try {
                RequestCoordinator.RequestState requestState = this.f28856e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z11 = requestState == requestState2 && this.f28857f == requestState2;
            } finally {
            }
        }
        return z11;
    }

    @Override // bl.d
    public boolean g(d dVar) {
        if (dVar instanceof a) {
            a aVar = (a) dVar;
            if (this.f28854c.g(aVar.f28854c) && this.f28855d.g(aVar.f28855d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f28852a) {
            try {
                RequestCoordinator requestCoordinator = this.f28853b;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void h(d dVar) {
        synchronized (this.f28852a) {
            try {
                if (dVar.equals(this.f28855d)) {
                    this.f28857f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.f28853b;
                    if (requestCoordinator != null) {
                        requestCoordinator.h(this);
                    }
                    return;
                }
                this.f28856e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f28857f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f28857f = requestState2;
                    this.f28855d.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean i(d dVar) {
        boolean z11;
        synchronized (this.f28852a) {
            try {
                z11 = k() && dVar.equals(this.f28854c);
            } finally {
            }
        }
        return z11;
    }

    @Override // bl.d
    public boolean isComplete() {
        boolean z11;
        synchronized (this.f28852a) {
            try {
                RequestCoordinator.RequestState requestState = this.f28856e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z11 = requestState == requestState2 || this.f28857f == requestState2;
            } finally {
            }
        }
        return z11;
    }

    @Override // bl.d
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f28852a) {
            try {
                RequestCoordinator.RequestState requestState = this.f28856e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z11 = requestState == requestState2 || this.f28857f == requestState2;
            } finally {
            }
        }
        return z11;
    }

    @GuardedBy("requestLock")
    public final boolean j(d dVar) {
        RequestCoordinator.RequestState requestState = this.f28856e;
        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.FAILED;
        if (requestState != requestState2) {
            return dVar.equals(this.f28854c);
        }
        if (!dVar.equals(this.f28855d)) {
            return false;
        }
        RequestCoordinator.RequestState requestState3 = this.f28857f;
        return requestState3 == RequestCoordinator.RequestState.SUCCESS || requestState3 == requestState2;
    }

    @GuardedBy("requestLock")
    public final boolean k() {
        RequestCoordinator requestCoordinator = this.f28853b;
        return requestCoordinator == null || requestCoordinator.i(this);
    }

    @GuardedBy("requestLock")
    public final boolean l() {
        RequestCoordinator requestCoordinator = this.f28853b;
        return requestCoordinator == null || requestCoordinator.e(this);
    }

    @GuardedBy("requestLock")
    public final boolean m() {
        RequestCoordinator requestCoordinator = this.f28853b;
        return requestCoordinator == null || requestCoordinator.b(this);
    }

    public void n(d dVar, d dVar2) {
        this.f28854c = dVar;
        this.f28855d = dVar2;
    }

    @Override // bl.d
    public void pause() {
        synchronized (this.f28852a) {
            try {
                RequestCoordinator.RequestState requestState = this.f28856e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f28856e = RequestCoordinator.RequestState.PAUSED;
                    this.f28854c.pause();
                }
                if (this.f28857f == requestState2) {
                    this.f28857f = RequestCoordinator.RequestState.PAUSED;
                    this.f28855d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
