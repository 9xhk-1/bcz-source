package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class ez implements is<ez, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public byte f370a;

    /* renamed from: a, reason: collision with other field name */
    public int f371a;

    /* renamed from: a, reason: collision with other field name */
    public String f372a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f373a = new BitSet(6);

    /* renamed from: b, reason: collision with other field name */
    public int f374b;

    /* renamed from: b, reason: collision with other field name */
    public String f375b;

    /* renamed from: c, reason: collision with other field name */
    public int f376c;

    /* renamed from: c, reason: collision with other field name */
    public String f377c;

    /* renamed from: d, reason: collision with other field name */
    public int f378d;

    /* renamed from: d, reason: collision with other field name */
    public String f379d;

    /* renamed from: e, reason: collision with other field name */
    public int f380e;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f369a = new ji("StatsEvent");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45535a = new ja("", (byte) 3, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45536b = new ja("", (byte) 8, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f45537c = new ja("", (byte) 8, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f45538d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f45539e = new ja("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f45540f = new ja("", (byte) 8, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f45541g = new ja("", (byte) 11, 7);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f45542h = new ja("", (byte) 11, 8);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f45543i = new ja("", (byte) 8, 9);

    /* renamed from: j, reason: collision with root package name */
    private static final ja f45544j = new ja("", (byte) 8, 10);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ez ezVar) {
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
        if (!getClass().equals(ezVar.getClass())) {
            return getClass().getName().compareTo(ezVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m5929a()).compareTo(Boolean.valueOf(ezVar.m5929a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m5929a() && (a21 = it.a(this.f370a, ezVar.f370a)) != 0) {
            return a21;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ezVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a19 = it.a(this.f371a, ezVar.f371a)) != 0) {
            return a19;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ezVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a18 = it.a(this.f374b, ezVar.f374b)) != 0) {
            return a18;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ezVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a17 = it.a(this.f372a, ezVar.f372a)) != 0) {
            return a17;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ezVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a16 = it.a(this.f375b, ezVar.f375b)) != 0) {
            return a16;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ezVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a15 = it.a(this.f376c, ezVar.f376c)) != 0) {
            return a15;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ezVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a14 = it.a(this.f377c, ezVar.f377c)) != 0) {
            return a14;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ezVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a13 = it.a(this.f379d, ezVar.f379d)) != 0) {
            return a13;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ezVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a12 = it.a(this.f378d, ezVar.f378d)) != 0) {
            return a12;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ezVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a11 = it.a(this.f380e, ezVar.f380e)) == 0) {
            return 0;
        }
        return a11;
    }

    public ez b(int i11) {
        this.f374b = i11;
        c(true);
        return this;
    }

    public ez c(int i11) {
        this.f376c = i11;
        d(true);
        return this;
    }

    public ez d(int i11) {
        this.f378d = i11;
        e(true);
        return this;
    }

    public void e(boolean z11) {
        this.f373a.set(4, z11);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ez)) {
            return m5930a((ez) obj);
        }
        return false;
    }

    public void f(boolean z11) {
        this.f373a.set(5, z11);
    }

    public boolean g() {
        return this.f377c != null;
    }

    public boolean h() {
        return this.f379d != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f373a.get(4);
    }

    public boolean j() {
        return this.f373a.get(5);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StatsEvent(");
        sb2.append("chid:");
        sb2.append((int) this.f370a);
        sb2.append(j2.O);
        sb2.append("type:");
        sb2.append(this.f371a);
        sb2.append(j2.O);
        sb2.append("value:");
        sb2.append(this.f374b);
        sb2.append(j2.O);
        sb2.append("connpt:");
        String str = this.f372a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (e()) {
            sb2.append(j2.O);
            sb2.append("host:");
            String str2 = this.f375b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (f()) {
            sb2.append(j2.O);
            sb2.append("subvalue:");
            sb2.append(this.f376c);
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("annotation:");
            String str3 = this.f377c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("user:");
            String str4 = this.f379d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("time:");
            sb2.append(this.f378d);
        }
        if (j()) {
            sb2.append(j2.O);
            sb2.append("clientIp:");
            sb2.append(this.f380e);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public ez a(byte b11) {
        this.f370a = b11;
        a(true);
        return this;
    }

    public ez b(String str) {
        this.f375b = str;
        return this;
    }

    public ez c(String str) {
        this.f377c = str;
        return this;
    }

    public ez d(String str) {
        this.f379d = str;
        return this;
    }

    public boolean e() {
        return this.f375b != null;
    }

    public boolean f() {
        return this.f373a.get(3);
    }

    public ez a(int i11) {
        this.f371a = i11;
        b(true);
        return this;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        a();
        jdVar.a(f369a);
        jdVar.a(f45535a);
        jdVar.a(this.f370a);
        jdVar.b();
        jdVar.a(f45536b);
        jdVar.mo6166a(this.f371a);
        jdVar.b();
        jdVar.a(f45537c);
        jdVar.mo6166a(this.f374b);
        jdVar.b();
        if (this.f372a != null) {
            jdVar.a(f45538d);
            jdVar.a(this.f372a);
            jdVar.b();
        }
        if (this.f375b != null && e()) {
            jdVar.a(f45539e);
            jdVar.a(this.f375b);
            jdVar.b();
        }
        if (f()) {
            jdVar.a(f45540f);
            jdVar.mo6166a(this.f376c);
            jdVar.b();
        }
        if (this.f377c != null && g()) {
            jdVar.a(f45541g);
            jdVar.a(this.f377c);
            jdVar.b();
        }
        if (this.f379d != null && h()) {
            jdVar.a(f45542h);
            jdVar.a(this.f379d);
            jdVar.b();
        }
        if (i()) {
            jdVar.a(f45543i);
            jdVar.mo6166a(this.f378d);
            jdVar.b();
        }
        if (j()) {
            jdVar.a(f45544j);
            jdVar.mo6166a(this.f380e);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public void c(boolean z11) {
        this.f373a.set(2, z11);
    }

    public void d(boolean z11) {
        this.f373a.set(3, z11);
    }

    public ez a(String str) {
        this.f372a = str;
        return this;
    }

    public void b(boolean z11) {
        this.f373a.set(1, z11);
    }

    public boolean c() {
        return this.f373a.get(2);
    }

    public boolean d() {
        return this.f372a != null;
    }

    public void a() {
        if (this.f372a != null) {
            return;
        }
        throw new je("Required field 'connpt' was not present! Struct: " + toString());
    }

    public boolean b() {
        return this.f373a.get(1);
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                if (!m5929a()) {
                    throw new je("Required field 'chid' was not found in serialized data! Struct: " + toString());
                }
                if (!b()) {
                    throw new je("Required field 'type' was not found in serialized data! Struct: " + toString());
                }
                if (c()) {
                    a();
                    return;
                }
                throw new je("Required field 'value' was not found in serialized data! Struct: " + toString());
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 3) {
                        this.f370a = jdVar.a();
                        a(true);
                        break;
                    }
                    break;
                case 2:
                    if (b11 == 8) {
                        this.f371a = jdVar.mo6155a();
                        b(true);
                        continue;
                    }
                    break;
                case 3:
                    if (b11 == 8) {
                        this.f374b = jdVar.mo6155a();
                        c(true);
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f372a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 11) {
                        this.f375b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 8) {
                        this.f376c = jdVar.mo6155a();
                        d(true);
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f377c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 11) {
                        this.f379d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 9:
                    if (b11 == 8) {
                        this.f378d = jdVar.mo6155a();
                        e(true);
                        continue;
                    }
                    break;
                case 10:
                    if (b11 == 8) {
                        this.f380e = jdVar.mo6155a();
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
        this.f373a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5929a() {
        return this.f373a.get(0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5930a(ez ezVar) {
        if (ezVar == null || this.f370a != ezVar.f370a || this.f371a != ezVar.f371a || this.f374b != ezVar.f374b) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = ezVar.d();
        if ((d11 || d12) && !(d11 && d12 && this.f372a.equals(ezVar.f372a))) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = ezVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f375b.equals(ezVar.f375b))) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = ezVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f376c == ezVar.f376c)) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = ezVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f377c.equals(ezVar.f377c))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = ezVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f379d.equals(ezVar.f379d))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = ezVar.i();
        if ((i11 || i12) && !(i11 && i12 && this.f378d == ezVar.f378d)) {
            return false;
        }
        boolean j11 = j();
        boolean j12 = ezVar.j();
        if (j11 || j12) {
            return j11 && j12 && this.f380e == ezVar.f380e;
        }
        return true;
    }
}
