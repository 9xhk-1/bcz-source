package pq;

import android.content.Context;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mq.i;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class d implements mq.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f81115a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f81116b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81117c;

    /* renamed from: d, reason: collision with root package name */
    public final mq.b f81118d;

    /* renamed from: e, reason: collision with root package name */
    public final oq.c f81119e;

    /* renamed from: f, reason: collision with root package name */
    public final g f81120f;

    /* renamed from: g, reason: collision with root package name */
    public final Map<String, String> f81121g;

    /* renamed from: h, reason: collision with root package name */
    public final List<qq.c> f81122h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<String, String> f81123i = new HashMap();

    public d(Context context, String str, mq.b bVar, InputStream inputStream, Map<String, String> map, List<qq.c> list, String str2) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f81116b = context;
        str = str == null ? context.getPackageName() : str;
        this.f81117c = str;
        if (inputStream != null) {
            this.f81119e = new k(inputStream, str);
            b.a(inputStream);
        } else {
            this.f81119e = new o(context, str);
        }
        this.f81120f = new g(this.f81119e);
        mq.b bVar2 = mq.b.f73632b;
        if (bVar != bVar2 && "1.0".equals(this.f81119e.getString("/configuration_version", null))) {
            throw new RuntimeException("The file version does not match,please download the latest agconnect-services.json from the AGC website.");
        }
        this.f81118d = (bVar == null || bVar == bVar2) ? b.f(this.f81119e.getString("/region", null), this.f81119e.getString("/agcgw/url", null)) : bVar;
        this.f81121g = b.d(map);
        this.f81122h = list;
        this.f81115a = str2 == null ? d() : str2;
    }

    private String b(String str) {
        Map<String, i.a> a11 = mq.i.a();
        if (!a11.containsKey(str)) {
            return null;
        }
        if (this.f81123i.containsKey(str)) {
            return this.f81123i.get(str);
        }
        i.a aVar = a11.get(str);
        if (aVar == null) {
            return null;
        }
        String a12 = aVar.a(this);
        this.f81123i.put(str, a12);
        return a12;
    }

    @Override // mq.e
    public mq.b a() {
        mq.b bVar = this.f81118d;
        return bVar == null ? mq.b.f73632b : bVar;
    }

    public List<qq.c> c() {
        return this.f81122h;
    }

    public final String d() {
        return String.valueOf(("{packageName='" + this.f81117c + "', routePolicy=" + this.f81118d + ", reader=" + this.f81119e.toString().hashCode() + ", customConfigMap=" + new JSONObject(this.f81121g).toString().hashCode() + l50.b.f69928j).hashCode());
    }

    @Override // mq.e
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // mq.e
    public Context getContext() {
        return this.f81116b;
    }

    @Override // mq.e
    public String getIdentifier() {
        return this.f81115a;
    }

    @Override // mq.e
    public int getInt(String str) {
        return getInt(str, 0);
    }

    @Override // mq.e
    public String getPackageName() {
        return this.f81117c;
    }

    @Override // mq.e
    public String getString(String str) {
        return getString(str, null);
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
            return str2;
        }
        String e11 = b.e(str);
        String str3 = this.f81121g.get(e11);
        if (str3 != null) {
            return str3;
        }
        String b11 = b(e11);
        if (b11 != null) {
            return b11;
        }
        String string = this.f81119e.getString(e11, str2);
        return g.c(string) ? this.f81120f.a(string, str2) : string;
    }
}
