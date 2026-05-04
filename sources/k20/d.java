package k20;

import a00.r0;
import java.util.LinkedList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ProtoBuf.StringTable f65192a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ProtoBuf.QualifiedNameTable f65193b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65194a;

        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65194a = iArr;
        }
    }

    public d(@k ProtoBuf.StringTable strings, @k ProtoBuf.QualifiedNameTable qualifiedNames) {
        g0.p(strings, "strings");
        g0.p(qualifiedNames, "qualifiedNames");
        this.f65192a = strings;
        this.f65193b = qualifiedNames;
    }

    @Override // k20.c
    @k
    public String a(int i11) {
        Triple<List<String>, List<String>, Boolean> c11 = c(i11);
        List<String> component1 = c11.component1();
        String r32 = r0.r3(c11.component2(), ".", null, null, 0, null, null, 62, null);
        if (component1.isEmpty()) {
            return r32;
        }
        return r0.r3(component1, "/", null, null, 0, null, null, 62, null) + '/' + r32;
    }

    @Override // k20.c
    public boolean b(int i11) {
        return c(i11).getThird().booleanValue();
    }

    public final Triple<List<String>, List<String>, Boolean> c(int i11) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z11 = false;
        while (i11 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.f65193b.getQualifiedName(i11);
            String string = this.f65192a.getString(qualifiedName.getShortName());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            g0.m(kind);
            int i12 = a.f65194a[kind.ordinal()];
            if (i12 == 1) {
                linkedList2.addFirst(string);
            } else if (i12 == 2) {
                linkedList.addFirst(string);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedList2.addFirst(string);
                z11 = true;
            }
            i11 = qualifiedName.getParentQualifiedName();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z11));
    }

    @Override // k20.c
    @k
    public String getString(int i11) {
        String string = this.f65192a.getString(i11);
        g0.o(string, "getString(...)");
        return string;
    }
}
