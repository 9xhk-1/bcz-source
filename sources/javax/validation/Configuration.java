package javax.validation;

import java.io.InputStream;
import javax.validation.Configuration;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface Configuration<T extends Configuration<T>> {
    T a(TraversableResolver traversableResolver);

    T b(ParameterNameProvider parameterNameProvider);

    T c(MessageInterpolator messageInterpolator);

    T d(ConstraintValidatorFactory constraintValidatorFactory);

    ValidatorFactory e();

    T f(InputStream inputStream);

    BootstrapConfiguration g();

    ConstraintValidatorFactory h();

    T i(String str, String str2);

    ParameterNameProvider j();

    MessageInterpolator k();

    T l();

    TraversableResolver m();
}
