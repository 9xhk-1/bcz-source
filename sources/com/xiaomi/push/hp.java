package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class hp implements is<hp, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f528a;

    /* renamed from: a, reason: collision with other field name */
    public hj f529a;

    /* renamed from: a, reason: collision with other field name */
    public String f530a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f531a = new BitSet(1);

    /* renamed from: a, reason: collision with other field name */
    private static final ji f527a = new ji("DataCollectionItem");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45857a = new ja("", (byte) 10, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45858b = new ja("", (byte) 8, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f45859c = new ja("", (byte) 11, 3);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hp hpVar) {
        int a11;
        int a12;
        int a13;
        if (!getClass().equals(hpVar.getClass())) {
            return getClass().getName().compareTo(hpVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6024a()).compareTo(Boolean.valueOf(hpVar.m6024a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6024a() && (a13 = it.a(this.f528a, hpVar.f528a)) != 0) {
            return a13;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hpVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a12 = it.a(this.f529a, hpVar.f529a)) != 0) {
            return a12;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hpVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!c() || (a11 = it.a(this.f530a, hpVar.f530a)) == 0) {
            return 0;
        }
        return a11;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6023a();
        jdVar.a(f527a);
        jdVar.a(f45857a);
        jdVar.a(this.f528a);
        jdVar.b();
        if (this.f529a != null) {
            jdVar.a(f45858b);
            jdVar.mo6166a(this.f529a.a());
            jdVar.b();
        }
        if (this.f530a != null) {
            jdVar.a(f45859c);
            jdVar.a(this.f530a);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public boolean c() {
        return this.f530a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hp)) {
            return m6025a((hp) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DataCollectionItem(");
        sb2.append("collectedAt:");
        sb2.append(this.f528a);
        sb2.append(j2.O);
        sb2.append("collectionType:");
        hj hjVar = this.f529a;
        if (hjVar == null) {
            sb2.append("null");
        } else {
            sb2.append(hjVar);
        }
        sb2.append(j2.O);
        sb2.append("content:");
        String str = this.f530a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public hp a(long j11) {
        this.f528a = j11;
        a(true);
        return this;
    }

    public boolean b() {
        return this.f529a != null;
    }

    public hp a(hj hjVar) {
        this.f529a = hjVar;
        return this;
    }

    public hp a(String str) {
        this.f530a = str;
        return this;
    }

    public String a() {
        return this.f530a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6023a() {
        if (this.f529a == null) {
            throw new je("Required field 'collectionType' was not present! Struct: " + toString());
        }
        if (this.f530a != null) {
            return;
        }
        throw new je("Required field 'content' was not present! Struct: " + toString());
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
                    this.f528a = jdVar.mo6156a();
                    a(true);
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else if (s11 != 2) {
                if (s11 == 3 && b11 == 11) {
                    this.f530a = jdVar.mo6162a();
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else {
                if (b11 == 8) {
                    this.f529a = hj.a(jdVar.mo6155a());
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            }
        }
        jdVar.f();
        if (m6024a()) {
            m6023a();
            return;
        }
        throw new je("Required field 'collectedAt' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z11) {
        this.f531a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6024a() {
        return this.f531a.get(0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6025a(hp hpVar) {
        if (hpVar == null || this.f528a != hpVar.f528a) {
            return false;
        }
        boolean b11 = b();
        boolean b12 = hpVar.b();
        if ((b11 || b12) && !(b11 && b12 && this.f529a.equals(hpVar.f529a))) {
            return false;
        }
        boolean c11 = c();
        boolean c12 = hpVar.c();
        if (c11 || c12) {
            return c11 && c12 && this.f530a.equals(hpVar.f530a);
        }
        return true;
    }
}
