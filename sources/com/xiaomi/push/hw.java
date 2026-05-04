package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class hw implements is<hw, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public String f587a;

    /* renamed from: d, reason: collision with other field name */
    public String f592d;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f585a = new ji("Target");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45937a = new ja("", (byte) 10, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45938b = new ja("", (byte) 11, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f45939c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f45940d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f45941e = new ja("", (byte) 2, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f45942f = new ja("", (byte) 11, 7);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f588a = new BitSet(2);

    /* renamed from: a, reason: collision with other field name */
    public long f586a = 5;

    /* renamed from: b, reason: collision with other field name */
    public String f590b = "xiaomi.com";

    /* renamed from: c, reason: collision with other field name */
    public String f591c = "";

    /* renamed from: a, reason: collision with other field name */
    public boolean f589a = false;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hw hwVar) {
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        if (!getClass().equals(hwVar.getClass())) {
            return getClass().getName().compareTo(hwVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6056a()).compareTo(Boolean.valueOf(hwVar.m6056a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6056a() && (a16 = it.a(this.f586a, hwVar.f586a)) != 0) {
            return a16;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hwVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a15 = it.a(this.f587a, hwVar.f587a)) != 0) {
            return a15;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hwVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a14 = it.a(this.f590b, hwVar.f590b)) != 0) {
            return a14;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hwVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a13 = it.a(this.f591c, hwVar.f591c)) != 0) {
            return a13;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hwVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a12 = it.a(this.f589a, hwVar.f589a)) != 0) {
            return a12;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hwVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!f() || (a11 = it.a(this.f592d, hwVar.f592d)) == 0) {
            return 0;
        }
        return a11;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        a();
        jdVar.a(f585a);
        jdVar.a(f45937a);
        jdVar.a(this.f586a);
        jdVar.b();
        if (this.f587a != null) {
            jdVar.a(f45938b);
            jdVar.a(this.f587a);
            jdVar.b();
        }
        if (this.f590b != null && c()) {
            jdVar.a(f45939c);
            jdVar.a(this.f590b);
            jdVar.b();
        }
        if (this.f591c != null && d()) {
            jdVar.a(f45940d);
            jdVar.a(this.f591c);
            jdVar.b();
        }
        if (e()) {
            jdVar.a(f45941e);
            jdVar.a(this.f589a);
            jdVar.b();
        }
        if (this.f592d != null && f()) {
            jdVar.a(f45942f);
            jdVar.a(this.f592d);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public boolean c() {
        return this.f590b != null;
    }

    public boolean d() {
        return this.f591c != null;
    }

    public boolean e() {
        return this.f588a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hw)) {
            return m6057a((hw) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f592d != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Target(");
        sb2.append("channelId:");
        sb2.append(this.f586a);
        sb2.append(j2.O);
        sb2.append("userId:");
        String str = this.f587a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (c()) {
            sb2.append(j2.O);
            sb2.append("server:");
            String str2 = this.f590b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (d()) {
            sb2.append(j2.O);
            sb2.append("resource:");
            String str3 = this.f591c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (e()) {
            sb2.append(j2.O);
            sb2.append("isPreview:");
            sb2.append(this.f589a);
        }
        if (f()) {
            sb2.append(j2.O);
            sb2.append("token:");
            String str4 = this.f592d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void a() {
        if (this.f587a != null) {
            return;
        }
        throw new je("Required field 'userId' was not present! Struct: " + toString());
    }

    public void b(boolean z11) {
        this.f588a.set(1, z11);
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                break;
            }
            short s11 = mo6157a.f843a;
            if (s11 == 1) {
                if (b11 == 10) {
                    this.f586a = jdVar.mo6156a();
                    a(true);
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else if (s11 == 2) {
                if (b11 == 11) {
                    this.f587a = jdVar.mo6162a();
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else if (s11 == 3) {
                if (b11 == 11) {
                    this.f590b = jdVar.mo6162a();
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else if (s11 == 4) {
                if (b11 == 11) {
                    this.f591c = jdVar.mo6162a();
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else if (s11 != 5) {
                if (s11 == 7 && b11 == 11) {
                    this.f592d = jdVar.mo6162a();
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else {
                if (b11 == 2) {
                    this.f589a = jdVar.mo6167a();
                    b(true);
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            }
        }
        jdVar.f();
        if (m6056a()) {
            a();
            return;
        }
        throw new je("Required field 'channelId' was not found in serialized data! Struct: " + toString());
    }

    public boolean b() {
        return this.f587a != null;
    }

    public void a(boolean z11) {
        this.f588a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6056a() {
        return this.f588a.get(0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6057a(hw hwVar) {
        if (hwVar == null || this.f586a != hwVar.f586a) {
            return false;
        }
        boolean b11 = b();
        boolean b12 = hwVar.b();
        if ((b11 || b12) && !(b11 && b12 && this.f587a.equals(hwVar.f587a))) {
            return false;
        }
        boolean c11 = c();
        boolean c12 = hwVar.c();
        if ((c11 || c12) && !(c11 && c12 && this.f590b.equals(hwVar.f590b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = hwVar.d();
        if ((d11 || d12) && !(d11 && d12 && this.f591c.equals(hwVar.f591c))) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = hwVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f589a == hwVar.f589a)) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = hwVar.f();
        if (f11 || f12) {
            return f11 && f12 && this.f592d.equals(hwVar.f592d);
        }
        return true;
    }
}
