package ip;

import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f62660e = new f(g.f62665b, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f62661a;

    /* renamed from: b, reason: collision with root package name */
    public final g f62662b;

    /* renamed from: c, reason: collision with root package name */
    public final int f62663c;

    /* renamed from: d, reason: collision with root package name */
    public final int f62664d;

    public f(g gVar, int i11, int i12, int i13) {
        this.f62662b = gVar;
        this.f62661a = i11;
        this.f62663c = i12;
        this.f62664d = i13;
    }

    public f a(int i11) {
        g gVar = this.f62662b;
        int i12 = this.f62661a;
        int i13 = this.f62664d;
        if (i12 == 4 || i12 == 2) {
            int i14 = d.f62653h[i12][0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVar = gVar.a(i15, i16);
            i13 += i16;
            i12 = 0;
        }
        int i17 = this.f62663c;
        f fVar = new f(gVar, i12, i17 + 1, i13 + ((i17 == 0 || i17 == 31) ? 18 : i17 == 62 ? 9 : 8));
        return fVar.f62663c == 2078 ? fVar.b(i11 + 1) : fVar;
    }

    public f b(int i11) {
        int i12 = this.f62663c;
        return i12 == 0 ? this : new f(this.f62662b.b(i11 - i12, i12), this.f62661a, 0, this.f62664d);
    }

    public int c() {
        return this.f62663c;
    }

    public int d() {
        return this.f62664d;
    }

    public int e() {
        return this.f62661a;
    }

    public g f() {
        return this.f62662b;
    }

    public boolean g(f fVar) {
        int i11;
        int i12 = this.f62664d + (d.f62653h[this.f62661a][fVar.f62661a] >> 16);
        int i13 = fVar.f62663c;
        if (i13 > 0 && ((i11 = this.f62663c) == 0 || i11 > i13)) {
            i12 += 10;
        }
        return i12 <= fVar.f62664d;
    }

    public f h(int i11, int i12) {
        int i13 = this.f62664d;
        g gVar = this.f62662b;
        int i14 = this.f62661a;
        if (i11 != i14) {
            int i15 = d.f62653h[i14][i11];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            gVar = gVar.a(i16, i17);
            i13 += i17;
        }
        int i18 = i11 == 2 ? 4 : 5;
        return new f(gVar.a(i12, i18), i11, 0, i13 + i18);
    }

    public f i(int i11, int i12) {
        g gVar = this.f62662b;
        int i13 = this.f62661a;
        int i14 = i13 == 2 ? 4 : 5;
        return new f(gVar.a(d.f62655j[i13][i11], i14).a(i12, 5), this.f62661a, 0, this.f62664d + i14 + 5);
    }

    public kp.a j(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (g gVar = b(bArr.length).f62662b; gVar != null; gVar = gVar.d()) {
            linkedList.addFirst(gVar);
        }
        kp.a aVar = new kp.a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f62647b[this.f62661a], Integer.valueOf(this.f62664d), Integer.valueOf(this.f62663c));
    }
}
