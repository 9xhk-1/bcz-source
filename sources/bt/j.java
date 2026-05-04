package bt;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public float f7278a;

    /* renamed from: b, reason: collision with root package name */
    public Class f7279b;

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f7280c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7281d = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends j {

        /* renamed from: e, reason: collision with root package name */
        public Object f7284e;

        public c(float f11, Object obj) {
            this.f7278a = f11;
            this.f7284e = obj;
            boolean z11 = obj != null;
            this.f7281d = z11;
            this.f7279b = z11 ? obj.getClass() : Object.class;
        }

        @Override // bt.j
        public Object e() {
            return this.f7284e;
        }

        @Override // bt.j
        public void p(Object obj) {
            this.f7284e = obj;
            this.f7281d = obj != null;
        }

        @Override // bt.j
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public c clone() {
            c cVar = new c(b(), this.f7284e);
            cVar.o(c());
            return cVar;
        }
    }

    public static j g(float f11) {
        return new a(f11);
    }

    public static j h(float f11, float f12) {
        return new a(f11, f12);
    }

    public static j i(float f11) {
        return new b(f11);
    }

    public static j j(float f11, int i11) {
        return new b(f11, i11);
    }

    public static j l(float f11) {
        return new c(f11, null);
    }

    public static j m(float f11, Object obj) {
        return new c(f11, obj);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract j clone();

    public float b() {
        return this.f7278a;
    }

    public Interpolator c() {
        return this.f7280c;
    }

    public Class d() {
        return this.f7279b;
    }

    public abstract Object e();

    public boolean f() {
        return this.f7281d;
    }

    public void n(float f11) {
        this.f7278a = f11;
    }

    public void o(Interpolator interpolator) {
        this.f7280c = interpolator;
    }

    public abstract void p(Object obj);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends j {

        /* renamed from: e, reason: collision with root package name */
        public float f7282e;

        public a(float f11, float f12) {
            this.f7278a = f11;
            this.f7282e = f12;
            this.f7279b = Float.TYPE;
            this.f7281d = true;
        }

        @Override // bt.j
        public Object e() {
            return Float.valueOf(this.f7282e);
        }

        @Override // bt.j
        public void p(Object obj) {
            if (obj == null || obj.getClass() != Float.class) {
                return;
            }
            this.f7282e = ((Float) obj).floatValue();
            this.f7281d = true;
        }

        @Override // bt.j
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a(b(), this.f7282e);
            aVar.o(c());
            return aVar;
        }

        public float s() {
            return this.f7282e;
        }

        public a(float f11) {
            this.f7278a = f11;
            this.f7279b = Float.TYPE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends j {

        /* renamed from: e, reason: collision with root package name */
        public int f7283e;

        public b(float f11, int i11) {
            this.f7278a = f11;
            this.f7283e = i11;
            this.f7279b = Integer.TYPE;
            this.f7281d = true;
        }

        @Override // bt.j
        public Object e() {
            return Integer.valueOf(this.f7283e);
        }

        @Override // bt.j
        public void p(Object obj) {
            if (obj == null || obj.getClass() != Integer.class) {
                return;
            }
            this.f7283e = ((Integer) obj).intValue();
            this.f7281d = true;
        }

        @Override // bt.j
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            b bVar = new b(b(), this.f7283e);
            bVar.o(c());
            return bVar;
        }

        public int s() {
            return this.f7283e;
        }

        public b(float f11) {
            this.f7278a = f11;
            this.f7279b = Integer.TYPE;
        }
    }
}
