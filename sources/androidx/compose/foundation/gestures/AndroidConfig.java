package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,67:1\n113#2:68\n113#2:69\n269#3,3:70\n34#3,6:73\n272#3:79\n1#4:80\n65#5:81\n69#5:84\n60#6:82\n70#6:85\n53#6,3:87\n22#7:83\n30#8:86\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n41#1:68\n48#1:69\n52#1:70,3\n52#1:73,6\n52#1:79\n53#1:81\n53#1:84\n53#1:82\n53#1:85\n53#1:87,3\n53#1:83\n53#1:86\n*E\n"})
/* loaded from: classes.dex */
final class AndroidConfig implements ScrollConfig {

    @k
    private final ViewConfiguration viewConfiguration;

    public AndroidConfig(@k ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo399calculateMouseWheelScroll8xgXZGE(@k Density density, @k PointerEvent pointerEvent, long j11) {
        int i11 = Build.VERSION.SDK_INT;
        float f11 = -(i11 > 26 ? ViewConfigurationApi26Impl.INSTANCE.getVerticalScrollFactor(this.viewConfiguration) : density.mo377toPx0680j_4(Dp.m5115constructorimpl(64)));
        float f12 = -(i11 > 26 ? ViewConfigurationApi26Impl.INSTANCE.getHorizontalScrollFactor(this.viewConfiguration) : density.mo377toPx0680j_4(Dp.m5115constructorimpl(64)));
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset m2257boximpl = Offset.m2257boximpl(Offset.Companion.m2284getZeroF1C5BW0());
        int size = changes.size();
        for (int i12 = 0; i12 < size; i12++) {
            m2257boximpl = Offset.m2257boximpl(Offset.m2273plusMKHz9U(m2257boximpl.m2278unboximpl(), changes.get(i12).m3734getScrollDeltaF1C5BW0()));
        }
        long m2278unboximpl = m2257boximpl.m2278unboximpl();
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (m2278unboximpl >> 32)) * f12) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (m2278unboximpl & 4294967295L)) * f11) & 4294967295L));
    }

    @k
    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }
}
