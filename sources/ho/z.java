package ho;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.c
/* loaded from: classes7.dex */
public final class z extends g implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f59726a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final Matcher f59727a;

        public a(Matcher matcher) {
            this.f59727a = (Matcher) Preconditions.checkNotNull(matcher);
        }

        @Override // ho.f
        public int a() {
            return this.f59727a.end();
        }

        @Override // ho.f
        public boolean b() {
            return this.f59727a.find();
        }

        @Override // ho.f
        public boolean c(int index) {
            return this.f59727a.find(index);
        }

        @Override // ho.f
        public boolean d() {
            return this.f59727a.matches();
        }

        @Override // ho.f
        public String e(String replacement) {
            return this.f59727a.replaceAll(replacement);
        }

        @Override // ho.f
        public int f() {
            return this.f59727a.start();
        }
    }

    public z(Pattern pattern) {
        this.f59726a = (Pattern) Preconditions.checkNotNull(pattern);
    }

    @Override // ho.g
    public int b() {
        return this.f59726a.flags();
    }

    @Override // ho.g
    public f d(CharSequence t11) {
        return new a(this.f59726a.matcher(t11));
    }

    @Override // ho.g
    public String e() {
        return this.f59726a.pattern();
    }

    @Override // ho.g
    public String toString() {
        return this.f59726a.toString();
    }
}
