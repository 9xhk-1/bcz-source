package bv;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import gv.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {
    public static boolean a(@NonNull Object obj) {
        f.b(obj);
        f.a(obj instanceof yu.b, "'%s' is not an optionally injected android entry point. Check that you have annotated the class with both @AndroidEntryPoint and @OptionalInject.", obj.getClass());
        return ((yu.b) obj).a();
    }

    public static boolean b(@NonNull Service service) {
        return a(service);
    }

    public static boolean c(@NonNull BroadcastReceiver broadcastReceiver) {
        return a(broadcastReceiver);
    }

    public static boolean d(@NonNull View view) {
        return a(view);
    }

    public static boolean e(@NonNull ComponentActivity activity) {
        return a(activity);
    }

    public static boolean f(@NonNull Fragment fragment) {
        return a(fragment);
    }
}
