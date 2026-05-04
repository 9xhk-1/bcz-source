package androidx.room;

import androidx.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface PooledConnection {
    @m80.l
    <R> Object usePrepared(@m80.k String str, @m80.k x00.l<? super SQLiteStatement, ? extends R> lVar, @m80.k j00.c<? super R> cVar);
}
