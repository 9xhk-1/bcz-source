package androidx.compose.ui.focus;

import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FocusInteropUtils {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final int[] tempCoordinates = new int[2];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final int[] getTempCoordinates() {
            return FocusInteropUtils.tempCoordinates;
        }

        private Companion() {
        }
    }
}
