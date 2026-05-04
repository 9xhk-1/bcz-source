package x20;

import x20.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f97075a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f97076b;

        static {
            d.a aVar = d.f97078c;
            f97076b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        @Override // x20.c
        public int a() {
            return f97076b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f97077a = new b();

        @Override // x20.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
