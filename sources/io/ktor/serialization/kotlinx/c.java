package io.ktor.serialization.kotlinx;

import f50.p0;
import io.ktor.serialization.b;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {
    public static final void a(@k io.ktor.serialization.b bVar, @k ix.k contentType, @k f50.a format) {
        g0.p(bVar, "<this>");
        g0.p(contentType, "contentType");
        g0.p(format, "format");
        b.a.b(bVar, contentType, new KotlinxSerializationConverter(format), null, 4, null);
    }

    public static final void b(@k io.ktor.serialization.b bVar, @k ix.k contentType, @k p0 format) {
        g0.p(bVar, "<this>");
        g0.p(contentType, "contentType");
        g0.p(format, "format");
        b.a.b(bVar, contentType, new KotlinxSerializationConverter(format), null, 4, null);
    }
}
