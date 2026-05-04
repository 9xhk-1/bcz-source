package lb0;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import lb0.f;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@IgnoreJRERequirement
/* loaded from: classes9.dex */
public final class n extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f.a f70918a = new n();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @IgnoreJRERequirement
    public static final class a<T> implements f<okhttp3.o, Optional<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final f<okhttp3.o, T> f70919a;

        public a(f<okhttp3.o, T> fVar) {
            this.f70919a = fVar;
        }

        @Override // lb0.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Optional<T> convert(okhttp3.o oVar) throws IOException {
            return Optional.ofNullable(this.f70919a.convert(oVar));
        }
    }

    @Override // lb0.f.a
    @Nullable
    public f<okhttp3.o, ?> d(Type type, Annotation[] annotationArr, z zVar) {
        if (f.a.b(type) != Optional.class) {
            return null;
        }
        return new a(zVar.n(f.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
