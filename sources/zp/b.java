package zp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b extends f {
    public b(kp.a aVar) {
        super(aVar);
    }

    @Override // zp.i
    public void h(StringBuilder sb2, int i11) {
        if (i11 < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    @Override // zp.i
    public int i(int i11) {
        return i11 < 10000 ? i11 : i11 - 10000;
    }
}
