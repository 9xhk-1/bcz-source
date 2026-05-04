package b50;

import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6109a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6110b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6111c;

    public b() {
        this(false, false, 0L, 7, null);
    }

    public final long a() {
        return this.f6111c;
    }

    public final boolean b() {
        return this.f6110b;
    }

    public final boolean c() {
        return this.f6109a;
    }

    public b(boolean z11, boolean z12, long j11) {
        this.f6109a = z11;
        this.f6110b = z12;
        this.f6111c = j11;
    }

    public /* synthetic */ b(boolean z11, boolean z12, long j11, int i11, v vVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? 0L : j11);
    }
}
