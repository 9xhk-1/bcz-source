package no;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import no.h0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
/* loaded from: classes7.dex */
public final class z extends h0 implements Serializable, x {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream s11) throws IOException, ClassNotFoundException {
        s11.defaultReadObject();
        this.f75299c = 0;
        this.f75297a = null;
        this.f75298b = s11.readLong();
    }

    private void writeObject(ObjectOutputStream s11) throws IOException {
        s11.defaultWriteObject();
        s11.writeLong(sum());
    }

    @Override // no.x
    public void add(long x11) {
        int length;
        h0.b bVar;
        h0.b[] bVarArr = this.f75297a;
        if (bVarArr == null) {
            long j11 = this.f75298b;
            if (b(j11, j11 + x11)) {
                return;
            }
        }
        int[] iArr = h0.f75291d.get();
        boolean z11 = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j12 = bVar.f75309h;
            z11 = bVar.a(j12, j12 + x11);
            if (z11) {
                return;
            }
        }
        g(x11, iArr, z11);
    }

    @Override // no.h0
    public final long d(long v11, long x11) {
        return v11 + x11;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return sum();
    }

    public void h() {
        add(-1L);
    }

    public void i() {
        f(0L);
    }

    @Override // no.x
    public void increment() {
        add(1L);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    public long j() {
        long j11 = this.f75298b;
        h0.b[] bVarArr = this.f75297a;
        this.f75298b = 0L;
        if (bVarArr != null) {
            for (h0.b bVar : bVarArr) {
                if (bVar != null) {
                    j11 += bVar.f75309h;
                    bVar.f75309h = 0L;
                }
            }
        }
        return j11;
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    @Override // no.x
    public long sum() {
        long j11 = this.f75298b;
        h0.b[] bVarArr = this.f75297a;
        if (bVarArr != null) {
            for (h0.b bVar : bVarArr) {
                if (bVar != null) {
                    j11 += bVar.f75309h;
                }
            }
        }
        return j11;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
