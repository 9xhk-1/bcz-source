package jo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import jo.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class n extends t implements Serializable, l {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream s11) throws IOException, ClassNotFoundException {
        s11.defaultReadObject();
        this.f64480c = 0;
        this.f64478a = null;
        this.f64479b = s11.readLong();
    }

    private void writeObject(ObjectOutputStream s11) throws IOException {
        s11.defaultWriteObject();
        s11.writeLong(sum());
    }

    @Override // jo.l
    public void add(long x11) {
        int length;
        t.b bVar;
        t.b[] bVarArr = this.f64478a;
        if (bVarArr == null) {
            long j11 = this.f64479b;
            if (b(j11, j11 + x11)) {
                return;
            }
        }
        int[] iArr = t.f64472d.get();
        boolean z11 = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j12 = bVar.f64490h;
            z11 = bVar.a(j12, j12 + x11);
            if (z11) {
                return;
            }
        }
        g(x11, iArr, z11);
    }

    @Override // jo.t
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

    @Override // jo.l
    public void increment() {
        add(1L);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    public long j() {
        long j11 = this.f64479b;
        t.b[] bVarArr = this.f64478a;
        this.f64479b = 0L;
        if (bVarArr != null) {
            for (t.b bVar : bVarArr) {
                if (bVar != null) {
                    j11 += bVar.f64490h;
                    bVar.f64490h = 0L;
                }
            }
        }
        return j11;
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    @Override // jo.l
    public long sum() {
        long j11 = this.f64479b;
        t.b[] bVarArr = this.f64478a;
        if (bVarArr != null) {
            for (t.b bVar : bVarArr) {
                if (bVar != null) {
                    j11 += bVar.f64490h;
                }
            }
        }
        return j11;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
