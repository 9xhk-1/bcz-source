package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public UninitializedMessageException(final MessageLite message) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    private static String buildDescription(final List<String> missingFields) {
        StringBuilder sb2 = new StringBuilder("Message missing required fields: ");
        boolean z11 = true;
        for (String str : missingFields) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(j2.O);
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new InvalidProtocolBufferException(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.missingFields);
    }

    public UninitializedMessageException(final List<String> missingFields) {
        super(buildDescription(missingFields));
        this.missingFields = missingFields;
    }
}
