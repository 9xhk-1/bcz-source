package androidx.room;

import a00.h0;
import a00.r0;
import android.database.SQLException;
import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteConnection;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEntityUpsertAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityUpsertAdapter.kt\nandroidx/room/EntityUpsertAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n13402#2,2:239\n13402#2,2:243\n1863#3,2:241\n1863#3,2:245\n*S KotlinDebug\n*F\n+ 1 EntityUpsertAdapter.kt\nandroidx/room/EntityUpsertAdapter\n*L\n61#1:239,2\n139#1:243,2\n73#1:241,2\n157#1:245,2\n*E\n"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class EntityUpsertAdapter<T> {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private static final String ErrorMsg = "unique";

    @m80.k
    private static final String SQLITE_CONSTRAINT_PRIMARYKEY = "1555";

    @m80.k
    private static final String SQLITE_CONSTRAINT_UNIQUE = "2067";

    @m80.k
    private final EntityInsertAdapter<T> entityInsertAdapter;

    @m80.k
    private final EntityDeleteOrUpdateAdapter<T> updateAdapter;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public EntityUpsertAdapter(@m80.k EntityInsertAdapter<T> entityInsertAdapter, @m80.k EntityDeleteOrUpdateAdapter<T> updateAdapter) {
        g0.p(entityInsertAdapter, "entityInsertAdapter");
        g0.p(updateAdapter, "updateAdapter");
        this.entityInsertAdapter = entityInsertAdapter;
        this.updateAdapter = updateAdapter;
    }

    private final void checkUniquenessException(SQLException sQLException) {
        String message = sQLException.getMessage();
        if (message == null) {
            throw sQLException;
        }
        if (!k0.k3(message, ErrorMsg, true) && !k0.n3(message, SQLITE_CONSTRAINT_UNIQUE, false, 2, null) && !k0.n3(message, SQLITE_CONSTRAINT_PRIMARYKEY, false, 2, null)) {
            throw sQLException;
        }
    }

    public final void upsert(@m80.k SQLiteConnection connection, @m80.l T t11) {
        g0.p(connection, "connection");
        try {
            this.entityInsertAdapter.insert(connection, (SQLiteConnection) t11);
        } catch (SQLException e11) {
            checkUniquenessException(e11);
            this.updateAdapter.handle(connection, t11);
        }
    }

    public final long upsertAndReturnId(@m80.k SQLiteConnection connection, @m80.l T t11) {
        g0.p(connection, "connection");
        try {
            return this.entityInsertAdapter.insertAndReturnId(connection, t11);
        } catch (SQLException e11) {
            checkUniquenessException(e11);
            this.updateAdapter.handle(connection, t11);
            return -1L;
        }
    }

    @m80.k
    public final long[] upsertAndReturnIdsArray(@m80.k SQLiteConnection connection, @m80.l T[] tArr) {
        long j11;
        g0.p(connection, "connection");
        if (tArr == null) {
            return new long[0];
        }
        int length = tArr.length;
        long[] jArr = new long[length];
        for (int i11 = 0; i11 < length; i11++) {
            try {
                j11 = this.entityInsertAdapter.insertAndReturnId(connection, tArr[i11]);
            } catch (SQLException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(connection, tArr[i11]);
                j11 = -1;
            }
            jArr[i11] = j11;
        }
        return jArr;
    }

    @m80.k
    public final Long[] upsertAndReturnIdsArrayBox(@m80.k SQLiteConnection connection, @m80.l T[] tArr) {
        long j11;
        g0.p(connection, "connection");
        if (tArr == null) {
            return new Long[0];
        }
        int length = tArr.length;
        Long[] lArr = new Long[length];
        for (int i11 = 0; i11 < length; i11++) {
            try {
                j11 = this.entityInsertAdapter.insertAndReturnId(connection, tArr[i11]);
            } catch (SQLException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(connection, tArr[i11]);
                j11 = -1;
            }
            lArr[i11] = Long.valueOf(j11);
        }
        return lArr;
    }

    @m80.k
    public final List<Long> upsertAndReturnIdsList(@m80.k SQLiteConnection connection, @m80.l T[] tArr) {
        g0.p(connection, "connection");
        if (tArr == null) {
            return h0.J();
        }
        List j11 = a00.g0.j();
        for (T t11 : tArr) {
            try {
                j11.add(Long.valueOf(this.entityInsertAdapter.insertAndReturnId(connection, t11)));
            } catch (SQLException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(connection, t11);
                j11.add(-1L);
            }
        }
        return a00.g0.b(j11);
    }

    public final void upsert(@m80.k SQLiteConnection connection, @m80.l T[] tArr) {
        g0.p(connection, "connection");
        if (tArr == null) {
            return;
        }
        for (T t11 : tArr) {
            try {
                this.entityInsertAdapter.insert(connection, (SQLiteConnection) t11);
            } catch (SQLException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(connection, t11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final long[] upsertAndReturnIdsArray(@m80.k SQLiteConnection connection, @m80.l Collection<? extends T> collection) {
        long j11;
        g0.p(connection, "connection");
        if (collection == null) {
            return new long[0];
        }
        int size = collection.size();
        long[] jArr = new long[size];
        for (int i11 = 0; i11 < size; i11++) {
            try {
                j11 = this.entityInsertAdapter.insertAndReturnId(connection, r0.k2(collection, i11));
            } catch (SQLException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(connection, r0.k2(collection, i11));
                j11 = -1;
            }
            jArr[i11] = j11;
        }
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final Long[] upsertAndReturnIdsArrayBox(@m80.k SQLiteConnection connection, @m80.l Collection<? extends T> collection) {
        long j11;
        g0.p(connection, "connection");
        if (collection == null) {
            return new Long[0];
        }
        int size = collection.size();
        Long[] lArr = new Long[size];
        for (int i11 = 0; i11 < size; i11++) {
            try {
                j11 = this.entityInsertAdapter.insertAndReturnId(connection, r0.k2(collection, i11));
            } catch (SQLException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(connection, r0.k2(collection, i11));
                j11 = -1;
            }
            lArr[i11] = Long.valueOf(j11);
        }
        return lArr;
    }

    public final void upsert(@m80.k SQLiteConnection connection, @m80.l Iterable<? extends T> iterable) {
        g0.p(connection, "connection");
        if (iterable == null) {
            return;
        }
        for (T t11 : iterable) {
            try {
                this.entityInsertAdapter.insert(connection, (SQLiteConnection) t11);
            } catch (SQLException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(connection, t11);
            }
        }
    }

    @m80.k
    public final List<Long> upsertAndReturnIdsList(@m80.k SQLiteConnection connection, @m80.l Collection<? extends T> collection) {
        g0.p(connection, "connection");
        if (collection == null) {
            return h0.J();
        }
        List j11 = a00.g0.j();
        for (T t11 : collection) {
            try {
                j11.add(Long.valueOf(this.entityInsertAdapter.insertAndReturnId(connection, t11)));
            } catch (SQLException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(connection, t11);
                j11.add(-1L);
            }
        }
        return a00.g0.b(j11);
    }
}
