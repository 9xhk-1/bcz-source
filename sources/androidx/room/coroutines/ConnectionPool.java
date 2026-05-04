package androidx.room.coroutines;

import androidx.room.Transactor;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface ConnectionPool extends AutoCloseable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class RollbackException extends Throwable {

        @l
        private final Object result;

        public RollbackException(@l Object obj) {
            this.result = obj;
        }

        @l
        public final Object getResult() {
            return this.result;
        }
    }

    @Override // java.lang.AutoCloseable
    void close();

    @l
    <R> Object useConnection(boolean z11, @k p<? super Transactor, ? super j00.c<? super R>, ? extends Object> pVar, @k j00.c<? super R> cVar);
}
