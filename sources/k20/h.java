package k20;

import a00.h0;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f65196b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final h f65197c = new h(h0.J());

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<ProtoBuf.VersionRequirement> f65198a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final h a(@k ProtoBuf.VersionRequirementTable table) {
            g0.p(table, "table");
            if (table.getRequirementCount() == 0) {
                return b();
            }
            List<ProtoBuf.VersionRequirement> requirementList = table.getRequirementList();
            g0.o(requirementList, "getRequirementList(...)");
            return new h(requirementList, null);
        }

        @k
        public final h b() {
            return h.f65197c;
        }

        public a() {
        }
    }

    public /* synthetic */ h(List list, v vVar) {
        this(list);
    }

    public h(List<ProtoBuf.VersionRequirement> list) {
        this.f65198a = list;
    }
}
