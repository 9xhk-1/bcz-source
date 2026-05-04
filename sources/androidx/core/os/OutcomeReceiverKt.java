package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import j00.c;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(31)
/* loaded from: classes2.dex */
public final class OutcomeReceiverKt {
    @RequiresApi(31)
    @k
    public static final <R, E extends Throwable> OutcomeReceiver asOutcomeReceiver(@k c<? super R> cVar) {
        return b.a(new ContinuationOutcomeReceiver(cVar));
    }
}
