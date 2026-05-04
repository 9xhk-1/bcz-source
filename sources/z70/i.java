package z70;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes9.dex */
public class i extends f implements d {

    /* renamed from: f, reason: collision with root package name */
    public final ReentrantLock f101101f;

    /* renamed from: g, reason: collision with root package name */
    public final Condition f101102g;

    /* renamed from: h, reason: collision with root package name */
    public volatile m70.g f101103h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f101104i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f101105j;

    @Deprecated
    public i(int i11, m70.g gVar, b bVar) {
        super(i11, bVar);
        this.f101104i = false;
        this.f101105j = false;
        e80.a.j(gVar, "I/O content control");
        this.f101103h = gVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f101101f = reentrantLock;
        this.f101102g = reentrantLock.newCondition();
    }

    public void A(byte[] bArr) throws IOException {
        if (bArr == null) {
            return;
        }
        write(bArr, 0, bArr.length);
    }

    @Override // z70.f
    public boolean a() {
        this.f101101f.lock();
        try {
            return super.a();
        } finally {
            this.f101101f.unlock();
        }
    }

    @Override // z70.f, k70.a
    public int available() {
        this.f101101f.lock();
        try {
            return super.available();
        } finally {
            this.f101101f.unlock();
        }
    }

    @Override // z70.f, k70.a
    public int d() {
        this.f101101f.lock();
        try {
            return super.d();
        } finally {
            this.f101101f.unlock();
        }
    }

    @Override // z70.d
    public void f() throws IOException {
        this.f101101f.lock();
        try {
            if (!this.f101105j) {
                this.f101105j = true;
                if (this.f101103h != null) {
                    this.f101103h.f();
                }
            }
        } finally {
            this.f101101f.unlock();
        }
    }

    @Override // z70.d
    @Deprecated
    public int k(m70.c cVar) throws IOException {
        return y(cVar, null);
    }

    @Override // z70.f, k70.a
    public int length() {
        this.f101101f.lock();
        try {
            return super.length();
        } finally {
            this.f101101f.unlock();
        }
    }

    @Override // z70.d
    public void reset() {
        if (this.f101104i) {
            return;
        }
        this.f101101f.lock();
        try {
            p();
            this.f101105j = false;
        } finally {
            this.f101101f.unlock();
        }
    }

    public void w() {
        z();
    }

    @Override // z70.d
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        if (bArr == null) {
            return;
        }
        this.f101101f.lock();
        try {
            e80.b.a((this.f101104i || this.f101105j) ? false : true, "Buffer already closed for writing");
            u();
            while (i12 > 0) {
                if (!this.f101094c.hasRemaining()) {
                    x();
                    u();
                }
                int min = Math.min(i12, this.f101094c.remaining());
                this.f101094c.put(bArr, i11, min);
                i12 -= min;
                i11 += min;
            }
            this.f101101f.unlock();
        } catch (Throwable th2) {
            this.f101101f.unlock();
            throw th2;
        }
    }

    public final void x() throws IOException {
        this.f101101f.lock();
        while (super.a()) {
            try {
                try {
                    if (this.f101104i) {
                        throw new InterruptedIOException("Output operation aborted");
                    }
                    if (this.f101103h != null) {
                        this.f101103h.f();
                    }
                    this.f101102g.await();
                } catch (InterruptedException unused) {
                    throw new IOException("Interrupted while flushing the content buffer");
                }
            } catch (Throwable th2) {
                this.f101101f.unlock();
                throw th2;
            }
        }
        this.f101101f.unlock();
    }

    public int y(m70.c cVar, m70.g gVar) throws IOException {
        int i11;
        if (this.f101104i) {
            return -1;
        }
        this.f101101f.lock();
        if (gVar != null) {
            try {
                this.f101103h = gVar;
            } catch (Throwable th2) {
                this.f101101f.unlock();
                throw th2;
            }
        }
        v();
        if (super.a()) {
            i11 = cVar.write(this.f101094c);
            if (cVar.e()) {
                this.f101105j = true;
            }
        } else {
            i11 = 0;
        }
        if (!super.a()) {
            if (this.f101105j && !cVar.e()) {
                cVar.complete();
            }
            if (!this.f101105j && this.f101103h != null) {
                this.f101103h.q();
            }
        }
        this.f101102g.signalAll();
        this.f101101f.unlock();
        return i11;
    }

    public void z() {
        if (this.f101104i) {
            return;
        }
        this.f101104i = true;
        this.f101101f.lock();
        try {
            this.f101102g.signalAll();
        } finally {
            this.f101101f.unlock();
        }
    }

    public i(int i11, b bVar) {
        super(i11, bVar);
        this.f101104i = false;
        this.f101105j = false;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f101101f = reentrantLock;
        this.f101102g = reentrantLock.newCondition();
    }

    @Override // z70.d
    public void write(int i11) throws IOException {
        this.f101101f.lock();
        try {
            e80.b.a((this.f101104i || this.f101105j) ? false : true, "Buffer already closed for writing");
            u();
            if (!this.f101094c.hasRemaining()) {
                x();
                u();
            }
            this.f101094c.put((byte) i11);
            this.f101101f.unlock();
        } catch (Throwable th2) {
            this.f101101f.unlock();
            throw th2;
        }
    }

    public i(int i11) {
        this(i11, g.f101095a);
    }

    @Override // z70.d
    public void flush() throws IOException {
    }
}
