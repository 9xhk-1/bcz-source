package androidx.room.util;

import androidx.annotation.RestrictTo;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class ByteArrayWrapper {

    @g
    @k
    public final byte[] array;

    public ByteArrayWrapper(@k byte[] array) {
        g0.p(array, "array");
        this.array = array;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ByteArrayWrapper) {
            return Arrays.equals(this.array, ((ByteArrayWrapper) obj).array);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.array);
    }
}
