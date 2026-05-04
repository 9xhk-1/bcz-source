package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface PlatformMagnifierFactory {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Stable
        @m80.k
        public final PlatformMagnifierFactory getForCurrentPlatform() {
            if (Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? PlatformMagnifierFactoryApi28Impl.INSTANCE : PlatformMagnifierFactoryApi29Impl.INSTANCE;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    @m80.k
    /* renamed from: create-nHHXs2Y, reason: not valid java name */
    PlatformMagnifier mo327createnHHXs2Y(@m80.k View view, boolean z11, long j11, float f11, float f12, boolean z12, @m80.k Density density, float f13);

    boolean getCanUpdateZoom();
}
