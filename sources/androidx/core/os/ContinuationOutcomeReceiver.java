package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import j00.c;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.e;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(31)
/* loaded from: classes2.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    @k
    private final c<R> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationOutcomeReceiver(@k c<? super R> cVar) {
        super(false);
        this.continuation = cVar;
    }

    public void onError(@k E e11) {
        if (compareAndSet(false, true)) {
            c<R> cVar = this.continuation;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(e.a(e11)));
        }
    }

    public void onResult(R r11) {
        if (compareAndSet(false, true)) {
            c<R> cVar = this.continuation;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(r11));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @k
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
