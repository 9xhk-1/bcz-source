package mq;

import android.content.Context;
import android.util.Log;

/* loaded from: classes7.dex */
public abstract class d {
    public static d a(e eVar) {
        return rq.b.l(eVar);
    }

    public static d d() {
        return rq.b.j();
    }

    public static d e(String str) {
        return rq.b.k(str);
    }

    public static void h(Context context) {
        Log.i("AGConnectInstance", "AGConnectInstance#initialize");
        rq.b.n(context);
    }

    public static void i(Context context, f fVar) {
        Log.i("AGConnectInstance", "AGConnectInstance#initialize with options");
        rq.b.p(context, fVar);
    }

    public abstract Context b();

    public abstract String c();

    public abstract e f();

    public abstract <T> T g(Class<? super T> cls);
}
