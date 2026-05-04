package xe;

import sh.e;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: xe.a$a, reason: collision with other inner class name */
    public class C1321a implements p<Integer, Boolean> {
        public C1321a() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Integer integer) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<Integer, Boolean> {
        public b() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Integer integer) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements p<Integer, Boolean> {
        public c() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Integer integer) {
            return Boolean.TRUE;
        }
    }

    public boolean a() {
        return e.e().d(3).b() == 1;
    }

    public boolean b() {
        return e.e().d(2).b() == 1;
    }

    public boolean c() {
        return e.e().d(1).b() == 1;
    }

    public rx.c<Boolean> d(boolean open) {
        if (open == a()) {
            return rx.c.M2(Boolean.FALSE);
        }
        return e.g(3, open ? 1 : -1).c3(new c()).I3(tb0.a.a());
    }

    public rx.c<Boolean> e(boolean open) {
        if (open == b()) {
            return rx.c.M2(Boolean.FALSE);
        }
        return e.g(2, open ? 1 : -1).c3(new C1321a()).I3(tb0.a.a());
    }

    public rx.c<Boolean> f(boolean open) {
        if (open == c()) {
            return rx.c.M2(Boolean.FALSE);
        }
        return e.g(1, open ? 1 : -1).c3(new b()).I3(tb0.a.a());
    }
}
