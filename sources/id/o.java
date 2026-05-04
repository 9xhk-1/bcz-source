package id;

import com.baicizhan.online.course_api.ChoiceBaseItem;
import com.baicizhan.online.course_api.QuestionItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class o {
    @m80.l
    public static final q a(@m80.k QuestionItem questionItem, long j11, int i11) {
        g0.p(questionItem, "<this>");
        List<ChoiceBaseItem> list = questionItem.selects;
        if (list == null) {
            qb.c.d(n.f60512b, "noSelects %s", questionItem.toString());
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            if (list.get(i13).content.length() > 1) {
                qb.c.d(n.f60512b, "option text is too long %s", list.toString());
                return null;
            }
            String content = list.get(i13).content;
            g0.o(content, "content");
            arrayList.add(content);
            if (list.get(i13).correct == 1 && i12 != -1) {
                qb.c.d(n.f60512b, "multi right idx %s", questionItem.toString());
                return null;
            }
            if (list.get(i13).correct == 1) {
                i12 = i13;
            }
        }
        if (i12 == -1) {
            qb.c.d(n.f60512b, "no right idx %s", questionItem.toString());
            return null;
        }
        return new q(questionItem.question_id, new p(arrayList, i12), j11, i11);
    }
}
