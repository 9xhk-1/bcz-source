package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class hq implements is<hq, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f533a;

    /* renamed from: a, reason: collision with other field name */
    public hn f534a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f535a = new BitSet(1);

    /* renamed from: a, reason: collision with other field name */
    public List<hs> f536a;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f532a = new ji("NormalConfig");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45860a = new ja("", (byte) 8, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45861b = new ja("", (byte) 15, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f45862c = new ja("", (byte) 8, 3);

    public int a() {
        return this.f533a;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6027a();
        jdVar.a(f532a);
        jdVar.a(f45860a);
        jdVar.mo6166a(this.f533a);
        jdVar.b();
        if (this.f536a != null) {
            jdVar.a(f45861b);
            jdVar.a(new jb((byte) 12, this.f536a.size()));
            Iterator<hs> it = this.f536a.iterator();
            while (it.hasNext()) {
                it.next().b(jdVar);
            }
            jdVar.e();
            jdVar.b();
        }
        if (this.f534a != null && c()) {
            jdVar.a(f45862c);
            jdVar.mo6166a(this.f534a.a());
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public boolean c() {
        return this.f534a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hq)) {
            return m6029a((hq) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NormalConfig(");
        sb2.append("version:");
        sb2.append(this.f533a);
        sb2.append(j2.O);
        sb2.append("configItems:");
        List<hs> list = this.f536a;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        if (c()) {
            sb2.append(j2.O);
            sb2.append("type:");
            hn hnVar = this.f534a;
            if (hnVar == null) {
                sb2.append("null");
            } else {
                sb2.append(hnVar);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hq hqVar) {
        int a11;
        int a12;
        int a13;
        if (!getClass().equals(hqVar.getClass())) {
            return getClass().getName().compareTo(hqVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6028a()).compareTo(Boolean.valueOf(hqVar.m6028a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6028a() && (a13 = it.a(this.f533a, hqVar.f533a)) != 0) {
            return a13;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hqVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a12 = it.a(this.f536a, hqVar.f536a)) != 0) {
            return a12;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hqVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!c() || (a11 = it.a(this.f534a, hqVar.f534a)) == 0) {
            return 0;
        }
        return a11;
    }

    public boolean b() {
        return this.f536a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public hn m6026a() {
        return this.f534a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6027a() {
        if (this.f536a != null) {
            return;
        }
        throw new je("Required field 'configItems' was not present! Struct: " + toString());
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
                if (b11 == 8) {
                    this.f533a = jdVar.mo6155a();
                    a(true);
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else if (s11 != 2) {
                if (s11 == 3 && b11 == 8) {
                    this.f534a = hn.a(jdVar.mo6155a());
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else {
                if (b11 == 15) {
                    jb mo6158a = jdVar.mo6158a();
                    this.f536a = new ArrayList(mo6158a.f844a);
                    for (int i11 = 0; i11 < mo6158a.f844a; i11++) {
                        hs hsVar = new hs();
                        hsVar.a(jdVar);
                        this.f536a.add(hsVar);
                    }
                    jdVar.i();
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            }
        }
        jdVar.f();
        if (m6028a()) {
            m6027a();
            return;
        }
        throw new je("Required field 'version' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z11) {
        this.f535a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6028a() {
        return this.f535a.get(0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6029a(hq hqVar) {
        if (hqVar == null || this.f533a != hqVar.f533a) {
            return false;
        }
        boolean b11 = b();
        boolean b12 = hqVar.b();
        if ((b11 || b12) && !(b11 && b12 && this.f536a.equals(hqVar.f536a))) {
            return false;
        }
        boolean c11 = c();
        boolean c12 = hqVar.c();
        if (c11 || c12) {
            return c11 && c12 && this.f534a.equals(hqVar.f534a);
        }
        return true;
    }
}
