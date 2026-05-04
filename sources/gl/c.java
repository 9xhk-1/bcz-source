package gl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f53946a = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends c {

        /* renamed from: b, reason: collision with root package name */
        public volatile RuntimeException f53947b;

        public b() {
            super();
        }

        @Override // gl.c
        public void b(boolean z11) {
            if (z11) {
                this.f53947b = new RuntimeException("Released");
            } else {
                this.f53947b = null;
            }
        }

        @Override // gl.c
        public void c() {
            if (this.f53947b != null) {
                throw new IllegalStateException("Already released", this.f53947b);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: gl.c$c, reason: collision with other inner class name */
    public static class C0639c extends c {

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f53948b;

        public C0639c() {
            super();
        }

        @Override // gl.c
        public void b(boolean z11) {
            this.f53948b = z11;
        }

        @Override // gl.c
        public void c() {
            if (this.f53948b) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @NonNull
    public static c a() {
        return new C0639c();
    }

    public abstract void b(boolean z11);

    public abstract void c();

    public c() {
    }
}
