package wq;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<Integer, Class<? extends e>> f96653a;

    /* renamed from: b, reason: collision with root package name */
    public static e f96654b;

    static {
        HashMap hashMap = new HashMap();
        f96653a = hashMap;
        hashMap.put(3, a.class);
        hashMap.put(1, g.class);
        hashMap.put(2, h.class);
        hashMap.put(0, f.class);
        hashMap.put(4, f.class);
        hashMap.put(7, b.class);
    }

    public static synchronized e a(Context context) {
        synchronized (c.class) {
            e eVar = f96654b;
            if (eVar != null) {
                return eVar;
            }
            Log.i("DeviceImplFactory", "deviceType: " + d.a(context));
            Class<? extends e> cls = f96653a.get(Integer.valueOf(d.a(context)));
            if (cls == null) {
                f fVar = new f();
                f96654b = fVar;
                return fVar;
            }
            try {
                f96654b = cls.newInstance();
            } catch (Throwable unused) {
                f96654b = new f();
                Log.e("DeviceImplFactory", "createDeviceInfo error and create default phone deviceinfo");
            }
            return f96654b;
        }
    }
}
