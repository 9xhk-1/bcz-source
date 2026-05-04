package io.ktor.network.selector;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ClosedChannelCancellationException extends CancellationException {
    public ClosedChannelCancellationException() {
        super("Closed channel.");
    }
}
