package xo;

import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class i extends s<Number> {

    /* renamed from: b, reason: collision with root package name */
    public static final t f98180b = k(ToNumberPolicy.LAZILY_PARSED_NUMBER);

    /* renamed from: a, reason: collision with root package name */
    public final r f98181a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements t {
        public a() {
        }

        @Override // com.google.gson.t
        public <T> s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
            if (aVar.getRawType() == Number.class) {
                return i.this;
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98183a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f98183a = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98183a[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98183a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(r rVar) {
        this.f98181a = rVar;
    }

    public static t j(r rVar) {
        return rVar == ToNumberPolicy.LAZILY_PARSED_NUMBER ? f98180b : k(rVar);
    }

    public static t k(r rVar) {
        return new i(rVar).new a();
    }

    @Override // com.google.gson.s
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Number e(cp.a aVar) throws IOException {
        JsonToken k02 = aVar.k0();
        int i11 = b.f98183a[k02.ordinal()];
        if (i11 == 1) {
            aVar.d0();
            return null;
        }
        if (i11 == 2 || i11 == 3) {
            return this.f98181a.a(aVar);
        }
        throw new JsonSyntaxException("Expecting number, got: " + k02 + "; at path " + aVar.getPath());
    }

    @Override // com.google.gson.s
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(cp.c cVar, Number number) throws IOException {
        cVar.s0(number);
    }
}
