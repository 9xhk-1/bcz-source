package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class EntityDeleteOrUpdateAdapter<T> {
    public abstract void bind(@m80.k SQLiteStatement sQLiteStatement, T t11);

    @m80.k
    public abstract String createQuery();

    public final int handle(@m80.k SQLiteConnection connection, @m80.l T t11) {
        g0.p(connection, "connection");
        if (t11 == null) {
            return 0;
        }
        SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            bind(prepare, t11);
            prepare.step();
            u00.a.c(prepare, null);
            return SQLiteConnectionUtil.getTotalChangedRows(connection);
        } finally {
        }
    }

    public final int handleMultiple(@m80.k SQLiteConnection connection, @m80.l Iterable<? extends T> iterable) {
        g0.p(connection, "connection");
        int i11 = 0;
        if (iterable == null) {
            return 0;
        }
        SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            for (T t11 : iterable) {
                if (t11 != null) {
                    bind(prepare, t11);
                    prepare.step();
                    prepare.reset();
                    i11 += SQLiteConnectionUtil.getTotalChangedRows(connection);
                }
            }
            g2 g2Var = g2.f100423a;
            u00.a.c(prepare, null);
            return i11;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int handleMultiple(@m80.k SQLiteConnection connection, @m80.l T[] tArr) {
        g0.p(connection, "connection");
        int i11 = 0;
        if (tArr == null) {
            return 0;
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
                    i11 += SQLiteConnectionUtil.getTotalChangedRows(connection);
                }
            }
            g2 g2Var = g2.f100423a;
            u00.a.c(prepare, null);
            return i11;
        } finally {
        }
    }
}
