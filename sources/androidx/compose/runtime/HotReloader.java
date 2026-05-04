package androidx.compose.runtime;

import java.util.List;
import kotlin.jvm.internal.v;
import m80.k;
import m80.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class HotReloader {

    @k
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private final void loadStateAndCompose(Object obj) {
            Recomposer.Companion.loadStateAndComposeForHotReload$runtime_release(obj);
        }

        private final Object saveStateAndDispose(Object obj) {
            return Recomposer.Companion.saveStateAndDisposeForHotReload$runtime_release();
        }

        @o
        public final void clearErrors$runtime_release() {
            Recomposer.Companion.clearErrors$runtime_release();
        }

        @k
        @o
        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            return Recomposer.Companion.getCurrentErrors$runtime_release();
        }

        @o
        public final void invalidateGroupsWithKey$runtime_release(int i11) {
            Recomposer.Companion.invalidateGroupsWithKey$runtime_release(i11);
        }

        @o
        public final void simulateHotReload$runtime_release(@k Object obj) {
            loadStateAndCompose(saveStateAndDispose(obj));
        }

        private Companion() {
        }
    }
}
