package i80;

import android.os.Looper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public final Looper f60310a;

        public a(Looper looper) {
            this.f60310a = looper;
        }

        @Override // i80.g
        public boolean a() {
            return this.f60310a == Looper.myLooper();
        }

        @Override // i80.g
        public k b(c cVar) {
            return new e(cVar, this.f60310a, 10);
        }
    }

    boolean a();

    k b(c cVar);
}
