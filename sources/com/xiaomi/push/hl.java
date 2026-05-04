package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class hl implements is<hl, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f509a;

    /* renamed from: a, reason: collision with other field name */
    public String f510a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f511a = new BitSet(3);

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f512a;

    /* renamed from: a, reason: collision with other field name */
    public boolean f513a;

    /* renamed from: b, reason: collision with other field name */
    public long f514b;

    /* renamed from: b, reason: collision with other field name */
    public String f515b;

    /* renamed from: c, reason: collision with other field name */
    public String f516c;

    /* renamed from: d, reason: collision with other field name */
    public String f517d;

    /* renamed from: e, reason: collision with other field name */
    public String f518e;

    /* renamed from: f, reason: collision with other field name */
    public String f519f;

    /* renamed from: g, reason: collision with other field name */
    public String f520g;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f508a = new ji("ClientUploadDataItem");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45766a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45767b = new ja("", (byte) 11, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f45768c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f45769d = new ja("", (byte) 10, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f45770e = new ja("", (byte) 10, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f45771f = new ja("", (byte) 2, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f45772g = new ja("", (byte) 11, 7);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f45773h = new ja("", (byte) 11, 8);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f45774i = new ja("", (byte) 11, 9);

    /* renamed from: j, reason: collision with root package name */
    private static final ja f45775j = new ja("", (byte) 13, 10);

    /* renamed from: k, reason: collision with root package name */
    private static final ja f45776k = new ja("", (byte) 11, 11);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hl hlVar) {
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
        if (!getClass().equals(hlVar.getClass())) {
            return getClass().getName().compareTo(hlVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6017a()).compareTo(Boolean.valueOf(hlVar.m6017a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6017a() && (a22 = it.a(this.f510a, hlVar.f510a)) != 0) {
            return a22;
        }
        int compareTo2 = Boolean.valueOf(m6019b()).compareTo(Boolean.valueOf(hlVar.m6019b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m6019b() && (a21 = it.a(this.f515b, hlVar.f515b)) != 0) {
            return a21;
        }
        int compareTo3 = Boolean.valueOf(m6020c()).compareTo(Boolean.valueOf(hlVar.m6020c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m6020c() && (a19 = it.a(this.f516c, hlVar.f516c)) != 0) {
            return a19;
        }
        int compareTo4 = Boolean.valueOf(m6021d()).compareTo(Boolean.valueOf(hlVar.m6021d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m6021d() && (a18 = it.a(this.f509a, hlVar.f509a)) != 0) {
            return a18;
        }
        int compareTo5 = Boolean.valueOf(m6022e()).compareTo(Boolean.valueOf(hlVar.m6022e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m6022e() && (a17 = it.a(this.f514b, hlVar.f514b)) != 0) {
            return a17;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hlVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a16 = it.a(this.f513a, hlVar.f513a)) != 0) {
            return a16;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hlVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a15 = it.a(this.f517d, hlVar.f517d)) != 0) {
            return a15;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hlVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a14 = it.a(this.f518e, hlVar.f518e)) != 0) {
            return a14;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hlVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a13 = it.a(this.f519f, hlVar.f519f)) != 0) {
            return a13;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(hlVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a12 = it.a(this.f512a, hlVar.f512a)) != 0) {
            return a12;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(hlVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (!k() || (a11 = it.a(this.f520g, hlVar.f520g)) == 0) {
            return 0;
        }
        return a11;
    }

    public hl b(long j11) {
        this.f514b = j11;
        b(true);
        return this;
    }

    public hl c(String str) {
        this.f516c = str;
        return this;
    }

    public hl d(String str) {
        this.f517d = str;
        return this;
    }

    public hl e(String str) {
        this.f518e = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hl)) {
            return m6018a((hl) obj);
        }
        return false;
    }

    public hl f(String str) {
        this.f519f = str;
        return this;
    }

    public hl g(String str) {
        this.f520g = str;
        return this;
    }

    public boolean h() {
        return this.f518e != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f519f != null;
    }

    public boolean j() {
        return this.f512a != null;
    }

    public boolean k() {
        return this.f520g != null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("ClientUploadDataItem(");
        boolean z12 = false;
        if (m6017a()) {
            sb2.append("channel:");
            String str = this.f510a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (m6019b()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("data:");
            String str2 = this.f515b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
            z11 = false;
        }
        if (m6020c()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("name:");
            String str3 = this.f516c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
            z11 = false;
        }
        if (m6021d()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("counter:");
            sb2.append(this.f509a);
            z11 = false;
        }
        if (m6022e()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("timestamp:");
            sb2.append(this.f514b);
            z11 = false;
        }
        if (f()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("fromSdk:");
            sb2.append(this.f513a);
            z11 = false;
        }
        if (g()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("category:");
            String str4 = this.f517d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
            z11 = false;
        }
        if (h()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("sourcePackage:");
            String str5 = this.f518e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
            z11 = false;
        }
        if (i()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("id:");
            String str6 = this.f519f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
            z11 = false;
        }
        if (j()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("extra:");
            Map<String, String> map = this.f512a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        } else {
            z12 = z11;
        }
        if (k()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("pkgName:");
            String str7 = this.f520g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public long a() {
        return this.f514b;
    }

    public hl b(String str) {
        this.f515b = str;
        return this;
    }

    public String c() {
        return this.f518e;
    }

    public String d() {
        return this.f519f;
    }

    public String e() {
        return this.f520g;
    }

    public boolean f() {
        return this.f511a.get(2);
    }

    public boolean g() {
        return this.f517d != null;
    }

    public hl a(long j11) {
        this.f509a = j11;
        m6016a(true);
        return this;
    }

    public String b() {
        return this.f516c;
    }

    public void c(boolean z11) {
        this.f511a.set(2, z11);
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m6021d() {
        return this.f511a.get(0);
    }

    /* renamed from: e, reason: collision with other method in class */
    public boolean m6022e() {
        return this.f511a.get(1);
    }

    public hl a(String str) {
        this.f510a = str;
        return this;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6015a();
        jdVar.a(f508a);
        if (this.f510a != null && m6017a()) {
            jdVar.a(f45766a);
            jdVar.a(this.f510a);
            jdVar.b();
        }
        if (this.f515b != null && m6019b()) {
            jdVar.a(f45767b);
            jdVar.a(this.f515b);
            jdVar.b();
        }
        if (this.f516c != null && m6020c()) {
            jdVar.a(f45768c);
            jdVar.a(this.f516c);
            jdVar.b();
        }
        if (m6021d()) {
            jdVar.a(f45769d);
            jdVar.a(this.f509a);
            jdVar.b();
        }
        if (m6022e()) {
            jdVar.a(f45770e);
            jdVar.a(this.f514b);
            jdVar.b();
        }
        if (f()) {
            jdVar.a(f45771f);
            jdVar.a(this.f513a);
            jdVar.b();
        }
        if (this.f517d != null && g()) {
            jdVar.a(f45772g);
            jdVar.a(this.f517d);
            jdVar.b();
        }
        if (this.f518e != null && h()) {
            jdVar.a(f45773h);
            jdVar.a(this.f518e);
            jdVar.b();
        }
        if (this.f519f != null && i()) {
            jdVar.a(f45774i);
            jdVar.a(this.f519f);
            jdVar.b();
        }
        if (this.f512a != null && j()) {
            jdVar.a(f45775j);
            jdVar.a(new jc((byte) 11, (byte) 11, this.f512a.size()));
            for (Map.Entry<String, String> entry : this.f512a.entrySet()) {
                jdVar.a(entry.getKey());
                jdVar.a(entry.getValue());
            }
            jdVar.d();
            jdVar.b();
        }
        if (this.f520g != null && k()) {
            jdVar.a(f45776k);
            jdVar.a(this.f520g);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m6020c() {
        return this.f516c != null;
    }

    public hl a(Map<String, String> map) {
        this.f512a = map;
        return this;
    }

    public void b(boolean z11) {
        this.f511a.set(1, z11);
    }

    public hl a(boolean z11) {
        this.f513a = z11;
        c(true);
        return this;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6019b() {
        return this.f515b != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m6013a() {
        return this.f510a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, String> m6014a() {
        return this.f512a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6015a() {
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                m6015a();
                return;
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 11) {
                        this.f510a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 11) {
                        this.f515b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f516c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 10) {
                        this.f509a = jdVar.mo6156a();
                        m6016a(true);
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 10) {
                        this.f514b = jdVar.mo6156a();
                        b(true);
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 2) {
                        this.f513a = jdVar.mo6167a();
                        c(true);
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f517d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 11) {
                        this.f518e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 9:
                    if (b11 == 11) {
                        this.f519f = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 10:
                    if (b11 == 13) {
                        jc mo6159a = jdVar.mo6159a();
                        this.f512a = new HashMap(mo6159a.f845a * 2);
                        for (int i11 = 0; i11 < mo6159a.f845a; i11++) {
                            this.f512a.put(jdVar.mo6162a(), jdVar.mo6162a());
                        }
                        jdVar.h();
                        break;
                    }
                    break;
                case 11:
                    if (b11 == 11) {
                        this.f520g = jdVar.mo6162a();
                        continue;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public void a(String str, String str2) {
        if (this.f512a == null) {
            this.f512a = new HashMap();
        }
        this.f512a.put(str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6016a(boolean z11) {
        this.f511a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6017a() {
        return this.f510a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6018a(hl hlVar) {
        if (hlVar == null) {
            return false;
        }
        boolean m6017a = m6017a();
        boolean m6017a2 = hlVar.m6017a();
        if ((m6017a || m6017a2) && !(m6017a && m6017a2 && this.f510a.equals(hlVar.f510a))) {
            return false;
        }
        boolean m6019b = m6019b();
        boolean m6019b2 = hlVar.m6019b();
        if ((m6019b || m6019b2) && !(m6019b && m6019b2 && this.f515b.equals(hlVar.f515b))) {
            return false;
        }
        boolean m6020c = m6020c();
        boolean m6020c2 = hlVar.m6020c();
        if ((m6020c || m6020c2) && !(m6020c && m6020c2 && this.f516c.equals(hlVar.f516c))) {
            return false;
        }
        boolean m6021d = m6021d();
        boolean m6021d2 = hlVar.m6021d();
        if ((m6021d || m6021d2) && !(m6021d && m6021d2 && this.f509a == hlVar.f509a)) {
            return false;
        }
        boolean m6022e = m6022e();
        boolean m6022e2 = hlVar.m6022e();
        if ((m6022e || m6022e2) && !(m6022e && m6022e2 && this.f514b == hlVar.f514b)) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = hlVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f513a == hlVar.f513a)) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = hlVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f517d.equals(hlVar.f517d))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = hlVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f518e.equals(hlVar.f518e))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = hlVar.i();
        if ((i11 || i12) && !(i11 && i12 && this.f519f.equals(hlVar.f519f))) {
            return false;
        }
        boolean j11 = j();
        boolean j12 = hlVar.j();
        if ((j11 || j12) && !(j11 && j12 && this.f512a.equals(hlVar.f512a))) {
            return false;
        }
        boolean k11 = k();
        boolean k12 = hlVar.k();
        if (k11 || k12) {
            return k11 && k12 && this.f520g.equals(hlVar.f520g);
        }
        return true;
    }
}
