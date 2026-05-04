package k80;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends Throwable>, Integer> f66045a = new HashMap();

    public f a(Class<? extends Throwable> cls, int i11) {
        this.f66045a.put(cls, Integer.valueOf(i11));
        return this;
    }

    public Integer b(Throwable th2) {
        int i11 = 20;
        Throwable th3 = th2;
        do {
            Integer c11 = c(th3);
            if (c11 == null) {
                th3 = th3.getCause();
                i11--;
                if (i11 <= 0 || th3 == th2) {
                    break;
                }
            } else {
                return c11;
            }
        } while (th3 != null);
        Log.d("EventBus", "No specific message resource ID found for " + th2);
        return null;
    }

    public Integer c(Throwable th2) {
        Class<?> cls = th2.getClass();
        Integer num = this.f66045a.get(cls);
        if (num == null) {
            Class<? extends Throwable> cls2 = null;
            for (Map.Entry<Class<? extends Throwable>, Integer> entry : this.f66045a.entrySet()) {
                Class<? extends Throwable> key = entry.getKey();
                if (key.isAssignableFrom(cls) && (cls2 == null || cls2.isAssignableFrom(key))) {
                    num = entry.getValue();
                    cls2 = key;
                }
            }
        }
        return num;
    }
}
