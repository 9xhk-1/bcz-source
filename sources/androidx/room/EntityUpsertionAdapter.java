package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.k0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEntityUpsertionAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityUpsertionAdapter.android.kt\nandroidx/room/EntityUpsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n13402#2,2:218\n13402#2,2:222\n1863#3,2:220\n1863#3,2:224\n*S KotlinDebug\n*F\n+ 1 EntityUpsertionAdapter.android.kt\nandroidx/room/EntityUpsertionAdapter\n*L\n73#1:218,2\n145#1:222,2\n84#1:220,2\n159#1:224,2\n*E\n"})
@yz.n(message = "No longer used by generated code.", replaceWith = @w0(expression = "EntityUpsertAdapter", imports = {}))
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class EntityUpsertionAdapter<T> {

    @m80.k
    private final EntityInsertionAdapter<T> insertionAdapter;

    @m80.k
    private final EntityDeletionOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertionAdapter(@m80.k EntityInsertionAdapter<T> insertionAdapter, @m80.k EntityDeletionOrUpdateAdapter<T> updateAdapter) {
        g0.p(insertionAdapter, "insertionAdapter");
        g0.p(updateAdapter, "updateAdapter");
        this.insertionAdapter = insertionAdapter;
        this.updateAdapter = updateAdapter;
    }

    private final void checkUniquenessException(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message == null) {
            throw sQLiteConstraintException;
        }
        if (!k0.k3(message, "unique", true) && !k0.n3(message, "2067", false, 2, null) && !k0.n3(message, "1555", false, 2, null)) {
            throw sQLiteConstraintException;
        }
    }

    public final void upsert(T t11) {
        try {
            this.insertionAdapter.insert((EntityInsertionAdapter<T>) t11);
        } catch (SQLiteConstraintException e11) {
            checkUniquenessException(e11);
            this.updateAdapter.handle(t11);
        }
    }

    public final long upsertAndReturnId(T t11) {
        try {
            return this.insertionAdapter.insertAndReturnId(t11);
        } catch (SQLiteConstraintException e11) {
            checkUniquenessException(e11);
            this.updateAdapter.handle(t11);
            return -1L;
        }
    }

    @m80.k
    public final long[] upsertAndReturnIdsArray(@m80.k T[] entities) {
        long j11;
        g0.p(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i11 = 0; i11 < length; i11++) {
            try {
                j11 = this.insertionAdapter.insertAndReturnId(entities[i11]);
            } catch (SQLiteConstraintException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(entities[i11]);
                j11 = -1;
            }
            jArr[i11] = j11;
        }
        return jArr;
    }

    @m80.k
    public final Long[] upsertAndReturnIdsArrayBox(@m80.k T[] entities) {
        long j11;
        g0.p(entities, "entities");
        int length = entities.length;
        Long[] lArr = new Long[length];
        for (int i11 = 0; i11 < length; i11++) {
            try {
                j11 = this.insertionAdapter.insertAndReturnId(entities[i11]);
            } catch (SQLiteConstraintException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(entities[i11]);
                j11 = -1;
            }
            lArr[i11] = Long.valueOf(j11);
        }
        return lArr;
    }

    @m80.k
    public final List<Long> upsertAndReturnIdsList(@m80.k T[] entities) {
        g0.p(entities, "entities");
        List j11 = a00.g0.j();
        for (T t11 : entities) {
            try {
                j11.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t11)));
            } catch (SQLiteConstraintException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(t11);
                j11.add(-1L);
            }
        }
        return a00.g0.b(j11);
    }

    public final void upsert(@m80.k T[] entities) {
        g0.p(entities, "entities");
        for (T t11 : entities) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t11);
            } catch (SQLiteConstraintException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(t11);
            }
        }
    }

    @m80.k
    public final long[] upsertAndReturnIdsArray(@m80.k Collection<? extends T> entities) {
        long j11;
        g0.p(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i11 = 0; i11 < size; i11++) {
            T next = it.next();
            try {
                j11 = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(next);
                j11 = -1;
            }
            jArr[i11] = j11;
        }
        return jArr;
    }

    @m80.k
    public final Long[] upsertAndReturnIdsArrayBox(@m80.k Collection<? extends T> entities) {
        long j11;
        g0.p(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        Long[] lArr = new Long[size];
        for (int i11 = 0; i11 < size; i11++) {
            T next = it.next();
            try {
                j11 = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(next);
                j11 = -1;
            }
            lArr[i11] = Long.valueOf(j11);
        }
        return lArr;
    }

    public final void upsert(@m80.k Iterable<? extends T> entities) {
        g0.p(entities, "entities");
        for (T t11 : entities) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t11);
            } catch (SQLiteConstraintException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(t11);
            }
        }
    }

    @m80.k
    public final List<Long> upsertAndReturnIdsList(@m80.k Collection<? extends T> entities) {
        g0.p(entities, "entities");
        List j11 = a00.g0.j();
        for (T t11 : entities) {
            try {
                j11.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t11)));
            } catch (SQLiteConstraintException e11) {
                checkUniquenessException(e11);
                this.updateAdapter.handle(t11);
                j11.add(-1L);
            }
        }
        return a00.g0.b(j11);
    }
}
