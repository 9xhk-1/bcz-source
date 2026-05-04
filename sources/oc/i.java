package oc;

import android.content.Context;
import android.os.Build;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import ku.r0;
import xb.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i {

    /* renamed from: e, reason: collision with root package name */
    public static final String f76774e = "TokenBinder";

    /* renamed from: f, reason: collision with root package name */
    public static i f76775f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final String f76776g = "https://notify.baicizhan.com/api/push/register";

    /* renamed from: h, reason: collision with root package name */
    public static final String f76777h = "https://notify.baicizhan.com/api/push/unregister";

    /* renamed from: i, reason: collision with root package name */
    public static final String f76778i = "{\"pkgName\": \"%s\",\"bczId\": %d,\"deviceId\": \"%s\",\"manufacturer\": \"%s\",\"deviceInfo\": \"%s\",\"pushChannels\":[%s]}";

    /* renamed from: j, reason: collision with root package name */
    public static final String f76779j = "{\"manufacturer\": \"%s\",\"token\": \"%s\"}";

    /* renamed from: a, reason: collision with root package name */
    public Context f76780a;

    /* renamed from: b, reason: collision with root package name */
    public String f76781b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f76782c = 0;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, String> f76783d = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Response.Listener<String> {
        public a() {
        }

        @Override // com.android.volley.Response.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(String response) {
            qb.c.i(i.f76774e, "bing respance %s", response);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Response.ErrorListener {
        public b() {
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError error) {
            qb.c.h(i.f76774e, "", error);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends StringRequest {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f76786a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int method, String url, Response.Listener listener, Response.ErrorListener errorListener, final byte[] val$body) {
            super(method, url, listener, errorListener);
            this.f76786a = val$body;
        }

        @Override // com.android.volley.Request
        public byte[] getBody() throws AuthFailureError {
            return this.f76786a;
        }

        @Override // com.android.volley.Request
        public String getBodyContentType() {
            return r0.f68791f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Response.Listener<String> {
        public d() {
        }

        @Override // com.android.volley.Response.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(String response) {
            qb.c.i(i.f76774e, "bing respance %s", response);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Response.ErrorListener {
        public e() {
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError error) {
            qb.c.h(i.f76774e, "", error);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends StringRequest {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f76790a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int method, String url, Response.Listener listener, Response.ErrorListener errorListener, final byte[] val$body) {
            super(method, url, listener, errorListener);
            this.f76790a = val$body;
        }

        @Override // com.android.volley.Request
        public byte[] getBody() throws AuthFailureError {
            return this.f76790a;
        }

        @Override // com.android.volley.Request
        public String getBodyContentType() {
            return r0.f68791f;
        }
    }

    public static i f() {
        if (f76775f == null) {
            synchronized (i.class) {
                try {
                    if (f76775f == null) {
                        f76775f = new i();
                    }
                } finally {
                }
            }
        }
        return f76775f;
    }

    public synchronized void a(String product, String token) {
        this.f76783d.put(product, token);
        g();
    }

    public final void b() {
        qb.c.i(f76774e, "[pkg, uid] [%s, %d]", this.f76780a.getPackageName(), Integer.valueOf(this.f76782c));
        rb.f.d(new c(1, f76776g, new a(), new b(), d(true, this.f76780a)));
    }

    public void c() {
        this.f76783d.clear();
        this.f76782c = 0;
        this.f76781b = "";
    }

    public final byte[] d(boolean bind, Context context) {
        String str;
        if (bind) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, String> entry : this.f76783d.entrySet()) {
                sb2.append(String.format(f76779j, entry.getKey(), entry.getValue()));
                sb2.append(',');
            }
            sb2.deleteCharAt(sb2.length() - 1);
            str = sb2.toString();
        } else {
            str = "";
        }
        String str2 = str;
        String format = String.format(Locale.getDefault(), f76778i, context.getPackageName(), Integer.valueOf(this.f76782c), o.a(context), this.f76781b, Build.MODEL + " - " + Build.MANUFACTURER + " - " + Build.VERSION.RELEASE, str2);
        qb.c.i(f76774e, "binding, %b , %s", Boolean.valueOf(bind), format);
        return format.getBytes();
    }

    public void e(Context context) {
        this.f76780a = context;
    }

    public final void g() {
        if (this.f76782c == 0 || this.f76783d.isEmpty()) {
            return;
        }
        b();
    }

    public synchronized void h(int alias) {
        qb.c.i(f76774e, "%d, %d", Integer.valueOf(this.f76782c), Integer.valueOf(alias));
        if (this.f76782c != alias) {
            this.f76782c = alias;
            g();
        }
    }

    public void i(String product) {
        qb.c.i(f76774e, "%s", product);
        this.f76781b = product;
    }

    public synchronized void j(Context contextParam) {
        Throwable th2;
        try {
            try {
                Context context = this.f76780a;
                if (context != null) {
                    contextParam = context;
                }
                if (contextParam != null) {
                    qb.c.i(f76774e, "[pkg, uid] [%s, %d]", contextParam.getPackageName(), Integer.valueOf(this.f76782c));
                    rb.f.d(new f(1, f76777h, new d(), new e(), d(false, contextParam)));
                } else {
                    try {
                        qb.c.i(f76774e, "null context", new Object[0]);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }
}
