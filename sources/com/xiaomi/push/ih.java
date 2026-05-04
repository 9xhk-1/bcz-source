package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class ih implements is<ih, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f692a;

    /* renamed from: a, reason: collision with other field name */
    public long f693a;

    /* renamed from: a, reason: collision with other field name */
    public hv f694a;

    /* renamed from: a, reason: collision with other field name */
    public hw f695a;

    /* renamed from: a, reason: collision with other field name */
    public String f696a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f698a;

    /* renamed from: b, reason: collision with other field name */
    public int f700b;

    /* renamed from: b, reason: collision with other field name */
    public long f701b;

    /* renamed from: b, reason: collision with other field name */
    public String f702b;

    /* renamed from: c, reason: collision with other field name */
    public int f704c;

    /* renamed from: c, reason: collision with other field name */
    public String f705c;

    /* renamed from: d, reason: collision with other field name */
    public String f707d;

    /* renamed from: e, reason: collision with other field name */
    public String f708e;

    /* renamed from: f, reason: collision with other field name */
    public String f709f;

    /* renamed from: g, reason: collision with other field name */
    public String f710g;

    /* renamed from: h, reason: collision with other field name */
    public String f711h;

    /* renamed from: i, reason: collision with other field name */
    public String f712i;

    /* renamed from: j, reason: collision with other field name */
    public String f713j;

    /* renamed from: k, reason: collision with other field name */
    public String f714k;

    /* renamed from: l, reason: collision with other field name */
    public String f715l;

    /* renamed from: m, reason: collision with other field name */
    public String f716m;

    /* renamed from: n, reason: collision with other field name */
    public String f717n;

    /* renamed from: o, reason: collision with other field name */
    public String f718o;

    /* renamed from: p, reason: collision with other field name */
    public String f719p;

    /* renamed from: q, reason: collision with other field name */
    public String f720q;

    /* renamed from: r, reason: collision with other field name */
    public String f721r;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f691a = new ji("XmPushActionRegistration");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46027a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f46028b = new ja("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f46029c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f46030d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f46031e = new ja("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f46032f = new ja("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f46033g = new ja("", (byte) 11, 7);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f46034h = new ja("", (byte) 11, 8);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f46035i = new ja("", (byte) 11, 9);

    /* renamed from: j, reason: collision with root package name */
    private static final ja f46036j = new ja("", (byte) 11, 10);

    /* renamed from: k, reason: collision with root package name */
    private static final ja f46037k = new ja("", (byte) 11, 11);

    /* renamed from: l, reason: collision with root package name */
    private static final ja f46038l = new ja("", (byte) 11, 12);

    /* renamed from: m, reason: collision with root package name */
    private static final ja f46039m = new ja("", (byte) 8, 13);

    /* renamed from: n, reason: collision with root package name */
    private static final ja f46040n = new ja("", (byte) 8, 14);

    /* renamed from: o, reason: collision with root package name */
    private static final ja f46041o = new ja("", (byte) 11, 15);

    /* renamed from: p, reason: collision with root package name */
    private static final ja f46042p = new ja("", (byte) 11, 16);

    /* renamed from: q, reason: collision with root package name */
    private static final ja f46043q = new ja("", (byte) 11, 17);

    /* renamed from: r, reason: collision with root package name */
    private static final ja f46044r = new ja("", (byte) 11, 18);

    /* renamed from: s, reason: collision with root package name */
    private static final ja f46045s = new ja("", (byte) 8, 19);

    /* renamed from: t, reason: collision with root package name */
    private static final ja f46046t = new ja("", (byte) 8, 20);

    /* renamed from: u, reason: collision with root package name */
    private static final ja f46047u = new ja("", (byte) 2, 21);

    /* renamed from: v, reason: collision with root package name */
    private static final ja f46048v = new ja("", (byte) 10, 22);

    /* renamed from: w, reason: collision with root package name */
    private static final ja f46049w = new ja("", (byte) 10, 23);

    /* renamed from: x, reason: collision with root package name */
    private static final ja f46050x = new ja("", (byte) 11, 24);

    /* renamed from: y, reason: collision with root package name */
    private static final ja f46051y = new ja("", (byte) 11, 25);

    /* renamed from: z, reason: collision with root package name */
    private static final ja f46052z = new ja("", (byte) 2, 26);
    private static final ja A = new ja("", (byte) 13, 100);
    private static final ja B = new ja("", (byte) 2, 101);
    private static final ja C = new ja("", (byte) 11, 102);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f697a = new BitSet(8);

    /* renamed from: a, reason: collision with other field name */
    public boolean f699a = true;

    /* renamed from: c, reason: collision with other field name */
    public boolean f706c = false;

    /* renamed from: b, reason: collision with other field name */
    public boolean f703b = false;

    public boolean A() {
        return this.f698a != null;
    }

    public boolean B() {
        return this.f697a.get(7);
    }

    public boolean C() {
        return this.f721r != null;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ih ihVar) {
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
        int a33;
        int a34;
        int a35;
        int a36;
        int a37;
        int a38;
        int a39;
        int a41;
        int a42;
        if (!getClass().equals(ihVar.getClass())) {
            return getClass().getName().compareTo(ihVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6110a()).compareTo(Boolean.valueOf(ihVar.m6110a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6110a() && (a42 = it.a(this.f696a, ihVar.f696a)) != 0) {
            return a42;
        }
        int compareTo2 = Boolean.valueOf(m6112b()).compareTo(Boolean.valueOf(ihVar.m6112b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m6112b() && (a41 = it.a(this.f695a, ihVar.f695a)) != 0) {
            return a41;
        }
        int compareTo3 = Boolean.valueOf(m6113c()).compareTo(Boolean.valueOf(ihVar.m6113c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m6113c() && (a39 = it.a(this.f702b, ihVar.f702b)) != 0) {
            return a39;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ihVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a38 = it.a(this.f705c, ihVar.f705c)) != 0) {
            return a38;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ihVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a37 = it.a(this.f707d, ihVar.f707d)) != 0) {
            return a37;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ihVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a36 = it.a(this.f708e, ihVar.f708e)) != 0) {
            return a36;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ihVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a35 = it.a(this.f709f, ihVar.f709f)) != 0) {
            return a35;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ihVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a34 = it.a(this.f710g, ihVar.f710g)) != 0) {
            return a34;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ihVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a33 = it.a(this.f711h, ihVar.f711h)) != 0) {
            return a33;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ihVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a32 = it.a(this.f712i, ihVar.f712i)) != 0) {
            return a32;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ihVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a31 = it.a(this.f713j, ihVar.f713j)) != 0) {
            return a31;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(ihVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a29 = it.a(this.f714k, ihVar.f714k)) != 0) {
            return a29;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(ihVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a28 = it.a(this.f692a, ihVar.f692a)) != 0) {
            return a28;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(ihVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a27 = it.a(this.f700b, ihVar.f700b)) != 0) {
            return a27;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(ihVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a26 = it.a(this.f715l, ihVar.f715l)) != 0) {
            return a26;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(ihVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a25 = it.a(this.f716m, ihVar.f716m)) != 0) {
            return a25;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(ihVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a24 = it.a(this.f717n, ihVar.f717n)) != 0) {
            return a24;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(ihVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (r() && (a23 = it.a(this.f718o, ihVar.f718o)) != 0) {
            return a23;
        }
        int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(ihVar.s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (s() && (a22 = it.a(this.f704c, ihVar.f704c)) != 0) {
            return a22;
        }
        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(ihVar.t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (t() && (a21 = it.a(this.f694a, ihVar.f694a)) != 0) {
            return a21;
        }
        int compareTo21 = Boolean.valueOf(u()).compareTo(Boolean.valueOf(ihVar.u()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (u() && (a19 = it.a(this.f699a, ihVar.f699a)) != 0) {
            return a19;
        }
        int compareTo22 = Boolean.valueOf(v()).compareTo(Boolean.valueOf(ihVar.v()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (v() && (a18 = it.a(this.f693a, ihVar.f693a)) != 0) {
            return a18;
        }
        int compareTo23 = Boolean.valueOf(w()).compareTo(Boolean.valueOf(ihVar.w()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (w() && (a17 = it.a(this.f701b, ihVar.f701b)) != 0) {
            return a17;
        }
        int compareTo24 = Boolean.valueOf(x()).compareTo(Boolean.valueOf(ihVar.x()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (x() && (a16 = it.a(this.f719p, ihVar.f719p)) != 0) {
            return a16;
        }
        int compareTo25 = Boolean.valueOf(y()).compareTo(Boolean.valueOf(ihVar.y()));
        if (compareTo25 != 0) {
            return compareTo25;
        }
        if (y() && (a15 = it.a(this.f720q, ihVar.f720q)) != 0) {
            return a15;
        }
        int compareTo26 = Boolean.valueOf(z()).compareTo(Boolean.valueOf(ihVar.z()));
        if (compareTo26 != 0) {
            return compareTo26;
        }
        if (z() && (a14 = it.a(this.f703b, ihVar.f703b)) != 0) {
            return a14;
        }
        int compareTo27 = Boolean.valueOf(A()).compareTo(Boolean.valueOf(ihVar.A()));
        if (compareTo27 != 0) {
            return compareTo27;
        }
        if (A() && (a13 = it.a(this.f698a, ihVar.f698a)) != 0) {
            return a13;
        }
        int compareTo28 = Boolean.valueOf(B()).compareTo(Boolean.valueOf(ihVar.B()));
        if (compareTo28 != 0) {
            return compareTo28;
        }
        if (B() && (a12 = it.a(this.f706c, ihVar.f706c)) != 0) {
            return a12;
        }
        int compareTo29 = Boolean.valueOf(C()).compareTo(Boolean.valueOf(ihVar.C()));
        if (compareTo29 != 0) {
            return compareTo29;
        }
        if (!C() || (a11 = it.a(this.f721r, ihVar.f721r)) == 0) {
            return 0;
        }
        return a11;
    }

    public ih b(int i11) {
        this.f700b = i11;
        b(true);
        return this;
    }

    public ih c(int i11) {
        this.f704c = i11;
        c(true);
        return this;
    }

    public ih d(String str) {
        this.f708e = str;
        return this;
    }

    public ih e(String str) {
        this.f709f = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ih)) {
            return m6111a((ih) obj);
        }
        return false;
    }

    public ih f(String str) {
        this.f710g = str;
        return this;
    }

    public ih g(String str) {
        this.f711h = str;
        return this;
    }

    public ih h(String str) {
        this.f714k = str;
        return this;
    }

    public int hashCode() {
        return 0;
    }

    public ih i(String str) {
        this.f718o = str;
        return this;
    }

    public boolean j() {
        return this.f712i != null;
    }

    public boolean k() {
        return this.f713j != null;
    }

    public boolean l() {
        return this.f714k != null;
    }

    public boolean m() {
        return this.f697a.get(0);
    }

    public boolean n() {
        return this.f697a.get(1);
    }

    public boolean o() {
        return this.f715l != null;
    }

    public boolean p() {
        return this.f716m != null;
    }

    public boolean q() {
        return this.f717n != null;
    }

    public boolean r() {
        return this.f718o != null;
    }

    public boolean s() {
        return this.f697a.get(2);
    }

    public boolean t() {
        return this.f694a != null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("XmPushActionRegistration(");
        boolean z12 = false;
        if (m6110a()) {
            sb2.append("debug:");
            String str = this.f696a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (m6112b()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("target:");
            hw hwVar = this.f695a;
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
        String str2 = this.f702b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(com.xiaomi.push.service.bd.a(str2));
        }
        sb2.append(j2.O);
        sb2.append("appId:");
        String str3 = this.f705c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (e()) {
            sb2.append(j2.O);
            sb2.append("appVersion:");
            String str4 = this.f707d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (f()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str5 = this.f708e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        sb2.append(j2.O);
        sb2.append("token:");
        String str6 = this.f709f;
        if (str6 == null) {
            sb2.append("null");
        } else {
            sb2.append(str6);
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("deviceId:");
            String str7 = this.f710g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("aliasName:");
            String str8 = this.f711h;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (j()) {
            sb2.append(j2.O);
            sb2.append("sdkVersion:");
            String str9 = this.f712i;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        if (k()) {
            sb2.append(j2.O);
            sb2.append("regId:");
            String str10 = this.f713j;
            if (str10 == null) {
                sb2.append("null");
            } else {
                sb2.append(str10);
            }
        }
        if (l()) {
            sb2.append(j2.O);
            sb2.append("pushSdkVersionName:");
            String str11 = this.f714k;
            if (str11 == null) {
                sb2.append("null");
            } else {
                sb2.append(str11);
            }
        }
        if (m()) {
            sb2.append(j2.O);
            sb2.append("pushSdkVersionCode:");
            sb2.append(this.f692a);
        }
        if (n()) {
            sb2.append(j2.O);
            sb2.append("appVersionCode:");
            sb2.append(this.f700b);
        }
        if (o()) {
            sb2.append(j2.O);
            sb2.append("androidId:");
            String str12 = this.f715l;
            if (str12 == null) {
                sb2.append("null");
            } else {
                sb2.append(str12);
            }
        }
        if (p()) {
            sb2.append(j2.O);
            sb2.append("imei:");
            String str13 = this.f716m;
            if (str13 == null) {
                sb2.append("null");
            } else {
                sb2.append(str13);
            }
        }
        if (q()) {
            sb2.append(j2.O);
            sb2.append("serial:");
            String str14 = this.f717n;
            if (str14 == null) {
                sb2.append("null");
            } else {
                sb2.append(str14);
            }
        }
        if (r()) {
            sb2.append(j2.O);
            sb2.append("imeiMd5:");
            String str15 = this.f718o;
            if (str15 == null) {
                sb2.append("null");
            } else {
                sb2.append(str15);
            }
        }
        if (s()) {
            sb2.append(j2.O);
            sb2.append("spaceId:");
            sb2.append(this.f704c);
        }
        if (t()) {
            sb2.append(j2.O);
            sb2.append("reason:");
            hv hvVar = this.f694a;
            if (hvVar == null) {
                sb2.append("null");
            } else {
                sb2.append(hvVar);
            }
        }
        if (u()) {
            sb2.append(j2.O);
            sb2.append("validateToken:");
            sb2.append(this.f699a);
        }
        if (v()) {
            sb2.append(j2.O);
            sb2.append("miid:");
            sb2.append(this.f693a);
        }
        if (w()) {
            sb2.append(j2.O);
            sb2.append("createdTs:");
            sb2.append(this.f701b);
        }
        if (x()) {
            sb2.append(j2.O);
            sb2.append("subImei:");
            String str16 = this.f719p;
            if (str16 == null) {
                sb2.append("null");
            } else {
                sb2.append(str16);
            }
        }
        if (y()) {
            sb2.append(j2.O);
            sb2.append("subImeiMd5:");
            String str17 = this.f720q;
            if (str17 == null) {
                sb2.append("null");
            } else {
                sb2.append(str17);
            }
        }
        if (z()) {
            sb2.append(j2.O);
            sb2.append("isHybridFrame:");
            sb2.append(this.f703b);
        }
        if (A()) {
            sb2.append(j2.O);
            sb2.append("connectionAttrs:");
            Map<String, String> map = this.f698a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        }
        if (B()) {
            sb2.append(j2.O);
            sb2.append("cleanOldRegInfo:");
            sb2.append(this.f706c);
        }
        if (C()) {
            sb2.append(j2.O);
            sb2.append("oldRegId:");
            String str18 = this.f721r;
            if (str18 == null) {
                sb2.append("null");
            } else {
                sb2.append(str18);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public boolean u() {
        return this.f697a.get(3);
    }

    public boolean v() {
        return this.f697a.get(4);
    }

    public boolean w() {
        return this.f697a.get(5);
    }

    public boolean x() {
        return this.f719p != null;
    }

    public boolean y() {
        return this.f720q != null;
    }

    public boolean z() {
        return this.f697a.get(6);
    }

    public ih a(int i11) {
        this.f692a = i11;
        a(true);
        return this;
    }

    public ih b(String str) {
        this.f705c = str;
        return this;
    }

    public ih c(String str) {
        this.f707d = str;
        return this;
    }

    public void d(boolean z11) {
        this.f697a.set(3, z11);
    }

    public void e(boolean z11) {
        this.f697a.set(4, z11);
    }

    public void f(boolean z11) {
        this.f697a.set(5, z11);
    }

    public void g(boolean z11) {
        this.f697a.set(6, z11);
    }

    public void h(boolean z11) {
        this.f697a.set(7, z11);
    }

    public boolean i() {
        return this.f711h != null;
    }

    public ih a(hv hvVar) {
        this.f694a = hvVar;
        return this;
    }

    public String b() {
        return this.f705c;
    }

    public String c() {
        return this.f709f;
    }

    public boolean d() {
        return this.f705c != null;
    }

    public boolean e() {
        return this.f707d != null;
    }

    public boolean f() {
        return this.f708e != null;
    }

    public boolean g() {
        return this.f709f != null;
    }

    public boolean h() {
        return this.f710g != null;
    }

    public ih a(String str) {
        this.f702b = str;
        return this;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6109a();
        jdVar.a(f691a);
        if (this.f696a != null && m6110a()) {
            jdVar.a(f46027a);
            jdVar.a(this.f696a);
            jdVar.b();
        }
        if (this.f695a != null && m6112b()) {
            jdVar.a(f46028b);
            this.f695a.b(jdVar);
            jdVar.b();
        }
        if (this.f702b != null) {
            jdVar.a(f46029c);
            jdVar.a(this.f702b);
            jdVar.b();
        }
        if (this.f705c != null) {
            jdVar.a(f46030d);
            jdVar.a(this.f705c);
            jdVar.b();
        }
        if (this.f707d != null && e()) {
            jdVar.a(f46031e);
            jdVar.a(this.f707d);
            jdVar.b();
        }
        if (this.f708e != null && f()) {
            jdVar.a(f46032f);
            jdVar.a(this.f708e);
            jdVar.b();
        }
        if (this.f709f != null) {
            jdVar.a(f46033g);
            jdVar.a(this.f709f);
            jdVar.b();
        }
        if (this.f710g != null && h()) {
            jdVar.a(f46034h);
            jdVar.a(this.f710g);
            jdVar.b();
        }
        if (this.f711h != null && i()) {
            jdVar.a(f46035i);
            jdVar.a(this.f711h);
            jdVar.b();
        }
        if (this.f712i != null && j()) {
            jdVar.a(f46036j);
            jdVar.a(this.f712i);
            jdVar.b();
        }
        if (this.f713j != null && k()) {
            jdVar.a(f46037k);
            jdVar.a(this.f713j);
            jdVar.b();
        }
        if (this.f714k != null && l()) {
            jdVar.a(f46038l);
            jdVar.a(this.f714k);
            jdVar.b();
        }
        if (m()) {
            jdVar.a(f46039m);
            jdVar.mo6166a(this.f692a);
            jdVar.b();
        }
        if (n()) {
            jdVar.a(f46040n);
            jdVar.mo6166a(this.f700b);
            jdVar.b();
        }
        if (this.f715l != null && o()) {
            jdVar.a(f46041o);
            jdVar.a(this.f715l);
            jdVar.b();
        }
        if (this.f716m != null && p()) {
            jdVar.a(f46042p);
            jdVar.a(this.f716m);
            jdVar.b();
        }
        if (this.f717n != null && q()) {
            jdVar.a(f46043q);
            jdVar.a(this.f717n);
            jdVar.b();
        }
        if (this.f718o != null && r()) {
            jdVar.a(f46044r);
            jdVar.a(this.f718o);
            jdVar.b();
        }
        if (s()) {
            jdVar.a(f46045s);
            jdVar.mo6166a(this.f704c);
            jdVar.b();
        }
        if (this.f694a != null && t()) {
            jdVar.a(f46046t);
            jdVar.mo6166a(this.f694a.a());
            jdVar.b();
        }
        if (u()) {
            jdVar.a(f46047u);
            jdVar.a(this.f699a);
            jdVar.b();
        }
        if (v()) {
            jdVar.a(f46048v);
            jdVar.a(this.f693a);
            jdVar.b();
        }
        if (w()) {
            jdVar.a(f46049w);
            jdVar.a(this.f701b);
            jdVar.b();
        }
        if (this.f719p != null && x()) {
            jdVar.a(f46050x);
            jdVar.a(this.f719p);
            jdVar.b();
        }
        if (this.f720q != null && y()) {
            jdVar.a(f46051y);
            jdVar.a(this.f720q);
            jdVar.b();
        }
        if (z()) {
            jdVar.a(f46052z);
            jdVar.a(this.f703b);
            jdVar.b();
        }
        if (this.f698a != null && A()) {
            jdVar.a(A);
            jdVar.a(new jc((byte) 11, (byte) 11, this.f698a.size()));
            for (Map.Entry<String, String> entry : this.f698a.entrySet()) {
                jdVar.a(entry.getKey());
                jdVar.a(entry.getValue());
            }
            jdVar.d();
            jdVar.b();
        }
        if (B()) {
            jdVar.a(B);
            jdVar.a(this.f706c);
            jdVar.b();
        }
        if (this.f721r != null && C()) {
            jdVar.a(C);
            jdVar.a(this.f721r);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public void c(boolean z11) {
        this.f697a.set(2, z11);
    }

    public String a() {
        return this.f702b;
    }

    public void b(boolean z11) {
        this.f697a.set(1, z11);
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m6113c() {
        return this.f702b != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6109a() {
        if (this.f702b == null) {
            throw new je("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f705c == null) {
            throw new je("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f709f != null) {
            return;
        }
        throw new je("Required field 'token' was not present! Struct: " + toString());
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6112b() {
        return this.f695a != null;
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                m6109a();
                return;
            }
            short s11 = mo6157a.f843a;
            switch (s11) {
                case 1:
                    if (b11 == 11) {
                        this.f696a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f695a = hwVar;
                        hwVar.a(jdVar);
                        break;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f702b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f705c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 11) {
                        this.f707d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 11) {
                        this.f708e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f709f = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 11) {
                        this.f710g = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 9:
                    if (b11 == 11) {
                        this.f711h = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 10:
                    if (b11 == 11) {
                        this.f712i = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 11:
                    if (b11 == 11) {
                        this.f713j = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 12:
                    if (b11 == 11) {
                        this.f714k = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 13:
                    if (b11 == 8) {
                        this.f692a = jdVar.mo6155a();
                        a(true);
                        continue;
                    }
                    break;
                case 14:
                    if (b11 == 8) {
                        this.f700b = jdVar.mo6155a();
                        b(true);
                        continue;
                    }
                    break;
                case 15:
                    if (b11 == 11) {
                        this.f715l = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 16:
                    if (b11 == 11) {
                        this.f716m = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 17:
                    if (b11 == 11) {
                        this.f717n = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 18:
                    if (b11 == 11) {
                        this.f718o = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 19:
                    if (b11 == 8) {
                        this.f704c = jdVar.mo6155a();
                        c(true);
                        continue;
                    }
                    break;
                case 20:
                    if (b11 == 8) {
                        this.f694a = hv.a(jdVar.mo6155a());
                        continue;
                    }
                    break;
                case 21:
                    if (b11 == 2) {
                        this.f699a = jdVar.mo6167a();
                        d(true);
                        continue;
                    }
                    break;
                case 22:
                    if (b11 == 10) {
                        this.f693a = jdVar.mo6156a();
                        e(true);
                        continue;
                    }
                    break;
                case 23:
                    if (b11 == 10) {
                        this.f701b = jdVar.mo6156a();
                        f(true);
                        continue;
                    }
                    break;
                case 24:
                    if (b11 == 11) {
                        this.f719p = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 25:
                    if (b11 == 11) {
                        this.f720q = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 26:
                    if (b11 == 2) {
                        this.f703b = jdVar.mo6167a();
                        g(true);
                        continue;
                    }
                    break;
                default:
                    switch (s11) {
                        case 100:
                            if (b11 == 13) {
                                jc mo6159a = jdVar.mo6159a();
                                this.f698a = new HashMap(mo6159a.f845a * 2);
                                for (int i11 = 0; i11 < mo6159a.f845a; i11++) {
                                    this.f698a.put(jdVar.mo6162a(), jdVar.mo6162a());
                                }
                                jdVar.h();
                                break;
                            }
                            break;
                        case 101:
                            if (b11 == 2) {
                                this.f706c = jdVar.mo6167a();
                                h(true);
                                continue;
                            }
                            break;
                        case 102:
                            if (b11 == 11) {
                                this.f721r = jdVar.mo6162a();
                                continue;
                            }
                            break;
                    }
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public void a(boolean z11) {
        this.f697a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6110a() {
        return this.f696a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6111a(ih ihVar) {
        if (ihVar == null) {
            return false;
        }
        boolean m6110a = m6110a();
        boolean m6110a2 = ihVar.m6110a();
        if ((m6110a || m6110a2) && !(m6110a && m6110a2 && this.f696a.equals(ihVar.f696a))) {
            return false;
        }
        boolean m6112b = m6112b();
        boolean m6112b2 = ihVar.m6112b();
        if ((m6112b || m6112b2) && !(m6112b && m6112b2 && this.f695a.m6057a(ihVar.f695a))) {
            return false;
        }
        boolean m6113c = m6113c();
        boolean m6113c2 = ihVar.m6113c();
        if ((m6113c || m6113c2) && !(m6113c && m6113c2 && this.f702b.equals(ihVar.f702b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = ihVar.d();
        if ((d11 || d12) && !(d11 && d12 && this.f705c.equals(ihVar.f705c))) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = ihVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f707d.equals(ihVar.f707d))) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = ihVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f708e.equals(ihVar.f708e))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = ihVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f709f.equals(ihVar.f709f))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = ihVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f710g.equals(ihVar.f710g))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = ihVar.i();
        if ((i11 || i12) && !(i11 && i12 && this.f711h.equals(ihVar.f711h))) {
            return false;
        }
        boolean j11 = j();
        boolean j12 = ihVar.j();
        if ((j11 || j12) && !(j11 && j12 && this.f712i.equals(ihVar.f712i))) {
            return false;
        }
        boolean k11 = k();
        boolean k12 = ihVar.k();
        if ((k11 || k12) && !(k11 && k12 && this.f713j.equals(ihVar.f713j))) {
            return false;
        }
        boolean l11 = l();
        boolean l12 = ihVar.l();
        if ((l11 || l12) && !(l11 && l12 && this.f714k.equals(ihVar.f714k))) {
            return false;
        }
        boolean m11 = m();
        boolean m12 = ihVar.m();
        if ((m11 || m12) && !(m11 && m12 && this.f692a == ihVar.f692a)) {
            return false;
        }
        boolean n11 = n();
        boolean n12 = ihVar.n();
        if ((n11 || n12) && !(n11 && n12 && this.f700b == ihVar.f700b)) {
            return false;
        }
        boolean o11 = o();
        boolean o12 = ihVar.o();
        if ((o11 || o12) && !(o11 && o12 && this.f715l.equals(ihVar.f715l))) {
            return false;
        }
        boolean p11 = p();
        boolean p12 = ihVar.p();
        if ((p11 || p12) && !(p11 && p12 && this.f716m.equals(ihVar.f716m))) {
            return false;
        }
        boolean q11 = q();
        boolean q12 = ihVar.q();
        if ((q11 || q12) && !(q11 && q12 && this.f717n.equals(ihVar.f717n))) {
            return false;
        }
        boolean r11 = r();
        boolean r12 = ihVar.r();
        if ((r11 || r12) && !(r11 && r12 && this.f718o.equals(ihVar.f718o))) {
            return false;
        }
        boolean s11 = s();
        boolean s12 = ihVar.s();
        if ((s11 || s12) && !(s11 && s12 && this.f704c == ihVar.f704c)) {
            return false;
        }
        boolean t11 = t();
        boolean t12 = ihVar.t();
        if ((t11 || t12) && !(t11 && t12 && this.f694a.equals(ihVar.f694a))) {
            return false;
        }
        boolean u11 = u();
        boolean u12 = ihVar.u();
        if ((u11 || u12) && !(u11 && u12 && this.f699a == ihVar.f699a)) {
            return false;
        }
        boolean v11 = v();
        boolean v12 = ihVar.v();
        if ((v11 || v12) && !(v11 && v12 && this.f693a == ihVar.f693a)) {
            return false;
        }
        boolean w11 = w();
        boolean w12 = ihVar.w();
        if ((w11 || w12) && !(w11 && w12 && this.f701b == ihVar.f701b)) {
            return false;
        }
        boolean x11 = x();
        boolean x12 = ihVar.x();
        if ((x11 || x12) && !(x11 && x12 && this.f719p.equals(ihVar.f719p))) {
            return false;
        }
        boolean y11 = y();
        boolean y12 = ihVar.y();
        if ((y11 || y12) && !(y11 && y12 && this.f720q.equals(ihVar.f720q))) {
            return false;
        }
        boolean z11 = z();
        boolean z12 = ihVar.z();
        if ((z11 || z12) && !(z11 && z12 && this.f703b == ihVar.f703b)) {
            return false;
        }
        boolean A2 = A();
        boolean A3 = ihVar.A();
        if ((A2 || A3) && !(A2 && A3 && this.f698a.equals(ihVar.f698a))) {
            return false;
        }
        boolean B2 = B();
        boolean B3 = ihVar.B();
        if ((B2 || B3) && !(B2 && B3 && this.f706c == ihVar.f706c)) {
            return false;
        }
        boolean C2 = C();
        boolean C3 = ihVar.C();
        if (C2 || C3) {
            return C2 && C3 && this.f721r.equals(ihVar.f721r);
        }
        return true;
    }
}
