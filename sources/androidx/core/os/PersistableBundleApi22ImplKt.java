package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(22)
/* loaded from: classes2.dex */
final class PersistableBundleApi22ImplKt {

    @k
    public static final PersistableBundleApi22ImplKt INSTANCE = new PersistableBundleApi22ImplKt();

    private PersistableBundleApi22ImplKt() {
    }

    @o
    @DoNotInline
    public static final void putBoolean(@k PersistableBundle persistableBundle, @l String str, boolean z11) {
        persistableBundle.putBoolean(str, z11);
    }

    @o
    @DoNotInline
    public static final void putBooleanArray(@k PersistableBundle persistableBundle, @l String str, @k boolean[] zArr) {
        persistableBundle.putBooleanArray(str, zArr);
    }
}
