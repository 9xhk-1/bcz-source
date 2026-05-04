package javax.validation.spi;

import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import javax.validation.ConstraintValidatorFactory;
import javax.validation.MessageInterpolator;
import javax.validation.ParameterNameProvider;
import javax.validation.TraversableResolver;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface ConfigurationState {
    Map<String, String> a();

    MessageInterpolator b();

    ParameterNameProvider c();

    TraversableResolver d();

    ConstraintValidatorFactory e();

    Set<InputStream> f();

    boolean g();
}
