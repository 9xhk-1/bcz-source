package rm;

import java.util.List;
import rm.h.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h<T extends a> {

    /* renamed from: g, reason: collision with root package name */
    public static int f84267g;

    /* renamed from: a, reason: collision with root package name */
    public int f84268a;

    /* renamed from: b, reason: collision with root package name */
    public int f84269b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f84270c;

    /* renamed from: d, reason: collision with root package name */
    public int f84271d;

    /* renamed from: e, reason: collision with root package name */
    public T f84272e;

    /* renamed from: f, reason: collision with root package name */
    public float f84273f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a {

        /* renamed from: b, reason: collision with root package name */
        public static int f84274b = -1;

        /* renamed from: a, reason: collision with root package name */
        public int f84275a = f84274b;

        public abstract a a();
    }

    public h(int i11, T t11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        this.f84269b = i11;
        this.f84270c = new Object[i11];
        this.f84271d = 0;
        this.f84272e = t11;
        this.f84273f = 1.0f;
        i();
    }

    public static synchronized h a(int i11, a aVar) {
        h hVar;
        synchronized (h.class) {
            hVar = new h(i11, aVar);
            int i12 = f84267g;
            hVar.f84268a = i12;
            f84267g = i12 + 1;
        }
        return hVar;
    }

    public synchronized T b() {
        T t11;
        try {
            if (this.f84271d == -1 && this.f84273f > 0.0f) {
                i();
            }
            Object[] objArr = this.f84270c;
            int i11 = this.f84271d;
            t11 = (T) objArr[i11];
            t11.f84275a = a.f84274b;
            this.f84271d = i11 - 1;
        } catch (Throwable th2) {
            throw th2;
        }
        return t11;
    }

    public int c() {
        return this.f84270c.length;
    }

    public int d() {
        return this.f84271d + 1;
    }

    public int e() {
        return this.f84268a;
    }

    public float f() {
        return this.f84273f;
    }

    public synchronized void g(List<T> list) {
        while (list.size() + this.f84271d + 1 > this.f84269b) {
            try {
                k();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            T t11 = list.get(i11);
            int i12 = t11.f84275a;
            if (i12 != a.f84274b) {
                if (i12 == this.f84268a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t11.f84275a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            t11.f84275a = this.f84268a;
            this.f84270c[this.f84271d + 1 + i11] = t11;
        }
        this.f84271d += size;
    }

    public synchronized void h(T t11) {
        try {
            int i11 = t11.f84275a;
            if (i11 != a.f84274b) {
                if (i11 == this.f84268a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t11.f84275a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i12 = this.f84271d + 1;
            this.f84271d = i12;
            if (i12 >= this.f84270c.length) {
                k();
            }
            t11.f84275a = this.f84268a;
            this.f84270c[this.f84271d] = t11;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void i() {
        j(this.f84273f);
    }

    public final void j(float f11) {
        int i11 = this.f84269b;
        int i12 = (int) (i11 * f11);
        if (i12 < 1) {
            i11 = 1;
        } else if (i12 <= i11) {
            i11 = i12;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            this.f84270c[i13] = this.f84272e.a();
        }
        this.f84271d = i11 - 1;
    }

    public final void k() {
        int i11 = this.f84269b;
        int i12 = i11 * 2;
        this.f84269b = i12;
        Object[] objArr = new Object[i12];
        for (int i13 = 0; i13 < i11; i13++) {
            objArr[i13] = this.f84270c[i13];
        }
        this.f84270c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            goto L6
        Le:
            r2.f84273f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rm.h.l(float):void");
    }
}
