package qt;

import androidx.annotation.NonNull;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;
import qt.b;
import tt.c;
import tt.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public b f82710a;

    /* renamed from: b, reason: collision with root package name */
    public b.a f82711b;

    /* renamed from: c, reason: collision with root package name */
    public tt.a f82712c;

    /* renamed from: d, reason: collision with root package name */
    public wt.a f82713d;

    /* renamed from: e, reason: collision with root package name */
    public float f82714e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f82715f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: qt.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C1022a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82716a;

        static {
            int[] iArr = new int[AnimationType.values().length];
            f82716a = iArr;
            try {
                iArr[AnimationType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82716a[AnimationType.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82716a[AnimationType.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82716a[AnimationType.WORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82716a[AnimationType.FILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82716a[AnimationType.SLIDE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82716a[AnimationType.THIN_WORM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f82716a[AnimationType.DROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f82716a[AnimationType.SWAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f82716a[AnimationType.SCALE_DOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public a(@NonNull wt.a aVar, @NonNull b.a aVar2) {
        this.f82710a = new b(aVar2);
        this.f82711b = aVar2;
        this.f82713d = aVar;
    }

    public final void a() {
        switch (C1022a.f82716a[this.f82713d.b().ordinal()]) {
            case 1:
                this.f82711b.a(null);
                break;
            case 2:
                c();
                break;
            case 3:
                h();
                break;
            case 4:
                m();
                break;
            case 5:
                f();
                break;
            case 6:
                j();
                break;
            case 7:
                l();
                break;
            case 8:
                d();
                break;
            case 9:
                k();
                break;
            case 10:
                i();
                break;
        }
    }

    public void b() {
        this.f82715f = false;
        this.f82714e = 0.0f;
        a();
    }

    public final void c() {
        int p11 = this.f82713d.p();
        int t11 = this.f82713d.t();
        tt.a j11 = this.f82710a.a().l(t11, p11).j(this.f82713d.a());
        if (this.f82715f) {
            j11.m(this.f82714e);
        } else {
            j11.e();
        }
        this.f82712c = j11;
    }

    public final void d() {
        int q11 = this.f82713d.A() ? this.f82713d.q() : this.f82713d.f();
        int r11 = this.f82713d.A() ? this.f82713d.r() : this.f82713d.q();
        int a11 = au.a.a(this.f82713d, q11);
        int a12 = au.a.a(this.f82713d, r11);
        int l11 = this.f82713d.l();
        int j11 = this.f82713d.j();
        if (this.f82713d.g() != Orientation.HORIZONTAL) {
            l11 = j11;
        }
        int m11 = this.f82713d.m();
        c m12 = this.f82710a.b().b(this.f82713d.a()).m(a11, a12, (m11 * 3) + l11, m11 + l11, m11);
        if (this.f82715f) {
            m12.m(this.f82714e);
        } else {
            m12.e();
        }
        this.f82712c = m12;
    }

    public void e() {
        tt.a aVar = this.f82712c;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void f() {
        int p11 = this.f82713d.p();
        int t11 = this.f82713d.t();
        int m11 = this.f82713d.m();
        int s11 = this.f82713d.s();
        tt.a j11 = this.f82710a.c().q(t11, p11, m11, s11).j(this.f82713d.a());
        if (this.f82715f) {
            j11.m(this.f82714e);
        } else {
            j11.e();
        }
        this.f82712c = j11;
    }

    public void g(float f11) {
        this.f82715f = true;
        this.f82714e = f11;
        a();
    }

    public final void h() {
        int p11 = this.f82713d.p();
        int t11 = this.f82713d.t();
        int m11 = this.f82713d.m();
        float o11 = this.f82713d.o();
        tt.a j11 = this.f82710a.d().p(t11, p11, m11, o11).j(this.f82713d.a());
        if (this.f82715f) {
            j11.m(this.f82714e);
        } else {
            j11.e();
        }
        this.f82712c = j11;
    }

    public final void i() {
        int p11 = this.f82713d.p();
        int t11 = this.f82713d.t();
        int m11 = this.f82713d.m();
        float o11 = this.f82713d.o();
        tt.a j11 = this.f82710a.e().p(t11, p11, m11, o11).j(this.f82713d.a());
        if (this.f82715f) {
            j11.m(this.f82714e);
        } else {
            j11.e();
        }
        this.f82712c = j11;
    }

    public final void j() {
        int q11 = this.f82713d.A() ? this.f82713d.q() : this.f82713d.f();
        int r11 = this.f82713d.A() ? this.f82713d.r() : this.f82713d.q();
        tt.a j11 = this.f82710a.f().l(au.a.a(this.f82713d, q11), au.a.a(this.f82713d, r11)).j(this.f82713d.a());
        if (this.f82715f) {
            j11.m(this.f82714e);
        } else {
            j11.e();
        }
        this.f82712c = j11;
    }

    public final void k() {
        int q11 = this.f82713d.A() ? this.f82713d.q() : this.f82713d.f();
        int r11 = this.f82713d.A() ? this.f82713d.r() : this.f82713d.q();
        tt.a j11 = this.f82710a.g().l(au.a.a(this.f82713d, q11), au.a.a(this.f82713d, r11)).j(this.f82713d.a());
        if (this.f82715f) {
            j11.m(this.f82714e);
        } else {
            j11.e();
        }
        this.f82712c = j11;
    }

    public final void l() {
        int q11 = this.f82713d.A() ? this.f82713d.q() : this.f82713d.f();
        int r11 = this.f82713d.A() ? this.f82713d.r() : this.f82713d.q();
        int a11 = au.a.a(this.f82713d, q11);
        int a12 = au.a.a(this.f82713d, r11);
        boolean z11 = r11 > q11;
        j j11 = this.f82710a.h().n(a11, a12, this.f82713d.m(), z11).j(this.f82713d.a());
        if (this.f82715f) {
            j11.m(this.f82714e);
        } else {
            j11.e();
        }
        this.f82712c = j11;
    }

    public final void m() {
        int q11 = this.f82713d.A() ? this.f82713d.q() : this.f82713d.f();
        int r11 = this.f82713d.A() ? this.f82713d.r() : this.f82713d.q();
        int a11 = au.a.a(this.f82713d, q11);
        int a12 = au.a.a(this.f82713d, r11);
        boolean z11 = r11 > q11;
        j j11 = this.f82710a.i().n(a11, a12, this.f82713d.m(), z11).j(this.f82713d.a());
        if (this.f82715f) {
            j11.m(this.f82714e);
        } else {
            j11.e();
        }
        this.f82712c = j11;
    }
}
