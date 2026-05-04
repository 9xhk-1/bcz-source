package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface CompositionLocalMap {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final CompositionLocalMap Empty = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();

        private Companion() {
        }

        @k
        public final CompositionLocalMap getEmpty() {
            return Empty;
        }
    }

    <T> T get(@k CompositionLocal<T> compositionLocal);
}
