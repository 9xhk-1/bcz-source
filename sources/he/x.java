package he;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface x {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a implements x {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f59231a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f59232b = 0;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b implements x {

        /* renamed from: b, reason: collision with root package name */
        public static final int f59233b = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final le.a f59234a;

        public b(@m80.k le.a taskCenter) {
            g0.p(taskCenter, "taskCenter");
            this.f59234a = taskCenter;
        }

        public static /* synthetic */ b c(b bVar, le.a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aVar = bVar.f59234a;
            }
            return bVar.b(aVar);
        }

        @m80.k
        public final le.a a() {
            return this.f59234a;
        }

        @m80.k
        public final b b(@m80.k le.a taskCenter) {
            g0.p(taskCenter, "taskCenter");
            return new b(taskCenter);
        }

        @m80.k
        public final le.a d() {
            return this.f59234a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && g0.g(this.f59234a, ((b) obj).f59234a);
        }

        public int hashCode() {
            return this.f59234a.hashCode();
        }

        @m80.k
        public String toString() {
            return "Success(taskCenter=" + this.f59234a + pn.j.f81007d;
        }
    }
}
