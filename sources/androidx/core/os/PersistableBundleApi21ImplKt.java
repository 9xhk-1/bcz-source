package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes2.dex */
final class PersistableBundleApi21ImplKt {

    @k
    public static final PersistableBundleApi21ImplKt INSTANCE = new PersistableBundleApi21ImplKt();

    private PersistableBundleApi21ImplKt() {
    }

    @o
    @DoNotInline
    @k
    public static final PersistableBundle createPersistableBundle(int i11) {
        return new PersistableBundle(i11);
    }

    @o
    @DoNotInline
    public static final void putValue(@k PersistableBundle persistableBundle, @l String str, @l Object obj) {
        if (obj == null) {
            persistableBundle.putString(str, null);
            return;
        }
        if (obj instanceof Boolean) {
            PersistableBundleApi22ImplKt.putBoolean(persistableBundle, str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            persistableBundle.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Integer) {
            persistableBundle.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            persistableBundle.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            persistableBundle.putString(str, (String) obj);
            return;
        }
        if (obj instanceof boolean[]) {
            PersistableBundleApi22ImplKt.putBooleanArray(persistableBundle, str, (boolean[]) obj);
            return;
        }
        if (obj instanceof double[]) {
            persistableBundle.putDoubleArray(str, (double[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            persistableBundle.putIntArray(str, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            persistableBundle.putLongArray(str, (long[]) obj);
            return;
        }
        if (!(obj instanceof Object[])) {
            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
        }
        Class<?> componentType = obj.getClass().getComponentType();
        g0.m(componentType);
        if (String.class.isAssignableFrom(componentType)) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            persistableBundle.putStringArray(str, (String[]) obj);
            return;
        }
        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
    }
}
