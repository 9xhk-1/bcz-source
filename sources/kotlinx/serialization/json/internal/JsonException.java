package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.g0;
import kotlinx.serialization.SerializationException;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class JsonException extends SerializationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonException(@k String message) {
        super(message);
        g0.p(message, "message");
    }
}
