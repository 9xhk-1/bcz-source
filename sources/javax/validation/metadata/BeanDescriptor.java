package javax.validation.metadata;

import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface BeanDescriptor extends ElementDescriptor {
    MethodDescriptor f(String str, Class<?>... clsArr);

    Set<MethodDescriptor> g(MethodType methodType, MethodType... methodTypeArr);

    PropertyDescriptor j(String str);

    Set<PropertyDescriptor> l();

    Set<ConstructorDescriptor> m();

    ConstructorDescriptor n(Class<?>... clsArr);

    boolean p();
}
