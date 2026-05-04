package oq;

import android.content.Context;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes7.dex */
public abstract class a implements mq.e {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, a> f77637a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f77638b = new Object();

    public static a b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return c(context, context.getPackageName());
    }

    public static a c(Context context, String str) {
        a aVar;
        synchronized (f77638b) {
            try {
                Map<String, a> map = f77637a;
                aVar = map.get(str);
                if (aVar == null) {
                    aVar = new pq.e(context, str);
                    map.put(str, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public abstract void d(InputStream inputStream);

    public abstract void e(e eVar);

    public abstract void f(String str, String str2);

    public abstract void g(mq.b bVar);
}
