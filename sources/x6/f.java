package x6;

import k3.c4;
import k3.g2;
import k3.g3;
import k3.h2;
import kotlin.time.Instant;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.q;
import m80.k;
import r40.t2;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final h2 f97598a = new h2(new c4.a(0, 1, null), new g3.a(0, 1, null), new g2.a(0, 1, null));

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f97599b = "incentive_service_scope";

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f97600c = "IncentiveService";

    @k
    public static final LocalDateTime b(long j11) {
        return t2.i(Instant.Companion.a(j11), q.Companion.a());
    }

    public static final int c(long j11) {
        try {
            LocalDateTime b11 = b(j11);
            return Integer.parseInt(b11.getYear() + k0.m4(String.valueOf(b11.getMonthNumber()), 2, '0') + k0.m4(String.valueOf(b11.getDayOfMonth()), 2, '0'));
        } catch (Exception e11) {
            z6.b.f101032b.e(f97600c, "", e11);
            return 0;
        }
    }
}
