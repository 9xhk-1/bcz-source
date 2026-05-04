package rb;

import android.content.Context;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static RequestQueue f83936a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f83937b = 10000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f83938c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final float f83939d = 1.0f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements RequestQueue.RequestFilter {
        @Override // com.android.volley.RequestQueue.RequestFilter
        public boolean apply(Request<?> arg0) {
            return true;
        }
    }

    public static void a() {
        f83936a.cancelAll((RequestQueue.RequestFilter) new a());
    }

    public static void b(Object tag) {
        f83936a.cancelAll(tag);
    }

    public static synchronized void c(Context context) {
        synchronized (f.class) {
            if (f83936a == null) {
                f83936a = Volley.newRequestQueue(context);
            }
        }
    }

    public static void d(Request<?> request) {
        e(request, new DefaultRetryPolicy(10000, 2, 1.0f));
    }

    public static void e(Request<?> request, RetryPolicy retryPolicy) {
        request.setRetryPolicy(retryPolicy);
        f83936a.add(request);
    }

    public static int f(VolleyError volleyError) {
        NetworkResponse networkResponse;
        if (volleyError == null || (networkResponse = volleyError.networkResponse) == null) {
            return 0;
        }
        return networkResponse.statusCode;
    }
}
