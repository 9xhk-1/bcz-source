package g10;

import a00.e1;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n extends e1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f52532a;

    /* renamed from: b, reason: collision with root package name */
    public final long f52533b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f52534c;

    /* renamed from: d, reason: collision with root package name */
    public long f52535d;

    public n(long j11, long j12, long j13) {
        this.f52532a = j13;
        this.f52533b = j12;
        boolean z11 = false;
        if (j13 <= 0 ? j11 >= j12 : j11 <= j12) {
            z11 = true;
        }
        this.f52534c = z11;
        this.f52535d = z11 ? j11 : j12;
    }

    public final long a() {
        return this.f52532a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52534c;
    }

    @Override // a00.e1
    public long nextLong() {
        long j11 = this.f52535d;
        if (j11 != this.f52533b) {
            this.f52535d = this.f52532a + j11;
            return j11;
        }
        if (!this.f52534c) {
            throw new NoSuchElementException();
        }
        this.f52534c = false;
        return j11;
    }
}
