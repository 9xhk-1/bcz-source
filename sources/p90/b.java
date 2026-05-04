package p90;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f80299a;

    /* renamed from: b, reason: collision with root package name */
    public Class<?> f80300b = String.class;

    /* renamed from: c, reason: collision with root package name */
    public Object f80301c = null;

    /* renamed from: d, reason: collision with root package name */
    public r90.g[] f80302d = null;

    public b(int i11) {
        this.f80299a = i11;
    }

    public Object a(Object obj) {
        if (this.f80302d == null) {
            return obj;
        }
        int i11 = 0;
        while (true) {
            r90.g[] gVarArr = this.f80302d;
            if (i11 >= gVarArr.length) {
                return obj;
            }
            obj = gVarArr[i11].b(obj);
            i11++;
        }
    }

    public r90.g[] b() {
        return this.f80302d;
    }

    public void c(r90.g[] gVarArr) {
        this.f80302d = gVarArr;
    }
}
