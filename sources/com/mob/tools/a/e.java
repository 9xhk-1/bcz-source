package com.mob.tools.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.view.View;
import com.mob.tools.MobLog;
import com.mob.tools.utils.ReflectHelper;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class e implements com.mob.tools.a.a {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f41176a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f41177b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private Context f41178c;

    /* renamed from: d, reason: collision with root package name */
    private b f41179d;

    public static abstract class a<T> {

        /* renamed from: e, reason: collision with root package name */
        public T f41296e;

        /* renamed from: f, reason: collision with root package name */
        public int f41297f;

        public a(T t11) {
            this(t11, 1);
        }

        public abstract T b() throws Throwable;

        public a(T t11, int i11) {
            this.f41296e = t11;
            this.f41297f = i11;
        }
    }

    public e(Context context) {
        this.f41178c = context;
        this.f41179d = b.a(context);
    }

    @Override // com.mob.tools.a.a
    public String[] A() {
        return (String[]) a("ieia", new a<String[]>(null) { // from class: com.mob.tools.a.e.23
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String[] b() throws Throwable {
                return e.this.f41179d.i();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String B() {
        return (String) a("bne", new a<String>(null) { // from class: com.mob.tools.a.e.25
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.v();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public int C() {
        return ((Integer) a((String) null, new a<Integer>(-1) { // from class: com.mob.tools.a.e.26
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.K());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int D() {
        return ((Integer) a((String) null, new a<Integer>(-1) { // from class: com.mob.tools.a.e.27
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.L());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int E() {
        return ((Integer) a((String) null, new a<Integer>(-1) { // from class: com.mob.tools.a.e.28
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.M());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int F() {
        return ((Integer) a((String) null, new a<Integer>(-1) { // from class: com.mob.tools.a.e.29
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.N());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int G() {
        return ((Integer) a((String) null, new a<Integer>(-1) { // from class: com.mob.tools.a.e.30
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.O());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int H() {
        return ((Integer) a((String) null, new a<Integer>(-1) { // from class: com.mob.tools.a.e.31
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.P());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int I() {
        return ((Integer) a((String) null, new a<Integer>(-1) { // from class: com.mob.tools.a.e.32
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.Q());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int J() {
        return ((Integer) a((String) null, new a<Integer>(-1) { // from class: com.mob.tools.a.e.33
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.R());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, Object>> K() {
        return (ArrayList) a((String) null, new a<ArrayList<HashMap<String, Object>>>(null) { // from class: com.mob.tools.a.e.34
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ArrayList<HashMap<String, Object>> b() throws Throwable {
                return e.this.f41179d.S();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> L() {
        return (HashMap) a((String) null, new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.a.e.36
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, Object> b() throws Throwable {
                return e.this.f41179d.W();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, Object>> M() {
        return (ArrayList) a((String) null, new a<ArrayList<HashMap<String, Object>>>(null) { // from class: com.mob.tools.a.e.37
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ArrayList<HashMap<String, Object>> b() throws Throwable {
                return e.this.f41179d.X();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean N() {
        return ((Boolean) a((String) null, new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.38
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() throws Throwable {
                return Boolean.valueOf(e.this.f41179d.Y());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public int O() {
        return ((Integer) a("ovit", new a<Integer>(-1) { // from class: com.mob.tools.a.e.39
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.m());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public String P() {
        return (String) a("ovne", new a<String>(null) { // from class: com.mob.tools.a.e.40
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.n();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String Q() {
        return (String) a("ole", new a<String>(null) { // from class: com.mob.tools.a.e.41
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.o();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String R() {
        return (String) a("ocy", new a<String>(null) { // from class: com.mob.tools.a.e.42
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.q();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> S() {
        return (HashMap) a("cio0", new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.a.e.43
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, Object> b() throws Throwable {
                return e.this.f41179d.Z();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<ArrayList<String>> T() {
        return (ArrayList) a("tdio", new a<ArrayList<ArrayList<String>>>(null) { // from class: com.mob.tools.a.e.44
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ArrayList<ArrayList<String>> b() throws Throwable {
                return e.this.f41179d.aa();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public int U() {
        return ((Integer) a((String) null, new a<Integer>(-1) { // from class: com.mob.tools.a.e.47
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.ab());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int V() {
        return ((Integer) a((String) null, new a<Integer>(-1) { // from class: com.mob.tools.a.e.48
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.ac());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public String W() {
        return (String) a("qkl", new a<String>(null) { // from class: com.mob.tools.a.e.49
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.ad();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, HashMap<String, Long>> X() {
        return (HashMap) a("siio", new a<HashMap<String, HashMap<String, Long>>>(null) { // from class: com.mob.tools.a.e.50
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, HashMap<String, Long>> b() throws Throwable {
                return e.this.f41179d.ae();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Long> Y() {
        return (HashMap) a("meio", new a<HashMap<String, Long>>(null) { // from class: com.mob.tools.a.e.51
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, Long> b() throws Throwable {
                return e.this.f41179d.af();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public int Z() {
        return ((Integer) a("alct", new a<Integer>(-1) { // from class: com.mob.tools.a.e.52
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.ah());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public String aA() {
        return (String) a("snm", new a<String>(null) { // from class: com.mob.tools.a.e.87
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.w();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aB() {
        return (String) a("pne", new a<String>(null) { // from class: com.mob.tools.a.e.90
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.C();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aC() {
        return (String) a("ane", new a<String>(null) { // from class: com.mob.tools.a.e.91
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.D();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public int aD() {
        return ((Integer) a("avn", new a<Integer>(-1) { // from class: com.mob.tools.a.e.93
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.E());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public String aE() {
        return (String) a("avne", new a<String>(null) { // from class: com.mob.tools.a.e.94
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.F();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean aF() {
        return ((Boolean) a("imp", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.95
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() throws Throwable {
                return Boolean.valueOf(e.this.f41179d.aJ());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String aG() {
        return (String) a("cpne", new a<String>(null) { // from class: com.mob.tools.a.e.96
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.aK();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public Object aH() {
        return a("catd", new a<Object>(null) { // from class: com.mob.tools.a.e.98
            @Override // com.mob.tools.a.e.a
            public Object b() throws Throwable {
                return e.this.f41179d.U();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public Context aI() {
        return (Context) a((String) null, new a<Context>(null) { // from class: com.mob.tools.a.e.99
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Context b() throws Throwable {
                if (e.this.f41178c != null) {
                    return e.this.f41178c;
                }
                Context V = e.this.f41179d.V();
                if (V != null) {
                    e.this.f41178c = V;
                }
                return V;
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aJ() {
        return this.f41179d.k();
    }

    @Override // com.mob.tools.a.a
    public String aK() {
        return this.f41179d.l();
    }

    @Override // com.mob.tools.a.a
    public long aL() {
        return this.f41179d.aL();
    }

    @Override // com.mob.tools.a.a
    public String aa() {
        return (String) a("ale", new a<String>(null) { // from class: com.mob.tools.a.e.53
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.p();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ab() {
        return (String) a("sse", new a<String>(null) { // from class: com.mob.tools.a.e.54
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.r();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ac() {
        return (String) a("nte", new a<String>(null) { // from class: com.mob.tools.a.e.55
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.x();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ad() {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.e.56
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.z();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ae() {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.e.58
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.A();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean af() {
        return ((Boolean) a((String) null, new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.59
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() throws Throwable {
                return Boolean.valueOf(e.this.f41179d.y());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public int ag() {
        return ((Integer) a((String) null, new a<Integer>(-1) { // from class: com.mob.tools.a.e.60
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(e.this.f41179d.aB());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, String>> ah() {
        return (ArrayList) a("carn", new a<ArrayList<HashMap<String, String>>>(null) { // from class: com.mob.tools.a.e.61
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ArrayList<HashMap<String, String>> b() throws Throwable {
                return e.this.f41179d.ar();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ai() {
        return (String) a("tize", new a<String>(null) { // from class: com.mob.tools.a.e.62
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.as();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> aj() {
        return (HashMap) a("surt", new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.a.e.63
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, Object> b() throws Throwable {
                return e.this.f41179d.at();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, String> ak() {
        return (HashMap) a("cpfq", new a<HashMap<String, String>>(null) { // from class: com.mob.tools.a.e.64
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, String> b() throws Throwable {
                return e.this.f41179d.au();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String al() {
        return (String) a("cpte", new a<String>(null) { // from class: com.mob.tools.a.e.65
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.av();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String am() {
        return (String) a("flvr", new a<String>(null) { // from class: com.mob.tools.a.e.66
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.aw();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> an() {
        return (HashMap) a("trfc", new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.a.e.67
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, Object> b() throws Throwable {
                return e.this.f41179d.ax();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ao() {
        return (String) a("babd", new a<String>(null) { // from class: com.mob.tools.a.e.69
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.ay();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ap() {
        return (String) a("bfsp", new a<String>(null) { // from class: com.mob.tools.a.e.70
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.az();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aq() {
        return (String) a("bopm", new a<String>(null) { // from class: com.mob.tools.a.e.71
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.aA();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> ar() {
        return (HashMap) a("dmue", new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.a.e.72
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, Object> b() throws Throwable {
                return e.this.f41179d.aH();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String as() {
        try {
            Enumeration<NetworkInterface> c11 = g.a(this.f41178c).a().c();
            while (c11.hasMoreElements()) {
                Enumeration<InetAddress> a11 = g.a(this.f41178c).a().a(c11.nextElement());
                while (a11.hasMoreElements()) {
                    InetAddress nextElement = a11.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        return nextElement.getHostAddress();
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, String>> at() {
        return (ArrayList) a((String) null, new a<ArrayList<HashMap<String, String>>>(null) { // from class: com.mob.tools.a.e.74
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ArrayList<HashMap<String, String>> b() throws Throwable {
                return e.this.f41179d.a(true, true, true);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String au() {
        return (String) a("ded0", new a<String>(null) { // from class: com.mob.tools.a.e.77
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.f();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String av() {
        return (String) a("deky", new a<String>(null) { // from class: com.mob.tools.a.e.79
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.B();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aw() {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.e.82
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.aC();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> ax() {
        return (HashMap) a((String) null, new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.a.e.83
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, Object> b() throws Throwable {
                return e.this.f41179d.aD();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, Object>> ay() {
        return (ArrayList) a((String) null, new a<ArrayList<HashMap<String, Object>>>(null) { // from class: com.mob.tools.a.e.84
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ArrayList<HashMap<String, Object>> b() throws Throwable {
                return e.this.f41179d.aE();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String az() {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.e.86
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.G();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean c() {
        return ((Boolean) a("pd0", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.24
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(e.this.f41179d.aj());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public List<String> d(String str) {
        return null;
    }

    @Override // com.mob.tools.a.a
    public boolean e() {
        return ((Boolean) a("vn0", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.46
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(e.this.f41179d.an());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean f() {
        return ((Boolean) a("ua0", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.57
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(e.this.f41179d.am());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean g() {
        return ((Boolean) a("dee1", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.68
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(e.this.f41179d.al());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean h() {
        return ((Boolean) a("uee", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.78
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(e.this.f41179d.ak());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean i() {
        return ((Boolean) a("wpy", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.89
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(e.this.f41179d.ap());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean j() {
        return ((Boolean) a("smlt", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.2
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(e.this.f41179d.aG());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean k() {
        return ((Boolean) a("sde", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.6
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(e.this.f41179d.aI());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String l() {
        return (String) a("sln", new a<String>(null) { // from class: com.mob.tools.a.e.7
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() {
                return e.this.f41179d.j();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String m() {
        return (String) a("agi", new a<String>(null) { // from class: com.mob.tools.a.e.8
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.H();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String n() {
        return a(false);
    }

    @Override // com.mob.tools.a.a
    public String o() {
        return b(false);
    }

    @Override // com.mob.tools.a.a
    public String[] p() {
        return (String[]) a("isia", new a<String[]>(null) { // from class: com.mob.tools.a.e.11
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String[] b() throws Throwable {
                return e.this.f41179d.J();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String q() {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.e.12
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.b();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String r() {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.e.13
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.c();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String s() {
        return (String) a("car", new a<String>(null) { // from class: com.mob.tools.a.e.15
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.s();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String t() {
        return (String) a("cne", new a<String>(null) { // from class: com.mob.tools.a.e.16
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.t();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String u() {
        return (String) a("ssnr", new a<String>(null) { // from class: com.mob.tools.a.e.17
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.u();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String v() {
        return (String) a("mvn", new a<String>(null) { // from class: com.mob.tools.a.e.18
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.ag();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String w() {
        return (String) a("mol", new a<String>(null) { // from class: com.mob.tools.a.e.19
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.d();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String x() {
        return (String) a("mar", new a<String>(null) { // from class: com.mob.tools.a.e.20
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.e();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String y() {
        return (String) a("brd", new a<String>(null) { // from class: com.mob.tools.a.e.21
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.aF();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String z() {
        return (String) a("dte", new a<String>(null) { // from class: com.mob.tools.a.e.22
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.T();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean b() {
        return ((Boolean) a("cx0", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.14
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(e.this.f41179d.ai());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, String>> c(final boolean z11) {
        return (ArrayList) a((String) null, new a<ArrayList<HashMap<String, String>>>(null) { // from class: com.mob.tools.a.e.73
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ArrayList<HashMap<String, String>> b() throws Throwable {
                return e.this.f41179d.a(false, z11, true);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean d() {
        return ((Boolean) a("dee", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.35
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(e.this.f41179d.ao());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean e(final String str) {
        return ((Boolean) a((String) null, new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.85
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() throws Throwable {
                return Boolean.valueOf(e.this.f41179d.h(str));
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String f(final String str) {
        return (String) a("snm_" + str, new a<String>(null) { // from class: com.mob.tools.a.e.88
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.c(str);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String g(final String str) {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.e.92
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.e(str);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean h(final String str) {
        return ((Boolean) a((String) null, new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.97
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() throws Throwable {
                return Boolean.valueOf(e.this.f41179d.f(str));
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean a() {
        return ((Boolean) a("ird", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.1
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(e.this.f41179d.a());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String b(boolean z11) {
        return (String) a("isi", new a<String>(null) { // from class: com.mob.tools.a.e.10
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.I();
            }
        }, z11);
    }

    @Override // com.mob.tools.a.a
    public String c(final String str) {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.e.81
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.g(str);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String d(final boolean z11) {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.e.80
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.a(z11);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean a(final String str) {
        return ((Boolean) a("fps", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.5
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(e.this.f41179d.j(str));
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String b(final String str) {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.e.76
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.b(str);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String a(boolean z11) {
        return (String) a("iei", new a<String>(null) { // from class: com.mob.tools.a.e.9
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return e.this.f41179d.h();
            }
        }, z11);
    }

    @Override // com.mob.tools.a.a
    public ResolveInfo b(final Intent intent, final int i11) {
        return (ResolveInfo) a((String) null, new a<ResolveInfo>(null) { // from class: com.mob.tools.a.e.4
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResolveInfo b() throws Throwable {
                return g.a(e.this.f41178c).a().b(intent, i11);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public void a(final ReflectHelper.a<HashMap<String, Object>, Void> aVar) {
        a((String) null, new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.e.45
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() throws Throwable {
                e.this.f41179d.a(aVar);
                return Boolean.TRUE;
            }
        });
    }

    @Override // com.mob.tools.a.a
    public void b(View view) {
        this.f41179d.b(view);
    }

    @Override // com.mob.tools.a.a
    public Location a(final int i11, final int i12, final boolean z11) {
        return (Location) a((String) null, new a<Location>(null) { // from class: com.mob.tools.a.e.75
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Location b() throws Throwable {
                return e.this.f41179d.a(i11, i12, z11);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public List<ResolveInfo> a(final Intent intent, final int i11) {
        return (List) a((String) null, new a<List<ResolveInfo>>(null) { // from class: com.mob.tools.a.e.3
            @Override // com.mob.tools.a.e.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List<ResolveInfo> b() throws Throwable {
                return g.a(e.this.f41178c).a().a(intent, i11);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public PackageInfo a(String str, int i11) throws PackageManager.NameNotFoundException {
        return g.a(this.f41178c).a().a(str, i11);
    }

    @Override // com.mob.tools.a.a
    public void a(View view) {
        this.f41179d.a(view);
    }

    @Override // com.mob.tools.a.a
    public String a(String str, String str2) {
        return this.f41179d.a(str, str2);
    }

    private <T> T a(String str, a<T> aVar) {
        return (T) a(str, (a) aVar, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T> T a(java.lang.String r5, com.mob.tools.a.e.a<T> r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto La
            java.lang.Object r5 = r6.b()     // Catch: java.lang.Throwable -> L8
            goto L5a
        L8:
            r5 = move-exception
            goto L52
        La:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r1 = r4.f41177b     // Catch: java.lang.Throwable -> L8
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L8
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L8
            if (r1 == 0) goto L29
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r2 = r4.f41176a     // Catch: java.lang.Throwable -> L8
            java.lang.Object r0 = r2.get(r5)     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L29
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L8
            int r3 = r6.f41297f     // Catch: java.lang.Throwable -> L8
            if (r2 < r3) goto L29
            if (r7 != 0) goto L29
            T r5 = r6.f41296e     // Catch: java.lang.Throwable -> L8
            return r5
        L29:
            if (r0 != 0) goto L59
            java.lang.Object r0 = r6.b()     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto L36
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r7 = r4.f41176a     // Catch: java.lang.Throwable -> L8
            r7.put(r5, r0)     // Catch: java.lang.Throwable -> L8
        L36:
            r7 = 1
            if (r1 != 0) goto L43
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r1 = r4.f41177b     // Catch: java.lang.Throwable -> L8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L8
            r1.put(r5, r7)     // Catch: java.lang.Throwable -> L8
            goto L59
        L43:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r2 = r4.f41177b     // Catch: java.lang.Throwable -> L8
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L8
            int r1 = r1 + r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L8
            r2.put(r5, r7)     // Catch: java.lang.Throwable -> L8
            goto L59
        L52:
            com.mob.tools.log.NLog r7 = com.mob.tools.MobLog.getInstance()
            r7.d(r5)
        L59:
            r5 = r0
        L5a:
            if (r5 != 0) goto L5e
            T r5 = r6.f41296e
        L5e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.e.a(java.lang.String, com.mob.tools.a.e$a, boolean):java.lang.Object");
    }
}
