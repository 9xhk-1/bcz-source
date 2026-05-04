package javax.validation;

import java.util.Locale;
import javax.validation.metadata.ConstraintDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface MessageInterpolator {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Context {
        ConstraintDescriptor<?> a();

        Object b();

        <T> T unwrap(Class<T> cls);
    }

    String a(String str, Context context);

    String b(String str, Context context, Locale locale);
}
