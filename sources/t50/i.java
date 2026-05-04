package t50;

import a00.h0;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f89615a = a.f89617a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final i f89616b = new a.C1180a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f89617a = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: t50.i$a$a, reason: collision with other inner class name */
        public static final class C1180a implements i {
            @Override // t50.i
            @m80.k
            public List<h> a(@m80.k okhttp3.i url) {
                g0.p(url, "url");
                return h0.J();
            }

            @Override // t50.i
            public void b(@m80.k okhttp3.i url, @m80.k List<h> cookies) {
                g0.p(url, "url");
                g0.p(cookies, "cookies");
            }
        }
    }

    @m80.k
    List<h> a(@m80.k okhttp3.i iVar);

    void b(@m80.k okhttp3.i iVar, @m80.k List<h> list);
}
