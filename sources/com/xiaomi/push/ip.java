package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class ip implements is<ip, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public hw f813a;

    /* renamed from: a, reason: collision with other field name */
    public String f814a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f815a;

    /* renamed from: b, reason: collision with other field name */
    public String f816b;

    /* renamed from: c, reason: collision with other field name */
    public String f817c;

    /* renamed from: d, reason: collision with other field name */
    public String f818d;

    /* renamed from: e, reason: collision with other field name */
    public String f819e;

    /* renamed from: f, reason: collision with other field name */
    public String f820f;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f812a = new ji("XmPushActionUnSubscription");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46130a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f46131b = new ja("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f46132c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f46133d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f46134e = new ja("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f46135f = new ja("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f46136g = new ja("", (byte) 11, 7);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f46137h = new ja("", (byte) 15, 8);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ip ipVar) {
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        if (!getClass().equals(ipVar.getClass())) {
            return getClass().getName().compareTo(ipVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6144a()).compareTo(Boolean.valueOf(ipVar.m6144a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6144a() && (a18 = it.a(this.f814a, ipVar.f814a)) != 0) {
            return a18;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ipVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a17 = it.a(this.f813a, ipVar.f813a)) != 0) {
            return a17;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ipVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a16 = it.a(this.f816b, ipVar.f816b)) != 0) {
            return a16;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ipVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a15 = it.a(this.f817c, ipVar.f817c)) != 0) {
            return a15;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ipVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a14 = it.a(this.f818d, ipVar.f818d)) != 0) {
            return a14;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ipVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a13 = it.a(this.f819e, ipVar.f819e)) != 0) {
            return a13;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ipVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a12 = it.a(this.f820f, ipVar.f820f)) != 0) {
            return a12;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ipVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!h() || (a11 = it.a(this.f815a, ipVar.f815a)) == 0) {
            return 0;
        }
        return a11;
    }

    public ip b(String str) {
        this.f817c = str;
        return this;
    }

    public ip c(String str) {
        this.f818d = str;
        return this;
    }

    public ip d(String str) {
        this.f819e = str;
        return this;
    }

    public ip e(String str) {
        this.f820f = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ip)) {
            return m6145a((ip) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f819e != null;
    }

    public boolean g() {
        return this.f820f != null;
    }

    public boolean h() {
        return this.f815a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("XmPushActionUnSubscription(");
        boolean z12 = false;
        if (m6144a()) {
            sb2.append("debug:");
            String str = this.f814a;
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
            hw hwVar = this.f813a;
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
        String str2 = this.f816b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("appId:");
        String str3 = this.f817c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("topic:");
        String str4 = this.f818d;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        if (f()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str5 = this.f819e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("category:");
            String str6 = this.f820f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("aliases:");
            List<String> list = this.f815a;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public ip a(String str) {
        this.f816b = str;
        return this;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        a();
        jdVar.a(f812a);
        if (this.f814a != null && m6144a()) {
            jdVar.a(f46130a);
            jdVar.a(this.f814a);
            jdVar.b();
        }
        if (this.f813a != null && b()) {
            jdVar.a(f46131b);
            this.f813a.b(jdVar);
            jdVar.b();
        }
        if (this.f816b != null) {
            jdVar.a(f46132c);
            jdVar.a(this.f816b);
            jdVar.b();
        }
        if (this.f817c != null) {
            jdVar.a(f46133d);
            jdVar.a(this.f817c);
            jdVar.b();
        }
        if (this.f818d != null) {
            jdVar.a(f46134e);
            jdVar.a(this.f818d);
            jdVar.b();
        }
        if (this.f819e != null && f()) {
            jdVar.a(f46135f);
            jdVar.a(this.f819e);
            jdVar.b();
        }
        if (this.f820f != null && g()) {
            jdVar.a(f46136g);
            jdVar.a(this.f820f);
            jdVar.b();
        }
        if (this.f815a != null && h()) {
            jdVar.a(f46137h);
            jdVar.a(new jb((byte) 11, this.f815a.size()));
            Iterator<String> it = this.f815a.iterator();
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
        return this.f816b != null;
    }

    public boolean d() {
        return this.f817c != null;
    }

    public boolean e() {
        return this.f818d != null;
    }

    public void a() {
        if (this.f816b == null) {
            throw new je("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f817c == null) {
            throw new je("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f818d != null) {
            return;
        }
        throw new je("Required field 'topic' was not present! Struct: " + toString());
    }

    public boolean b() {
        return this.f813a != null;
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
                        this.f814a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f813a = hwVar;
                        hwVar.a(jdVar);
                        break;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f816b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f817c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 11) {
                        this.f818d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 11) {
                        this.f819e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f820f = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 15) {
                        jb mo6158a = jdVar.mo6158a();
                        this.f815a = new ArrayList(mo6158a.f844a);
                        for (int i11 = 0; i11 < mo6158a.f844a; i11++) {
                            this.f815a.add(jdVar.mo6162a());
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
    public boolean m6144a() {
        return this.f814a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6145a(ip ipVar) {
        if (ipVar == null) {
            return false;
        }
        boolean m6144a = m6144a();
        boolean m6144a2 = ipVar.m6144a();
        if ((m6144a || m6144a2) && !(m6144a && m6144a2 && this.f814a.equals(ipVar.f814a))) {
            return false;
        }
        boolean b11 = b();
        boolean b12 = ipVar.b();
        if ((b11 || b12) && !(b11 && b12 && this.f813a.m6057a(ipVar.f813a))) {
            return false;
        }
        boolean c11 = c();
        boolean c12 = ipVar.c();
        if ((c11 || c12) && !(c11 && c12 && this.f816b.equals(ipVar.f816b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = ipVar.d();
        if ((d11 || d12) && !(d11 && d12 && this.f817c.equals(ipVar.f817c))) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = ipVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f818d.equals(ipVar.f818d))) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = ipVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f819e.equals(ipVar.f819e))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = ipVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f820f.equals(ipVar.f820f))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = ipVar.h();
        if (h11 || h12) {
            return h11 && h12 && this.f815a.equals(ipVar.f815a);
        }
        return true;
    }
}
