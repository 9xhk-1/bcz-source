package kotlinx.coroutines.android;

import android.os.Looper;
import c40.v2;
import d40.d;
import d40.g;
import h40.h0;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class AndroidDispatcherFactory implements h0 {
    @Override // h40.h0
    public int a() {
        return 1073741823;
    }

    @Override // h40.h0
    @k
    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // h40.h0
    @k
    public v2 c(@k List<? extends h0> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(g.e(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
