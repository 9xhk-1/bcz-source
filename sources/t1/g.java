package t1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g implements s1.e {

    /* renamed from: a, reason: collision with root package name */
    public final s1.e f89198a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f89199b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f89200a;

        /* renamed from: b, reason: collision with root package name */
        public final int f89201b;

        /* renamed from: c, reason: collision with root package name */
        public final String f89202c;

        public a(int i11, int i12, String str) {
            this.f89200a = i11;
            this.f89201b = i12;
            this.f89202c = str;
        }
    }

    public g(s1.e eVar, a... aVarArr) {
        if (aVarArr.length == 0) {
            throw new IllegalArgumentException("At least one Resolution needs to be supplied.");
        }
        this.f89198a = eVar;
        this.f89199b = aVarArr;
    }

    public static a a(a... aVarArr) {
        int i11;
        int i12;
        int D = q1.g.f81379b.D();
        int T = q1.g.f81379b.T();
        int i13 = 0;
        a aVar = aVarArr[0];
        if (D < T) {
            int length = aVarArr.length;
            while (i13 < length) {
                a aVar2 = aVarArr[i13];
                int i14 = aVar2.f89200a;
                if (D >= i14 && i14 >= aVar.f89200a && T >= (i12 = aVar2.f89201b) && i12 >= aVar.f89201b) {
                    aVar = aVar2;
                }
                i13++;
            }
            return aVar;
        }
        int length2 = aVarArr.length;
        while (i13 < length2) {
            a aVar3 = aVarArr[i13];
            int i15 = aVar3.f89201b;
            if (D >= i15 && i15 >= aVar.f89201b && T >= (i11 = aVar3.f89200a) && i11 >= aVar.f89200a) {
                aVar = aVar3;
            }
            i13++;
        }
        return aVar;
    }

    public String b(v1.a aVar, String str) {
        v1.a B = aVar.B();
        String str2 = "";
        if (B != null && !B.z().equals("")) {
            str2 = B + "/";
        }
        return str2 + str + "/" + aVar.z();
    }

    @Override // s1.e
    public v1.a resolve(String str) {
        v1.a resolve = this.f89198a.resolve(b(new v1.a(str), a(this.f89199b).f89202c));
        return !resolve.l() ? this.f89198a.resolve(str) : resolve;
    }
}
