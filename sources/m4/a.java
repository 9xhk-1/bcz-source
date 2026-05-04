package m4;

import com.baicizhan.app.api.service.GameCategoryVo;
import com.baicizhan.app.api.service.model.MemberShipTypeVo;
import com.baicizhan.app.biz.game.repo.userresource.LanguageType;
import h5.j;
import h5.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import l3.q;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: m4.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0868a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72138a;

        static {
            int[] iArr = new int[GameCategoryVo.values().length];
            try {
                iArr[GameCategoryVo.Words.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GameCategoryVo.Sentence.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f72138a = iArr;
        }
    }

    @k
    public static final LanguageType a(@k GameCategoryVo gameCategoryVo) {
        g0.p(gameCategoryVo, "<this>");
        int i11 = C0868a.f72138a[gameCategoryVo.ordinal()];
        if (i11 == 1) {
            return LanguageType.En;
        }
        if (i11 == 2) {
            return LanguageType.Jp;
        }
        throw new NoWhenBranchMatchedException();
    }

    @k
    public static final l3.b b(@k j jVar, boolean z11) {
        g0.p(jVar, "<this>");
        return new l3.b(jVar.l(), jVar.p(), h5.k.a(jVar), z11);
    }

    @k
    public static final q c(@k y yVar) {
        g0.p(yVar, "<this>");
        return new q(com.baicizhan.app.biz.game.model.a.c(yVar) ? MemberShipTypeVo.TrialVip : com.baicizhan.app.biz.game.model.a.d(yVar) ? MemberShipTypeVo.Vip : MemberShipTypeVo.Free, yVar.e());
    }
}
