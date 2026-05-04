package pq;

import android.content.Context;
import android.util.Log;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import mq.i;

/* loaded from: classes7.dex */
public class e extends oq.a {

    /* renamed from: c, reason: collision with root package name */
    public final Context f81124c;

    /* renamed from: d, reason: collision with root package name */
    public final String f81125d;

    /* renamed from: e, reason: collision with root package name */
    public oq.e f81126e;

    /* renamed from: f, reason: collision with root package name */
    public volatile oq.c f81127f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f81128g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public mq.b f81129h = mq.b.f73632b;

    /* renamed from: i, reason: collision with root package name */
    public final Map<String, String> f81130i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public volatile g f81131j;

    public static class a extends oq.e {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InputStream f81132c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, InputStream inputStream) {
            super(context);
            this.f81132c = inputStream;
        }

        @Override // oq.e
        public InputStream b(Context context) {
            return this.f81132c;
        }
    }

    public e(Context context, String str) {
        this.f81124c = context;
        this.f81125d = str;
    }

    public static String h(String str) {
        int i11 = 0;
        if (str.length() > 0) {
            while (str.charAt(i11) == '/') {
                i11++;
            }
        }
        return '/' + str.substring(i11);
    }

    public static oq.e i(Context context, InputStream inputStream) {
        return new a(context, inputStream);
    }

    @Override // mq.e
    public mq.b a() {
        Log.d("AGC_ConfigImpl", "getRoutePolicy");
        if (this.f81129h == null) {
            this.f81129h = mq.b.f73632b;
        }
        mq.b bVar = this.f81129h;
        mq.b bVar2 = mq.b.f73632b;
        if (bVar == bVar2 && this.f81127f == null) {
            j();
        }
        mq.b bVar3 = this.f81129h;
        return bVar3 == null ? bVar2 : bVar3;
    }

    @Override // oq.a
    public void d(InputStream inputStream) {
        e(i(this.f81124c, inputStream));
    }

    @Override // oq.a
    public void e(oq.e eVar) {
        this.f81126e = eVar;
    }

    @Override // oq.a
    public void f(String str, String str2) {
        this.f81130i.put(b.e(str), str2);
    }

    @Override // oq.a
    public void g(mq.b bVar) {
        this.f81129h = bVar;
    }

    @Override // mq.e
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // mq.e
    public Context getContext() {
        return this.f81124c;
    }

    @Override // mq.e
    public String getIdentifier() {
        return b.f81110c;
    }

    @Override // mq.e
    public int getInt(String str) {
        return getInt(str, 0);
    }

    @Override // mq.e
    public String getPackageName() {
        return this.f81125d;
    }

    @Override // mq.e
    public String getString(String str) {
        return getString(str, null);
    }

    public final void j() {
        Log.d("AGC_ConfigImpl", "initConfigReader");
        if (this.f81127f == null) {
            synchronized (this.f81128g) {
                try {
                    if (this.f81127f == null) {
                        oq.e eVar = this.f81126e;
                        if (eVar != null) {
                            this.f81127f = new k(eVar.c(), "UTF-8");
                            this.f81126e.a();
                            this.f81126e = null;
                        } else {
                            this.f81127f = new o(this.f81124c, this.f81125d);
                        }
                        this.f81131j = new g(this.f81127f);
                    }
                    l();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final String k(String str) {
        i.a aVar;
        Map<String, i.a> a11 = mq.i.a();
        if (a11.containsKey(str) && (aVar = a11.get(str)) != null) {
            return aVar.a(this);
        }
        return null;
    }

    public final void l() {
        if (this.f81129h == mq.b.f73632b) {
            if (this.f81127f != null) {
                this.f81129h = b.f(this.f81127f.getString("/region", null), this.f81127f.getString("/agcgw/url", null));
            } else {
                Log.w("AGConnectServiceConfig", "get route fail , config not ready");
            }
        }
    }

    @Override // mq.e
    public boolean getBoolean(String str, boolean z11) {
        return Boolean.parseBoolean(getString(str, String.valueOf(z11)));
    }

    @Override // mq.e
    public int getInt(String str, int i11) {
        try {
            return Integer.parseInt(getString(str, String.valueOf(i11)));
        } catch (NumberFormatException unused) {
            return i11;
        }
    }

    @Override // mq.e
    public String getString(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("path must not be null.");
        }
        if (this.f81127f == null) {
            j();
        }
        String h11 = h(str);
        String str3 = this.f81130i.get(h11);
        if (str3 != null) {
            return str3;
        }
        String k11 = k(h11);
        if (k11 != null) {
            return k11;
        }
        String string = this.f81127f.getString(h11, str2);
        return g.c(string) ? this.f81131j.a(string, str2) : string;
    }
}
