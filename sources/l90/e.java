package l90;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class e<T> {

    /* renamed from: a, reason: collision with root package name */
    public final d<T>[] f70775a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f70776b;

    /* renamed from: c, reason: collision with root package name */
    public int f70777c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f70778d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f70779e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f70780f = 0;

    public e(int i11) {
        d<T>[] dVarArr = new d[i11];
        this.f70775a = dVarArr;
        int[] iArr = new int[i11];
        this.f70776b = iArr;
        Arrays.fill(iArr, -1);
        dVarArr[0] = new d<>(b(), 0);
        iArr[0] = 0;
    }

    public synchronized d<T> a() {
        d<T>[] dVarArr;
        d<T> dVar;
        while (true) {
            int i11 = this.f70779e;
            dVarArr = this.f70775a;
            if (i11 != dVarArr.length) {
                break;
            }
            try {
                wait(50L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new d<>(b(), -1);
            }
        }
        int[] iArr = this.f70776b;
        int i12 = iArr[this.f70777c];
        if (i12 == -1) {
            i12 = this.f70780f + 1;
            this.f70780f = i12;
            iArr[i12] = i12;
            dVarArr[i12] = new d<>(b(), i12);
        }
        d<T>[] dVarArr2 = this.f70775a;
        dVar = dVarArr2[i12];
        int i13 = this.f70777c + 1;
        this.f70777c = i13;
        if (i13 == dVarArr2.length) {
            this.f70777c = 0;
        }
        this.f70779e++;
        return dVar;
    }

    public abstract T b();

    public synchronized void c(d<T> dVar) {
        try {
            int i11 = dVar.f70774b;
            if (i11 != -1) {
                int[] iArr = this.f70776b;
                int i12 = this.f70778d;
                int i13 = i12 + 1;
                this.f70778d = i13;
                iArr[i12] = i11;
                if (i13 == this.f70775a.length) {
                    this.f70778d = 0;
                }
                this.f70779e--;
            }
            notify();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
