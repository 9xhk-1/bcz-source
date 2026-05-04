package z2;

import a3.d0;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import p2.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a implements x2.c {

    /* renamed from: e, reason: collision with root package name */
    public static final Vector2 f100632e = new Vector2();

    /* renamed from: f, reason: collision with root package name */
    public static final Vector2 f100633f = new Vector2();

    /* renamed from: a, reason: collision with root package name */
    public final p2.a f100634a;

    /* renamed from: b, reason: collision with root package name */
    public InputEvent f100635b;

    /* renamed from: c, reason: collision with root package name */
    public com.badlogic.gdx.scenes.scene2d.a f100636c;

    /* renamed from: d, reason: collision with root package name */
    public com.badlogic.gdx.scenes.scene2d.a f100637d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: z2.a$a, reason: collision with other inner class name */
    public class C1378a extends a.b {

        /* renamed from: a, reason: collision with root package name */
        public final Vector2 f100638a = new Vector2();

        /* renamed from: b, reason: collision with root package name */
        public final Vector2 f100639b = new Vector2();

        /* renamed from: c, reason: collision with root package name */
        public final Vector2 f100640c = new Vector2();

        /* renamed from: d, reason: collision with root package name */
        public final Vector2 f100641d = new Vector2();

        public C1378a() {
        }

        @Override // p2.a.b, p2.a.c
        public boolean a(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24) {
            a.this.f100636c.X2(this.f100638a.set(vector2));
            a.this.f100636c.X2(this.f100639b.set(vector22));
            a.this.f100636c.X2(this.f100640c.set(vector23));
            a.this.f100636c.X2(this.f100641d.set(vector24));
            a aVar = a.this;
            aVar.h(aVar.f100635b, this.f100638a, this.f100639b, this.f100640c, this.f100641d);
            return true;
        }

        @Override // p2.a.b, p2.a.c
        public boolean b(float f11, float f12, int i11, int i12) {
            com.badlogic.gdx.scenes.scene2d.a aVar = a.this.f100636c;
            Vector2 vector2 = a.f100632e;
            aVar.X2(vector2.set(f11, f12));
            a aVar2 = a.this;
            aVar2.g(aVar2.f100635b, vector2.f12535x, vector2.f12536y, i11, i12);
            return true;
        }

        @Override // p2.a.b, p2.a.c
        public boolean e(float f11, float f12) {
            com.badlogic.gdx.scenes.scene2d.a aVar = a.this.f100636c;
            Vector2 vector2 = a.f100632e;
            aVar.X2(vector2.set(f11, f12));
            a aVar2 = a.this;
            return aVar2.e(aVar2.f100636c, vector2.f12535x, vector2.f12536y);
        }

        @Override // p2.a.b, p2.a.c
        public boolean f(float f11, float f12) {
            a aVar = a.this;
            aVar.l(aVar.f100635b, f11, f12);
            return true;
        }

        @Override // p2.a.b, p2.a.c
        public boolean g(float f11, float f12, int i11) {
            Vector2 vector2 = a.f100632e;
            j(vector2.set(f11, f12));
            a aVar = a.this;
            aVar.b(aVar.f100635b, vector2.f12535x, vector2.f12536y, i11);
            return true;
        }

        @Override // p2.a.b, p2.a.c
        public boolean h(float f11, float f12, int i11, int i12) {
            com.badlogic.gdx.scenes.scene2d.a aVar = a.this.f100636c;
            Vector2 vector2 = a.f100632e;
            aVar.X2(vector2.set(f11, f12));
            a aVar2 = a.this;
            aVar2.i(aVar2.f100635b, vector2.f12535x, vector2.f12536y, i11, i12);
            return true;
        }

        @Override // p2.a.b, p2.a.c
        public boolean i(float f11, float f12, float f13, float f14) {
            Vector2 vector2 = a.f100632e;
            j(vector2.set(f13, f14));
            float f15 = vector2.f12535x;
            float f16 = vector2.f12536y;
            a.this.f100636c.X2(vector2.set(f11, f12));
            a aVar = a.this;
            aVar.f(aVar.f100635b, vector2.f12535x, vector2.f12536y, f15, f16);
            return true;
        }

        public final void j(Vector2 vector2) {
            a.this.f100636c.X2(vector2);
            vector2.sub(a.this.f100636c.X2(a.f100633f.set(0.0f, 0.0f)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100643a;

        static {
            int[] iArr = new int[InputEvent.Type.values().length];
            f100643a = iArr;
            try {
                iArr[InputEvent.Type.touchDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100643a[InputEvent.Type.touchUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100643a[InputEvent.Type.touchDragged.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public a() {
        this(20.0f, 0.4f, 1.1f, 2.14748365E9f);
    }

    @Override // x2.c
    public boolean a(x2.b bVar) {
        a aVar;
        if (!(bVar instanceof InputEvent)) {
            return false;
        }
        InputEvent inputEvent = (InputEvent) bVar;
        int i11 = b.f100643a[inputEvent.A().ordinal()];
        if (i11 == 1) {
            this.f100636c = inputEvent.c();
            this.f100637d = inputEvent.e();
            this.f100634a.g1(inputEvent.x(), inputEvent.y(), inputEvent.t(), inputEvent.q());
            com.badlogic.gdx.scenes.scene2d.a aVar2 = this.f100636c;
            Vector2 vector2 = f100632e;
            aVar2.X2(vector2.set(inputEvent.x(), inputEvent.y()));
            j(inputEvent, vector2.f12535x, vector2.f12536y, inputEvent.t(), inputEvent.q());
            if (inputEvent.z()) {
                inputEvent.d().b1(this, inputEvent.c(), inputEvent.e(), inputEvent.t(), inputEvent.q());
            }
            return true;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return false;
            }
            this.f100635b = inputEvent;
            this.f100636c = inputEvent.c();
            this.f100634a.h1(inputEvent.x(), inputEvent.y(), inputEvent.t());
            return true;
        }
        boolean B = inputEvent.B();
        if (B) {
            this.f100634a.a1();
            aVar = this;
        } else {
            this.f100635b = inputEvent;
            this.f100636c = inputEvent.c();
            this.f100634a.i1(inputEvent.x(), inputEvent.y(), inputEvent.t(), inputEvent.q());
            com.badlogic.gdx.scenes.scene2d.a aVar3 = this.f100636c;
            Vector2 vector22 = f100632e;
            aVar3.X2(vector22.set(inputEvent.x(), inputEvent.y()));
            aVar = this;
            aVar.k(inputEvent, vector22.f12535x, vector22.f12536y, inputEvent.t(), inputEvent.q());
        }
        aVar.f100635b = null;
        aVar.f100636c = null;
        aVar.f100637d = null;
        return !B;
    }

    public p2.a c() {
        return this.f100634a;
    }

    @d0
    public com.badlogic.gdx.scenes.scene2d.a d() {
        return this.f100637d;
    }

    public boolean e(com.badlogic.gdx.scenes.scene2d.a aVar, float f11, float f12) {
        return false;
    }

    public a(float f11, float f12, float f13, float f14) {
        this.f100634a = new p2.a(f11, f12, f13, f14, new C1378a());
    }

    public void l(InputEvent inputEvent, float f11, float f12) {
    }

    public void b(InputEvent inputEvent, float f11, float f12, int i11) {
    }

    public void f(InputEvent inputEvent, float f11, float f12, float f13, float f14) {
    }

    public void g(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
    }

    public void h(InputEvent inputEvent, Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24) {
    }

    public void i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
    }

    public void j(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
    }

    public void k(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
    }
}
