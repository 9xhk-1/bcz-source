package kotlin.time;

import kotlin.jvm.internal.g0;
import kotlin.time.Instant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w30.h
/* loaded from: classes8.dex */
public interface h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f67783a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final CharSequence f67784b;

        public a(@m80.k String error, @m80.k CharSequence input) {
            g0.p(error, "error");
            g0.p(input, "input");
            this.f67783a = error;
            this.f67784b = input;
        }

        @Override // kotlin.time.h
        @m80.l
        public Instant a() {
            return null;
        }

        @m80.k
        public final String b() {
            return this.f67783a;
        }

        @m80.k
        public final CharSequence c() {
            return this.f67784b;
        }

        @Override // kotlin.time.h
        @m80.k
        public Instant toInstant() {
            String D;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f67783a);
            sb2.append(" when parsing an Instant from \"");
            D = g.D(this.f67784b, 64);
            sb2.append(D);
            sb2.append('\"');
            throw new w30.i(sb2.toString());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final long f67785a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67786b;

        public b(long j11, int i11) {
            this.f67785a = j11;
            this.f67786b = i11;
        }

        @Override // kotlin.time.h
        @m80.l
        public Instant a() {
            long j11 = this.f67785a;
            Instant.a aVar = Instant.Companion;
            if (j11 < aVar.h().getEpochSeconds() || this.f67785a > aVar.g().getEpochSeconds()) {
                return null;
            }
            return aVar.b(this.f67785a, this.f67786b);
        }

        public final long b() {
            return this.f67785a;
        }

        public final int c() {
            return this.f67786b;
        }

        @Override // kotlin.time.h
        @m80.k
        public Instant toInstant() {
            long j11 = this.f67785a;
            Instant.a aVar = Instant.Companion;
            if (j11 >= aVar.h().getEpochSeconds() && this.f67785a <= aVar.g().getEpochSeconds()) {
                return aVar.b(this.f67785a, this.f67786b);
            }
            throw new w30.i("The parsed date is outside the range representable by Instant (Unix epoch second " + this.f67785a + ')');
        }
    }

    @m80.l
    Instant a();

    @m80.k
    Instant toInstant();
}
