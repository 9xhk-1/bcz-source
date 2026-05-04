package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ReceiveContentConfigurationImpl extends ReceiveContentConfiguration {

    @k
    private final ReceiveContentListener receiveContentListener;

    public ReceiveContentConfigurationImpl(@k ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
    }

    public static /* synthetic */ ReceiveContentConfigurationImpl copy$default(ReceiveContentConfigurationImpl receiveContentConfigurationImpl, ReceiveContentListener receiveContentListener, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            receiveContentListener = receiveContentConfigurationImpl.receiveContentListener;
        }
        return receiveContentConfigurationImpl.copy(receiveContentListener);
    }

    @k
    public final ReceiveContentListener component1() {
        return this.receiveContentListener;
    }

    @k
    public final ReceiveContentConfigurationImpl copy(@k ReceiveContentListener receiveContentListener) {
        return new ReceiveContentConfigurationImpl(receiveContentListener);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReceiveContentConfigurationImpl) && g0.g(this.receiveContentListener, ((ReceiveContentConfigurationImpl) obj).receiveContentListener);
    }

    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    @k
    public ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    public int hashCode() {
        return this.receiveContentListener.hashCode();
    }

    @k
    public String toString() {
        return "ReceiveContentConfigurationImpl(receiveContentListener=" + this.receiveContentListener + ')';
    }
}
