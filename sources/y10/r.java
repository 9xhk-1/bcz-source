package y10;

import java.util.Arrays;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface r {
    @m80.l
    Set<String> a(@m80.k n20.c cVar);

    @m80.l
    f20.g b(@m80.k a aVar);

    @m80.l
    f20.u c(@m80.k n20.c cVar, boolean z11);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final n20.b f99103a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final byte[] f99104b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public final f20.g f99105c;

        public a(@m80.k n20.b classId, @m80.l byte[] bArr, @m80.l f20.g gVar) {
            kotlin.jvm.internal.g0.p(classId, "classId");
            this.f99103a = classId;
            this.f99104b = bArr;
            this.f99105c = gVar;
        }

        @m80.k
        public final n20.b a() {
            return this.f99103a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f99103a, aVar.f99103a) && kotlin.jvm.internal.g0.g(this.f99104b, aVar.f99104b) && kotlin.jvm.internal.g0.g(this.f99105c, aVar.f99105c);
        }

        public int hashCode() {
            int hashCode = this.f99103a.hashCode() * 31;
            byte[] bArr = this.f99104b;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            f20.g gVar = this.f99105c;
            return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        @m80.k
        public String toString() {
            return "Request(classId=" + this.f99103a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f99104b) + ", outerClass=" + this.f99105c + ')';
        }

        public /* synthetic */ a(n20.b bVar, byte[] bArr, f20.g gVar, int i11, kotlin.jvm.internal.v vVar) {
            this(bVar, (i11 & 2) != 0 ? null : bArr, (i11 & 4) != 0 ? null : gVar);
        }
    }
}
