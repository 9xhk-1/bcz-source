package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class RoomOpenDelegate implements RoomOpenDelegateMarker {

    @m80.k
    private final String identityHash;

    @m80.k
    private final String legacyIdentityHash;
    private final int version;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class ValidationResult {

        @m80.l
        @w00.g
        public final String expectedFoundMsg;

        @w00.g
        public final boolean isValid;

        public ValidationResult(boolean z11, @m80.l String str) {
            this.isValid = z11;
            this.expectedFoundMsg = str;
        }
    }

    public RoomOpenDelegate(int i11, @m80.k String identityHash, @m80.k String legacyIdentityHash) {
        g0.p(identityHash, "identityHash");
        g0.p(legacyIdentityHash, "legacyIdentityHash");
        this.version = i11;
        this.identityHash = identityHash;
        this.legacyIdentityHash = legacyIdentityHash;
    }

    public abstract void createAllTables(@m80.k SQLiteConnection sQLiteConnection);

    public abstract void dropAllTables(@m80.k SQLiteConnection sQLiteConnection);

    @m80.k
    public final String getIdentityHash() {
        return this.identityHash;
    }

    @m80.k
    public final String getLegacyIdentityHash() {
        return this.legacyIdentityHash;
    }

    public final int getVersion() {
        return this.version;
    }

    public abstract void onCreate(@m80.k SQLiteConnection sQLiteConnection);

    public abstract void onOpen(@m80.k SQLiteConnection sQLiteConnection);

    public abstract void onPostMigrate(@m80.k SQLiteConnection sQLiteConnection);

    public abstract void onPreMigrate(@m80.k SQLiteConnection sQLiteConnection);

    @m80.k
    public abstract ValidationResult onValidateSchema(@m80.k SQLiteConnection sQLiteConnection);
}
