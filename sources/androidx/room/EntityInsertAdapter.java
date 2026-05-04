package androidx.room;

import a00.h0;
import a00.r0;
import androidx.annotation.RestrictTo;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@u0({"SMAP\nEntityInsertAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityInsertAdapter.kt\nandroidx/room/EntityInsertAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,264:1\n13402#2,2:265\n1863#3,2:267\n*S KotlinDebug\n*F\n+ 1 EntityInsertAdapter.kt\nandroidx/room/EntityInsertAdapter\n*L\n223#1:265,2\n250#1:267,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class EntityInsertAdapter<T> {
    public abstract void bind(@m80.k SQLiteStatement sQLiteStatement, T t11);

    @m80.k
    public abstract String createQuery();

    public final void insert(@m80.k SQLiteConnection connection, @m80.l T t11) {
        g0.p(connection, "connection");
        if (t11 == null) {
            return;
        }
        SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            bind(prepare, t11);
            prepare.step();
            u00.a.c(prepare, null);
        } finally {
        }
    }

    public final long insertAndReturnId(@m80.k SQLiteConnection connection, @m80.l T t11) {
        g0.p(connection, "connection");
        if (t11 == null) {
            return -1L;
        }
        SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            bind(prepare, t11);
            prepare.step();
            u00.a.c(prepare, null);
            return SQLiteConnectionUtil.getLastInsertedRowId(connection);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final long[] insertAndReturnIdsArray(@m80.k SQLiteConnection connection, @m80.l Collection<? extends T> collection) {
        long j11;
        g0.p(connection, "connection");
        if (collection == null) {
            return new long[0];
        }
        SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            int size = collection.size();
            long[] jArr = new long[size];
            for (int i11 = 0; i11 < size; i11++) {
                Object k22 = r0.k2(collection, i11);
                if (k22 != null) {
                    bind(prepare, k22);
                    prepare.step();
                    prepare.reset();
                    j11 = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    j11 = -1;
                }
                jArr[i11] = j11;
            }
            u00.a.c(prepare, null);
            return jArr;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final Long[] insertAndReturnIdsArrayBox(@m80.k SQLiteConnection connection, @m80.l Collection<? extends T> collection) {
        long j11;
        g0.p(connection, "connection");
        if (collection == null) {
            return new Long[0];
        }
        SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i11 = 0; i11 < size; i11++) {
                Object k22 = r0.k2(collection, i11);
                if (k22 != null) {
                    bind(prepare, k22);
                    prepare.step();
                    prepare.reset();
                    j11 = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    j11 = -1;
                }
                lArr[i11] = Long.valueOf(j11);
            }
            u00.a.c(prepare, null);
            return lArr;
        } finally {
        }
    }

    @m80.k
    public final List<Long> insertAndReturnIdsList(@m80.k SQLiteConnection connection, @m80.l T[] tArr) {
        g0.p(connection, "connection");
        if (tArr == null) {
            return h0.J();
        }
        List j11 = a00.g0.j();
        SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            for (T t11 : tArr) {
                if (t11 != null) {
                    bind(prepare, t11);
                    prepare.step();
                    prepare.reset();
                    j11.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(connection)));
                } else {
                    j11.add(-1L);
                }
            }
            g2 g2Var = g2.f100423a;
            u00.a.c(prepare, null);
            return a00.g0.b(j11);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void insert(@m80.k SQLiteConnection connection, @m80.l T[] tArr) {
        g0.p(connection, "connection");
        if (tArr == null) {
            return;
        }
        SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            Iterator a11 = kotlin.jvm.internal.h.a(tArr);
            while (a11.hasNext()) {
                Object next = a11.next();
                if (next != null) {
                    bind(prepare, next);
                    prepare.step();
                    prepare.reset();
                }
            }
            g2 g2Var = g2.f100423a;
            u00.a.c(prepare, null);
        } finally {
        }
    }

    @m80.k
    public final long[] insertAndReturnIdsArray(@m80.k SQLiteConnection connection, @m80.l T[] tArr) {
        long j11;
        g0.p(connection, "connection");
        if (tArr == null) {
            return new long[0];
        }
        SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            int length = tArr.length;
            long[] jArr = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                T t11 = tArr[i11];
                if (t11 != null) {
                    bind(prepare, t11);
                    prepare.step();
                    prepare.reset();
                    j11 = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    j11 = -1;
                }
                jArr[i11] = j11;
            }
            u00.a.c(prepare, null);
            return jArr;
        } finally {
        }
    }

    @m80.k
    public final Long[] insertAndReturnIdsArrayBox(@m80.k SQLiteConnection connection, @m80.l T[] tArr) {
        long j11;
        g0.p(connection, "connection");
        if (tArr == null) {
            return new Long[0];
        }
        SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            int length = tArr.length;
            Long[] lArr = new Long[length];
            for (int i11 = 0; i11 < length; i11++) {
                T t11 = tArr[i11];
                if (t11 != null) {
                    bind(prepare, t11);
                    prepare.step();
                    prepare.reset();
                    j11 = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    j11 = -1;
                }
                lArr[i11] = Long.valueOf(j11);
            }
            u00.a.c(prepare, null);
            return lArr;
        } finally {
        }
    }

    public final void insert(@m80.k SQLiteConnection connection, @m80.l Iterable<? extends T> iterable) {
        g0.p(connection, "connection");
        if (iterable == null) {
            return;
        }
        SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            for (T t11 : iterable) {
                if (t11 != null) {
                    bind(prepare, t11);
                    prepare.step();
                    prepare.reset();
                }
            }
            g2 g2Var = g2.f100423a;
            u00.a.c(prepare, null);
        } finally {
        }
    }

    @m80.k
    public final List<Long> insertAndReturnIdsList(@m80.k SQLiteConnection connection, @m80.l Collection<? extends T> collection) {
        g0.p(connection, "connection");
        if (collection == null) {
            return h0.J();
        }
        List j11 = a00.g0.j();
        SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            for (T t11 : collection) {
                if (t11 != null) {
                    bind(prepare, t11);
                    prepare.step();
                    prepare.reset();
                    j11.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(connection)));
                } else {
                    j11.add(-1L);
                }
            }
            g2 g2Var = g2.f100423a;
            u00.a.c(prepare, null);
            return a00.g0.b(j11);
        } finally {
        }
    }
}
