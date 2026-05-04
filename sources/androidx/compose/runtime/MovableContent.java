package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
@InternalComposeApi
/* loaded from: classes.dex */
public final class MovableContent<P> {
    public static final int $stable = 0;

    @k
    private final q<P, Composer, Integer, g2> content;

    /* JADX WARN: Multi-variable type inference failed */
    public MovableContent(@k q<? super P, ? super Composer, ? super Integer, g2> qVar) {
        this.content = qVar;
    }

    @k
    public final q<P, Composer, Integer, g2> getContent() {
        return this.content;
    }
}
