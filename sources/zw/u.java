package zw;

import kotlin.time.DurationUnit;
import kotlin.time.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f102990a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f102991b;

    /* renamed from: c, reason: collision with root package name */
    public long f102992c;

    public u() {
        e.a aVar = kotlin.time.e.f67757b;
        this.f102992c = kotlin.time.f.w(3000, DurationUnit.MILLISECONDS);
    }

    public final long a() {
        return this.f102992c;
    }

    public final boolean b() {
        return this.f102990a;
    }

    public final boolean c() {
        return this.f102991b;
    }

    public final void d(long j11) {
        this.f102992c = j11;
    }

    public final void e(boolean z11) {
        this.f102990a = z11;
    }

    public final void f(boolean z11) {
        this.f102991b = z11;
    }

    public final void g() {
        this.f102990a = true;
    }

    public final void h() {
        this.f102991b = true;
    }
}
