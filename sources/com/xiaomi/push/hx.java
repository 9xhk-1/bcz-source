package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class hx implements is<hx, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f594a;

    /* renamed from: a, reason: collision with other field name */
    public long f595a;

    /* renamed from: a, reason: collision with other field name */
    public hw f596a;

    /* renamed from: a, reason: collision with other field name */
    public ik f597a;

    /* renamed from: a, reason: collision with other field name */
    public String f598a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f600a;

    /* renamed from: a, reason: collision with other field name */
    public short f601a;

    /* renamed from: b, reason: collision with other field name */
    public String f603b;

    /* renamed from: b, reason: collision with other field name */
    public short f604b;

    /* renamed from: c, reason: collision with other field name */
    public String f605c;

    /* renamed from: d, reason: collision with other field name */
    public String f606d;

    /* renamed from: e, reason: collision with other field name */
    public String f607e;

    /* renamed from: f, reason: collision with other field name */
    public String f608f;

    /* renamed from: g, reason: collision with other field name */
    public String f609g;

    /* renamed from: h, reason: collision with other field name */
    public String f610h;

    /* renamed from: i, reason: collision with other field name */
    public String f611i;

    /* renamed from: j, reason: collision with other field name */
    public String f612j;

    /* renamed from: k, reason: collision with other field name */
    public String f613k;

    /* renamed from: l, reason: collision with other field name */
    public String f614l;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f593a = new ji("XmPushActionAckMessage");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45943a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45944b = new ja("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f45945c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f45946d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f45947e = new ja("", (byte) 10, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f45948f = new ja("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f45949g = new ja("", (byte) 11, 7);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f45950h = new ja("", (byte) 12, 8);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f45951i = new ja("", (byte) 11, 9);

    /* renamed from: j, reason: collision with root package name */
    private static final ja f45952j = new ja("", (byte) 11, 10);

    /* renamed from: k, reason: collision with root package name */
    private static final ja f45953k = new ja("", (byte) 2, 11);

    /* renamed from: l, reason: collision with root package name */
    private static final ja f45954l = new ja("", (byte) 11, 12);

    /* renamed from: m, reason: collision with root package name */
    private static final ja f45955m = new ja("", (byte) 11, 13);

    /* renamed from: n, reason: collision with root package name */
    private static final ja f45956n = new ja("", (byte) 11, 14);

    /* renamed from: o, reason: collision with root package name */
    private static final ja f45957o = new ja("", (byte) 6, 15);

    /* renamed from: p, reason: collision with root package name */
    private static final ja f45958p = new ja("", (byte) 6, 16);

    /* renamed from: q, reason: collision with root package name */
    private static final ja f45959q = new ja("", (byte) 11, 20);

    /* renamed from: r, reason: collision with root package name */
    private static final ja f45960r = new ja("", (byte) 11, 21);

    /* renamed from: s, reason: collision with root package name */
    private static final ja f45961s = new ja("", (byte) 8, 22);

    /* renamed from: t, reason: collision with root package name */
    private static final ja f45962t = new ja("", (byte) 13, 23);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f599a = new BitSet(5);

    /* renamed from: a, reason: collision with other field name */
    public boolean f602a = false;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hx hxVar) {
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
        if (!getClass().equals(hxVar.getClass())) {
            return getClass().getName().compareTo(hxVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6058a()).compareTo(Boolean.valueOf(hxVar.m6058a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6058a() && (a32 = it.a(this.f598a, hxVar.f598a)) != 0) {
            return a32;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hxVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a31 = it.a(this.f596a, hxVar.f596a)) != 0) {
            return a31;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hxVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a29 = it.a(this.f603b, hxVar.f603b)) != 0) {
            return a29;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hxVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a28 = it.a(this.f605c, hxVar.f605c)) != 0) {
            return a28;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hxVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a27 = it.a(this.f595a, hxVar.f595a)) != 0) {
            return a27;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hxVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a26 = it.a(this.f606d, hxVar.f606d)) != 0) {
            return a26;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hxVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a25 = it.a(this.f607e, hxVar.f607e)) != 0) {
            return a25;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hxVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a24 = it.a(this.f597a, hxVar.f597a)) != 0) {
            return a24;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hxVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a23 = it.a(this.f608f, hxVar.f608f)) != 0) {
            return a23;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(hxVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a22 = it.a(this.f609g, hxVar.f609g)) != 0) {
            return a22;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(hxVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a21 = it.a(this.f602a, hxVar.f602a)) != 0) {
            return a21;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(hxVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a19 = it.a(this.f610h, hxVar.f610h)) != 0) {
            return a19;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(hxVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a18 = it.a(this.f611i, hxVar.f611i)) != 0) {
            return a18;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(hxVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a17 = it.a(this.f612j, hxVar.f612j)) != 0) {
            return a17;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(hxVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a16 = it.a(this.f601a, hxVar.f601a)) != 0) {
            return a16;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(hxVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a15 = it.a(this.f604b, hxVar.f604b)) != 0) {
            return a15;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(hxVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a14 = it.a(this.f613k, hxVar.f613k)) != 0) {
            return a14;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(hxVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (r() && (a13 = it.a(this.f614l, hxVar.f614l)) != 0) {
            return a13;
        }
        int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(hxVar.s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (s() && (a12 = it.a(this.f594a, hxVar.f594a)) != 0) {
            return a12;
        }
        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(hxVar.t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!t() || (a11 = it.a(this.f600a, hxVar.f600a)) == 0) {
            return 0;
        }
        return a11;
    }

    public hx b(String str) {
        this.f605c = str;
        return this;
    }

    public hx c(String str) {
        this.f606d = str;
        return this;
    }

    public hx d(String str) {
        this.f607e = str;
        return this;
    }

    public void e(boolean z11) {
        this.f599a.set(4, z11);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hx)) {
            return m6059a((hx) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f606d != null;
    }

    public boolean g() {
        return this.f607e != null;
    }

    public boolean h() {
        return this.f597a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f608f != null;
    }

    public boolean j() {
        return this.f609g != null;
    }

    public boolean k() {
        return this.f599a.get(1);
    }

    public boolean l() {
        return this.f610h != null;
    }

    public boolean m() {
        return this.f611i != null;
    }

    public boolean n() {
        return this.f612j != null;
    }

    public boolean o() {
        return this.f599a.get(2);
    }

    public boolean p() {
        return this.f599a.get(3);
    }

    public boolean q() {
        return this.f613k != null;
    }

    public boolean r() {
        return this.f614l != null;
    }

    public boolean s() {
        return this.f599a.get(4);
    }

    public boolean t() {
        return this.f600a != null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("XmPushActionAckMessage(");
        boolean z12 = false;
        if (m6058a()) {
            sb2.append("debug:");
            String str = this.f598a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (b()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("target:");
            hw hwVar = this.f596a;
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
        String str2 = this.f603b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("appId:");
        String str3 = this.f605c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("messageTs:");
        sb2.append(this.f595a);
        if (f()) {
            sb2.append(j2.O);
            sb2.append("topic:");
            String str4 = this.f606d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("aliasName:");
            String str5 = this.f607e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("request:");
            ik ikVar = this.f597a;
            if (ikVar == null) {
                sb2.append("null");
            } else {
                sb2.append(ikVar);
            }
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str6 = this.f608f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (j()) {
            sb2.append(j2.O);
            sb2.append("category:");
            String str7 = this.f609g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (k()) {
            sb2.append(j2.O);
            sb2.append("isOnline:");
            sb2.append(this.f602a);
        }
        if (l()) {
            sb2.append(j2.O);
            sb2.append("regId:");
            String str8 = this.f610h;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (m()) {
            sb2.append(j2.O);
            sb2.append("callbackUrl:");
            String str9 = this.f611i;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        if (n()) {
            sb2.append(j2.O);
            sb2.append("userAccount:");
            String str10 = this.f612j;
            if (str10 == null) {
                sb2.append("null");
            } else {
                sb2.append(str10);
            }
        }
        if (o()) {
            sb2.append(j2.O);
            sb2.append("deviceStatus:");
            sb2.append((int) this.f601a);
        }
        if (p()) {
            sb2.append(j2.O);
            sb2.append("geoMsgStatus:");
            sb2.append((int) this.f604b);
        }
        if (q()) {
            sb2.append(j2.O);
            sb2.append("imeiMd5:");
            String str11 = this.f613k;
            if (str11 == null) {
                sb2.append("null");
            } else {
                sb2.append(str11);
            }
        }
        if (r()) {
            sb2.append(j2.O);
            sb2.append("deviceId:");
            String str12 = this.f614l;
            if (str12 == null) {
                sb2.append("null");
            } else {
                sb2.append(str12);
            }
        }
        if (s()) {
            sb2.append(j2.O);
            sb2.append("passThrough:");
            sb2.append(this.f594a);
        }
        if (t()) {
            sb2.append(j2.O);
            sb2.append("extra:");
            Map<String, String> map = this.f600a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public hx a(long j11) {
        this.f595a = j11;
        a(true);
        return this;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        a();
        jdVar.a(f593a);
        if (this.f598a != null && m6058a()) {
            jdVar.a(f45943a);
            jdVar.a(this.f598a);
            jdVar.b();
        }
        if (this.f596a != null && b()) {
            jdVar.a(f45944b);
            this.f596a.b(jdVar);
            jdVar.b();
        }
        if (this.f603b != null) {
            jdVar.a(f45945c);
            jdVar.a(this.f603b);
            jdVar.b();
        }
        if (this.f605c != null) {
            jdVar.a(f45946d);
            jdVar.a(this.f605c);
            jdVar.b();
        }
        jdVar.a(f45947e);
        jdVar.a(this.f595a);
        jdVar.b();
        if (this.f606d != null && f()) {
            jdVar.a(f45948f);
            jdVar.a(this.f606d);
            jdVar.b();
        }
        if (this.f607e != null && g()) {
            jdVar.a(f45949g);
            jdVar.a(this.f607e);
            jdVar.b();
        }
        if (this.f597a != null && h()) {
            jdVar.a(f45950h);
            this.f597a.b(jdVar);
            jdVar.b();
        }
        if (this.f608f != null && i()) {
            jdVar.a(f45951i);
            jdVar.a(this.f608f);
            jdVar.b();
        }
        if (this.f609g != null && j()) {
            jdVar.a(f45952j);
            jdVar.a(this.f609g);
            jdVar.b();
        }
        if (k()) {
            jdVar.a(f45953k);
            jdVar.a(this.f602a);
            jdVar.b();
        }
        if (this.f610h != null && l()) {
            jdVar.a(f45954l);
            jdVar.a(this.f610h);
            jdVar.b();
        }
        if (this.f611i != null && m()) {
            jdVar.a(f45955m);
            jdVar.a(this.f611i);
            jdVar.b();
        }
        if (this.f612j != null && n()) {
            jdVar.a(f45956n);
            jdVar.a(this.f612j);
            jdVar.b();
        }
        if (o()) {
            jdVar.a(f45957o);
            jdVar.a(this.f601a);
            jdVar.b();
        }
        if (p()) {
            jdVar.a(f45958p);
            jdVar.a(this.f604b);
            jdVar.b();
        }
        if (this.f613k != null && q()) {
            jdVar.a(f45959q);
            jdVar.a(this.f613k);
            jdVar.b();
        }
        if (this.f614l != null && r()) {
            jdVar.a(f45960r);
            jdVar.a(this.f614l);
            jdVar.b();
        }
        if (s()) {
            jdVar.a(f45961s);
            jdVar.mo6166a(this.f594a);
            jdVar.b();
        }
        if (this.f600a != null && t()) {
            jdVar.a(f45962t);
            jdVar.a(new jc((byte) 11, (byte) 11, this.f600a.size()));
            for (Map.Entry<String, String> entry : this.f600a.entrySet()) {
                jdVar.a(entry.getKey());
                jdVar.a(entry.getValue());
            }
            jdVar.d();
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public void c(boolean z11) {
        this.f599a.set(2, z11);
    }

    public void d(boolean z11) {
        this.f599a.set(3, z11);
    }

    public boolean e() {
        return this.f599a.get(0);
    }

    public hx a(String str) {
        this.f603b = str;
        return this;
    }

    public void b(boolean z11) {
        this.f599a.set(1, z11);
    }

    public boolean c() {
        return this.f603b != null;
    }

    public boolean d() {
        return this.f605c != null;
    }

    public hx a(short s11) {
        this.f601a = s11;
        c(true);
        return this;
    }

    public boolean b() {
        return this.f596a != null;
    }

    public void a() {
        if (this.f603b == null) {
            throw new je("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f605c != null) {
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
                    a();
                    return;
                }
                throw new je("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 11) {
                        this.f598a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f596a = hwVar;
                        hwVar.a(jdVar);
                        continue;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f603b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f605c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 10) {
                        this.f595a = jdVar.mo6156a();
                        a(true);
                        break;
                    }
                    break;
                case 6:
                    if (b11 == 11) {
                        this.f606d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f607e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 12) {
                        ik ikVar = new ik();
                        this.f597a = ikVar;
                        ikVar.a(jdVar);
                        continue;
                    }
                    break;
                case 9:
                    if (b11 == 11) {
                        this.f608f = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 10:
                    if (b11 == 11) {
                        this.f609g = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 11:
                    if (b11 == 2) {
                        this.f602a = jdVar.mo6167a();
                        b(true);
                        continue;
                    }
                    break;
                case 12:
                    if (b11 == 11) {
                        this.f610h = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 13:
                    if (b11 == 11) {
                        this.f611i = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 14:
                    if (b11 == 11) {
                        this.f612j = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 15:
                    if (b11 == 6) {
                        this.f601a = jdVar.mo6164a();
                        c(true);
                        continue;
                    }
                    break;
                case 16:
                    if (b11 == 6) {
                        this.f604b = jdVar.mo6164a();
                        d(true);
                        continue;
                    }
                    break;
                case 20:
                    if (b11 == 11) {
                        this.f613k = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 21:
                    if (b11 == 11) {
                        this.f614l = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 22:
                    if (b11 == 8) {
                        this.f594a = jdVar.mo6155a();
                        e(true);
                        break;
                    }
                    break;
                case 23:
                    if (b11 == 13) {
                        jc mo6159a = jdVar.mo6159a();
                        this.f600a = new HashMap(mo6159a.f845a * 2);
                        for (int i11 = 0; i11 < mo6159a.f845a; i11++) {
                            this.f600a.put(jdVar.mo6162a(), jdVar.mo6162a());
                        }
                        jdVar.h();
                        break;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public void a(boolean z11) {
        this.f599a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6058a() {
        return this.f598a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6059a(hx hxVar) {
        if (hxVar == null) {
            return false;
        }
        boolean m6058a = m6058a();
        boolean m6058a2 = hxVar.m6058a();
        if ((m6058a || m6058a2) && !(m6058a && m6058a2 && this.f598a.equals(hxVar.f598a))) {
            return false;
        }
        boolean b11 = b();
        boolean b12 = hxVar.b();
        if ((b11 || b12) && !(b11 && b12 && this.f596a.m6057a(hxVar.f596a))) {
            return false;
        }
        boolean c11 = c();
        boolean c12 = hxVar.c();
        if ((c11 || c12) && !(c11 && c12 && this.f603b.equals(hxVar.f603b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = hxVar.d();
        if (((d11 || d12) && !(d11 && d12 && this.f605c.equals(hxVar.f605c))) || this.f595a != hxVar.f595a) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = hxVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f606d.equals(hxVar.f606d))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = hxVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f607e.equals(hxVar.f607e))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = hxVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f597a.m6126a(hxVar.f597a))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = hxVar.i();
        if ((i11 || i12) && !(i11 && i12 && this.f608f.equals(hxVar.f608f))) {
            return false;
        }
        boolean j11 = j();
        boolean j12 = hxVar.j();
        if ((j11 || j12) && !(j11 && j12 && this.f609g.equals(hxVar.f609g))) {
            return false;
        }
        boolean k11 = k();
        boolean k12 = hxVar.k();
        if ((k11 || k12) && !(k11 && k12 && this.f602a == hxVar.f602a)) {
            return false;
        }
        boolean l11 = l();
        boolean l12 = hxVar.l();
        if ((l11 || l12) && !(l11 && l12 && this.f610h.equals(hxVar.f610h))) {
            return false;
        }
        boolean m11 = m();
        boolean m12 = hxVar.m();
        if ((m11 || m12) && !(m11 && m12 && this.f611i.equals(hxVar.f611i))) {
            return false;
        }
        boolean n11 = n();
        boolean n12 = hxVar.n();
        if ((n11 || n12) && !(n11 && n12 && this.f612j.equals(hxVar.f612j))) {
            return false;
        }
        boolean o11 = o();
        boolean o12 = hxVar.o();
        if ((o11 || o12) && !(o11 && o12 && this.f601a == hxVar.f601a)) {
            return false;
        }
        boolean p11 = p();
        boolean p12 = hxVar.p();
        if ((p11 || p12) && !(p11 && p12 && this.f604b == hxVar.f604b)) {
            return false;
        }
        boolean q11 = q();
        boolean q12 = hxVar.q();
        if ((q11 || q12) && !(q11 && q12 && this.f613k.equals(hxVar.f613k))) {
            return false;
        }
        boolean r11 = r();
        boolean r12 = hxVar.r();
        if ((r11 || r12) && !(r11 && r12 && this.f614l.equals(hxVar.f614l))) {
            return false;
        }
        boolean s11 = s();
        boolean s12 = hxVar.s();
        if ((s11 || s12) && !(s11 && s12 && this.f594a == hxVar.f594a)) {
            return false;
        }
        boolean t11 = t();
        boolean t12 = hxVar.t();
        if (t11 || t12) {
            return t11 && t12 && this.f600a.equals(hxVar.f600a);
        }
        return true;
    }
}
