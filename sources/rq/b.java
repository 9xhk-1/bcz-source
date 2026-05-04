package rq;

import android.content.Context;
import android.util.Log;
import fr.k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mq.e;
import mq.f;
import mq.g;
import mq.h;
import mq.i;

/* loaded from: classes7.dex */
public class b extends mq.d {

    /* renamed from: d, reason: collision with root package name */
    public static List<qq.c> f84516d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map<String, mq.d> f84517e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static String f84518f;

    /* renamed from: a, reason: collision with root package name */
    public final e f84519a;

    /* renamed from: b, reason: collision with root package name */
    public final rq.d f84520b;

    /* renamed from: c, reason: collision with root package name */
    public final rq.d f84521c;

    public static class a implements i.a {
        @Override // mq.i.a
        public String a(e eVar) {
            String str;
            if (eVar.a().equals(mq.b.f73633c)) {
                str = "/agcgw_all/CN";
            } else if (eVar.a().equals(mq.b.f73635e)) {
                str = "/agcgw_all/RU";
            } else if (eVar.a().equals(mq.b.f73634d)) {
                str = "/agcgw_all/DE";
            } else {
                if (!eVar.a().equals(mq.b.f73636f)) {
                    return null;
                }
                str = "/agcgw_all/SG";
            }
            return eVar.getString(str);
        }
    }

    /* renamed from: rq.b$b, reason: collision with other inner class name */
    public static class C1056b implements i.a {
        @Override // mq.i.a
        public String a(e eVar) {
            String str;
            if (eVar.a().equals(mq.b.f73633c)) {
                str = "/agcgw_all/CN_back";
            } else if (eVar.a().equals(mq.b.f73635e)) {
                str = "/agcgw_all/RU_back";
            } else if (eVar.a().equals(mq.b.f73634d)) {
                str = "/agcgw_all/DE_back";
            } else {
                if (!eVar.a().equals(mq.b.f73636f)) {
                    return null;
                }
                str = "/agcgw_all/SG_back";
            }
            return eVar.getString(str);
        }
    }

    public class c implements tq.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f84522a;

        public c(h hVar) {
            this.f84522a = hVar;
        }

        @Override // tq.b
        public k<tq.d> a(boolean z11) {
            return this.f84522a.a(z11);
        }

        @Override // tq.b
        public k<tq.d> b() {
            return this.f84522a.a(false);
        }
    }

    public b(e eVar) {
        Log.d("AGC_Instance", "AGConnectInstanceImpl init");
        this.f84519a = eVar;
        if (f84516d == null) {
            Log.e("AGC_Instance", "please call `initialize()` first");
        }
        this.f84520b = new rq.d(f84516d, eVar.getContext());
        rq.d dVar = new rq.d(null, eVar.getContext());
        this.f84521c = dVar;
        if (eVar instanceof pq.d) {
            dVar.e(((pq.d) eVar).c(), eVar.getContext());
        }
        Log.d("AGC_Instance", "AGConnectInstanceImpl init end");
    }

    public static mq.d j() {
        String str = f84518f;
        return str == null ? k(pq.b.f81110c) : k(str);
    }

    public static synchronized mq.d k(String str) {
        mq.d dVar;
        synchronized (b.class) {
            try {
                dVar = f84517e.get(str);
                if (dVar == null) {
                    if (pq.b.f81110c.equals(str)) {
                        Log.w("AGC_Instance", "please call `initialize()` first");
                    } else {
                        Log.w("AGC_Instance", "not find instance for : " + str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public static mq.d l(e eVar) {
        return m(eVar, false);
    }

    public static synchronized mq.d m(e eVar, boolean z11) {
        mq.d dVar;
        synchronized (b.class) {
            Map<String, mq.d> map = f84517e;
            dVar = map.get(eVar.getIdentifier());
            if (dVar == null || z11) {
                dVar = new b(eVar);
                map.put(eVar.getIdentifier(), dVar);
            }
        }
        return dVar;
    }

    public static synchronized void n(Context context) {
        synchronized (b.class) {
            Log.w("AGC_Instance", "agc sdk initialize");
            if (f84517e.size() > 0) {
                Log.w("AGC_Instance", "Repeated invoking initialize");
            } else {
                o(context, oq.a.b(context));
            }
        }
    }

    public static synchronized void o(Context context, e eVar) {
        synchronized (b.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    Log.w("AGC_Instance", "context.getApplicationContext null");
                } else {
                    context = applicationContext;
                }
                s();
                if (f84516d == null) {
                    f84516d = new rq.c(context).a();
                }
                m(eVar, true);
                f84518f = eVar.getIdentifier();
                Log.i("AGC_Instance", "initFinish callback start");
                rq.a.c();
                Log.i("AGC_Instance", "AGC SDK initialize end");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void p(Context context, f fVar) {
        synchronized (b.class) {
            t(context, fVar);
            o(context, fVar.a(context));
        }
    }

    public static void s() {
        i.b("/agcgw/url", new a());
        i.b("/agcgw/backurl", new C1056b());
    }

    public static void t(Context context, f fVar) {
        oq.a b11 = oq.a.b(context);
        if (fVar.d() != null) {
            try {
                String g11 = pq.b.g(fVar.d(), "UTF-8");
                fVar.d().reset();
                b11.d(new ByteArrayInputStream(g11.getBytes(Charset.forName("UTF-8"))));
            } catch (IOException unused) {
                Log.e("AGC_Instance", "input stream set to AGConnectServicesConfig fail");
            }
        }
        for (Map.Entry<String, String> entry : fVar.c().entrySet()) {
            b11.f(entry.getKey(), entry.getValue());
        }
        if (fVar.e() != mq.b.f73632b) {
            b11.g(fVar.e());
        }
    }

    @Override // mq.d
    public Context b() {
        return this.f84519a.getContext();
    }

    @Override // mq.d
    public String c() {
        return this.f84519a.getIdentifier();
    }

    @Override // mq.d
    public e f() {
        return this.f84519a;
    }

    @Override // mq.d
    public <T> T g(Class<? super T> cls) {
        T t11 = (T) this.f84521c.a(this, cls);
        return t11 != null ? t11 : (T) this.f84520b.a(this, cls);
    }

    public void q(g gVar) {
        this.f84521c.e(Collections.singletonList(qq.c.e(tq.a.class, new d(gVar)).a()), this.f84519a.getContext());
    }

    public void r(h hVar) {
        this.f84521c.e(Collections.singletonList(qq.c.e(tq.b.class, new c(hVar)).a()), this.f84519a.getContext());
    }

    public class d implements tq.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f84524a;

        public d(g gVar) {
            this.f84524a = gVar;
        }

        @Override // tq.a
        public k<tq.d> a(boolean z11) {
            return this.f84524a.a(z11);
        }

        @Override // tq.a
        public k<tq.d> b() {
            return this.f84524a.a(false);
        }

        @Override // tq.a
        public String getUid() {
            return "";
        }

        @Override // tq.a
        public void c(tq.c cVar) {
        }

        @Override // tq.a
        public void d(tq.c cVar) {
        }
    }
}
