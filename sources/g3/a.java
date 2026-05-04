package g3;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Annotation f52662a;

    public a(Annotation annotation) {
        this.f52662a = annotation;
    }

    public <T extends Annotation> T a(Class<T> cls) {
        if (this.f52662a.annotationType().equals(cls)) {
            return (T) this.f52662a;
        }
        return null;
    }

    public Class<? extends Annotation> b() {
        return this.f52662a.annotationType();
    }
}
