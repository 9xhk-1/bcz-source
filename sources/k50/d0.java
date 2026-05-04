package k50;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({})
@f50.y
@zz.d(allowedTargets = {AnnotationTarget.PROPERTY})
@f50.f
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface d0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a implements d0 {

        /* renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ String[] f65919x0;

        public a(@m80.k String[] names) {
            kotlin.jvm.internal.g0.p(names, "names");
            this.f65919x0 = names;
        }

        @Override // k50.d0
        public final /* synthetic */ String[] names() {
            return this.f65919x0;
        }
    }

    String[] names();
}
