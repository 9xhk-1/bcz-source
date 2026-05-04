package k50;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.TYPE})
@zz.d(allowedTargets = {AnnotationTarget.CLASS})
@f50.f
@Retention(RetentionPolicy.RUNTIME)
@f50.g
/* loaded from: classes8.dex */
public @interface f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a implements f {

        /* renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ String f65942x0;

        public a(@m80.k String discriminator) {
            kotlin.jvm.internal.g0.p(discriminator, "discriminator");
            this.f65942x0 = discriminator;
        }

        @Override // k50.f
        public final /* synthetic */ String discriminator() {
            return this.f65942x0;
        }
    }

    String discriminator();
}
