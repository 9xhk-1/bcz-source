package androidx.room;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface Transactor extends PooledConnection {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SQLiteTransactionType {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ SQLiteTransactionType[] $VALUES;
        public static final SQLiteTransactionType DEFERRED = new SQLiteTransactionType("DEFERRED", 0);
        public static final SQLiteTransactionType IMMEDIATE = new SQLiteTransactionType("IMMEDIATE", 1);
        public static final SQLiteTransactionType EXCLUSIVE = new SQLiteTransactionType("EXCLUSIVE", 2);

        private static final /* synthetic */ SQLiteTransactionType[] $values() {
            return new SQLiteTransactionType[]{DEFERRED, IMMEDIATE, EXCLUSIVE};
        }

        static {
            SQLiteTransactionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private SQLiteTransactionType(String str, int i11) {
        }

        @m80.k
        public static m00.a<SQLiteTransactionType> getEntries() {
            return $ENTRIES;
        }

        public static SQLiteTransactionType valueOf(String str) {
            return (SQLiteTransactionType) Enum.valueOf(SQLiteTransactionType.class, str);
        }

        public static SQLiteTransactionType[] values() {
            return (SQLiteTransactionType[]) $VALUES.clone();
        }
    }

    @m80.l
    Object inTransaction(@m80.k j00.c<? super Boolean> cVar);

    @m80.l
    <R> Object withTransaction(@m80.k SQLiteTransactionType sQLiteTransactionType, @m80.k x00.p<? super TransactionScope<R>, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar);
}
