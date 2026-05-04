package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FragmentTransactionKt {
    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, @IdRes int i11, String str, Bundle bundle) {
        g0.y(4, "F");
        return fragmentTransaction.add(i11, Fragment.class, bundle, str);
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, int i11, String str, Bundle bundle, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        if ((i12 & 4) != 0) {
            bundle = null;
        }
        g0.y(4, "F");
        return fragmentTransaction.add(i11, Fragment.class, bundle, str);
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction replace(FragmentTransaction fragmentTransaction, @IdRes int i11, String str, Bundle bundle) {
        g0.y(4, "F");
        return fragmentTransaction.replace(i11, Fragment.class, bundle, str);
    }

    public static /* synthetic */ FragmentTransaction replace$default(FragmentTransaction fragmentTransaction, int i11, String str, Bundle bundle, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        if ((i12 & 4) != 0) {
            bundle = null;
        }
        g0.y(4, "F");
        return fragmentTransaction.replace(i11, Fragment.class, bundle, str);
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, String str, Bundle bundle) {
        g0.y(4, "F");
        return fragmentTransaction.add(Fragment.class, bundle, str);
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, String str, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        g0.y(4, "F");
        return fragmentTransaction.add(Fragment.class, bundle, str);
    }
}
