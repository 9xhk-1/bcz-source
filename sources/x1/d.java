package x1;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends b {

    /* renamed from: e, reason: collision with root package name */
    public static int f97008e;

    /* renamed from: d, reason: collision with root package name */
    public String f97009d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d() {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mtl"
            r0.append(r1)
            int r1 = x1.d.f97008e
            int r1 = r1 + 1
            x1.d.f97008e = r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.d.<init>():void");
    }

    public d B() {
        return new d(this);
    }

    @Override // x1.b, java.util.Comparator
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (obj != this) {
            return ((d) obj).f97009d.equals(this.f97009d) && super.equals(obj);
        }
        return true;
    }

    @Override // x1.b
    public int hashCode() {
        return super.hashCode() + (this.f97009d.hashCode() * 3);
    }

    public d(String str) {
        this.f97009d = str;
    }

    public d(a... aVarArr) {
        this();
        z(aVarArr);
    }

    public d(String str, a... aVarArr) {
        this(str);
        z(aVarArr);
    }

    public d(com.badlogic.gdx.utils.a<a> aVar) {
        this();
        u(aVar);
    }

    public d(String str, com.badlogic.gdx.utils.a<a> aVar) {
        this(str);
        u(aVar);
    }

    public d(d dVar) {
        this(dVar.f97009d, dVar);
    }

    public d(String str, d dVar) {
        this(str);
        Iterator<a> it = dVar.iterator();
        while (it.hasNext()) {
            v(it.next().a());
        }
    }
}
