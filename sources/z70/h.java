package z70;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes9.dex */
public class h extends f implements c {

    /* renamed from: f, reason: collision with root package name */
    public final ReentrantLock f101096f;

    /* renamed from: g, reason: collision with root package name */
    public final Condition f101097g;

    /* renamed from: h, reason: collision with root package name */
    public volatile m70.g f101098h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f101099i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f101100j;

    @Deprecated
    public h(int i11, m70.g gVar, b bVar) {
        super(i11, bVar);
        this.f101099i = false;
        this.f101100j = false;
        this.f101098h = gVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f101096f = reentrantLock;
        this.f101097g = reentrantLock.newCondition();
    }

    public int A(byte[] bArr) throws IOException {
        if (this.f101099i) {
            return -1;
        }
        if (bArr == null) {
            return 0;
        }
        return read(bArr, 0, bArr.length);
    }

    public void B() {
        if (this.f101099i) {
            return;
        }
        this.f101099i = true;
        this.f101096f.lock();
        try {
            this.f101097g.signalAll();
        } finally {
            this.f101096f.unlock();
        }
    }

    public void C() throws IOException {
        this.f101096f.lock();
        while (!super.a() && !this.f101100j) {
            try {
                try {
                    if (this.f101099i) {
                        throw new InterruptedIOException("Input operation aborted");
                    }
                    if (this.f101098h != null) {
                        this.f101098h.j();
                    }
                    this.f101097g.await();
                } catch (InterruptedException unused) {
                    throw new IOException("Interrupted while waiting for more data");
                }
            } catch (Throwable th2) {
                this.f101096f.unlock();
                throw th2;
            }
        }
        this.f101096f.unlock();
    }

    @Override // z70.f
    public boolean a() {
        this.f101096f.lock();
        try {
            return super.a();
        } finally {
            this.f101096f.unlock();
        }
    }

    @Override // z70.f, k70.a
    public int available() {
        this.f101096f.lock();
        try {
            return super.available();
        } finally {
            this.f101096f.unlock();
        }
    }

    @Override // z70.f, k70.a
    public int d() {
        this.f101096f.lock();
        try {
            return super.d();
        } finally {
            this.f101096f.unlock();
        }
    }

    @Override // z70.c
    @Deprecated
    public int h(m70.a aVar) throws IOException {
        return x(aVar, null);
    }

    @Override // z70.f, k70.a
    public int length() {
        this.f101096f.lock();
        try {
            return super.length();
        } finally {
            this.f101096f.unlock();
        }
    }

    @Override // z70.c
    public int read() throws IOException {
        if (this.f101099i) {
            return -1;
        }
        this.f101096f.lock();
        try {
            if (!a()) {
                C();
            }
            if (y()) {
                this.f101096f.unlock();
                return -1;
            }
            int i11 = this.f101094c.get() & 255;
            this.f101096f.unlock();
            return i11;
        } catch (Throwable th2) {
            this.f101096f.unlock();
            throw th2;
        }
    }

    @Override // z70.c
    public void reset() {
        if (this.f101099i) {
            return;
        }
        this.f101096f.lock();
        try {
            p();
            this.f101100j = false;
        } finally {
            this.f101096f.unlock();
        }
    }

    public void w() {
        if (this.f101099i) {
            return;
        }
        this.f101100j = true;
        this.f101096f.lock();
        try {
            this.f101097g.signalAll();
        } finally {
            this.f101096f.unlock();
        }
    }

    public int x(m70.a aVar, m70.g gVar) throws IOException {
        int read;
        if (this.f101099i) {
            return -1;
        }
        this.f101096f.lock();
        if (gVar != null) {
            try {
                this.f101098h = gVar;
            } catch (Throwable th2) {
                this.f101096f.unlock();
                throw th2;
            }
        }
        u();
        int i11 = 0;
        while (true) {
            read = aVar.read(this.f101094c);
            if (read <= 0) {
                break;
            }
            i11 += read;
        }
        if (read == -1 || aVar.e()) {
            this.f101100j = true;
        }
        if (!this.f101094c.hasRemaining() && this.f101098h != null) {
            this.f101098h.e();
        }
        this.f101097g.signalAll();
        if (i11 > 0) {
            this.f101096f.unlock();
            return i11;
        }
        int i12 = this.f101100j ? -1 : 0;
        this.f101096f.unlock();
        return i12;
    }

    public boolean y() {
        if (this.f101099i) {
            return true;
        }
        return !a() && this.f101100j;
    }

    public boolean z() {
        return this.f101099i;
    }

    public h(int i11, b bVar) {
        super(i11, bVar);
        this.f101099i = false;
        this.f101100j = false;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f101096f = reentrantLock;
        this.f101097g = reentrantLock.newCondition();
    }

    @Override // z70.c
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (this.f101099i) {
            return -1;
        }
        if (bArr == null) {
            return 0;
        }
        this.f101096f.lock();
        try {
            if (!a()) {
                C();
            }
            if (y()) {
                this.f101096f.unlock();
                return -1;
            }
            v();
            if (i12 > this.f101094c.remaining()) {
                i12 = this.f101094c.remaining();
            }
            this.f101094c.get(bArr, i11, i12);
            this.f101096f.unlock();
            return i12;
        } catch (Throwable th2) {
            this.f101096f.unlock();
            throw th2;
        }
    }

    public h(int i11) {
        this(i11, g.f101095a);
    }
}
