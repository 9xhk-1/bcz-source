package t50;

import a00.a0;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f89626a = a.f89628a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final l f89627b = new a.C1181a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f89628a = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: t50.l$a$a, reason: collision with other inner class name */
        public static final class C1181a implements l {
            @Override // t50.l
            @m80.k
            public List<InetAddress> a(@m80.k String hostname) {
                g0.p(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    g0.o(allByName, "getAllByName(hostname)");
                    return a0.dz(allByName);
                } catch (NullPointerException e11) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e11);
                    throw unknownHostException;
                }
            }
        }
    }

    @m80.k
    List<InetAddress> a(@m80.k String str) throws UnknownHostException;
}
