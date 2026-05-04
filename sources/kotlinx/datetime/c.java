package kotlinx.datetime;

import f50.a0;
import java.time.ZoneId;
import kotlin.jvm.internal.g0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0(with = x40.r.class)
/* loaded from: classes8.dex */
public final class c extends q {

    @m80.k
    public static final a Companion = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final UtcOffset f68507c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public a() {
        }

        @m80.k
        public final f50.i<c> serializer() {
            return x40.r.f97456a;
        }

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@m80.k UtcOffset offset, @m80.k ZoneId zoneId) {
        super(zoneId);
        g0.p(offset, "offset");
        g0.p(zoneId, "zoneId");
        this.f68507c = offset;
    }

    @m80.k
    public final UtcOffset g() {
        return this.f68507c;
    }

    public final int h() {
        return this.f68507c.getTotalSeconds();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@m80.k UtcOffset offset) {
        this(offset, vx.g.a(offset.getZoneOffset$kotlinx_datetime()));
        g0.p(offset, "offset");
    }

    @yz.n(message = "Use offset.totalSeconds", replaceWith = @w0(expression = "offset.totalSeconds", imports = {}))
    public static /* synthetic */ void i() {
    }
}
