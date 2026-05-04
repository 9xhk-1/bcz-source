package l30;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @m80.l
        public static String a(@m80.k f fVar, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            g0.p(functionDescriptor, "functionDescriptor");
            if (fVar.b(functionDescriptor)) {
                return null;
            }
            return fVar.getDescription();
        }
    }

    @m80.l
    String a(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    boolean b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    @m80.k
    String getDescription();
}
