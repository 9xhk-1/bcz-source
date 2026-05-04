package l70;

import java.util.NoSuchElementException;
import org.apache.http.ParseException;
import org.apache.http.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m implements y {

    /* renamed from: e, reason: collision with root package name */
    public static final String f70714e = " ,;=()<>@:\\\"/[]?{}\t";

    /* renamed from: a, reason: collision with root package name */
    public final org.apache.http.h f70715a;

    /* renamed from: b, reason: collision with root package name */
    public String f70716b;

    /* renamed from: c, reason: collision with root package name */
    public String f70717c;

    /* renamed from: d, reason: collision with root package name */
    public int f70718d = b(-1);

    public m(org.apache.http.h hVar) {
        this.f70715a = (org.apache.http.h) e80.a.j(hVar, "Header iterator");
    }

    public String a(String str, int i11, int i12) {
        return str.substring(i11, i12);
    }

    public int b(int i11) throws ParseException {
        int d11;
        if (i11 >= 0) {
            d11 = d(i11);
        } else {
            if (!this.f70715a.hasNext()) {
                return -1;
            }
            this.f70716b = this.f70715a.r().getValue();
            d11 = 0;
        }
        int e11 = e(d11);
        if (e11 < 0) {
            this.f70717c = null;
            return -1;
        }
        int c11 = c(e11);
        this.f70717c = a(this.f70716b, e11, c11);
        return c11;
    }

    public int c(int i11) {
        e80.a.h(i11, "Search position");
        int length = this.f70716b.length();
        do {
            i11++;
            if (i11 >= length) {
                break;
            }
        } while (g(this.f70716b.charAt(i11)));
        return i11;
    }

    public int d(int i11) {
        int h11 = e80.a.h(i11, "Search position");
        int length = this.f70716b.length();
        boolean z11 = false;
        while (!z11 && h11 < length) {
            char charAt = this.f70716b.charAt(h11);
            if (h(charAt)) {
                z11 = true;
            } else {
                if (!i(charAt)) {
                    if (g(charAt)) {
                        throw new ParseException("Tokens without separator (pos " + h11 + "): " + this.f70716b);
                    }
                    throw new ParseException("Invalid character after token (pos " + h11 + "): " + this.f70716b);
                }
                h11++;
            }
        }
        return h11;
    }

    public int e(int i11) {
        int h11 = e80.a.h(i11, "Search position");
        boolean z11 = false;
        while (!z11) {
            String str = this.f70716b;
            if (str == null) {
                break;
            }
            int length = str.length();
            while (!z11 && h11 < length) {
                char charAt = this.f70716b.charAt(h11);
                if (h(charAt) || i(charAt)) {
                    h11++;
                } else {
                    if (!g(this.f70716b.charAt(h11))) {
                        throw new ParseException("Invalid character before token (pos " + h11 + "): " + this.f70716b);
                    }
                    z11 = true;
                }
            }
            if (!z11) {
                if (this.f70715a.hasNext()) {
                    this.f70716b = this.f70715a.r().getValue();
                    h11 = 0;
                } else {
                    this.f70716b = null;
                }
            }
        }
        if (z11) {
            return h11;
        }
        return -1;
    }

    public boolean f(char c11) {
        return f70714e.indexOf(c11) >= 0;
    }

    public boolean g(char c11) {
        if (Character.isLetterOrDigit(c11)) {
            return true;
        }
        return (Character.isISOControl(c11) || f(c11)) ? false : true;
    }

    public boolean h(char c11) {
        return c11 == ',';
    }

    @Override // org.apache.http.y, java.util.Iterator
    public boolean hasNext() {
        return this.f70717c != null;
    }

    public boolean i(char c11) {
        return c11 == '\t' || Character.isSpaceChar(c11);
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException, ParseException {
        return nextToken();
    }

    @Override // org.apache.http.y
    public String nextToken() throws NoSuchElementException, ParseException {
        String str = this.f70717c;
        if (str == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.f70718d = b(this.f70718d);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}
