package io.ktor.serialization.kotlinx.json;

import f50.w;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f implements io.ktor.serialization.kotlinx.e {
    @Override // io.ktor.serialization.kotlinx.e
    @l
    public io.ktor.serialization.kotlinx.d a(@k w format) {
        g0.p(format, "format");
        if (format instanceof k50.a) {
            return new KotlinxSerializationJsonExtensions((k50.a) format);
        }
        return null;
    }
}
