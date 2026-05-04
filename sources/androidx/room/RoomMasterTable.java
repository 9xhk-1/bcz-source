package androidx.room;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class RoomMasterTable {

    @m80.k
    private static final String COLUMN_ID = "id";

    @m80.k
    private static final String COLUMN_IDENTITY_HASH = "identity_hash";

    @m80.k
    public static final String CREATE_QUERY = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    @m80.k
    public static final String DEFAULT_ID = "42";

    @m80.k
    public static final RoomMasterTable INSTANCE = new RoomMasterTable();

    @m80.k
    public static final String NAME = "room_master_table";

    @m80.k
    public static final String READ_QUERY = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    @m80.k
    public static final String TABLE_NAME = "room_master_table";

    private RoomMasterTable() {
    }

    @w00.o
    @m80.k
    public static final String createInsertQuery(@m80.k String hash) {
        g0.p(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
