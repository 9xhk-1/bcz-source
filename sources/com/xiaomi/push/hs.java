package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class hs implements is<hs, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f540a;

    /* renamed from: a, reason: collision with other field name */
    public long f541a;

    /* renamed from: a, reason: collision with other field name */
    public String f542a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f543a = new BitSet(6);

    /* renamed from: a, reason: collision with other field name */
    public boolean f544a;

    /* renamed from: b, reason: collision with other field name */
    public int f545b;

    /* renamed from: b, reason: collision with other field name */
    public boolean f546b;

    /* renamed from: c, reason: collision with other field name */
    public int f547c;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f539a = new ji("OnlineConfigItem");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45896a = new ja("", (byte) 8, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45897b = new ja("", (byte) 8, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f45898c = new ja("", (byte) 2, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f45899d = new ja("", (byte) 8, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f45900e = new ja("", (byte) 10, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f45901f = new ja("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f45902g = new ja("", (byte) 2, 7);

    public int a() {
        return this.f540a;
    }

    public int b() {
        return this.f545b;
    }

    public int c() {
        return this.f547c;
    }

    public void d(boolean z11) {
        this.f543a.set(3, z11);
    }

    public void e(boolean z11) {
        this.f543a.set(4, z11);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hs)) {
            return m6034a((hs) obj);
        }
        return false;
    }

    public void f(boolean z11) {
        this.f543a.set(5, z11);
    }

    public boolean g() {
        return this.f546b;
    }

    public boolean h() {
        return this.f543a.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("OnlineConfigItem(");
        boolean z12 = false;
        if (m6033a()) {
            sb2.append("key:");
            sb2.append(this.f540a);
            z11 = false;
        } else {
            z11 = true;
        }
        if (m6035b()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("type:");
            sb2.append(this.f545b);
            z11 = false;
        }
        if (m6036c()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("clear:");
            sb2.append(this.f544a);
            z11 = false;
        }
        if (d()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("intValue:");
            sb2.append(this.f547c);
            z11 = false;
        }
        if (e()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("longValue:");
            sb2.append(this.f541a);
            z11 = false;
        }
        if (f()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("stringValue:");
            String str = this.f542a;
            if (str == null) {
                str = "null";
            }
            sb2.append(str);
        } else {
            z12 = z11;
        }
        if (h()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("boolValue:");
            sb2.append(this.f546b);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hs hsVar) {
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        if (!getClass().equals(hsVar.getClass())) {
            return getClass().getName().compareTo(hsVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6033a()).compareTo(Boolean.valueOf(hsVar.m6033a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6033a() && (a17 = it.a(this.f540a, hsVar.f540a)) != 0) {
            return a17;
        }
        int compareTo2 = Boolean.valueOf(m6035b()).compareTo(Boolean.valueOf(hsVar.m6035b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m6035b() && (a16 = it.a(this.f545b, hsVar.f545b)) != 0) {
            return a16;
        }
        int compareTo3 = Boolean.valueOf(m6036c()).compareTo(Boolean.valueOf(hsVar.m6036c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m6036c() && (a15 = it.a(this.f544a, hsVar.f544a)) != 0) {
            return a15;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hsVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a14 = it.a(this.f547c, hsVar.f547c)) != 0) {
            return a14;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hsVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a13 = it.a(this.f541a, hsVar.f541a)) != 0) {
            return a13;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hsVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a12 = it.a(this.f542a, hsVar.f542a)) != 0) {
            return a12;
        }
        int compareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hsVar.h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!h() || (a11 = it.a(this.f546b, hsVar.f546b)) == 0) {
            return 0;
        }
        return a11;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6032a();
        jdVar.a(f539a);
        if (m6033a()) {
            jdVar.a(f45896a);
            jdVar.mo6166a(this.f540a);
            jdVar.b();
        }
        if (m6035b()) {
            jdVar.a(f45897b);
            jdVar.mo6166a(this.f545b);
            jdVar.b();
        }
        if (m6036c()) {
            jdVar.a(f45898c);
            jdVar.a(this.f544a);
            jdVar.b();
        }
        if (d()) {
            jdVar.a(f45899d);
            jdVar.mo6166a(this.f547c);
            jdVar.b();
        }
        if (e()) {
            jdVar.a(f45900e);
            jdVar.a(this.f541a);
            jdVar.b();
        }
        if (this.f542a != null && f()) {
            jdVar.a(f45901f);
            jdVar.a(this.f542a);
            jdVar.b();
        }
        if (h()) {
            jdVar.a(f45902g);
            jdVar.a(this.f546b);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public void c(boolean z11) {
        this.f543a.set(2, z11);
    }

    public boolean d() {
        return this.f543a.get(3);
    }

    public boolean e() {
        return this.f543a.get(4);
    }

    public boolean f() {
        return this.f542a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m6030a() {
        return this.f541a;
    }

    public void b(boolean z11) {
        this.f543a.set(1, z11);
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m6036c() {
        return this.f543a.get(2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m6031a() {
        return this.f542a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6035b() {
        return this.f543a.get(1);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6032a() {
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                m6032a();
                return;
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 8) {
                        this.f540a = jdVar.mo6155a();
                        a(true);
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 8) {
                        this.f545b = jdVar.mo6155a();
                        b(true);
                        continue;
                    }
                    break;
                case 3:
                    if (b11 == 2) {
                        this.f544a = jdVar.mo6167a();
                        c(true);
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 8) {
                        this.f547c = jdVar.mo6155a();
                        d(true);
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 10) {
                        this.f541a = jdVar.mo6156a();
                        e(true);
                        break;
                    }
                    break;
                case 6:
                    if (b11 == 11) {
                        this.f542a = jdVar.mo6162a();
                        break;
                    }
                    break;
                case 7:
                    if (b11 == 2) {
                        this.f546b = jdVar.mo6167a();
                        f(true);
                        continue;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public void a(boolean z11) {
        this.f543a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6033a() {
        return this.f543a.get(0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6034a(hs hsVar) {
        if (hsVar == null) {
            return false;
        }
        boolean m6033a = m6033a();
        boolean m6033a2 = hsVar.m6033a();
        if ((m6033a || m6033a2) && !(m6033a && m6033a2 && this.f540a == hsVar.f540a)) {
            return false;
        }
        boolean m6035b = m6035b();
        boolean m6035b2 = hsVar.m6035b();
        if ((m6035b || m6035b2) && !(m6035b && m6035b2 && this.f545b == hsVar.f545b)) {
            return false;
        }
        boolean m6036c = m6036c();
        boolean m6036c2 = hsVar.m6036c();
        if ((m6036c || m6036c2) && !(m6036c && m6036c2 && this.f544a == hsVar.f544a)) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = hsVar.d();
        if ((d11 || d12) && !(d11 && d12 && this.f547c == hsVar.f547c)) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = hsVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f541a == hsVar.f541a)) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = hsVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f542a.equals(hsVar.f542a))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = hsVar.h();
        if (h11 || h12) {
            return h11 && h12 && this.f546b == hsVar.f546b;
        }
        return true;
    }
}
