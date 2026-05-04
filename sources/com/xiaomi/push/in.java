package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class in implements is<in, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f788a;

    /* renamed from: a, reason: collision with other field name */
    public hw f789a;

    /* renamed from: a, reason: collision with other field name */
    public String f790a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f791a = new BitSet(2);

    /* renamed from: a, reason: collision with other field name */
    public boolean f792a = true;

    /* renamed from: b, reason: collision with other field name */
    public String f793b;

    /* renamed from: c, reason: collision with other field name */
    public String f794c;

    /* renamed from: d, reason: collision with other field name */
    public String f795d;

    /* renamed from: e, reason: collision with other field name */
    public String f796e;

    /* renamed from: f, reason: collision with other field name */
    public String f797f;

    /* renamed from: g, reason: collision with other field name */
    public String f798g;

    /* renamed from: h, reason: collision with other field name */
    public String f799h;

    /* renamed from: i, reason: collision with other field name */
    public String f800i;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f787a = new ji("XmPushActionUnRegistration");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46109a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f46110b = new ja("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f46111c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f46112d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f46113e = new ja("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f46114f = new ja("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f46115g = new ja("", (byte) 11, 7);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f46116h = new ja("", (byte) 11, 8);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f46117i = new ja("", (byte) 11, 9);

    /* renamed from: j, reason: collision with root package name */
    private static final ja f46118j = new ja("", (byte) 11, 10);

    /* renamed from: k, reason: collision with root package name */
    private static final ja f46119k = new ja("", (byte) 2, 11);

    /* renamed from: l, reason: collision with root package name */
    private static final ja f46120l = new ja("", (byte) 10, 12);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(in inVar) {
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
        int a22;
        int a23;
        if (!getClass().equals(inVar.getClass())) {
            return getClass().getName().compareTo(inVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6139a()).compareTo(Boolean.valueOf(inVar.m6139a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6139a() && (a23 = it.a(this.f790a, inVar.f790a)) != 0) {
            return a23;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(inVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a22 = it.a(this.f789a, inVar.f789a)) != 0) {
            return a22;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(inVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a21 = it.a(this.f793b, inVar.f793b)) != 0) {
            return a21;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(inVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a19 = it.a(this.f794c, inVar.f794c)) != 0) {
            return a19;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(inVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a18 = it.a(this.f795d, inVar.f795d)) != 0) {
            return a18;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(inVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a17 = it.a(this.f796e, inVar.f796e)) != 0) {
            return a17;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(inVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a16 = it.a(this.f797f, inVar.f797f)) != 0) {
            return a16;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(inVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a15 = it.a(this.f798g, inVar.f798g)) != 0) {
            return a15;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(inVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a14 = it.a(this.f799h, inVar.f799h)) != 0) {
            return a14;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(inVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a13 = it.a(this.f800i, inVar.f800i)) != 0) {
            return a13;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(inVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a12 = it.a(this.f792a, inVar.f792a)) != 0) {
            return a12;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(inVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!l() || (a11 = it.a(this.f788a, inVar.f788a)) == 0) {
            return 0;
        }
        return a11;
    }

    public in b(String str) {
        this.f794c = str;
        return this;
    }

    public in c(String str) {
        this.f795d = str;
        return this;
    }

    public in d(String str) {
        this.f797f = str;
        return this;
    }

    public in e(String str) {
        this.f798g = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof in)) {
            return m6140a((in) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f796e != null;
    }

    public boolean g() {
        return this.f797f != null;
    }

    public boolean h() {
        return this.f798g != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f799h != null;
    }

    public boolean j() {
        return this.f800i != null;
    }

    public boolean k() {
        return this.f791a.get(0);
    }

    public boolean l() {
        return this.f791a.get(1);
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("XmPushActionUnRegistration(");
        boolean z12 = false;
        if (m6139a()) {
            sb2.append("debug:");
            String str = this.f790a;
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
            hw hwVar = this.f789a;
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
        String str2 = this.f793b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("appId:");
        String str3 = this.f794c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (e()) {
            sb2.append(j2.O);
            sb2.append("regId:");
            String str4 = this.f795d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (f()) {
            sb2.append(j2.O);
            sb2.append("appVersion:");
            String str5 = this.f796e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str6 = this.f797f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("token:");
            String str7 = this.f798g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("deviceId:");
            String str8 = this.f799h;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (j()) {
            sb2.append(j2.O);
            sb2.append("aliasName:");
            String str9 = this.f800i;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        if (k()) {
            sb2.append(j2.O);
            sb2.append("needAck:");
            sb2.append(this.f792a);
        }
        if (l()) {
            sb2.append(j2.O);
            sb2.append("createdTs:");
            sb2.append(this.f788a);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public in a(String str) {
        this.f793b = str;
        return this;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        a();
        jdVar.a(f787a);
        if (this.f790a != null && m6139a()) {
            jdVar.a(f46109a);
            jdVar.a(this.f790a);
            jdVar.b();
        }
        if (this.f789a != null && b()) {
            jdVar.a(f46110b);
            this.f789a.b(jdVar);
            jdVar.b();
        }
        if (this.f793b != null) {
            jdVar.a(f46111c);
            jdVar.a(this.f793b);
            jdVar.b();
        }
        if (this.f794c != null) {
            jdVar.a(f46112d);
            jdVar.a(this.f794c);
            jdVar.b();
        }
        if (this.f795d != null && e()) {
            jdVar.a(f46113e);
            jdVar.a(this.f795d);
            jdVar.b();
        }
        if (this.f796e != null && f()) {
            jdVar.a(f46114f);
            jdVar.a(this.f796e);
            jdVar.b();
        }
        if (this.f797f != null && g()) {
            jdVar.a(f46115g);
            jdVar.a(this.f797f);
            jdVar.b();
        }
        if (this.f798g != null && h()) {
            jdVar.a(f46116h);
            jdVar.a(this.f798g);
            jdVar.b();
        }
        if (this.f799h != null && i()) {
            jdVar.a(f46117i);
            jdVar.a(this.f799h);
            jdVar.b();
        }
        if (this.f800i != null && j()) {
            jdVar.a(f46118j);
            jdVar.a(this.f800i);
            jdVar.b();
        }
        if (k()) {
            jdVar.a(f46119k);
            jdVar.a(this.f792a);
            jdVar.b();
        }
        if (l()) {
            jdVar.a(f46120l);
            jdVar.a(this.f788a);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public boolean c() {
        return this.f793b != null;
    }

    public boolean d() {
        return this.f794c != null;
    }

    public boolean e() {
        return this.f795d != null;
    }

    public void a() {
        if (this.f793b == null) {
            throw new je("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f794c != null) {
            return;
        }
        throw new je("Required field 'appId' was not present! Struct: " + toString());
    }

    public void b(boolean z11) {
        this.f791a.set(1, z11);
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
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 11) {
                        this.f790a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f789a = hwVar;
                        hwVar.a(jdVar);
                        break;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f793b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f794c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 11) {
                        this.f795d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 11) {
                        this.f796e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f797f = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 11) {
                        this.f798g = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 9:
                    if (b11 == 11) {
                        this.f799h = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 10:
                    if (b11 == 11) {
                        this.f800i = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 11:
                    if (b11 == 2) {
                        this.f792a = jdVar.mo6167a();
                        a(true);
                        break;
                    }
                    break;
                case 12:
                    if (b11 == 10) {
                        this.f788a = jdVar.mo6156a();
                        b(true);
                        break;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public boolean b() {
        return this.f789a != null;
    }

    public void a(boolean z11) {
        this.f791a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6139a() {
        return this.f790a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6140a(in inVar) {
        if (inVar == null) {
            return false;
        }
        boolean m6139a = m6139a();
        boolean m6139a2 = inVar.m6139a();
        if ((m6139a || m6139a2) && !(m6139a && m6139a2 && this.f790a.equals(inVar.f790a))) {
            return false;
        }
        boolean b11 = b();
        boolean b12 = inVar.b();
        if ((b11 || b12) && !(b11 && b12 && this.f789a.m6057a(inVar.f789a))) {
            return false;
        }
        boolean c11 = c();
        boolean c12 = inVar.c();
        if ((c11 || c12) && !(c11 && c12 && this.f793b.equals(inVar.f793b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = inVar.d();
        if ((d11 || d12) && !(d11 && d12 && this.f794c.equals(inVar.f794c))) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = inVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f795d.equals(inVar.f795d))) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = inVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f796e.equals(inVar.f796e))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = inVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f797f.equals(inVar.f797f))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = inVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f798g.equals(inVar.f798g))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = inVar.i();
        if ((i11 || i12) && !(i11 && i12 && this.f799h.equals(inVar.f799h))) {
            return false;
        }
        boolean j11 = j();
        boolean j12 = inVar.j();
        if ((j11 || j12) && !(j11 && j12 && this.f800i.equals(inVar.f800i))) {
            return false;
        }
        boolean k11 = k();
        boolean k12 = inVar.k();
        if ((k11 || k12) && !(k11 && k12 && this.f792a == inVar.f792a)) {
            return false;
        }
        boolean l11 = l();
        boolean l12 = inVar.l();
        if (l11 || l12) {
            return l11 && l12 && this.f788a == inVar.f788a;
        }
        return true;
    }
}
