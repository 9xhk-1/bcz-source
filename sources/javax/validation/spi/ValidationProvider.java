package javax.validation.spi;

import javax.validation.Configuration;
import javax.validation.ValidatorFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface ValidationProvider<T extends Configuration<T>> {
    T a(BootstrapState bootstrapState);

    Configuration<?> b(BootstrapState bootstrapState);

    ValidatorFactory c(ConfigurationState configurationState);
}
