package androidx.datastore.preferences.protobuf;

import java.nio.Buffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class Java8Compatibility {
    private Java8Compatibility() {
    }

    public static void clear(Buffer b11) {
        b11.clear();
    }

    public static void flip(Buffer b11) {
        b11.flip();
    }

    public static void limit(Buffer b11, int limit) {
        b11.limit(limit);
    }

    public static void mark(Buffer b11) {
        b11.mark();
    }

    public static void position(Buffer b11, int position) {
        b11.position(position);
    }

    public static void reset(Buffer b11) {
        b11.reset();
    }
}
