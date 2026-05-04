package g40;

import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.Result;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c<T> implements BiFunction<T, Throwable, g2> {

    @l
    @w00.g
    public volatile j00.c<? super T> cont;

    public c(@l j00.c<? super T> cVar) {
        this.cont = cVar;
    }

    public void a(@l T t11, @l Throwable th2) {
        Throwable cause;
        j00.c<? super T> cVar = this.cont;
        if (cVar == null) {
            return;
        }
        if (th2 == null) {
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(t11));
            return;
        }
        CompletionException completionException = th2 instanceof CompletionException ? (CompletionException) th2 : null;
        if (completionException != null && (cause = completionException.getCause()) != null) {
            th2 = cause;
        }
        Result.a aVar2 = Result.Companion;
        cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(th2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ g2 apply(Object obj, Throwable th2) {
        a(obj, th2);
        return g2.f100423a;
    }
}
