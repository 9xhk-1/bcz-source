package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class io implements is<io, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f802a;

    /* renamed from: a, reason: collision with other field name */
    public hw f803a;

    /* renamed from: a, reason: collision with other field name */
    public String f804a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f805a = new BitSet(3);

    /* renamed from: b, reason: collision with other field name */
    public long f806b;

    /* renamed from: b, reason: collision with other field name */
    public String f807b;

    /* renamed from: c, reason: collision with other field name */
    public long f808c;

    /* renamed from: c, reason: collision with other field name */
    public String f809c;

    /* renamed from: d, reason: collision with other field name */
    public String f810d;

    /* renamed from: e, reason: collision with other field name */
    public String f811e;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f801a = new ji("XmPushActionUnRegistrationResult");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46121a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f46122b = new ja("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f46123c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f46124d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f46125e = new ja("", (byte) 10, 6);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f46126f = new ja("", (byte) 11, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f46127g = new ja("", (byte) 11, 8);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f46128h = new ja("", (byte) 10, 9);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f46129i = new ja("", (byte) 10, 10);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(io ioVar) {
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        int a19;
        if (!getClass().equals(ioVar.getClass())) {
            return getClass().getName().compareTo(ioVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6142a()).compareTo(Boolean.valueOf(ioVar.m6142a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6142a() && (a19 = it.a(this.f804a, ioVar.f804a)) != 0) {
            return a19;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ioVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a18 = it.a(this.f803a, ioVar.f803a)) != 0) {
            return a18;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ioVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a17 = it.a(this.f807b, ioVar.f807b)) != 0) {
            return a17;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ioVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a16 = it.a(this.f809c, ioVar.f809c)) != 0) {
            return a16;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ioVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a15 = it.a(this.f802a, ioVar.f802a)) != 0) {
            return a15;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ioVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a14 = it.a(this.f810d, ioVar.f810d)) != 0) {
            return a14;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ioVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a13 = it.a(this.f811e, ioVar.f811e)) != 0) {
            return a13;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ioVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a12 = it.a(this.f806b, ioVar.f806b)) != 0) {
            return a12;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ioVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!i() || (a11 = it.a(this.f808c, ioVar.f808c)) == 0) {
            return 0;
        }
        return a11;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6141a();
        jdVar.a(f801a);
        if (this.f804a != null && m6142a()) {
            jdVar.a(f46121a);
            jdVar.a(this.f804a);
            jdVar.b();
        }
        if (this.f803a != null && b()) {
            jdVar.a(f46122b);
            this.f803a.b(jdVar);
            jdVar.b();
        }
        if (this.f807b != null) {
            jdVar.a(f46123c);
            jdVar.a(this.f807b);
            jdVar.b();
        }
        if (this.f809c != null) {
            jdVar.a(f46124d);
            jdVar.a(this.f809c);
            jdVar.b();
        }
        jdVar.a(f46125e);
        jdVar.a(this.f802a);
        jdVar.b();
        if (this.f810d != null && f()) {
            jdVar.a(f46126f);
            jdVar.a(this.f810d);
            jdVar.b();
        }
        if (this.f811e != null && g()) {
            jdVar.a(f46127g);
            jdVar.a(this.f811e);
            jdVar.b();
        }
        if (h()) {
            jdVar.a(f46128h);
            jdVar.a(this.f806b);
            jdVar.b();
        }
        if (i()) {
            jdVar.a(f46129i);
            jdVar.a(this.f808c);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public void c(boolean z11) {
        this.f805a.set(2, z11);
    }

    public boolean d() {
        return this.f809c != null;
    }

    public boolean e() {
        return this.f805a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof io)) {
            return m6143a((io) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f810d != null;
    }

    public boolean g() {
        return this.f811e != null;
    }

    public boolean h() {
        return this.f805a.get(1);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f805a.get(2);
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("XmPushActionUnRegistrationResult(");
        boolean z12 = false;
        if (m6142a()) {
            sb2.append("debug:");
            String str = this.f804a;
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
            hw hwVar = this.f803a;
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
        String str2 = this.f807b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("appId:");
        String str3 = this.f809c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("errorCode:");
        sb2.append(this.f802a);
        if (f()) {
            sb2.append(j2.O);
            sb2.append("reason:");
            String str4 = this.f810d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str5 = this.f811e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("unRegisteredAt:");
            sb2.append(this.f806b);
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("costTime:");
            sb2.append(this.f808c);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public String a() {
        return this.f811e;
    }

    public void b(boolean z11) {
        this.f805a.set(1, z11);
    }

    public boolean c() {
        return this.f807b != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6141a() {
        if (this.f807b == null) {
            throw new je("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f809c != null) {
            return;
        }
        throw new je("Required field 'appId' was not present! Struct: " + toString());
    }

    public boolean b() {
        return this.f803a != null;
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
                    m6141a();
                    return;
                }
                throw new je("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 11) {
                        this.f804a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f803a = hwVar;
                        hwVar.a(jdVar);
                        break;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f807b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f809c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 10) {
                        this.f802a = jdVar.mo6156a();
                        a(true);
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f810d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 11) {
                        this.f811e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 9:
                    if (b11 == 10) {
                        this.f806b = jdVar.mo6156a();
                        b(true);
                        continue;
                    }
                    break;
                case 10:
                    if (b11 == 10) {
                        this.f808c = jdVar.mo6156a();
                        c(true);
                        continue;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public void a(boolean z11) {
        this.f805a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6142a() {
        return this.f804a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6143a(io ioVar) {
        if (ioVar == null) {
            return false;
        }
        boolean m6142a = m6142a();
        boolean m6142a2 = ioVar.m6142a();
        if ((m6142a || m6142a2) && !(m6142a && m6142a2 && this.f804a.equals(ioVar.f804a))) {
            return false;
        }
        boolean b11 = b();
        boolean b12 = ioVar.b();
        if ((b11 || b12) && !(b11 && b12 && this.f803a.m6057a(ioVar.f803a))) {
            return false;
        }
        boolean c11 = c();
        boolean c12 = ioVar.c();
        if ((c11 || c12) && !(c11 && c12 && this.f807b.equals(ioVar.f807b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = ioVar.d();
        if (((d11 || d12) && !(d11 && d12 && this.f809c.equals(ioVar.f809c))) || this.f802a != ioVar.f802a) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = ioVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f810d.equals(ioVar.f810d))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = ioVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f811e.equals(ioVar.f811e))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = ioVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f806b == ioVar.f806b)) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = ioVar.i();
        if (i11 || i12) {
            return i11 && i12 && this.f808c == ioVar.f808c;
        }
        return true;
    }
}
