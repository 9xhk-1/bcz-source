package e40;

import c40.c1;
import e40.k0;
import e40.l0;
import h40.a1;
import kotlin.DeprecationLevel;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface o<E> extends l0<E>, k0<E> {

    /* renamed from: n0, reason: collision with root package name */
    @m80.k
    public static final b f49142n0 = b.f49149a;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f49143o0 = Integer.MAX_VALUE;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f49144p0 = 0;

    /* renamed from: q0, reason: collision with root package name */
    public static final int f49145q0 = -1;

    /* renamed from: r0, reason: collision with root package name */
    public static final int f49146r0 = -2;

    /* renamed from: s0, reason: collision with root package name */
    public static final int f49147s0 = -3;

    /* renamed from: t0, reason: collision with root package name */
    @m80.k
    public static final String f49148t0 = "kotlinx.coroutines.channels.defaultBuffer";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @m80.k
        public static <E> k40.h<E> b(@m80.k o<E> oVar) {
            return k0.a.d(oVar);
        }

        @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @w0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@m80.k o<E> oVar, E e11) {
            return l0.a.c(oVar, e11);
        }

        @m80.l
        @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @w0(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E d(@m80.k o<E> oVar) {
            return (E) k0.a.h(oVar);
        }

        @m80.l
        @o00.i
        @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @w0(expression = "receiveCatching().getOrNull()", imports = {}))
        public static <E> Object e(@m80.k o<E> oVar, @m80.k j00.c<? super E> cVar) {
            return k0.a.i(oVar, cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final int f49150b = Integer.MAX_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public static final int f49151c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final int f49152d = -1;

        /* renamed from: e, reason: collision with root package name */
        public static final int f49153e = -2;

        /* renamed from: f, reason: collision with root package name */
        public static final int f49154f = -3;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public static final String f49155g = "kotlinx.coroutines.channels.defaultBuffer";

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f49149a = new b();

        /* renamed from: h, reason: collision with root package name */
        public static final int f49156h = a1.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        public final int a() {
            return f49156h;
        }

        @c1
        public static /* synthetic */ void b() {
        }
    }
}
