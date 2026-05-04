package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class ii implements is<ii, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f723a;

    /* renamed from: a, reason: collision with other field name */
    public long f724a;

    /* renamed from: a, reason: collision with other field name */
    public hw f725a;

    /* renamed from: a, reason: collision with other field name */
    public String f726a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f728a;

    /* renamed from: b, reason: collision with other field name */
    public int f730b;

    /* renamed from: b, reason: collision with other field name */
    public long f731b;

    /* renamed from: b, reason: collision with other field name */
    public String f732b;

    /* renamed from: c, reason: collision with other field name */
    public long f733c;

    /* renamed from: c, reason: collision with other field name */
    public String f734c;

    /* renamed from: d, reason: collision with other field name */
    public String f735d;

    /* renamed from: e, reason: collision with other field name */
    public String f736e;

    /* renamed from: f, reason: collision with other field name */
    public String f737f;

    /* renamed from: g, reason: collision with other field name */
    public String f738g;

    /* renamed from: h, reason: collision with other field name */
    public String f739h;

    /* renamed from: i, reason: collision with other field name */
    public String f740i;

    /* renamed from: j, reason: collision with other field name */
    public String f741j;

    /* renamed from: k, reason: collision with other field name */
    public String f742k;

    /* renamed from: l, reason: collision with other field name */
    public String f743l;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f722a = new ji("XmPushActionRegistrationResult");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46053a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f46054b = new ja("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f46055c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f46056d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f46057e = new ja("", (byte) 10, 6);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f46058f = new ja("", (byte) 11, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f46059g = new ja("", (byte) 11, 8);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f46060h = new ja("", (byte) 11, 9);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f46061i = new ja("", (byte) 11, 10);

    /* renamed from: j, reason: collision with root package name */
    private static final ja f46062j = new ja("", (byte) 10, 11);

    /* renamed from: k, reason: collision with root package name */
    private static final ja f46063k = new ja("", (byte) 11, 12);

    /* renamed from: l, reason: collision with root package name */
    private static final ja f46064l = new ja("", (byte) 11, 13);

    /* renamed from: m, reason: collision with root package name */
    private static final ja f46065m = new ja("", (byte) 10, 14);

    /* renamed from: n, reason: collision with root package name */
    private static final ja f46066n = new ja("", (byte) 11, 15);

    /* renamed from: o, reason: collision with root package name */
    private static final ja f46067o = new ja("", (byte) 8, 16);

    /* renamed from: p, reason: collision with root package name */
    private static final ja f46068p = new ja("", (byte) 11, 17);

    /* renamed from: q, reason: collision with root package name */
    private static final ja f46069q = new ja("", (byte) 8, 18);

    /* renamed from: r, reason: collision with root package name */
    private static final ja f46070r = new ja("", (byte) 11, 19);

    /* renamed from: s, reason: collision with root package name */
    private static final ja f46071s = new ja("", (byte) 2, 20);

    /* renamed from: t, reason: collision with root package name */
    private static final ja f46072t = new ja("", (byte) 15, 21);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f727a = new BitSet(6);

    /* renamed from: a, reason: collision with other field name */
    public boolean f729a = false;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ii iiVar) {
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
        int a31;
        int a32;
        if (!getClass().equals(iiVar.getClass())) {
            return getClass().getName().compareTo(iiVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6117a()).compareTo(Boolean.valueOf(iiVar.m6117a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6117a() && (a32 = it.a(this.f726a, iiVar.f726a)) != 0) {
            return a32;
        }
        int compareTo2 = Boolean.valueOf(m6119b()).compareTo(Boolean.valueOf(iiVar.m6119b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m6119b() && (a31 = it.a(this.f725a, iiVar.f725a)) != 0) {
            return a31;
        }
        int compareTo3 = Boolean.valueOf(m6120c()).compareTo(Boolean.valueOf(iiVar.m6120c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m6120c() && (a29 = it.a(this.f732b, iiVar.f732b)) != 0) {
            return a29;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iiVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a28 = it.a(this.f734c, iiVar.f734c)) != 0) {
            return a28;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iiVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a27 = it.a(this.f724a, iiVar.f724a)) != 0) {
            return a27;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iiVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a26 = it.a(this.f735d, iiVar.f735d)) != 0) {
            return a26;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(iiVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a25 = it.a(this.f736e, iiVar.f736e)) != 0) {
            return a25;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(iiVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a24 = it.a(this.f737f, iiVar.f737f)) != 0) {
            return a24;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(iiVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a23 = it.a(this.f738g, iiVar.f738g)) != 0) {
            return a23;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(iiVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a22 = it.a(this.f731b, iiVar.f731b)) != 0) {
            return a22;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(iiVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a21 = it.a(this.f739h, iiVar.f739h)) != 0) {
            return a21;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(iiVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a19 = it.a(this.f740i, iiVar.f740i)) != 0) {
            return a19;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(iiVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a18 = it.a(this.f733c, iiVar.f733c)) != 0) {
            return a18;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(iiVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a17 = it.a(this.f741j, iiVar.f741j)) != 0) {
            return a17;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(iiVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a16 = it.a(this.f723a, iiVar.f723a)) != 0) {
            return a16;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(iiVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a15 = it.a(this.f742k, iiVar.f742k)) != 0) {
            return a15;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(iiVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a14 = it.a(this.f730b, iiVar.f730b)) != 0) {
            return a14;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(iiVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (r() && (a13 = it.a(this.f743l, iiVar.f743l)) != 0) {
            return a13;
        }
        int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(iiVar.s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (s() && (a12 = it.a(this.f729a, iiVar.f729a)) != 0) {
            return a12;
        }
        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(iiVar.t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!t() || (a11 = it.a(this.f728a, iiVar.f728a)) == 0) {
            return 0;
        }
        return a11;
    }

    public String b() {
        return this.f737f;
    }

    public String c() {
        return this.f738g;
    }

    public void d(boolean z11) {
        this.f727a.set(3, z11);
    }

    public void e(boolean z11) {
        this.f727a.set(4, z11);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ii)) {
            return m6118a((ii) obj);
        }
        return false;
    }

    public void f(boolean z11) {
        this.f727a.set(5, z11);
    }

    public boolean g() {
        return this.f736e != null;
    }

    public boolean h() {
        return this.f737f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f738g != null;
    }

    public boolean j() {
        return this.f727a.get(1);
    }

    public boolean k() {
        return this.f739h != null;
    }

    public boolean l() {
        return this.f740i != null;
    }

    public boolean m() {
        return this.f727a.get(2);
    }

    public boolean n() {
        return this.f741j != null;
    }

    public boolean o() {
        return this.f727a.get(3);
    }

    public boolean p() {
        return this.f742k != null;
    }

    public boolean q() {
        return this.f727a.get(4);
    }

    public boolean r() {
        return this.f743l != null;
    }

    public boolean s() {
        return this.f727a.get(5);
    }

    public boolean t() {
        return this.f728a != null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("XmPushActionRegistrationResult(");
        boolean z12 = false;
        if (m6117a()) {
            sb2.append("debug:");
            String str = this.f726a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (m6119b()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("target:");
            hw hwVar = this.f725a;
            if (hwVar == null) {
                sb2.append("null");
            } else {
                sb2.append(hwVar);
            }
        } else {
            z12 = z11;
        }
        if (!z12) {
            sb2.append(j2.O);
        }
        sb2.append("id:");
        String str2 = this.f732b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(com.xiaomi.push.service.bd.a(str2));
        }
        sb2.append(j2.O);
        sb2.append("appId:");
        String str3 = this.f734c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("errorCode:");
        sb2.append(this.f724a);
        if (f()) {
            sb2.append(j2.O);
            sb2.append("reason:");
            String str4 = this.f735d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("regId:");
            String str5 = this.f736e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str6 = this.f738g;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (j()) {
            sb2.append(j2.O);
            sb2.append("registeredAt:");
            sb2.append(this.f731b);
        }
        if (k()) {
            sb2.append(j2.O);
            sb2.append("aliasName:");
            String str7 = this.f739h;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (l()) {
            sb2.append(j2.O);
            sb2.append("clientId:");
            String str8 = this.f740i;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (m()) {
            sb2.append(j2.O);
            sb2.append("costTime:");
            sb2.append(this.f733c);
        }
        if (n()) {
            sb2.append(j2.O);
            sb2.append("appVersion:");
            String str9 = this.f741j;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        if (o()) {
            sb2.append(j2.O);
            sb2.append("pushSdkVersionCode:");
            sb2.append(this.f723a);
        }
        if (p()) {
            sb2.append(j2.O);
            sb2.append("hybridPushEndpoint:");
            String str10 = this.f742k;
            if (str10 == null) {
                sb2.append("null");
            } else {
                sb2.append(str10);
            }
        }
        if (q()) {
            sb2.append(j2.O);
            sb2.append("appVersionCode:");
            sb2.append(this.f730b);
        }
        if (r()) {
            sb2.append(j2.O);
            sb2.append("region:");
            String str11 = this.f743l;
            if (str11 == null) {
                sb2.append("null");
            } else {
                sb2.append(str11);
            }
        }
        if (s()) {
            sb2.append(j2.O);
            sb2.append("isHybridFrame:");
            sb2.append(this.f729a);
        }
        if (t()) {
            sb2.append(j2.O);
            sb2.append("autoMarkPkgs:");
            List<String> list = this.f728a;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public long a() {
        return this.f724a;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6116a();
        jdVar.a(f722a);
        if (this.f726a != null && m6117a()) {
            jdVar.a(f46053a);
            jdVar.a(this.f726a);
            jdVar.b();
        }
        if (this.f725a != null && m6119b()) {
            jdVar.a(f46054b);
            this.f725a.b(jdVar);
            jdVar.b();
        }
        if (this.f732b != null) {
            jdVar.a(f46055c);
            jdVar.a(this.f732b);
            jdVar.b();
        }
        if (this.f734c != null) {
            jdVar.a(f46056d);
            jdVar.a(this.f734c);
            jdVar.b();
        }
        jdVar.a(f46057e);
        jdVar.a(this.f724a);
        jdVar.b();
        if (this.f735d != null && f()) {
            jdVar.a(f46058f);
            jdVar.a(this.f735d);
            jdVar.b();
        }
        if (this.f736e != null && g()) {
            jdVar.a(f46059g);
            jdVar.a(this.f736e);
            jdVar.b();
        }
        if (this.f737f != null && h()) {
            jdVar.a(f46060h);
            jdVar.a(this.f737f);
            jdVar.b();
        }
        if (this.f738g != null && i()) {
            jdVar.a(f46061i);
            jdVar.a(this.f738g);
            jdVar.b();
        }
        if (j()) {
            jdVar.a(f46062j);
            jdVar.a(this.f731b);
            jdVar.b();
        }
        if (this.f739h != null && k()) {
            jdVar.a(f46063k);
            jdVar.a(this.f739h);
            jdVar.b();
        }
        if (this.f740i != null && l()) {
            jdVar.a(f46064l);
            jdVar.a(this.f740i);
            jdVar.b();
        }
        if (m()) {
            jdVar.a(f46065m);
            jdVar.a(this.f733c);
            jdVar.b();
        }
        if (this.f741j != null && n()) {
            jdVar.a(f46066n);
            jdVar.a(this.f741j);
            jdVar.b();
        }
        if (o()) {
            jdVar.a(f46067o);
            jdVar.mo6166a(this.f723a);
            jdVar.b();
        }
        if (this.f742k != null && p()) {
            jdVar.a(f46068p);
            jdVar.a(this.f742k);
            jdVar.b();
        }
        if (q()) {
            jdVar.a(f46069q);
            jdVar.mo6166a(this.f730b);
            jdVar.b();
        }
        if (this.f743l != null && r()) {
            jdVar.a(f46070r);
            jdVar.a(this.f743l);
            jdVar.b();
        }
        if (s()) {
            jdVar.a(f46071s);
            jdVar.a(this.f729a);
            jdVar.b();
        }
        if (this.f728a != null && t()) {
            jdVar.a(f46072t);
            jdVar.a(new jb((byte) 11, this.f728a.size()));
            Iterator<String> it = this.f728a.iterator();
            while (it.hasNext()) {
                jdVar.a(it.next());
            }
            jdVar.e();
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public void c(boolean z11) {
        this.f727a.set(2, z11);
    }

    public boolean d() {
        return this.f734c != null;
    }

    public boolean e() {
        return this.f727a.get(0);
    }

    public boolean f() {
        return this.f735d != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m6114a() {
        return this.f732b;
    }

    public void b(boolean z11) {
        this.f727a.set(1, z11);
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m6120c() {
        return this.f732b != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public List<String> m6115a() {
        return this.f728a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6119b() {
        return this.f725a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6116a() {
        if (this.f732b == null) {
            throw new je("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f734c != null) {
            return;
        }
        throw new je("Required field 'appId' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                if (e()) {
                    m6116a();
                    return;
                }
                throw new je("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 11) {
                        this.f726a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f725a = hwVar;
                        hwVar.a(jdVar);
                        break;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f732b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f734c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 10) {
                        this.f724a = jdVar.mo6156a();
                        a(true);
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f735d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 11) {
                        this.f736e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 9:
                    if (b11 == 11) {
                        this.f737f = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 10:
                    if (b11 == 11) {
                        this.f738g = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 11:
                    if (b11 == 10) {
                        this.f731b = jdVar.mo6156a();
                        b(true);
                        continue;
                    }
                    break;
                case 12:
                    if (b11 == 11) {
                        this.f739h = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 13:
                    if (b11 == 11) {
                        this.f740i = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 14:
                    if (b11 == 10) {
                        this.f733c = jdVar.mo6156a();
                        c(true);
                        continue;
                    }
                    break;
                case 15:
                    if (b11 == 11) {
                        this.f741j = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 16:
                    if (b11 == 8) {
                        this.f723a = jdVar.mo6155a();
                        d(true);
                        continue;
                    }
                    break;
                case 17:
                    if (b11 == 11) {
                        this.f742k = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 18:
                    if (b11 == 8) {
                        this.f730b = jdVar.mo6155a();
                        e(true);
                        continue;
                    }
                    break;
                case 19:
                    if (b11 == 11) {
                        this.f743l = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 20:
                    if (b11 == 2) {
                        this.f729a = jdVar.mo6167a();
                        f(true);
                        break;
                    }
                    break;
                case 21:
                    if (b11 == 15) {
                        jb mo6158a = jdVar.mo6158a();
                        this.f728a = new ArrayList(mo6158a.f844a);
                        for (int i11 = 0; i11 < mo6158a.f844a; i11++) {
                            this.f728a.add(jdVar.mo6162a());
                        }
                        jdVar.i();
                        break;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public void a(boolean z11) {
        this.f727a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6117a() {
        return this.f726a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6118a(ii iiVar) {
        if (iiVar == null) {
            return false;
        }
        boolean m6117a = m6117a();
        boolean m6117a2 = iiVar.m6117a();
        if ((m6117a || m6117a2) && !(m6117a && m6117a2 && this.f726a.equals(iiVar.f726a))) {
            return false;
        }
        boolean m6119b = m6119b();
        boolean m6119b2 = iiVar.m6119b();
        if ((m6119b || m6119b2) && !(m6119b && m6119b2 && this.f725a.m6057a(iiVar.f725a))) {
            return false;
        }
        boolean m6120c = m6120c();
        boolean m6120c2 = iiVar.m6120c();
        if ((m6120c || m6120c2) && !(m6120c && m6120c2 && this.f732b.equals(iiVar.f732b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = iiVar.d();
        if (((d11 || d12) && !(d11 && d12 && this.f734c.equals(iiVar.f734c))) || this.f724a != iiVar.f724a) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = iiVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f735d.equals(iiVar.f735d))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = iiVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f736e.equals(iiVar.f736e))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = iiVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f737f.equals(iiVar.f737f))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = iiVar.i();
        if ((i11 || i12) && !(i11 && i12 && this.f738g.equals(iiVar.f738g))) {
            return false;
        }
        boolean j11 = j();
        boolean j12 = iiVar.j();
        if ((j11 || j12) && !(j11 && j12 && this.f731b == iiVar.f731b)) {
            return false;
        }
        boolean k11 = k();
        boolean k12 = iiVar.k();
        if ((k11 || k12) && !(k11 && k12 && this.f739h.equals(iiVar.f739h))) {
            return false;
        }
        boolean l11 = l();
        boolean l12 = iiVar.l();
        if ((l11 || l12) && !(l11 && l12 && this.f740i.equals(iiVar.f740i))) {
            return false;
        }
        boolean m11 = m();
        boolean m12 = iiVar.m();
        if ((m11 || m12) && !(m11 && m12 && this.f733c == iiVar.f733c)) {
            return false;
        }
        boolean n11 = n();
        boolean n12 = iiVar.n();
        if ((n11 || n12) && !(n11 && n12 && this.f741j.equals(iiVar.f741j))) {
            return false;
        }
        boolean o11 = o();
        boolean o12 = iiVar.o();
        if ((o11 || o12) && !(o11 && o12 && this.f723a == iiVar.f723a)) {
            return false;
        }
        boolean p11 = p();
        boolean p12 = iiVar.p();
        if ((p11 || p12) && !(p11 && p12 && this.f742k.equals(iiVar.f742k))) {
            return false;
        }
        boolean q11 = q();
        boolean q12 = iiVar.q();
        if ((q11 || q12) && !(q11 && q12 && this.f730b == iiVar.f730b)) {
            return false;
        }
        boolean r11 = r();
        boolean r12 = iiVar.r();
        if ((r11 || r12) && !(r11 && r12 && this.f743l.equals(iiVar.f743l))) {
            return false;
        }
        boolean s11 = s();
        boolean s12 = iiVar.s();
        if ((s11 || s12) && !(s11 && s12 && this.f729a == iiVar.f729a)) {
            return false;
        }
        boolean t11 = t();
        boolean t12 = iiVar.t();
        if (t11 || t12) {
            return t11 && t12 && this.f728a.equals(iiVar.f728a);
        }
        return true;
    }
}
