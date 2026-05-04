package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class ht implements is<ht, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f549a;

    /* renamed from: a, reason: collision with other field name */
    public hu f550a;

    /* renamed from: a, reason: collision with other field name */
    public hw f551a;

    /* renamed from: a, reason: collision with other field name */
    public String f552a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f553a = new BitSet(4);

    /* renamed from: a, reason: collision with other field name */
    public boolean f554a = false;

    /* renamed from: b, reason: collision with other field name */
    public long f555b;

    /* renamed from: b, reason: collision with other field name */
    public String f556b;

    /* renamed from: c, reason: collision with other field name */
    public long f557c;

    /* renamed from: c, reason: collision with other field name */
    public String f558c;

    /* renamed from: d, reason: collision with other field name */
    public String f559d;

    /* renamed from: e, reason: collision with other field name */
    public String f560e;

    /* renamed from: f, reason: collision with other field name */
    public String f561f;

    /* renamed from: g, reason: collision with other field name */
    public String f562g;

    /* renamed from: h, reason: collision with other field name */
    public String f563h;

    /* renamed from: i, reason: collision with other field name */
    public String f564i;

    /* renamed from: j, reason: collision with other field name */
    public String f565j;

    /* renamed from: k, reason: collision with other field name */
    public String f566k;

    /* renamed from: l, reason: collision with other field name */
    public String f567l;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f548a = new ji("PushMessage");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45903a = new ja("", (byte) 12, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45904b = new ja("", (byte) 11, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f45905c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f45906d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f45907e = new ja("", (byte) 10, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f45908f = new ja("", (byte) 10, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f45909g = new ja("", (byte) 11, 7);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f45910h = new ja("", (byte) 11, 8);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f45911i = new ja("", (byte) 11, 9);

    /* renamed from: j, reason: collision with root package name */
    private static final ja f45912j = new ja("", (byte) 11, 10);

    /* renamed from: k, reason: collision with root package name */
    private static final ja f45913k = new ja("", (byte) 11, 11);

    /* renamed from: l, reason: collision with root package name */
    private static final ja f45914l = new ja("", (byte) 12, 12);

    /* renamed from: m, reason: collision with root package name */
    private static final ja f45915m = new ja("", (byte) 11, 13);

    /* renamed from: n, reason: collision with root package name */
    private static final ja f45916n = new ja("", (byte) 2, 14);

    /* renamed from: o, reason: collision with root package name */
    private static final ja f45917o = new ja("", (byte) 11, 15);

    /* renamed from: p, reason: collision with root package name */
    private static final ja f45918p = new ja("", (byte) 10, 16);

    /* renamed from: q, reason: collision with root package name */
    private static final ja f45919q = new ja("", (byte) 11, 20);

    /* renamed from: r, reason: collision with root package name */
    private static final ja f45920r = new ja("", (byte) 11, 21);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ht htVar) {
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        int a19;
        int a21;
        int a22;
        int a23;
        int a24;
        int a25;
        int a26;
        int a27;
        int a28;
        int a29;
        if (!getClass().equals(htVar.getClass())) {
            return getClass().getName().compareTo(htVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6039a()).compareTo(Boolean.valueOf(htVar.m6039a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6039a() && (a29 = it.a(this.f551a, htVar.f551a)) != 0) {
            return a29;
        }
        int compareTo2 = Boolean.valueOf(m6041b()).compareTo(Boolean.valueOf(htVar.m6041b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m6041b() && (a28 = it.a(this.f552a, htVar.f552a)) != 0) {
            return a28;
        }
        int compareTo3 = Boolean.valueOf(m6042c()).compareTo(Boolean.valueOf(htVar.m6042c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m6042c() && (a27 = it.a(this.f556b, htVar.f556b)) != 0) {
            return a27;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(htVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a26 = it.a(this.f558c, htVar.f558c)) != 0) {
            return a26;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(htVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a25 = it.a(this.f549a, htVar.f549a)) != 0) {
            return a25;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(htVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a24 = it.a(this.f555b, htVar.f555b)) != 0) {
            return a24;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(htVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a23 = it.a(this.f559d, htVar.f559d)) != 0) {
            return a23;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(htVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a22 = it.a(this.f560e, htVar.f560e)) != 0) {
            return a22;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(htVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a21 = it.a(this.f561f, htVar.f561f)) != 0) {
            return a21;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(htVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a19 = it.a(this.f562g, htVar.f562g)) != 0) {
            return a19;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(htVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a18 = it.a(this.f563h, htVar.f563h)) != 0) {
            return a18;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(htVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a17 = it.a(this.f550a, htVar.f550a)) != 0) {
            return a17;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(htVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a16 = it.a(this.f564i, htVar.f564i)) != 0) {
            return a16;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(htVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a15 = it.a(this.f554a, htVar.f554a)) != 0) {
            return a15;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(htVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a14 = it.a(this.f565j, htVar.f565j)) != 0) {
            return a14;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(htVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a13 = it.a(this.f557c, htVar.f557c)) != 0) {
            return a13;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(htVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a12 = it.a(this.f566k, htVar.f566k)) != 0) {
            return a12;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(htVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!r() || (a11 = it.a(this.f567l, htVar.f567l)) == 0) {
            return 0;
        }
        return a11;
    }

    public String b() {
        return this.f556b;
    }

    public String c() {
        return this.f558c;
    }

    public void d(boolean z11) {
        this.f553a.set(3, z11);
    }

    public boolean e() {
        return this.f553a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ht)) {
            return m6040a((ht) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f553a.get(1);
    }

    public boolean g() {
        return this.f559d != null;
    }

    public boolean h() {
        return this.f560e != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f561f != null;
    }

    public boolean j() {
        return this.f562g != null;
    }

    public boolean k() {
        return this.f563h != null;
    }

    public boolean l() {
        return this.f550a != null;
    }

    public boolean m() {
        return this.f564i != null;
    }

    public boolean n() {
        return this.f553a.get(2);
    }

    public boolean o() {
        return this.f565j != null;
    }

    public boolean p() {
        return this.f553a.get(3);
    }

    public boolean q() {
        return this.f566k != null;
    }

    public boolean r() {
        return this.f567l != null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PushMessage(");
        if (m6039a()) {
            sb2.append("to:");
            hw hwVar = this.f551a;
            if (hwVar == null) {
                sb2.append("null");
            } else {
                sb2.append(hwVar);
            }
            sb2.append(j2.O);
        }
        sb2.append("id:");
        String str = this.f552a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("appId:");
        String str2 = this.f556b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("payload:");
        String str3 = this.f558c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (e()) {
            sb2.append(j2.O);
            sb2.append("createAt:");
            sb2.append(this.f549a);
        }
        if (f()) {
            sb2.append(j2.O);
            sb2.append("ttl:");
            sb2.append(this.f555b);
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("collapseKey:");
            String str4 = this.f559d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str5 = this.f560e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("regId:");
            String str6 = this.f561f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (j()) {
            sb2.append(j2.O);
            sb2.append("category:");
            String str7 = this.f562g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (k()) {
            sb2.append(j2.O);
            sb2.append("topic:");
            String str8 = this.f563h;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (l()) {
            sb2.append(j2.O);
            sb2.append("metaInfo:");
            hu huVar = this.f550a;
            if (huVar == null) {
                sb2.append("null");
            } else {
                sb2.append(huVar);
            }
        }
        if (m()) {
            sb2.append(j2.O);
            sb2.append("aliasName:");
            String str9 = this.f564i;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        if (n()) {
            sb2.append(j2.O);
            sb2.append("isOnline:");
            sb2.append(this.f554a);
        }
        if (o()) {
            sb2.append(j2.O);
            sb2.append("userAccount:");
            String str10 = this.f565j;
            if (str10 == null) {
                sb2.append("null");
            } else {
                sb2.append(str10);
            }
        }
        if (p()) {
            sb2.append(j2.O);
            sb2.append("miid:");
            sb2.append(this.f557c);
        }
        if (q()) {
            sb2.append(j2.O);
            sb2.append("imeiMd5:");
            String str11 = this.f566k;
            if (str11 == null) {
                sb2.append("null");
            } else {
                sb2.append(str11);
            }
        }
        if (r()) {
            sb2.append(j2.O);
            sb2.append("deviceId:");
            String str12 = this.f567l;
            if (str12 == null) {
                sb2.append("null");
            } else {
                sb2.append(str12);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public long a() {
        return this.f549a;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6038a();
        jdVar.a(f548a);
        if (this.f551a != null && m6039a()) {
            jdVar.a(f45903a);
            this.f551a.b(jdVar);
            jdVar.b();
        }
        if (this.f552a != null) {
            jdVar.a(f45904b);
            jdVar.a(this.f552a);
            jdVar.b();
        }
        if (this.f556b != null) {
            jdVar.a(f45905c);
            jdVar.a(this.f556b);
            jdVar.b();
        }
        if (this.f558c != null) {
            jdVar.a(f45906d);
            jdVar.a(this.f558c);
            jdVar.b();
        }
        if (e()) {
            jdVar.a(f45907e);
            jdVar.a(this.f549a);
            jdVar.b();
        }
        if (f()) {
            jdVar.a(f45908f);
            jdVar.a(this.f555b);
            jdVar.b();
        }
        if (this.f559d != null && g()) {
            jdVar.a(f45909g);
            jdVar.a(this.f559d);
            jdVar.b();
        }
        if (this.f560e != null && h()) {
            jdVar.a(f45910h);
            jdVar.a(this.f560e);
            jdVar.b();
        }
        if (this.f561f != null && i()) {
            jdVar.a(f45911i);
            jdVar.a(this.f561f);
            jdVar.b();
        }
        if (this.f562g != null && j()) {
            jdVar.a(f45912j);
            jdVar.a(this.f562g);
            jdVar.b();
        }
        if (this.f563h != null && k()) {
            jdVar.a(f45913k);
            jdVar.a(this.f563h);
            jdVar.b();
        }
        if (this.f550a != null && l()) {
            jdVar.a(f45914l);
            this.f550a.b(jdVar);
            jdVar.b();
        }
        if (this.f564i != null && m()) {
            jdVar.a(f45915m);
            jdVar.a(this.f564i);
            jdVar.b();
        }
        if (n()) {
            jdVar.a(f45916n);
            jdVar.a(this.f554a);
            jdVar.b();
        }
        if (this.f565j != null && o()) {
            jdVar.a(f45917o);
            jdVar.a(this.f565j);
            jdVar.b();
        }
        if (p()) {
            jdVar.a(f45918p);
            jdVar.a(this.f557c);
            jdVar.b();
        }
        if (this.f566k != null && q()) {
            jdVar.a(f45919q);
            jdVar.a(this.f566k);
            jdVar.b();
        }
        if (this.f567l != null && r()) {
            jdVar.a(f45920r);
            jdVar.a(this.f567l);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public void c(boolean z11) {
        this.f553a.set(2, z11);
    }

    public boolean d() {
        return this.f558c != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m6037a() {
        return this.f552a;
    }

    public void b(boolean z11) {
        this.f553a.set(1, z11);
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m6042c() {
        return this.f556b != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6038a() {
        if (this.f552a == null) {
            throw new je("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f556b == null) {
            throw new je("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f558c != null) {
            return;
        }
        throw new je("Required field 'payload' was not present! Struct: " + toString());
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6041b() {
        return this.f552a != null;
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                m6038a();
                return;
            }
            short s11 = mo6157a.f843a;
            if (s11 == 20) {
                if (b11 == 11) {
                    this.f566k = jdVar.mo6162a();
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else if (s11 != 21) {
                switch (s11) {
                    case 1:
                        if (b11 == 12) {
                            hw hwVar = new hw();
                            this.f551a = hwVar;
                            hwVar.a(jdVar);
                            continue;
                        }
                        break;
                    case 2:
                        if (b11 == 11) {
                            this.f552a = jdVar.mo6162a();
                            continue;
                        }
                        break;
                    case 3:
                        if (b11 == 11) {
                            this.f556b = jdVar.mo6162a();
                            continue;
                        }
                        break;
                    case 4:
                        if (b11 == 11) {
                            this.f558c = jdVar.mo6162a();
                            continue;
                        }
                        break;
                    case 5:
                        if (b11 == 10) {
                            this.f549a = jdVar.mo6156a();
                            a(true);
                            continue;
                        }
                        break;
                    case 6:
                        if (b11 == 10) {
                            this.f555b = jdVar.mo6156a();
                            b(true);
                            continue;
                        }
                        break;
                    case 7:
                        if (b11 == 11) {
                            this.f559d = jdVar.mo6162a();
                            continue;
                        }
                        break;
                    case 8:
                        if (b11 == 11) {
                            this.f560e = jdVar.mo6162a();
                            continue;
                        }
                        break;
                    case 9:
                        if (b11 == 11) {
                            this.f561f = jdVar.mo6162a();
                            continue;
                        }
                        break;
                    case 10:
                        if (b11 == 11) {
                            this.f562g = jdVar.mo6162a();
                            continue;
                        }
                        break;
                    case 11:
                        if (b11 == 11) {
                            this.f563h = jdVar.mo6162a();
                            continue;
                        }
                        break;
                    case 12:
                        if (b11 == 12) {
                            hu huVar = new hu();
                            this.f550a = huVar;
                            huVar.a(jdVar);
                            continue;
                        }
                        break;
                    case 13:
                        if (b11 == 11) {
                            this.f564i = jdVar.mo6162a();
                            continue;
                        }
                        break;
                    case 14:
                        if (b11 == 2) {
                            this.f554a = jdVar.mo6167a();
                            c(true);
                            break;
                        }
                        break;
                    case 15:
                        if (b11 == 11) {
                            this.f565j = jdVar.mo6162a();
                            continue;
                        }
                        break;
                    case 16:
                        if (b11 == 10) {
                            this.f557c = jdVar.mo6156a();
                            d(true);
                            continue;
                        }
                        break;
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else {
                if (b11 == 11) {
                    this.f567l = jdVar.mo6162a();
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            }
        }
    }

    public void a(boolean z11) {
        this.f553a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6039a() {
        return this.f551a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6040a(ht htVar) {
        if (htVar == null) {
            return false;
        }
        boolean m6039a = m6039a();
        boolean m6039a2 = htVar.m6039a();
        if ((m6039a || m6039a2) && !(m6039a && m6039a2 && this.f551a.m6057a(htVar.f551a))) {
            return false;
        }
        boolean m6041b = m6041b();
        boolean m6041b2 = htVar.m6041b();
        if ((m6041b || m6041b2) && !(m6041b && m6041b2 && this.f552a.equals(htVar.f552a))) {
            return false;
        }
        boolean m6042c = m6042c();
        boolean m6042c2 = htVar.m6042c();
        if ((m6042c || m6042c2) && !(m6042c && m6042c2 && this.f556b.equals(htVar.f556b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = htVar.d();
        if ((d11 || d12) && !(d11 && d12 && this.f558c.equals(htVar.f558c))) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = htVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f549a == htVar.f549a)) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = htVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f555b == htVar.f555b)) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = htVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f559d.equals(htVar.f559d))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = htVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f560e.equals(htVar.f560e))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = htVar.i();
        if ((i11 || i12) && !(i11 && i12 && this.f561f.equals(htVar.f561f))) {
            return false;
        }
        boolean j11 = j();
        boolean j12 = htVar.j();
        if ((j11 || j12) && !(j11 && j12 && this.f562g.equals(htVar.f562g))) {
            return false;
        }
        boolean k11 = k();
        boolean k12 = htVar.k();
        if ((k11 || k12) && !(k11 && k12 && this.f563h.equals(htVar.f563h))) {
            return false;
        }
        boolean l11 = l();
        boolean l12 = htVar.l();
        if ((l11 || l12) && !(l11 && l12 && this.f550a.m6049a(htVar.f550a))) {
            return false;
        }
        boolean m11 = m();
        boolean m12 = htVar.m();
        if ((m11 || m12) && !(m11 && m12 && this.f564i.equals(htVar.f564i))) {
            return false;
        }
        boolean n11 = n();
        boolean n12 = htVar.n();
        if ((n11 || n12) && !(n11 && n12 && this.f554a == htVar.f554a)) {
            return false;
        }
        boolean o11 = o();
        boolean o12 = htVar.o();
        if ((o11 || o12) && !(o11 && o12 && this.f565j.equals(htVar.f565j))) {
            return false;
        }
        boolean p11 = p();
        boolean p12 = htVar.p();
        if ((p11 || p12) && !(p11 && p12 && this.f557c == htVar.f557c)) {
            return false;
        }
        boolean q11 = q();
        boolean q12 = htVar.q();
        if ((q11 || q12) && !(q11 && q12 && this.f566k.equals(htVar.f566k))) {
            return false;
        }
        boolean r11 = r();
        boolean r12 = htVar.r();
        if (r11 || r12) {
            return r11 && r12 && this.f567l.equals(htVar.f567l);
        }
        return true;
    }
}
