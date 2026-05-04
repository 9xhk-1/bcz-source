package a30;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f1864a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements v {
        public static /* synthetic */ void c(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i11 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a30.v
        public void a(@m80.k CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                c(2);
            }
        }

        @Override // a30.v
        public void b(@m80.k p10.b bVar, @m80.k List<String> list) {
            if (bVar == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(@m80.k CallableMemberDescriptor callableMemberDescriptor);

    void b(@m80.k p10.b bVar, @m80.k List<String> list);
}
