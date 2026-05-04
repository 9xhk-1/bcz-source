package androidx.room.util;

import a00.h0;
import a00.l1;
import androidx.annotation.RestrictTo;
import androidx.room.DatabaseConfiguration;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "MigrationUtil")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class MigrationUtil {
    public static final boolean contains(@k RoomDatabase.MigrationContainer migrationContainer, int i11, int i12) {
        g0.p(migrationContainer, "<this>");
        Map<Integer, Map<Integer, Migration>> migrations = migrationContainer.getMigrations();
        if (!migrations.containsKey(Integer.valueOf(i11))) {
            return false;
        }
        Map<Integer, Migration> map = migrations.get(Integer.valueOf(i11));
        if (map == null) {
            map = l1.z();
        }
        return map.containsKey(Integer.valueOf(i12));
    }

    @l
    public static final List<Migration> findMigrationPath(@k RoomDatabase.MigrationContainer migrationContainer, int i11, int i12) {
        g0.p(migrationContainer, "<this>");
        if (i11 == i12) {
            return h0.J();
        }
        return findUpMigrationPath(migrationContainer, new ArrayList(), i12 > i11, i11, i12);
    }

    private static final List<Migration> findUpMigrationPath(RoomDatabase.MigrationContainer migrationContainer, List<Migration> list, boolean z11, int i11, int i12) {
        int i13;
        boolean z12;
        while (true) {
            if (z11) {
                if (i11 >= i12) {
                    return list;
                }
            } else if (i11 <= i12) {
                return list;
            }
            Pair<Map<Integer, Migration>, Iterable<Integer>> sortedDescendingNodes$room_runtime_release = z11 ? migrationContainer.getSortedDescendingNodes$room_runtime_release(i11) : migrationContainer.getSortedNodes$room_runtime_release(i11);
            if (sortedDescendingNodes$room_runtime_release == null) {
                return null;
            }
            Map<Integer, Migration> component1 = sortedDescendingNodes$room_runtime_release.component1();
            Iterator<Integer> it = sortedDescendingNodes$room_runtime_release.component2().iterator();
            while (it.hasNext()) {
                i13 = it.next().intValue();
                if (!z11) {
                    if (i12 <= i13 && i13 < i11) {
                        Migration migration = component1.get(Integer.valueOf(i13));
                        g0.m(migration);
                        list.add(migration);
                        z12 = true;
                        break;
                    }
                } else if (i11 + 1 <= i13 && i13 <= i12) {
                    Migration migration2 = component1.get(Integer.valueOf(i13));
                    g0.m(migration2);
                    list.add(migration2);
                    z12 = true;
                    break;
                }
            }
            i13 = i11;
            z12 = false;
            if (!z12) {
                return null;
            }
            i11 = i13;
        }
    }

    public static final boolean isMigrationRequired(@k DatabaseConfiguration databaseConfiguration, int i11, int i12) {
        g0.p(databaseConfiguration, "<this>");
        if (i11 > i12 && databaseConfiguration.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set<Integer> migrationNotRequiredFrom$room_runtime_release = databaseConfiguration.getMigrationNotRequiredFrom$room_runtime_release();
        return databaseConfiguration.requireMigration && (migrationNotRequiredFrom$room_runtime_release == null || !migrationNotRequiredFrom$room_runtime_release.contains(Integer.valueOf(i11)));
    }
}
