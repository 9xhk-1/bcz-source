package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "MigrationKt")
/* loaded from: classes3.dex */
public final class MigrationKt {
    @k
    public static final Migration Migration(int i11, int i12, @k l<? super SupportSQLiteDatabase, g2> migrate) {
        g0.p(migrate, "migrate");
        return new MigrationImpl(i11, i12, migrate);
    }
}
