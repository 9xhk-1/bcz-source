package androidx.room.util;

import androidx.annotation.RestrictTo;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "UUIDUtil")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class UUIDUtil {
    @k
    public static final UUID convertByteToUUID(@k byte[] bytes) {
        g0.p(bytes, "bytes");
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    @k
    public static final byte[] convertUUIDToByte(@k UUID uuid) {
        g0.p(uuid, "uuid");
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        byte[] array = wrap.array();
        g0.o(array, "array(...)");
        return array;
    }
}
