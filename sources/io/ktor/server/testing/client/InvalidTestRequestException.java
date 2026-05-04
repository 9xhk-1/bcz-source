package io.ktor.server.testing.client;

import a00.r0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class InvalidTestRequestException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidTestRequestException(@k String authority, @k Set<String> externalAuthorities, @k List<String> mainHostWithPorts) {
        super("Can not resolve request to " + authority + ". Main app runs at " + r0.r3(mainHostWithPorts, null, null, null, 0, null, null, 63, null) + " and external services are " + r0.r3(externalAuthorities, null, null, null, 0, null, null, 63, null));
        g0.p(authority, "authority");
        g0.p(externalAuthorities, "externalAuthorities");
        g0.p(mainHostWithPorts, "mainHostWithPorts");
    }
}
