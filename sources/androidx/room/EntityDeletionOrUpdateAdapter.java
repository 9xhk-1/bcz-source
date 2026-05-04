package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEntityDeletionOrUpdateAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityDeletionOrUpdateAdapter.android.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n1863#2,2:106\n13402#3,2:108\n*S KotlinDebug\n*F\n+ 1 EntityDeletionOrUpdateAdapter.android.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n*L\n75#1:106,2\n95#1:108,2\n*E\n"})
@yz.n(message = "No longer used by generated code.", replaceWith = @w0(expression = "EntityDeleteOrUpdateAdapter", imports = {}))
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class EntityDeletionOrUpdateAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityDeletionOrUpdateAdapter(@m80.k RoomDatabase database) {
        super(database);
        g0.p(database, "database");
    }

    public abstract void bind(@m80.k SupportSQLiteStatement supportSQLiteStatement, T t11);

    @Override // androidx.room.SharedSQLiteStatement
    @m80.k
    public abstract String createQuery();

    public final int handle(T t11) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t11);
            return acquire.executeUpdateDelete();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(@m80.k Iterable<? extends T> entities) {
        g0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                bind(acquire, it.next());
                i11 += acquire.executeUpdateDelete();
            }
            return i11;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(@m80.k T[] entities) {
        g0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            int i11 = 0;
            for (T t11 : entities) {
                bind(acquire, t11);
                i11 += acquire.executeUpdateDelete();
            }
            return i11;
        } finally {
            release(acquire);
        }
    }
}
