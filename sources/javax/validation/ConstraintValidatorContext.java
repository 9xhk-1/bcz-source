package javax.validation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface ConstraintValidatorContext {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ConstraintViolationBuilder {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface LeafNodeBuilderCustomizableContext {
            ConstraintValidatorContext a();

            LeafNodeContextBuilder e();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface LeafNodeBuilderDefinedContext {
            ConstraintValidatorContext a();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface LeafNodeContextBuilder {
            ConstraintValidatorContext a();

            LeafNodeBuilderDefinedContext e(Integer num);

            LeafNodeBuilderDefinedContext f(Object obj);
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface NodeBuilderCustomizableContext {
            ConstraintValidatorContext a();

            LeafNodeBuilderCustomizableContext b();

            NodeBuilderCustomizableContext c(String str);

            NodeBuilderCustomizableContext d(String str);

            NodeContextBuilder e();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface NodeBuilderDefinedContext {
            ConstraintValidatorContext a();

            LeafNodeBuilderCustomizableContext b();

            NodeBuilderCustomizableContext c(String str);

            NodeBuilderCustomizableContext d(String str);
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface NodeContextBuilder {
            ConstraintValidatorContext a();

            LeafNodeBuilderCustomizableContext b();

            NodeBuilderCustomizableContext c(String str);

            NodeBuilderCustomizableContext d(String str);

            NodeBuilderDefinedContext e(Integer num);

            NodeBuilderDefinedContext f(Object obj);
        }

        ConstraintValidatorContext a();

        LeafNodeBuilderCustomizableContext b();

        NodeBuilderDefinedContext c(String str);

        NodeBuilderCustomizableContext d(String str);

        NodeBuilderDefinedContext e(int i11);
    }

    String a();

    void b();

    ConstraintViolationBuilder c(String str);

    <T> T unwrap(Class<T> cls);
}
