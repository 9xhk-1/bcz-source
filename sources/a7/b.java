package a7;

import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f2032a = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nExamUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExamUtils.kt\ncom/baicizhan/app/biz/lookup/ExamUtils$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1869#2,2:43\n*S KotlinDebug\n*F\n+ 1 ExamUtils.kt\ncom/baicizhan/app/biz/lookup/ExamUtils$Companion\n*L\n9#1:43,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.l
        public final String a(@m80.k List<String> exams) {
            g0.p(exams, "exams");
            if (exams.isEmpty()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (String str : exams) {
                if (sb2.length() == 0) {
                    sb2.append(str);
                } else {
                    sb2.append(" / ");
                    sb2.append(str);
                }
            }
            return sb2.toString();
        }

        public a() {
        }
    }
}
