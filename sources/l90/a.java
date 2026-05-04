package l90;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final char[] f70755a;

    /* renamed from: b, reason: collision with root package name */
    public int f70756b;

    public a(int i11) {
        this.f70756b = -1;
        if (i11 > 0) {
            this.f70755a = new char[i11];
        } else {
            this.f70755a = new char[0];
        }
    }

    public int a(Reader reader) throws IOException {
        char[] cArr = this.f70755a;
        int read = reader.read(cArr, 0, cArr.length);
        this.f70756b = read;
        return read;
    }

    public boolean b() {
        return this.f70756b <= 0;
    }

    public a(int i11, char c11) {
        this(i11);
        if (i11 > 0) {
            Arrays.fill(this.f70755a, c11);
        }
    }
}
