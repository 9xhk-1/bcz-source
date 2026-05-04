package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class ic implements is<ic, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f649a;

    /* renamed from: a, reason: collision with other field name */
    public hw f650a;

    /* renamed from: a, reason: collision with other field name */
    public String f651a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f653a;

    /* renamed from: b, reason: collision with other field name */
    public String f655b;

    /* renamed from: c, reason: collision with other field name */
    public String f656c;

    /* renamed from: d, reason: collision with other field name */
    public String f657d;

    /* renamed from: e, reason: collision with other field name */
    public String f658e;

    /* renamed from: f, reason: collision with other field name */
    public String f659f;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f648a = new ji("XmPushActionCommandResult");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45992a = new ja("", (byte) 12, 2);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45993b = new ja("", (byte) 11, 3);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f45994c = new ja("", (byte) 11, 4);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f45995d = new ja("", (byte) 11, 5);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f45996e = new ja("", (byte) 10, 7);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f45997f = new ja("", (byte) 11, 8);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f45998g = new ja("", (byte) 11, 9);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f45999h = new ja("", (byte) 15, 10);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f46000i = new ja("", (byte) 11, 12);

    /* renamed from: j, reason: collision with root package name */
    private static final ja f46001j = new ja("", (byte) 2, 13);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f652a = new BitSet(2);

    /* renamed from: a, reason: collision with other field name */
    public boolean f654a = true;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ic icVar) {
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
        if (!getClass().equals(icVar.getClass())) {
            return getClass().getName().compareTo(icVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6081a()).compareTo(Boolean.valueOf(icVar.m6081a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6081a() && (a21 = it.a(this.f650a, icVar.f650a)) != 0) {
            return a21;
        }
        int compareTo2 = Boolean.valueOf(m6083b()).compareTo(Boolean.valueOf(icVar.m6083b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m6083b() && (a19 = it.a(this.f651a, icVar.f651a)) != 0) {
            return a19;
        }
        int compareTo3 = Boolean.valueOf(m6084c()).compareTo(Boolean.valueOf(icVar.m6084c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m6084c() && (a18 = it.a(this.f655b, icVar.f655b)) != 0) {
            return a18;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(icVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a17 = it.a(this.f656c, icVar.f656c)) != 0) {
            return a17;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(icVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a16 = it.a(this.f649a, icVar.f649a)) != 0) {
            return a16;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(icVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a15 = it.a(this.f657d, icVar.f657d)) != 0) {
            return a15;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(icVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a14 = it.a(this.f658e, icVar.f658e)) != 0) {
            return a14;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(icVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a13 = it.a(this.f653a, icVar.f653a)) != 0) {
            return a13;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(icVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a12 = it.a(this.f659f, icVar.f659f)) != 0) {
            return a12;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(icVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a11 = it.a(this.f654a, icVar.f654a)) == 0) {
            return 0;
        }
        return a11;
    }

    public String b() {
        return this.f656c;
    }

    public String c() {
        return this.f659f;
    }

    public boolean d() {
        return this.f656c != null;
    }

    public boolean e() {
        return this.f652a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ic)) {
            return m6082a((ic) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f657d != null;
    }

    public boolean g() {
        return this.f658e != null;
    }

    public boolean h() {
        return this.f653a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f659f != null;
    }

    public boolean j() {
        return this.f652a.get(1);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("XmPushActionCommandResult(");
        if (m6081a()) {
            sb2.append("target:");
            hw hwVar = this.f650a;
            if (hwVar == null) {
                sb2.append("null");
            } else {
                sb2.append(hwVar);
            }
            sb2.append(j2.O);
        }
        sb2.append("id:");
        String str = this.f651a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("appId:");
        String str2 = this.f655b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("cmdName:");
        String str3 = this.f656c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("errorCode:");
        sb2.append(this.f649a);
        if (f()) {
            sb2.append(j2.O);
            sb2.append("reason:");
            String str4 = this.f657d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str5 = this.f658e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("cmdArgs:");
            List<String> list = this.f653a;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("category:");
            String str6 = this.f659f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (j()) {
            sb2.append(j2.O);
            sb2.append("response2Client:");
            sb2.append(this.f654a);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public String a() {
        return this.f651a;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6080a();
        jdVar.a(f648a);
        if (this.f650a != null && m6081a()) {
            jdVar.a(f45992a);
            this.f650a.b(jdVar);
            jdVar.b();
        }
        if (this.f651a != null) {
            jdVar.a(f45993b);
            jdVar.a(this.f651a);
            jdVar.b();
        }
        if (this.f655b != null) {
            jdVar.a(f45994c);
            jdVar.a(this.f655b);
            jdVar.b();
        }
        if (this.f656c != null) {
            jdVar.a(f45995d);
            jdVar.a(this.f656c);
            jdVar.b();
        }
        jdVar.a(f45996e);
        jdVar.a(this.f649a);
        jdVar.b();
        if (this.f657d != null && f()) {
            jdVar.a(f45997f);
            jdVar.a(this.f657d);
            jdVar.b();
        }
        if (this.f658e != null && g()) {
            jdVar.a(f45998g);
            jdVar.a(this.f658e);
            jdVar.b();
        }
        if (this.f653a != null && h()) {
            jdVar.a(f45999h);
            jdVar.a(new jb((byte) 11, this.f653a.size()));
            Iterator<String> it = this.f653a.iterator();
            while (it.hasNext()) {
                jdVar.a(it.next());
            }
            jdVar.e();
            jdVar.b();
        }
        if (this.f659f != null && i()) {
            jdVar.a(f46000i);
            jdVar.a(this.f659f);
            jdVar.b();
        }
        if (j()) {
            jdVar.a(f46001j);
            jdVar.a(this.f654a);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m6084c() {
        return this.f655b != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public List<String> m6079a() {
        return this.f653a;
    }

    public void b(boolean z11) {
        this.f652a.set(1, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6080a() {
        if (this.f651a == null) {
            throw new je("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f655b == null) {
            throw new je("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f656c != null) {
            return;
        }
        throw new je("Required field 'cmdName' was not present! Struct: " + toString());
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6083b() {
        return this.f651a != null;
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
                    m6080a();
                    return;
                }
                throw new je("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (mo6157a.f843a) {
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f650a = hwVar;
                        hwVar.a(jdVar);
                        break;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f651a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f655b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 11) {
                        this.f656c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 10) {
                        this.f649a = jdVar.mo6156a();
                        a(true);
                        break;
                    }
                    break;
                case 8:
                    if (b11 == 11) {
                        this.f657d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 9:
                    if (b11 == 11) {
                        this.f658e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 10:
                    if (b11 == 15) {
                        jb mo6158a = jdVar.mo6158a();
                        this.f653a = new ArrayList(mo6158a.f844a);
                        for (int i11 = 0; i11 < mo6158a.f844a; i11++) {
                            this.f653a.add(jdVar.mo6162a());
                        }
                        jdVar.i();
                        break;
                    }
                    break;
                case 12:
                    if (b11 == 11) {
                        this.f659f = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 13:
                    if (b11 == 2) {
                        this.f654a = jdVar.mo6167a();
                        b(true);
                        break;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public void a(boolean z11) {
        this.f652a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6081a() {
        return this.f650a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6082a(ic icVar) {
        if (icVar == null) {
            return false;
        }
        boolean m6081a = m6081a();
        boolean m6081a2 = icVar.m6081a();
        if ((m6081a || m6081a2) && !(m6081a && m6081a2 && this.f650a.m6057a(icVar.f650a))) {
            return false;
        }
        boolean m6083b = m6083b();
        boolean m6083b2 = icVar.m6083b();
        if ((m6083b || m6083b2) && !(m6083b && m6083b2 && this.f651a.equals(icVar.f651a))) {
            return false;
        }
        boolean m6084c = m6084c();
        boolean m6084c2 = icVar.m6084c();
        if ((m6084c || m6084c2) && !(m6084c && m6084c2 && this.f655b.equals(icVar.f655b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = icVar.d();
        if (((d11 || d12) && !(d11 && d12 && this.f656c.equals(icVar.f656c))) || this.f649a != icVar.f649a) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = icVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f657d.equals(icVar.f657d))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = icVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f658e.equals(icVar.f658e))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = icVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f653a.equals(icVar.f653a))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = icVar.i();
        if ((i11 || i12) && !(i11 && i12 && this.f659f.equals(icVar.f659f))) {
            return false;
        }
        boolean j11 = j();
        boolean j12 = icVar.j();
        if (j11 || j12) {
            return j11 && j12 && this.f654a == icVar.f654a;
        }
        return true;
    }
}
