package j1;

import android.util.Log;
import com.airbnb.lottie.r0;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<String> f63108a = new HashSet();

    @Override // com.airbnb.lottie.r0
    public void a(String str) {
        b(str, null);
    }

    @Override // com.airbnb.lottie.r0
    public void b(String str, Throwable th2) {
        Set<String> set = f63108a;
        if (set.contains(str)) {
            return;
        }
        Log.w(com.airbnb.lottie.e.f9936b, str, th2);
        set.add(str);
    }

    @Override // com.airbnb.lottie.r0
    public void debug(String str) {
        debug(str, null);
    }

    @Override // com.airbnb.lottie.r0
    public void error(String str, Throwable th2) {
        if (com.airbnb.lottie.e.f9935a) {
            Log.d(com.airbnb.lottie.e.f9936b, str, th2);
        }
    }

    @Override // com.airbnb.lottie.r0
    public void debug(String str, Throwable th2) {
        if (com.airbnb.lottie.e.f9935a) {
            Log.d(com.airbnb.lottie.e.f9936b, str, th2);
        }
    }
}
