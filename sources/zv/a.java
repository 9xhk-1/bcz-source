package zv;

import a00.r0;
import android.content.Context;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements n {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Iterable<n> f102904b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f102905c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: zv.a$a, reason: collision with other inner class name */
    public static final class C1398a extends Lambda implements x00.l<n, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f102906a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1398a(Context context) {
            super(1);
            this.f102906a = context;
        }

        @Override // x00.l
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@m80.k n it) {
            g0.p(it, "it");
            return it.a(this.f102906a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@m80.k Iterable<? extends n> args, @m80.l String str) {
        g0.p(args, "args");
        this.f102904b = args;
        this.f102905c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a e(a aVar, Iterable iterable, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iterable = aVar.f102904b;
        }
        if ((i11 & 2) != 0) {
            str = aVar.f102905c;
        }
        return aVar.d(iterable, str);
    }

    @Override // zv.n
    @m80.k
    public String a(@m80.k Context context) {
        g0.p(context, "context");
        Iterable<n> iterable = this.f102904b;
        String str = this.f102905c;
        if (str == null) {
            str = "";
        }
        return r0.r3(iterable, str, null, null, 0, null, new C1398a(context), 30, null);
    }

    @m80.k
    public final Iterable<n> b() {
        return this.f102904b;
    }

    @m80.l
    public final String c() {
        return this.f102905c;
    }

    @m80.k
    public final a d(@m80.k Iterable<? extends n> args, @m80.l String str) {
        g0.p(args, "args");
        return new a(args, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f102904b, aVar.f102904b) && g0.g(this.f102905c, aVar.f102905c);
    }

    @m80.k
    public final Iterable<n> f() {
        return this.f102904b;
    }

    @m80.l
    public final String g() {
        return this.f102905c;
    }

    public int hashCode() {
        int hashCode = this.f102904b.hashCode() * 31;
        String str = this.f102905c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "CompositionStringDesc(args=" + this.f102904b + ", separator=" + this.f102905c + pn.j.f81007d;
    }

    public /* synthetic */ a(Iterable iterable, String str, int i11, v vVar) {
        this(iterable, (i11 & 2) != 0 ? null : str);
    }
}
