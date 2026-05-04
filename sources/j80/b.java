package j80;

import i80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final e[] f63887d;

    public b(Class cls, boolean z11, e[] eVarArr) {
        super(cls, null, z11);
        this.f63887d = eVarArr;
    }

    @Override // j80.c
    public synchronized n[] a() {
        try {
            try {
                int length = this.f63887d.length;
                n[] nVarArr = new n[length];
                for (int i11 = 0; i11 < length; i11++) {
                    e eVar = this.f63887d[i11];
                    nVarArr[i11] = g(eVar.f63888a, eVar.f63890c, eVar.f63889b, eVar.f63891d, eVar.f63892e);
                }
                return nVarArr;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
