package u9;

import com.baicizhan.client.business.managers.experience.StudyBehaviourType;
import com.baicizhan.client.business.managers.experience.TaskAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: u9.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1231a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92016a;

        static {
            int[] iArr = new int[TaskAction.values().length];
            try {
                iArr[TaskAction.SelfTest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaskAction.Listening.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaskAction.WantMoreClick.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaskAction.wordFM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f92016a = iArr;
        }
    }

    @k
    public static final String a(@k TaskAction taskAction) {
        g0.p(taskAction, "<this>");
        int i11 = C1231a.f92016a[taskAction.ordinal()];
        if (i11 == 1) {
            return "wordCheck";
        }
        if (i11 == 2) {
            return "wordListening";
        }
        if (i11 == 3) {
            return "learnMore";
        }
        if (i11 == 4) {
            return "wordFM";
        }
        throw new NoWhenBranchMatchedException();
    }

    @k
    public static final StudyBehaviourType b(int i11) {
        return i11 != 1 ? i11 != 2 ? StudyBehaviourType.Wrong : StudyBehaviourType.Wrong : StudyBehaviourType.Right;
    }
}
