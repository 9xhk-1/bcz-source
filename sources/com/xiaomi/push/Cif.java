package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.xiaomi.push.if, reason: invalid class name */
/* loaded from: classes8.dex */
public class Cif implements is<Cif, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public List<hq> f673a;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f672a = new ji("XmPushActionNormalConfig");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46011a = new ja("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Cif cif) {
        int a11;
        if (!getClass().equals(cif.getClass())) {
            return getClass().getName().compareTo(cif.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6098a()).compareTo(Boolean.valueOf(cif.m6098a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m6098a() || (a11 = it.a(this.f673a, cif.f673a)) == 0) {
            return 0;
        }
        return a11;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6097a();
        jdVar.a(f672a);
        if (this.f673a != null) {
            jdVar.a(f46011a);
            jdVar.a(new jb((byte) 12, this.f673a.size()));
            Iterator<hq> it = this.f673a.iterator();
            while (it.hasNext()) {
                it.next().b(jdVar);
            }
            jdVar.e();
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Cif)) {
            return m6099a((Cif) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("XmPushActionNormalConfig(");
        sb2.append("normalConfigs:");
        List<hq> list = this.f673a;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public List<hq> a() {
        return this.f673a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6097a() {
        if (this.f673a != null) {
            return;
        }
        throw new je("Required field 'normalConfigs' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                m6097a();
                return;
            }
            if (mo6157a.f843a == 1 && b11 == 15) {
                jb mo6158a = jdVar.mo6158a();
                this.f673a = new ArrayList(mo6158a.f844a);
                for (int i11 = 0; i11 < mo6158a.f844a; i11++) {
                    hq hqVar = new hq();
                    hqVar.a(jdVar);
                    this.f673a.add(hqVar);
                }
                jdVar.i();
            } else {
                jg.a(jdVar, b11);
            }
            jdVar.g();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6098a() {
        return this.f673a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6099a(Cif cif) {
        if (cif == null) {
            return false;
        }
        boolean m6098a = m6098a();
        boolean m6098a2 = cif.m6098a();
        if (m6098a || m6098a2) {
            return m6098a && m6098a2 && this.f673a.equals(cif.f673a);
        }
        return true;
    }
}
