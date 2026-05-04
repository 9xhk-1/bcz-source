package io.ktor.util;

import io.ktor.util.Platform;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f61994a = "io.ktor.development";

    @k
    public static final Platform a(@k a aVar) {
        g0.p(aVar, "<this>");
        return Platform.b.f61982a;
    }

    public static final boolean b(@k a aVar) {
        g0.p(aVar, "<this>");
        String property = System.getProperty(f61994a);
        return property != null && Boolean.parseBoolean(property);
    }

    public static final boolean c(@k a aVar) {
        g0.p(aVar, "<this>");
        return true;
    }
}
