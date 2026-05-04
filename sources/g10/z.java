package g10;

import java.util.Iterator;
import java.util.NoSuchElementException;
import yz.w1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
/* loaded from: classes8.dex */
public final class z implements Iterator<w1>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f52556a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f52557b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52558c;

    /* renamed from: d, reason: collision with root package name */
    public long f52559d;

    public /* synthetic */ z(long j11, long j12, long j13, kotlin.jvm.internal.v vVar) {
        this(j11, j12, j13);
    }

    public long a() {
        long j11 = this.f52559d;
        if (j11 != this.f52556a) {
            this.f52559d = w1.i(this.f52558c + j11);
            return j11;
        }
        if (!this.f52557b) {
            throw new NoSuchElementException();
        }
        this.f52557b = false;
        return j11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52557b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ w1 next() {
        return w1.b(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        if (r0 >= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(long r4, long r6, long r8) {
        /*
            r3 = this;
            r3.<init>()
            r3.f52556a = r6
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L15
            int r0 = androidx.collection.a.a(r4, r6)
            if (r0 > 0) goto L1c
        L13:
            r1 = r2
            goto L1c
        L15:
            int r0 = androidx.collection.a.a(r4, r6)
            if (r0 < 0) goto L1c
            goto L13
        L1c:
            r3.f52557b = r1
            long r8 = yz.w1.i(r8)
            r3.f52558c = r8
            boolean r8 = r3.f52557b
            if (r8 == 0) goto L29
            goto L2a
        L29:
            r4 = r6
        L2a:
            r3.f52559d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g10.z.<init>(long, long, long):void");
    }
}
