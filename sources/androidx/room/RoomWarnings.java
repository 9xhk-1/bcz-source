package androidx.room;

import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class RoomWarnings {

    @m80.k
    public static final String AMBIGUOUS_COLUMN_IN_RESULT = "ROOM_AMBIGUOUS_COLUMN_IN_RESULT";

    @m80.k
    public static final String CANNOT_CREATE_VERIFICATION_DATABASE = "ROOM_CANNOT_CREATE_VERIFICATION_DATABASE";

    @m80.k
    public static final String CURSOR_MISMATCH = "ROOM_CURSOR_MISMATCH";

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    public static final String DEFAULT_CONSTRUCTOR = "ROOM_DEFAULT_CONSTRUCTOR";

    @m80.k
    public static final String DOES_NOT_IMPLEMENT_EQUALS_HASHCODE = "ROOM_TYPE_DOES_NOT_IMPLEMENT_EQUALS_HASHCODE";

    @m80.k
    public static final String INDEX_FROM_EMBEDDED_ENTITY_IS_DROPPED = "ROOM_EMBEDDED_ENTITY_INDEX_IS_DROPPED";

    @m80.k
    public static final String INDEX_FROM_EMBEDDED_FIELD_IS_DROPPED = "ROOM_EMBEDDED_INDEX_IS_DROPPED";

    @m80.k
    public static final String INDEX_FROM_PARENT_FIELD_IS_DROPPED = "ROOM_PARENT_FIELD_INDEX_IS_DROPPED";

    @m80.k
    public static final String INDEX_FROM_PARENT_IS_DROPPED = "ROOM_PARENT_INDEX_IS_DROPPED";

    @m80.k
    public static final String MISMATCHED_GETTER = "ROOM_MISMATCHED_GETTER_TYPE";

    @m80.k
    public static final String MISMATCHED_SETTER = "ROOM_MISMATCHED_SETTER_TYPE";

    @m80.k
    public static final String MISSING_INDEX_ON_FOREIGN_KEY_CHILD = "ROOM_MISSING_FOREIGN_KEY_CHILD_INDEX";

    @m80.k
    public static final String MISSING_INDEX_ON_JUNCTION = "MISSING_INDEX_ON_JUNCTION";

    @m80.k
    public static final String MISSING_JAVA_TMP_DIR = "ROOM_MISSING_JAVA_TMP_DIR";

    @m80.k
    public static final String MISSING_SCHEMA_LOCATION = "ROOM_MISSING_SCHEMA_LOCATION";

    @m80.k
    public static final String PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED = "ROOM_EMBEDDED_PRIMARY_KEY_IS_DROPPED";

    @m80.k
    public static final String QUERY_MISMATCH = "ROOM_QUERY_MISMATCH";

    @m80.k
    public static final String RELATION_QUERY_WITHOUT_TRANSACTION = "ROOM_RELATION_QUERY_WITHOUT_TRANSACTION";

    @m80.k
    public static final String RELATION_TYPE_MISMATCH = "ROOM_RELATION_TYPE_MISMATCH";

    @m80.k
    public static final String UNNECESSARY_NULLABILITY_IN_DAO_RETURN_TYPE = "ROOM_UNNECESSARY_NULLABILITY_IN_DAO_RETURN_TYPE";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }

        @yz.n(message = "Replaced by QUERY_MISMATCH.", replaceWith = @w0(expression = "QUERY_MISMATCH", imports = {}))
        public static /* synthetic */ void getCURSOR_MISMATCH$annotations() {
        }
    }

    @yz.n(message = "This type should not be instantiated as it contains only static methods. ")
    public RoomWarnings() {
    }
}
