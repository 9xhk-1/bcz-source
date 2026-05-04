package javax.validation.metadata;

import java.util.List;
import java.util.Set;
import javax.validation.metadata.ElementDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface ExecutableDescriptor extends ElementDescriptor {
    @Override // javax.validation.metadata.ElementDescriptor
    boolean a();

    @Override // javax.validation.metadata.ElementDescriptor
    Set<ConstraintDescriptor<?>> b();

    @Override // javax.validation.metadata.ElementDescriptor
    ElementDescriptor.ConstraintFinder c();

    CrossParameterDescriptor e();

    String getName();

    ReturnValueDescriptor h();

    boolean k();

    boolean o();

    List<ParameterDescriptor> q();
}
