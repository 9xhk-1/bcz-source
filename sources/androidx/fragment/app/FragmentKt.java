package androidx.fragment.app;

import android.os.Bundle;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FragmentKt {
    public static final void clearFragmentResult(@m80.k Fragment fragment, @m80.k String str) {
        fragment.getParentFragmentManager().clearFragmentResult(str);
    }

    public static final void clearFragmentResultListener(@m80.k Fragment fragment, @m80.k String str) {
        fragment.getParentFragmentManager().clearFragmentResultListener(str);
    }

    public static final void setFragmentResult(@m80.k Fragment fragment, @m80.k String str, @m80.k Bundle bundle) {
        fragment.getParentFragmentManager().setFragmentResult(str, bundle);
    }

    public static final void setFragmentResultListener(@m80.k Fragment fragment, @m80.k String str, @m80.k final x00.p<? super String, ? super Bundle, g2> pVar) {
        fragment.getParentFragmentManager().setFragmentResultListener(str, fragment, new FragmentResultListener() { // from class: androidx.fragment.app.p
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str2, Bundle bundle) {
                x00.p.this.invoke(str2, bundle);
            }
        });
    }
}
