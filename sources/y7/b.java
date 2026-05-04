package y7;

import kotlin.random.Random;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final long f99463a;

    public b(long j11) {
        this.f99463a = j11;
    }

    @Override // y7.a
    public long a() {
        return Random.Default.nextLong(this.f99463a);
    }
}
