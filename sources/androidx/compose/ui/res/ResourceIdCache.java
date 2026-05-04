package androidx.compose.ui.res;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/ResourceIdCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* loaded from: classes2.dex */
public final class ResourceIdCache {
    public static final int $stable = 8;

    @k
    private final MutableIntObjectMap<TypedValue> resIdPathMap = new MutableIntObjectMap<>(0, 1, null);

    public final void clear() {
        synchronized (this) {
            this.resIdPathMap.clear();
            g2 g2Var = g2.f100423a;
        }
    }

    @k
    public final TypedValue resolveResourcePath(@k Resources resources, @DrawableRes int i11) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = this.resIdPathMap.get(i11);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i11, typedValue, true);
                this.resIdPathMap.put(i11, typedValue);
            }
        }
        return typedValue;
    }
}
