package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class ib implements is<ib, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f637a;

    /* renamed from: a, reason: collision with other field name */
    public hw f638a;

    /* renamed from: a, reason: collision with other field name */
    public String f639a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f641a;

    /* renamed from: b, reason: collision with other field name */
    public String f643b;

    /* renamed from: c, reason: collision with other field name */
    public String f645c;

    /* renamed from: d, reason: collision with other field name */
    public String f646d;

    /* renamed from: e, reason: collision with other field name */
    public String f647e;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f636a = new ji("XmPushActionCommand");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45982a = new ja("", (byte) 12, 2);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45983b = new ja("", (byte) 11, 3);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f45984c = new ja("", (byte) 11, 4);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f45985d = new ja("", (byte) 11, 5);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f45986e = new ja("", (byte) 15, 6);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f45987f = new ja("", (byte) 11, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f45988g = new ja("", (byte) 11, 9);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f45989h = new ja("", (byte) 2, 10);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f45990i = new ja("", (byte) 2, 11);

    /* renamed from: j, reason: collision with root package name */
    private static final ja f45991j = new ja("", (byte) 10, 12);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f640a = new BitSet(3);

    /* renamed from: a, reason: collision with other field name */
    public boolean f642a = false;

    /* renamed from: b, reason: collision with other field name */
    public boolean f644b = true;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ib ibVar) {
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
        if (!getClass().equals(ibVar.getClass())) {
            return getClass().getName().compareTo(ibVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6077a()).compareTo(Boolean.valueOf(ibVar.m6077a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6077a() && (a21 = it.a(this.f638a, ibVar.f638a)) != 0) {
            return a21;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ibVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a19 = it.a(this.f639a, ibVar.f639a)) != 0) {
            return a19;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ibVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a18 = it.a(this.f643b, ibVar.f643b)) != 0) {
            return a18;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ibVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a17 = it.a(this.f645c, ibVar.f645c)) != 0) {
            return a17;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ibVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a16 = it.a(this.f641a, ibVar.f641a)) != 0) {
            return a16;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ibVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a15 = it.a(this.f646d, ibVar.f646d)) != 0) {
            return a15;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ibVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a14 = it.a(this.f647e, ibVar.f647e)) != 0) {
            return a14;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ibVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a13 = it.a(this.f642a, ibVar.f642a)) != 0) {
            return a13;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ibVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a12 = it.a(this.f644b, ibVar.f644b)) != 0) {
            return a12;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ibVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a11 = it.a(this.f637a, ibVar.f637a)) == 0) {
            return 0;
        }
        return a11;
    }

    public ib b(String str) {
        this.f643b = str;
        return this;
    }

    public ib c(String str) {
        this.f645c = str;
        return this;
    }

    public ib d(String str) {
        this.f646d = str;
        return this;
    }

    public ib e(String str) {
        this.f647e = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ib)) {
            return m6078a((ib) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f646d != null;
    }

    public boolean g() {
        return this.f647e != null;
    }

    public boolean h() {
        return this.f640a.get(0);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f640a.get(1);
    }

    public boolean j() {
        return this.f640a.get(2);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("XmPushActionCommand(");
        if (m6077a()) {
            sb2.append("target:");
            hw hwVar = this.f638a;
            if (hwVar == null) {
                sb2.append("null");
            } else {
                sb2.append(hwVar);
            }
            sb2.append(j2.O);
        }
        sb2.append("id:");
        String str = this.f639a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("appId:");
        String str2 = this.f643b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("cmdName:");
        String str3 = this.f645c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (e()) {
            sb2.append(j2.O);
            sb2.append("cmdArgs:");
            List<String> list = this.f641a;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (f()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str4 = this.f646d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("category:");
            String str5 = this.f647e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("updateCache:");
            sb2.append(this.f642a);
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("response2Client:");
            sb2.append(this.f644b);
        }
        if (j()) {
            sb2.append(j2.O);
            sb2.append("createdTs:");
            sb2.append(this.f637a);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public ib a(String str) {
        this.f639a = str;
        return this;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6075a();
        jdVar.a(f636a);
        if (this.f638a != null && m6077a()) {
            jdVar.a(f45982a);
            this.f638a.b(jdVar);
            jdVar.b();
        }
        if (this.f639a != null) {
            jdVar.a(f45983b);
            jdVar.a(this.f639a);
            jdVar.b();
        }
        if (this.f643b != null) {
            jdVar.a(f45984c);
            jdVar.a(this.f643b);
            jdVar.b();
        }
        if (this.f645c != null) {
            jdVar.a(f45985d);
            jdVar.a(this.f645c);
            jdVar.b();
        }
        if (this.f641a != null && e()) {
            jdVar.a(f45986e);
            jdVar.a(new jb((byte) 11, this.f641a.size()));
            Iterator<String> it = this.f641a.iterator();
            while (it.hasNext()) {
                jdVar.a(it.next());
            }
            jdVar.e();
            jdVar.b();
        }
        if (this.f646d != null && f()) {
            jdVar.a(f45987f);
            jdVar.a(this.f646d);
            jdVar.b();
        }
        if (this.f647e != null && g()) {
            jdVar.a(f45988g);
            jdVar.a(this.f647e);
            jdVar.b();
        }
        if (h()) {
            jdVar.a(f45989h);
            jdVar.a(this.f642a);
            jdVar.b();
        }
        if (i()) {
            jdVar.a(f45990i);
            jdVar.a(this.f644b);
            jdVar.b();
        }
        if (j()) {
            jdVar.a(f45991j);
            jdVar.a(this.f637a);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public void c(boolean z11) {
        this.f640a.set(2, z11);
    }

    public boolean d() {
        return this.f645c != null;
    }

    public boolean e() {
        return this.f641a != null;
    }

    public String a() {
        return this.f645c;
    }

    public void b(boolean z11) {
        this.f640a.set(1, z11);
    }

    public boolean c() {
        return this.f643b != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6075a() {
        if (this.f639a == null) {
            throw new je("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f643b == null) {
            throw new je("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f645c != null) {
            return;
        }
        throw new je("Required field 'cmdName' was not present! Struct: " + toString());
    }

    public boolean b() {
        return this.f639a != null;
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                m6075a();
                return;
            }
            switch (mo6157a.f843a) {
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f638a = hwVar;
                        hwVar.a(jdVar);
                        break;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f639a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f643b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 11) {
                        this.f645c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 15) {
                        jb mo6158a = jdVar.mo6158a();
                        this.f641a = new ArrayList(mo6158a.f844a);
                        for (int i11 = 0; i11 < mo6158a.f844a; i11++) {
                            this.f641a.add(jdVar.mo6162a());
                        }
                        jdVar.i();
                        break;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f646d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 9:
                    if (b11 == 11) {
                        this.f647e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 10:
                    if (b11 == 2) {
                        this.f642a = jdVar.mo6167a();
                        a(true);
                        continue;
                    }
                    break;
                case 11:
                    if (b11 == 2) {
                        this.f644b = jdVar.mo6167a();
                        b(true);
                        continue;
                    }
                    break;
                case 12:
                    if (b11 == 10) {
                        this.f637a = jdVar.mo6156a();
                        c(true);
                        break;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6076a(String str) {
        if (this.f641a == null) {
            this.f641a = new ArrayList();
        }
        this.f641a.add(str);
    }

    public void a(boolean z11) {
        this.f640a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6077a() {
        return this.f638a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6078a(ib ibVar) {
        if (ibVar == null) {
            return false;
        }
        boolean m6077a = m6077a();
        boolean m6077a2 = ibVar.m6077a();
        if ((m6077a || m6077a2) && !(m6077a && m6077a2 && this.f638a.m6057a(ibVar.f638a))) {
            return false;
        }
        boolean b11 = b();
        boolean b12 = ibVar.b();
        if ((b11 || b12) && !(b11 && b12 && this.f639a.equals(ibVar.f639a))) {
            return false;
        }
        boolean c11 = c();
        boolean c12 = ibVar.c();
        if ((c11 || c12) && !(c11 && c12 && this.f643b.equals(ibVar.f643b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = ibVar.d();
        if ((d11 || d12) && !(d11 && d12 && this.f645c.equals(ibVar.f645c))) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = ibVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f641a.equals(ibVar.f641a))) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = ibVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f646d.equals(ibVar.f646d))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = ibVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f647e.equals(ibVar.f647e))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = ibVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f642a == ibVar.f642a)) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = ibVar.i();
        if ((i11 || i12) && !(i11 && i12 && this.f644b == ibVar.f644b)) {
            return false;
        }
        boolean j11 = j();
        boolean j12 = ibVar.j();
        if (j11 || j12) {
            return j11 && j12 && this.f637a == ibVar.f637a;
        }
        return true;
    }
}
