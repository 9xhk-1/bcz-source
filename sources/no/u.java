package no;

import java.nio.Buffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.c
@i
/* loaded from: classes7.dex */
public final class u {
    public static void a(Buffer b11) {
        b11.clear();
    }

    public static void b(Buffer b11) {
        b11.flip();
    }

    public static void c(Buffer b11, int limit) {
        b11.limit(limit);
    }

    public static void d(Buffer b11, int position) {
        b11.position(position);
    }
}
