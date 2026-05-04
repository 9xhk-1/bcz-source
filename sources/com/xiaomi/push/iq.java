package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class iq implements is<iq, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f822a;

    /* renamed from: a, reason: collision with other field name */
    public hw f823a;

    /* renamed from: a, reason: collision with other field name */
    public String f824a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f825a = new BitSet(1);

    /* renamed from: b, reason: collision with other field name */
    public String f826b;

    /* renamed from: c, reason: collision with other field name */
    public String f827c;

    /* renamed from: d, reason: collision with other field name */
    public String f828d;

    /* renamed from: e, reason: collision with other field name */
    public String f829e;

    /* renamed from: f, reason: collision with other field name */
    public String f830f;

    /* renamed from: g, reason: collision with other field name */
    public String f831g;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f821a = new ji("XmPushActionUnSubscriptionResult");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46138a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f46139b = new ja("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f46140c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f46141d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f46142e = new ja("", (byte) 10, 6);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f46143f = new ja("", (byte) 11, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f46144g = new ja("", (byte) 11, 8);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f46145h = new ja("", (byte) 11, 9);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f46146i = new ja("", (byte) 11, 10);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iq iqVar) {
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        int a19;
        if (!getClass().equals(iqVar.getClass())) {
            return getClass().getName().compareTo(iqVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6147a()).compareTo(Boolean.valueOf(iqVar.m6147a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6147a() && (a19 = it.a(this.f824a, iqVar.f824a)) != 0) {
            return a19;
        }
        int compareTo2 = Boolean.valueOf(m6149b()).compareTo(Boolean.valueOf(iqVar.m6149b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m6149b() && (a18 = it.a(this.f823a, iqVar.f823a)) != 0) {
            return a18;
        }
        int compareTo3 = Boolean.valueOf(m6150c()).compareTo(Boolean.valueOf(iqVar.m6150c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m6150c() && (a17 = it.a(this.f826b, iqVar.f826b)) != 0) {
            return a17;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iqVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a16 = it.a(this.f827c, iqVar.f827c)) != 0) {
            return a16;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iqVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a15 = it.a(this.f822a, iqVar.f822a)) != 0) {
            return a15;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iqVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a14 = it.a(this.f828d, iqVar.f828d)) != 0) {
            return a14;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(iqVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a13 = it.a(this.f829e, iqVar.f829e)) != 0) {
            return a13;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(iqVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a12 = it.a(this.f830f, iqVar.f830f)) != 0) {
            return a12;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(iqVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!i() || (a11 = it.a(this.f831g, iqVar.f831g)) == 0) {
            return 0;
        }
        return a11;
    }

    public String b() {
        return this.f829e;
    }

    public String c() {
        return this.f831g;
    }

    public boolean d() {
        return this.f827c != null;
    }

    public boolean e() {
        return this.f825a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iq)) {
            return m6148a((iq) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f828d != null;
    }

    public boolean g() {
        return this.f829e != null;
    }

    public boolean h() {
        return this.f830f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f831g != null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z12 = false;
        if (m6147a()) {
            sb2.append("debug:");
            String str = this.f824a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (m6149b()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("target:");
            hw hwVar = this.f823a;
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
        String str2 = this.f826b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (d()) {
            sb2.append(j2.O);
            sb2.append("appId:");
            String str3 = this.f827c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (e()) {
            sb2.append(j2.O);
            sb2.append("errorCode:");
            sb2.append(this.f822a);
        }
        if (f()) {
            sb2.append(j2.O);
            sb2.append("reason:");
            String str4 = this.f828d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("topic:");
            String str5 = this.f829e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str6 = this.f830f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("category:");
            String str7 = this.f831g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public String a() {
        return this.f826b;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6146a();
        jdVar.a(f821a);
        if (this.f824a != null && m6147a()) {
            jdVar.a(f46138a);
            jdVar.a(this.f824a);
            jdVar.b();
        }
        if (this.f823a != null && m6149b()) {
            jdVar.a(f46139b);
            this.f823a.b(jdVar);
            jdVar.b();
        }
        if (this.f826b != null) {
            jdVar.a(f46140c);
            jdVar.a(this.f826b);
            jdVar.b();
        }
        if (this.f827c != null && d()) {
            jdVar.a(f46141d);
            jdVar.a(this.f827c);
            jdVar.b();
        }
        if (e()) {
            jdVar.a(f46142e);
            jdVar.a(this.f822a);
            jdVar.b();
        }
        if (this.f828d != null && f()) {
            jdVar.a(f46143f);
            jdVar.a(this.f828d);
            jdVar.b();
        }
        if (this.f829e != null && g()) {
            jdVar.a(f46144g);
            jdVar.a(this.f829e);
            jdVar.b();
        }
        if (this.f830f != null && h()) {
            jdVar.a(f46145h);
            jdVar.a(this.f830f);
            jdVar.b();
        }
        if (this.f831g != null && i()) {
            jdVar.a(f46146i);
            jdVar.a(this.f831g);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m6150c() {
        return this.f826b != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6146a() {
        if (this.f826b != null) {
            return;
        }
        throw new je("Required field 'id' was not present! Struct: " + toString());
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6149b() {
        return this.f823a != null;
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                m6146a();
                return;
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 11) {
                        this.f824a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f823a = hwVar;
                        hwVar.a(jdVar);
                        break;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f826b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f827c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 10) {
                        this.f822a = jdVar.mo6156a();
                        a(true);
                        break;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f828d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 11) {
                        this.f829e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 9:
                    if (b11 == 11) {
                        this.f830f = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 10:
                    if (b11 == 11) {
                        this.f831g = jdVar.mo6162a();
                        continue;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public void a(boolean z11) {
        this.f825a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6147a() {
        return this.f824a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6148a(iq iqVar) {
        if (iqVar == null) {
            return false;
        }
        boolean m6147a = m6147a();
        boolean m6147a2 = iqVar.m6147a();
        if ((m6147a || m6147a2) && !(m6147a && m6147a2 && this.f824a.equals(iqVar.f824a))) {
            return false;
        }
        boolean m6149b = m6149b();
        boolean m6149b2 = iqVar.m6149b();
        if ((m6149b || m6149b2) && !(m6149b && m6149b2 && this.f823a.m6057a(iqVar.f823a))) {
            return false;
        }
        boolean m6150c = m6150c();
        boolean m6150c2 = iqVar.m6150c();
        if ((m6150c || m6150c2) && !(m6150c && m6150c2 && this.f826b.equals(iqVar.f826b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = iqVar.d();
        if ((d11 || d12) && !(d11 && d12 && this.f827c.equals(iqVar.f827c))) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = iqVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f822a == iqVar.f822a)) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = iqVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f828d.equals(iqVar.f828d))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = iqVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f829e.equals(iqVar.f829e))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = iqVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f830f.equals(iqVar.f830f))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = iqVar.i();
        if (i11 || i12) {
            return i11 && i12 && this.f831g.equals(iqVar.f831g);
        }
        return true;
    }
}
