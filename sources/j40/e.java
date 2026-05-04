package j40;

import c40.v1;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class e extends v1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f63187b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63188c;

    /* renamed from: d, reason: collision with root package name */
    public final long f63189d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f63190e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public CoroutineScheduler f63191f;

    public e() {
        this(0, 0, 0L, null, 15, null);
    }

    public final void E(@m80.k Runnable runnable, boolean z11, boolean z12) {
        this.f63191f.E(runnable, z11, z12);
    }

    public final void H() {
        L();
    }

    public final synchronized void I(long j11) {
        this.f63191f.z0(j11);
    }

    public final synchronized void L() {
        this.f63191f.z0(1000L);
        this.f63191f = w();
    }

    @Override // c40.v1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f63191f.close();
    }

    @Override // c40.m0
    public void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        CoroutineScheduler.H(this.f63191f, runnable, false, false, 6, null);
    }

    @Override // c40.m0
    public void dispatchYield(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        CoroutineScheduler.H(this.f63191f, runnable, false, true, 2, null);
    }

    @Override // c40.v1
    @m80.k
    public Executor q() {
        return this.f63191f;
    }

    public final CoroutineScheduler w() {
        return new CoroutineScheduler(this.f63187b, this.f63188c, this.f63189d, this.f63190e);
    }

    public /* synthetic */ e(int i11, int i12, long j11, String str, int i13, v vVar) {
        this((i13 & 1) != 0 ? i.f63197c : i11, (i13 & 2) != 0 ? i.f63198d : i12, (i13 & 4) != 0 ? i.f63199e : j11, (i13 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public e(int i11, int i12, long j11, @m80.k String str) {
        this.f63187b = i11;
        this.f63188c = i12;
        this.f63189d = j11;
        this.f63190e = str;
        this.f63191f = w();
    }
}
