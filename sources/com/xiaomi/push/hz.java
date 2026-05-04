package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class hz implements is<hz, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f628a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f629a = new BitSet(2);

    /* renamed from: b, reason: collision with other field name */
    public int f630b;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f627a = new ji("XmPushActionCheckClientInfo");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45973a = new ja("", (byte) 8, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45974b = new ja("", (byte) 8, 2);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hz hzVar) {
        int a11;
        int a12;
        if (!getClass().equals(hzVar.getClass())) {
            return getClass().getName().compareTo(hzVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6065a()).compareTo(Boolean.valueOf(hzVar.m6065a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6065a() && (a12 = it.a(this.f628a, hzVar.f628a)) != 0) {
            return a12;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hzVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!b() || (a11 = it.a(this.f630b, hzVar.f630b)) == 0) {
            return 0;
        }
        return a11;
    }

    public hz b(int i11) {
        this.f630b = i11;
        b(true);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hz)) {
            return m6066a((hz) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(miscConfigVersion:" + this.f628a + j2.O + "pluginConfigVersion:" + this.f630b + pn.j.f81007d;
    }

    public hz a(int i11) {
        this.f628a = i11;
        a(true);
        return this;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        a();
        jdVar.a(f627a);
        jdVar.a(f45973a);
        jdVar.mo6166a(this.f628a);
        jdVar.b();
        jdVar.a(f45974b);
        jdVar.mo6166a(this.f630b);
        jdVar.b();
        jdVar.c();
        jdVar.mo6165a();
    }

    public void a() {
    }

    public void b(boolean z11) {
        this.f629a.set(1, z11);
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
            if (s11 != 1) {
                if (s11 == 2 && b11 == 8) {
                    this.f630b = jdVar.mo6155a();
                    b(true);
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else {
                if (b11 == 8) {
                    this.f628a = jdVar.mo6155a();
                    a(true);
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            }
        }
        jdVar.f();
        if (!m6065a()) {
            throw new je("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
        }
        if (b()) {
            a();
            return;
        }
        throw new je("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
    }

    public boolean b() {
        return this.f629a.get(1);
    }

    public void a(boolean z11) {
        this.f629a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6065a() {
        return this.f629a.get(0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6066a(hz hzVar) {
        return hzVar != null && this.f628a == hzVar.f628a && this.f630b == hzVar.f630b;
    }
}
