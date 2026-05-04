package he;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    /* renamed from: he.a$a, reason: collision with other inner class name */
    public static final class C0671a implements a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final C0671a f59182a = new C0671a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f59183b = 0;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b implements a {

        /* renamed from: b, reason: collision with root package name */
        public static final int f59184b = 0;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final com.baicizhan.main.activity.mytab.task.data.a f59185a;

        public b(@m80.k com.baicizhan.main.activity.mytab.task.data.a achievement) {
            g0.p(achievement, "achievement");
            this.f59185a = achievement;
        }

        public static /* synthetic */ b c(b bVar, com.baicizhan.main.activity.mytab.task.data.a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aVar = bVar.f59185a;
            }
            return bVar.b(aVar);
        }

        @m80.k
        public final com.baicizhan.main.activity.mytab.task.data.a a() {
            return this.f59185a;
        }

        @m80.k
        public final b b(@m80.k com.baicizhan.main.activity.mytab.task.data.a achievement) {
            g0.p(achievement, "achievement");
            return new b(achievement);
        }

        @m80.k
        public final com.baicizhan.main.activity.mytab.task.data.a d() {
            return this.f59185a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && g0.g(this.f59185a, ((b) obj).f59185a);
        }

        public int hashCode() {
            return this.f59185a.hashCode();
        }

        @m80.k
        public String toString() {
            return "Success(achievement=" + this.f59185a + pn.j.f81007d;
        }
    }
}
