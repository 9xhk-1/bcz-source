package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class il implements is<il, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public hw f768a;

    /* renamed from: a, reason: collision with other field name */
    public String f769a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f770a;

    /* renamed from: b, reason: collision with other field name */
    public String f771b;

    /* renamed from: c, reason: collision with other field name */
    public String f772c;

    /* renamed from: d, reason: collision with other field name */
    public String f773d;

    /* renamed from: e, reason: collision with other field name */
    public String f774e;

    /* renamed from: f, reason: collision with other field name */
    public String f775f;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f767a = new ji("XmPushActionSubscription");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46092a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f46093b = new ja("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f46094c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f46095d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f46096e = new ja("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f46097f = new ja("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f46098g = new ja("", (byte) 11, 7);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f46099h = new ja("", (byte) 15, 8);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(il ilVar) {
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        if (!getClass().equals(ilVar.getClass())) {
            return getClass().getName().compareTo(ilVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6132a()).compareTo(Boolean.valueOf(ilVar.m6132a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6132a() && (a18 = it.a(this.f769a, ilVar.f769a)) != 0) {
            return a18;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ilVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a17 = it.a(this.f768a, ilVar.f768a)) != 0) {
            return a17;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ilVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a16 = it.a(this.f771b, ilVar.f771b)) != 0) {
            return a16;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ilVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a15 = it.a(this.f772c, ilVar.f772c)) != 0) {
            return a15;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ilVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a14 = it.a(this.f773d, ilVar.f773d)) != 0) {
            return a14;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ilVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a13 = it.a(this.f774e, ilVar.f774e)) != 0) {
            return a13;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ilVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a12 = it.a(this.f775f, ilVar.f775f)) != 0) {
            return a12;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ilVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!h() || (a11 = it.a(this.f770a, ilVar.f770a)) == 0) {
            return 0;
        }
        return a11;
    }

    public il b(String str) {
        this.f772c = str;
        return this;
    }

    public il c(String str) {
        this.f773d = str;
        return this;
    }

    public il d(String str) {
        this.f774e = str;
        return this;
    }

    public il e(String str) {
        this.f775f = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof il)) {
            return m6133a((il) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f774e != null;
    }

    public boolean g() {
        return this.f775f != null;
    }

    public boolean h() {
        return this.f770a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("XmPushActionSubscription(");
        boolean z12 = false;
        if (m6132a()) {
            sb2.append("debug:");
            String str = this.f769a;
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
            hw hwVar = this.f768a;
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
        String str2 = this.f771b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("appId:");
        String str3 = this.f772c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("topic:");
        String str4 = this.f773d;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        if (f()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str5 = this.f774e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("category:");
            String str6 = this.f775f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("aliases:");
            List<String> list = this.f770a;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public il a(String str) {
        this.f771b = str;
        return this;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        a();
        jdVar.a(f767a);
        if (this.f769a != null && m6132a()) {
            jdVar.a(f46092a);
            jdVar.a(this.f769a);
            jdVar.b();
        }
        if (this.f768a != null && b()) {
            jdVar.a(f46093b);
            this.f768a.b(jdVar);
            jdVar.b();
        }
        if (this.f771b != null) {
            jdVar.a(f46094c);
            jdVar.a(this.f771b);
            jdVar.b();
        }
        if (this.f772c != null) {
            jdVar.a(f46095d);
            jdVar.a(this.f772c);
            jdVar.b();
        }
        if (this.f773d != null) {
            jdVar.a(f46096e);
            jdVar.a(this.f773d);
            jdVar.b();
        }
        if (this.f774e != null && f()) {
            jdVar.a(f46097f);
            jdVar.a(this.f774e);
            jdVar.b();
        }
        if (this.f775f != null && g()) {
            jdVar.a(f46098g);
            jdVar.a(this.f775f);
            jdVar.b();
        }
        if (this.f770a != null && h()) {
            jdVar.a(f46099h);
            jdVar.a(new jb((byte) 11, this.f770a.size()));
            Iterator<String> it = this.f770a.iterator();
            while (it.hasNext()) {
                jdVar.a(it.next());
            }
            jdVar.e();
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public boolean c() {
        return this.f771b != null;
    }

    public boolean d() {
        return this.f772c != null;
    }

    public boolean e() {
        return this.f773d != null;
    }

    public void a() {
        if (this.f771b == null) {
            throw new je("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f772c == null) {
            throw new je("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f773d != null) {
            return;
        }
        throw new je("Required field 'topic' was not present! Struct: " + toString());
    }

    public boolean b() {
        return this.f768a != null;
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                a();
                return;
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 11) {
                        this.f769a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f768a = hwVar;
                        hwVar.a(jdVar);
                        break;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f771b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f772c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 11) {
                        this.f773d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 11) {
                        this.f774e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f775f = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 15) {
                        jb mo6158a = jdVar.mo6158a();
                        this.f770a = new ArrayList(mo6158a.f844a);
                        for (int i11 = 0; i11 < mo6158a.f844a; i11++) {
                            this.f770a.add(jdVar.mo6162a());
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

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6132a() {
        return this.f769a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6133a(il ilVar) {
        if (ilVar == null) {
            return false;
        }
        boolean m6132a = m6132a();
        boolean m6132a2 = ilVar.m6132a();
        if ((m6132a || m6132a2) && !(m6132a && m6132a2 && this.f769a.equals(ilVar.f769a))) {
            return false;
        }
        boolean b11 = b();
        boolean b12 = ilVar.b();
        if ((b11 || b12) && !(b11 && b12 && this.f768a.m6057a(ilVar.f768a))) {
            return false;
        }
        boolean c11 = c();
        boolean c12 = ilVar.c();
        if ((c11 || c12) && !(c11 && c12 && this.f771b.equals(ilVar.f771b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = ilVar.d();
        if ((d11 || d12) && !(d11 && d12 && this.f772c.equals(ilVar.f772c))) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = ilVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f773d.equals(ilVar.f773d))) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = ilVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f774e.equals(ilVar.f774e))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = ilVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f775f.equals(ilVar.f775f))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = ilVar.h();
        if (h11 || h12) {
            return h11 && h12 && this.f770a.equals(ilVar.f770a);
        }
        return true;
    }
}
