package x30;

import java.time.Instant;
import kotlin.jvm.internal.g0;
import kotlin.time.Instant;
import m80.k;
import w00.j;
import w30.h;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "InstantConversionsJDK8Kt")
/* loaded from: classes8.dex */
public final class g {
    @y0(version = "2.1")
    @h
    @k
    public static final Instant a(@k kotlin.time.Instant instant) {
        Instant ofEpochSecond;
        g0.p(instant, "<this>");
        ofEpochSecond = Instant.ofEpochSecond(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
        g0.o(ofEpochSecond, "ofEpochSecond(...)");
        return ofEpochSecond;
    }

    @y0(version = "2.1")
    @h
    @k
    public static final kotlin.time.Instant b(@k Instant instant) {
        long epochSecond;
        int nano;
        g0.p(instant, "<this>");
        Instant.a aVar = kotlin.time.Instant.Companion;
        epochSecond = instant.getEpochSecond();
        nano = instant.getNano();
        return aVar.b(epochSecond, nano);
    }
}
