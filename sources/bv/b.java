package bv;

import android.app.Application;
import androidx.annotation.NonNull;
import gv.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@NonNull Application app2) {
        f.b(app2);
        f.a(app2 instanceof yu.a, "'%s' is not a custom inject application. Check that you have annotated the application with both @HiltAndroidApp and @CustomInject.", app2.getClass());
        ((yu.a) app2).a();
    }
}
