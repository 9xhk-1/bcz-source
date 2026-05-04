package vt;

import android.graphics.Canvas;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rd.animation.type.AnimationType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public rt.b f94266a;

    /* renamed from: b, reason: collision with root package name */
    public xt.a f94267b;

    /* renamed from: c, reason: collision with root package name */
    public wt.a f94268c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1271b f94269d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94270a;

        static {
            int[] iArr = new int[AnimationType.values().length];
            f94270a = iArr;
            try {
                iArr[AnimationType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94270a[AnimationType.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94270a[AnimationType.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94270a[AnimationType.WORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94270a[AnimationType.SLIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94270a[AnimationType.FILL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f94270a[AnimationType.THIN_WORM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f94270a[AnimationType.DROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f94270a[AnimationType.SWAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f94270a[AnimationType.SCALE_DOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: vt.b$b, reason: collision with other inner class name */
    public interface InterfaceC1271b {
        void a(int i11);
    }

    public b(@NonNull wt.a aVar) {
        this.f94268c = aVar;
        this.f94267b = new xt.a(aVar);
    }

    public void a(@NonNull Canvas canvas) {
        int c11 = this.f94268c.c();
        for (int i11 = 0; i11 < c11; i11++) {
            b(canvas, i11, au.a.g(this.f94268c, i11), au.a.h(this.f94268c, i11));
        }
    }

    public final void b(@NonNull Canvas canvas, int i11, int i12, int i13) {
        boolean A = this.f94268c.A();
        int q11 = this.f94268c.q();
        int r11 = this.f94268c.r();
        boolean z11 = false;
        boolean z12 = !A && (i11 == q11 || i11 == this.f94268c.f());
        if (A && (i11 == q11 || i11 == r11)) {
            z11 = true;
        }
        boolean z13 = z12 | z11;
        this.f94267b.k(i11, i12, i13);
        if (this.f94266a == null || !z13) {
            this.f94267b.a(canvas, z13);
        } else {
            c(canvas);
        }
    }

    public final void c(@NonNull Canvas canvas) {
        switch (a.f94270a[this.f94268c.b().ordinal()]) {
            case 1:
                this.f94267b.a(canvas, true);
                break;
            case 2:
                this.f94267b.b(canvas, this.f94266a);
                break;
            case 3:
                this.f94267b.e(canvas, this.f94266a);
                break;
            case 4:
                this.f94267b.j(canvas, this.f94266a);
                break;
            case 5:
                this.f94267b.g(canvas, this.f94266a);
                break;
            case 6:
                this.f94267b.d(canvas, this.f94266a);
                break;
            case 7:
                this.f94267b.i(canvas, this.f94266a);
                break;
            case 8:
                this.f94267b.c(canvas, this.f94266a);
                break;
            case 9:
                this.f94267b.h(canvas, this.f94266a);
                break;
            case 10:
                this.f94267b.f(canvas, this.f94266a);
                break;
        }
    }

    public final void d(float f11, float f12) {
        int d11;
        if (this.f94269d == null || (d11 = au.a.d(this.f94268c, f11, f12)) < 0) {
            return;
        }
        this.f94269d.a(d11);
    }

    public void e(@Nullable InterfaceC1271b interfaceC1271b) {
        this.f94269d = interfaceC1271b;
    }

    public void f(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            d(motionEvent.getX(), motionEvent.getY());
        }
    }

    public void g(@Nullable rt.b bVar) {
        this.f94266a = bVar;
    }
}
