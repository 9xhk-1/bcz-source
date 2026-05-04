package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class ij implements is<ij, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f745a;

    /* renamed from: a, reason: collision with other field name */
    public hw f746a;

    /* renamed from: a, reason: collision with other field name */
    public String f747a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f748a = new BitSet(1);

    /* renamed from: b, reason: collision with other field name */
    public String f749b;

    /* renamed from: c, reason: collision with other field name */
    public String f750c;

    /* renamed from: d, reason: collision with other field name */
    public String f751d;

    /* renamed from: e, reason: collision with other field name */
    public String f752e;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f744a = new ji("XmPushActionSendFeedbackResult");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46073a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f46074b = new ja("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f46075c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f46076d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f46077e = new ja("", (byte) 10, 6);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f46078f = new ja("", (byte) 11, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f46079g = new ja("", (byte) 11, 8);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ij ijVar) {
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        if (!getClass().equals(ijVar.getClass())) {
            return getClass().getName().compareTo(ijVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6121a()).compareTo(Boolean.valueOf(ijVar.m6121a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6121a() && (a17 = it.a(this.f747a, ijVar.f747a)) != 0) {
            return a17;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ijVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a16 = it.a(this.f746a, ijVar.f746a)) != 0) {
            return a16;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ijVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a15 = it.a(this.f749b, ijVar.f749b)) != 0) {
            return a15;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ijVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a14 = it.a(this.f750c, ijVar.f750c)) != 0) {
            return a14;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ijVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a13 = it.a(this.f745a, ijVar.f745a)) != 0) {
            return a13;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ijVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a12 = it.a(this.f751d, ijVar.f751d)) != 0) {
            return a12;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ijVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!g() || (a11 = it.a(this.f752e, ijVar.f752e)) == 0) {
            return 0;
        }
        return a11;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        a();
        jdVar.a(f744a);
        if (this.f747a != null && m6121a()) {
            jdVar.a(f46073a);
            jdVar.a(this.f747a);
            jdVar.b();
        }
        if (this.f746a != null && b()) {
            jdVar.a(f46074b);
            this.f746a.b(jdVar);
            jdVar.b();
        }
        if (this.f749b != null) {
            jdVar.a(f46075c);
            jdVar.a(this.f749b);
            jdVar.b();
        }
        if (this.f750c != null) {
            jdVar.a(f46076d);
            jdVar.a(this.f750c);
            jdVar.b();
        }
        jdVar.a(f46077e);
        jdVar.a(this.f745a);
        jdVar.b();
        if (this.f751d != null && f()) {
            jdVar.a(f46078f);
            jdVar.a(this.f751d);
            jdVar.b();
        }
        if (this.f752e != null && g()) {
            jdVar.a(f46079g);
            jdVar.a(this.f752e);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public boolean c() {
        return this.f749b != null;
    }

    public boolean d() {
        return this.f750c != null;
    }

    public boolean e() {
        return this.f748a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ij)) {
            return m6122a((ij) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f751d != null;
    }

    public boolean g() {
        return this.f752e != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z12 = false;
        if (m6121a()) {
            sb2.append("debug:");
            String str = this.f747a;
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
            hw hwVar = this.f746a;
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
        String str2 = this.f749b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("appId:");
        String str3 = this.f750c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("errorCode:");
        sb2.append(this.f745a);
        if (f()) {
            sb2.append(j2.O);
            sb2.append("reason:");
            String str4 = this.f751d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("category:");
            String str5 = this.f752e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void a() {
        if (this.f749b == null) {
            throw new je("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f750c != null) {
            return;
        }
        throw new je("Required field 'appId' was not present! Struct: " + toString());
    }

    public boolean b() {
        return this.f746a != null;
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
                    a();
                    return;
                }
                throw new je("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 11) {
                        this.f747a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f746a = hwVar;
                        hwVar.a(jdVar);
                        break;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f749b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f750c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 10) {
                        this.f745a = jdVar.mo6156a();
                        a(true);
                        break;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f751d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 11) {
                        this.f752e = jdVar.mo6162a();
                        continue;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public void a(boolean z11) {
        this.f748a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6121a() {
        return this.f747a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6122a(ij ijVar) {
        if (ijVar == null) {
            return false;
        }
        boolean m6121a = m6121a();
        boolean m6121a2 = ijVar.m6121a();
        if ((m6121a || m6121a2) && !(m6121a && m6121a2 && this.f747a.equals(ijVar.f747a))) {
            return false;
        }
        boolean b11 = b();
        boolean b12 = ijVar.b();
        if ((b11 || b12) && !(b11 && b12 && this.f746a.m6057a(ijVar.f746a))) {
            return false;
        }
        boolean c11 = c();
        boolean c12 = ijVar.c();
        if ((c11 || c12) && !(c11 && c12 && this.f749b.equals(ijVar.f749b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = ijVar.d();
        if (((d11 || d12) && !(d11 && d12 && this.f750c.equals(ijVar.f750c))) || this.f745a != ijVar.f745a) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = ijVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f751d.equals(ijVar.f751d))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = ijVar.g();
        if (g11 || g12) {
            return g11 && g12 && this.f752e.equals(ijVar.f752e);
        }
        return true;
    }
}
