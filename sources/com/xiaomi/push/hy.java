package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class hy implements is<hy, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public hw f617a;

    /* renamed from: a, reason: collision with other field name */
    public String f618a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f620a;

    /* renamed from: b, reason: collision with other field name */
    public String f621b;

    /* renamed from: c, reason: collision with other field name */
    public String f622c;

    /* renamed from: d, reason: collision with other field name */
    public String f623d;

    /* renamed from: e, reason: collision with other field name */
    public String f624e;

    /* renamed from: f, reason: collision with other field name */
    public String f625f;

    /* renamed from: g, reason: collision with other field name */
    public String f626g;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f615a = new ji("XmPushActionAckNotification");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45963a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45964b = new ja("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f45965c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f45966d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f45967e = new ja("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f45968f = new ja("", (byte) 10, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f45969g = new ja("", (byte) 11, 8);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f45970h = new ja("", (byte) 13, 9);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f45971i = new ja("", (byte) 11, 10);

    /* renamed from: j, reason: collision with root package name */
    private static final ja f45972j = new ja("", (byte) 11, 11);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f619a = new BitSet(1);

    /* renamed from: a, reason: collision with other field name */
    public long f616a = 0;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hy hyVar) {
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
        if (!getClass().equals(hyVar.getClass())) {
            return getClass().getName().compareTo(hyVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6062a()).compareTo(Boolean.valueOf(hyVar.m6062a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6062a() && (a21 = it.a(this.f618a, hyVar.f618a)) != 0) {
            return a21;
        }
        int compareTo2 = Boolean.valueOf(m6064b()).compareTo(Boolean.valueOf(hyVar.m6064b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m6064b() && (a19 = it.a(this.f617a, hyVar.f617a)) != 0) {
            return a19;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hyVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a18 = it.a(this.f621b, hyVar.f621b)) != 0) {
            return a18;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hyVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a17 = it.a(this.f622c, hyVar.f622c)) != 0) {
            return a17;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hyVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a16 = it.a(this.f623d, hyVar.f623d)) != 0) {
            return a16;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hyVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a15 = it.a(this.f616a, hyVar.f616a)) != 0) {
            return a15;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hyVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a14 = it.a(this.f624e, hyVar.f624e)) != 0) {
            return a14;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hyVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a13 = it.a(this.f620a, hyVar.f620a)) != 0) {
            return a13;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hyVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a12 = it.a(this.f625f, hyVar.f625f)) != 0) {
            return a12;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(hyVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a11 = it.a(this.f626g, hyVar.f626g)) == 0) {
            return 0;
        }
        return a11;
    }

    public hy b(String str) {
        this.f622c = str;
        return this;
    }

    public hy c(String str) {
        this.f623d = str;
        return this;
    }

    public hy d(String str) {
        this.f624e = str;
        return this;
    }

    public hy e(String str) {
        this.f625f = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hy)) {
            return m6063a((hy) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f619a.get(0);
    }

    public boolean g() {
        return this.f624e != null;
    }

    public boolean h() {
        return this.f620a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f625f != null;
    }

    public boolean j() {
        return this.f626g != null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("XmPushActionAckNotification(");
        boolean z12 = false;
        if (m6062a()) {
            sb2.append("debug:");
            String str = this.f618a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (m6064b()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("target:");
            hw hwVar = this.f617a;
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
        String str2 = this.f621b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (d()) {
            sb2.append(j2.O);
            sb2.append("appId:");
            String str3 = this.f622c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (e()) {
            sb2.append(j2.O);
            sb2.append("type:");
            String str4 = this.f623d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (f()) {
            sb2.append(j2.O);
            sb2.append("errorCode:");
            sb2.append(this.f616a);
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("reason:");
            String str5 = this.f624e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("extra:");
            Map<String, String> map = this.f620a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str6 = this.f625f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (j()) {
            sb2.append(j2.O);
            sb2.append("category:");
            String str7 = this.f626g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public hy a(long j11) {
        this.f616a = j11;
        a(true);
        return this;
    }

    public String b() {
        return this.f623d;
    }

    public boolean c() {
        return this.f621b != null;
    }

    public boolean d() {
        return this.f622c != null;
    }

    public boolean e() {
        return this.f623d != null;
    }

    public hy a(hw hwVar) {
        this.f617a = hwVar;
        return this;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6061a();
        jdVar.a(f615a);
        if (this.f618a != null && m6062a()) {
            jdVar.a(f45963a);
            jdVar.a(this.f618a);
            jdVar.b();
        }
        if (this.f617a != null && m6064b()) {
            jdVar.a(f45964b);
            this.f617a.b(jdVar);
            jdVar.b();
        }
        if (this.f621b != null) {
            jdVar.a(f45965c);
            jdVar.a(this.f621b);
            jdVar.b();
        }
        if (this.f622c != null && d()) {
            jdVar.a(f45966d);
            jdVar.a(this.f622c);
            jdVar.b();
        }
        if (this.f623d != null && e()) {
            jdVar.a(f45967e);
            jdVar.a(this.f623d);
            jdVar.b();
        }
        if (f()) {
            jdVar.a(f45968f);
            jdVar.a(this.f616a);
            jdVar.b();
        }
        if (this.f624e != null && g()) {
            jdVar.a(f45969g);
            jdVar.a(this.f624e);
            jdVar.b();
        }
        if (this.f620a != null && h()) {
            jdVar.a(f45970h);
            jdVar.a(new jc((byte) 11, (byte) 11, this.f620a.size()));
            for (Map.Entry<String, String> entry : this.f620a.entrySet()) {
                jdVar.a(entry.getKey());
                jdVar.a(entry.getValue());
            }
            jdVar.d();
            jdVar.b();
        }
        if (this.f625f != null && i()) {
            jdVar.a(f45971i);
            jdVar.a(this.f625f);
            jdVar.b();
        }
        if (this.f626g != null && j()) {
            jdVar.a(f45972j);
            jdVar.a(this.f626g);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public hy a(String str) {
        this.f621b = str;
        return this;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6064b() {
        return this.f617a != null;
    }

    public String a() {
        return this.f621b;
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, String> m6060a() {
        return this.f620a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6061a() {
        if (this.f621b != null) {
            return;
        }
        throw new je("Required field 'id' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                m6061a();
                return;
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 11) {
                        this.f618a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f617a = hwVar;
                        hwVar.a(jdVar);
                        break;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f621b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f622c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 11) {
                        this.f623d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 10) {
                        this.f616a = jdVar.mo6156a();
                        a(true);
                        break;
                    }
                    break;
                case 8:
                    if (b11 == 11) {
                        this.f624e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 9:
                    if (b11 == 13) {
                        jc mo6159a = jdVar.mo6159a();
                        this.f620a = new HashMap(mo6159a.f845a * 2);
                        for (int i11 = 0; i11 < mo6159a.f845a; i11++) {
                            this.f620a.put(jdVar.mo6162a(), jdVar.mo6162a());
                        }
                        jdVar.h();
                        break;
                    }
                    break;
                case 10:
                    if (b11 == 11) {
                        this.f625f = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 11:
                    if (b11 == 11) {
                        this.f626g = jdVar.mo6162a();
                        continue;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public void a(boolean z11) {
        this.f619a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6062a() {
        return this.f618a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6063a(hy hyVar) {
        if (hyVar == null) {
            return false;
        }
        boolean m6062a = m6062a();
        boolean m6062a2 = hyVar.m6062a();
        if ((m6062a || m6062a2) && !(m6062a && m6062a2 && this.f618a.equals(hyVar.f618a))) {
            return false;
        }
        boolean m6064b = m6064b();
        boolean m6064b2 = hyVar.m6064b();
        if ((m6064b || m6064b2) && !(m6064b && m6064b2 && this.f617a.m6057a(hyVar.f617a))) {
            return false;
        }
        boolean c11 = c();
        boolean c12 = hyVar.c();
        if ((c11 || c12) && !(c11 && c12 && this.f621b.equals(hyVar.f621b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = hyVar.d();
        if ((d11 || d12) && !(d11 && d12 && this.f622c.equals(hyVar.f622c))) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = hyVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f623d.equals(hyVar.f623d))) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = hyVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f616a == hyVar.f616a)) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = hyVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f624e.equals(hyVar.f624e))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = hyVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f620a.equals(hyVar.f620a))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = hyVar.i();
        if ((i11 || i12) && !(i11 && i12 && this.f625f.equals(hyVar.f625f))) {
            return false;
        }
        boolean j11 = j();
        boolean j12 = hyVar.j();
        if (j11 || j12) {
            return j11 && j12 && this.f626g.equals(hyVar.f626g);
        }
        return true;
    }
}
