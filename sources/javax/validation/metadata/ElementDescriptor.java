package javax.validation.metadata;

import java.lang.annotation.ElementType;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface ElementDescriptor {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ConstraintFinder {
        boolean a();

        Set<ConstraintDescriptor<?>> b();

        ConstraintFinder c(Scope scope);

        ConstraintFinder d(ElementType... elementTypeArr);

        ConstraintFinder e(Class<?>... clsArr);
    }

    boolean a();

    Set<ConstraintDescriptor<?>> b();

    ConstraintFinder c();

    Class<?> d();
}
