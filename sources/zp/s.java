package zp;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.jiongji.andriod.card.R;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final kp.a f102819a;

    /* renamed from: b, reason: collision with root package name */
    public final m f102820b = new m();

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f102821c = new StringBuilder();

    public s(kp.a aVar) {
        this.f102819a = aVar;
    }

    public static int g(kp.a aVar, int i11, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            if (aVar.h(i11 + i14)) {
                i13 |= 1 << ((i12 - i14) - 1);
            }
        }
        return i13;
    }

    public String a(StringBuilder sb2, int i11) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            o c11 = c(i11, str);
            String a11 = r.a(c11.b());
            if (a11 != null) {
                sb2.append(a11);
            }
            String valueOf = c11.d() ? String.valueOf(c11.c()) : null;
            if (i11 == c11.a()) {
                return sb2.toString();
            }
            i11 = c11.a();
            str = valueOf;
        }
    }

    public final n b(int i11) {
        char c11;
        int f11 = f(i11, 5);
        if (f11 == 15) {
            return new n(i11 + 5, '$');
        }
        if (f11 >= 5 && f11 < 15) {
            return new n(i11 + 5, (char) (f11 + 43));
        }
        int f12 = f(i11, 6);
        if (f12 >= 32 && f12 < 58) {
            return new n(i11 + 6, (char) (f12 + 33));
        }
        switch (f12) {
            case 58:
                c11 = '*';
                break;
            case 59:
                c11 = ',';
                break;
            case 60:
                c11 = '-';
                break;
            case 61:
                c11 = '.';
                break;
            case 62:
                c11 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(f12)));
        }
        return new n(i11 + 6, c11);
    }

    public o c(int i11, String str) throws FormatException {
        this.f102821c.setLength(0);
        if (str != null) {
            this.f102821c.append(str);
        }
        this.f102820b.i(i11);
        o o11 = o();
        return (o11 == null || !o11.d()) ? new o(this.f102820b.a(), this.f102821c.toString()) : new o(this.f102820b.a(), this.f102821c.toString(), o11.c());
    }

    public final n d(int i11) throws FormatException {
        int f11 = f(i11, 5);
        if (f11 == 15) {
            return new n(i11 + 5, '$');
        }
        char c11 = '+';
        if (f11 >= 5 && f11 < 15) {
            return new n(i11 + 5, (char) (f11 + 43));
        }
        int f12 = f(i11, 7);
        if (f12 >= 64 && f12 < 90) {
            return new n(i11 + 7, (char) (f12 + 1));
        }
        if (f12 >= 90 && f12 < 116) {
            return new n(i11 + 7, (char) (f12 + 7));
        }
        switch (f(i11, 8)) {
            case R.styleable.Theme_drawable_tab_home /* 232 */:
                c11 = PublicSuffixDatabase.f77441i;
                break;
            case R.styleable.Theme_drawable_tab_lecture /* 233 */:
                c11 = '\"';
                break;
            case R.styleable.Theme_drawable_tab_lecture_new /* 234 */:
                c11 = '%';
                break;
            case R.styleable.Theme_drawable_tab_mall /* 235 */:
                c11 = u0.f91708d;
                break;
            case R.styleable.Theme_drawable_tab_mall_1111 /* 236 */:
                c11 = '\'';
                break;
            case R.styleable.Theme_drawable_tab_mall_new /* 237 */:
                c11 = '(';
                break;
            case R.styleable.Theme_drawable_tab_review /* 238 */:
                c11 = ')';
                break;
            case R.styleable.Theme_drawable_tab_surrounding /* 239 */:
                c11 = '*';
                break;
            case 240:
                break;
            case R.styleable.Theme_drawable_test_nodate /* 241 */:
                c11 = ',';
                break;
            case R.styleable.Theme_drawable_time /* 242 */:
                c11 = '-';
                break;
            case 243:
                c11 = '.';
                break;
            case 244:
                c11 = '/';
                break;
            case R.styleable.Theme_drawable_walk_sound1 /* 245 */:
                c11 = ':';
                break;
            case R.styleable.Theme_drawable_walk_sound2 /* 246 */:
                c11 = l70.f.f70689d;
                break;
            case R.styleable.Theme_drawable_walk_sound3 /* 247 */:
                c11 = u0.f91709e;
                break;
            case R.styleable.Theme_drawable_walk_sound4 /* 248 */:
                c11 = '=';
                break;
            case 249:
                c11 = u0.f91710f;
                break;
            case 250:
                c11 = s60.d.f88057a;
                break;
            case R.styleable.Theme_drawable_wiki_sound /* 251 */:
                c11 = '_';
                break;
            case R.styleable.Theme_drawable_wiki_sound1 /* 252 */:
                c11 = ' ';
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        return new n(i11 + 8, c11);
    }

    public final p e(int i11) throws FormatException {
        int i12 = i11 + 7;
        if (i12 > this.f102819a.m()) {
            int f11 = f(i11, 4);
            return f11 == 0 ? new p(this.f102819a.m(), 10, 10) : new p(this.f102819a.m(), f11 - 1, 10);
        }
        int f12 = f(i11, 7) - 8;
        return new p(i12, f12 / 11, f12 % 11);
    }

    public int f(int i11, int i12) {
        return g(this.f102819a, i11, i12);
    }

    public final boolean h(int i11) {
        int i12 = i11 + 3;
        if (i12 > this.f102819a.m()) {
            return false;
        }
        while (i11 < i12) {
            if (this.f102819a.h(i11)) {
                return false;
            }
            i11++;
        }
        return true;
    }

    public final boolean i(int i11) {
        int i12;
        if (i11 + 1 > this.f102819a.m()) {
            return false;
        }
        for (int i13 = 0; i13 < 5 && (i12 = i13 + i11) < this.f102819a.m(); i13++) {
            if (i13 == 2) {
                if (!this.f102819a.h(i11 + 2)) {
                    return false;
                }
            } else if (this.f102819a.h(i12)) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(int i11) {
        int i12;
        if (i11 + 1 > this.f102819a.m()) {
            return false;
        }
        for (int i13 = 0; i13 < 4 && (i12 = i13 + i11) < this.f102819a.m(); i13++) {
            if (this.f102819a.h(i12)) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(int i11) {
        int f11;
        if (i11 + 5 > this.f102819a.m()) {
            return false;
        }
        int f12 = f(i11, 5);
        if (f12 < 5 || f12 >= 16) {
            return i11 + 6 <= this.f102819a.m() && (f11 = f(i11, 6)) >= 16 && f11 < 63;
        }
        return true;
    }

    public final boolean l(int i11) {
        int f11;
        if (i11 + 5 > this.f102819a.m()) {
            return false;
        }
        int f12 = f(i11, 5);
        if (f12 >= 5 && f12 < 16) {
            return true;
        }
        if (i11 + 7 > this.f102819a.m()) {
            return false;
        }
        int f13 = f(i11, 7);
        if (f13 < 64 || f13 >= 116) {
            return i11 + 8 <= this.f102819a.m() && (f11 = f(i11, 8)) >= 232 && f11 < 253;
        }
        return true;
    }

    public final boolean m(int i11) {
        if (i11 + 7 > this.f102819a.m()) {
            return i11 + 4 <= this.f102819a.m();
        }
        int i12 = i11;
        while (true) {
            int i13 = i11 + 3;
            if (i12 >= i13) {
                return this.f102819a.h(i13);
            }
            if (this.f102819a.h(i12)) {
                return true;
            }
            i12++;
        }
    }

    public final l n() {
        while (k(this.f102820b.a())) {
            n b11 = b(this.f102820b.a());
            this.f102820b.i(b11.a());
            if (b11.c()) {
                return new l(new o(this.f102820b.a(), this.f102821c.toString()), true);
            }
            this.f102821c.append(b11.b());
        }
        if (h(this.f102820b.a())) {
            this.f102820b.b(3);
            this.f102820b.h();
        } else if (i(this.f102820b.a())) {
            if (this.f102820b.a() + 5 < this.f102819a.m()) {
                this.f102820b.b(5);
            } else {
                this.f102820b.i(this.f102819a.m());
            }
            this.f102820b.g();
        }
        return new l(false);
    }

    public final o o() throws FormatException {
        l q11;
        boolean b11;
        do {
            int a11 = this.f102820b.a();
            if (this.f102820b.c()) {
                q11 = n();
                b11 = q11.b();
            } else if (this.f102820b.d()) {
                q11 = p();
                b11 = q11.b();
            } else {
                q11 = q();
                b11 = q11.b();
            }
            if (a11 == this.f102820b.a() && !b11) {
                break;
            }
        } while (!b11);
        return q11.a();
    }

    public final l p() throws FormatException {
        while (l(this.f102820b.a())) {
            n d11 = d(this.f102820b.a());
            this.f102820b.i(d11.a());
            if (d11.c()) {
                return new l(new o(this.f102820b.a(), this.f102821c.toString()), true);
            }
            this.f102821c.append(d11.b());
        }
        if (h(this.f102820b.a())) {
            this.f102820b.b(3);
            this.f102820b.h();
        } else if (i(this.f102820b.a())) {
            if (this.f102820b.a() + 5 < this.f102819a.m()) {
                this.f102820b.b(5);
            } else {
                this.f102820b.i(this.f102819a.m());
            }
            this.f102820b.f();
        }
        return new l(false);
    }

    public final l q() throws FormatException {
        while (m(this.f102820b.a())) {
            p e11 = e(this.f102820b.a());
            this.f102820b.i(e11.a());
            if (e11.f()) {
                return new l(e11.g() ? new o(this.f102820b.a(), this.f102821c.toString()) : new o(this.f102820b.a(), this.f102821c.toString(), e11.c()), true);
            }
            this.f102821c.append(e11.b());
            if (e11.g()) {
                return new l(new o(this.f102820b.a(), this.f102821c.toString()), true);
            }
            this.f102821c.append(e11.c());
        }
        if (j(this.f102820b.a())) {
            this.f102820b.f();
            this.f102820b.b(4);
        }
        return new l(false);
    }
}
