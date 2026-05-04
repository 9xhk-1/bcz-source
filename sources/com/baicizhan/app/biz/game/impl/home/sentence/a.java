package com.baicizhan.app.biz.game.impl.home.sentence;

import a00.i0;
import com.baicizhan.app.api.service.model.LanguageTypeVo;
import com.baicizhan.app.api.service.model.SentenceLessonState;
import com.baicizhan.app.api.service.model.SentenceLessonType;
import com.baicizhan.app.biz.game.model.SentenceLanguageType;
import h5.j0;
import h5.k0;
import h5.l0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l3.w;
import l3.x;
import l3.y;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSentenceConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceConvert.kt\ncom/baicizhan/app/biz/game/impl/home/sentence/SentenceConvertKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1563#2:74\n1634#2,3:75\n*S KotlinDebug\n*F\n+ 1 SentenceConvert.kt\ncom/baicizhan/app/biz/game/impl/home/sentence/SentenceConvertKt\n*L\n17#1:74\n17#1:75,3\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.app.biz.game.impl.home.sentence.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0201a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13943a;

        static {
            int[] iArr = new int[SentenceLanguageType.values().length];
            try {
                iArr[SentenceLanguageType.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SentenceLanguageType.Jp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SentenceLanguageType.En.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SentenceLanguageType.Kr.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SentenceLanguageType.Fr.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SentenceLanguageType.Es.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f13943a = iArr;
        }
    }

    @k
    public static final w a(@k j0 j0Var) {
        g0.p(j0Var, "<this>");
        int j11 = j0Var.j();
        LanguageTypeVo e11 = e(j0Var.i());
        List<k0> k11 = j0Var.h().k();
        ArrayList arrayList = new ArrayList(i0.d0(k11, 10));
        for (k0 k0Var : k11) {
            arrayList.add(new x(k0Var.f(), c(k0Var.g()), b(k0Var, j0Var.h().i(), j0Var.g().f())));
        }
        return new w(j11, e11, arrayList, d(j0Var.h()), j0Var.g().h(), j0Var.g().f(), c(j0Var.g().g()), j0Var.h().j(), j0Var.g().h() != j0Var.h().l());
    }

    public static final SentenceLessonState b(k0 k0Var, List<Integer> list, int i11) {
        return list.contains(Integer.valueOf(k0Var.f())) ? SentenceLessonState.Completed : k0Var.f() == i11 ? SentenceLessonState.Current : SentenceLessonState.UnCompleted;
    }

    public static final SentenceLessonType c(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 5 ? SentenceLessonType.Learning : SentenceLessonType.Journal : SentenceLessonType.Review : SentenceLessonType.Learning;
    }

    public static final y d(l0 l0Var) {
        return new y(l0Var.l(), l0Var.n(), l0Var.m());
    }

    @k
    public static final LanguageTypeVo e(@k SentenceLanguageType sentenceLanguageType) {
        g0.p(sentenceLanguageType, "<this>");
        switch (C0201a.f13943a[sentenceLanguageType.ordinal()]) {
            case 1:
                return LanguageTypeVo.Unknown;
            case 2:
                return LanguageTypeVo.Jp;
            case 3:
                return LanguageTypeVo.En;
            case 4:
                return LanguageTypeVo.Kr;
            case 5:
                return LanguageTypeVo.Fr;
            case 6:
                return LanguageTypeVo.Es;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
