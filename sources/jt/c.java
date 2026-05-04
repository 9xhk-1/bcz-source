package jt;

import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {
    public static b a(Fragment fragment) {
        return new b(fragment);
    }

    public static b b(FragmentActivity fragmentActivity) {
        return new b(fragmentActivity);
    }

    public static boolean c(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }
}
