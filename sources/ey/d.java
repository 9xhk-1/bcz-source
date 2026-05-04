package ey;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f50228a = a.f50229a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f50229a = new a();

        public static /* synthetic */ ey.a b(a aVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return aVar.a(str);
        }

        @m80.k
        public final ey.a a(@m80.l String str) {
            ey.a c11;
            if (str == null && (c11 = c()) != null) {
                return c11;
            }
            Iterator<d> it = e.b().iterator();
            while (it.hasNext()) {
                ey.a load = it.next().load(str);
                if (load != null) {
                    return load;
                }
            }
            return new i();
        }

        public final ey.a c() {
            for (String str : e.a()) {
                Iterator<d> it = e.b().iterator();
                while (it.hasNext()) {
                    ey.a load = it.next().load(str);
                    if (load != null) {
                        return load;
                    }
                }
            }
            return null;
        }
    }

    @m80.l
    ey.a load(@m80.l String str);
}
