package androidx.room;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"WrongConstant"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    private static final int BLOB = 5;
    public static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;
    public static final int POOL_LIMIT = 15;
    private static final int STRING = 4;
    private int argCount;

    @m80.k
    private final int[] bindingTypes;

    @w00.g
    @m80.k
    public final byte[][] blobBindings;

    @VisibleForTesting
    private final int capacity;

    @w00.g
    @m80.k
    public final double[] doubleBindings;

    @w00.g
    @m80.k
    public final long[] longBindings;

    @m80.l
    private volatile String query;

    @w00.g
    @m80.k
    public final String[] stringBindings;

    @m80.k
    public static final Companion Companion = new Companion(null);

    @w00.g
    @m80.k
    public static final TreeMap<Integer, RoomSQLiteQuery> queryPool = new TreeMap<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @zz.c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Binding {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final RoomSQLiteQuery acquire(@m80.k String query, int i11) {
            g0.p(query, "query");
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            synchronized (treeMap) {
                Map.Entry<Integer, RoomSQLiteQuery> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i11));
                if (ceilingEntry == null) {
                    g2 g2Var = g2.f100423a;
                    RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i11, null);
                    roomSQLiteQuery.init(query, i11);
                    return roomSQLiteQuery;
                }
                treeMap.remove(ceilingEntry.getKey());
                RoomSQLiteQuery value = ceilingEntry.getValue();
                value.init(query, i11);
                g0.m(value);
                return value;
            }
        }

        @w00.o
        @m80.k
        public final RoomSQLiteQuery copyFrom(@m80.k SupportSQLiteQuery supportSQLiteQuery) {
            g0.p(supportSQLiteQuery, "supportSQLiteQuery");
            final RoomSQLiteQuery acquire = acquire(supportSQLiteQuery.getSql(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.bindTo(new SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery$Companion$copyFrom$1
                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindBlob(int i11, byte[] value) {
                    g0.p(value, "value");
                    RoomSQLiteQuery.this.bindBlob(i11, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindDouble(int i11, double d11) {
                    RoomSQLiteQuery.this.bindDouble(i11, d11);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindLong(int i11, long j11) {
                    RoomSQLiteQuery.this.bindLong(i11, j11);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindNull(int i11) {
                    RoomSQLiteQuery.this.bindNull(i11);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindString(int i11, String value) {
                    g0.p(value, "value");
                    RoomSQLiteQuery.this.bindString(i11, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void clearBindings() {
                    RoomSQLiteQuery.this.clearBindings();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    RoomSQLiteQuery.this.close();
                }
            });
            return acquire;
        }

        public final void prunePoolLocked$room_runtime_release() {
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            g0.o(it, "iterator(...)");
            while (true) {
                int i11 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i11;
            }
        }

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getQueryPool$annotations() {
        }
    }

    public /* synthetic */ RoomSQLiteQuery(int i11, kotlin.jvm.internal.v vVar) {
        this(i11);
    }

    @w00.o
    @m80.k
    public static final RoomSQLiteQuery acquire(@m80.k String str, int i11) {
        return Companion.acquire(str, i11);
    }

    @w00.o
    @m80.k
    public static final RoomSQLiteQuery copyFrom(@m80.k SupportSQLiteQuery supportSQLiteQuery) {
        return Companion.copyFrom(supportSQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 toRoomRawQuery$lambda$1(RoomSQLiteQuery roomSQLiteQuery, SQLiteStatement it) {
        g0.p(it, "it");
        roomSQLiteQuery.bindTo(it);
        return g2.f100423a;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i11, @m80.k byte[] value) {
        g0.p(value, "value");
        this.bindingTypes[i11] = 5;
        this.blobBindings[i11] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i11, double d11) {
        this.bindingTypes[i11] = 3;
        this.doubleBindings[i11] = d11;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i11, long j11) {
        this.bindingTypes[i11] = 2;
        this.longBindings[i11] = j11;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i11) {
        this.bindingTypes[i11] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i11, @m80.k String value) {
        g0.p(value, "value");
        this.bindingTypes[i11] = 4;
        this.stringBindings[i11] = value;
    }

    public final void bindText(int i11, @m80.k String value) {
        g0.p(value, "value");
        bindString(i11, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(@m80.k SupportSQLiteProgram statement) {
        g0.p(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.bindingTypes[i11];
            if (i12 == 1) {
                statement.bindNull(i11);
            } else if (i12 == 2) {
                statement.bindLong(i11, this.longBindings[i11]);
            } else if (i12 == 3) {
                statement.bindDouble(i11, this.doubleBindings[i11]);
            } else if (i12 == 4) {
                String str = this.stringBindings[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindString(i11, str);
            } else if (i12 == 5) {
                byte[] bArr = this.blobBindings[i11];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindBlob(i11, bArr);
            }
            if (i11 == argCount) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        a00.q.T1(this.bindingTypes, 1, 0, 0, 6, null);
        a00.q.V1(this.stringBindings, null, 0, 0, 6, null);
        a00.q.V1(this.blobBindings, null, 0, 0, 6, null);
        this.query = null;
    }

    public final void copyArgumentsFrom(@m80.k RoomSQLiteQuery other) {
        g0.p(other, "other");
        int argCount = other.getArgCount() + 1;
        System.arraycopy(other.bindingTypes, 0, this.bindingTypes, 0, argCount);
        System.arraycopy(other.longBindings, 0, this.longBindings, 0, argCount);
        System.arraycopy(other.stringBindings, 0, this.stringBindings, 0, argCount);
        System.arraycopy(other.blobBindings, 0, this.blobBindings, 0, argCount);
        System.arraycopy(other.doubleBindings, 0, this.doubleBindings, 0, argCount);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        return this.argCount;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    @m80.k
    public String getSql() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void init(@m80.k String query, int i11) {
        g0.p(query, "query");
        this.query = query;
        this.argCount = i11;
    }

    public final void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = queryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            Companion.prunePoolLocked$room_runtime_release();
            g2 g2Var = g2.f100423a;
        }
    }

    @m80.k
    public final RoomRawQuery toRoomRawQuery() {
        return new RoomRawQuery(getSql(), new x00.l() { // from class: androidx.room.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 roomRawQuery$lambda$1;
                roomRawQuery$lambda$1 = RoomSQLiteQuery.toRoomRawQuery$lambda$1(RoomSQLiteQuery.this, (SQLiteStatement) obj);
                return roomRawQuery$lambda$1;
            }
        });
    }

    private RoomSQLiteQuery(int i11) {
        this.capacity = i11;
        int i12 = i11 + 1;
        this.bindingTypes = new int[i12];
        this.longBindings = new long[i12];
        this.doubleBindings = new double[i12];
        this.stringBindings = new String[i12];
        this.blobBindings = new byte[i12][];
    }

    public final void bindTo(@m80.k SQLiteStatement statement) {
        g0.p(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.bindingTypes[i11];
            if (i12 == 1) {
                statement.mo5623bindNull(i11);
            } else if (i12 == 2) {
                statement.mo5622bindLong(i11, this.longBindings[i11]);
            } else if (i12 == 3) {
                statement.mo5621bindDouble(i11, this.doubleBindings[i11]);
            } else if (i12 == 4) {
                String str = this.stringBindings[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.mo5624bindText(i11, str);
            } else if (i12 == 5) {
                byte[] bArr = this.blobBindings[i11];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.mo5620bindBlob(i11, bArr);
            }
            if (i11 == argCount) {
                return;
            } else {
                i11++;
            }
        }
    }

    private static /* synthetic */ void getBindingTypes$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getBlobBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDoubleBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLongBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getStringBindings$annotations() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
