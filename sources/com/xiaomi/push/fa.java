package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class fa implements is<fa, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public String f382a;

    /* renamed from: a, reason: collision with other field name */
    public List<ez> f383a;

    /* renamed from: b, reason: collision with other field name */
    public String f384b;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f381a = new ji("StatsEvents");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45549a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45550b = new ja("", (byte) 11, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f45551c = new ja("", (byte) 15, 3);

    public fa() {
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(fa faVar) {
        int a11;
        int a12;
        int a13;
        if (!getClass().equals(faVar.getClass())) {
            return getClass().getName().compareTo(faVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m5931a()).compareTo(Boolean.valueOf(faVar.m5931a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m5931a() && (a13 = it.a(this.f382a, faVar.f382a)) != 0) {
            return a13;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(faVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a12 = it.a(this.f384b, faVar.f384b)) != 0) {
            return a12;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(faVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!c() || (a11 = it.a(this.f383a, faVar.f383a)) == 0) {
            return 0;
        }
        return a11;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        a();
        jdVar.a(f381a);
        if (this.f382a != null) {
            jdVar.a(f45549a);
            jdVar.a(this.f382a);
            jdVar.b();
        }
        if (this.f384b != null && b()) {
            jdVar.a(f45550b);
            jdVar.a(this.f384b);
            jdVar.b();
        }
        if (this.f383a != null) {
            jdVar.a(f45551c);
            jdVar.a(new jb((byte) 12, this.f383a.size()));
            Iterator<ez> it = this.f383a.iterator();
            while (it.hasNext()) {
                it.next().b(jdVar);
            }
            jdVar.e();
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public boolean c() {
        return this.f383a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof fa)) {
            return m5932a((fa) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StatsEvents(");
        sb2.append("uuid:");
        String str = this.f382a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (b()) {
            sb2.append(j2.O);
            sb2.append("operator:");
            String str2 = this.f384b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(j2.O);
        sb2.append("events:");
        List<ez> list = this.f383a;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public fa(String str, List<ez> list) {
        this();
        this.f382a = str;
        this.f383a = list;
    }

    public fa a(String str) {
        this.f384b = str;
        return this;
    }

    public boolean b() {
        return this.f384b != null;
    }

    public void a() {
        if (this.f382a == null) {
            throw new je("Required field 'uuid' was not present! Struct: " + toString());
        }
        if (this.f383a != null) {
            return;
        }
        throw new je("Required field 'events' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                a();
                return;
            }
            short s11 = mo6157a.f843a;
            if (s11 == 1) {
                if (b11 == 11) {
                    this.f382a = jdVar.mo6162a();
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else if (s11 != 2) {
                if (s11 == 3 && b11 == 15) {
                    jb mo6158a = jdVar.mo6158a();
                    this.f383a = new ArrayList(mo6158a.f844a);
                    for (int i11 = 0; i11 < mo6158a.f844a; i11++) {
                        ez ezVar = new ez();
                        ezVar.a(jdVar);
                        this.f383a.add(ezVar);
                    }
                    jdVar.i();
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            } else {
                if (b11 == 11) {
                    this.f384b = jdVar.mo6162a();
                    jdVar.g();
                }
                jg.a(jdVar, b11);
                jdVar.g();
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5931a() {
        return this.f382a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5932a(fa faVar) {
        if (faVar == null) {
            return false;
        }
        boolean m5931a = m5931a();
        boolean m5931a2 = faVar.m5931a();
        if ((m5931a || m5931a2) && !(m5931a && m5931a2 && this.f382a.equals(faVar.f382a))) {
            return false;
        }
        boolean b11 = b();
        boolean b12 = faVar.b();
        if ((b11 || b12) && !(b11 && b12 && this.f384b.equals(faVar.f384b))) {
            return false;
        }
        boolean c11 = c();
        boolean c12 = faVar.c();
        if (c11 || c12) {
            return c11 && c12 && this.f383a.equals(faVar.f383a);
        }
        return true;
    }
}
