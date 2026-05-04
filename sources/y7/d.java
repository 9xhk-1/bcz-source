package y7;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public int f99464a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public String[] f99465b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public Long[] f99466c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public Long[] f99467d;

        /* renamed from: e, reason: collision with root package name */
        public long f99468e;

        public a() {
            this(0, null, null, null, 0L, 31, null);
        }

        @k
        public final Long[] a() {
            return this.f99466c;
        }

        public final long b() {
            return this.f99468e;
        }

        @k
        public final Long[] c() {
            return this.f99467d;
        }

        public final int d() {
            return this.f99464a;
        }

        @k
        public final String[] e() {
            return this.f99465b;
        }

        public final void f(@k Long[] lArr) {
            g0.p(lArr, "<set-?>");
            this.f99466c = lArr;
        }

        public final void g(long j11) {
            this.f99468e = j11;
        }

        public final void h(@k Long[] lArr) {
            g0.p(lArr, "<set-?>");
            this.f99467d = lArr;
        }

        public final void i(int i11) {
            this.f99464a = i11;
        }

        public final void j(@k String[] strArr) {
            g0.p(strArr, "<set-?>");
            this.f99465b = strArr;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, @k String[] urls, @k Long[] connectTimeOuts, @k Long[] readTimeOuts, long j11) {
            super(null);
            g0.p(urls, "urls");
            g0.p(connectTimeOuts, "connectTimeOuts");
            g0.p(readTimeOuts, "readTimeOuts");
            this.f99464a = i11;
            this.f99465b = urls;
            this.f99466c = connectTimeOuts;
            this.f99467d = readTimeOuts;
            this.f99468e = j11;
        }

        public /* synthetic */ a(int i11, String[] strArr, Long[] lArr, Long[] lArr2, long j11, int i12, v vVar) {
            this((i12 & 1) != 0 ? 1 : i11, (i12 & 2) != 0 ? new String[0] : strArr, (i12 & 4) != 0 ? new Long[]{3000L} : lArr, (i12 & 8) != 0 ? new Long[]{5000L} : lArr2, (i12 & 16) != 0 ? 5000L : j11);
        }
    }

    public /* synthetic */ d(v vVar) {
        this();
    }

    public d() {
    }
}
