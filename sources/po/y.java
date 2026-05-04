package po;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Readable f81095a;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    public final Reader f81096b;

    /* renamed from: c, reason: collision with root package name */
    public final CharBuffer f81097c;

    /* renamed from: d, reason: collision with root package name */
    public final char[] f81098d;

    /* renamed from: e, reason: collision with root package name */
    public final Queue<String> f81099e;

    /* renamed from: f, reason: collision with root package name */
    public final w f81100f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends w {
        public a() {
        }

        @Override // po.w
        public void d(String line, String end) {
            y.this.f81099e.add(line);
        }
    }

    public y(Readable readable) {
        CharBuffer e11 = k.e();
        this.f81097c = e11;
        this.f81098d = e11.array();
        this.f81099e = new ArrayDeque();
        this.f81100f = new a();
        this.f81095a = (Readable) Preconditions.checkNotNull(readable);
        this.f81096b = readable instanceof Reader ? (Reader) readable : null;
    }

    @CheckForNull
    @uo.a
    public String b() throws IOException {
        int read;
        while (true) {
            if (this.f81099e.peek() != null) {
                break;
            }
            v.a(this.f81097c);
            Reader reader = this.f81096b;
            if (reader != null) {
                char[] cArr = this.f81098d;
                read = reader.read(cArr, 0, cArr.length);
            } else {
                read = this.f81095a.read(this.f81097c);
            }
            if (read == -1) {
                this.f81100f.b();
                break;
            }
            this.f81100f.a(this.f81098d, 0, read);
        }
        return this.f81099e.poll();
    }
}
