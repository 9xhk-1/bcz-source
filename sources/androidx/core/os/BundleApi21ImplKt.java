package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes2.dex */
final class BundleApi21ImplKt {

    @k
    public static final BundleApi21ImplKt INSTANCE = new BundleApi21ImplKt();

    private BundleApi21ImplKt() {
    }

    @o
    @DoNotInline
    public static final void putSize(@k Bundle bundle, @k String str, @l Size size) {
        bundle.putSize(str, size);
    }

    @o
    @DoNotInline
    public static final void putSizeF(@k Bundle bundle, @k String str, @l SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
