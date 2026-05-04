package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class ReceiveContentConfiguration {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final ReceiveContentConfiguration invoke(@k ReceiveContentListener receiveContentListener) {
            return new ReceiveContentConfigurationImpl(receiveContentListener);
        }

        private Companion() {
        }
    }

    @k
    public abstract ReceiveContentListener getReceiveContentListener();

    public final boolean onCommitContent(@k TransferableContent transferableContent) {
        return !g0.g(getReceiveContentListener().onReceive(transferableContent), transferableContent);
    }
}
