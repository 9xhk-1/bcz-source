package androidx.core.util;

import androidx.annotation.RequiresApi;
import m80.k;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "ConsumerKt")
@RequiresApi(24)
/* loaded from: classes2.dex */
public final class ConsumerKt {
    @RequiresApi(24)
    @k
    public static final <T> java.util.function.Consumer<T> asConsumer(@k j00.c<? super T> cVar) {
        return new ContinuationConsumer(cVar);
    }
}
