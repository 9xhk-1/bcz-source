package androidx.room;

import a00.h0;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEntityInsertionAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityInsertionAdapter.android.kt\nandroidx/room/EntityInsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,231:1\n13402#2,2:232\n13467#2,3:239\n13402#2,2:242\n1863#3,2:234\n1872#3,3:236\n1863#3,2:244\n*S KotlinDebug\n*F\n+ 1 EntityInsertionAdapter.android.kt\nandroidx/room/EntityInsertionAdapter\n*L\n65#1:232,2\n137#1:239,3\n201#1:242,2\n82#1:234,2\n117#1:236,3\n221#1:244,2\n*E\n"})
@yz.n(message = "No longer used by generated code.", replaceWith = @w0(expression = "EntityInsertAdapter", imports = {}))
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(@m80.k RoomDatabase database) {
        super(database);
        g0.p(database, "database");
    }

    public abstract void bind(@m80.k SupportSQLiteStatement supportSQLiteStatement, T t11);

    public final void insert(T t11) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t11);
            acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(T t11) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t11);
            return acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    @m80.k
    public final long[] insertAndReturnIdsArray(@m80.k Collection<? extends T> entities) {
        g0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i11 = 0;
            for (T t11 : entities) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    h0.b0();
                }
                bind(acquire, t11);
                jArr[i11] = acquire.executeInsert();
                i11 = i12;
            }
            release(acquire);
            return jArr;
        } catch (Throwable th2) {
            release(acquire);
            throw th2;
        }
    }

    @m80.k
    public final Long[] insertAndReturnIdsArrayBox(@m80.k Collection<? extends T> entities) {
        g0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i11 = 0; i11 < size; i11++) {
                bind(acquire, it.next());
                lArr[i11] = Long.valueOf(acquire.executeInsert());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    @m80.k
    public final List<Long> insertAndReturnIdsList(@m80.k T[] entities) {
        g0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            List j11 = a00.g0.j();
            for (T t11 : entities) {
                bind(acquire, t11);
                j11.add(Long.valueOf(acquire.executeInsert()));
            }
            List<Long> b11 = a00.g0.b(j11);
            release(acquire);
            return b11;
        } catch (Throwable th2) {
            release(acquire);
            throw th2;
        }
    }

    public final void insert(@m80.k T[] entities) {
        g0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            for (T t11 : entities) {
                bind(acquire, t11);
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }

    @m80.k
    public final long[] insertAndReturnIdsArray(@m80.k T[] entities) {
        g0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                int i13 = i12 + 1;
                bind(acquire, entities[i11]);
                jArr[i12] = acquire.executeInsert();
                i11++;
                i12 = i13;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final Long[] insertAndReturnIdsArrayBox(@m80.k T[] entities) {
        g0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        Iterator a11 = kotlin.jvm.internal.h.a(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bind(acquire, a11.next());
                lArr[i11] = Long.valueOf(acquire.executeInsert());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    @m80.k
    public final List<Long> insertAndReturnIdsList(@m80.k Collection<? extends T> entities) {
        g0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            List j11 = a00.g0.j();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                j11.add(Long.valueOf(acquire.executeInsert()));
            }
            List<Long> b11 = a00.g0.b(j11);
            release(acquire);
            return b11;
        } catch (Throwable th2) {
            release(acquire);
            throw th2;
        }
    }

    public final void insert(@m80.k Iterable<? extends T> entities) {
        g0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }
}
