package hm;

import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h extends l {

    /* renamed from: a, reason: collision with root package name */
    public String[] f59496a;

    /* renamed from: b, reason: collision with root package name */
    public int f59497b;

    public h() {
        this.f59496a = new String[0];
        this.f59497b = 0;
    }

    @Override // hm.l
    public String h(float f11) {
        int round = Math.round(f11);
        return (round < 0 || round >= this.f59497b || round != ((int) f11)) ? "" : this.f59496a[round];
    }

    public String[] l() {
        return this.f59496a;
    }

    public void m(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        this.f59496a = strArr;
        this.f59497b = strArr.length;
    }

    public h(String[] strArr) {
        this.f59496a = new String[0];
        this.f59497b = 0;
        if (strArr != null) {
            m(strArr);
        }
    }

    public h(Collection<String> collection) {
        this.f59496a = new String[0];
        this.f59497b = 0;
        if (collection != null) {
            m((String[]) collection.toArray(new String[collection.size()]));
        }
    }
}
