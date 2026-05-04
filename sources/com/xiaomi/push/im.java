package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class im implements is<im, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f777a;

    /* renamed from: a, reason: collision with other field name */
    public hw f778a;

    /* renamed from: a, reason: collision with other field name */
    public String f779a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f780a = new BitSet(1);

    /* renamed from: b, reason: collision with other field name */
    public String f781b;

    /* renamed from: c, reason: collision with other field name */
    public String f782c;

    /* renamed from: d, reason: collision with other field name */
    public String f783d;

    /* renamed from: e, reason: collision with other field name */
    public String f784e;

    /* renamed from: f, reason: collision with other field name */
    public String f785f;

    /* renamed from: g, reason: collision with other field name */
    public String f786g;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f776a = new ji("XmPushActionSubscriptionResult");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46100a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f46101b = new ja("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f46102c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f46103d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f46104e = new ja("", (byte) 10, 6);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f46105f = new ja("", (byte) 11, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f46106g = new ja("", (byte) 11, 8);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f46107h = new ja("", (byte) 11, 9);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f46108i = new ja("", (byte) 11, 10);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(im imVar) {
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        int a19;
        if (!getClass().equals(imVar.getClass())) {
            return getClass().getName().compareTo(imVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6135a()).compareTo(Boolean.valueOf(imVar.m6135a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6135a() && (a19 = it.a(this.f779a, imVar.f779a)) != 0) {
            return a19;
        }
        int compareTo2 = Boolean.valueOf(m6137b()).compareTo(Boolean.valueOf(imVar.m6137b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m6137b() && (a18 = it.a(this.f778a, imVar.f778a)) != 0) {
            return a18;
        }
        int compareTo3 = Boolean.valueOf(m6138c()).compareTo(Boolean.valueOf(imVar.m6138c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m6138c() && (a17 = it.a(this.f781b, imVar.f781b)) != 0) {
            return a17;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(imVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a16 = it.a(this.f782c, imVar.f782c)) != 0) {
            return a16;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(imVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a15 = it.a(this.f777a, imVar.f777a)) != 0) {
            return a15;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(imVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a14 = it.a(this.f783d, imVar.f783d)) != 0) {
            return a14;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(imVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a13 = it.a(this.f784e, imVar.f784e)) != 0) {
            return a13;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(imVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a12 = it.a(this.f785f, imVar.f785f)) != 0) {
            return a12;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(imVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!i() || (a11 = it.a(this.f786g, imVar.f786g)) == 0) {
            return 0;
        }
        return a11;
    }

    public String b() {
        return this.f784e;
    }

    public String c() {
        return this.f786g;
    }

    public boolean d() {
        return this.f782c != null;
    }

    public boolean e() {
        return this.f780a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof im)) {
            return m6136a((im) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f783d != null;
    }

    public boolean g() {
        return this.f784e != null;
    }

    public boolean h() {
        return this.f785f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f786g != null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("XmPushActionSubscriptionResult(");
        boolean z12 = false;
        if (m6135a()) {
            sb2.append("debug:");
            String str = this.f779a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (m6137b()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("target:");
            hw hwVar = this.f778a;
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
        String str2 = this.f781b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (d()) {
            sb2.append(j2.O);
            sb2.append("appId:");
            String str3 = this.f782c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (e()) {
            sb2.append(j2.O);
            sb2.append("errorCode:");
            sb2.append(this.f777a);
        }
        if (f()) {
            sb2.append(j2.O);
            sb2.append("reason:");
            String str4 = this.f783d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("topic:");
            String str5 = this.f784e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str6 = this.f785f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("category:");
            String str7 = this.f786g;
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
        return this.f781b;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6134a();
        jdVar.a(f776a);
        if (this.f779a != null && m6135a()) {
            jdVar.a(f46100a);
            jdVar.a(this.f779a);
            jdVar.b();
        }
        if (this.f778a != null && m6137b()) {
            jdVar.a(f46101b);
            this.f778a.b(jdVar);
            jdVar.b();
        }
        if (this.f781b != null) {
            jdVar.a(f46102c);
            jdVar.a(this.f781b);
            jdVar.b();
        }
        if (this.f782c != null && d()) {
            jdVar.a(f46103d);
            jdVar.a(this.f782c);
            jdVar.b();
        }
        if (e()) {
            jdVar.a(f46104e);
            jdVar.a(this.f777a);
            jdVar.b();
        }
        if (this.f783d != null && f()) {
            jdVar.a(f46105f);
            jdVar.a(this.f783d);
            jdVar.b();
        }
        if (this.f784e != null && g()) {
            jdVar.a(f46106g);
            jdVar.a(this.f784e);
            jdVar.b();
        }
        if (this.f785f != null && h()) {
            jdVar.a(f46107h);
            jdVar.a(this.f785f);
            jdVar.b();
        }
        if (this.f786g != null && i()) {
            jdVar.a(f46108i);
            jdVar.a(this.f786g);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m6138c() {
        return this.f781b != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6134a() {
        if (this.f781b != null) {
            return;
        }
        throw new je("Required field 'id' was not present! Struct: " + toString());
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6137b() {
        return this.f778a != null;
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                m6134a();
                return;
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 11) {
                        this.f779a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f778a = hwVar;
                        hwVar.a(jdVar);
                        break;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f781b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f782c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 10) {
                        this.f777a = jdVar.mo6156a();
                        a(true);
                        break;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f783d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 11) {
                        this.f784e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 9:
                    if (b11 == 11) {
                        this.f785f = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 10:
                    if (b11 == 11) {
                        this.f786g = jdVar.mo6162a();
                        continue;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public void a(boolean z11) {
        this.f780a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6135a() {
        return this.f779a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6136a(im imVar) {
        if (imVar == null) {
            return false;
        }
        boolean m6135a = m6135a();
        boolean m6135a2 = imVar.m6135a();
        if ((m6135a || m6135a2) && !(m6135a && m6135a2 && this.f779a.equals(imVar.f779a))) {
            return false;
        }
        boolean m6137b = m6137b();
        boolean m6137b2 = imVar.m6137b();
        if ((m6137b || m6137b2) && !(m6137b && m6137b2 && this.f778a.m6057a(imVar.f778a))) {
            return false;
        }
        boolean m6138c = m6138c();
        boolean m6138c2 = imVar.m6138c();
        if ((m6138c || m6138c2) && !(m6138c && m6138c2 && this.f781b.equals(imVar.f781b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = imVar.d();
        if ((d11 || d12) && !(d11 && d12 && this.f782c.equals(imVar.f782c))) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = imVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f777a == imVar.f777a)) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = imVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f783d.equals(imVar.f783d))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = imVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f784e.equals(imVar.f784e))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = imVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f785f.equals(imVar.f785f))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = imVar.i();
        if (i11 || i12) {
            return i11 && i12 && this.f786g.equals(imVar.f786g);
        }
        return true;
    }
}
