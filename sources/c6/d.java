package c6;

import com.baicizhan.app.biz.game.repo.userresource.LanguageType;
import kotlin.NoWhenBranchMatchedException;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8109a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8110b = -1;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f8111c = "UserGameInfoRepo";

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f8112d = "user_game_info_scope";

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f8113e = "current_book_id";

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f8114f = "remote_current_book_id";

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f8115g = "remote_current_sku_id";

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f8116h = "current_sku_id";

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final String f8117i = "coin";

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final String f8118j = "power";

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final String f8119k = "energy";

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final String f8120l = "membership";

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final String f8121m = "user_profile";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8122a;

        static {
            int[] iArr = new int[LanguageType.values().length];
            try {
                iArr[LanguageType.En.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LanguageType.Jp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8122a = iArr;
        }
    }

    public static final String c(LanguageType languageType) {
        return e(languageType) + f8119k;
    }

    public static final int d(LanguageType languageType) {
        int i11 = a.f8122a[languageType.ordinal()];
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String e(LanguageType languageType) {
        int i11 = a.f8122a[languageType.ordinal()];
        if (i11 == 1) {
            return "En";
        }
        if (i11 == 2) {
            return "Jp";
        }
        throw new NoWhenBranchMatchedException();
    }
}
