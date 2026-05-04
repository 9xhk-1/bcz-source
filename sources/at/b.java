package at;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.o;
import ws.f;
import ws.g;
import ws.i;
import ws.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f5484a = new b();

    @o
    public static final void a(@k i protocol, byte b11) throws IOException {
        g0.p(protocol, "protocol");
        if (b11 == 2) {
            protocol.readBool();
            return;
        }
        if (b11 == 3) {
            protocol.readByte();
            return;
        }
        if (b11 == 6) {
            protocol.w6();
            return;
        }
        if (b11 == 8) {
            protocol.s8();
            return;
        }
        if (b11 == 10) {
            protocol.T1();
            return;
        }
        if (b11 == 4) {
            protocol.readDouble();
            return;
        }
        if (b11 == 11) {
            protocol.readString();
            return;
        }
        if (b11 != 12) {
            int i11 = 0;
            if (b11 == 15) {
                f v42 = protocol.v4();
                int i12 = v42.f96838b;
                while (i11 < i12) {
                    a(protocol, v42.f96837a);
                    i11++;
                }
                protocol.l8();
                return;
            }
            if (b11 == 14) {
                j X0 = protocol.X0();
                int i13 = X0.f96846b;
                while (i11 < i13) {
                    a(protocol, X0.f96845a);
                    i11++;
                }
                protocol.l4();
                return;
            }
            if (b11 != 13) {
                throw new ProtocolException("Unrecognized TType value: " + ((int) b11));
            }
            g O = protocol.O();
            int i14 = O.f96841c;
            while (i11 < i14) {
                a(protocol, O.f96839a);
                a(protocol, O.f96840b);
                i11++;
            }
            protocol.b6();
            return;
        }
        protocol.u0();
        while (true) {
            byte b12 = protocol.a6().f96796b;
            if (b12 == 0) {
                protocol.I4();
                return;
            } else {
                a(protocol, b12);
                protocol.A7();
            }
        }
    }
}
