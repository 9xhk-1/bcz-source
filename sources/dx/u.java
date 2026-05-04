package dx;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import y40.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final byte[] f48241a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Long f48242b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends u {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final x00.a<io.ktor.utils.io.g> f48243c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@m80.k byte[] headers, @m80.k x00.a<? extends io.ktor.utils.io.g> provider, @m80.l Long l11) {
            super(headers, l11, null);
            g0.p(headers, "headers");
            g0.p(provider, "provider");
            this.f48243c = provider;
        }

        @m80.k
        public final x00.a<io.ktor.utils.io.g> c() {
            return this.f48243c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends u {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final x00.a<c0> f48244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@m80.k byte[] headers, @m80.k x00.a<? extends c0> provider, @m80.l Long l11) {
            super(headers, l11, null);
            g0.p(headers, "headers");
            g0.p(provider, "provider");
            this.f48244c = provider;
        }

        @m80.k
        public final x00.a<c0> c() {
            return this.f48244c;
        }
    }

    public /* synthetic */ u(byte[] bArr, Long l11, v vVar) {
        this(bArr, l11);
    }

    @m80.k
    public final byte[] a() {
        return this.f48241a;
    }

    @m80.l
    public final Long b() {
        return this.f48242b;
    }

    public u(byte[] bArr, Long l11) {
        this.f48241a = bArr;
        this.f48242b = l11;
    }
}
