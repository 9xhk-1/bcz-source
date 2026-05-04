package com.badlogic.gdx.scenes.scene2d;

import a3.d0;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b implements x2.c {

    /* renamed from: a, reason: collision with root package name */
    public static final Vector2 f12777a = new Vector2();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12778a;

        static {
            int[] iArr = new int[InputEvent.Type.values().length];
            f12778a = iArr;
            try {
                iArr[InputEvent.Type.keyDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12778a[InputEvent.Type.keyUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12778a[InputEvent.Type.keyTyped.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12778a[InputEvent.Type.touchDown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12778a[InputEvent.Type.touchUp.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12778a[InputEvent.Type.touchDragged.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12778a[InputEvent.Type.mouseMoved.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12778a[InputEvent.Type.scrolled.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12778a[InputEvent.Type.enter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12778a[InputEvent.Type.exit.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    @Override // x2.c
    public boolean a(x2.b bVar) {
        if (!(bVar instanceof InputEvent)) {
            return false;
        }
        InputEvent inputEvent = (InputEvent) bVar;
        int[] iArr = a.f12778a;
        int i11 = iArr[inputEvent.A().ordinal()];
        if (i11 == 1) {
            return d(inputEvent, inputEvent.s());
        }
        if (i11 == 2) {
            return f(inputEvent, inputEvent.s());
        }
        if (i11 == 3) {
            return e(inputEvent, inputEvent.r());
        }
        com.badlogic.gdx.scenes.scene2d.a c11 = inputEvent.c();
        Vector2 vector2 = f12777a;
        inputEvent.N(c11, vector2);
        switch (iArr[inputEvent.A().ordinal()]) {
            case 4:
                boolean i12 = i(inputEvent, vector2.f12535x, vector2.f12536y, inputEvent.t(), inputEvent.q());
                if (!i12 || !inputEvent.z()) {
                    break;
                } else {
                    inputEvent.d().b1(this, inputEvent.c(), inputEvent.e(), inputEvent.t(), inputEvent.q());
                    break;
                }
                break;
            case 5:
                k(inputEvent, vector2.f12535x, vector2.f12536y, inputEvent.t(), inputEvent.q());
                break;
            case 6:
                j(inputEvent, vector2.f12535x, vector2.f12536y, inputEvent.t());
                break;
            case 9:
                b(inputEvent, vector2.f12535x, vector2.f12536y, inputEvent.t(), inputEvent.u());
                break;
            case 10:
                c(inputEvent, vector2.f12535x, vector2.f12536y, inputEvent.t(), inputEvent.u());
                break;
        }
        return false;
    }

    public boolean d(InputEvent inputEvent, int i11) {
        return false;
    }

    public boolean e(InputEvent inputEvent, char c11) {
        return false;
    }

    public boolean f(InputEvent inputEvent, int i11) {
        return false;
    }

    public boolean g(InputEvent inputEvent, float f11, float f12) {
        return false;
    }

    public boolean h(InputEvent inputEvent, float f11, float f12, float f13, float f14) {
        return false;
    }

    public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
        return false;
    }

    public void j(InputEvent inputEvent, float f11, float f12, int i11) {
    }

    public void b(InputEvent inputEvent, float f11, float f12, int i11, @d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
    }

    public void c(InputEvent inputEvent, float f11, float f12, int i11, @d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
    }

    public void k(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
    }
}
