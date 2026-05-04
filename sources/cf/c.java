package cf;

import android.content.Context;
import com.baicizhan.online.user_study_api.UserStudyConfig;
import i9.j;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8578a = "StudySettingData";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p<UserStudyConfig, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f8579a;

        public a(final boolean val$open) {
            this.f8579a = val$open;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(UserStudyConfig userStudyConfig) {
            j.n("show_image_mean", this.f8579a);
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<UserStudyConfig, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f8581a;

        public b(final boolean val$open) {
            this.f8581a = val$open;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(UserStudyConfig userStudyConfig) {
            j.k("show_deformation", this.f8581a ? 2 : 1);
            return Boolean.TRUE;
        }
    }

    public static /* synthetic */ Boolean a(boolean z11, UserStudyConfig userStudyConfig) {
        j.n(j.f60415f, z11);
        return Boolean.TRUE;
    }

    public static /* synthetic */ Boolean b(boolean z11, UserStudyConfig userStudyConfig) {
        j.n("show_sentence_translation", z11);
        return Boolean.TRUE;
    }

    public void c() {
        j.a("show_image_mean");
        j.a("show_sentence_translation");
        j.a(j.f60415f);
        j.a("show_deformation");
    }

    public boolean d() {
        return j.e("show_deformation", 1) == 2;
    }

    public boolean e() {
        return j.c("show_image_mean", true);
    }

    public boolean f() {
        return j.c(j.f60415f, true);
    }

    public boolean g() {
        return j.c("show_sentence_translation", true);
    }

    public rx.c<Boolean> h(final Context context, final boolean open) {
        if (open == d()) {
            return rx.c.M2(Boolean.FALSE);
        }
        return th.e.k(null, "show_deformation", open ? 2 : 1).c3(new b(open)).I3(tb0.a.a());
    }

    public rx.c<Boolean> i(Context context, boolean z11) {
        return z11 == e() ? rx.c.M2(Boolean.FALSE) : th.e.k(null, "show_image_mean", z11 ? 1 : 0).c3(new a(z11)).I3(tb0.a.a());
    }

    public rx.c<Boolean> j(final boolean open) {
        if (open == f()) {
            return rx.c.M2(Boolean.FALSE);
        }
        return th.e.k(null, th.b.f90579d, open ? 2 : 1).c3(new p() { // from class: cf.b
            @Override // wb0.p
            public final Object call(Object obj) {
                return c.a(open, (UserStudyConfig) obj);
            }
        }).I3(tb0.a.a());
    }

    public rx.c<Boolean> k(final boolean open) {
        if (open == g()) {
            return rx.c.M2(Boolean.FALSE);
        }
        return th.e.k(null, "show_sentence_translation", open ? 2 : 1).c3(new p() { // from class: cf.a
            @Override // wb0.p
            public final Object call(Object obj) {
                return c.b(open, (UserStudyConfig) obj);
            }
        }).I3(tb0.a.a());
    }
}
