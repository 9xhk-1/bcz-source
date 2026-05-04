package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class ik implements is<ik, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public ht f754a;

    /* renamed from: a, reason: collision with other field name */
    public hw f755a;

    /* renamed from: a, reason: collision with other field name */
    public String f756a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f758a;

    /* renamed from: b, reason: collision with other field name */
    public String f760b;

    /* renamed from: c, reason: collision with other field name */
    public String f761c;

    /* renamed from: d, reason: collision with other field name */
    public String f762d;

    /* renamed from: e, reason: collision with other field name */
    public String f763e;

    /* renamed from: f, reason: collision with other field name */
    public String f764f;

    /* renamed from: g, reason: collision with other field name */
    public String f765g;

    /* renamed from: h, reason: collision with other field name */
    public String f766h;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f753a = new ji("XmPushActionSendMessage");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46080a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f46081b = new ja("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f46082c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f46083d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f46084e = new ja("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f46085f = new ja("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f46086g = new ja("", (byte) 11, 7);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f46087h = new ja("", (byte) 12, 8);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f46088i = new ja("", (byte) 2, 9);

    /* renamed from: j, reason: collision with root package name */
    private static final ja f46089j = new ja("", (byte) 13, 10);

    /* renamed from: k, reason: collision with root package name */
    private static final ja f46090k = new ja("", (byte) 11, 11);

    /* renamed from: l, reason: collision with root package name */
    private static final ja f46091l = new ja("", (byte) 11, 12);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f757a = new BitSet(1);

    /* renamed from: a, reason: collision with other field name */
    public boolean f759a = true;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ik ikVar) {
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
        if (!getClass().equals(ikVar.getClass())) {
            return getClass().getName().compareTo(ikVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6125a()).compareTo(Boolean.valueOf(ikVar.m6125a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6125a() && (a23 = it.a(this.f756a, ikVar.f756a)) != 0) {
            return a23;
        }
        int compareTo2 = Boolean.valueOf(m6127b()).compareTo(Boolean.valueOf(ikVar.m6127b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m6127b() && (a22 = it.a(this.f755a, ikVar.f755a)) != 0) {
            return a22;
        }
        int compareTo3 = Boolean.valueOf(m6128c()).compareTo(Boolean.valueOf(ikVar.m6128c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m6128c() && (a21 = it.a(this.f760b, ikVar.f760b)) != 0) {
            return a21;
        }
        int compareTo4 = Boolean.valueOf(m6129d()).compareTo(Boolean.valueOf(ikVar.m6129d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m6129d() && (a19 = it.a(this.f761c, ikVar.f761c)) != 0) {
            return a19;
        }
        int compareTo5 = Boolean.valueOf(m6130e()).compareTo(Boolean.valueOf(ikVar.m6130e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m6130e() && (a18 = it.a(this.f762d, ikVar.f762d)) != 0) {
            return a18;
        }
        int compareTo6 = Boolean.valueOf(m6131f()).compareTo(Boolean.valueOf(ikVar.m6131f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m6131f() && (a17 = it.a(this.f763e, ikVar.f763e)) != 0) {
            return a17;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ikVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a16 = it.a(this.f764f, ikVar.f764f)) != 0) {
            return a16;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ikVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a15 = it.a(this.f754a, ikVar.f754a)) != 0) {
            return a15;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ikVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a14 = it.a(this.f759a, ikVar.f759a)) != 0) {
            return a14;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ikVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a13 = it.a(this.f758a, ikVar.f758a)) != 0) {
            return a13;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ikVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a12 = it.a(this.f765g, ikVar.f765g)) != 0) {
            return a12;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(ikVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!l() || (a11 = it.a(this.f766h, ikVar.f766h)) == 0) {
            return 0;
        }
        return a11;
    }

    public String b() {
        return this.f761c;
    }

    public String c() {
        return this.f763e;
    }

    public String d() {
        return this.f764f;
    }

    public String e() {
        return this.f765g;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ik)) {
            return m6126a((ik) obj);
        }
        return false;
    }

    public String f() {
        return this.f766h;
    }

    public boolean g() {
        return this.f764f != null;
    }

    public boolean h() {
        return this.f754a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f757a.get(0);
    }

    public boolean j() {
        return this.f758a != null;
    }

    public boolean k() {
        return this.f765g != null;
    }

    public boolean l() {
        return this.f766h != null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("XmPushActionSendMessage(");
        boolean z12 = false;
        if (m6125a()) {
            sb2.append("debug:");
            String str = this.f756a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (m6127b()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("target:");
            hw hwVar = this.f755a;
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
        String str2 = this.f760b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("appId:");
        String str3 = this.f761c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (m6130e()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str4 = this.f762d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (m6131f()) {
            sb2.append(j2.O);
            sb2.append("topic:");
            String str5 = this.f763e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("aliasName:");
            String str6 = this.f764f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("message:");
            ht htVar = this.f754a;
            if (htVar == null) {
                sb2.append("null");
            } else {
                sb2.append(htVar);
            }
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("needAck:");
            sb2.append(this.f759a);
        }
        if (j()) {
            sb2.append(j2.O);
            sb2.append("params:");
            Map<String, String> map = this.f758a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        }
        if (k()) {
            sb2.append(j2.O);
            sb2.append("category:");
            String str7 = this.f765g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (l()) {
            sb2.append(j2.O);
            sb2.append("userAccount:");
            String str8 = this.f766h;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public ht a() {
        return this.f754a;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6124a();
        jdVar.a(f753a);
        if (this.f756a != null && m6125a()) {
            jdVar.a(f46080a);
            jdVar.a(this.f756a);
            jdVar.b();
        }
        if (this.f755a != null && m6127b()) {
            jdVar.a(f46081b);
            this.f755a.b(jdVar);
            jdVar.b();
        }
        if (this.f760b != null) {
            jdVar.a(f46082c);
            jdVar.a(this.f760b);
            jdVar.b();
        }
        if (this.f761c != null) {
            jdVar.a(f46083d);
            jdVar.a(this.f761c);
            jdVar.b();
        }
        if (this.f762d != null && m6130e()) {
            jdVar.a(f46084e);
            jdVar.a(this.f762d);
            jdVar.b();
        }
        if (this.f763e != null && m6131f()) {
            jdVar.a(f46085f);
            jdVar.a(this.f763e);
            jdVar.b();
        }
        if (this.f764f != null && g()) {
            jdVar.a(f46086g);
            jdVar.a(this.f764f);
            jdVar.b();
        }
        if (this.f754a != null && h()) {
            jdVar.a(f46087h);
            this.f754a.b(jdVar);
            jdVar.b();
        }
        if (i()) {
            jdVar.a(f46088i);
            jdVar.a(this.f759a);
            jdVar.b();
        }
        if (this.f758a != null && j()) {
            jdVar.a(f46089j);
            jdVar.a(new jc((byte) 11, (byte) 11, this.f758a.size()));
            for (Map.Entry<String, String> entry : this.f758a.entrySet()) {
                jdVar.a(entry.getKey());
                jdVar.a(entry.getValue());
            }
            jdVar.d();
            jdVar.b();
        }
        if (this.f765g != null && k()) {
            jdVar.a(f46090k);
            jdVar.a(this.f765g);
            jdVar.b();
        }
        if (this.f766h != null && l()) {
            jdVar.a(f46091l);
            jdVar.a(this.f766h);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m6128c() {
        return this.f760b != null;
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m6129d() {
        return this.f761c != null;
    }

    /* renamed from: e, reason: collision with other method in class */
    public boolean m6130e() {
        return this.f762d != null;
    }

    /* renamed from: f, reason: collision with other method in class */
    public boolean m6131f() {
        return this.f763e != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m6123a() {
        return this.f760b;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6127b() {
        return this.f755a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6124a() {
        if (this.f760b == null) {
            throw new je("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f761c != null) {
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
                m6124a();
                return;
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 11) {
                        this.f756a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f755a = hwVar;
                        hwVar.a(jdVar);
                        continue;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f760b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f761c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 11) {
                        this.f762d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 11) {
                        this.f763e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f764f = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 12) {
                        ht htVar = new ht();
                        this.f754a = htVar;
                        htVar.a(jdVar);
                        continue;
                    }
                    break;
                case 9:
                    if (b11 == 2) {
                        this.f759a = jdVar.mo6167a();
                        a(true);
                        continue;
                    }
                    break;
                case 10:
                    if (b11 == 13) {
                        jc mo6159a = jdVar.mo6159a();
                        this.f758a = new HashMap(mo6159a.f845a * 2);
                        for (int i11 = 0; i11 < mo6159a.f845a; i11++) {
                            this.f758a.put(jdVar.mo6162a(), jdVar.mo6162a());
                        }
                        jdVar.h();
                        break;
                    }
                    break;
                case 11:
                    if (b11 == 11) {
                        this.f765g = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 12:
                    if (b11 == 11) {
                        this.f766h = jdVar.mo6162a();
                        continue;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public void a(boolean z11) {
        this.f757a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6125a() {
        return this.f756a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6126a(ik ikVar) {
        if (ikVar == null) {
            return false;
        }
        boolean m6125a = m6125a();
        boolean m6125a2 = ikVar.m6125a();
        if ((m6125a || m6125a2) && !(m6125a && m6125a2 && this.f756a.equals(ikVar.f756a))) {
            return false;
        }
        boolean m6127b = m6127b();
        boolean m6127b2 = ikVar.m6127b();
        if ((m6127b || m6127b2) && !(m6127b && m6127b2 && this.f755a.m6057a(ikVar.f755a))) {
            return false;
        }
        boolean m6128c = m6128c();
        boolean m6128c2 = ikVar.m6128c();
        if ((m6128c || m6128c2) && !(m6128c && m6128c2 && this.f760b.equals(ikVar.f760b))) {
            return false;
        }
        boolean m6129d = m6129d();
        boolean m6129d2 = ikVar.m6129d();
        if ((m6129d || m6129d2) && !(m6129d && m6129d2 && this.f761c.equals(ikVar.f761c))) {
            return false;
        }
        boolean m6130e = m6130e();
        boolean m6130e2 = ikVar.m6130e();
        if ((m6130e || m6130e2) && !(m6130e && m6130e2 && this.f762d.equals(ikVar.f762d))) {
            return false;
        }
        boolean m6131f = m6131f();
        boolean m6131f2 = ikVar.m6131f();
        if ((m6131f || m6131f2) && !(m6131f && m6131f2 && this.f763e.equals(ikVar.f763e))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = ikVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f764f.equals(ikVar.f764f))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = ikVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f754a.m6040a(ikVar.f754a))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = ikVar.i();
        if ((i11 || i12) && !(i11 && i12 && this.f759a == ikVar.f759a)) {
            return false;
        }
        boolean j11 = j();
        boolean j12 = ikVar.j();
        if ((j11 || j12) && !(j11 && j12 && this.f758a.equals(ikVar.f758a))) {
            return false;
        }
        boolean k11 = k();
        boolean k12 = ikVar.k();
        if ((k11 || k12) && !(k11 && k12 && this.f765g.equals(ikVar.f765g))) {
            return false;
        }
        boolean l11 = l();
        boolean l12 = ikVar.l();
        if (l11 || l12) {
            return l11 && l12 && this.f766h.equals(ikVar.f766h);
        }
        return true;
    }
}
