package androidx.room.driver;

import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.coroutines.RawConnectionAccessor;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import j00.c;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.a;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSupportSQLiteConnectionPool.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteConnectionPool.android.kt\nandroidx/room/driver/SupportSQLitePooledConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* loaded from: classes3.dex */
final class SupportSQLitePooledConnection implements Transactor, RawConnectionAccessor {

    @l
    private Transactor.SQLiteTransactionType currentTransactionType;

    @k
    private final SupportSQLiteConnection delegate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class SupportSQLiteTransactor<T> implements TransactionScope<T>, RawConnectionAccessor {
        public SupportSQLiteTransactor() {
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        @k
        public SQLiteConnection getRawConnection() {
            return SupportSQLitePooledConnection.this.getRawConnection();
        }

        @Override // androidx.room.TransactionScope
        @l
        public Object rollback(T t11, @k c<?> cVar) {
            throw new ConnectionPool.RollbackException(t11);
        }

        @Override // androidx.room.PooledConnection
        @l
        public <R> Object usePrepared(@k String str, @k x00.l<? super SQLiteStatement, ? extends R> lVar, @k c<? super R> cVar) {
            return SupportSQLitePooledConnection.this.usePrepared(str, lVar, cVar);
        }

        @Override // androidx.room.TransactionScope
        @l
        public <R> Object withNestedTransaction(@k p<? super TransactionScope<R>, ? super c<? super R>, ? extends Object> pVar, @k c<? super R> cVar) {
            SupportSQLitePooledConnection supportSQLitePooledConnection = SupportSQLitePooledConnection.this;
            Transactor.SQLiteTransactionType sQLiteTransactionType = supportSQLitePooledConnection.currentTransactionType;
            if (sQLiteTransactionType != null) {
                return supportSQLitePooledConnection.transaction(sQLiteTransactionType, pVar, cVar);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Transactor.SQLiteTransactionType.values().length];
            try {
                iArr[Transactor.SQLiteTransactionType.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SupportSQLitePooledConnection(@k SupportSQLiteConnection delegate) {
        g0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.room.Transactor$SQLiteTransactionType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.sqlite.db.SupportSQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [x00.p, x00.p<? super androidx.room.TransactionScope<R>, ? super j00.c<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.room.driver.SupportSQLitePooledConnection] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object transaction(androidx.room.Transactor.SQLiteTransactionType r6, x00.p<? super androidx.room.TransactionScope<R>, ? super j00.c<? super R>, ? extends java.lang.Object> r7, j00.c<? super R> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.room.driver.SupportSQLitePooledConnection$transaction$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.driver.SupportSQLitePooledConnection$transaction$1 r0 = (androidx.room.driver.SupportSQLitePooledConnection$transaction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.driver.SupportSQLitePooledConnection$transaction$1 r0 = new androidx.room.driver.SupportSQLitePooledConnection$transaction$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r6 = r0.L$1
            androidx.sqlite.db.SupportSQLiteDatabase r6 = (androidx.sqlite.db.SupportSQLiteDatabase) r6
            java.lang.Object r7 = r0.L$0
            androidx.room.driver.SupportSQLitePooledConnection r7 = (androidx.room.driver.SupportSQLitePooledConnection) r7
            kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L32 androidx.room.coroutines.ConnectionPool.RollbackException -> L35
            goto L88
        L32:
            r8 = move-exception
            goto Lb2
        L35:
            r8 = move-exception
            goto La2
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.e.n(r8)
            androidx.room.driver.SupportSQLiteConnection r8 = r5.delegate
            androidx.sqlite.db.SupportSQLiteDatabase r8 = r8.getDb()
            boolean r2 = r8.inTransaction()
            if (r2 != 0) goto L51
            r5.currentTransactionType = r6
        L51:
            int[] r2 = androidx.room.driver.SupportSQLitePooledConnection.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r2[r6]
            if (r6 == r4) goto L6f
            r2 = 2
            if (r6 == r2) goto L6b
            r2 = 3
            if (r6 != r2) goto L65
            r8.beginTransaction()
            goto L72
        L65:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L6b:
            r8.beginTransactionNonExclusive()
            goto L72
        L6f:
            r8.beginTransactionReadOnly()
        L72:
            androidx.room.driver.SupportSQLitePooledConnection$SupportSQLiteTransactor r6 = new androidx.room.driver.SupportSQLitePooledConnection$SupportSQLiteTransactor     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            r6.<init>()     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            r0.label = r4     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            java.lang.Object r6 = r7.invoke(r6, r0)     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            if (r6 != r1) goto L84
            return r1
        L84:
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
        L88:
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L32 androidx.room.coroutines.ConnectionPool.RollbackException -> L35
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto L96
            r7.currentTransactionType = r3
        L96:
            return r8
        L97:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto Lb2
        L9d:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
        La2:
            java.lang.Object r8 = r8.getResult()     // Catch: java.lang.Throwable -> L32
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto Lb1
            r7.currentTransactionType = r3
        Lb1:
            return r8
        Lb2:
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto Lbd
            r7.currentTransactionType = r3
        Lbd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.driver.SupportSQLitePooledConnection.transaction(androidx.room.Transactor$SQLiteTransactionType, x00.p, j00.c):java.lang.Object");
    }

    @k
    public final SupportSQLiteConnection getDelegate() {
        return this.delegate;
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    @k
    public SQLiteConnection getRawConnection() {
        return this.delegate;
    }

    @Override // androidx.room.Transactor
    @l
    public Object inTransaction(@k c<? super Boolean> cVar) {
        return a.a(this.delegate.getDb().inTransaction());
    }

    @Override // androidx.room.PooledConnection
    @l
    public <R> Object usePrepared(@k String str, @k x00.l<? super SQLiteStatement, ? extends R> lVar, @k c<? super R> cVar) {
        SupportSQLiteStatement prepare = this.delegate.prepare(str);
        try {
            R invoke = lVar.invoke(prepare);
            u00.a.c(prepare, null);
            return invoke;
        } finally {
        }
    }

    @Override // androidx.room.Transactor
    @l
    public <R> Object withTransaction(@k Transactor.SQLiteTransactionType sQLiteTransactionType, @k p<? super TransactionScope<R>, ? super c<? super R>, ? extends Object> pVar, @k c<? super R> cVar) {
        return transaction(sQLiteTransactionType, pVar, cVar);
    }
}
