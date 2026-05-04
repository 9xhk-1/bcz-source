package h5;

import a00.w1;
import com.baicizhan.app.biz.game.model.FreeStudyMode;
import com.baicizhan.app.biz.game.model.StudyMode;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nFreeStudyMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FreeStudyMode.kt\ncom/baicizhan/app/biz/game/model/FreeStudyModeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n295#2:41\n296#2:43\n1#3:42\n*S KotlinDebug\n*F\n+ 1 FreeStudyMode.kt\ncom/baicizhan/app/biz/game/model/FreeStudyModeKt\n*L\n34#1:41\n34#1:43\n*E\n"})
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Set<StudyMode> f58348a = w1.u(StudyMode.Rhythm, StudyMode.Context);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        r1 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(@m80.k java.util.List<java.lang.Integer> r6, @m80.l com.baicizhan.app.biz.game.model.FreeStudyMode r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        Lb:
            boolean r0 = r6.hasNext()
            r1 = 0
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r6.next()
            r2 = r0
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            m00.a r3 = com.baicizhan.app.biz.game.model.StudyMode.getEntries()
            java.util.Iterator r3 = r3.iterator()
        L25:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.baicizhan.app.biz.game.model.StudyMode r5 = (com.baicizhan.app.biz.game.model.StudyMode) r5
            int r5 = r5.getValue()
            if (r5 != r2) goto L25
            r1 = r4
        L39:
            com.baicizhan.app.biz.game.model.StudyMode r1 = (com.baicizhan.app.biz.game.model.StudyMode) r1
            if (r1 == 0) goto Lb
            boolean r2 = c(r1)
            if (r2 == 0) goto L49
            boolean r1 = d(r7, r1)
            if (r1 == 0) goto Lb
        L49:
            r1 = r0
        L4a:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L53
            int r6 = r1.intValue()
            return r6
        L53:
            com.baicizhan.app.biz.game.model.StudyMode r6 = com.baicizhan.app.biz.game.model.StudyMode.Picture
            int r6 = r6.getValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.h.a(java.util.List, com.baicizhan.app.biz.game.model.FreeStudyMode):int");
    }

    public static /* synthetic */ int b(List list, FreeStudyMode freeStudyMode, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            freeStudyMode = null;
        }
        return a(list, freeStudyMode);
    }

    public static final boolean c(@m80.k StudyMode studyMode) {
        kotlin.jvm.internal.g0.p(studyMode, "<this>");
        return f58348a.contains(studyMode);
    }

    public static final boolean d(@m80.l FreeStudyMode freeStudyMode, @m80.k StudyMode mode) {
        kotlin.jvm.internal.g0.p(mode, "mode");
        return (freeStudyMode != null ? freeStudyMode.getStudyMode() : null) == mode;
    }
}
